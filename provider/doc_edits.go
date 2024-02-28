package gcp

import (
	"fmt"
	"math/rand"
	"regexp"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults,
		fixupEffectiveLabels,
		removeSecretsInPlainTextNote,
		removeBetaFromDescriptionField,
		substituteRandomSuffix,
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

//nolint:lll
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

// Some descriptions had a link to google-beta removed as part of link scrubbing by the bridge.
// This leaves us with the following patterns unique to this provider to remove from the "Description" fields.
// We have to be somewhat verbose here to avoid removing legitimate use of the term "Beta", e.g "Kubernetes Beta API".
// "(Optional, Beta, Deprecated)
// "(Optional, Beta)
// "(Beta, Deprecated)
// "(Beta only)
// "(Optional) Beta
var betaRegexps = []*regexp.Regexp{
	regexp.MustCompile(`\(Beta\)`),
	regexp.MustCompile(`\(Optional, Beta\)`),
	regexp.MustCompile(`\(Optional, Beta, Deprecated\)`),
	regexp.MustCompile(`\(Beta, Deprecated\)`),
	regexp.MustCompile(`\(Beta only\)`),
	regexp.MustCompile(`\(Optional\) Beta `),
}

var removeBetaFromDescriptionField = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(path string, content []byte) ([]byte, error) {
		for _, betaRegex := range betaRegexps {
			content = betaRegex.ReplaceAllLiteral(content, nil)
		}
		return content, nil
	},
}

// Example HCL seems to employ `%{random_suffix}` which trips up the example conversion. Substitute
// it out to an actual random suffix.
var substituteRandomSuffix = (func() tfbridge.DocsEdit {
	pattern := regexp.MustCompile(regexp.QuoteMeta("%{random_suffix}"))
	randGen := rand.New(rand.NewSource(123456789))
	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(path string, content []byte) ([]byte, error) {
			return pattern.ReplaceAllFunc(content, func([]byte) []byte {
				//nolint:gosec
				return []byte(fmt.Sprintf("_%d", randGen.Intn(100000)))
			}), nil
		},
	}
})()
