"""Patches `provider/resources.go`'s `moduleMapping` for products `new_resources` found.

Pure text operations on the Go source; no `git`/`gh` calls, so this is covered
by plain, network-free unit tests (see `tests/test_fix.py`). `__main__.py`
wires this to the `--fix` CLI flag: it resolves the products (the part that
needs `git`/`gh`), then hands the results here to decide what is safe to add
and to edit the file.

Only a product that is both new (not already a `moduleMapping` key) and
unambiguous (every resource that named it agreed on exactly one product.yaml)
is added automatically. Anything else -- a resource whose magic-modules PR
touched more than one product.yaml, two resources disagreeing on the product
for the same key, a product already reachable through a shorter existing key,
or a value that collides with an existing one under a different key -- is
left for `scripts/new_resources`'s normal manual flow (see README.md), since
guessing wrong silently misfiles a resource.

Every one of the last 7 brand-new products added by an actual
`terraform-provider-google-beta` upgrade (v7.21.0 through v7.45.0; checked by
scanning the full history of "Upgrade terraform-provider-google-beta" commits
touching `provider/resources.go`) was added as a bare string literal, e.g.
`"design_center": "DesignCenter",`, not a named `gcpXxx` constant -- the
`const` block is for modules more than one key maps to (so the shared name
has one spelling) or that other code in the file refers to directly, neither
of which is true of a product on its first appearance. `apply` matches that,
and so never needs to touch the `const` block at all.
"""

import re
import subprocess

MAP_HEADER_RE = re.compile(r"^var moduleMapping = map\[string\]string\{\s*$")
MAP_ENTRY_RE = re.compile(r'^\t"([a-z0-9_]+)":\s*("[^"]*"|[A-Za-z_][\w.]*),\s*$')
CONST_ENTRY_RE = re.compile(r'^\t(gcp\w+)\s*= "([^"]+)".*$')
COMMENT_RE = re.compile(r"^\s*//")


class NotFound(Exception):
    """The expected `moduleMapping` block was not found."""


def candidates_from_results(results):
    """Reduce `new_resources`' per-resource rows to one candidate per clean product.

    Returns `(candidates, notes)`. `candidates` maps a moduleMapping key (e.g.
    "design_center") to the PascalCase product name (e.g. "DesignCenter") for
    every product every contributing resource agreed on unambiguously. `notes`
    lists human-readable reasons a resource's product was *not* turned into a
    candidate, for the `--fix` summary.
    """
    names_by_key = {}
    notes = []
    for row in results:
        products = [p for p in (row.get("products") or []) if p.get("snake_case") and p.get("name")]
        if not products:
            continue
        if len(products) > 1:
            notes.append(
                f"{row['resource']}: {len(products)} product.yaml files touched "
                f"({', '.join(p['snake_case'] for p in products)}); skipping, ambiguous"
            )
            continue
        key, name = products[0]["snake_case"], products[0]["name"]
        names_by_key.setdefault(key, set()).add(name)

    candidates = {}
    for key, names in names_by_key.items():
        if len(names) > 1:
            notes.append(f"{key!r}: resources disagreed on the product name ({sorted(names)}); skipping")
            continue
        candidates[key] = next(iter(names))
    return candidates, notes


def _find_block(lines, header_re, closer):
    """Return `(start, end)` line indices of the block `header_re` opens.

    `start` is the line after the header; `end` is the index of `closer`.
    Both are exclusive-friendly for `lines[start:end]` slicing.
    """
    for i, line in enumerate(lines):
        if header_re.match(line):
            for j in range(i + 1, len(lines)):
                if lines[j].rstrip("\n") == closer:
                    return i + 1, j
            break
    raise NotFound(f"no block closed by {closer!r} found for {header_re.pattern}")


