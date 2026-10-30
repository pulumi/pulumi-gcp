// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build dotnet || all
// +build dotnet all

package examples

import (
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
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
