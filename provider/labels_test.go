// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp_test

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	gcp "github.com/pulumi/pulumi-gcp/provider/v9"
	"github.com/pulumi/pulumi-gcp/provider/v9/pkg/version"
)

func init() { version.Version = "7.0.0" }

func TestFixLabelNames(t *testing.T) {
	p := gcp.Provider()

	// This resource was chosen at random to confirm that the change is applied as
	// expected.
	if r := p.Resources["google_active_directory_domain"]; assert.NotZero(t, r) {
		assert.Equal(t, "pulumiLabels", r.Fields["terraform_labels"].Name)
	}

	if r := p.Resources["google_cloud_run_domain_mapping"]; assert.NotZero(t, r) {
		assert.Equal(t, "pulumiLabels", r.Fields["metadata"].Elem.Fields["terraform_labels"].Name)
	}
}

func TestNoTFLabelsInSchema(t *testing.T) {
	schema, err := os.ReadFile(filepath.Join(".", "cmd", "pulumi-resource-gcp", "schema.json"))
	require.NoError(t, err)

	assert.NotContains(t, string(schema), "terraformLabels")
}
