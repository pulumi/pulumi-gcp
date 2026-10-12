#!/usr/bin/env bash
# Copyright 2016-2026, Pulumi Corporation. All rights reserved.
set -euo pipefail

cd "$(dirname "${BASH_SOURCE[0]}")/.."
unset GOROOT
export GOTOOLCHAIN=go1.26.6
tools_dir="$(pwd)/.localcloud-tools"
export GOMODCACHE="$tools_dir/go-mod"
export GOCACHE="$tools_dir/go-build"
export GOLANGCI_LINT_CACHE="$tools_dir/lint-cache"

# Older Go installations ignore GOTOOLCHAIN. Select an executable that actually
# runs the module's pinned toolchain, including a previously downloaded one.
go_selected=false
for go_executable in "$GOMODCACHE"/golang.org/toolchain@v0.0.1-go1.26.6.*/bin/go $(type -a -p go); do
    if [[ -x "$go_executable" ]] && \
        [[ "$("$go_executable" version 2>/dev/null)" == "go version go1.26.6 "* ]]; then
        export PATH="$(dirname "$go_executable"):$PATH"
        go_selected=true
        break
    fi
done
if [[ "$go_selected" != true ]]; then
    echo 'A Go installation capable of running GOTOOLCHAIN=go1.26.6 is required.' >&2
    exit 1
fi

if [[ "${BASH_SOURCE[0]}" == "$0" ]]; then
    case "${1:?Select collect or regression}" in
        collect)
            cd provider
            go test -list . -short .
            ;;
        regression)
            : "${GOOGLE_CLOUD_PROJECT:?Select the backend-owned LocalCloud run project}"
            # CI has a project but no host ADC file. Preserve that credential
            # boundary for negative authentication tests without changing HOME
            # or the existing tests, and prevent access to external services.
            export GOOGLE_PROJECT="$GOOGLE_CLOUD_PROJECT"
            mkdir -p "$tools_dir/regression-go-build"
            [[ "$#" == 1 ]]
            exec docker run --rm --network none --user "$(id -u):$(id -g)" \
                --mount "type=bind,source=$(pwd),target=/workspace" \
                --workdir /workspace \
                --env GOOGLE_CLOUD_PROJECT --env GOOGLE_PROJECT \
                --env GOTOOLCHAIN=go1.26.6 \
                --env GOMODCACHE=/workspace/.localcloud-tools/go-mod \
                --env GOCACHE=/workspace/.localcloud-tools/regression-go-build \
                golang:1.26.6 make test_provider
            ;;
        *) exit 1 ;;
    esac
fi
