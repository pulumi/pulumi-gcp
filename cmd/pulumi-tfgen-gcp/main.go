// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package main

import (
	gcp "github.com/pulumi/pulumi-gcp"
	"github.com/pulumi/pulumi-gcp/pkg/version"
	"github.com/pulumi/pulumi-terraform/pkg/tfgen"
)

func main() {
	tfgen.Main("gcp", version.Version, gcp.Provider())
}
