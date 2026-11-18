"""Resolve the magic-modules product name for each new resource in an upstream release.

Chain walked, starting from an upstream ref (a tag, branch or sha, defaulting
to the `upstream` submodule ref of a pulumi bridged provider repo):

    upstream sha -> release tag -> CHANGELOG.md FEATURES section
                 -> terraform-provider-google-beta PR
                 -> magic-modules PR -> product.yaml -> `name:` in snake_case

Requires `git` and an authenticated `gh` on PATH.
"""

import argparse
import base64
import json
import os
import re
import subprocess
import sys

from . import fix

TPG_REPO = "hashicorp/terraform-provider-google-beta"
MM_REPO = "GoogleCloudPlatform/magic-modules"

# `* **New Resource:** `google_x` ([#123](https://.../pull/123))`
FEATURE_RE = re.compile(
    r"^\*\s+\*\*New (?P<kind>[^:*]+):\*\*\s+`(?P<name>[^`]+)`.*\[#(?P<pr>\d+)\]",
)
MM_PR_RE = re.compile(rf"{re.escape(MM_REPO)}/pull/(\d+)")
PRODUCT_NAME_RE = re.compile(r"^name:\s*['\"]?([^'\"\s]+)", re.MULTILINE)


def run(*args):
    proc = subprocess.run(args, capture_output=True, text=True)
    if proc.returncode != 0:
        raise RuntimeError(f"{' '.join(args)} failed: {proc.stderr.strip()}")
    return proc.stdout.strip()


def gh_json(path, jq="."):
    """One `gh api` call, projected through jq to keep responses small."""
    return json.loads(run("gh", "api", path, "--jq", jq))


def gh_lines(path, jq):
    """A paginated `gh api` call projecting each page to one raw value per line.

    `--slurp` cannot be combined with `--jq`, and a bare `--paginate` returns
    concatenated JSON arrays that no JSON parser accepts, so line-oriented
    output is the only projection that survives pagination.
    """
    out = run("gh", "api", path, "--paginate", "--jq", jq)
    return out.splitlines() if out else []


def snake_case(name):
    """AgenticApplications -> agentic_applications, VPCAccess -> vpc_access."""
    name = re.sub(r"(.)([A-Z][a-z]+)", r"\1_\2", name)
    name = re.sub(r"([a-z0-9])([A-Z])", r"\1_\2", name)
    return name.lower()


def default_repo():
    """The provider repo we are running inside, whose `upstream` we walk."""
    try:
        return run("git", "rev-parse", "--show-toplevel")
    except RuntimeError:
        return "."


def upstream_dir(repo):
    """The repo's `upstream` submodule checkout, or None if it isn't there."""
    upstream = os.path.join(repo, "upstream")
    return upstream if os.path.exists(os.path.join(upstream, ".git")) else None


def resolve_ref(repo, ref):
    """Return (sha, tag) for `ref`, defaulting to the `upstream` submodule ref.

    `ref` may be anything the upstream repo understands: a tag, a branch, or a
    (possibly abbreviated) sha. It is resolved against the local submodule
    clone when there is one, and against GitHub otherwise.
    """
    upstream = upstream_dir(repo)
    if upstream is None and ref is None:
        sys.exit(f"no `upstream` submodule checkout under {repo}; pass a ref explicitly")

    sha = None
    if upstream:
        try:
            sha = run("git", "-C", upstream, "rev-parse", "--verify", f"{ref or 'HEAD'}^{{commit}}")
        except RuntimeError:
            pass  # Not fetched locally; fall through to GitHub.
    if sha is None:
        sha = gh_json(f"repos/{TPG_REPO}/commits/{ref}", "{sha}")["sha"]

    tags = []
    if upstream:
        try:
            tags = run("git", "-C", upstream, "tag", "--points-at", sha).split()
        except RuntimeError:
            pass  # `sha` came from GitHub and isn't fetched locally.
    if not tags and ref:
        # Cheap case: the ref the caller gave us is itself a tag.
        try:
            gh_json(f"repos/{TPG_REPO}/git/ref/tags/{ref}", "{ref}")
            tags = [ref]
        except RuntimeError:
            pass
    if not tags:
        # Last resort: scan every tag. Paginates over the repo's full tag list.
        tags = [
            line.split()[0]
            for line in gh_lines(f"repos/{TPG_REPO}/tags", '.[] | .name + " " + .commit.sha')
            if line.split()[1] == sha
        ]
    return sha, (tags[0] if tags else None)


