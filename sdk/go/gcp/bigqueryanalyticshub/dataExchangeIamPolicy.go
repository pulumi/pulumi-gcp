// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigqueryanalyticshub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
//
// * `bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
// * `bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
// * `bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
//
// > **Note:** `bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `bigqueryanalyticshub.DataExchangeIamBinding` and `bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigqueryanalyticshub.DataExchangeIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/viewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bigqueryanalyticshub.NewDataExchangeIamPolicy(ctx, "policy", &bigqueryanalyticshub.DataExchangeIamPolicyArgs{
//				Project:        pulumi.Any(dataExchange.Project),
//				Location:       pulumi.Any(dataExchange.Location),
//				DataExchangeId: pulumi.Any(dataExchange.DataExchangeId),
//				PolicyData:     pulumi.String(admin.PolicyData),
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
// ## bigqueryanalyticshub.DataExchangeIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewDataExchangeIamBinding(ctx, "binding", &bigqueryanalyticshub.DataExchangeIamBindingArgs{
//				Project:        pulumi.Any(dataExchange.Project),
//				Location:       pulumi.Any(dataExchange.Location),
//				DataExchangeId: pulumi.Any(dataExchange.DataExchangeId),
//				Role:           pulumi.String("roles/viewer"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
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
// ## bigqueryanalyticshub.DataExchangeIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewDataExchangeIamMember(ctx, "member", &bigqueryanalyticshub.DataExchangeIamMemberArgs{
//				Project:        pulumi.Any(dataExchange.Project),
//				Location:       pulumi.Any(dataExchange.Location),
//				DataExchangeId: pulumi.Any(dataExchange.DataExchangeId),
//				Role:           pulumi.String("roles/viewer"),
//				Member:         pulumi.String("user:jane@example.com"),
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
// ## This resource supports User Project Overrides.
//
// -
//
// # IAM policy for BigQuery Analytics Hub DataExchange
// Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
//
// * `bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
// * `bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
// * `bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
//
// > **Note:** `bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `bigqueryanalyticshub.DataExchangeIamBinding` and `bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigqueryanalyticshub.DataExchangeIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/viewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bigqueryanalyticshub.NewDataExchangeIamPolicy(ctx, "policy", &bigqueryanalyticshub.DataExchangeIamPolicyArgs{
//				Project:        pulumi.Any(dataExchange.Project),
//				Location:       pulumi.Any(dataExchange.Location),
//				DataExchangeId: pulumi.Any(dataExchange.DataExchangeId),
//				PolicyData:     pulumi.String(admin.PolicyData),
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
// ## bigqueryanalyticshub.DataExchangeIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewDataExchangeIamBinding(ctx, "binding", &bigqueryanalyticshub.DataExchangeIamBindingArgs{
//				Project:        pulumi.Any(dataExchange.Project),
//				Location:       pulumi.Any(dataExchange.Location),
//				DataExchangeId: pulumi.Any(dataExchange.DataExchangeId),
//				Role:           pulumi.String("roles/viewer"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
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
// ## bigqueryanalyticshub.DataExchangeIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewDataExchangeIamMember(ctx, "member", &bigqueryanalyticshub.DataExchangeIamMemberArgs{
//				Project:        pulumi.Any(dataExchange.Project),
//				Location:       pulumi.Any(dataExchange.Location),
//				DataExchangeId: pulumi.Any(dataExchange.DataExchangeId),
//				Role:           pulumi.String("roles/viewer"),
//				Member:         pulumi.String("user:jane@example.com"),
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
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
//
// * {{project}}/{{location}}/{{data_exchange_id}}
//
// * {{location}}/{{data_exchange_id}}
//
// * {{data_exchange_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// BigQuery Analytics Hub dataexchange IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:bigqueryanalyticshub/dataExchangeIamPolicy:DataExchangeIamPolicy editor "projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:bigqueryanalyticshub/dataExchangeIamPolicy:DataExchangeIamPolicy editor "projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:bigqueryanalyticshub/dataExchangeIamPolicy:DataExchangeIamPolicy editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type DataExchangeIamPolicy struct {
	pulumi.CustomResourceState

	// Used to find the parent resource to bind the IAM policy to
	DataExchangeId pulumi.StringOutput `pulumi:"dataExchangeId"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name of the location this data exchange.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewDataExchangeIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewDataExchangeIamPolicy(ctx *pulumi.Context,
	name string, args *DataExchangeIamPolicyArgs, opts ...pulumi.ResourceOption) (*DataExchangeIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataExchangeId == nil {
		return nil, errors.New("invalid value for required argument 'DataExchangeId'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataExchangeIamPolicy
	err := ctx.RegisterResource("gcp:bigqueryanalyticshub/dataExchangeIamPolicy:DataExchangeIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataExchangeIamPolicy gets an existing DataExchangeIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataExchangeIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataExchangeIamPolicyState, opts ...pulumi.ResourceOption) (*DataExchangeIamPolicy, error) {
	var resource DataExchangeIamPolicy
	err := ctx.ReadResource("gcp:bigqueryanalyticshub/dataExchangeIamPolicy:DataExchangeIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataExchangeIamPolicy resources.
type dataExchangeIamPolicyState struct {
	// Used to find the parent resource to bind the IAM policy to
	DataExchangeId *string `pulumi:"dataExchangeId"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The name of the location this data exchange.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

