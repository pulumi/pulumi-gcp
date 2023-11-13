package gcp

import (
	"regexp"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults, fixupEffectiveLabels)
}

const effectiveLabels = `including the labels configured through Terraform`

var effectiveLabelsRegexp = regexp.MustCompile(effectiveLabels)

var fixupEffectiveLabels = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(path string, content []byte) ([]byte, error) {
		content = effectiveLabelsRegexp.ReplaceAllLiteral(content, []byte("including the labels configured through Pulumi"))
		return content, nil
	},
}
