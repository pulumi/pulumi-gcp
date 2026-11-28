// Copyright 2016-2026, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"regexp"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

// GCP only accepts letters, numbers, underscores and periods in custom role IDs, so the
// auto-generated roleId must not use "-" as the separator before its random suffix.
func TestIAMCustomRoleAutoNamedRoleID(t *testing.T) {
	// Do not call t.Parallel: Provider() is not safe for concurrent use.
	server := providerServer(t)
	roleIDRegexp := regexp.MustCompile(`^[a-zA-Z0-9_\.]{3,64}$`)

	tests := []struct {
		name   string
		urn    string
		inputs resource.PropertyMap
	}{
		{
			name: "project",
			urn:  "urn:pulumi:test::test::gcp:projects/iAMCustomRole:IAMCustomRole::myRole",
			inputs: resource.PropertyMap{
				"project": resource.NewStringProperty("my-project"),
			},
		},
		{
			name: "organization",
			urn:  "urn:pulumi:test::test::gcp:organizations/iAMCustomRole:IAMCustomRole::myRole",
			inputs: resource.PropertyMap{
				"orgId": resource.NewStringProperty("123456789"),
			},
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			inputs := tt.inputs.Copy()
			inputs["title"] = resource.NewStringProperty("My Role")
			inputs["permissions"] = resource.NewArrayProperty([]resource.PropertyValue{
				resource.NewStringProperty("storage.objects.get"),
			})
			news, err := plugin.MarshalProperties(inputs, plugin.MarshalOptions{})
			require.NoError(t, err)

			response, err := server.Check(context.Background(), &pulumirpc.CheckRequest{
				Urn:        tt.urn,
				News:       news,
				RandomSeed: []byte("0123456789abcdef0123456789abcdef"),
			})
			require.NoError(t, err)
			require.Empty(t, response.GetFailures())

			checked, err := plugin.UnmarshalProperties(response.GetInputs(), plugin.MarshalOptions{})
			require.NoError(t, err)
			roleID, ok := checked["roleId"]
			require.Truef(t, ok && roleID.IsString(), "expected an auto-named roleId, got %v", checked)
			require.Regexp(t, roleIDRegexp, roleID.StringValue())
		})
	}
}
