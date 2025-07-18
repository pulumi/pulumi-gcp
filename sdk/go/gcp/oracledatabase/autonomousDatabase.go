// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oracledatabase

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An AutonomousDatabase resource.
//
// To get more information about AutonomousDatabase, see:
//
// * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases)
// * How-to Guides
//   - [Create Autonomous databases](https://cloud.google.com/oracle/database/docs/create-databases)
//
// ## Example Usage
//
// ### Oracledatabase Autonomous Database Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/oracledatabase"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := compute.LookupNetwork(ctx, &compute.LookupNetworkArgs{
//				Name:    "new",
//				Project: pulumi.StringRef("my-project"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = oracledatabase.NewAutonomousDatabase(ctx, "myADB", &oracledatabase.AutonomousDatabaseArgs{
//				AutonomousDatabaseId: pulumi.String("my-instance"),
//				Location:             pulumi.String("us-east4"),
//				Project:              pulumi.String("my-project"),
//				Database:             pulumi.String("mydatabase"),
//				AdminPassword:        pulumi.String("123Abpassword"),
//				Network:              pulumi.String(_default.Id),
//				Cidr:                 pulumi.String("10.5.0.0/24"),
//				Properties: &oracledatabase.AutonomousDatabasePropertiesArgs{
//					ComputeCount:      pulumi.Float64(2),
//					DataStorageSizeTb: pulumi.Int(1),
//					DbVersion:         pulumi.String("19c"),
//					DbWorkload:        pulumi.String("OLTP"),
//					LicenseType:       pulumi.String("LICENSE_INCLUDED"),
//				},
//				DeletionProtection: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Oracledatabase Autonomous Database Full
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/oracledatabase"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := compute.LookupNetwork(ctx, &compute.LookupNetworkArgs{
//				Name:    "new",
//				Project: pulumi.StringRef("my-project"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = oracledatabase.NewAutonomousDatabase(ctx, "myADB", &oracledatabase.AutonomousDatabaseArgs{
//				AutonomousDatabaseId: pulumi.String("my-instance"),
//				Location:             pulumi.String("us-east4"),
//				Project:              pulumi.String("my-project"),
//				DisplayName:          pulumi.String("autonomousDatabase displayname"),
//				Database:             pulumi.String("mydatabase"),
//				AdminPassword:        pulumi.String("123Abpassword"),
//				Network:              pulumi.String(_default.Id),
//				Cidr:                 pulumi.String("10.5.0.0/24"),
//				Labels: pulumi.StringMap{
//					"label-one": pulumi.String("value-one"),
//				},
//				Properties: &oracledatabase.AutonomousDatabasePropertiesArgs{
//					ComputeCount:                pulumi.Float64(2),
//					DataStorageSizeGb:           pulumi.Int(48),
//					DbVersion:                   pulumi.String("19c"),
//					DbEdition:                   pulumi.String("STANDARD_EDITION"),
//					DbWorkload:                  pulumi.String("OLTP"),
//					IsAutoScalingEnabled:        pulumi.Bool(true),
//					LicenseType:                 pulumi.String("BRING_YOUR_OWN_LICENSE"),
//					BackupRetentionPeriodDays:   pulumi.Int(60),
//					CharacterSet:                pulumi.String("AL32UTF8"),
//					IsStorageAutoScalingEnabled: pulumi.Bool(false),
//					MaintenanceScheduleType:     pulumi.String("REGULAR"),
//					MtlsConnectionRequired:      pulumi.Bool(false),
//					NCharacterSet:               pulumi.String("AL16UTF16"),
//					OperationsInsightsState:     pulumi.String("NOT_ENABLED"),
//					CustomerContacts: oracledatabase.AutonomousDatabasePropertiesCustomerContactArray{
//						&oracledatabase.AutonomousDatabasePropertiesCustomerContactArgs{
//							Email: pulumi.String("xyz@example.com"),
//						},
//					},
//					PrivateEndpointIp:    pulumi.String("10.5.0.11"),
//					PrivateEndpointLabel: pulumi.String("myendpoint"),
//				},
//				DeletionProtection: pulumi.Bool(true),
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
// AutonomousDatabase can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{location}}/autonomousDatabases/{{autonomous_database_id}}`
//
// * `{{project}}/{{location}}/{{autonomous_database_id}}`
//
// * `{{location}}/{{autonomous_database_id}}`
//
// When using the `pulumi import` command, AutonomousDatabase can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:oracledatabase/autonomousDatabase:AutonomousDatabase default projects/{{project}}/locations/{{location}}/autonomousDatabases/{{autonomous_database_id}}
// ```
//
// ```sh
// $ pulumi import gcp:oracledatabase/autonomousDatabase:AutonomousDatabase default {{project}}/{{location}}/{{autonomous_database_id}}
// ```
//
// ```sh
// $ pulumi import gcp:oracledatabase/autonomousDatabase:AutonomousDatabase default {{location}}/{{autonomous_database_id}}
// ```
type AutonomousDatabase struct {
	pulumi.CustomResourceState

	// The password for the default ADMIN user.
	AdminPassword pulumi.StringPtrOutput `pulumi:"adminPassword"`
	// The ID of the Autonomous Database to create. This value is restricted
	// to (^a-z?$) and must be a maximum of 63
	// characters in length. The value must start with a letter and end with
	// a letter or a number.
	AutonomousDatabaseId pulumi.StringOutput `pulumi:"autonomousDatabaseId"`
	// The subnet CIDR range for the Autonmous Database.
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// The date and time that the Autonomous Database was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The name of the Autonomous Database. The database name must be unique in
	// the project. The name must begin with a letter and can
	// contain a maximum of 30 alphanumeric characters.
	Database           pulumi.StringOutput  `pulumi:"database"`
	DeletionProtection pulumi.BoolPtrOutput `pulumi:"deletionProtection"`
	// The display name for the Autonomous Database. The name does not have to
	// be unique within your project.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapOutput `pulumi:"effectiveLabels"`
	// The ID of the subscription entitlement associated with the Autonomous
	// Database.
	EntitlementId pulumi.StringOutput `pulumi:"entitlementId"`
	// The labels or tags associated with the Autonomous Database.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/AutonomousDatabaseBackup`.
	Location pulumi.StringOutput `pulumi:"location"`
	// Identifier. The name of the Autonomous Database resource in the following format:
	// projects/{project}/locations/{region}/autonomousDatabases/{autonomous_database}
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the VPC network used by the Autonomous Database.
	// Format: projects/{project}/global/networks/{network}
	Network pulumi.StringOutput `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The properties of an Autonomous Database.
	// Structure is documented below.
	Properties AutonomousDatabasePropertiesOutput `pulumi:"properties"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapOutput `pulumi:"pulumiLabels"`
}

