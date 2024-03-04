//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

// Copyright 2016-2024, Pulumi Corporation.
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
	"fmt"
	"os"
	"path/filepath"
	"strings"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/providertest/replay"
)

func TestDNSRecordSetUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/dns-recordset", "")
}

func TestPubSubSubscriptionUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/pubsub-subscription", "")
}

func TestPubSubTopicUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/pubsub-topic", "")
}

func TestStorageBucketUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/storage-bucket", "")
}

func TestStorageBucketObjectUpgrade(t *testing.T) {
	t.Skipf("TODO[pulumi/pulumi-gcp#1607] temporarily skipping failing test")
	testProviderUpgrade(t, "test-programs/storage-bucketobject", "")
}

func TestSecretManagerSecretUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/secretmanager-secret", "")
}

func TestSqlUserUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/sql-user", "")
}

func TestBigQueryTableUpgrade(t *testing.T) {
	testProviderUpgradeWithConfig(t, "test-programs/bigquery-table", "", map[string]string{
		"datasetID": "dspitrunnerbigqueryt4b22ee25",
	})
}

func TestComputeFirewallUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/compute-firewall", "")
}

func TestCloudFunctionUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/cloudfunctions-function", "")
}

func TestNetworkUpgrade(t *testing.T) {
	t.Skipf("Flakey: see https://github.com/pulumi/pulumi-gcp/issues/1655 for details")
	testProviderUpgrade(t, "test-programs/network", "")
}

func TestClusterUpgrade(t *testing.T) {
	testProviderUpgrade(t, "test-programs/cluster", "7.2.1" /* test upgrading from this version */)
}

func skipIfNotCI(t *testing.T) {
	if os.Getenv("GITHUB_ACTIONS") == "" {
		t.Skipf("Skipping outside of CI - dev accounts do not have permissions to run these.")
	}
}

func TestIamBinding(t *testing.T) {
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testProviderUpgrade(t, "test-programs/iam-binding", "7.0.0")
}

func TestIamMember(t *testing.T) {
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testProviderUpgrade(t, "test-programs/iam-member", "7.0.0")
}

func TestLogSink(t *testing.T) {
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testProviderUpgrade(t, "test-programs/logsink", "7.0.0")
}

func TestTopicIamBinding(t *testing.T) {
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testProviderUpgrade(t, "test-programs/topic-iam-binding", "7.0.0")
}

func TestWrongRegionWarning(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	t.Setenv("GOOGLE_REGION", "westus")

	cwd, err := os.Getwd()
	require.NoError(t, err)

	test := pulumitest.NewPulumiTest(t, "test-programs/storage-bucket",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")))

	proj := os.Getenv("GOOGLE_PROJECT")
	test.SetConfig("gcp:project", proj)
	res := test.Up()
	require.Contains(
		t, res.StdOut,
		"region \"westus\" is not available for project \""+proj,
	)
}

func TestNoGlobalProjectWarning(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	proj := os.Getenv("GOOGLE_PROJECT")
	t.Setenv("GOOGLE_PROJECT", "")

	test := pulumitest.NewPulumiTest(t, "test-programs/project-bucket",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")))

	test.SetConfig("gcpProj", proj)
	res := test.Up()
	require.Contains(
		t, res.StdOut,
		"unable to detect a global setting for GCP Project.",
	)
}

// Test programs that were automatically extracted from examples without autocorrection.
func TestAutoExtractedProgramsUpgrade(t *testing.T) {
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
			d := filepath.Join("test-programs", tc.program)
			testProviderUpgrade(t, d, "")
		})
	}
}

// This used to panic in the Diff on unexpected bool label (expecting string), see
// pulumi/pulumi-gcp#1377 for more details.
//
//nolint:lll
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
	      "diffs": ["labels", "pulumiLabels"],
	      "stables": "*",
	      "hasDetailedDiff": true,
	      "detailedDiff": {
		"labels.bad-bool": {
		  "kind": "UPDATE"
		},
                "pulumiLabels": {
		  "kind": "UPDATE"
                }
	      }
	    }
	  }
	]`)
}

func TestNodePoolGpuAcceleratorPanic(t *testing.T) {
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
		"method": "/pulumirpc.ResourceProvider/Create",
		"request": {
			"urn": "urn:pulumi:dev::gcp_node_pool::gcp:container/nodePool:NodePool::gpu-node-pool",
			"properties": {
				"__defaults": [
					"name"
				],
				"cluster": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				"initialNodeCount": 1,
				"name": "gpu-node-pool-c90bfc0",
				"nodeConfig": {
					"__defaults": [
						"preemptible",
						"spot"
					],
					"diskSizeGb": 50,
					"guestAccelerators": [
						{
							"__defaults": [],
							"count": 1,
							"type": "nvidia-tesla-t4"
						}
					],
					"machineType": "n1-highmem-8",
					"oauthScopes": [
						"https://www.googleapis.com/auth/cloud-platform"
					],
					"preemptible": false,
					"resourceManagerTags": {},
					"spot": false
				}
			},
			"preview": true
		},
		"response": {
			"properties": {
				"id": "",
				"initialNodeCount": 1,
				"name": "gpu-node-pool-c90bfc0",
				"nodeConfig": {
				  "advancedMachineFeatures": null,
				  "bootDiskKmsKey": "",
				  "confidentialNodes": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "diskSizeGb": 50,
				  "diskType": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "effectiveTaints": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "enableConfidentialStorage": false,
				  "ephemeralStorageConfig": null,
				  "ephemeralStorageLocalSsdConfig": null,
				  "fastSocket": null,
				  "gcfsConfig": null,
				  "guestAccelerators": [
					{
					  "count": 1,
					  "gpuDriverInstallationConfig": null,
					  "gpuPartitionSize": "",
					  "gpuSharingConfig": null,
					  "type": "nvidia-tesla-t4"
					}
				  ],
				  "gvnic": null,
				  "hostMaintenancePolicy": null,
				  "imageType": "",
				  "kubeletConfig": null,
				  "labels": {},
				  "linuxNodeConfig": null,
				  "localNvmeSsdBlockConfig": null,
				  "localSsdCount": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "loggingVariant": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "machineType": "n1-highmem-8",
				  "metadata": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "minCpuPlatform": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "nodeGroup": "",
				  "oauthScopes": [
					"https://www.googleapis.com/auth/cloud-platform"
				  ],
				  "preemptible": false,
				  "reservationAffinity": null,
				  "resourceLabels": {},
				  "resourceManagerTags": {},
				  "sandboxConfig": null,
				  "serviceAccount": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "shieldedInstanceConfig": "04da6b54-80e4-46f7-96ec-b56ff0331ba9",
				  "soleTenantConfig": null,
				  "spot": false,
				  "tags": [],
				  "taints": [],
				  "workloadMetadataConfig": "04da6b54-80e4-46f7-96ec-b56ff0331ba9"
				},
				"project": "pulumi-development"
			  }
		},
		"metadata": {
			"kind": "resource",
			"mode": "client",
			"name": "gcp"
		}
	}]`,
	)
}

