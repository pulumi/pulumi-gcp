// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func TestExpandGlob(t *testing.T) {
	obj := resource.NewObjectProperty(resource.PropertyMap{
		"s": resource.NewStringProperty("string"),
		"obj": resource.NewObjectProperty(resource.PropertyMap{
			"nested": resource.NewStringProperty("n"),
		}),
		"arr": resource.NewArrayProperty([]resource.PropertyValue{
			resource.NewNumberProperty(3),
			resource.NewNullProperty(),
		}),
	})

	tests := []struct {
		value    resource.PropertyValue
		path     resource.PropertyPath
		expected []resource.PropertyPath
	}{
		{
			value: obj,
			path:  resource.PropertyPath{"*"},
			expected: []resource.PropertyPath{
				{"s"},
				{"obj"},
				{"arr"},
			},
		},
		{
			value: obj,
			path:  resource.PropertyPath{"obj", "*"},
			expected: []resource.PropertyPath{
				{"obj", "nested"},
			},
		},
		{
			value: obj,
			path:  resource.PropertyPath{"obj", "*", "missing"},
			expected: []resource.PropertyPath{
				{"obj", "nested", "missing"},
			},
		},
		{
			value: obj,
			path:  resource.PropertyPath{"arr", "*"},
			expected: []resource.PropertyPath{
				{"arr", 1},
				{"arr", 0},
			},
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run("", func(t *testing.T) {
			actual := expandGlob(tt.path, tt.value)
			assert.ElementsMatch(t, tt.expected, actual)
		})
	}
}

func TestAddPrefix(t *testing.T) {
	tests := []struct {
		prefix   resource.PropertyPath
		ends     []resource.PropertyPath
		expected []resource.PropertyPath
	}{
		{
			prefix: nil,
			ends: []resource.PropertyPath{
				{"foo", "bar"},
			},
			expected: []resource.PropertyPath{
				{"foo", "bar"},
			},
		},
		{
			prefix: resource.PropertyPath{3},
			ends: []resource.PropertyPath{
				{"foo", "bar"},
			},
			expected: []resource.PropertyPath{
				{3, "foo", "bar"},
			},
		},
		{
			prefix: resource.PropertyPath{"*"},
			ends: []resource.PropertyPath{
				{"fizz"},
				{"foo", "bar"},
			},
			expected: []resource.PropertyPath{
				{"*", "fizz"},
				{"*", "foo", "bar"},
			},
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run("", func(t *testing.T) {
			actual := addPrefix(tt.prefix, tt.ends)
			assert.Equal(t, tt.expected, actual)
		})
	}
}

func TestEnsureLabelPathsExist(t *testing.T) {
	tests := []struct {
		name     string
		paths    []resource.PropertyPath
		input    resource.PropertyMap
		expected resource.PropertyMap
	}{
		{
			name: "insert top level labels",
			paths: []resource.PropertyPath{
				{"pulumiLabels"},
			},
			input: resource.PropertyMap{
				"s": resource.NewStringProperty("v"),
			},
			expected: resource.PropertyMap{
				"s":            resource.NewStringProperty("v"),
				"pulumiLabels": resource.NewObjectProperty(resource.PropertyMap{}),
			},
		},
		{
			name: "ignore existing labels",
			paths: []resource.PropertyPath{
				{"pulumiLabels"},
			},
			input: resource.PropertyMap{
				"s": resource.NewStringProperty("v"),
				"pulumiLabels": resource.NewObjectProperty(resource.PropertyMap{
					"label": resource.NewStringProperty("value"),
				}),
			},
			expected: resource.PropertyMap{
				"s": resource.NewStringProperty("v"),
				"pulumiLabels": resource.NewObjectProperty(resource.PropertyMap{
					"label": resource.NewStringProperty("value"),
				}),
			},
		},
		{
			name: "insert nested labels",
			paths: []resource.PropertyPath{
				{"foo", "labels"},
			},
			input: resource.PropertyMap{
				"foo": resource.NewObjectProperty(resource.PropertyMap{}),
			},
			expected: resource.PropertyMap{
				"foo": resource.NewObjectProperty(resource.PropertyMap{
					"labels": resource.NewObjectProperty(resource.PropertyMap{}),
				}),
			},
		},
		{
			name: "insert nested labels (missing container)",
			paths: []resource.PropertyPath{
				{"foo", "labels"},
			},
			input:    resource.PropertyMap{},
			expected: resource.PropertyMap{},
		},
		{
			name: "insert globed labels",
			paths: []resource.PropertyPath{
				{"foo", "*", "labels"},
			},
			input: resource.PropertyMap{
				"foo": resource.NewObjectProperty(resource.PropertyMap{
					"elem1": resource.NewObjectProperty(resource.PropertyMap{}),
					"elem2": resource.NewObjectProperty(resource.PropertyMap{
						"fizz": resource.NewStringProperty("buzz"),
					}),
					"elem3": resource.NewObjectProperty(resource.PropertyMap{
						"labels": resource.NewObjectProperty(resource.PropertyMap{
							"label1": resource.NewStringProperty("value1"),
						}),
					}),
				}),
			},
			expected: resource.PropertyMap{
				"foo": resource.NewObjectProperty(resource.PropertyMap{
					"elem1": resource.NewObjectProperty(resource.PropertyMap{
						"labels": resource.NewObjectProperty(resource.PropertyMap{}),
					}),
					"elem2": resource.NewObjectProperty(resource.PropertyMap{
						"fizz":   resource.NewStringProperty("buzz"),
						"labels": resource.NewObjectProperty(resource.PropertyMap{}),
					}),
					"elem3": resource.NewObjectProperty(resource.PropertyMap{
						"labels": resource.NewObjectProperty(resource.PropertyMap{
							"label1": resource.NewStringProperty("value1"),
						}),
					}),
				}),
			},
		},
	}

	for _, tt := range tests {
		tt := tt
		t.Run(tt.name, func(t *testing.T) {
			transform := ensureLabelPathsExist(tt.paths)
			actual, err := transform(context.Background(), tt.input)
			require.NoError(t, err)

			assert.Equal(t, tt.expected, actual)
		})
	}
}
