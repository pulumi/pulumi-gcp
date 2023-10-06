// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	ptest "github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-gcp/provider/v6/pkg/version"
)

func TestProviderUpgrade(t *testing.T) {

	type testCase struct {
		program string
	}

	testCases := []testCase{
		{"dns-recordset"},
		{"pubsub-subscription"},
		{"pubsub-topic"},
		{"serviceaccount-account"},
		{"storage-bucket"},
		{"storage-bucketobject"},
	}

	test := func(t *testing.T, tc testCase) {
		ptest.VerifyUpgrade(t).
			WithProviderName("gcp").
			WithBaselineVersion("6.67.0").
			WithProgram(filepath.Join("test-programs", tc.program)).
			WithResourceProviderServer(providerServer(t)).
			WithConfig("gcp:project", "pulumi-development").
			Run()
	}

	for _, tc := range testCases {
		tc := tc
		t.Run(tc.program, func(t *testing.T) {
			test(t, tc)
		})
	}
}

func providerServer(t *testing.T) pulumirpc.ResourceProviderServer {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()
	p, err := pfbridge.MakeMuxedServer(ctx, info.Name, info,
		/*
		 * We leave the schema blank. This will result in incorrect calls to
		 * GetSchema, but otherwise does not effect the provider. It reduces the
		 * time to test start by minutes.
		 */
		[]byte("{}"),
	)(nil)
	require.NoError(t, err)
	return p
}
