#!/usr/bin/env bash
# Copyright 2016-2026, Pulumi Corporation. All rights reserved.
set -euo pipefail

cd "$(dirname "$0")/.."
unset GOROOT
tools_dir="$(pwd)/.localcloud-tools"
# Keep dependency/compiler caches outside the reviewed application diff.
if ! grep -qxF "/.localcloud-tools/" .git/info/exclude; then
    printf "\n/.localcloud-tools/\n" >>.git/info/exclude
fi
mkdir -p "$tools_dir/go-mod" "$tools_dir/go-build"
# Optional cache warming only; go mod download still resolves the locked set in
# a fresh checkout. Clone macOS caches so sandboxed builds can write locally.
if [[ "$(uname -s)" == Darwin && ! -f "$tools_dir/cache-copied" ]]; then
    default_mod_cache="$(go env GOMODCACHE)"
    default_build_cache="$(go env GOCACHE)"
    if [[ -d "$default_mod_cache" ]]; then
        cp -cR "$default_mod_cache/." "$tools_dir/go-mod/"
    fi
    if [[ -d "$default_build_cache" ]]; then
        cp -cR "$default_build_cache/." "$tools_dir/go-build/"
    fi
    touch "$tools_dir/cache-copied"
fi
source scripts/localcloud-go.sh
go version
if [[ ! -e upstream/.git ]]; then
    git submodule update --init --filter=blob:none -- upstream
fi
expected_upstream="$(git ls-tree HEAD upstream | awk '{print $3}')"
test "$(git -C upstream rev-parse HEAD)" = "$expected_upstream"
test -f upstream/google-beta/provider/provider.go
# A fresh clone has the gitlink but none of the repository's baseline patches.
# Apply only those patches, preserving an already prepared dependency.
for patch in patches/*.patch; do
    if ! git -C upstream apply --reverse --check "../$patch" 2>/dev/null; then
        git -C upstream apply --check "../$patch"
        git -C upstream apply "../$patch"
    fi
done
(
    cd provider
    go mod download
    go list -m google.golang.org/api github.com/hashicorp/terraform-provider-google-beta
)
make schema_embed
if ! make provider_no_deps >"$tools_dir/provider-build.log" 2>&1; then
    tail -n 40 "$tools_dir/provider-build.log"
    exit 1
fi

mkdir -p "$tools_dir"
case "$(uname -s)" in
    Darwin) lint_os=darwin ;;
    Linux) lint_os=linux ;;
    *) exit 1 ;;
esac
case "$(uname -m)" in
    arm64|aarch64) lint_arch=arm64 ;;
    x86_64) lint_arch=amd64 ;;
    *) exit 1 ;;
esac
lint_archive="golangci-lint-2.9.0-$lint_os-$lint_arch"
if ! test -f "$tools_dir/$lint_archive/golangci-lint"; then
    curl --fail --location --silent --show-error \
        "https://github.com/golangci/golangci-lint/releases/download/v2.9.0/$lint_archive.tar.gz" \
        -o "$tools_dir/lint.tar.gz"
    tar -xzf "$tools_dir/lint.tar.gz" -C "$tools_dir"
fi
lint_bin="$tools_dir/$lint_archive/golangci-lint"
"$lint_bin" version
(
    cd provider
    "$lint_bin" run --path-prefix provider -c ../.golangci.yml
    "$lint_bin" run --build-tags localcloud --path-prefix provider -c ../.golangci.yml
)
"$lint_bin" fmt --diff -c .golangci.yml provider >"$tools_dir/format.diff"
if [[ -s "$tools_dir/format.diff" ]]; then
    cat "$tools_dir/format.diff"
    exit 1
fi
bash -n scripts/localcloud-build.sh scripts/localcloud-go.sh scripts/localcloud-test.sh
git diff --check