// NewAutonomousDatabase registers a new resource with the given unique name, arguments, and options.
func NewAutonomousDatabase(ctx *pulumi.Context,
	name string, args *AutonomousDatabaseArgs, opts ...pulumi.ResourceOption) (*AutonomousDatabase, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutonomousDatabaseId == nil {
		return nil, errors.New("invalid value for required argument 'AutonomousDatabaseId'")
	}
	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	if args.Properties == nil {
		return nil, errors.New("invalid value for required argument 'Properties'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"effectiveLabels",
		"pulumiLabels",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutonomousDatabase
	err := ctx.RegisterResource("gcp:oracledatabase/autonomousDatabase:AutonomousDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutonomousDatabase gets an existing AutonomousDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutonomousDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutonomousDatabaseState, opts ...pulumi.ResourceOption) (*AutonomousDatabase, error) {
	var resource AutonomousDatabase
	err := ctx.ReadResource("gcp:oracledatabase/autonomousDatabase:AutonomousDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutonomousDatabase resources.
type autonomousDatabaseState struct {
	// The password for the default ADMIN user.
	AdminPassword *string `pulumi:"adminPassword"`
	// The ID of the Autonomous Database to create. This value is restricted
	// to (^a-z?$) and must be a maximum of 63
	// characters in length. The value must start with a letter and end with
	// a letter or a number.
	AutonomousDatabaseId *string `pulumi:"autonomousDatabaseId"`
	// The subnet CIDR range for the Autonmous Database.
	Cidr *string `pulumi:"cidr"`
	// The date and time that the Autonomous Database was created.
	CreateTime *string `pulumi:"createTime"`
	// The name of the Autonomous Database. The database name must be unique in
	// the project. The name must begin with a letter and can
	// contain a maximum of 30 alphanumeric characters.
	Database           *string `pulumi:"database"`
	DeletionProtection *bool   `pulumi:"deletionProtection"`
	// The display name for the Autonomous Database. The name does not have to
	// be unique within your project.
	DisplayName *string `pulumi:"displayName"`
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels map[string]string `pulumi:"effectiveLabels"`
	// The ID of the subscription entitlement associated with the Autonomous
	// Database.
	EntitlementId *string `pulumi:"entitlementId"`
	// The labels or tags associated with the Autonomous Database.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/AutonomousDatabaseBackup`.
	Location *string `pulumi:"location"`
	// Identifier. The name of the Autonomous Database resource in the following format:
	// projects/{project}/locations/{region}/autonomousDatabases/{autonomous_database}
	Name *string `pulumi:"name"`
	// The name of the VPC network used by the Autonomous Database.
	// Format: projects/{project}/global/networks/{network}
	Network *string `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The properties of an Autonomous Database.
	// Structure is documented below.
	Properties *AutonomousDatabaseProperties `pulumi:"properties"`
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels map[string]string `pulumi:"pulumiLabels"`
}

type AutonomousDatabaseState struct {
	// The password for the default ADMIN user.
	AdminPassword pulumi.StringPtrInput
	// The ID of the Autonomous Database to create. This value is restricted
	// to (^a-z?$) and must be a maximum of 63
	// characters in length. The value must start with a letter and end with
	// a letter or a number.
	AutonomousDatabaseId pulumi.StringPtrInput
	// The subnet CIDR range for the Autonmous Database.
	Cidr pulumi.StringPtrInput
	// The date and time that the Autonomous Database was created.
	CreateTime pulumi.StringPtrInput
	// The name of the Autonomous Database. The database name must be unique in
	// the project. The name must begin with a letter and can
	// contain a maximum of 30 alphanumeric characters.
	Database           pulumi.StringPtrInput
	DeletionProtection pulumi.BoolPtrInput
	// The display name for the Autonomous Database. The name does not have to
	// be unique within your project.
	DisplayName pulumi.StringPtrInput
	// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
	EffectiveLabels pulumi.StringMapInput
	// The ID of the subscription entitlement associated with the Autonomous
	// Database.
	EntitlementId pulumi.StringPtrInput
	// The labels or tags associated with the Autonomous Database.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/AutonomousDatabaseBackup`.
	Location pulumi.StringPtrInput
	// Identifier. The name of the Autonomous Database resource in the following format:
	// projects/{project}/locations/{region}/autonomousDatabases/{autonomous_database}
	Name pulumi.StringPtrInput
	// The name of the VPC network used by the Autonomous Database.
	// Format: projects/{project}/global/networks/{network}
	Network pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The properties of an Autonomous Database.
	// Structure is documented below.
	Properties AutonomousDatabasePropertiesPtrInput
	// The combination of labels configured directly on the resource
	// and default labels configured on the provider.
	PulumiLabels pulumi.StringMapInput
}

func (AutonomousDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*autonomousDatabaseState)(nil)).Elem()
}

type autonomousDatabaseArgs struct {
	// The password for the default ADMIN user.
	AdminPassword *string `pulumi:"adminPassword"`
	// The ID of the Autonomous Database to create. This value is restricted
	// to (^a-z?$) and must be a maximum of 63
	// characters in length. The value must start with a letter and end with
	// a letter or a number.
	AutonomousDatabaseId string `pulumi:"autonomousDatabaseId"`
	// The subnet CIDR range for the Autonmous Database.
	Cidr string `pulumi:"cidr"`
	// The name of the Autonomous Database. The database name must be unique in
	// the project. The name must begin with a letter and can
	// contain a maximum of 30 alphanumeric characters.
	Database           string `pulumi:"database"`
	DeletionProtection *bool  `pulumi:"deletionProtection"`
	// The display name for the Autonomous Database. The name does not have to
	// be unique within your project.
	DisplayName *string `pulumi:"displayName"`
	// The labels or tags associated with the Autonomous Database.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels map[string]string `pulumi:"labels"`
	// Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/AutonomousDatabaseBackup`.
	Location string `pulumi:"location"`
	// The name of the VPC network used by the Autonomous Database.
	// Format: projects/{project}/global/networks/{network}
	Network string `pulumi:"network"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The properties of an Autonomous Database.
	// Structure is documented below.
	Properties AutonomousDatabaseProperties `pulumi:"properties"`
}

// The set of arguments for constructing a AutonomousDatabase resource.
type AutonomousDatabaseArgs struct {
	// The password for the default ADMIN user.
	AdminPassword pulumi.StringPtrInput
	// The ID of the Autonomous Database to create. This value is restricted
	// to (^a-z?$) and must be a maximum of 63
	// characters in length. The value must start with a letter and end with
	// a letter or a number.
	AutonomousDatabaseId pulumi.StringInput
	// The subnet CIDR range for the Autonmous Database.
	Cidr pulumi.StringInput
	// The name of the Autonomous Database. The database name must be unique in
	// the project. The name must begin with a letter and can
	// contain a maximum of 30 alphanumeric characters.
	Database           pulumi.StringInput
	DeletionProtection pulumi.BoolPtrInput
	// The display name for the Autonomous Database. The name does not have to
	// be unique within your project.
	DisplayName pulumi.StringPtrInput
	// The labels or tags associated with the Autonomous Database.
	// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
	// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
	Labels pulumi.StringMapInput
	// Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/AutonomousDatabaseBackup`.
	Location pulumi.StringInput
	// The name of the VPC network used by the Autonomous Database.
	// Format: projects/{project}/global/networks/{network}
	Network pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The properties of an Autonomous Database.
	// Structure is documented below.
	Properties AutonomousDatabasePropertiesInput
}

func (AutonomousDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*autonomousDatabaseArgs)(nil)).Elem()
}

type AutonomousDatabaseInput interface {
	pulumi.Input

	ToAutonomousDatabaseOutput() AutonomousDatabaseOutput
	ToAutonomousDatabaseOutputWithContext(ctx context.Context) AutonomousDatabaseOutput
}

func (*AutonomousDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**AutonomousDatabase)(nil)).Elem()
}

