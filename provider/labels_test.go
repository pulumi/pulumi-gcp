// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp_test

import (
	"testing"

	"github.com/stretchr/testify/assert"

	gcp "github.com/pulumi/pulumi-gcp/provider/v7"
	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
)

func init() { version.Version = "7.0.0" }

func TestFixLabelNames(t *testing.T) {
	p := gcp.Provider()

	// This resource was chosen at random to confirm that the change is applied as
	// expected.
	if r := p.Resources["google_active_directory_domain"]; assert.NotZero(t, r) {
		assert.Equal(t, "pulumiLabels", r.Fields["terraform_labels"].Name)
	}
}
