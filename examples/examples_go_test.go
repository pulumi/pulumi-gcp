// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build go || all
// +build go all

package examples

import (
	"context"
	cryptoRand "crypto/rand"
	"encoding/json"
	"fmt"
	"math/big"
	"math/rand"
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/sql"
	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func TestAccBucketGo(t *testing.T) {
	test := getGoBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "bucket-go"),
		})

	integration.ProgramTest(t, &test)
}

func TestPulumiLabelsSecretGo(t *testing.T) {
	test := getGoBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "test-pulumi-labels-secret", "go"),
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

func getGoBaseOptions(t *testing.T) integration.ProgramTestOptions {
	if os.Getenv("PULUMI_GO_DEP_ROOT") == "" {
		depRoot := getCwd(t) + "/../../"
		err := os.Setenv("PULUMI_GO_DEP_ROOT", depRoot)
		require.NoError(t, err)
	}
	base := getBaseOptions(t)
	goBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"github.com/pulumi/pulumi-gcp/sdk/v9",
		},
	})

	return goBase
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
		s, err := auto.UpsertStackInlineSource(ctx, stackName, originProject,
			func(*pulumi.Context) error { return nil },
			auto.WorkDir(workdir), auto.EnvVars(map[string]string{
				"PULUMI_BACKEND_URL":       backendUrl,
				"PULUMI_CONFIG_PASSPHRASE": configPassphrase,
			}))
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
				// We need to explicitly disable deletion protection, otherwise the database will not be deleted
				// when the stack is destroyed.
				DeletionProtection: pulumi.BoolPtr(false),
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
			"PULUMI_BACKEND_URL":       backendUrl,
			"PULUMI_CONFIG_PASSPHRASE": configPassphrase,
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

func TestLabelsCombinationsGo(t *testing.T) {
	type testCase struct {
		name string
		s1   labelsState
		s2   labelsState
	}

	testCases := []testCase{
		{
			"can add an empty label",
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{},
			},
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{"x": ""},
			},
		},
		{
			"make label empty",
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{"x": "s"},
			},
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{"x": ""},
			},
		},
		{
			"make default label empty",
			labelsState{
				DefaultLabels: map[string]string{"x": "s"},
				Labels:        map[string]string{},
			},
			labelsState{
				DefaultLabels: map[string]string{"x": ""},
				Labels:        map[string]string{},
			},
		},
		{
			"convoluted test case found by random-sampling",
			labelsState{
				DefaultLabels: map[string]string{"x": "", "y": "s"},
				Labels:        map[string]string{"x": ""},
			},
			labelsState{
				DefaultLabels: map[string]string{"x": ""},
				Labels:        map[string]string{"x": "", "y": ""},
			},
		},
		{
			"can add a new default label on Update of existing stack",
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{},
			},
			labelsState{
				DefaultLabels: map[string]string{"hello": "goodbye"},
				Labels:        map[string]string{},
			},
		},
		{
			"no changes means no changes",
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{},
			},
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{},
			},
		},
		{
			"empty value keeps old value",
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{"x": "s"},
			},
			labelsState{
				DefaultLabels: map[string]string{},
				Labels:        map[string]string{"x": ""},
			},
		},
		{
			"empty initial value does not get overridden by default",
			labelsState{
				DefaultLabels: map[string]string{"x": "s"},
				Labels:        map[string]string{"x": ""},
			},
			labelsState{
				DefaultLabels: map[string]string{"x": "s"},
				Labels:        map[string]string{"x": ""},
			},
		},
		{
			"label kept if default is empty",
			labelsState{
				Labels: map[string]string{"x": "s"},
			},
			labelsState{
				DefaultLabels: map[string]string{"x": ""},
			},
		},
	}

	for _, tc := range testCases {
		tc := tc
		t.Run(tc.name, func(t *testing.T) {
			t.Parallel()
			tc.s1.validateTransitionTo(t, tc.s2)
		})
	}
}

func TestRandomLabelsCombinationsGo(t *testing.T) {
	labelValues := []string{"", "s"} // empty values are conflated with unknowns in TF internals, must test

	labelsValues := []map[string]string{
		nil,
		{},
	}

	for _, label := range labelValues {
		m := map[string]string{"x": label}
		labelsValues = append(labelsValues, m)
	}

	for _, label1 := range labelValues {
		for _, label2 := range labelValues {
			m := map[string]string{
				"x": label1,
				"y": label2,
			}
			labelsValues = append(labelsValues, m)
		}
	}

	states := []labelsState{}

	for _, label1 := range labelsValues {
		for _, label2 := range labelsValues {
			states = append(states, labelsState{
				DefaultLabels: label1,
				Labels:        label2,
			})
		}
	}

	t.Logf("total state space: %v states", len(states))
	t.Logf("random-sampling 100 state transitions")

	for i := 0; i < 100; i++ {
		t.Run(fmt.Sprintf("test%d", i), func(t *testing.T) {
			t.Parallel()
			i := rand.Intn(len(states))
			j := rand.Intn(len(states))
			state1, state2 := states[i], states[j]
			state1.validateTransitionTo(t, state2)
		})
	}
}

type labelsState struct {
	DefaultLabels map[string]string `json:"defaultLabels"`
	Labels        map[string]string `json:"labels"`
}

