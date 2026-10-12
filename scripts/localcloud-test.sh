#!/usr/bin/env bash
# Copyright 2016-2026, Pulumi Corporation. All rights reserved.
set -euo pipefail

cd "$(dirname "$0")/.."
: "${GOOGLE_CLOUD_PROJECT:?Select the backend-owned LocalCloud run project}"
: "${LOCALCLOUD_GATEWAY_URL:?Supply the running LocalCloud gateway origin}"
source scripts/localcloud-go.sh
cd provider
go test -tags=localcloud -run '^TestLocalCloud(GCS|PubSub|BigQuery|SecretManager)$' -count=1 -v -timeout=10m . | \
    awk '/^=== RUN   TestLocalCloud/ {executed++}
         /^--- PASS: TestLocalCloud/ {passed++}
         {print}
         END {printf "LocalCloud tests: executed=%d passed=%d\n", executed, passed}'
