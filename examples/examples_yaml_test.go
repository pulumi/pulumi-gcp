// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.
//go:build go || all
// +build go all

package examples

import (
	"bytes"
	"encoding/json"
	"os"
	"path/filepath"
	"strings"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/assert"
)

func TestHttpHealthCheck(t *testing.T) {
	integration.ProgramTest(t, &integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "http-health-check"),
	})
}

func TestPulumiLabelsSecretYAML(t *testing.T) {
	t.Skip("Skipping due to secrets bug in YAML")
	integration.ProgramTest(t, &integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "test-pulumi-labels-secret", "yaml"),
		ExtraRuntimeValidation: func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
			outputBytes, err := json.Marshal(stack.Outputs)
			assert.NoError(t, err)
			outputStr := string(outputBytes)
			// We expect a pulumiLabels field
			assert.Contains(t, outputStr, "pulumiLabels")
			// We expect its contents to be secret
			assert.NotContains(t, outputStr, "hello")
			// We assert the presence of the "ciphertext" key to denote secretness of the Output.
			assert.Contains(t, outputStr, "ciphertext")
		},
	})
}

func TestWarningsNotDuplicated(t *testing.T) {
	var outputBuf bytes.Buffer
	opts := integration.ProgramTestOptions{
		Dir:           filepath.Join(getCwd(t), "simple-bucket"),
		Stderr:        &outputBuf,
		ExpectFailure: true,
		Quick:         true,
		SkipRefresh:   true,
		Env:           []string{"GOOGLE_PROJECT=", "GOOGLE_APPLICATION_CREDENTIALS="},
		ExtraRuntimeValidation: func(t *testing.T, stackInfo integration.RuntimeValidationStackInfo) {
			actualCount := strings.Count(outputBuf.String(), "Pulumi will rely on per-resource settings for this operation")
			assert.LessOrEqual(t, actualCount, 1)
		},
	}
	integration.ProgramTest(t, &opts)
}

func TestInvalidExplicitProviderProject(t *testing.T) {
	gcpProject := os.Getenv("GCP_PROJECT")
	integration.ProgramTest(t, &integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "non-existent-project"),
		Config: map[string]string{
			"gcpProj": gcpProject,
		},
	})
}
