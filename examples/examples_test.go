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
	"io/ioutil"
	"net/http"
	"os"
	"path"
	"path/filepath"
	"testing"
	"time"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccMinimal(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "minimal"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccServerless(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           path.Join(getCwd(t), "serverless"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, "Hello World!", body)
			}),
		})

	integration.ProgramTest(t, &test)
}

func TestAccBucket(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           path.Join(getCwd(t), "bucket"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccTopic(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           path.Join(getCwd(t), "topic"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccLoadbalancer(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "loadbalancer"),
			// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
			// running the refresh step for now.
			SkipRefresh:   true,
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccWebserver(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "webserver"),
			// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
			// running the refresh step for now.
			SkipRefresh:   true,
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccMinimalPy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "minimal-py"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccBucketPy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           path.Join(getCwd(t), "bucket-py"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccDatasourcePy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           path.Join(getCwd(t), "datasource-py"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccAppServiceCs(t *testing.T) {
	test := getCSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "serverless-cs"),
			// One change is known to occur during refresh of the resources in this example:
			// BucketObject has a source change
			ExpectRefreshChanges: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "Hello World!")
			}),
		})

	integration.ProgramTest(t, &test)
}

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

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/gcp",
		},
	})

	return baseJS
}

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	pythonBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return pythonBase
}

func getCSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	csharpBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.Gcp",
		},
	})

	return csharpBase
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
