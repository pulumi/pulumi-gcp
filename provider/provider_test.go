// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"os"
	"testing"

	_ "embed"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/providers"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-gcp/provider/v8/pkg/version"
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

//go:embed cmd/pulumi-resource-gcp/schema.json
var schemaBytes []byte

func providerFactory[T any](T) (pulumirpc.ResourceProviderServer, error) {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()
	return pfbridge.MakeMuxedServer(ctx, info.Name, info, schemaBytes)(nil)
}

func providerServer(t *testing.T) pulumirpc.ResourceProviderServer {
	p, err := providerFactory(t)
	require.NoError(t, err)
	return p
}

func pulumiTest(t *testing.T, dir string, opts ...opttest.Option) *pulumitest.PulumiTest {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	rpFactory := providers.ResourceProviderFactory(providerFactory)
	options := []opttest.Option{
		opttest.AttachProvider(providerName, rpFactory),
	}
	options = append(options, opts...)

	test := pulumitest.NewPulumiTest(t, dir, options...)

	googleProj := getProject()
	test.SetConfig(t, "gcp:config:project", googleProj)
	return test
}

func testUpgrade(t *testing.T, dir string, opts ...optproviderupgrade.PreviewProviderUpgradeOpt) auto.PreviewResult {
	t.Helper()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without cloud credentials")
		return auto.PreviewResult{}
	}

	// Provider factory allows the tests to run against an in-process provider.
	rpFactory := providers.ResourceProviderFactory(providerFactory)
	pt := pulumitest.NewPulumiTest(t, dir,
		opttest.AttachProvider(providerName, rpFactory))
	googleProj := getProject()
	pt.SetConfig(t, "gcp:config:project", googleProj)

	upgradeOpts := []optproviderupgrade.PreviewProviderUpgradeOpt{
		optproviderupgrade.DisableAttach(),
	}
	upgradeOpts = append(upgradeOpts, opts...)
	previewResult := providertest.PreviewProviderUpgrade(t, pt, providerName, defaultBaselineVersion, upgradeOpts...)

	assertpreview.HasNoReplacements(t, previewResult)
	assertpreview.HasNoDeletes(t, previewResult)
	return previewResult
}
