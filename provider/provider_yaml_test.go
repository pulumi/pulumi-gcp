//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

// Copyright 2016-2023, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License")
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package gcp

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest"
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
