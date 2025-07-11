// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudrun

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
//
// * `cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
// * `cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
// * `cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `cloudrun.IamPolicy`: Retrieves the IAM policy for the service
//
// > **Note:** `cloudrun.IamPolicy` **cannot** be used in conjunction with `cloudrun.IamBinding` and `cloudrun.IamMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudrun.IamBinding` resources **can be** used in conjunction with `cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
//
// ## cloudrun.IamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrun"
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
//			_, err = cloudrun.NewIamPolicy(ctx, "policy", &cloudrun.IamPolicyArgs{
//				Location:   pulumi.Any(_default.Location),
//				Project:    pulumi.Any(_default.Project),
//				Service:    pulumi.Any(_default.Name),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// ## cloudrun.IamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrun"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrun.NewIamBinding(ctx, "binding", &cloudrun.IamBindingArgs{
//				Location: pulumi.Any(_default.Location),
//				Project:  pulumi.Any(_default.Project),
//				Service:  pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
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
// ## cloudrun.IamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrun"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrun.NewIamMember(ctx, "member", &cloudrun.IamMemberArgs{
//				Location: pulumi.Any(_default.Location),
//				Project:  pulumi.Any(_default.Project),
//				Service:  pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
//				Member:   pulumi.String("user:jane@example.com"),
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
// # IAM policy for Cloud Run Service
// Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
//
// * `cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
// * `cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
// * `cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `cloudrun.IamPolicy`: Retrieves the IAM policy for the service
//
// > **Note:** `cloudrun.IamPolicy` **cannot** be used in conjunction with `cloudrun.IamBinding` and `cloudrun.IamMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudrun.IamBinding` resources **can be** used in conjunction with `cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
//
// ## cloudrun.IamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrun"
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
//			_, err = cloudrun.NewIamPolicy(ctx, "policy", &cloudrun.IamPolicyArgs{
//				Location:   pulumi.Any(_default.Location),
//				Project:    pulumi.Any(_default.Project),
//				Service:    pulumi.Any(_default.Name),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// ## cloudrun.IamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrun"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrun.NewIamBinding(ctx, "binding", &cloudrun.IamBindingArgs{
//				Location: pulumi.Any(_default.Location),
//				Project:  pulumi.Any(_default.Project),
//				Service:  pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
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
// ## cloudrun.IamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudrun"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrun.NewIamMember(ctx, "member", &cloudrun.IamMemberArgs{
//				Location: pulumi.Any(_default.Location),
//				Project:  pulumi.Any(_default.Project),
//				Service:  pulumi.Any(_default.Name),
//				Role:     pulumi.String("roles/viewer"),
//				Member:   pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/services/{{service}}
//
// * {{project}}/{{location}}/{{service}}
//
// * {{location}}/{{service}}
//
// * {{service}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud Run service IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:cloudrun/iamPolicy:IamPolicy editor "projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:cloudrun/iamPolicy:IamPolicy editor "projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:cloudrun/iamPolicy:IamPolicy editor projects/{{project}}/locations/{{location}}/services/{{service}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type IamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	Service pulumi.StringOutput `pulumi:"service"`
}

// NewIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewIamPolicy(ctx *pulumi.Context,
	name string, args *IamPolicyArgs, opts ...pulumi.ResourceOption) (*IamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IamPolicy
	err := ctx.RegisterResource("gcp:cloudrun/iamPolicy:IamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIamPolicy gets an existing IamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IamPolicyState, opts ...pulumi.ResourceOption) (*IamPolicy, error) {
	var resource IamPolicy
	err := ctx.ReadResource("gcp:cloudrun/iamPolicy:IamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IamPolicy resources.
type iamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	Service *string `pulumi:"service"`
}

type IamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Service pulumi.StringPtrInput
}

func (IamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*iamPolicyState)(nil)).Elem()
}

type iamPolicyArgs struct {
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Used to find the parent resource to bind the IAM policy to
	Service string `pulumi:"service"`
}

// The set of arguments for constructing a IamPolicy resource.
type IamPolicyArgs struct {
	// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Service pulumi.StringInput
}

func (IamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*iamPolicyArgs)(nil)).Elem()
}

type IamPolicyInput interface {
	pulumi.Input

	ToIamPolicyOutput() IamPolicyOutput
	ToIamPolicyOutputWithContext(ctx context.Context) IamPolicyOutput
}

