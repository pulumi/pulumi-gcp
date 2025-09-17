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
	"bytes"
	"context"
	"encoding/json"
	"fmt"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
	"testing"

	"github.com/hexops/autogold/v2"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/providertest/replay"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optpreview"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optrefresh"
	"github.com/pulumi/pulumi/sdk/v3/go/auto/optup"
)

func TestDNSRecordSetUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/dns-recordset")
}

func TestPubSubSubscriptionUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/pubsub-subscription")
}

func TestPubSubTopicUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/pubsub-topic")
}

func TestStorageBucketUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/storage-bucket")
}

func TestStorageBucketObjectUpgrade(t *testing.T) {
	t.Skipf("TODO[pulumi/pulumi-gcp#1607] temporarily skipping failing test")
	testUpgrade(t, "test-programs/storage-bucketobject")
}

func TestSecretManagerSecretUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/secretmanager-secret")
}

func TestSqlUserUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/sql-user")
}

func TestBigQueryTableUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/bigquery-table")
}

func TestComputeFirewallUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/compute-firewall")
}

func TestCloudFunctionUpgrade(t *testing.T) {
	t.Skipf("TODO[https://github.com/pulumi/pulumi-gcp/issues/2670]: Flaky")
	testUpgrade(t, "test-programs/cloudfunctions-function")
}

func TestNetworkUpgrade(t *testing.T) {
	t.Skipf("TODO[https://github.com/pulumi/pulumi-gcp/issues/1655]: Flaky")
	testUpgrade(t, "test-programs/network")
}

func TestClusterUpgrade(t *testing.T) {
	t.Skipf("TODO[https://github.com/pulumi/pulumi-gcp/issues/2729]: Flaky")
	testUpgrade(t, "test-programs/cluster",
		optproviderupgrade.BaselineOpts(opttest.DownloadProviderVersion(providerName, "7.2.1")))
}

func skipIfNotCI(t *testing.T) {
	if os.Getenv("GITHUB_ACTIONS") == "" {
		t.Skipf("Skipping outside of CI - dev accounts do not have permissions to run these.")
	}
}

func TestIamBinding(t *testing.T) {
	t.Skip("TODO[https://github.com/pulumi/pulumi-gcp/issues/2725]: Flaky")
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testUpgrade(t, "test-programs/iam-binding",
		optproviderupgrade.BaselineOpts(opttest.DownloadProviderVersion(providerName, "7.0.0")))
}

func TestIamMember(t *testing.T) {
	t.Skip("TODO[https://github.com/pulumi/pulumi-gcp/issues/2726]: Flaky")
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testUpgrade(t, "test-programs/iam-member",
		optproviderupgrade.BaselineOpts(opttest.DownloadProviderVersion(providerName, "7.0.0")))
}

func TestLogSink(t *testing.T) {
	t.Skipf("TODO[https://github.com/pulumi/pulumi-gcp/issues/2671]: Flaky")
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testUpgrade(t, "test-programs/logsink",
		optproviderupgrade.BaselineOpts(opttest.DownloadProviderVersion(providerName, "7.0.0")))
}

func TestTopicIamBinding(t *testing.T) {
	// TODO[pulumi/pulumi-gcp#2628]: This test is flaky and fails intermittently in CI.
	t.Skip("Skipping until https://github.com/pulumi/pulumi-gcp/issues/2628 is fixed")
	skipIfNotCI(t)
	// ServiceAccount requires 7.0
	testUpgrade(t, "test-programs/topic-iam-binding",
		optproviderupgrade.BaselineOpts(opttest.DownloadProviderVersion(providerName, "7.0.0")))
}

func TestConnectionProfileUpgrade(t *testing.T) {
	res := testUpgrade(t, "test-programs/connection-profile",
		optproviderupgrade.BaselineOpts(opttest.DownloadProviderVersion("random", "4.16.0")))
	assertpreview.HasNoChanges(t, res)
}