def _insertion_point(lines, start, end, new_key):
    """Where to insert `new_key` to keep the map's entries sorted.

    Returns a line index in `[start, end]`. Walks back over any comment
    lines directly above the chosen entry so a comment stays with the entry
    it documents.

    `provider/resources.go` has at least one long-standing entry that is not
    in its sorted position (`"integrations"`, planted next to `"bigquery"`
    rather than where it alphabetically belongs); stopping at the first
    entry greater than `new_key` would land a new key right in front of a
    stray like that instead of its real neighbors. Scanning the whole range
    for the *last* entry not greater than `new_key` and inserting right after
    it is immune to that: a stray entry that sorts after `new_key` is simply
    never a candidate to advance past, wherever it sits.
    """
    insert_at = start
    for i in range(start, end):
        m = MAP_ENTRY_RE.match(lines[i])
        if m and m.group(1) <= new_key:
            insert_at = i + 1
    while insert_at > start and COMMENT_RE.match(lines[insert_at - 1]):
        insert_at -= 1
    return insert_at


def parse_existing(go_src):
    """Collect the keys and resolved values already in `moduleMapping`.

    A value is either a bare string literal or a reference to a `const`
    declared elsewhere in the file (e.g. `gcpDesignCenter`); `values` resolves
    either form to the Pascal-case name it ultimately holds, so a new bare
    literal can be checked against both kinds of existing entry alike.
    Raises `NotFound` if the block is missing.
    """
    lines = go_src.splitlines()
    m_start, m_end = _find_block(lines, MAP_HEADER_RE, "}")

    const_values = {}
    for line in lines:
        m = CONST_ENTRY_RE.match(line)
        if m:
            const_values[m.group(1)] = m.group(2)

    keys, values = set(), {}
    for line in lines[m_start:m_end]:
        m = MAP_ENTRY_RE.match(line)
        if not m:
            continue
        key, raw = m.group(1), m.group(2)
        keys.add(key)
        values[key] = raw[1:-1] if raw.startswith('"') else const_values.get(raw, raw)

    return {"lines": lines, "map_block": (m_start, m_end), "keys": keys, "values": values}


def plan(go_src, candidates):
    """Decide which candidates are safe to add to `go_src`.

    Returns `(parsed, additions, notes)`. `additions` is a `key -> name` dict
    of everything that is new, does not collide with an existing value under
    a different key, and is not already covered by a shorter existing key;
    `notes` explains every candidate that was skipped.
    """
    parsed = parse_existing(go_src)
    additions, notes = {}, []
    for key, name in sorted(candidates.items()):
        if key in parsed["keys"]:
            continue  # Already mapped; nothing to do.
        covering = next((k for k in parsed["keys"] if key.startswith(k)), None)
        if covering is not None:
            # `MappedModules` matches the longest prefix of `mods` that the
            # resource name starts with, so an existing shorter key already
            # resolves this product -- there is no tfgen failure to fix here.
            # Adding the longer, more specific key anyway would be a reorg
            # (it would move every already-shipped resource that matched
            # `covering` and also starts with `key` into a new module),
            # which changes their Pulumi token and is never safe to do
            # silently, so this is left for a human even though it is
            # "new" by the plain membership test above.
            notes.append(f"{key!r}: already resolves via the existing, shorter {covering!r}; skipping")
            continue
        colliding = next((k for k, v in parsed["values"].items() if v == name), None)
        if colliding is not None:
            notes.append(f"{key!r}: {name!r} is already the value of {colliding!r}; skipping")
            continue
        additions[key] = name
    return parsed, additions, notes


def apply(parsed, additions):
    """Return `go_src` with `additions` inserted into the map, unformatted.

    Callers should gofmt the result; this only inserts syntactically valid,
    minimally-spaced lines at the right sorted position.
    """
    lines = list(parsed["lines"])
    m_start, m_end = parsed["map_block"]
    for key, name in sorted(additions.items(), reverse=True):
        at = _insertion_point(lines, m_start, m_end, key)
        lines.insert(at, f'\t"{key}": "{name}",')
        m_end += 1
    return "\n".join(lines) + "\n"


def gofmt(path):
    """Best-effort `gofmt -w`; callers decide whether a failure is fatal.

    Returns True on success. A missing `gofmt` binary is not treated as an
    error here -- the Makefile integration always has one on PATH (it is
    already required to build the codegen binary), but unit tests that only
    check the pre-gofmt text should not need it installed.
    """
    try:
        subprocess.run(["gofmt", "-w", path], capture_output=True, text=True, check=True)
        return True
    except FileNotFoundError:
        return False
    except subprocess.CalledProcessError as exc:
        raise RuntimeError(f"gofmt -w {path} failed: {exc.stderr}") from exc
