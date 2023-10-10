// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	ptest "github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-gcp/provider/v6/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
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

	cov := &ptest.UpgradeCoverage{}

	for _, tc := range testCases {
		tc := tc
		t.Run(tc.program, func(t *testing.T) {
			ptest.VerifyUpgrade(t, filepath.Join("test-programs", tc.program),
				ptest.WithProviderName("gcp"),
				ptest.WithBaselineVersion(baseline),
				ptest.WithResourceProviderServer(providerServer(t)),
				ptest.WithConfig("gcp:project", "pulumi-development"),
				ptest.WithUpgradeCoverage(cov))
		})
	}

	cov.Report(t)
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
