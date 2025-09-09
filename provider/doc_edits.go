package gcp

import (
	"bytes"
	"fmt"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"math/rand"
	"regexp"
)

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults,
		fixUpKmsCryptoKey,
		fixupEffectiveLabels,
		removeSecretsInPlainTextNote,
		removeBetaFromDescriptionField,
		substituteRandomSuffix,
		rewritemembersField,
		skipBetaWarning,
	)
}

const effectiveLabels = `including the labels configured through Terraform`

var effectiveLabelsRegexp = regexp.MustCompile(effectiveLabels)

var fixupEffectiveLabels = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
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
	Edit: func(_ string, content []byte) ([]byte, error) {
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
	Edit: func(_ string, content []byte) ([]byte, error) {
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
	//nolint:gosec
	randGen := rand.New(rand.NewSource(123456789))
	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(_ string, content []byte) ([]byte, error) {
			return pattern.ReplaceAllFunc(content, func([]byte) []byte {
				//nolint:gosec
				return []byte(fmt.Sprintf("_%d", randGen.Intn(100000)))
			}), nil
		},
	}
})()

// Docs discovery gets tripped up on `member/members` fields for IAM-type properties and doesn't align the content
// correctly.
var memberRegexp = regexp.MustCompile("`member/members`")

func trimFrontMatter(text []byte) []byte {
	body, ok := bytes.CutPrefix(text, []byte("---"))
	if !ok {
		return text
	}
	idx := bytes.Index(body, []byte("\n---"))

	// Unable to find closing, so just return.
	if idx == -1 {
		return text
	}
	return body[idx+3:]
}

var rewritemembersField = tfbridge.DocsEdit{
	Path: "*iam.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		membersByte := []byte("`members`")
		memberByte := []byte("`member`")
		var returnContent []byte
		membersContent := memberRegexp.ReplaceAllLiteral(content, membersByte)
		memberContent := memberRegexp.ReplaceAllLiteral(trimFrontMatter(content), memberByte)
		// Because the IamBinding property matches to a `members` field, while the `IAMMember` property matches to a
		//`member` field, we need to create content for both `members` and `member` so the bridge can match each.
		//The easiest way to do this is to duplicate the content in its entirety, once for `members` and once for
		//`member`, and let the bridge figure it out.
		// See https://github.com/pulumi/pulumi-gcp/issues/1920 for context.
		returnContent = append(returnContent, membersContent...)
		returnContent = append(returnContent, memberContent...)
		return returnContent, nil
	},
}

func targetedSimpleReplace(filePath, from, to string) tfbridge.DocsEdit {
	fromB, toB := []byte(from), []byte(to)
	return tfbridge.DocsEdit{
		Path: filePath,
		Edit: func(_ string, content []byte) ([]byte, error) {
			return bytes.ReplaceAll(content, fromB, toB), nil
		},
	}
}

var fixUpKmsCryptoKey = targetedSimpleReplace(
	"kms_crypto_key.html.markdown",
	"For this reason, it is strongly recommended that you add\nlifecycle\nhooks "+
		"to the resource to prevent accidental destruction.",
	"For this reason, it is strongly recommended that you use "+
		"Pulumi's [protect resource option](https://www.pulumi.com/docs/concepts/options/protect/).")

var skipBetaWarning = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		betaWarning := "~> **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.\nSee Provider Versions for more details on beta resources.\n\n"
		content = bytes.Replace(content, []byte(betaWarning), []byte(""), -1)
		return content, nil
	},
}
