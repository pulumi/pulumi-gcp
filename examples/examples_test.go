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

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestExamples(t *testing.T) {
	// Set the configurations.
	project := os.Getenv("GOOGLE_PROJECT")
	if project == "" {
		t.Skipf("Skipping test due to missing GOOGLE_PROJECT variable")
	}
	region := os.Getenv("GOOGLE_REGION")
	if region == "" {
		t.Skipf("Skipping test due to missing GOOGLE_REGION variable")
	}
	zone := os.Getenv("GOOGLE_ZONE")
	if zone == "" {
		t.Skipf("Skipping test due to missing GOOGLE_ZONE variable")
	}
	cwd, err := os.Getwd()
	if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
		return
	}

	// base options shared amongst all tests.
	base := integration.ProgramTestOptions{
		Config: map[string]string{
			"gcp:config:project": project,
			"gcp:config:zone":    zone,
			"gcp:config:region":  region,
		},
		Dependencies: []string{
			"@pulumi/gcp",
		},
	}

	jsBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/gcp",
		},
	})

	pythonBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	shortTests := []integration.ProgramTestOptions{
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "minimal")}),
		jsBase.With(integration.ProgramTestOptions{
			Dir:           path.Join(cwd, "serverless"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, "Hello World!", body)
			}),
		}),
		jsBase.With(integration.ProgramTestOptions{
			Dir:           path.Join(cwd, "bucket"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
		}),
		jsBase.With(integration.ProgramTestOptions{
			Dir:           path.Join(cwd, "topic"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
		}),
		pythonBase.With(integration.ProgramTestOptions{
			Dir: path.Join(cwd, "minimal-py"),
		}),
		pythonBase.With(integration.ProgramTestOptions{
			Dir:           path.Join(cwd, "bucket-py"),
			RunUpdateTest: true,
		}),
		pythonBase.With(integration.ProgramTestOptions{
			Dir:           path.Join(cwd, "datasource-py"),
			RunUpdateTest: true,
		}),
	}

	longTests := []integration.ProgramTestOptions{
		jsBase.With(integration.ProgramTestOptions{
			Dir: path.Join(cwd, "loadbalancer"),
			// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
			// running the refresh step for now.
			SkipRefresh:   true,
			RunUpdateTest: true,
		}),
		jsBase.With(integration.ProgramTestOptions{
			Dir: path.Join(cwd, "webserver"),
			// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
			// running the refresh step for now.
			SkipRefresh:   true,
			RunUpdateTest: true,
		}),
	}

	tests := shortTests
	if !testing.Short() {
		tests = append(tests, longTests...)
	}

	for _, ex := range tests {
		example := ex
		t.Run(filepath.Base(example.Dir), func(t *testing.T) {
			integration.ProgramTest(t, &example)
		})
	}
}

func createEditDir(dir string) integration.EditDir {
	return integration.EditDir{Dir: dir, ExtraRuntimeValidation: nil}
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
