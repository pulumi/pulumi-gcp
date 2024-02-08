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
	isRetryable := func(t *testing.T, resp *http.Response) bool {
		// The infra may return 5xx before it has finished provisioning.
		if resp.StatusCode >= 500 {
			t.Logf("validateAPITest: retrying HTTP %v", resp.StatusCode)
			return true
		}
		// HttpCallbackFunction may 404 before code provisioning is fully completed.
		if resp.StatusCode == 404 {
			t.Logf("validateAPITest: retrying HTTP %v", resp.StatusCode)
			return true
		}
		return false
	}
	return func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
		var resp *http.Response
		var err error
		url := stack.Outputs["url"].(string)
		for _, sleepInterval := range retrySchedule {
			resp, err = http.Get(url)
			if !assert.NoError(t, err) {
				return
			}
			if !isRetryable(t, resp) {
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
