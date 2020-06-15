// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
// +build python all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
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

func TestAccLoadbalancer(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "loadbalancer"),
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
			Dir:           path.Join(getCwd(t), "topic"),
			RunUpdateTest: true,
			// One change is known to occur during refresh of the resources in this example:
			// * `~  gcp:storage:Bucket f-bucket updated changes: + websites`
			ExpectRefreshChanges: true,
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
