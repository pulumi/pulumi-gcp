// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-gcp/provider/v6/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

func TestDNSRecordSet(t *testing.T) {
	test(t, "test-programs/dns-recordset").Run(t)
}

func TestPubSubSubscription(t *testing.T) {
	test(t, "test-programs/pubsub-subscription").Run(t)
}

func TestPubSubTopic(t *testing.T) {
	test(t, "test-programs/pubsub-topic").Run(t)
}

func TestServiceAccount(t *testing.T) {
	test(t, "test-programs/serviceaccount-account",
		providertest.WithSkippedUpgradeTestMode(providertest.UpgradeTestMode_PreviewOnly,
			"TODO[pulumi/providertest#7] PreviewOnly is confused about stack names"),
	).Run(t)
}

func TestStorageBucket(t *testing.T) {
	test(t, "test-programs/storage-bucket").Run(t)
}

func TestStorageBucketObject(t *testing.T) {
	t.Skipf("TODO[pulumi/providertest#2] skipping because Assets are not working yet")
	test(t, "test-programs/storage-bucketobject").Run(t)
}

func TestSecretManagerSecret(t *testing.T) {
	test(t, "test-programs/secretmanager-secret").Run(t)
}

func TestSqlUser(t *testing.T) {
	test(t, "test-programs/sql-user").Run(t)
}

func TestBigQueryTable(t *testing.T) {
	test(t, "test-programs/bigquery-table",
		providertest.WithSkippedUpgradeTestMode(providertest.UpgradeTestMode_PreviewOnly,
			"TODO[pulumi/providertest#7] PreviewOnly is confused about stack names"),
	).Run(t)
}

func TestComputeFirewall(t *testing.T) {
	test(t, "test-programs/compute-firewall").Run(t)
}

func TestCloudFunction(t *testing.T) {
	t.Skipf("TODO[pulumi/providertest#2] skipping because Assets are not working yet")
	test(t, "test-programs/cloudfunctions-function").Run(t)
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
			test(t, filepath.Join("test-programs", tc.program)).Run(t)
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
