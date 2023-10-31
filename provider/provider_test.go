// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"fmt"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/flags"
	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

func TestDNSRecordSet(t *testing.T) {
	runTest(t, test(t, "test-programs/dns-recordset"))
}

func TestPubSubSubscription(t *testing.T) {
	runTest(t, test(t, "test-programs/pubsub-subscription"))
}

func TestPubSubTopic(t *testing.T) {
	runTest(t, test(t, "test-programs/pubsub-topic"))
}

func TestServiceAccount(t *testing.T) {
	runTest(t, test(t, "test-programs/serviceaccount-account",
		providertest.WithSkippedUpgradeTestMode(providertest.UpgradeTestMode_PreviewOnly,
			"TODO[pulumi/providertest#7] PreviewOnly is confused about stack names"),
	))
}

func TestStorageBucket(t *testing.T) {
	runTest(t, test(t, "test-programs/storage-bucket"))
}

func TestStorageBucketObject(t *testing.T) {
	t.Skipf("TODO[pulumi/providertest#2] skipping because Assets are not working yet")
	runTest(t, test(t, "test-programs/storage-bucketobject"))
}

func TestSecretManagerSecret(t *testing.T) {
	runTest(t, test(t, "test-programs/secretmanager-secret"))
}

func TestSqlUser(t *testing.T) {
	runTest(t, test(t, "test-programs/sql-user"))
}

func TestBigQueryTable(t *testing.T) {
	runTest(t, test(t, "test-programs/bigquery-table",
		providertest.WithSkippedUpgradeTestMode(providertest.UpgradeTestMode_PreviewOnly,
			"TODO[pulumi/providertest#7] PreviewOnly is confused about stack names"),
	))
}

func TestComputeFirewall(t *testing.T) {
	runTest(t, test(t, "test-programs/compute-firewall"))
}

func TestCloudFunction(t *testing.T) {
	t.Skipf("TODO[pulumi/providertest#2] skipping because Assets are not working yet")
	runTest(t, test(t, "test-programs/cloudfunctions-function"))
}

// Test programs that were automatically extracted from examples without autocorrection.
func TestAutoExtractedPrograms(t *testing.T) {
	type testCase struct {
		program string
	}

	testCases := []testCase{
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
			runTest(t, test(t, filepath.Join("test-programs", tc.program)))
		})
	}
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func test(t *testing.T, dir string, opts ...providertest.Option) *providertest.ProviderTest {
	opts = append(opts,
		providertest.WithProviderName("gcp"),
		providertest.WithBaselineVersion("6.67.0"),
		providertest.WithConfig("gcp:project", "pulumi-development"),
		providertest.WithResourceProviderServer(providerServer(t)))
	return providertest.NewProviderTest(dir, opts...)
}

// This funcion inlines bits of ProviderTest.Run to avoid running E2E tests and instead focuses on
// upgrade tests. Currently E2E tests are not able to run in this provider.
//
// TODO[pulumi/ci-mgmt#675] expose credentials so this just becomes pt.Run(t).
func runTest(t *testing.T, pt *providertest.ProviderTest) {
	t.Run("upgrade-snapshot", func(t *testing.T) {
		t.Helper()
		if flags.Snapshot.IsSet() {
			t.Logf("Recording baseline behavior because %s", flags.Snapshot.WhySet())
			pt.VerifyUpgradeSnapshot(t)
		} else {
			t.Skipf("Skip recording baseline behavior because %s", flags.Snapshot.WhyNotSet())
		}
	})
	for _, m := range providertest.UpgradeTestModes() {
		t.Run(fmt.Sprintf("upgrade-%s", m), func(t *testing.T) {
			t.Helper()
			if m == providertest.UpgradeTestMode_Quick {
				t.Skip("TODO[pulumi/providertest#28] Skipping Quick mode because of panics and implicit dependency on Configure")
			}
			pt.VerifyUpgrade(t, m)
		})
	}
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
