// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"encoding/json"
	ptest "github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-gcp/provider/v6/pkg/version"
	"os"
	"sort"
	"strings"
)

func TestProviderUpgrade(t *testing.T) {
	baseline := "6.67.0"

	type testCase struct {
		program string
	}

	testCases := []testCase{
		// handcrafted
		{"dns-recordset"},
		{"pubsub-subscription"},
		{"pubsub-topic"},
		{"serviceaccount-account"},
		{"storage-bucket"},
		{"storage-bucketobject"},
		{"secretmanager-secret"},
		{"sql-user"},

		// extracted from schema examples and manually corrected
		{"bigquery-table"},
		{"compute-firewall"},
		{"cloudfunctions-function"},

		// extracted as-is from schema examples
		{"monitoring-alertpolicy-1"},
		{"bigquery-datasetaccess-3"},
		{"bigquery-routine-1"},
		{"bigquery-routine-2"},
		{"cloudrunv2-job-6"},
		{"cloudrunv2-service-4"},
		{"cloudrunv2-service-5"},
		{"cloudrunv2-service-7"},
		{"compute-disk-1"},
		{"compute-disk-3"},
	}

	for _, tc := range testCases {
		tc := tc
		t.Run(tc.program, func(t *testing.T) {
			ptest.VerifyUpgrade(t, filepath.Join("test-programs", tc.program),
				ptest.WithProviderName("gcp"),
				ptest.WithBaselineVersion(baseline),
				ptest.WithResourceProviderServer(providerServer(t)),
				ptest.WithConfig("gcp:project", "pulumi-development"))
		})
	}

	t.Run("coverage", func(t *testing.T) {
		// This assumes passing/unskipped tests.

		covered := map[string]struct{}{}

		for _, tc := range testCases {
			tc := tc
			s := filepath.Join("testdata", "recorded", "TestProviderUpgrade",
				tc.program, baseline, "state.json")

			type stack struct {
				Deployment struct {
					Resources []struct {
						Type string `json:"type"`
					} `json:"resources"`
				} `json:"deployment"`
			}

			b, err := os.ReadFile(s)
			require.NoError(t, err)

			var st stack
			require.NoError(t, json.Unmarshal(b, &st))

			for _, r := range st.Deployment.Resources {
				if strings.Contains(r.Type, "providers") {
					continue
				}
				if strings.Contains(r.Type, "Stack") {
					continue
				}
				covered[r.Type] = struct{}{}
			}
		}

		t.Logf("Resources covered: %d", len(covered))

		sorted := []string{}
		for k := range covered {
			sorted = append(sorted, k)
		}
		sort.Strings(sorted)
		for _, s := range sorted {
			t.Logf("- %s", s)
		}
	})
}

func providerServer(t *testing.T) pulumirpc.ResourceProviderServer {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()
	p, err := pfbridge.MakeMuxedServer(ctx, info.Name, info,
		/*
		 * We leave the schema blank. This will result in incorrect calls to
		 * GetSchema, but otherwise does not effect the provider. It reduces the
		 * time to test start by minutes.
		 */
		[]byte("{}"),
	)(nil)
	require.NoError(t, err)
	return p
}