func TestConnectionProfileUpgradev7(t *testing.T) {
	res := testUpgrade(t, "test-programs/connection-profile",
		optproviderupgrade.BaselineOpts(
			opttest.DownloadProviderVersion("random", "4.16.0"),
			opttest.DownloadProviderVersion(providerName, "7.17.0")),
	)
	assertpreview.HasNoChanges(t, res)
}

func TestComputeForwardingRuleV6V8StateMigration(t *testing.T) {
	result := testUpgrade(t, "test-programs/compute-forwardingrule")
	assertpreview.HasNoReplacements(t, result)
	assertpreview.HasNoDeletes(t, result)
}

func TestComputeForwardingRuleV6V8StateMigrationNoDefaults(t *testing.T) {
	testUpgrade(t,
		"./test-programs/compute-forwardingrule-no-defaults",
		optproviderupgrade.NewSourcePath("./test-programs/compute-forwardingrule-no-defaults/v8"),
	)
}

// Regression test for https://github.com/pulumi/pulumi-gcp/issues/1874
func TestRegress1874(t *testing.T) {
	test := pulumiTest(t, "test-programs/connection-profile",
		opttest.DownloadProviderVersion("random", "4.16.0"),
	)

	test.Up(t)
	// We would always produce a diff and updating fails after.
	test.Up(t)
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
	test.SetConfig(t, "gcp:project", proj)
	res := test.Up(t)
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
	proj := getProject()
	t.Setenv("GOOGLE_PROJECT", "")

	test := pulumitest.NewPulumiTest(t, "test-programs/project-bucket",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")))

	test.SetConfig(t, "gcpProj", proj)
	res := test.Up(t)
	require.Contains(
		t, res.StdOut,
		"unable to detect a global setting for GCP Project.",
	)
}

func TestGlobalProjectNoProjectWarning(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	proj := getProject()
	test := pulumitest.NewPulumiTest(t, "test-programs/project-bucket",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")))

	test.SetConfig(t, "gcp:disableGlobalProjectWarning", "true")
	test.SetConfig(t, "gcpProj", proj)
	res := test.Up(t)
	require.NotContains(t, res.StdOut, "If you would like to disable this warning use")
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
		//TODO: This upgrade represents a breaking change v7->v8.
		// Must be re-recorded on new baseline: https://github.com/pulumi/pulumi-gcp/issues/2378
		//{"cloudrunv2-service-7"},
		{"compute-disk-1"},
		{"compute-disk-3"},
	}

	for _, tc := range testCases {
		tc := tc
		t.Run(tc.program, func(t *testing.T) {
			d := filepath.Join("test-programs", tc.program)
			testUpgrade(t, d)
		})
	}
}

func TestCloudRunV2StateMigration(t *testing.T) {
	t.Parallel()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	const pulumiYaml = `
name: test
resources:
    tested-resource:
        properties:%s
            ingress: INGRESS_TRAFFIC_ALL
            launchStage: BETA
            location: us-central1
            template:
                containers:
                    - image: us-docker.pkg.dev/cloudrun/container/hello
                      name: hello-1
                      %s
                      volumeMounts:
                        - mountPath: /mnt
                          name: empty-dir-volume
                    - image: us-docker.pkg.dev/cloudrun/container/hello
                      name: hello-2
                volumes:
                    - emptyDir:
                        medium: MEMORY
                        sizeLimit: 256Mi
                      name: empty-dir-volume
        type: gcp:cloudrunv2:Service
runtime:
    name: yaml`

	// Apply the relevant changes expected to upgrade successfully v7 -> v8:
	// `ports` is now an Object, not a maxItemsOne list
	// `deletionProtection` is a new field
	firstProgram := []byte(fmt.Sprintf(
		pulumiYaml,
		"",
		"ports:\n                        - containerPort: 8080"))
	secondProgram := []byte(fmt.Sprintf(
		pulumiYaml,
		"\n            deletionProtection: false",
		"ports:\n                        containerPort: 8080"),
	)

	testDir := t.TempDir()
	err := os.WriteFile(filepath.Join(testDir, "Pulumi.yaml"), firstProgram, 0o600)
	require.NoError(t, err)

	secondTestDir := t.TempDir()
	err = os.WriteFile(filepath.Join(secondTestDir, "Pulumi.yaml"), secondProgram, 0o600)
	require.NoError(t, err)

	testUpgrade(t, testDir, optproviderupgrade.NewSourcePath(secondTestDir))
}

func TestRouterNatUpgrade(t *testing.T) {
	testUpgrade(t, "test-programs/router-nat")
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
	      "supportsPreview": true,
	      "supportsAutonamingConfiguration": true
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
	      "diffs": "*",
	      "stables": "*",
	      "hasDetailedDiff": true,
	      "detailedDiff": {
		"labels[\"bad-bool\"]": {
		  "kind": "UPDATE"
		},
		"effectiveLabels[\"bad-bool\"]": {
		  "kind": "UPDATE"
                },
		  "pulumiLabels[\"bad-bool\"]": {}
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
			  "supportsPreview": true,
			  "supportsAutonamingConfiguration": true
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
				"properties": "*"
			},
			"metadata": {
				"kind": "resource",
				"mode": "client",
				"name": "gcp"
			}
		}
	]`)
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
 				"deletionPolicy",
                "name",
                "projectId"
            ],
            "autoCreateNetwork": true,
            "name": "my-proj",
            "projectId": "my-proj-760b06d",
			"deletionPolicy": "PREVENT"
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
	proj := getProject()
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
	    "supportsPreview": true,
	    "supportsAutonamingConfiguration": true
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
	    "hasDetailedDiff": "*",
	    "detailedDiff": "*",
		"diffs": "*"
	  }
	}
	]`, proj, proj))
}

