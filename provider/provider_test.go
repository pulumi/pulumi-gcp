// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"os"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func test(t *testing.T, dir string, opts ...providertest.Option) *providertest.ProviderTest {
	envVars := map[string]string{
		"gcp:config:project": "GOOGLE_PROJECT",
		"gcp:config:zone":    "GOOGLE_ZONE",
		"gcp:config:region":  "GOOGLE_REGION",
	}

	defaultValues := map[string]string{
		"gcp:config:project": "pulumi-development",
	}

	for setting, envVar := range envVars {
		if envVarValue, ok := os.LookupEnv(envVar); ok {
			opts = append(opts, providertest.WithConfig(setting, envVarValue))
		} else if defValue, ok := defaultValues[setting]; ok {
			opts = append(opts, providertest.WithConfig(setting, defValue))
		}
	}

	opts = append(opts,
		providertest.WithProviderName("gcp"),
		providertest.WithBaselineVersion("6.67.0"),
		providertest.WithResourceProviderServer(providerServer(t)),
		providertest.WithSkippedUpgradeTestMode(providertest.UpgradeTestMode_Quick,
			"TODO[pulumi/providertest#28] Skipping Quick mode because of panics and implicit dependency on Configure"),
	)

	return providertest.NewProviderTest(dir, opts...)
}

func runTest(t *testing.T, pt *providertest.ProviderTest) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	pt.Run(t)
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
