// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package essentialcontacts

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A document schema is used to define document structure.
//
// To get more information about DocumentSchema, see:
//
// * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations.documentSchemas)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/document-warehouse/docs/manage-document-schemas)
//
// ## Example Usage
// ### Document Ai Warehouse Document Schema Text
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleText", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber:    *pulumi.String(project.Number),
//				DisplayName:      pulumi.String("test-property-text"),
//				Location:         pulumi.String("us"),
//				DocumentIsFolder: pulumi.Bool(false),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop3"),
//						DisplayName:         pulumi.String("propdisp3"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						TextTypeOptions: nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Integer
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleInteger", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber: *pulumi.String(project.Number),
//				DisplayName:   pulumi.String("test-property-integer"),
//				Location:      pulumi.String("us"),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop1"),
//						DisplayName:         pulumi.String("propdisp1"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						IntegerTypeOptions: nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Float
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleFloat", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber: *pulumi.String(project.Number),
//				DisplayName:   pulumi.String("test-property-float"),
//				Location:      pulumi.String("us"),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop2"),
//						DisplayName:         pulumi.String("propdisp2"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						FloatTypeOptions: nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Property
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleProperty", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber:    *pulumi.String(project.Number),
//				DisplayName:      pulumi.String("test-property-property"),
//				Location:         pulumi.String("us"),
//				DocumentIsFolder: pulumi.Bool(false),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop8"),
//						DisplayName:         pulumi.String("propdisp8"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						PropertyTypeOptions: &essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs{
//							PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArray{
//								&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs{
//									Name:                pulumi.String("prop8_nested"),
//									DisplayName:         pulumi.String("propdisp8_nested"),
//									IsRepeatable:        pulumi.Bool(false),
//									IsFilterable:        pulumi.Bool(true),
//									IsSearchable:        pulumi.Bool(true),
//									IsMetadata:          pulumi.Bool(false),
//									IsRequired:          pulumi.Bool(false),
//									RetrievalImportance: pulumi.String("HIGHEST"),
//									SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArray{
//										&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs{
//											Name:          pulumi.String("dummy_source_nested"),
//											ProcessorType: pulumi.String("dummy_processor_nested"),
//										},
//									},
//									TextTypeOptions: nil,
//								},
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Property Enum
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "examplePropertyEnum", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber:    *pulumi.String(project.Number),
//				DisplayName:      pulumi.String("test-property-property"),
//				Location:         pulumi.String("us"),
//				DocumentIsFolder: pulumi.Bool(false),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop8"),
//						DisplayName:         pulumi.String("propdisp8"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						PropertyTypeOptions: &essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs{
//							PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArray{
//								&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs{
//									Name:                pulumi.String("prop8_nested"),
//									DisplayName:         pulumi.String("propdisp8_nested"),
//									IsRepeatable:        pulumi.Bool(false),
//									IsFilterable:        pulumi.Bool(true),
//									IsSearchable:        pulumi.Bool(true),
//									IsMetadata:          pulumi.Bool(false),
//									IsRequired:          pulumi.Bool(false),
//									RetrievalImportance: pulumi.String("HIGHEST"),
//									SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArray{
//										&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs{
//											Name:          pulumi.String("dummy_source_nested"),
//											ProcessorType: pulumi.String("dummy_processor_nested"),
//										},
//									},
//									EnumTypeOptions: &essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptionsArgs{
//										PossibleValues: pulumi.StringArray{
//											pulumi.String("M"),
//											pulumi.String("F"),
//											pulumi.String("X"),
//										},
//										ValidationCheckDisabled: pulumi.Bool(false),
//									},
//								},
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Enum
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleEnum", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber: *pulumi.String(project.Number),
//				DisplayName:   pulumi.String("test-property-enum"),
//				Location:      pulumi.String("us"),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop6"),
//						DisplayName:         pulumi.String("propdisp6"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						EnumTypeOptions: &essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs{
//							PossibleValues: pulumi.StringArray{
//								pulumi.String("M"),
//								pulumi.String("F"),
//								pulumi.String("X"),
//							},
//							ValidationCheckDisabled: pulumi.Bool(false),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Map
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleMap", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber: *pulumi.String(project.Number),
//				DisplayName:   pulumi.String("test-property-map"),
//				Location:      pulumi.String("us"),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop4"),
//						DisplayName:         pulumi.String("propdisp4"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						MapTypeOptions: nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Datetime
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleDatetime", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber: *pulumi.String(project.Number),
//				DisplayName:   pulumi.String("test-property-date_time"),
//				Location:      pulumi.String("us"),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop7"),
//						DisplayName:         pulumi.String("propdisp7"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						DateTimeTypeOptions: nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Document Ai Warehouse Document Schema Timestamp
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/essentialcontacts"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = essentialcontacts.NewDocumentAiWarehouseDocumentSchema(ctx, "exampleTimestamp", &essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs{
//				ProjectNumber: *pulumi.String(project.Number),
//				DisplayName:   pulumi.String("test-property-timestamp"),
//				Location:      pulumi.String("us"),
//				PropertyDefinitions: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArray{
//					&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs{
//						Name:                pulumi.String("prop5"),
//						DisplayName:         pulumi.String("propdisp5"),
//						IsRepeatable:        pulumi.Bool(false),
//						IsFilterable:        pulumi.Bool(true),
//						IsSearchable:        pulumi.Bool(true),
//						IsMetadata:          pulumi.Bool(false),
//						IsRequired:          pulumi.Bool(false),
//						RetrievalImportance: pulumi.String("HIGHEST"),
//						SchemaSources: essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArray{
//							&essentialcontacts.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs{
//								Name:          pulumi.String("dummy_source"),
//								ProcessorType: pulumi.String("dummy_processor"),
//							},
//						},
//						TimestampTypeOptions: nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # DocumentSchema can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema default projects/{{project_number}}/locations/{{location}}/documentSchemas/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema default {{project_number}}/{{location}}/{{name}}
//
// ```
type DocumentAiWarehouseDocumentSchema struct {
	pulumi.CustomResourceState

	// Name of the schema given by the user.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Tells whether the document is a folder or a typical document.
	DocumentIsFolder pulumi.BoolPtrOutput `pulumi:"documentIsFolder"`
	// The location of the resource.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the metadata property.
	//
	// (Optional)
	// The schema name in the source.
	//
	// (Required)
	// The name of the metadata property.
	//
	// (Optional)
	// The schema name in the source.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique identifier of the project.
	ProjectNumber pulumi.StringOutput `pulumi:"projectNumber"`
	// Defines the metadata for a schema property.
	// Structure is documented below.
	PropertyDefinitions DocumentAiWarehouseDocumentSchemaPropertyDefinitionArrayOutput `pulumi:"propertyDefinitions"`
}