func (i *AutonomousDatabase) ToAutonomousDatabaseOutput() AutonomousDatabaseOutput {
	return i.ToAutonomousDatabaseOutputWithContext(context.Background())
}

func (i *AutonomousDatabase) ToAutonomousDatabaseOutputWithContext(ctx context.Context) AutonomousDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutonomousDatabaseOutput)
}

// AutonomousDatabaseArrayInput is an input type that accepts AutonomousDatabaseArray and AutonomousDatabaseArrayOutput values.
// You can construct a concrete instance of `AutonomousDatabaseArrayInput` via:
//
//	AutonomousDatabaseArray{ AutonomousDatabaseArgs{...} }
type AutonomousDatabaseArrayInput interface {
	pulumi.Input

	ToAutonomousDatabaseArrayOutput() AutonomousDatabaseArrayOutput
	ToAutonomousDatabaseArrayOutputWithContext(context.Context) AutonomousDatabaseArrayOutput
}

type AutonomousDatabaseArray []AutonomousDatabaseInput

func (AutonomousDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutonomousDatabase)(nil)).Elem()
}

func (i AutonomousDatabaseArray) ToAutonomousDatabaseArrayOutput() AutonomousDatabaseArrayOutput {
	return i.ToAutonomousDatabaseArrayOutputWithContext(context.Background())
}

