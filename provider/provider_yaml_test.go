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
	"github.com/pulumi/providertest/replay"
)

func TestDNSRecordSet(t *testing.T) {
	runTest(t, test(t, "test-programs/dns-recordset",
		providertest.WithDiffValidation(providertest.NoReplacements()),
	))
}

func TestPubSubSubscription(t *testing.T) {
	runTest(t, test(t, "test-programs/pubsub-subscription",
		providertest.WithDiffValidation(providertest.NoReplacements()),
	))
}

func TestPubSubTopic(t *testing.T) {
	runTest(t, test(t, "test-programs/pubsub-topic",
		providertest.WithDiffValidation(providertest.NoReplacements()),
	))
}

func TestStorageBucket(t *testing.T) {
	runTest(t, test(t, "test-programs/storage-bucket",
		providertest.WithDiffValidation(providertest.NoReplacements()),
	))
}

func TestStorageBucketObject(t *testing.T) {
	t.Skipf("TODO[pulumi/providertest#2] skipping because Assets are not working yet")
	runTest(t, test(t, "test-programs/storage-bucketobject"))
}

func TestSecretManagerSecret(t *testing.T) {
	runTest(t, test(t, "test-programs/secretmanager-secret",
		providertest.WithDiffValidation(providertest.NoReplacements())))
}

func TestSqlUser(t *testing.T) {
	runTest(t, test(t, "test-programs/sql-user",
		providertest.WithDiffValidation(providertest.NoReplacements())))
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
			runTest(t, test(t, filepath.Join("test-programs", tc.program),
				providertest.WithDiffValidation(providertest.NoReplacements()),
			))
		})
	}
}

// This used to panic in the Diff on unexpected bool label (expecting string), see
// pulumi/pulumi-gcp#1377 for more details.
func TestBucketBooleanLabel(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	replay.ReplaySequence(t, providerServer(t), `
	[
	  {
	    "method": "/pulumirpc.ResourceProvider/Configure",
	    "request": {
	      "variables": {
		"gcp:config:project": "pulumi-development"
	      },
	      "args": {
		"project": "pulumi-development",
		"version": "7.2.1"
	      },
	      "acceptSecrets": true,
	      "acceptResources": true,
	      "sendsOldInputs": true,
	      "sendsOldInputsToDelete": true
	    },
	    "response": {
	      "supportsPreview": true
	    }
	  },
	  {
	    "method": "/pulumirpc.ResourceProvider/Diff",
	    "request": {
	      "id": "my-bucket-409ae4e",
	      "urn": "urn:pulumi:dev::gcp_bucket_python::gcp:storage/bucket:Bucket::my-bucket",
	      "olds": {
		"__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":600000000000,\"read\":240000000000,\"update\":240000000000}}",
		"autoclass": null,
		"cors": [],
		"customPlacementConfig": null,
		"defaultEventBasedHold": false,
		"encryption": null,
		"forceDestroy": false,
		"id": "my-bucket-409ae4e",
		"labels": {
		  "bad-bool": "1"
		},
		"lifecycleRules": [],
		"location": "US",
		"logging": null,
		"name": "my-bucket-409ae4e",
		"project": "pulumi-development",
		"publicAccessPrevention": "inherited",
		"requesterPays": false,
		"retentionPolicy": null,
		"selfLink": "https://www.googleapis.com/storage/v1/b/my-bucket-409ae4e",
		"storageClass": "STANDARD",
		"uniformBucketLevelAccess": false,
		"url": "gs://my-bucket-409ae4e",
		"versioning": null,
		"website": null
	      },
	      "news": {
		"__defaults": [
		  "forceDestroy",
		  "name",
		  "storageClass"
		],
		"forceDestroy": false,
		"labels": {
		  "__defaults": [],
		  "bad-bool": true
		},
		"location": "US",
		"name": "my-bucket-409ae4e",
		"storageClass": "STANDARD"
	      },
	      "oldInputs": {
		"__defaults": [
		  "forceDestroy",
		  "name",
		  "storageClass"
		],
		"forceDestroy": false,
		"labels": {
		  "__defaults": [],
		  "bad-bool": true
		},
		"location": "US",
		"name": "my-bucket-409ae4e",
		"storageClass": "STANDARD"
	      }
	    },
	    "response": {
	      "changes": "DIFF_SOME",
	      "diffs": ["labels"],
	      "stables": "*",
	      "hasDetailedDiff": true,
	      "detailedDiff": {
		"labels.bad-bool": {
		  "kind": "UPDATE"
		}
	      }
	    }
	  }
	]`)
}