def changelog(repo, sha):
    """CHANGELOG.md as of `sha`, read from the local clone when it has that commit."""
    upstream = upstream_dir(repo)
    if upstream:
        try:
            return run("git", "-C", upstream, "show", f"{sha}:CHANGELOG.md")
        except RuntimeError:
            pass
    blob = gh_json(f"repos/{TPG_REPO}/contents/CHANGELOG.md?ref={sha}", "{content}")
    return base64.b64decode(blob["content"]).decode()


def section_title(text, version=None):
    """The `## ...` heading of the release section `features` will read."""
    for line in text.splitlines():
        if line.startswith("## ") and (version is None or line.split()[1] == version):
            return line[3:].strip()
    return None


def features(text, version=None):
    """Yield (kind, resource, pr) from the FEATURES list of one release section.

    Without a version, the topmost section wins, which is what an untagged ref
    part-way through a release cycle wants.
    """
    in_release = in_features = False
    for line in text.splitlines():
        if line.startswith("## "):
            if in_release:
                return
            in_release = version is None or line.split()[1] == version
            continue
        if not in_release:
            continue
        if line.rstrip().endswith(":") and not line.startswith("*"):
            in_features = line.startswith("FEATURES")
            continue
        if in_features:
            m = FEATURE_RE.match(line)
            if m:
                yield m.group("kind"), m.group("name"), int(m.group("pr"))


def magic_modules_pr(tpg_pr):
    body = gh_json(f"repos/{TPG_REPO}/pulls/{tpg_pr}", "{body}").get("body") or ""
    m = MM_PR_RE.search(body)
    return int(m.group(1)) if m else None


def products(mm_pr):
    """Yield (path, name) for every product.yaml touched by a magic-modules PR."""
    pr = gh_json(f"repos/{MM_REPO}/pulls/{mm_pr}", "{merge: .merge_commit_sha, head: .head.sha}")
    # The merge commit lives in the upstream repo; the head branch may be a
    # deleted fork, so prefer the merge commit and fall back to the head sha.
    ref = pr["merge"] or pr["head"]
    changed = gh_lines(f"repos/{MM_REPO}/pulls/{mm_pr}/files", ".[].filename")
    paths = [p for p in changed if os.path.basename(p) == "product.yaml"]
    if not paths:
        # A resource added to an existing product leaves its product.yaml
        # untouched, so fall back to the products the PR did touch.
        paths = sorted(
            {
                "/".join(p.split("/")[:3]) + "/product.yaml"
                for p in changed
                if p.startswith("mmv1/products/")
            }
        )
    for path in paths:
        blob = gh_json(f"repos/{MM_REPO}/contents/{path}?ref={ref}", "{content}")
        content = base64.b64decode(blob["content"]).decode()
        m = PRODUCT_NAME_RE.search(content)
        yield path, (m.group(1) if m else None)


def collect_results(repo, ref, kind):
    """Resolve `ref` and return `(sha, tag, section, results)` for `kind`.

    Shared by the normal print path and `--fix`, which always passes `"all"`
    since a missing mapping can surface from a resource or a data source (or
    both, as the same upstream name) alike.
    """
    sha, tag = resolve_ref(repo, ref)
    version = tag.lstrip("v") if tag else None
    text = changelog(repo, sha)
    section = section_title(text, version)
    entries = list(features(text, version))
    if kind != "all":
        entries = [e for e in entries if e[0] == kind]

    results = []
    for entry_kind, resource, tpg_pr in entries:
        row = {
            "kind": entry_kind,
            "resource": resource,
            "tpg_pr": f"https://github.com/{TPG_REPO}/pull/{tpg_pr}",
            "products": [],
        }
        mm_pr = magic_modules_pr(tpg_pr)
        if mm_pr:
            row["mm_pr"] = f"https://github.com/{MM_REPO}/pull/{mm_pr}"
            for path, name in products(mm_pr):
                row["products"].append(
                    {
                        "path": path,
                        "name": name,
                        "snake_case": snake_case(name) if name else None,
                    }
                )
        results.append(row)
    return sha, tag, section, results