type DataExchangeIamPolicyState struct {
	// Used to find the parent resource to bind the IAM policy to
	DataExchangeId pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The name of the location this data exchange.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DataExchangeIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataExchangeIamPolicyState)(nil)).Elem()
}

type dataExchangeIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	DataExchangeId string `pulumi:"dataExchangeId"`
	// The name of the location this data exchange.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a DataExchangeIamPolicy resource.
type DataExchangeIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	DataExchangeId pulumi.StringInput
	// The name of the location this data exchange.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DataExchangeIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataExchangeIamPolicyArgs)(nil)).Elem()
}

type DataExchangeIamPolicyInput interface {
	pulumi.Input

	ToDataExchangeIamPolicyOutput() DataExchangeIamPolicyOutput
	ToDataExchangeIamPolicyOutputWithContext(ctx context.Context) DataExchangeIamPolicyOutput
}

func (*DataExchangeIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**DataExchangeIamPolicy)(nil)).Elem()
}

func (i *DataExchangeIamPolicy) ToDataExchangeIamPolicyOutput() DataExchangeIamPolicyOutput {
	return i.ToDataExchangeIamPolicyOutputWithContext(context.Background())
}

func (i *DataExchangeIamPolicy) ToDataExchangeIamPolicyOutputWithContext(ctx context.Context) DataExchangeIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataExchangeIamPolicyOutput)
}

// DataExchangeIamPolicyArrayInput is an input type that accepts DataExchangeIamPolicyArray and DataExchangeIamPolicyArrayOutput values.
// You can construct a concrete instance of `DataExchangeIamPolicyArrayInput` via:
//
//	DataExchangeIamPolicyArray{ DataExchangeIamPolicyArgs{...} }
type DataExchangeIamPolicyArrayInput interface {
	pulumi.Input

	ToDataExchangeIamPolicyArrayOutput() DataExchangeIamPolicyArrayOutput
	ToDataExchangeIamPolicyArrayOutputWithContext(context.Context) DataExchangeIamPolicyArrayOutput
}

type DataExchangeIamPolicyArray []DataExchangeIamPolicyInput

func (DataExchangeIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataExchangeIamPolicy)(nil)).Elem()
}

func (i DataExchangeIamPolicyArray) ToDataExchangeIamPolicyArrayOutput() DataExchangeIamPolicyArrayOutput {
	return i.ToDataExchangeIamPolicyArrayOutputWithContext(context.Background())
}

func (i DataExchangeIamPolicyArray) ToDataExchangeIamPolicyArrayOutputWithContext(ctx context.Context) DataExchangeIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataExchangeIamPolicyArrayOutput)
}

