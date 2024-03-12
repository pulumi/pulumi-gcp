// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/providertest/replay"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
)

const (
	providerName           = "gcp"
	defaultBaselineVersion = "6.67.0"
	testProject            = "pulumi-development"
)

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir, baselineVersion string) {
	testProviderUpgradeWithConfig(t, dir, baselineVersion, nil)
}

func testProviderUpgradeWithConfig(t *testing.T, dir, baselineVersion string, config map[string]string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	if baselineVersion == "" {
		baselineVersion = defaultBaselineVersion
	}
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, baselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	test.SetConfig("gcp:config:project", testProject)
	for k, v := range config {
		test.SetConfig(k, v)
	}
	// The SetConfig above does not seem to be working here.
	t.Setenv("PULUMI_GCP_SKIP_REGION_VALIDATION", "true")
	result := providertest.PreviewProviderUpgrade(test, providerName, baselineVersion, optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
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

func TestRepro1794(t *testing.T) {
	replay.ReplaySequence(t, providerServer(t), `
[
    {
        "method": "/pulumirpc.ResourceProvider/Configure",
        "request": {
            "variables": {
                "gcp:config:defaultLabels": "{\"hi\":\"value\"}",
                "gcp:config:project": "pulumi-development",
                "gcp:config:region": "us-west1"
            },
            "args": {
                "defaultLabels": "{\"hi\":\"value\"}",
                "project": "pulumi-development",
                "region": "us-west1",
                "version": "6.67.0"
            },
            "acceptSecrets": true,
            "acceptResources": true,
            "sendsOldInputs": true,
            "sendsOldInputsToDelete": true
        },
        "response": {
            "supportsPreview": true
        },
        "metadata": {
            "kind": "resource",
            "mode": "client",
            "name": "gcp"
        }
    },
    {
        "method": "/pulumirpc.ResourceProvider/Diff",
        "request": {
            "id": "locations/us-central1/namespaces/pulumi-development/services/b-476c751",
            "urn": "urn:pulumi:dev::dev-yaml::gcp:cloudrun/service:Service::b",
            "olds": {
                "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":1200000000000,\"delete\":1200000000000,\"update\":1200000000000},\"schema_version\":\"2\"}",
                "autogenerateRevisionName": false,
                "id": "locations/us-central1/namespaces/pulumi-development/services/b-476c751",
                "location": "us-central1",
                "metadata": {
                    "annotations": {},
                    "effectiveAnnotations": {
                        "run.googleapis.com/ingress": "all",
                        "run.googleapis.com/ingress-status": "all",
                        "run.googleapis.com/operation-id": "bd6f4ceb-4105-4aac-a48b-2ab3ee98440f",
                        "serving.knative.dev/creator": "ian@pulumi.com",
                        "serving.knative.dev/lastModifier": "ian@pulumi.com"
                    },
                    "effectiveLabels": {
                        "cloud.googleapis.com/location": "us-central1",
                        "hi": "value"
                    },
                    "generation": 1,
                    "labels": {},
                    "namespace": "pulumi-development",
                    "pulumiLabels": {
                        "hi": "value"
                    },
                    "resourceVersion": "AAYTd5Ym10g",
                    "selfLink": "/apis/serving.knative.dev/v1/namespaces/921927215178/services/b-476c751",
                    "uid": "de263b8f-bb83-457f-9cb9-fe0e04657a6a"
                },
                "name": "b-476c751",
                "project": "pulumi-development",
                "statuses": [
                    {
                        "conditions": [
                            {
                                "message": "",
                                "reason": "",
                                "status": "True",
                                "type": "Ready"
                            },
                            {
                                "message": "",
                                "reason": "",
                                "status": "True",
                                "type": "ConfigurationsReady"
                            },
                            {
                                "message": "",
                                "reason": "",
                                "status": "True",
                                "type": "RoutesReady"
                            }
                        ],
                        "latestCreatedRevisionName": "b-476c751-00001-rbp",
                        "latestReadyRevisionName": "b-476c751-00001-rbp",
                        "observedGeneration": 1,
                        "traffics": [
                            {
                                "latestRevision": true,
                                "percent": 100,
                                "revisionName": "b-476c751-00001-rbp",
                                "tag": "",
                                "url": ""
                            }
                        ],
                        "url": "https://b-476c751-ctnulmzwoa-uc.a.run.app"
                    }
                ],
                "template": {
                    "metadata": {
                        "annotations": {
                            "autoscaling.knative.dev/maxScale": "100",
                            "run.googleapis.com/cloudsql-instances": "instance:aeoi:zoi"
                        },
                        "generation": 0,
                        "labels": {
                            "run.googleapis.com/startupProbeType": "Default"
                        },
                        "name": "",
                        "namespace": "",
                        "resourceVersion": "",
                        "selfLink": "",
                        "uid": ""
                    },
                    "spec": {
                        "containerConcurrency": 80,
                        "containers": [
                            {
                                "args": [],
                                "commands": [],
                                "envFroms": [],
                                "envs": [],
                                "image": "gcr.io/cloudrun/hello",
                                "livenessProbe": null,
                                "name": "",
                                "ports": [
                                    {
                                        "containerPort": 8080,
                                        "name": "http1",
                                        "protocol": ""
                                    }
                                ],
                                "resources": {
                                    "limits": {
                                        "cpu": "1000m",
                                        "memory": "512Mi"
                                    },
                                    "requests": {}
                                },
                                "startupProbe": {
                                    "failureThreshold": 1,
                                    "grpc": null,
                                    "httpGet": null,
                                    "initialDelaySeconds": 0,
                                    "periodSeconds": 240,
                                    "tcpSocket": {
                                        "port": 8080
                                    },
                                    "timeoutSeconds": 240
                                },
                                "volumeMounts": [],
                                "workingDir": ""
                            }
                        ],
                        "serviceAccountName": "921927215178-compute@developer.gserviceaccount.com",
                        "servingState": "",
                        "timeoutSeconds": 300,
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
                    "autogenerateRevisionName",
                    "name"
                ],
                "autogenerateRevisionName": false,
                "location": "us-central1",
                "name": "b-476c751",
                "template": {
                    "__defaults": [],
                    "metadata": {
                        "__defaults": [],
                        "annotations": {
                            "run.googleapis.com/cloudsql-instances": "instance:aeoi:zoi"
                        }
                    },
                    "spec": {
                        "__defaults": [],
                        "containers": [
                            {
                                "__defaults": [],
                                "image": "gcr.io/cloudrun/hello"
                            }
                        ]
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
                    "autogenerateRevisionName",
                    "name"
                ],
                "autogenerateRevisionName": false,
                "location": "us-central1",
                "name": "b-476c751",
                "template": {
                    "__defaults": [],
                    "metadata": {
                        "__defaults": [],
                        "annotations": {
                            "run.googleapis.com/cloudsql-instances": "instance:aeoi:zoi"
                        }
                    },
                    "spec": {
                        "__defaults": [],
                        "containers": [
                            {
                                "__defaults": [],
                                "image": "gcr.io/cloudrun/hello"
                            }
                        ]
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
            "hasDetailedDiff": true,
            "stables": "*",
            "changes": "DIFF_SOME",
            "diffs": [
                "template"
            ],
            "detailedDiff": {
                "template.metadata.annotations": {
                    "kind": "UPDATE"
                }
            }
        },
        "metadata": {
            "kind": "resource",
            "mode": "client",
            "name": "gcp"
        }
    }
]`)
}