func (i AutonomousDatabaseArray) ToAutonomousDatabaseArrayOutputWithContext(ctx context.Context) AutonomousDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutonomousDatabaseArrayOutput)
}

// AutonomousDatabaseMapInput is an input type that accepts AutonomousDatabaseMap and AutonomousDatabaseMapOutput values.
// You can construct a concrete instance of `AutonomousDatabaseMapInput` via:
//
//	AutonomousDatabaseMap{ "key": AutonomousDatabaseArgs{...} }
type AutonomousDatabaseMapInput interface {
	pulumi.Input

	ToAutonomousDatabaseMapOutput() AutonomousDatabaseMapOutput
	ToAutonomousDatabaseMapOutputWithContext(context.Context) AutonomousDatabaseMapOutput
}

type AutonomousDatabaseMap map[string]AutonomousDatabaseInput

func (AutonomousDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutonomousDatabase)(nil)).Elem()
}

func (i AutonomousDatabaseMap) ToAutonomousDatabaseMapOutput() AutonomousDatabaseMapOutput {
	return i.ToAutonomousDatabaseMapOutputWithContext(context.Background())
}

func (i AutonomousDatabaseMap) ToAutonomousDatabaseMapOutputWithContext(ctx context.Context) AutonomousDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutonomousDatabaseMapOutput)
}

type AutonomousDatabaseOutput struct{ *pulumi.OutputState }

func (AutonomousDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutonomousDatabase)(nil)).Elem()
}

func (o AutonomousDatabaseOutput) ToAutonomousDatabaseOutput() AutonomousDatabaseOutput {
	return o
}

func (o AutonomousDatabaseOutput) ToAutonomousDatabaseOutputWithContext(ctx context.Context) AutonomousDatabaseOutput {
	return o
}

// The password for the default ADMIN user.
func (o AutonomousDatabaseOutput) AdminPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringPtrOutput { return v.AdminPassword }).(pulumi.StringPtrOutput)
}