func TestEnvTokenNotInState(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	output, err := exec.Command("gcloud", "auth", "print-access-token").Output()
	outputStr := strings.TrimSpace(string(output))
	if err != nil {
		errMsg := err.(*exec.ExitError).Stderr
		t.Fatal(string(errMsg))
	}
	t.Setenv("GOOGLE_OAUTH_ACCESS_TOKEN", outputStr)
	test := pulumiTest(t, filepath.Join("test-programs", "storage-bucket"))

	test.Up(t)
	stack := test.ExportStack(t)
	data, err := stack.Deployment.MarshalJSON()
	require.NoError(t, err)
	var stateMap map[string]interface{}
	err = json.Unmarshal(data, &stateMap)
	require.NoError(t, err)

	resourcesJSON := stateMap["resources"].([]interface{})
	// Stack is first, provider is second
	providerJSON := resourcesJSON[1].(map[string]interface{})
	inputsJSON := providerJSON["inputs"].(map[string]interface{})
	outputsJSON := providerJSON["outputs"].(map[string]interface{})

	require.NotContains(t, inputsJSON, "accessToken")
	require.NotContains(t, outputsJSON, "accessToken")
}

//nolint:lll
func TestCloudrunServiceDiffNoErrorLabelsDuplicate(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	proj := getProject()
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
			"supportsPreview": true,
			"supportsAutonamingConfiguration": true
		}
	},
	{
		"method": "/pulumirpc.ResourceProvider/Diff",
		"request": {
			"id": "locations/us-west1/namespaces/pulumi-development/services/test-gcr-5a4eed9",
			"urn": "urn:pulumi:dev::gcp_labels::gcp:cloudrun/service:Service::test-gcr",
			"olds": {
				"__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":1200000000000,\"delete\":1200000000000,\"update\":1200000000000},\"schema_version\":\"2\"}",
				"autogenerateRevisionName": true,
				"id": "locations/us-west1/namespaces/pulumi-development/services/test-gcr-5a4eed9",
				"location": "us-west1",
				"metadata": {
					"annotations": {
						"run.googleapis.com/ingress": "all"
					},
					"effectiveAnnotations": {
						"run.googleapis.com/ingress": "all"
					},
					"effectiveLabels": {
						"env": "dev"
					},
					"generation": 0,
					"labels": {
						"env": "dev"
					},
					"namespace": "",
					"pulumiLabels": {
						"env": "dev"
					},
					"resourceVersion": "",
					"selfLink": "",
					"uid": ""
				},
				"name": "test-gcr-5a4eed9",
				"project": "pulumi-development",
				"template": {
					"metadata": {
						"annotations": {
							"autoscaling.knative.dev/maxScale": "100"
						},
						"generation": 0,
						"labels": {},
						"name": "",
						"namespace": "",
						"resourceVersion": "",
						"selfLink": "",
						"uid": ""
					},
					"spec": {
						"containerConcurrency": 30,
						"containers": [
							{
								"args": [],
								"commands": [],
								"envFroms": [],
								"envs": [],
								"image": "gcr.io/example",
								"livenessProbe": null,
								"name": "",
								"ports": [],
								"resources": {
									"limits": {
										"cpu": "1",
										"memory": "512Mi"
									},
									"requests": {}
								},
								"startupProbe": null,
								"volumeMounts": [],
								"workingDir": ""
							}
						],
						"serviceAccountName": "",
						"servingState": "",
						"timeoutSeconds": 60,
						"volumes": []
					}
				},
				"traffics": [
					{
						"latestRevision": true,
						"percent": 100,
						"revisionName": "",
						"tag": "",
						"url": ""
					}
				]
			},
			"news": {
				"__defaults": [
					"name"
				],
				"autogenerateRevisionName": true,
				"location": "us-west1",
				"metadata": {
					"__defaults": [],
					"annotations": {
						"run.googleapis.com/ingress": "all"
					},
					"labels": {
						"env": "dev"
					}
				},
				"name": "test-gcr-5a4eed9",
				"template": {
					"__defaults": [],
					"metadata": {
						"__defaults": [],
						"annotations": {
							"autoscaling.knative.dev/maxScale": "100"
						}
					},
					"spec": {
						"__defaults": [],
						"containerConcurrency": 30,
						"containers": [
							{
								"__defaults": [],
								"image": "hello-world",
								"resources": {
									"__defaults": [],
									"limits": {
										"cpu": "1",
										"memory": "512Mi"
									}
								}
							}
						],
						"timeoutSeconds": 60
					}
				},
				"traffics": [
					{
						"__defaults": [],
						"latestRevision": true,
						"percent": 100
					}
				]
			},
			"oldInputs": {
				"__defaults": [
					"name"
				],
				"autogenerateRevisionName": true,
				"location": "us-west1",
				"metadata": {
					"__defaults": [],
					"annotations": {
						"run.googleapis.com/ingress": "all"
					},
					"labels": {
						"env": "dev"
					}
				},
				"name": "test-gcr-5a4eed9",
				"template": {
					"__defaults": [],
					"metadata": {
						"__defaults": [],
						"annotations": {
							"autoscaling.knative.dev/maxScale": "100"
						}
					},
					"spec": {
						"__defaults": [],
						"containerConcurrency": 30,
						"containers": [
							{
								"__defaults": [],
								"image": "gcr.io/example",
								"resources": {
									"__defaults": [],
									"limits": {
										"cpu": "1",
										"memory": "512Mi"
									}
								}
							}
						],
						"timeoutSeconds": 60
					}
				},
				"traffics": [
					{
						"__defaults": [],
						"latestRevision": true,
						"percent": 100
					}
				]
			}
		},
		"response": {
			"stables": "*",
			"changes": "*",
			"hasDetailedDiff": "*",
			"diffs": "*",
			"detailedDiff": "*"
		},
		"metadata": {
			"kind": "resource",
			"mode": "client",
			"name": "gcp"
		}
	}
	]`, proj, proj))
}

func pulumiTestExec(t *testing.T, ptest *pulumitest.PulumiTest, args ...string) {
	workspace := ptest.CurrentStack().Workspace()
	ctx := context.Background()
	workdir := workspace.WorkDir()
	var env []string
	for k, v := range workspace.GetEnvVars() {
		env = append(env, fmt.Sprintf("%s=%s", k, v))
	}
	stdin := bytes.NewReader([]byte{})

	s1, s2, code, err := workspace.PulumiCommand().Run(ctx, workdir, stdin, nil, nil, env, args...)
	t.Logf("cmd: %s", args)
	t.Logf("stdout: %s", s1)
	t.Logf("stderr: %s", s2)
	t.Logf("code=%v", code)

	require.NoError(t, err)
}

func pulumiTestImport(
	t *testing.T, ptest *pulumitest.PulumiTest,
	resourceType, resourceName, resourceID string, providerUrn string,
) {
	arguments := []string{
		"import", resourceType, resourceName, resourceID, "--yes", "--protect=false", "-s", ptest.CurrentStack().Name(),
	}
	if providerUrn != "" {
		arguments = append(arguments, "--provider="+providerUrn)
	}
	pulumiTestExec(t, ptest, arguments...)
}

func pulumiTestDeleteFromState(t *testing.T, ptest *pulumitest.PulumiTest, resourceURN string) {
	arguments := []string{
		"state", "delete", resourceURN, "--yes", "-s", ptest.CurrentStack().Name(),
	}
	pulumiTestExec(t, ptest, arguments...)
}

// extractFieldFromState extracts a specified field from a specific resource in the state
func extractFieldFromState(t *testing.T, state interface{}, resourceUrn string, field string) map[string]interface{} {
	// Marshal the state to JSON
	stateData, err := json.Marshal(state)
	require.NoError(t, err)

	// Parse into a map
	var stateMap map[string]interface{}
	require.NoError(t, json.Unmarshal(stateData, &stateMap))

	// Extract deployment from the state
	deployment, _ := stateMap["deployment"].(map[string]interface{})
	resources, _ := deployment["resources"].([]interface{})

	// Find the resource
	for _, resource := range resources {
		if resourceMap, ok := resource.(map[string]interface{}); ok {
			if urn, ok := resourceMap["urn"].(string); ok && urn == resourceUrn {
				// Extract the outputs (which contain the actual resource properties)
				outputs, ok := resourceMap["outputs"].(map[string]interface{})
				require.True(t, ok, "Resource should have outputs")

				// Extract the labels field
				labels, ok := outputs[field].(map[string]interface{})
				require.True(t, ok, fmt.Sprintf("%s resource should have %s field", resourceUrn, field))
				return labels
			}
		}
	}
	require.Fail(t, "Should find resource with URN: %s", resourceUrn)
	return nil
}

func TestImport(t *testing.T) {
	for _, tc := range []struct {
		testName         string
		programPath      string
		resourceType     string
		explicitProvider bool
		skip             string // If skip is non-empty, the test will be skipped with skip's value as the reason
	}{
		{
			testName:     "bucket-iam-binding",
			programPath:  filepath.Join("test-programs", "bucket-iam-binding"),
			resourceType: "gcp:storage/bucketIAMBinding:BucketIAMBinding",
		},
	} {
		t.Run(tc.testName, func(t *testing.T) {
			if tc.skip != "" {
				t.Skip(tc.skip)
			}
			test := pulumiTest(t, tc.programPath)

			res := test.Up(t)
			resourceID := res.Outputs["resourceId"].Value.(string)
			resourceUrn := res.Outputs["resourceUrn"].Value.(string)

			providerUrn := ""
			if tc.explicitProvider {
				providerUrn = res.Outputs["providerUrn"].Value.(string)
			}

			pulumiTestDeleteFromState(t, test, resourceUrn)
			pulumiTestImport(t, test, tc.resourceType, "resource", resourceID, providerUrn)

			prevResult := test.Preview(t)
			assertpreview.HasNoChanges(t, prevResult)
		})
	}
}

func TestImportLabels(t *testing.T) {
	for _, tc := range []struct {
		testName         string
		programPath      string
		resourceType     string
		explicitProvider bool
		skip             string // If skip is non-empty, the the test will be skipped with skip's value as the reason
	}{
		{
			testName:     "labeled-bucket",
			programPath:  filepath.Join("test-programs", "labeled-bucket"),
			resourceType: "gcp:storage/bucket:Bucket",
		},
		{
			testName:         "labeled-bucket-with-defaults",
			programPath:      filepath.Join("test-programs", "labeled-bucket-with-defaults"),
			resourceType:     "gcp:storage/bucket:Bucket",
			explicitProvider: true,
		},
	} {
		t.Run(tc.testName, func(t *testing.T) {
			if tc.skip != "" {
				t.Skip(tc.skip)
			}
			test := pulumiTest(t, tc.programPath)

			res := test.Up(t)
			resourceID := res.Outputs["resourceId"].Value.(string)
			resourceUrn := res.Outputs["resourceUrn"].Value.(string)

			providerUrn := ""
			if tc.explicitProvider {
				providerUrn = res.Outputs["providerUrn"].Value.(string)
			}

			initialState := test.ExportStack(t)
			initialLabels := extractFieldFromState(t, initialState, resourceUrn, "labels")
			require.NotEmptyf(t, initialLabels, "Labels are set on Create")

			pulumiTestDeleteFromState(t, test, resourceUrn)
			pulumiTestImport(t, test, tc.resourceType, "resource", resourceID, providerUrn)

			// Expect effectiveLabels to hold all labels we originally created the Bucket with:
			// Bucket labels, default labels, provisioning label.
			importState := test.ExportStack(t)
			effectiveLabels := extractFieldFromState(t, importState, resourceUrn, "effectiveLabels")
			fmt.Println(effectiveLabels)
			appLabel := effectiveLabels["app"]
			provisioningLabel := effectiveLabels["goog-pulumi-provisioned"]
			require.True(t, appLabel == "my-label")
			require.True(t, provisioningLabel == "true")
			if tc.explicitProvider {
				defaultLabel := effectiveLabels["def"]
				require.True(t, defaultLabel == "defaultlabel")
			}

			// Use the generated program from Import.
			// Notably, this will not have Labels in it - these were written to effectiveLabels.
			test.UpdateSource(t, tc.programPath+"/imported-program")
			test.Up(t)

			finalState := test.ExportStack(t)
			finalLabels := extractFieldFromState(t, finalState, resourceUrn, "labels")

			// The resource labels should be empty
			require.Empty(
				t,
				finalLabels,
				"Bucket will have no labels after typical import and update since they were not imported.")
		})
	}
}

func TestFirestoreBackupScheduleNoPermadiff(t *testing.T) {
	pt := pulumiTest(t, "test-programs/firestore-backup-schedule")
	pt.Up(t)
	pt.Preview(t, optpreview.ExpectNoChanges())
}

func TestPAMEntitlementPermadiffRegress2167(t *testing.T) {
	pt := pulumiTest(t, "test-programs/pam-entitlement", opttest.DownloadProviderVersion("random", "4.16.3"))

	proj := getProject()
	pt.SetConfig(t, "gcpProj", proj)
	pt.Up(t)
	pt.Preview(t, optpreview.ExpectNoChanges())
}

func TestFirestoreFieldPermadiffRegress2166(t *testing.T) {
	pt := pulumiTest(t, "test-programs/firestore-field")

	proj := getProject()
	pt.SetConfig(t, "gcpProj", proj)
	pt.Up(t)
	pt.Preview(t, optpreview.ExpectNoChanges())
}

func TestFirestoreDatabaseAutoname(t *testing.T) {
	pt := pulumiTest(t, "test-programs/firestore-db-autoname")
	proj := getProject()
	pt.SetConfig(t, "gcpProj", proj)
	pt.Up(t)
}

func TestEmptyLabels(t *testing.T) {
	tests := []struct {
		program   string
		upOutputs autogold.Value
	}{
		{"empty-label", autogold.Expect(auto.OutputMap{
			"effectiveLabels": auto.OutputValue{
				Value: map[string]interface{}{
					"empty":                   "",
					"goog-pulumi-provisioned": "true",
					"static":                  "value",
				},
				Secret: true,
			},
			"labels": auto.OutputValue{Value: map[string]interface{}{
				"empty":  "",
				"static": "value",
			}},
			"pulumiLabels": auto.OutputValue{
				Value: map[string]interface{}{
					"empty":                   "",
					"goog-pulumi-provisioned": "true",
					"static":                  "value",
				},
				Secret: true,
			},
		})},
		{"empty-alone-label", autogold.Expect(auto.OutputMap{
			"effectiveLabels": auto.OutputValue{
				Value: map[string]interface{}{
					"empty":                   "",
					"goog-pulumi-provisioned": "true",
				},
				Secret: true,
			},
			"labels": auto.OutputValue{Value: map[string]interface{}{"empty": ""}},
			"pulumiLabels": auto.OutputValue{
				Value: map[string]interface{}{
					"empty":                   "",
					"goog-pulumi-provisioned": "true",
				},
				Secret: true,
			},
		})},
		{"empty-default-label", autogold.Expect(auto.OutputMap{
			"effectiveLabels": auto.OutputValue{
				Value: map[string]interface{}{
					"empty-default":           "",
					"goog-pulumi-provisioned": "true",
					"static":                  "value",
				},
				Secret: true,
			},
			"labels": auto.OutputValue{Value: map[string]interface{}{"static": "value"}},
			"pulumiLabels": auto.OutputValue{
				Value: map[string]interface{}{
					"empty-default":           "",
					"goog-pulumi-provisioned": "true",
					"static":                  "value",
				},
				Secret: true,
			},
		})},
		{
			// Cluster overloads the labels field and instead uses resourceLabels for GCP labels.
			"empty-label-cluster",
			autogold.Expect(auto.OutputMap{
				"effectiveLabels": auto.OutputValue{
					Value: map[string]interface{}{
						"environment":             "dev",
						"goog-pulumi-provisioned": "true",
						"test":                    "",
					},
					Secret: true,
				},
				"labels": auto.OutputValue{Value: map[string]interface{}{
					"environment": "dev",
					"test":        "",
				}},
				"pulumiLabels": auto.OutputValue{
					Value: map[string]interface{}{
						"environment":             "dev",
						"goog-pulumi-provisioned": "true",
						"test":                    "",
					},
					Secret: true,
				},
			}),
		},
	}

	for _, tt := range tests {
		tt := tt

		t.Run(tt.program, func(t *testing.T) {
			pt := pulumiTest(t, "test-programs/"+tt.program)
			proj := getProject()
			pt.SetConfig(t, "gcpProj", proj)

			upResult := pt.Up(t, optup.SuppressProgress())
			tt.upOutputs.Equal(t, upResult.Outputs)

			pt.Preview(t, optpreview.ExpectNoChanges())

			// Refresh against upstream labels
			pt.Refresh(t)

			pt.Refresh(t, optrefresh.ExpectNoChanges())

			// We should expect that we refresh cleanly
			pt.Preview(t, optpreview.ExpectNoChanges())
		})
	}
}

// TestUnmanagedEmptyLabels currently acts as a regression test. It ensures that behavior
// doesn't get worse.
//
// We would prefer the obvious behavior patter:
//
// $ pulumi up --yes
// $ pulumi refresh --yes # Retrieves labels from GCP
// $ pulumi preview --expect-no-changes
//
// Improvement tracked in <https://github.com/pulumi/pulumi-gcp/issues/2390>.
func TestUnmanagedEmptyLabels(t *testing.T) {
	t.Skip("Blocked by https://github.com/pulumi/pulumi/issues/20496")
	pt := pulumiTest(t, "test-programs/empty-unmanaged-label")
	proj := getProject()
	pt.SetConfig(t, "gcpProj", proj)

	previewResult := pt.Preview(t, optpreview.SuppressProgress())
	autogold.Expect(`
    effectiveLabels: [secret]
    pulumiLabels   : [secret]

