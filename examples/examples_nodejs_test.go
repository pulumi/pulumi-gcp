// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"encoding/json"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/assert"
)

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/gcp",
		},
	})

	return baseJS
}

func TestAccWebserverNode(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "webserver"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccLoadbalancer(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "loadbalancer"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccTopic(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "topic"),

			// TODO[pulumi/pulumi-gcp#1487] Non-empty diff when refreshing programs using overlay callbacks
			SkipRefresh: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccBucket(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "bucket"),
			// GCP buckets seem to be eventually consistent, so we need to retry on failure when deploying a cloud function
			// that uses the bucket as a trigger.
			RetryFailedSteps: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccMinimal(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "minimal"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccServerless(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "serverless"),
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, "Hello World!", body)
			}),

			// TODO[pulumi/pulumi-gcp#1487] Non-empty diff when refreshing programs using overlay callbacks
			SkipRefresh: true,
		})

	integration.ProgramTest(t, &test)
}
func TestBigqueryDataset(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "bigquery-dataset-ts"),
		})

	integration.ProgramTest(t, &test)
}

func TestPulumiLabelsSecretNode(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "test-pulumi-labels-secret", "nodejs"),
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
	integration.ProgramTest(t, &test)
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

func TestSecurityPolicyUpgrade(t *testing.T) {
	defaultUpgradeTest(t, "security-policy-ts")
}
