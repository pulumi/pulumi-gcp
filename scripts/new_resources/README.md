# new_resources

Answers "which magic-modules products do the new resources in this upstream
release come from?", printing each product's `name:` in the snake_case form the
provider's mapping code expects.

## Usage

`gh` and `python` both come from the repo's mise toolchain, so the usual
`mise trust && mise install` at the repo root is enough. Run from this
directory:

```sh
eval "$(mise env)"   # non-interactive shells do not get mise's shell hook

python3 -m new_resources                  # the checked-in `upstream` submodule ref
python3 -m new_resources v7.44.0          # any tag, branch or sha
python3 -m new_resources v7.44.0 --json   # machine-readable
```

### `--fix`: add the missing mappings instead of printing them

```sh
python3 -m new_resources --fix                        # ref: the `upstream` submodule; file: provider/resources.go
python3 -m new_resources v7.44.0 --fix path/to/resources.go
```

A relative `--fix` path (including the `provider/resources.go` default) is
resolved against the repo root regardless of the current directory, the same
as the `ref` default; pass an absolute path to target a file elsewhere.

Resolves the same way, then edits `moduleMapping` for every product that is
both new and unambiguous, adding each as a bare string literal (e.g.
`"design_center": "DesignCenter",`), runs `gofmt -w` on the result, and prints
what it added. That matches the last 7 times a brand-new product was added by
an actual upstream bump (`v7.21.0` through `v7.45.0`; checked against the full
history of `provider/resources.go`) -- a named `gcpXxx` constant is for a
module more than one key maps to, or one other code in the file refers to
directly, neither of which is true of a product on its first appearance.
"Unambiguous" excludes:

- A resource whose magic-modules PR touched more than one `product.yaml`
  (the existing-module fallback in [How it works](#how-it-works) can do
  this) -- which product is *the* module for that resource is a guess either
  way.
- A product already reachable through a shorter existing key, e.g. a new
  `vertex_ai` product when `vertex` is already a key: `MappedModules` matches
  the longest prefix, so `vertex` already resolves it today (`make tfgen`
  does not fail for it) and adding the longer key would be a reorg --
  every other already-shipped `vertex`-prefixed resource whose name also
  starts with `vertex_ai` would move to a new module, changing its token.
- A value that collides with one already in the file under a different key.

Exits non-zero, without writing the file, if nothing it found was safe to add
this way -- including "no new products at all", which is the common case.
Anything excluded is still printed (to stderr) with why, so a human has a
head start on resolving it by hand per the normal flow below.

`provider/resources.go`'s `.mk/tfgen-repair.mk` runs this (against whatever
`upstream` ref `make` just checked out, so no ref argument is needed there)
when `make tfgen` fails on a missing mapping, and retries once before giving
up -- see that file for the Makefile side.

The `upstream` submodule of the enclosing checkout supplies the tags and the
CHANGELOG, so the tool works from anywhere in the repo. Run it from outside a
checkout and everything resolves over the API instead, in which case a ref is
required.

Sample output:

```
v7.45.0 (3dc173a397749158369ea839a2890d89f8c9c370)
  https://github.com/hashicorp/terraform-provider-google-beta/releases/tag/v7.45.0
  CHANGELOG section: 7.45.0 (Unreleased)

* New Resource: google_agentic_applications_analyst_agent_persona
    tfp PR: https://github.com/hashicorp/terraform-provider-google-beta/pull/12895
    mm  PR: https://github.com/GoogleCloudPlatform/magic-modules/pull/18579
    product: mmv1/products/agenticapplications/product.yaml
      name: agentic_applications -> AgenticApplications
```

## How it works

Each step is derived from the previous one, so nothing is hardcoded per
release:

1. Resolve the ref to a commit and a release tag, preferring the local
   `upstream` clone and falling back to the GitHub API.
2. Read `CHANGELOG.md` at that commit and take the release's `FEATURES` list.
3. Each `**New Resource:**` entry links the terraform-provider-google-beta PR
   that added it.
4. That PR's body ends with `Derived from <magic-modules PR>`.
5. Resolve the products that PR touched and read `name:` out of each
   `product.yaml` at the PR's merge commit.

Two wrinkles worth knowing:

- A resource added to an **existing** product does not touch that product's
  `product.yaml`, so when the PR contains none the product directories under
  `mmv1/products/` that it did touch are used instead. Without that fallback
  only brand-new products resolve.
- An untagged ref has no version to key the CHANGELOG section on, so the
  topmost section is used. Mid-cycle that section is empty, because upstream
  assembles it from `.changelog/` entries at release time. The header prints
  which section was read so an empty result is distinguishable from a parse
  failure.

## Tests

Golden tests replay recorded `git` and `gh` calls, so they need no network and
no `upstream` checkout:

```sh
python3 -m unittest discover -s tests -t .
```

Re-record against the live repos after changing what the tool fetches or how it
renders. This one does need an `upstream` checkout carrying the scenario tags,
plus an authenticated `gh`:

```sh
python3 -m tests.test_new_resources --update
```

Recordings key on the argv of every external call, with the repo path replaced
by a placeholder. `CHANGELOG.md` responses are stored truncated to the release
section under test, since the parser never reads past the following heading and
the whole file is half a megabyte.