func (*IamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**IamPolicy)(nil)).Elem()
}

func (i *IamPolicy) ToIamPolicyOutput() IamPolicyOutput {
	return i.ToIamPolicyOutputWithContext(context.Background())
}

func (i *IamPolicy) ToIamPolicyOutputWithContext(ctx context.Context) IamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IamPolicyOutput)
}

// IamPolicyArrayInput is an input type that accepts IamPolicyArray and IamPolicyArrayOutput values.
// You can construct a concrete instance of `IamPolicyArrayInput` via:
//
//	IamPolicyArray{ IamPolicyArgs{...} }
type IamPolicyArrayInput interface {
	pulumi.Input

	ToIamPolicyArrayOutput() IamPolicyArrayOutput
	ToIamPolicyArrayOutputWithContext(context.Context) IamPolicyArrayOutput
}

type IamPolicyArray []IamPolicyInput

func (IamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IamPolicy)(nil)).Elem()
}

func (i IamPolicyArray) ToIamPolicyArrayOutput() IamPolicyArrayOutput {
	return i.ToIamPolicyArrayOutputWithContext(context.Background())
}

func (i IamPolicyArray) ToIamPolicyArrayOutputWithContext(ctx context.Context) IamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IamPolicyArrayOutput)
}

// IamPolicyMapInput is an input type that accepts IamPolicyMap and IamPolicyMapOutput values.
// You can construct a concrete instance of `IamPolicyMapInput` via:
//
//	IamPolicyMap{ "key": IamPolicyArgs{...} }
type IamPolicyMapInput interface {
	pulumi.Input

	ToIamPolicyMapOutput() IamPolicyMapOutput
	ToIamPolicyMapOutputWithContext(context.Context) IamPolicyMapOutput
}

type IamPolicyMap map[string]IamPolicyInput

func (IamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IamPolicy)(nil)).Elem()
}

func (i IamPolicyMap) ToIamPolicyMapOutput() IamPolicyMapOutput {
	return i.ToIamPolicyMapOutputWithContext(context.Background())
}

func (i IamPolicyMap) ToIamPolicyMapOutputWithContext(ctx context.Context) IamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IamPolicyMapOutput)
}

type IamPolicyOutput struct{ *pulumi.OutputState }

func (IamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IamPolicy)(nil)).Elem()
}

func (o IamPolicyOutput) ToIamPolicyOutput() IamPolicyOutput {
	return o
}

func (o IamPolicyOutput) ToIamPolicyOutputWithContext(ctx context.Context) IamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o IamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *IamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o IamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *IamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o IamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *IamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o IamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *IamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o IamPolicyOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *IamPolicy) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

type IamPolicyArrayOutput struct{ *pulumi.OutputState }

func (IamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IamPolicy)(nil)).Elem()
}

func (o IamPolicyArrayOutput) ToIamPolicyArrayOutput() IamPolicyArrayOutput {
	return o
}

func (o IamPolicyArrayOutput) ToIamPolicyArrayOutputWithContext(ctx context.Context) IamPolicyArrayOutput {
	return o
}

func (o IamPolicyArrayOutput) Index(i pulumi.IntInput) IamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IamPolicy {
		return vs[0].([]*IamPolicy)[vs[1].(int)]
	}).(IamPolicyOutput)
}

type IamPolicyMapOutput struct{ *pulumi.OutputState }

func (IamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IamPolicy)(nil)).Elem()
}

func (o IamPolicyMapOutput) ToIamPolicyMapOutput() IamPolicyMapOutput {
	return o
}

func (o IamPolicyMapOutput) ToIamPolicyMapOutputWithContext(ctx context.Context) IamPolicyMapOutput {
	return o
}

func (o IamPolicyMapOutput) MapIndex(k pulumi.StringInput) IamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IamPolicy {
		return vs[0].(map[string]*IamPolicy)[vs[1].(string)]
	}).(IamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IamPolicyInput)(nil)).Elem(), &IamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*IamPolicyArrayInput)(nil)).Elem(), IamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IamPolicyMapInput)(nil)).Elem(), IamPolicyMap{})
	pulumi.RegisterOutputType(IamPolicyOutput{})
	pulumi.RegisterOutputType(IamPolicyArrayOutput{})
	pulumi.RegisterOutputType(IamPolicyMapOutput{})
}
