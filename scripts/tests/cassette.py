"""Record and replay the subprocess calls `new_resources` makes.

Every external call in the tool funnels through `main.run`, so wrapping that
one function captures a whole scenario. Keys are the argv with the provider
repo path swapped for a placeholder, which is what lets a recording replay on a
machine that has no `upstream` checkout at all.

CHANGELOG reads are stored truncated to the release section under test plus the
heading that follows it. The parser stops at the next `## ` heading, so the
truncated text drives it identically, and the untruncated file is half a
megabyte per scenario.
"""

import json
import os

REPO_PLACEHOLDER = "<REPO>"


def _key(argv, repo):
    return [a.replace(repo, REPO_PLACEHOLDER) for a in argv]


def _is_changelog_read(argv):
    return argv[0] == "git" and argv[-1].endswith(":CHANGELOG.md")


def _trim_changelog(text):
    """Keep the first release section and the heading that closes it."""
    lines = text.splitlines(keepends=True)
    seen = 0
    for i, line in enumerate(lines):
        if line.startswith("## "):
            seen += 1
            if seen == 2:
                return "".join(lines[: i + 1])
    return text


class Cassette:
    def __init__(self, path, calls=None):
        self.path = path
        self.calls = calls or []

    @classmethod
    def load(cls, path):
        with open(path) as fh:
            return cls(path, json.load(fh)["calls"])

    def save(self):
        os.makedirs(os.path.dirname(self.path), exist_ok=True)
        with open(self.path, "w") as fh:
            json.dump({"calls": self.calls}, fh, indent=2)
            fh.write("\n")

    def _find(self, key):
        for call in self.calls:
            if call["argv"] == key:
                return call
        return None

    def recorder(self, real_run, repo):
        """A `run` that delegates to the real one and remembers what it saw."""

        def run(*argv):
            key = _key(list(argv), repo)
            try:
                out = real_run(*argv)
            except RuntimeError as exc:
                if not self._find(key):
                    self.calls.append({"argv": key, "error": str(exc)})
                raise
            if _is_changelog_read(list(argv)):
                out = _trim_changelog(out)
            if not self._find(key):
                self.calls.append({"argv": key, "stdout": out})
            return out

        return run

    def player(self, repo):
        """A `run` that answers only from the recording."""

        def run(*argv):
            key = _key(list(argv), repo)
            call = self._find(key)
            if call is None:
                raise AssertionError(
                    f"no recorded call for {key} in {self.path}; re-record with --update"
                )
            if "error" in call:
                raise RuntimeError(call["error"])
            return call["stdout"]

        return run