Resources:
    + 3 to create

`).Equal(t, strings.Split(previewResult.StdOut, "Outputs:")[1])

	upResult := pt.Up(t)
	autogold.Expect(auto.OutputMap{
		"effectiveLabels": auto.OutputValue{
			Value:  map[string]interface{}{"goog-pulumi-provisioned": "true"},
			Secret: true,
		},
		"labels": auto.OutputValue{},
		"pulumiLabels": auto.OutputValue{
			Value:  map[string]interface{}{"goog-pulumi-provisioned": "true"},
			Secret: true,
		},
	}).Equal(t, upResult.Outputs)

	pt.Preview(t, optpreview.ExpectNoChanges())

	// Refresh against upstream labels
	pt.Refresh(t) // This doesn't actually include a diff, but it does change state.

	upResult = pt.Up(t) // This changes state, even though it should refresh cleanly.
	autogold.Expect(auto.OutputMap{
		"effectiveLabels": auto.OutputValue{
			Value: map[string]interface{}{
				"goog-pulumi-provisioned": "true",
				"unmanaged":               "value",
				"unmanaged_empty":         "",
			},
			Secret: true,
		},
		"labels": auto.OutputValue{Value: map[string]interface{}{}},
		"pulumiLabels": auto.OutputValue{
			Value:  map[string]interface{}{"goog-pulumi-provisioned": "true"},
			Secret: true,
		},
	}).Equal(t, upResult.Outputs)

	// We should expect that we refresh cleanly
	pt.Preview(t, optpreview.ExpectNoChanges())
}

func TestBigqueryMaterializedViewReplace(t *testing.T) {
	pt := pulumiTest(t, "test-programs/bigquery-table-materialized-view")
	pt.SetConfig(t, "gcpProj", getProject())
	query1 := "SELECT * FROM ${defaultTable.datasetId}.${defaultTable.tableId}"
	query2 := "SELECT * FROM ${defaultTable.datasetId}.${defaultTable.tableId} WHERE " +
		"${defaultTable.tableId}.state = 'value'"

	pulumiYAMLContents := pt.ReadPulumiYaml(t)

	// replace query manually to avoid issues with variable interpolation
	pulumiYAMLContents1 := strings.ReplaceAll(pulumiYAMLContents, "<QUERY>", query1)
	pt.WritePulumiYaml(t, pulumiYAMLContents1)
	pt.Up(t)

	// replace query manually to avoid issues with variable interpolation
	pulumiYAMLContents2 := strings.ReplaceAll(pulumiYAMLContents, "<QUERY>", query2)
	pt.WritePulumiYaml(t, pulumiYAMLContents2)
	pt.Up(t)
}

func TestSecurityPolicy(t *testing.T) {
	pt := pulumiTest(t, "test-programs/security-policy/security-policy-1")
	pt.Up(t)

	program2, err := os.ReadFile("test-programs/security-policy/Pulumi.yaml")
	require.NoError(t, err)
	pt.WritePulumiYaml(t, string(program2))

	res := pt.Preview(t)
	require.NotContains(t, res.StdOut, "Failed to calculate preview")
}