// NewDocumentAiWarehouseDocumentSchema registers a new resource with the given unique name, arguments, and options.
func NewDocumentAiWarehouseDocumentSchema(ctx *pulumi.Context,
	name string, args *DocumentAiWarehouseDocumentSchemaArgs, opts ...pulumi.ResourceOption) (*DocumentAiWarehouseDocumentSchema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.ProjectNumber == nil {
		return nil, errors.New("invalid value for required argument 'ProjectNumber'")
	}
	if args.PropertyDefinitions == nil {
		return nil, errors.New("invalid value for required argument 'PropertyDefinitions'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DocumentAiWarehouseDocumentSchema
	err := ctx.RegisterResource("gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDocumentAiWarehouseDocumentSchema gets an existing DocumentAiWarehouseDocumentSchema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDocumentAiWarehouseDocumentSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DocumentAiWarehouseDocumentSchemaState, opts ...pulumi.ResourceOption) (*DocumentAiWarehouseDocumentSchema, error) {
	var resource DocumentAiWarehouseDocumentSchema
	err := ctx.ReadResource("gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DocumentAiWarehouseDocumentSchema resources.
type documentAiWarehouseDocumentSchemaState struct {
	// Name of the schema given by the user.
	DisplayName *string `pulumi:"displayName"`
	// Tells whether the document is a folder or a typical document.
	DocumentIsFolder *bool `pulumi:"documentIsFolder"`
	// The location of the resource.
	Location *string `pulumi:"location"`
	// The name of the metadata property.
	//
	// (Optional)
	// The schema name in the source.
	//
	// (Required)
	// The name of the metadata property.
	//
	// (Optional)
	// The schema name in the source.
	Name *string `pulumi:"name"`
	// The unique identifier of the project.
	ProjectNumber *string `pulumi:"projectNumber"`
	// Defines the metadata for a schema property.
	// Structure is documented below.
	PropertyDefinitions []DocumentAiWarehouseDocumentSchemaPropertyDefinition `pulumi:"propertyDefinitions"`
}

type DocumentAiWarehouseDocumentSchemaState struct {
	// Name of the schema given by the user.
	DisplayName pulumi.StringPtrInput
	// Tells whether the document is a folder or a typical document.
	DocumentIsFolder pulumi.BoolPtrInput
	// The location of the resource.
	Location pulumi.StringPtrInput
	// The name of the metadata property.
	//
	// (Optional)
	// The schema name in the source.
	//
	// (Required)
	// The name of the metadata property.
	//
	// (Optional)
	// The schema name in the source.
	Name pulumi.StringPtrInput
	// The unique identifier of the project.
	ProjectNumber pulumi.StringPtrInput
	// Defines the metadata for a schema property.
	// Structure is documented below.
	PropertyDefinitions DocumentAiWarehouseDocumentSchemaPropertyDefinitionArrayInput
}

func (DocumentAiWarehouseDocumentSchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*documentAiWarehouseDocumentSchemaState)(nil)).Elem()
}

type documentAiWarehouseDocumentSchemaArgs struct {
	// Name of the schema given by the user.
	DisplayName string `pulumi:"displayName"`
	// Tells whether the document is a folder or a typical document.
	DocumentIsFolder *bool `pulumi:"documentIsFolder"`
	// The location of the resource.
	Location string `pulumi:"location"`
	// The unique identifier of the project.
	ProjectNumber string `pulumi:"projectNumber"`
	// Defines the metadata for a schema property.
	// Structure is documented below.
	PropertyDefinitions []DocumentAiWarehouseDocumentSchemaPropertyDefinition `pulumi:"propertyDefinitions"`
}

// The set of arguments for constructing a DocumentAiWarehouseDocumentSchema resource.
type DocumentAiWarehouseDocumentSchemaArgs struct {
	// Name of the schema given by the user.
	DisplayName pulumi.StringInput
	// Tells whether the document is a folder or a typical document.
	DocumentIsFolder pulumi.BoolPtrInput
	// The location of the resource.
	Location pulumi.StringInput
	// The unique identifier of the project.
	ProjectNumber pulumi.StringInput
	// Defines the metadata for a schema property.
	// Structure is documented below.
	PropertyDefinitions DocumentAiWarehouseDocumentSchemaPropertyDefinitionArrayInput
}

func (DocumentAiWarehouseDocumentSchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*documentAiWarehouseDocumentSchemaArgs)(nil)).Elem()
}

type DocumentAiWarehouseDocumentSchemaInput interface {
	pulumi.Input

	ToDocumentAiWarehouseDocumentSchemaOutput() DocumentAiWarehouseDocumentSchemaOutput
	ToDocumentAiWarehouseDocumentSchemaOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaOutput
}

func (*DocumentAiWarehouseDocumentSchema) ElementType() reflect.Type {
	return reflect.TypeOf((**DocumentAiWarehouseDocumentSchema)(nil)).Elem()
}

func (i *DocumentAiWarehouseDocumentSchema) ToDocumentAiWarehouseDocumentSchemaOutput() DocumentAiWarehouseDocumentSchemaOutput {
	return i.ToDocumentAiWarehouseDocumentSchemaOutputWithContext(context.Background())
}

func (i *DocumentAiWarehouseDocumentSchema) ToDocumentAiWarehouseDocumentSchemaOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DocumentAiWarehouseDocumentSchemaOutput)
}

