package examples

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/stretchr/testify/require"
)

type testProviderUpgradeOptions struct {
	baselineVersion string
	linkNodeSDK     bool
	installDeps     bool
	project         string
	region          string
	zone            string
	extraOpts       []opttest.Option
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir string, opts *testProviderUpgradeOptions) {
	skipIfShort(t)
	t.Parallel()
	t.Helper()

	providerName := "gcp"
	if opts == nil {
		project := os.Getenv("GOOGLE_PROJECT")
		if project == "" {
			project = "pulumi-development"
		}

		region := os.Getenv("GOOGLE_REGION")
		if region == "" {
			region = "us-central1"
		}

		zone := os.Getenv("GOOGLE_ZONE")
		if zone == "" {
			zone = "us-central1-a"
		}

		opts = &testProviderUpgradeOptions{
			baselineVersion: "8.41.1",
			project:         project,
			region:          region,
			zone:            zone,
			linkNodeSDK:     true,
			installDeps:     true,
		}
	}

	cwd, err := os.Getwd()
	require.NoError(t, err)
	options := []opttest.Option{
		opttest.DownloadProviderVersion(providerName, opts.baselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	}
	if !opts.installDeps {
		options = append(options, opttest.SkipInstall())
	}
	if opts.linkNodeSDK {
		options = append(options, opttest.YarnLink("@pulumi/gcp"))
	}

	options = append(options, opts.extraOpts...)
	test := pulumitest.NewPulumiTest(t, dir, options...)

	if opts.project != "" {
		test.SetConfig(t, "gcp:project", opts.project)
	}

	if opts.region != "" {
		test.SetConfig(t, "gcp:region", opts.region)
	}

	if opts.zone != "" {
		test.SetConfig(t, "gcp:zone", opts.zone)
	}

	result := providertest.PreviewProviderUpgrade(t, test, providerName, opts.baselineVersion,
		optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
}

func defaultUpgradeTest(t *testing.T, dir string) {
	testProviderUpgrade(t, dir, nil)
}

func TestBucketUpgrade(t *testing.T) {
	defaultUpgradeTest(t, "bucket")
}

func TestTopicUpgrade(t *testing.T) {
	defaultUpgradeTest(t, "topic")
}

func TestServerlessUpgrade(t *testing.T) {
	defaultUpgradeTest(t, "serverless")
}
