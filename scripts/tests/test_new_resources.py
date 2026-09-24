"""Golden tests for `new_resources`.

Each scenario replays a recorded set of git and gh calls and compares both
output modes against checked-in goldens, so a change in parsing, in the
product.yaml lookup, or in the rendering shows up as a diff.

Re-record every scenario against the live repos with:

    python3 -m tests.test_new_resources --update

Recording needs an `upstream` checkout that has the scenario tags, plus an
authenticated `gh`. Replaying needs neither.
"""

import contextlib
import io
import json
import os
import sys
import tempfile
import unittest
from unittest import mock

from new_resources import __main__ as main

from .cassette import REPO_PLACEHOLDER, Cassette

HERE = os.path.dirname(os.path.abspath(__file__))
TESTDATA = os.path.join(HERE, "testdata")
# Two adjacent releases, nine new resources between them. Each release happens
# to cover both product lookup paths: one PR introduces a whole new product and
# so touches its product.yaml directly, while the rest add a resource to an
# existing product and are only resolved by the fallback in `products`.
SCENARIOS = {
    "v7.42.0": ["v7.42.0"],
    "v7.43.0": ["v7.43.0"],
}


@contextlib.contextmanager
def fake_repo():
    """A repo whose `upstream` looks checked out, so the git path is exercised."""
    with tempfile.TemporaryDirectory() as tmp:
        os.makedirs(os.path.join(tmp, "upstream"))
        open(os.path.join(tmp, "upstream", ".git"), "w").close()
        yield tmp


def invoke(args, run, repo):
    """Run the CLI against `repo` with `run` patched in, returning its stdout."""
    buf = io.StringIO()
    with mock.patch.object(main, "run", run), mock.patch.object(main, "default_repo", lambda: repo):
        with contextlib.redirect_stdout(buf), mock.patch.object(sys, "argv", ["new_resources", *args]):
            main.main()
    return buf.getvalue()


def golden(scenario, name):
    return os.path.join(TESTDATA, scenario, name)


class GoldenTest(unittest.TestCase):
    def test_scenarios(self):
        for scenario, args in SCENARIOS.items():
            with self.subTest(scenario=scenario):
                cassette = Cassette.load(golden(scenario, "cassette.json"))
                with fake_repo() as repo:
                    run = cassette.player(repo)
                    for name, extra in (("expected.txt", []), ("expected.json", ["--json"])):
                        with open(golden(scenario, name)) as fh:
                            want = fh.read()
                        got = invoke([*args, *extra], run, repo)
                        self.assertEqual(want, got, f"{scenario}/{name} is stale")


class ResolveRefTest(unittest.TestCase):
    def test_tag_lookup_survives_a_sha_the_clone_does_not_have(self):
        """A ref resolved over the API need not exist in the local clone.

        Every local git call has to tolerate that, or resolving a ref the
        checkout has not fetched dies in `git tag --points-at`.
        """
        sha = "a" * 40
        upstream = f"{REPO_PLACEHOLDER}/upstream"
        cassette = Cassette(
            "<synthetic>",
            [
                {
                    "argv": ["git", "-C", upstream, "rev-parse", "--verify", "v9.99.0^{commit}"],
                    "error": "unknown revision",
                },
                {
                    "argv": [
                        "gh",
                        "api",
                        f"repos/{main.TPG_REPO}/commits/v9.99.0",
                        "--jq",
                        "{sha}",
                    ],
                    "stdout": json.dumps({"sha": sha}),
                },
                {
                    "argv": ["git", "-C", upstream, "tag", "--points-at", sha],
                    "error": "malformed object name",
                },
                {
                    "argv": [
                        "gh",
                        "api",
                        f"repos/{main.TPG_REPO}/git/ref/tags/v9.99.0",
                        "--jq",
                        "{ref}",
                    ],
                    "stdout": json.dumps({"ref": "refs/tags/v9.99.0"}),
                },
            ],
        )
        with fake_repo() as repo:
            with mock.patch.object(main, "run", cassette.player(repo)):
                self.assertEqual((sha, "v9.99.0"), main.resolve_ref(repo, "v9.99.0"))


class SnakeCaseTest(unittest.TestCase):
    CASES = [
        ("AgenticApplications", "agentic_applications"),
        ("Firestore", "firestore"),
        ("VertexAI", "vertex_ai"),
        ("VPCAccess", "vpc_access"),
        ("OracleDatabase", "oracle_database"),
        ("BigQuery", "big_query"),
        ("ApiHub", "api_hub"),
        ("Compute", "compute"),
    ]

    def test_snake_case(self):
        for name, want in self.CASES:
            with self.subTest(name=name):
                self.assertEqual(want, main.snake_case(name))


def update():
    """Re-record every scenario and rewrite its goldens."""
    repo = main.default_repo()
    if not main.upstream_dir(repo):
        sys.exit(f"recording needs an `upstream` checkout; {repo} has none")
    for scenario, args in SCENARIOS.items():
        cassette = Cassette(golden(scenario, "cassette.json"))
        run = cassette.recorder(main.run, repo)
        for name, extra in (("expected.txt", []), ("expected.json", ["--json"])):
            out = invoke([*args, *extra], run, repo)
            os.makedirs(os.path.join(TESTDATA, scenario), exist_ok=True)
            with open(golden(scenario, name), "w") as fh:
                fh.write(out)
        cassette.save()
        print(f"recorded {scenario}: {len(cassette.calls)} calls")


if __name__ == "__main__":
    if "--update" in sys.argv:
        sys.argv.remove("--update")
        update()
    unittest.main()