// DocumentAiWarehouseDocumentSchemaArrayInput is an input type that accepts DocumentAiWarehouseDocumentSchemaArray and DocumentAiWarehouseDocumentSchemaArrayOutput values.
// You can construct a concrete instance of `DocumentAiWarehouseDocumentSchemaArrayInput` via:
//
//	DocumentAiWarehouseDocumentSchemaArray{ DocumentAiWarehouseDocumentSchemaArgs{...} }
type DocumentAiWarehouseDocumentSchemaArrayInput interface {
	pulumi.Input

	ToDocumentAiWarehouseDocumentSchemaArrayOutput() DocumentAiWarehouseDocumentSchemaArrayOutput
	ToDocumentAiWarehouseDocumentSchemaArrayOutputWithContext(context.Context) DocumentAiWarehouseDocumentSchemaArrayOutput
}

type DocumentAiWarehouseDocumentSchemaArray []DocumentAiWarehouseDocumentSchemaInput

func (DocumentAiWarehouseDocumentSchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DocumentAiWarehouseDocumentSchema)(nil)).Elem()
}

func (i DocumentAiWarehouseDocumentSchemaArray) ToDocumentAiWarehouseDocumentSchemaArrayOutput() DocumentAiWarehouseDocumentSchemaArrayOutput {
	return i.ToDocumentAiWarehouseDocumentSchemaArrayOutputWithContext(context.Background())
}

