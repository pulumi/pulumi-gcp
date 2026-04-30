package gcp

import (
	"encoding/json"
	"os"
	"strings"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func TestReplacementDoesNotIncludeTodos(t *testing.T) {
	t.Parallel()

	replacementsJSON, err := os.ReadFile("replacements.json")
	require.NoError(t, err, "failed to read replacements.json")

	var replacementsFile replacementFile
	err = json.Unmarshal(replacementsJSON, &replacementsFile)
	require.NoError(t, err, "failed to unmarshal replacements.json")

	for doc, replacements := range replacementsFile {
		for _, replacement := range replacements {
			assert.NotContainsf(t, replacement.New, "TODO", "replacement value for %q contains TODO", doc)
		}
	}
}

func TestReplacementsDotJSON(t *testing.T) {
	t.Parallel()

	edit := applyReplacementsDotJSON()
	actual, err := edit.Edit("compute_node_types.html.markdown", []byte(`resource "google_compute_node_template" "tmpl" {
  name      = "terraform-test-tmpl"
}`))
	require.NoError(t, err)
	assert.Equal(t, `resource "google_compute_node_template" "tmpl" {
  name      = "test-tmpl"
}`, string(actual))

	actual, err = edit.Edit("unrelated.html.markdown", []byte("Terraform should be untouched here."))
	require.NoError(t, err)
	assert.Equal(t, "Terraform should be untouched here.", string(actual))
}

func TestAggregateIAMExemptedMembersReplacement(t *testing.T) {
	t.Parallel()

	input := "* `exempted_members` - (Optional) Identities that do not cause logging for this type of permission.  " +
		"The format is the same as that for `members`.\n"

	edit := applyReplacementsDotJSON()
	for _, doc := range []string{
		"google_folder_iam.html.markdown",
		"google_organization_iam.html.markdown",
		"google_project_iam.html.markdown",
	} {
		doc := doc
		t.Run(doc, func(t *testing.T) {
			t.Parallel()

			actual, err := edit.Edit(doc, []byte(input))
			require.NoError(t, err)
			assert.Contains(t, string(actual), "Each entry can have one of the following values:")
			assert.Contains(t, string(actual), "**serviceAccount:{emailid}**")
			assert.NotContains(t, string(actual), "The format is the same as that for `members`.")
		})
	}
}

func TestJoinMultilineMarkdownLinks(t *testing.T) {
	t.Parallel()

	input := "See [customer-supplied encryption key]\n" +
		"(https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)."
	expected := "See [customer-supplied encryption key]" +
		"(https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)."

	actual, err := joinMultilineMarkdownLinks.Edit("doc.md", []byte(input))
	require.NoError(t, err)
	assert.Equal(t, expected, string(actual))

	actual, err = joinMultilineMarkdownLinks.Edit("doc.md", []byte("[inline](https://example.com)"))
	require.NoError(t, err)
	assert.Equal(t, "[inline](https://example.com)", string(actual))
}

func TestEffectiveLabels(t *testing.T) {
	t.Parallel()
	tests := []struct{ text, expected string }{
		{
			"including the labels configured through Terraform",
			"including the labels configured through Pulumi",
		},
		{
			"something something prefix including the labels configured through Terraform",
			"something something prefix including the labels configured through Pulumi",
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run(tt.text, func(t *testing.T) {
			actual, err := fixupEffectiveLabels.Edit("doc.md", []byte(tt.text))
			require.NoError(t, err)
			assert.Equal(t, tt.expected, string(actual))
		})
	}
}

//nolint:lll
func TestSecretsInPlainTextNote(t *testing.T) {
	tests := []struct{ text, expected string }{
		{
			`Some other text.

~> **Warning:** All arguments including the following potentially sensitive
values will be stored in the raw state as plain text: ` + "`deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.crypto_replace_ffx_fpe_config.crypto_key.unwrapped.key`, `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.crypto_hash_config.crypto_key.unwrapped.key`, `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.date_shift_config.crypto_key.unwrapped.key`, `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.crypto_deterministic_config.crypto_key.unwrapped.key`" + `.
Read more about sensitive data in state.

Some more text.`,
			"Some other text.\n\n\n\nSome more text.",
		},
		{
			"This provider is not able to delete App Engine applications.\n\n> **Warning:** All arguments including `iap.oauth2_client_secret` will be stored in the raw\nstate as plain-text. Read more about sensitive data in state.\n\n{{% examples %}}",
			"This provider is not able to delete App Engine applications.\n\n\n\n{{% examples %}}",
		},
		{
			"A> **Warning:** All arguments including `key_value` will be stored in the raw\nstate as plain-text.\n\nB",
			"A\n\nB",
		},
		{
			"A> **Note:** All arguments including the private key will be stored in the raw state as plain-text\n\nB",
			"A\n\nB",
		},
		{
			"A~> **Warning:** All arguments including `iap.oauth2_client_secret` will be stored in the raw\nstate as plain-text. Read more about sensitive data in state.\n\nB",
			"A\n\nB",
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run(strings.ReplaceAll(tt.text, "\n", " "), func(t *testing.T) {
			t.Parallel()
			actual, err := removeSecretsInPlainTextNote.Edit("doc.md", []byte(tt.text))
			require.NoError(t, err)
			assert.Equal(t, tt.expected, string(actual))
		})
	}
}

func TestBetaDescription(t *testing.T) {
	t.Parallel()
	tests := []struct{ text, expected string }{
		{
			"(Beta)",
			"",
		},
		{
			"(Optional, Beta)",
			"",
		},
		{
			"(Optional, Beta, Deprecated)",
			"",
		},
		{
			"(Beta, Deprecated)",
			"",
		},

		{
			"(Beta only)",
			"",
		},
		{
			"(Optional) Beta ",
			"",
		},
		{
			"Something using Kubernetes Beta API",
			"Something using Kubernetes Beta API",
		},
		{
			"(Optional, Beta, Something Else)",
			"(Optional, Beta, Something Else)",
		},
		{
			"(Optional, Beta) Something Else)",
			" Something Else)",
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run(tt.text, func(t *testing.T) {
			t.Parallel()
			actual, err := removeBetaFromDescriptionField.Edit("doc.md", []byte(tt.text))
			require.NoError(t, err)
			assert.Equal(t, tt.expected, string(actual))
		})
	}
}

func TestRewriteMembersField(t *testing.T) {
	t.Parallel()
	tests := []struct{ text, expected string }{
		{
			"`member/members` - Identities that will be granted privileges\n",
			"`members` - Identities that will be granted privileges\n" +
				"`member` - Identities that will be granted privileges\n",
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run(tt.text, func(t *testing.T) {
			actual, err := rewritemembersField.Edit("doc.md", []byte(tt.text))
			require.NoError(t, err)
			assert.Equal(t, tt.expected, string(actual))
		})
	}
}

func TestHardDocsEdits(t *testing.T) {
	t.Parallel()

	actual, err := addCloudRunPubsubExample.Edit(
		"cloud_run_service.html.markdown",
		[]byte("## Example Usage - Cloud Run Service Basic\n"),
	)
	require.NoError(t, err)
	assert.Contains(t, string(actual), "## Example Usage - Cloud Run Service Pubsub")
	assert.Contains(t, string(actual), "resource \"google_pubsub_subscription\" \"subscription\"")
	assert.Contains(t, string(actual), "## Example Usage - Cloud Run Service Basic")

	actual, err = addContainerClusterAutopilotExample.Edit(
		"container_cluster.html.markdown",
		[]byte("## Argument Reference\n"),
	)
	require.NoError(t, err)
	assert.Contains(t, string(actual), "## Example Usage - autopilot")
	assert.Contains(t, string(actual), "enable_autopilot = true")
	assert.Contains(t, string(actual), "## Argument Reference")

	actual, err = fixUpServiceAccountIamConditionHeadings.Edit(
		"google_service_account_iam.html.markdown",
		[]byte("With IAM Conditions:\n\nmiddle\n\nWith IAM Conditions:"),
	)
	require.NoError(t, err)
	assert.Contains(t, string(actual), "### Service Account IAM Binding With IAM Conditions:")
	assert.Contains(t, string(actual), "### Service Account IAM Member With IAM Conditions:")

	actual, err = fixUpComposerEnvironmentWarning.Edit(
		"composer_environment.html.markdown",
		[]byte("Several special considerations apply to managing Cloud Composer environments \n"+
			"with Terraform:\n\n"+
			"* The Environment resource is based on several layers of GCP infrastructure. \n"+
			"    Terraform does not manage these underlying resources. For example, in Cloud \n"+
			"    Composer 2, this includes a Kubernetes Engine cluster, Cloud Storage, and \n"+
			"    Compute networking resources.\n"+
			"* Creating or updating an environment usually takes around 25 minutes.\n"+
			"* In some cases errors in the configuration will be detected and reported only \n"+
			"    during the process of the environment creation. If you encounter such \n"+
			"    errors, please verify your configuration is valid against GCP Cloud Composer before filing\n"+
			"    bugs for the Terraform provider.\n"+
			"* **Environments have Google Cloud Storage buckets that are not automatically \n"+
			"    deleted** with the environment.\n"+
			"    See [Delete environments](https://cloud.google.com/composer/docs/composer-2/delete-environments)\n"+
			"    for more information.\n"+
			"* Please refer to\n"+
			"    [Troubleshooting pages](https://cloud.devsite.corp.google.com/composer/docs/composer-2/\n"+
			"    troubleshooting-environment-creation) if you encounter\n"+
			"    problems.\n\n"+
			"## Example Usage"),
	)
	require.NoError(t, err)
	assert.Contains(t, string(actual), "Due to limitations of the API, Pulumi")
	assert.Contains(t, string(actual), "known\n  issues")
	assert.NotContains(t, string(actual), "problems.***")
}