func TestOrganizationsProjectAutoNaming(t *testing.T) {
	replay.Replay(t, providerServer(t), `
{
    "method": "/pulumirpc.ResourceProvider/Check",
    "request": {
        "urn": "urn:pulumi:dev::dev-yaml::gcp:organizations/project:Project::my-proj",
        "olds": {},
        "news": {},
        "randomSeed": "ZgqzJVOmtvl2Ni5Y/2HRvTkquku0LpRubgZVUzBO1nc="
    },
    "response": {
        "inputs": {
            "__defaults": [
                "autoCreateNetwork",
                "name",
                "projectId"
            ],
            "autoCreateNetwork": true,
            "name": "my-proj",
            "projectId": "my-proj-760b06d"
        }
    },
    "metadata": {
        "kind": "resource",
        "mode": "client",
        "name": "gcp"
    }
}`)
}

//nolint:lll
func TestCheckConfigNoCredentials(t *testing.T) {
	if !testing.Short() {
		t.Skip("Only run in short mode, since we want to NOT have credentials.")
	}
	t.Setenv("GOOGLE_APPLICATION_CREDENTIALS", "")
	t.Setenv("GOOGLE_GHA_CREDS_PATH", "")
	t.Setenv("GOOGLE_ZONE", "")
	t.Setenv("GOOGLE_REGION", "")
	replay.Replay(t, providerServer(t), strings.ReplaceAll(`
{
	"method": "/pulumirpc.ResourceProvider/CheckConfig",
    "request": {
        "urn": "urn:pulumi:dev::gcp_vm::pulumi:providers:gcp::default_7_6_0",
        "olds": {
        },
        "news": {
            "version": "7.6.0"
        }
    },
    "errors": [
        "failed to load application credentials.\nTo use your default gcloud credentials, run:\n\t$gcloud auth application-default login$\nSee https://www.pulumi.com/registry/packages/gcp/installation-configuration/ for details.\nExpanded error message: Attempted to load application default credentials since neither $credentials$ nor $access_token$ was set in the provider block.  No credentials loaded. To use your gcloud credentials, run 'gcloud auth application-default login'.  Original error: google: could not find default credentials. See https://cloud.google.com/docs/authentication/external/set-up-adc for more information"
    ],
    "metadata": {
        "kind": "resource",
        "mode": "client",
        "name": "gcp"
    }
}
`, "$", "`"),
	)
}

//nolint:lll
func TestRegress1488(t *testing.T) {
	if testing.Short() {
		t.Skip("Only run in long mode, since we want credentials.")
	}

	// Test that going from replication.automatic: true (v6-style) to replication.auto: {}
	// (v7-style) is not a replacement.
	proj := os.Getenv("GOOGLE_PROJECT")
	if proj == "" {
		proj = "pulumi-development"
	}
	replay.ReplaySequence(t, providerServer(t), fmt.Sprintf(`[
	{
	  "method": "/pulumirpc.ResourceProvider/Configure",
	  "request": {
	    "variables": {
	      "gcp:config:project": %q
	    },
	    "args": {
	      "project": %q,
	      "version": "7.4.0"
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
	    "id": "projects/pulumi-development/secrets/my-secr",
	    "urn": "urn:pulumi:dev::gcp-1488::gcp:secretmanager/secret:Secret::my-secr",
	    "olds": {
	      "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":1200000000000,\"delete\":1200000000000,\"update\":1200000000000}}",
	      "createTime": "2024-01-31T22:23:26.772032Z",
	      "expireTime": "",
	      "id": "projects/pulumi-development/secrets/my-secr",
	      "labels": {},
	      "name": "projects/921927215178/secrets/my-secr",
	      "project": "pulumi-development",
	      "replication": {
		"automatic": true,
		"userManaged": null
	      },
	      "rotation": null,
	      "secretId": "my-secr",
	      "topics": []
	    },
	    "news": {
	      "__defaults": [],
	      "project": "pulumi-development",
	      "replication": {
		"__defaults": [],
		"auto": {
		  "__defaults": []
		}
	      },
	      "secretId": "my-secr"
	    },
	    "oldInputs": {
	      "__defaults": [],
	      "project": "pulumi-development",
	      "replication": {
		"__defaults": [],
		"automatic": true
	      },
	      "secretId": "my-secr"
	    }
	  },
	  "response": {
	    "stables": "*",
	    "changes": "*",
	    "hasDetailedDiff": "*"
	  }
	}
	]`, proj, proj))
}
