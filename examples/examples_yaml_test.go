//go:build go || all
// +build go all

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestSecurityPolicyYAML(t *testing.T) {
	cwd, err := os.Getwd()
	if !assert.NoError(t, err) {
		t.FailNow()
	}
	integration.ProgramTest(t, &integration.ProgramTestOptions{
		Dir: path.Join(cwd, "security-policy-yaml"),
	})
}
