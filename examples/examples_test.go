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
	"testing"
	"time"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func skipIfShort(t *testing.T) {
	if testing.Short() {
		t.Skip("skipping long-running test in short mode")
	}
}

func getProject() string {
	project := os.Getenv("GOOGLE_PROJECT")
	if project == "" {
		project="pulumi-development"
	}

	return project
}

func getZone() string {
	zone := os.Getenv("GOOGLE_ZONE")
	if zone == "" {
		zone="public"
	}

	return zone
}

func getRegion() string {
	region := os.Getenv("GOOGLE_REGION")
	if region == "" {
		region = "us-west1"
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
	return integration.ProgramTestOptions{
		Config: map[string]string{
			"gcp:config:project": getProject(),
			"gcp:config:zone":    getZone(),
			"gcp:config:region":  getRegion(),
		},
	}
}

func validateAPITest(isValid func(body string)) func(
	t *testing.T, stack integration.RuntimeValidationStackInfo,
) {
	retrySchedule := []time.Duration{
		5 * time.Second,
		10 * time.Second,
		20 * time.Second,
		40 * time.Second,
		80 * time.Second,
		160 * time.Second,
	}
	isRetryable := func(resp *http.Response) bool {
		// The infra may return 5xx before it has finished provisioning.
		if resp.StatusCode >= 500 {
			return true
		}
		// HttpCallbackFunction may 404 before code provisioning is fully completed.
		if resp.StatusCode == 404 {
			return true
		}
		return false
	}
	return func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
		t.Helper()
		var resp *http.Response
		var err error
		url := stack.Outputs["url"].(string)
		for _, sleepInterval := range retrySchedule {
			resp, err = http.Get(url)
			if !assert.NoError(t, err) {
				return
			}
			if isRetryable(resp) {
				t.Logf("validateAPITest: retrying HTTP %v", resp.StatusCode)
			} else {
				break
			}
			t.Logf("validateAPITest: backing off for %v", sleepInterval)
			time.Sleep(sleepInterval)
		}
		defer resp.Body.Close()
		body, err := ioutil.ReadAll(resp.Body)
		assert.NoError(t, err)
		isValid(string(body))
	}
}
