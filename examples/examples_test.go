// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package examples

import (
	"context"
	"io/ioutil"
	"net/http"
	"os"
	"testing"
	"time"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	gcp "github.com/pulumi/pulumi-gcp/provider/v7"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	testutils "github.com/pulumi/pulumi-terraform-bridge/testing/x"
	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func skipIfShort(t *testing.T) {
	if testing.Short() {
		t.Skip("skipping long-running test in short mode")
	}
}

func getProject(t *testing.T) string {
	project := os.Getenv("GOOGLE_PROJECT")
	if project == "" {
		t.Skipf("Skipping test due to missing GOOGLE_PROJECT environment variable")
	}

	return project
}

func getZone(t *testing.T) string {
	zone := os.Getenv("GOOGLE_ZONE")
	if zone == "" {
		t.Skipf("Skipping test due to missing GOOGLE_ZONE environment variable")
	}

	return zone
}

func getRegion(t *testing.T) string {
	region := os.Getenv("GOOGLE_REGION")
	if region == "" {
		t.Skipf("Skipping test due to missing GOOGLE_REGION environment variable")
	}

	return region
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	project := getProject(t)
	zone := getZone(t)
	region := getRegion(t)
	return integration.ProgramTestOptions{
		Config: map[string]string{
			"gcp:config:project": project,
			"gcp:config:zone":    zone,
			"gcp:config:region":  region,
		},
	}
}

func validateAPITest(isValid func(body string)) func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
	return func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
		var resp *http.Response
		var err error
		url := stack.Outputs["url"].(string)
		// Retry a couple times on 5xx
		for i := 0; i <= 5; i++ {
			resp, err = http.Get(url)
			if !assert.NoError(t, err) {
				return
			}
			if resp.StatusCode < 500 {
				break
			}
			time.Sleep(1 * time.Minute)
		}
		defer resp.Body.Close()
		body, err := ioutil.ReadAll(resp.Body)
		assert.NoError(t, err)
		isValid(string(body))
	}
}

func TestBucketBooleanLabel(t *testing.T) {
	replay(t, `[
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
		"metadata": {
			"kind": "resource",
			"mode": "client",
			"name": "gcp"
		}
	}
]`)
}

func replay(t *testing.T, sequence string) {
	info := gcp.Provider()
	ctx := context.Background()
	p, err := pfbridge.MakeMuxedServer(ctx, info.Name, info,
		/*
		 * We leave the schema blank. This will result in incorrect calls to
		 * GetSchema, but otherwise does not effect the provider. It reduces the
		 * time to test start by minutes.
		 */
		[]byte("{}"),
	)(nil)
	require.NoError(t, err)
	testutils.ReplaySequence(t, p, sequence)
}
