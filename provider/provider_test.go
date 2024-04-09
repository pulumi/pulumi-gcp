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
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
)

const (
	providerName           = "gcp"
	defaultBaselineVersion = "6.67.0"
	testProject            = "pulumi-development"
)

func getProject() string {
	proj := os.Getenv("GOOGLE_PROJECT")
	if proj == "" {
		proj = testProject
	}
	return proj
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

type UpgradeTestOpts struct {
	baselineVersion     string
	assertFunc          func(*testing.T, auto.PreviewResult)
	config              map[string]string
	additionalProviders map[string]string
}

func WithBaselineVersion(baselineVersion string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.baselineVersion = baselineVersion
	}
}

func WithAssertFunc(assertFunc func(*testing.T, auto.PreviewResult)) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.assertFunc = assertFunc
	}
}

func WithConfig(config map[string]string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.config = config
	}
}

func WithAdditionalProvider(provider, version string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		if opts.additionalProviders == nil {
			opts.additionalProviders = map[string]string{}
		}
		opts.additionalProviders[provider] = version
	}
}

func testProviderUpgrade(t *testing.T, dir string, opts ...func(*UpgradeTestOpts)) {
	options := &UpgradeTestOpts{}
	for _, o := range opts {
		o(options)
	}
	testProviderUpgradeWithConfig(t, dir, options.baselineVersion, options.config, options.assertFunc,
		options.additionalProviders)
}

func testProviderUpgradeWithConfig(
	t *testing.T, dir, baselineVersion string, config map[string]string,
	assertFunction func(*testing.T, auto.PreviewResult), additionalProviders map[string]string,
) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	if baselineVersion == "" {
		baselineVersion = defaultBaselineVersion
	}
	opts := []opttest.Option{
		opttest.DownloadProviderVersion(providerName, baselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	}
	for prov, version := range additionalProviders {
		opts = append(opts, opttest.DownloadProviderVersion(prov, version))
	}
	test := pulumitest.NewPulumiTest(t, dir, opts...)
	test.SetConfig("gcp:config:project", testProject)
	for k, v := range config {
		test.SetConfig(k, v)
	}
	// The SetConfig above does not seem to be working here.
	t.Setenv("PULUMI_GCP_SKIP_REGION_VALIDATION", "true")
	result := providertest.PreviewProviderUpgrade(test, providerName, baselineVersion, optproviderupgrade.DisableAttach())
	if assertFunction != nil {
		assertFunction(t, result)
	} else {
		assertpreview.HasNoReplacements(t, result)
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
