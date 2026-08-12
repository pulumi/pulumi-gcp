// Copyright 2016-2026, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"encoding/json"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

// A syntactically valid, cryptographically meaningless JWT. Upstream validates
// identity_token with ValidateJWT, which requires exactly three non-empty base64url
// segments; it does not verify the signature.
//
//nolint:gosec // Not a credential: three base64url segments that decode to nothing useful.
const testIdentityToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9." +
	"eyJhdWQiOiIvL2lhbS5nb29nbGVhcGlzLmNvbS8iLCJzdWIiOiJwdWx1bWkifQ." +
	"bm90LWEtcmVhbC1zaWduYXR1cmU"

// checkConfigEnvVars is every environment variable that can influence CheckConfig for
// this provider, whether through tfbridge.DefaultInfo.EnvVars in resources.go or through
// tfbridge.ConfigStringValue lookups in preConfigureCallbackWithLogger.
//
// Clearing the project variables is load bearing rather than cosmetic. If project
// resolves to a non-empty value then preConfigureCallbackWithLogger calls
// config.LoadAndValidate, and CheckConfig fails on missing credentials before the
// provider configuration is ever encoded, which is the code path under test here. CI
// sets GOOGLE_PROJECT.
var checkConfigEnvVars = []string{
	"GOOGLE_PROJECT", "GOOGLE_CLOUD_PROJECT", "GCLOUD_PROJECT", "CLOUDSDK_CORE_PROJECT",
	"GOOGLE_REGION", "GCLOUD_REGION", "CLOUDSDK_COMPUTE_REGION",
	"GOOGLE_ZONE", "GCLOUD_ZONE", "CLOUDSDK_COMPUTE_ZONE",
	"GOOGLE_CREDENTIALS", "GOOGLE_CLOUD_KEYFILE_JSON", "GCLOUD_KEYFILE_JSON",
	"GOOGLE_APPLICATION_CREDENTIALS", "GOOGLE_OAUTH_ACCESS_TOKEN",
	"GOOGLE_IMPERSONATE_SERVICE_ACCOUNT",
}

// TestCheckConfigExternalCredentials is a regression test for
// https://github.com/pulumi/pulumi-gcp/issues/3869.
//
// external_credentials is declared upstream as an SDKv2 TypeList block with
// MaxItems: 1, so tfgen flattens it and the Pulumi schema types externalCredentials as
// an object. The duplicated Plugin Framework provider schema declares the same block as
// a bare schema.ListNestedBlock. The bridge can only recover MaxItems for a Plugin
// Framework block by matching a size validator's description, so without
// listvalidator.SizeAtMost(1) the Plugin Framework side of the muxed server builds a
// plain list encoder and rejects the object the SDKs actually send:
//
//	cannot encode provider configuration to call ValidateProviderConfig:
//	objectEncoder failed on property "external_credentials": Expected an Array PropertyValue
//
// Note the sibling batching block has the same SDKv2/Plugin Framework asymmetry but does
// not reproduce this: its value is silently dropped on the Plugin Framework encode path
// rather than encoded, so both object and list shapes are accepted today. It is
// deliberately not covered here.
func TestCheckConfigExternalCredentials(t *testing.T) {
	// Do not call t.Parallel: this test uses t.Setenv.
	for _, envVar := range checkConfigEnvVars {
		t.Setenv(envVar, "")
	}

	externalCredentials := resource.PropertyMap{
		"audience":            resource.NewStringProperty("//iam.googleapis.com/"),
		"identityToken":       resource.NewStringProperty(testIdentityToken),
		"serviceAccountEmail": resource.NewStringProperty("pulumi@pulumi.iam.gserviceaccount.com"),
	}

	news, err := plugin.MarshalProperties(resource.PropertyMap{
		"version": resource.NewStringProperty("0.0.1"),
		// Suppresses the "no project configured" warning from
		// preConfigureCallbackWithLogger. ExtraConfig keys are exempt from the Plugin
		// Framework unknown-key check, so this is not a CheckFailure.
		"disableGlobalProjectWarning": resource.NewBoolProperty(true),
		"externalCredentials":         resource.NewObjectProperty(externalCredentials),
	}, plugin.MarshalOptions{})
	require.NoError(t, err)

	response, err := providerServer(t).CheckConfig(context.Background(), &pulumirpc.CheckRequest{
		Urn:  "urn:pulumi:dev::gcp-3869::pulumi:providers:gcp::provider",
		News: news,
	})
	// Without the upstream patch this fails inside the Plugin Framework half of the
	// muxed server with "Expected an Array PropertyValue".
	require.NoError(t, err)
	require.Empty(t, response.GetFailures())

	// CheckConfig folds non-string provider configuration back into JSON strings, see
	// tfbridge.ConfigEncoding.FoldProperties.
	inputs, err := plugin.UnmarshalProperties(response.GetInputs(), plugin.MarshalOptions{})
	require.NoError(t, err)

	actual, ok := inputs["externalCredentials"]
	require.Truef(t, ok, "CheckConfig did not echo externalCredentials; got %v", inputs)
	require.Truef(t, actual.IsString(),
		"expected externalCredentials to be JSON-encoded back as a string, got %v", actual)

	expected, err := json.Marshal(externalCredentials.Mappable())
	require.NoError(t, err)
	require.JSONEq(t, string(expected), actual.StringValue())
}
