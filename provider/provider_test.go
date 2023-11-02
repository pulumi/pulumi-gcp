// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"fmt"
	"os"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/flags"
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
		providertest.WithResourceProviderServer(providerServer(t)))

	return providertest.NewProviderTest(dir, opts...)
}

// This funcion inlines bits of ProviderTest.Run to avoid running E2E tests and instead focuses on
// upgrade tests. Currently E2E tests are not able to run in this provider.
func runTest(t *testing.T, pt *providertest.ProviderTest) {
	t.Run("upgrade-snapshot", func(t *testing.T) {
		t.Helper()
		if flags.Snapshot.IsSet() {
			t.Logf("Recording baseline behavior because %s", flags.Snapshot.WhySet())
			pt.VerifyUpgradeSnapshot(t)
		} else {
			t.Skipf("Skip recording baseline behavior because %s", flags.Snapshot.WhyNotSet())
		}
	})
	for _, m := range providertest.UpgradeTestModes() {
		t.Run(fmt.Sprintf("upgrade-%s", m), func(t *testing.T) {
			t.Helper()
			if m == providertest.UpgradeTestMode_Quick {
				t.Skip("TODO[pulumi/providertest#28] Skipping Quick mode because of panics and implicit dependency on Configure")
			}
			pt.VerifyUpgrade(t, m)
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