func (i DocumentAiWarehouseDocumentSchemaArray) ToDocumentAiWarehouseDocumentSchemaArrayOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DocumentAiWarehouseDocumentSchemaArrayOutput)
}

// DocumentAiWarehouseDocumentSchemaMapInput is an input type that accepts DocumentAiWarehouseDocumentSchemaMap and DocumentAiWarehouseDocumentSchemaMapOutput values.
// You can construct a concrete instance of `DocumentAiWarehouseDocumentSchemaMapInput` via:
//
//	DocumentAiWarehouseDocumentSchemaMap{ "key": DocumentAiWarehouseDocumentSchemaArgs{...} }
type DocumentAiWarehouseDocumentSchemaMapInput interface {
	pulumi.Input

	ToDocumentAiWarehouseDocumentSchemaMapOutput() DocumentAiWarehouseDocumentSchemaMapOutput
	ToDocumentAiWarehouseDocumentSchemaMapOutputWithContext(context.Context) DocumentAiWarehouseDocumentSchemaMapOutput
}

type DocumentAiWarehouseDocumentSchemaMap map[string]DocumentAiWarehouseDocumentSchemaInput

func (DocumentAiWarehouseDocumentSchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DocumentAiWarehouseDocumentSchema)(nil)).Elem()
}

func (i DocumentAiWarehouseDocumentSchemaMap) ToDocumentAiWarehouseDocumentSchemaMapOutput() DocumentAiWarehouseDocumentSchemaMapOutput {
	return i.ToDocumentAiWarehouseDocumentSchemaMapOutputWithContext(context.Background())
}

func (i DocumentAiWarehouseDocumentSchemaMap) ToDocumentAiWarehouseDocumentSchemaMapOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DocumentAiWarehouseDocumentSchemaMapOutput)
}

type DocumentAiWarehouseDocumentSchemaOutput struct{ *pulumi.OutputState }

func (DocumentAiWarehouseDocumentSchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DocumentAiWarehouseDocumentSchema)(nil)).Elem()
}

func (o DocumentAiWarehouseDocumentSchemaOutput) ToDocumentAiWarehouseDocumentSchemaOutput() DocumentAiWarehouseDocumentSchemaOutput {
	return o
}

func (o DocumentAiWarehouseDocumentSchemaOutput) ToDocumentAiWarehouseDocumentSchemaOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaOutput {
	return o
}

// Name of the schema given by the user.
func (o DocumentAiWarehouseDocumentSchemaOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *DocumentAiWarehouseDocumentSchema) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Tells whether the document is a folder or a typical document.
func (o DocumentAiWarehouseDocumentSchemaOutput) DocumentIsFolder() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DocumentAiWarehouseDocumentSchema) pulumi.BoolPtrOutput { return v.DocumentIsFolder }).(pulumi.BoolPtrOutput)
}

