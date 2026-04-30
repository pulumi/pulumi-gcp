package gcp

import (
	"bytes"
	"encoding/json"
	"fmt"
	"math/rand"
	"os"
	"path/filepath"
	"regexp"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	rules := []tfbridge.DocsEdit{applyReplacementsDotJSON()}
	rules = append(rules, defaults...)
	return append(rules,
		fixUpKmsCryptoKey,
		fixupEffectiveLabels,
		fixUpServiceNetworkDeletionPolicy,
		removeSecretsInPlainTextNote,
		removeBetaFromDescriptionField,
		substituteRandomSuffix,
		addCloudRunPubsubExample,
		fixUpComposerEnvironmentWarning,
		addContainerClusterAutopilotExample,
		fixUpServiceAccountIamConditionHeadings,
		rewritemembersField,
		skipBetaWarning,
		joinMultilineMarkdownLinks,
		simpleReplace("terraformLabels", "pulumiLabels"),
		simpleReplace("terraform_labels", "pulumi_labels"),
	)
}

func simpleReplace(from, to string) tfbridge.DocsEdit {
	fromB, toB := []byte(from), []byte(to)
	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(_ string, content []byte) ([]byte, error) {
			return bytes.ReplaceAll(content, fromB, toB), nil
		},
	}
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

func targetedInsertBefore(filePath, marker, insertion string) tfbridge.DocsEdit {
	markerB := []byte(marker)
	replacement := append([]byte(insertion), markerB...)
	return tfbridge.DocsEdit{
		Path: filePath,
		Edit: func(_ string, content []byte) ([]byte, error) {
			return bytes.Replace(content, markerB, replacement, 1), nil
		},
	}
}

var fixUpKmsCryptoKey = targetedSimpleReplace(
	"kms_crypto_key.html.markdown",
	"For this reason, it is strongly recommended that you add\nlifecycle\nhooks "+
		"to the resource to prevent accidental destruction.",
	"For this reason, it is strongly recommended that you use "+
		"Pulumi's [protect resource option](https://www.pulumi.com/docs/concepts/options/protect/).")

var fixUpServiceNetworkDeletionPolicy = targetedSimpleReplace(
	"service_networking_connection.html.markdown",
	"This will enable a successful terraform destroy",
	"This will enable a successful pulumi destroy",
)

var addCloudRunPubsubExample = targetedInsertBefore(
	"cloud_run_service.html.markdown",
	"## Example Usage - Cloud Run Service Basic\n",
	"## Example Usage - Cloud Run Service Pubsub\n\n"+
		"```hcl\n"+
		"resource \"google_cloud_run_service\" \"default\" {\n"+
		"    name     = \"cloud_run_service_name\"\n"+
		"    location = \"us-central1\"\n"+
		"    template {\n"+
		"      spec {\n"+
		"            containers {\n"+
		"                image = \"gcr.io/cloudrun/hello\"\n"+
		"            }\n"+
		"      }\n"+
		"    }\n"+
		"    traffic {\n"+
		"      percent         = 100\n"+
		"      latest_revision = true\n"+
		"    }\n"+
		"}\n\n"+
		"resource \"google_service_account\" \"sa\" {\n"+
		"  account_id   = \"cloud-run-pubsub-invoker\"\n"+
		"  display_name = \"Cloud Run Pub/Sub Invoker\"\n"+
		"}\n\n"+
		"resource \"google_cloud_run_service_iam_binding\" \"binding\" {\n"+
		"  location = google_cloud_run_service.default.location\n"+
		"  service = google_cloud_run_service.default.name\n"+
		"  role = \"roles/run.invoker\"\n"+
		"  members = [\"serviceAccount:${google_service_account.sa.email}\"]\n"+
		"}\n\n"+
		"resource \"google_project_iam_binding\" \"project\" {\n"+
		"  role    = \"roles/iam.serviceAccountTokenCreator\"\n"+
		"  members = [\"serviceAccount:${google_service_account.sa.email}\"]\n"+
		"}\n\n"+
		"resource \"google_pubsub_topic\" \"topic\" {\n"+
		"  name = \"pubsub_topic\"\n"+
		"}\n\n"+
		"resource \"google_pubsub_subscription\" \"subscription\" {\n"+
		"  name  = \"pubsub_subscription\"\n"+
		"  topic = google_pubsub_topic.topic.name\n"+
		"  push_config {\n"+
		"    push_endpoint = google_cloud_run_service.default.status[0].url\n"+
		"    oidc_token {\n"+
		"      service_account_email = google_service_account.sa.email\n"+
		"    }\n"+
		"    attributes = {\n"+
		"      x-goog-version = \"v1\"\n"+
		"    }\n"+
		"  }\n"+
		"}\n"+
		"```\n\n",
)

