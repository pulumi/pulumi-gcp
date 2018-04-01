// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"fmt"
	"os"
	"path"
	"testing"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestExamples(t *testing.T) {
	keyFile := os.Getenv("GOOGLE_APPLICATION_CREDENTIALS")
	if keyFile == "" {
		t.Skipf("Skipping test due to missing GOOGLE_APPLICATION_CREDENTIALS variable")
	}
	fmt.Println(keyFile);
	project:= os.Getenv("GOOGLE_PROJECT");
	if project == "" {
		t.Skipf("Skipping test due to missing GOOGLE_PROJECT variable")
	}
	fmt.Println(project);
	region := os.Getenv("GOOGLE_REGION");
	if region == "" {
		t.Skipf("Skipping test due to missing GOOGLE_REGION variable")
	}
	fmt.Println(region);
	zone := os.Getenv("GOOGLE_ZONE");
	if zone == "" {
		t.Skipf("Skipping test due to missing GOOGLE_ZONE variable")
	}
	fmt.Println(zone);
	cwd, err := os.Getwd()
	if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
		return
	}
	
	// base options shared amongst all tests.
	base := integration.ProgramTestOptions{
		Config: map[string]string{
			"gcp:config:credentials": keyFile,
			"gcp:config:project": project,
			"gcp:config:zone": zone,
			"gcp:config:region": region,
		},
		Dependencies: []string{
			"@pulumi/pulumi",
			"@pulumi/gcp",
		},
	}

	examples := []integration.ProgramTestOptions{
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "minimal")}),
	}
	if !testing.Short() {
		examples = append(examples, []integration.ProgramTestOptions{
			base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "loadbalancer")}),
			base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "webserver")}),
		}...)
	}

	for _, ex := range examples {
		example := ex
		t.Run(example.Dir, func(t *testing.T) {
			integration.ProgramTest(t, &example)
		})
	}
}

func createEditDir(dir string) integration.EditDir {
	return integration.EditDir{Dir: dir, ExtraRuntimeValidation: nil}
}