func (st labelsState) serialize(t *testing.T) string {
	bytes, err := json.Marshal(st)
	require.NoError(t, err)
	return string(bytes)
}

func (st labelsState) validateTransitionTo(t *testing.T, st2 labelsState) {
	t.Logf("state1 = %v", st.serialize(t))
	t.Logf("state2 = %v", st2.serialize(t))

	goSdkFolder, err := filepath.Abs(filepath.Join("..", "sdk"))
	require.NoError(t, err)

	baseOpts := integration.ProgramTestOptions{
		Dependencies: []string{
			fmt.Sprintf("github.com/pulumi/pulumi-gcp/sdk/v9=%s", goSdkFolder),
		},
	}
	if _, envConfigSet := os.LookupEnv("GOOGLE_ZONE"); envConfigSet {
		baseOpts = getGoBaseOptions(t)
	}

	opts := baseOpts.With(integration.ProgramTestOptions{
		Dir:                    "labels-combinations-go",
		ExtraRuntimeValidation: validateStateResult(1, st, st2),
		EditDirs: []integration.EditDir{{
			Dir:                    filepath.Join("labels-combinations-go", "step1"),
			Additive:               true,
			ExtraRuntimeValidation: validateStateResult(2, st, st2),
		}},
		Config: map[string]string{
			"state1": st.serialize(t),
			"state2": st2.serialize(t),
		},
		Quick:            true,
		SkipRefresh:      true,
		DestroyOnCleanup: true,
	})

	integration.ProgramTest(t, &opts)
}

type expectedLabelValueArg struct {
	labels, defaults, prevLabels, prevDefaults valuePresentTuple
}

type valuePresentTuple struct {
	value   string
	present bool
}

// This takes the combination of label, default, previous label and previous default
// and returns the expected new value of a label. "" means it should not be present in the result.
func expectedLabelValue(arg expectedLabelValueArg) string {
	// The labels behaviour in GCP is non-trivial. The labels are a combination of DefaultLabels and Labels.
	// The DefaultLabels are the labels that are set by the provider by default. The user can override these
	// labels by setting them in the Labels field of the resource.
	//
	// Things get a bit more complicated with how the GCP TF provider treats empty ("") labels.
	// Generally, "" is treated as "keep the previous value". However, if the value has always been "", then
	// it is treated as "no value", which trumps any DefaultLabels.
	// The test cases above try to illustrate this behaviour.
	labels, defaults, prevLabels, prevDefaults := arg.labels, arg.defaults, arg.prevLabels, arg.prevDefaults
	if !labels.present {
		if !defaults.present {
			return ""
		}

		if defaults.value != "" {
			return defaults.value
		}

		if prevLabels.present {
			return prevLabels.value
		}

		return prevDefaults.value
	}

	if labels.value != "" {
		return labels.value
	}

	if prevLabels.present {
		return prevLabels.value
	}

	if prevDefaults.present {
		return prevDefaults.value
	}

	return ""
}

func (st labelsState) expectedLabels(prev labelsState) map[string]string {
	// Note that the upstream provider actually takes a "" value for a label to mean "keep the previous value".
	// This behaviour is exposed under PlanResourceChange
	expected := map[string]string{}

	keys := map[string]struct{}{}
	for k := range st.DefaultLabels {
		keys[k] = struct{}{}
	}
	for k := range st.Labels {
		keys[k] = struct{}{}
	}

	for k := range keys {
		labelsVal, inLabels := st.Labels[k]
		defaultsVal, inDefaults := st.DefaultLabels[k]
		prevLabelsVal, inPrevLabels := prev.Labels[k]
		prevDefaultsVal, inPrevDefaults := prev.DefaultLabels[k]

		expected[k] = expectedLabelValue(
			expectedLabelValueArg{
				labels:       valuePresentTuple{value: labelsVal, present: inLabels},
				defaults:     valuePresentTuple{value: defaultsVal, present: inDefaults},
				prevLabels:   valuePresentTuple{value: prevLabelsVal, present: inPrevLabels},
				prevDefaults: valuePresentTuple{value: prevDefaultsVal, present: inPrevDefaults},
			},
		)
	}

	// Because we're reading pulumiLabels, we need to expect the default provisioning label.
	expected["goog-pulumi-provisioned"] = "true"

	return expected
}

func validateStateResult(phase int, st1, st2 labelsState) func(
	t *testing.T,
	stack integration.RuntimeValidationStackInfo,
) {
	var st, prev labelsState
	switch phase {
	case 1:
		st = st1
		prev = labelsState{}
	default:
		st = st2
		prev = st1
	}
	expected := st.expectedLabels(prev)

	return func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
		for k, v := range stack.Outputs {
			actualLabelsJSON := v.(string)
			var actualLabels map[string]string
			err := json.Unmarshal([]byte(actualLabelsJSON), &actualLabels)
			require.NoError(t, err)
			t.Logf("phase: %d", phase)
			t.Logf("state: %v", st.serialize(t))
			require.Equalf(t, expected, actualLabels, "key=%s", k)
			t.Logf("key=%s labels are as expected: %v", k, actualLabelsJSON)
		}
	}
}
