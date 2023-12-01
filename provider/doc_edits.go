package gcp

import (
	"regexp"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults,
		fixupEffectiveLabels,
		removeSecretsInPlainTextNote,
	)
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

var secretsInPlainTextNoteRegexps = []*regexp.Regexp{
	regexp.MustCompile(`~?> \*\*Warning:\*\* All arguments including the following potentially sensitive\nvalues will be stored in the raw state as plain text: .*\nRead more about sensitive data in state\.`),
	regexp.MustCompile(`(?s)~?> \*\*((Warning)|(Note)):\*\* All arguments including .*as plain-text(\.)?( Read more about sensitive data in state\.)?`),
}

var removeSecretsInPlainTextNote = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(path string, content []byte) ([]byte, error) {
		for _, r := range secretsInPlainTextNoteRegexps {
			content = r.ReplaceAllLiteral(content, nil)
		}
		return content, nil
	},
}