// The ID of the Autonomous Database to create. This value is restricted
// to (^a-z?$) and must be a maximum of 63
// characters in length. The value must start with a letter and end with
// a letter or a number.
func (o AutonomousDatabaseOutput) AutonomousDatabaseId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.AutonomousDatabaseId }).(pulumi.StringOutput)
}

// The subnet CIDR range for the Autonmous Database.
func (o AutonomousDatabaseOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// The date and time that the Autonomous Database was created.
func (o AutonomousDatabaseOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The name of the Autonomous Database. The database name must be unique in
// the project. The name must begin with a letter and can
// contain a maximum of 30 alphanumeric characters.
func (o AutonomousDatabaseOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

func (o AutonomousDatabaseOutput) DeletionProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.BoolPtrOutput { return v.DeletionProtection }).(pulumi.BoolPtrOutput)
}

// The display name for the Autonomous Database. The name does not have to
// be unique within your project.
func (o AutonomousDatabaseOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
func (o AutonomousDatabaseOutput) EffectiveLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringMapOutput { return v.EffectiveLabels }).(pulumi.StringMapOutput)
}

// The ID of the subscription entitlement associated with the Autonomous
// Database.
func (o AutonomousDatabaseOutput) EntitlementId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.EntitlementId }).(pulumi.StringOutput)
}

// The labels or tags associated with the Autonomous Database.
// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
// Please refer to the field `effectiveLabels` for all of the labels present on the resource.
func (o AutonomousDatabaseOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/AutonomousDatabaseBackup`.
func (o AutonomousDatabaseOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Identifier. The name of the Autonomous Database resource in the following format:
// projects/{project}/locations/{region}/autonomousDatabases/{autonomous_database}
func (o AutonomousDatabaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the VPC network used by the Autonomous Database.
// Format: projects/{project}/global/networks/{network}
func (o AutonomousDatabaseOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.Network }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o AutonomousDatabaseOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The properties of an Autonomous Database.
// Structure is documented below.
func (o AutonomousDatabaseOutput) Properties() AutonomousDatabasePropertiesOutput {
	return o.ApplyT(func(v *AutonomousDatabase) AutonomousDatabasePropertiesOutput { return v.Properties }).(AutonomousDatabasePropertiesOutput)
}

// The combination of labels configured directly on the resource
// and default labels configured on the provider.
func (o AutonomousDatabaseOutput) PulumiLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AutonomousDatabase) pulumi.StringMapOutput { return v.PulumiLabels }).(pulumi.StringMapOutput)
}

type AutonomousDatabaseArrayOutput struct{ *pulumi.OutputState }

func (AutonomousDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutonomousDatabase)(nil)).Elem()
}

func (o AutonomousDatabaseArrayOutput) ToAutonomousDatabaseArrayOutput() AutonomousDatabaseArrayOutput {
	return o
}

func (o AutonomousDatabaseArrayOutput) ToAutonomousDatabaseArrayOutputWithContext(ctx context.Context) AutonomousDatabaseArrayOutput {
	return o
}

func (o AutonomousDatabaseArrayOutput) Index(i pulumi.IntInput) AutonomousDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutonomousDatabase {
		return vs[0].([]*AutonomousDatabase)[vs[1].(int)]
	}).(AutonomousDatabaseOutput)
}

type AutonomousDatabaseMapOutput struct{ *pulumi.OutputState }

func (AutonomousDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutonomousDatabase)(nil)).Elem()
}

func (o AutonomousDatabaseMapOutput) ToAutonomousDatabaseMapOutput() AutonomousDatabaseMapOutput {
	return o
}

func (o AutonomousDatabaseMapOutput) ToAutonomousDatabaseMapOutputWithContext(ctx context.Context) AutonomousDatabaseMapOutput {
	return o
}

func (o AutonomousDatabaseMapOutput) MapIndex(k pulumi.StringInput) AutonomousDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutonomousDatabase {
		return vs[0].(map[string]*AutonomousDatabase)[vs[1].(string)]
	}).(AutonomousDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutonomousDatabaseInput)(nil)).Elem(), &AutonomousDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutonomousDatabaseArrayInput)(nil)).Elem(), AutonomousDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutonomousDatabaseMapInput)(nil)).Elem(), AutonomousDatabaseMap{})
	pulumi.RegisterOutputType(AutonomousDatabaseOutput{})
	pulumi.RegisterOutputType(AutonomousDatabaseArrayOutput{})
	pulumi.RegisterOutputType(AutonomousDatabaseMapOutput{})
}
