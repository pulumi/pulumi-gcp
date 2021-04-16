// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
// +build dotnet all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/assert"
)

func getCSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	csharpBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.Gcp",
		},
	})

	return csharpBase
}

func TestAccAppServiceCs(t *testing.T) {
	test := getCSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "serverless-cs"),
			// One change is known to occur during refresh of the resources in this example:
			// BucketObject has a source change
			ExpectRefreshChanges: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "Hello World!")
			}),
		})

	integration.ProgramTest(t, &test)
}
