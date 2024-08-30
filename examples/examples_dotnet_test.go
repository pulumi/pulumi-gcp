// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build dotnet || all
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
		Config: map[string]string{
			"gcp:addPulumiAttributionLabel": "false",
		},
	})

	return csharpBase
}

func TestAccAppServiceCs(t *testing.T) {
	test := getCSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "serverless-cs"),
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "Hello World!")
			}),

			// TODO[pulumi/pulumi-gcp#1487] Non-empty diff when refreshing programs using overlay callbacks
			SkipRefresh: true,
		})

	integration.ProgramTest(t, &test)
}
