package gcp

import (
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func TestEffectiveLabels(t *testing.T) {
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
			t.Parallel()
			actual, err := fixupEffectiveLabels.Edit("doc.md", []byte(tt.text))
			require.NoError(t, err)
			assert.Equal(t, tt.expected, string(actual))
		})
	}
}
