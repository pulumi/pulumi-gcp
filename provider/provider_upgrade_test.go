// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"os"
	"path"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	ptest "github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-gcp/provider/v6/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-trace-tool/traces"
	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
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

		// TODO[pulumi/providertest#2] skipping because Assets are not working yet
		// {"storage-bucketobject"},

		{"secretmanager-secret"},
		{"sql-user"},

		// extracted from schema examples and manually corrected
		{"bigquery-table"},
		{"compute-firewall"},

		// TODO[pulumi/providertest#2] skipping because Assets are not working yet
		// {"cloudfunctions-function"},

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

func bench(name, provider, runtime, lang string) traces.Benchmark {
	b := traces.NewBenchmark(name)
	b.Provider = provider
	b.Runtime = runtime
	b.Language = lang
	b.Repository = "pulumi/pulumi-gcp"
	return b
}

func programTestAsBenchmark(
	t *testing.T,
	bench traces.Benchmark,
	test integration.ProgramTestOptions,
) {
	// Run preview only to make sure all needed plugins are
	// downloaded so that these downloads do not skew
	// measurements.
	t.Run("prewarm", func(t *testing.T) {
		prewarmOptions := test.With(integration.ProgramTestOptions{
			SkipRefresh:              true,
			SkipEmptyPreviewUpdate:   true,
			SkipExportImport:         true,
			SkipUpdate:               true,
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
			Config:                   map[string]string{"gcp:project": "pulumi-development"},
			Quick:                    true,
		})
		prewarmOptions.ExtraRuntimeValidation = nil
		integration.ProgramTest(t, &prewarmOptions)
	})

	tracing_dir := path.Join(getCwd(t), "tracing_dir")
	os.Setenv(traces.TRACING_DIR_ENV_VAR, tracing_dir)
	t.Run("benchmark", func(t *testing.T) {
		finalOptions := test.With(bench.ProgramTestOptions()).With(
			integration.ProgramTestOptions{
				Quick:         true,
				Config:        map[string]string{"gcp:project": "pulumi-development"},
				Verbose:       true,
				DebugLogLevel: 5,
			},
		)
		integration.ProgramTest(t, &finalOptions)
	})
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func TestInitTime(t *testing.T) {
	benchmark := bench("bucket-example", "gcp", "go", "go")
	opts := integration.ProgramTestOptions{
		Dir: path.Join(getCwd(t), "..", "examples", "bucket-go"),
	}
	programTestAsBenchmark(t, benchmark, opts)
}
