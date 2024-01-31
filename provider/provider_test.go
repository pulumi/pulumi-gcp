// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"

	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

const (
	providerName           = "gcp"
	defaultBaselineVersion = "6.67.0"
	testProject            = "pulumi-development"
)

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir, baselineVersion string) {
	testProviderUpgradeWithConfig(t, dir, baselineVersion, nil)
}

func testProviderUpgradeWithConfig(t *testing.T, dir, baselineVersion string, config map[string]string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	if baselineVersion == "" {
		baselineVersion = defaultBaselineVersion
	}
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, baselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	test.SetConfig("gcp:config:project", testProject)
	test.SetConfig("gcp:config:skipRegionValidation", "true")
	if config != nil {
		for k, v := range config {
			test.SetConfig(k, v)
		}
	}
	result := providertest.PreviewProviderUpgrade(test, providerName, baselineVersion, optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
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
