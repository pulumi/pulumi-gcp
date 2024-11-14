//go:build !go && !python && !dotnet && !java
// +build !go,!python,!dotnet,!java

package gcp

import (
	"fmt"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

func TestExplicitProviderTokenNotPlainText(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	t.Setenv("GCP_TOKEN", "GCP_TOKEN_STRING")
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, filepath.Join("test-programs", "explicit-provider-with-config"),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)

	res := test.Up(t)
	tokenExport := res.Outputs["token"]
	require.True(t, tokenExport.Secret, "token should be marked as secret")
}

func TestCloudrunServicePanicRegress2155(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, filepath.Join("test-programs", "cloudrun-service"),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)

	test.Up(t)
	test.Up(t)
}

func TestCloudrunServicePanicRegress2622(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	cwd, err := os.Getwd()
	require.NoError(t, err)

	region := "us-central1"
	t.Setenv("GOOGLE_REGION", region)

	test := pulumitest.NewPulumiTest(t, filepath.Join("test-programs", "cloudrun-service"),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)

	proj := getProject()
	test.SetConfig(t, "gcp:project", proj)
	up := test.Up(t)

	outputID := up.Outputs["id"].Value.(string)
	parts := strings.Split(outputID, "/")
	id := parts[len(parts)-1]

	cmdDepErr := exec.Command(
		"gcloud", "run", "deploy", id, "--image=us-docker.pkg.dev/cloudrun/container/hello", "--cpu=2",
		"--no-cpu-boost", fmt.Sprintf(`--region=%s`, region), fmt.Sprintf(`--project=%s`, proj)).Run()
	if cmdDepErr != nil {
		t.Fatal(cmdDepErr.Error())
	}

	cmdErr := exec.Command("gcloud", "run", "services", "update-traffic", id, "--to-latest",
		fmt.Sprintf(`--region=%s`, region), fmt.Sprintf(`--project=%s`, proj)).Run()
	if cmdErr != nil {
		t.Fatal(cmdErr.Error())
	}
	test.SetConfig(t, "cpu", "2")
	test.Up(t)
}

func TestCloudfunctionWrongType(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, filepath.Join("test-programs", "cloudfunction-wrong-type"),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)

	_, err = test.CurrentStack().Up(test.Context())
	require.Error(t, err)

	require.Contains(t, err.Error(), `Unexpected type at field "environmentVariables"`)
}
