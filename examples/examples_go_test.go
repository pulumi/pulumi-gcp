// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build go || all
// +build go all

package examples

import (
	"context"
	cryptoRand "crypto/rand"
	"fmt"
	"math/big"
	"math/rand"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/sql"
	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/common/workspace"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/stretchr/testify/assert"
)

func TestAccBucketGo(t *testing.T) {
	t.Skip("Skipping while major release in progress")
	test := getGoBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "bucket-go"),
		})

	integration.ProgramTest(t, &test)
}

func getGoBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	csharpBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"github.com/pulumi/pulumi-gcp/sdk/v5",
		},
	})

	return csharpBase
}

// Regression test for issue #794.
func TestRegression794(t *testing.T) {
	// We will use the automation API to `up` two different programs in four steps.

	// The `create` program in project A program creates a cloud SQL instance.
	//
	// The `drift` program in project B imports the cloud SQL instance created by the `create`
	// program, then updates it, incrementing `settings.settingsVersion` as a side effect on the
	// upstream cloud API.
	//
	// The `update` program in project A updates the resource created by the `create` program, and
	// fails without the patch introduced to fix #794.
	//
	// n.b.: In practice, perhaps due to how import behaves, the `drift` program update (step 3)
	// *also* fails prior to this patch.
	suffix := fmt.Sprintf("%08x", rand.Intn(0x1_0000_0000)) // 8 hex digits

	originProject := "regression-794-ORIGINAL"
	driftProject := "regression-794-DRIFT"

	stackName := "test-" + suffix
	databaseName := "test-regression-794-" + suffix

	configPassphrase, err := GenerateRandomString(32)
	if err != nil {
		t.Fatalf("failed to generate random string: %v", err)
	}
	ctx := context.Background()

	workdir := t.TempDir()
	backendUrl := fmt.Sprintf("file://%s", filepath.ToSlash(workdir))

	t.Logf("using workdir and backend: %v", backendUrl)

	t.Cleanup(func() {
		// Select an empty program to delete the stack.
		s, err := auto.UpsertStackInlineSource(ctx, stackName, originProject, nil)
		if err != nil {
			t.Fatalf("failed to select workspace to delete: %v", err)
		}
		_, err = s.Destroy(ctx)
		if err != nil {
			t.Fatalf("failed to destroy stack: %v", err)
		}
		t.Logf("cleaned up stack")
	})

	selectAndRunStack := func(projectName string, flags sql.DatabaseInstanceSettingsDatabaseFlagArrayInput, opts ...pulumi.ResourceOption) float64 {
		s, err := auto.UpsertStackInlineSource(ctx, stackName, projectName, func(ctx *pulumi.Context) error {
			instance, err := sql.NewDatabaseInstance(ctx, "test", &sql.DatabaseInstanceArgs{
				Name:            pulumi.String(databaseName),
				DatabaseVersion: pulumi.String("POSTGRES_15"),
				Settings: sql.DatabaseInstanceSettingsArgs{
					// In testing, we saw these times for running tests over at least two trials on each:
					//
					// db-f1-micro: 500-600s
					// db-g1-small: 250-300s
					// db-custom-1-3840: 200-250s
					//
					// It looks like there are diminishing returns with larger nodes, so (almost arbitrarily) we use db-g1-small.
					Tier:          pulumi.String("db-g1-small"),
					DatabaseFlags: flags,
				},
			}, opts...)
			if err != nil {
				return err
			}

			ctx.Export("settingsVersion", instance.Settings.Version())

			return nil
		}, auto.WorkDir(workdir), auto.EnvVars(map[string]string{
			workspace.PulumiBackendURLEnvVar: backendUrl,
			"PULUMI_CONFIG_PASSPHRASE":       configPassphrase,
		}))
		if err != nil {
			t.Fatalf("failed to create workspace: %v", err)
		}

		_, err = s.Up(ctx)
		if err != nil {
			t.Fatalf("failed to run update: %v", err)
		}

		outputs, err := s.Outputs(ctx)
		if err != nil {
			t.Fatalf("failed to get outputs: %v", err)
		}
		settingsVersion, ok := outputs["settingsVersion"].Value.(float64)
		if !ok {
			t.Fatalf("failed to get settingsVersion, expected *int and got %T", outputs["settingsVersion"].Value)
		}

		return settingsVersion
	}

	// Create the initial instance:
	initialSettingsVersion := selectAndRunStack(originProject, nil)
	t.Logf("Created initial instance with settingsVersion %v", initialSettingsVersion)

	// Now we need to import the resource created by the `create` program into the `drift` program:
	_ = selectAndRunStack(driftProject, nil, pulumi.Import(pulumi.ID(databaseName)))
	t.Logf("Imported instance into drift stack")

	updatedSettingsVersion := selectAndRunStack(driftProject, sql.DatabaseInstanceSettingsDatabaseFlagArray{
		sql.DatabaseInstanceSettingsDatabaseFlagArgs{
			Name:  pulumi.String("log_statement"),
			Value: pulumi.String("all"),
		},
	})
	t.Logf("Updated instance in drift stack to settingsVersion %v", updatedSettingsVersion)

	// Now update the resource created by the `create` program, and fail without the patch introduced to fix #794:
	finalSettingsVersion := selectAndRunStack(originProject, sql.DatabaseInstanceSettingsDatabaseFlagArray{
		sql.DatabaseInstanceSettingsDatabaseFlagArgs{
			Name:  pulumi.String("autovacuum"),
			Value: pulumi.String("on"),
		},
	})
	t.Logf("Updated instance in original stack to settingsVersion %v", finalSettingsVersion)

	assert.Less(t, initialSettingsVersion, updatedSettingsVersion)
	assert.Less(t, updatedSettingsVersion, finalSettingsVersion)
}

func GenerateRandomString(n int) (string, error) {
	const letters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-"
	ret := make([]byte, n)
	for i := 0; i < n; i++ {
		num, err := cryptoRand.Int(cryptoRand.Reader, big.NewInt(int64(len(letters))))
		if err != nil {
			return "", err
		}
		ret[i] = letters[num.Int64()]
	}

	return string(ret), nil
}
