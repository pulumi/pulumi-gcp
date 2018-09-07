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
	"os"
	"path"
	"testing"

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

	examples := []integration.ProgramTestOptions{
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "minimal")}),
	}
	if !testing.Short() {
		examples = append(examples, []integration.ProgramTestOptions{
			base.With(integration.ProgramTestOptions{
				Dir: path.Join(cwd, "loadbalancer"),
				// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
				// running the refresh step for now.
				SkipRefresh: true,
			}),
			base.With(integration.ProgramTestOptions{
				Dir: path.Join(cwd, "serverless"),
				// One change is known to occur during refresh of the resources in this example:
				// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
				ExpectRefreshChanges: true,
			}),
			base.With(integration.ProgramTestOptions{
				Dir: path.Join(cwd, "webserver"),
				// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
				// running the refresh step for now.
				SkipRefresh: true,
			}),
		}...)
	}

	for _, ex := range examples {
		example := ex
		t.Run(example.Dir, func(t *testing.T) {
			integration.ProgramTest(t, &example)
		})
	}
}

func createEditDir(dir string) integration.EditDir {
	return integration.EditDir{Dir: dir, ExtraRuntimeValidation: nil}
}
