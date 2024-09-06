// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build python || all
// +build python all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	pythonBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return pythonBase
}

func TestAccDatasourcePy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "datasource-py"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccBucketPy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "bucket-py"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccMinimalPy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "minimal-py"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccWebserverPy(t *testing.T) {
	skipIfShort(t)
	for _, dir := range []string{"webserver-py", "webserver-py-old"} {
		t.Run(dir, func(t *testing.T) {
			test := getPythonBaseOptions(t).
				With(integration.ProgramTestOptions{
					Dir: filepath.Join(getCwd(t), dir),
				})

			integration.ProgramTest(t, &test)
		})
	}
}

func TestRegress1843(t *testing.T) {
	skipIfShort(t)
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "regress-1843"),
		})

	integration.ProgramTest(t, &test)
}

func TestRegress1036(t *testing.T) {
	skipIfShort(t)
	dir := filepath.Join(getCwd(t), "regress-1036")
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: dir,
			EditDirs: []integration.EditDir{
				{
					Dir:      filepath.Join(dir, "stage2"),
					Additive: true,
				},
			},
		})

	integration.ProgramTest(t, &test)

}
