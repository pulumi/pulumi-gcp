// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

package main

import (
	gcp "github.com/pulumi/pulumi-gcp"
	"github.com/pulumi/pulumi-gcp/pkg/version"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
)

func main() {
	tfbridge.Main("gcp", version.Version, gcp.Provider())
}