def run_fix(repo, relpath, results):
    """Implements `--fix`. Returns the process exit code.

    Writes `relpath` (resolved against `repo` if not already absolute) only
    when there was at least one unambiguous addition; see `fix.plan` for what
    "unambiguous" excludes. Every exclusion and every addition is reported on
    stderr/stdout respectively, for the Makefile's retry log and for a human
    re-running this by hand to see why nothing changed.
    """
    path = relpath if os.path.isabs(relpath) else os.path.join(repo, relpath)
    candidates, notes = fix.candidates_from_results(results)
    try:
        with open(path) as fh:
            go_src = fh.read()
        parsed, additions, plan_notes = fix.plan(go_src, candidates)
    except (OSError, fix.NotFound) as exc:
        print(f"--fix: {exc}", file=sys.stderr)
        return 1
    notes += plan_notes

    for note in notes:
        print(f"--fix: {note}", file=sys.stderr)

    if not additions:
        print(
            "--fix: nothing unambiguous to add; see scripts/new_resources/README.md",
            file=sys.stderr,
        )
        return 1

    new_src = fix.apply(parsed, additions)
    with open(path, "w") as fh:
        fh.write(new_src)
    if not fix.gofmt(path):
        print(f"--fix: gofmt not on PATH; wrote unformatted Go to {relpath}", file=sys.stderr)

    for key, name in sorted(additions.items()):
        print(f'--fix: added "{key}": "{name}" to {relpath}')
    return 0


def main():
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument(
        "ref",
        nargs="?",
        help="upstream tag, branch or sha to walk (default: the `upstream` submodule ref)",
    )
    ap.add_argument(
        "--kind",
        default="Resource",
        help="CHANGELOG feature kind to walk, e.g. Resource, Data Source, "
        "List Resource, or `all` (default: Resource). Ignored by --fix, which "
        "always walks every kind.",
    )
    ap.add_argument("--json", action="store_true", help="emit JSON instead of text")
    ap.add_argument(
        "--fix",
        nargs="?",
        const="provider/resources.go",
        default=None,
        metavar="FILE",
        help="instead of printing, add every unambiguous new product's moduleMapping "
        "entry to FILE (default: provider/resources.go, resolved against the repo "
        "root regardless of the current directory, same as a relative FILE) and "
        "gofmt it. Exits non-zero, without writing FILE, if there was nothing "
        "unambiguous to add.",
    )
    args = ap.parse_args()

    repo = default_repo()
    kind = "all" if args.fix is not None else args.kind
    sha, tag, section, results = collect_results(repo, args.ref, kind)

    if args.fix is not None:
        sys.exit(run_fix(repo, args.fix, results))

    if args.json:
        print(
            json.dumps(
                {"sha": sha, "tag": tag, "section": section, "features": results}, indent=2
            )
        )
        return

    print(f"{tag or '(untagged)'} ({sha})")
    print(
        f"  https://github.com/{TPG_REPO}/releases/tag/{tag}"
        if tag
        else f"  https://github.com/{TPG_REPO}/commit/{sha}"
    )
    print(f"  CHANGELOG section: {section or '(none found)'}")
    for row in results:
        print(f"\n* New {row['kind']}: {row['resource']}")
        print(f"    tfp PR: {row['tpg_pr']}")
        print(f"    mm  PR: {row.get('mm_pr', '(not referenced in the PR body)')}")
        for p in row["products"]:
            print(f"    product: {p['path']}")
            print(f"      name: {p['snake_case']} -> {p['name']}")
        if row.get("mm_pr") and not row["products"]:
            print("    product: (no product.yaml touched by that PR)")
    if not results:
        kind = "" if args.kind == "all" else f"`New {args.kind}` "
        print(f"\n(no {kind}entries in the FEATURES list of {section or 'that ref'})")


if __name__ == "__main__":
    main()
