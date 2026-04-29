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

func TestJoinMultilineMarkdownLinks(t *testing.T) {
	t.Parallel()

	input := "See [customer-supplied encryption key]\n(https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)."
	expected := "See [customer-supplied encryption key](https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)."

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
