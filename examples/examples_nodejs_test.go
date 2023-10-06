// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/assert"
)

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/gcp",
		},
	})

	return baseJS
}

func TestAccWebserverNode(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "webserver"),
			// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
			// running the refresh step for now.
			SkipRefresh:   true,
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccLoadbalancer(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "loadbalancer"),
			// TODO[pulumi/pulumi-terraform#241] This test currently triggers a bug in refresh, so we'll skip
			// running the refresh step for now.
			SkipRefresh:   true,
			RunUpdateTest: true,
			SkipPreview:   true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccTopic(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "topic"),
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccBucket(t *testing.T) {
	t.Skip("Skipping due to high failure rates. See pulumi/pulumi-gcp#1267")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "bucket"),
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
			// GCP buckets seem to be eventually consistent, so we need to retry on failure when deploying a cloud function
			// that uses the bucket as a trigger.
			RetryFailedSteps: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccMinimal(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "minimal"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccServerless(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "serverless"),
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, "Hello World!", body)
			}),
		})

	integration.ProgramTest(t, &test)
}
