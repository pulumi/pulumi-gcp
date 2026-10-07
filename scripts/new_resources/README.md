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