var composerEnvironmentConsiderations = regexp.MustCompile(
	`(?s)Several special considerations apply to managing Cloud Composer environments\s+with Terraform:` +
		`.*?\n\n## Example Usage`,
)

var fixUpComposerEnvironmentWarning = tfbridge.DocsEdit{
	Path: "composer_environment.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replacement := []byte("We **STRONGLY** recommend you read the [GCP\n" +
			"guides](https://cloud.google.com/composer/docs/how-to) as the Environment resource requires a long\n" +
			"deployment process and involves several layers of GCP infrastructure, including a Kubernetes Engine\n" +
			"cluster, Cloud Storage, and Compute networking resources. Due to limitations of the API, Pulumi\n" +
			"will not be able to find or manage many of these underlying resources automatically. In particular:\n" +
			"* Creating or updating an environment resource can take up to one hour. In addition, GCP may only\n" +
			"  detect some errors in the configuration when they are used (e.g., ~40-50 minutes into the creation\n" +
			"  process), and is prone to limited error reporting. If you encounter confusing or uninformative\n" +
			"  errors, please verify your configuration is valid against GCP Cloud Composer before filing bugs\n" +
			"  against the provider.\n" +
			"* **Environments create Google Cloud Storage buckets that are not automatically cleaned up**\n" +
			"  on environment deletion. [More about Composer's use of Cloud\n" +
			"  Storage](https://cloud.google.com/composer/docs/concepts/cloud-storage).\n" +
			"* Please review the [known\n" +
			"  issues](https://cloud.google.com/composer/docs/known-issues) for Composer if you are having\n" +
			"  problems.\n\n" +
			"## Example Usage")
		return composerEnvironmentConsiderations.ReplaceAllLiteral(content, replacement), nil
	},
}

var addContainerClusterAutopilotExample = targetedInsertBefore(
	"container_cluster.html.markdown",
	"## Argument Reference\n",
	"## Example Usage - autopilot\n\n"+
		"```hcl\n"+
		"resource \"google_service_account\" \"default\" {\n"+
		"  account_id   = \"service-account-id\"\n"+
		"  display_name = \"Service Account\"\n"+
		"}\n\n"+
		"resource \"google_container_cluster\" \"primary\" {\n"+
		"  name             = \"marcellus-wallace\"\n"+
		"  location         = \"us-central1-a\"\n"+
		"  enable_autopilot = true\n"+
		"  timeouts {\n"+
		"    create = \"30m\"\n"+
		"    update = \"40m\"\n"+
		"  }\n"+
		"}\n"+
		"```\n\n",
)

var fixUpServiceAccountIamConditionHeadings = tfbridge.DocsEdit{
	Path: "google_service_account_iam.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		heading := []byte("With IAM Conditions:")
		parts := bytes.SplitN(content, heading, 3)
		if len(parts) != 3 {
			return content, nil
		}
		content = append(parts[0], []byte("### Service Account IAM Binding With IAM Conditions:")...)
		content = append(content, parts[1]...)
		content = append(content, []byte("### Service Account IAM Member With IAM Conditions:")...)
		content = append(content, parts[2]...)
		return content, nil
	},
}

var skipBetaWarning = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		//nolint:lll
		betaWarning := "~> **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.\nSee Provider Versions for more details on beta resources.\n\n"
		content = bytes.ReplaceAll(content, []byte(betaWarning), []byte(""))
		return content, nil
	},
}

var multilineMarkdownLink = regexp.MustCompile(`\]\s*\n\s*\((https?://[^<>\s)]+)\)`)

var joinMultilineMarkdownLinks = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return multilineMarkdownLink.ReplaceAll(content, []byte(`]($1)`)), nil
	},
}

type replacementFile map[string][]replacement

type replacement struct {
	Old string `json:"old"`
	New string `json:"new"`
}

func applyReplacementsDotJSON() tfbridge.DocsEdit {
	replacements := mustReadReplacements()

	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(path string, content []byte) ([]byte, error) {
			replacementsForPath := replacements[path]
			basePath := filepath.Base(path)
			if basePath != path {
				replacementsForPath = append(replacementsForPath, replacements[basePath]...)
			}
			for _, replacement := range replacementsForPath {
				content = bytes.ReplaceAll(content, []byte(replacement.Old), []byte(replacement.New))
			}
			return content, nil
		},
	}
}

func mustReadReplacements() replacementFile {
	for _, filePath := range []string{"provider/replacements.json", "replacements.json"} {
		fileBytes, err := os.ReadFile(filePath)
		if err != nil {
			if os.IsNotExist(err) {
				continue
			}
			panic(err)
		}

		var replacements replacementFile
		if err := json.Unmarshal(fileBytes, &replacements); err != nil {
			panic(err)
		}
		return replacements
	}

	panic("could not find provider/replacements.json or replacements.json")
}