// The location of the resource.
func (o DocumentAiWarehouseDocumentSchemaOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *DocumentAiWarehouseDocumentSchema) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the metadata property.
//
// (Optional)
// The schema name in the source.
//
// (Required)
// The name of the metadata property.
//
// (Optional)
// The schema name in the source.
func (o DocumentAiWarehouseDocumentSchemaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DocumentAiWarehouseDocumentSchema) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique identifier of the project.
func (o DocumentAiWarehouseDocumentSchemaOutput) ProjectNumber() pulumi.StringOutput {
	return o.ApplyT(func(v *DocumentAiWarehouseDocumentSchema) pulumi.StringOutput { return v.ProjectNumber }).(pulumi.StringOutput)
}

// Defines the metadata for a schema property.
// Structure is documented below.
func (o DocumentAiWarehouseDocumentSchemaOutput) PropertyDefinitions() DocumentAiWarehouseDocumentSchemaPropertyDefinitionArrayOutput {
	return o.ApplyT(func(v *DocumentAiWarehouseDocumentSchema) DocumentAiWarehouseDocumentSchemaPropertyDefinitionArrayOutput {
		return v.PropertyDefinitions
	}).(DocumentAiWarehouseDocumentSchemaPropertyDefinitionArrayOutput)
}

type DocumentAiWarehouseDocumentSchemaArrayOutput struct{ *pulumi.OutputState }

func (DocumentAiWarehouseDocumentSchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DocumentAiWarehouseDocumentSchema)(nil)).Elem()
}

func (o DocumentAiWarehouseDocumentSchemaArrayOutput) ToDocumentAiWarehouseDocumentSchemaArrayOutput() DocumentAiWarehouseDocumentSchemaArrayOutput {
	return o
}

func (o DocumentAiWarehouseDocumentSchemaArrayOutput) ToDocumentAiWarehouseDocumentSchemaArrayOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaArrayOutput {
	return o
}

func (o DocumentAiWarehouseDocumentSchemaArrayOutput) Index(i pulumi.IntInput) DocumentAiWarehouseDocumentSchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DocumentAiWarehouseDocumentSchema {
		return vs[0].([]*DocumentAiWarehouseDocumentSchema)[vs[1].(int)]
	}).(DocumentAiWarehouseDocumentSchemaOutput)
}

type DocumentAiWarehouseDocumentSchemaMapOutput struct{ *pulumi.OutputState }

func (DocumentAiWarehouseDocumentSchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DocumentAiWarehouseDocumentSchema)(nil)).Elem()
}

func (o DocumentAiWarehouseDocumentSchemaMapOutput) ToDocumentAiWarehouseDocumentSchemaMapOutput() DocumentAiWarehouseDocumentSchemaMapOutput {
	return o
}

func (o DocumentAiWarehouseDocumentSchemaMapOutput) ToDocumentAiWarehouseDocumentSchemaMapOutputWithContext(ctx context.Context) DocumentAiWarehouseDocumentSchemaMapOutput {
	return o
}

func (o DocumentAiWarehouseDocumentSchemaMapOutput) MapIndex(k pulumi.StringInput) DocumentAiWarehouseDocumentSchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DocumentAiWarehouseDocumentSchema {
		return vs[0].(map[string]*DocumentAiWarehouseDocumentSchema)[vs[1].(string)]
	}).(DocumentAiWarehouseDocumentSchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DocumentAiWarehouseDocumentSchemaInput)(nil)).Elem(), &DocumentAiWarehouseDocumentSchema{})
	pulumi.RegisterInputType(reflect.TypeOf((*DocumentAiWarehouseDocumentSchemaArrayInput)(nil)).Elem(), DocumentAiWarehouseDocumentSchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DocumentAiWarehouseDocumentSchemaMapInput)(nil)).Elem(), DocumentAiWarehouseDocumentSchemaMap{})
	pulumi.RegisterOutputType(DocumentAiWarehouseDocumentSchemaOutput{})
	pulumi.RegisterOutputType(DocumentAiWarehouseDocumentSchemaArrayOutput{})
	pulumi.RegisterOutputType(DocumentAiWarehouseDocumentSchemaMapOutput{})
}