// DataExchangeIamPolicyMapInput is an input type that accepts DataExchangeIamPolicyMap and DataExchangeIamPolicyMapOutput values.
// You can construct a concrete instance of `DataExchangeIamPolicyMapInput` via:
//
//	DataExchangeIamPolicyMap{ "key": DataExchangeIamPolicyArgs{...} }
type DataExchangeIamPolicyMapInput interface {
	pulumi.Input

	ToDataExchangeIamPolicyMapOutput() DataExchangeIamPolicyMapOutput
	ToDataExchangeIamPolicyMapOutputWithContext(context.Context) DataExchangeIamPolicyMapOutput
}

type DataExchangeIamPolicyMap map[string]DataExchangeIamPolicyInput

func (DataExchangeIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataExchangeIamPolicy)(nil)).Elem()
}

func (i DataExchangeIamPolicyMap) ToDataExchangeIamPolicyMapOutput() DataExchangeIamPolicyMapOutput {
	return i.ToDataExchangeIamPolicyMapOutputWithContext(context.Background())
}

func (i DataExchangeIamPolicyMap) ToDataExchangeIamPolicyMapOutputWithContext(ctx context.Context) DataExchangeIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataExchangeIamPolicyMapOutput)
}

type DataExchangeIamPolicyOutput struct{ *pulumi.OutputState }

func (DataExchangeIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataExchangeIamPolicy)(nil)).Elem()
}

func (o DataExchangeIamPolicyOutput) ToDataExchangeIamPolicyOutput() DataExchangeIamPolicyOutput {
	return o
}

func (o DataExchangeIamPolicyOutput) ToDataExchangeIamPolicyOutputWithContext(ctx context.Context) DataExchangeIamPolicyOutput {
	return o
}

// Used to find the parent resource to bind the IAM policy to
func (o DataExchangeIamPolicyOutput) DataExchangeId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExchangeIamPolicy) pulumi.StringOutput { return v.DataExchangeId }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o DataExchangeIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExchangeIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name of the location this data exchange.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o DataExchangeIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExchangeIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o DataExchangeIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExchangeIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o DataExchangeIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExchangeIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type DataExchangeIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (DataExchangeIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataExchangeIamPolicy)(nil)).Elem()
}

func (o DataExchangeIamPolicyArrayOutput) ToDataExchangeIamPolicyArrayOutput() DataExchangeIamPolicyArrayOutput {
	return o
}

func (o DataExchangeIamPolicyArrayOutput) ToDataExchangeIamPolicyArrayOutputWithContext(ctx context.Context) DataExchangeIamPolicyArrayOutput {
	return o
}

func (o DataExchangeIamPolicyArrayOutput) Index(i pulumi.IntInput) DataExchangeIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataExchangeIamPolicy {
		return vs[0].([]*DataExchangeIamPolicy)[vs[1].(int)]
	}).(DataExchangeIamPolicyOutput)
}

type DataExchangeIamPolicyMapOutput struct{ *pulumi.OutputState }

func (DataExchangeIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataExchangeIamPolicy)(nil)).Elem()
}

func (o DataExchangeIamPolicyMapOutput) ToDataExchangeIamPolicyMapOutput() DataExchangeIamPolicyMapOutput {
	return o
}

func (o DataExchangeIamPolicyMapOutput) ToDataExchangeIamPolicyMapOutputWithContext(ctx context.Context) DataExchangeIamPolicyMapOutput {
	return o
}

func (o DataExchangeIamPolicyMapOutput) MapIndex(k pulumi.StringInput) DataExchangeIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataExchangeIamPolicy {
		return vs[0].(map[string]*DataExchangeIamPolicy)[vs[1].(string)]
	}).(DataExchangeIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataExchangeIamPolicyInput)(nil)).Elem(), &DataExchangeIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataExchangeIamPolicyArrayInput)(nil)).Elem(), DataExchangeIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataExchangeIamPolicyMapInput)(nil)).Elem(), DataExchangeIamPolicyMap{})
	pulumi.RegisterOutputType(DataExchangeIamPolicyOutput{})
	pulumi.RegisterOutputType(DataExchangeIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(DataExchangeIamPolicyMapOutput{})
}
