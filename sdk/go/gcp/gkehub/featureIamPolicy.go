// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gkehub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
//
// * `gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
// * `gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
// * `gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
//
// > **Note:** `gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gkehub.FeatureIamBinding` and `gkehub.FeatureIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gkehub.FeatureIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
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
//			_, err = gkehub.NewFeatureIamPolicy(ctx, "policy", &gkehub.FeatureIamPolicyArgs{
//				Project:    pulumi.Any(feature.Project),
//				Location:   pulumi.Any(feature.Location),
//				Name:       pulumi.Any(feature.Name),
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
// ## gkehub.FeatureIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewFeatureIamBinding(ctx, "binding", &gkehub.FeatureIamBindingArgs{
//				Project:  pulumi.Any(feature.Project),
//				Location: pulumi.Any(feature.Location),
//				Name:     pulumi.Any(feature.Name),
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
// ## gkehub.FeatureIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewFeatureIamMember(ctx, "member", &gkehub.FeatureIamMemberArgs{
//				Project:  pulumi.Any(feature.Project),
//				Location: pulumi.Any(feature.Location),
//				Name:     pulumi.Any(feature.Name),
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
// # IAM policy for GKEHub Feature
// Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
//
// * `gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
// * `gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
// * `gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
//
// > **Note:** `gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gkehub.FeatureIamBinding` and `gkehub.FeatureIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gkehub.FeatureIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
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
//			_, err = gkehub.NewFeatureIamPolicy(ctx, "policy", &gkehub.FeatureIamPolicyArgs{
//				Project:    pulumi.Any(feature.Project),
//				Location:   pulumi.Any(feature.Location),
//				Name:       pulumi.Any(feature.Name),
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
// ## gkehub.FeatureIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewFeatureIamBinding(ctx, "binding", &gkehub.FeatureIamBindingArgs{
//				Project:  pulumi.Any(feature.Project),
//				Location: pulumi.Any(feature.Location),
//				Name:     pulumi.Any(feature.Name),
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
// ## gkehub.FeatureIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gkehub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gkehub.NewFeatureIamMember(ctx, "member", &gkehub.FeatureIamMemberArgs{
//				Project:  pulumi.Any(feature.Project),
//				Location: pulumi.Any(feature.Location),
//				Name:     pulumi.Any(feature.Name),
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
// * projects/{{project}}/locations/{{location}}/features/{{name}}
//
// * {{project}}/{{location}}/{{name}}
//
// * {{location}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// GKEHub feature IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:gkehub/featureIamPolicy:FeatureIamPolicy editor "projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:gkehub/featureIamPolicy:FeatureIamPolicy editor "projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:gkehub/featureIamPolicy:FeatureIamPolicy editor projects/{{project}}/locations/{{location}}/features/{{feature}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type FeatureIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewFeatureIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewFeatureIamPolicy(ctx *pulumi.Context,
	name string, args *FeatureIamPolicyArgs, opts ...pulumi.ResourceOption) (*FeatureIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FeatureIamPolicy
	err := ctx.RegisterResource("gcp:gkehub/featureIamPolicy:FeatureIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFeatureIamPolicy gets an existing FeatureIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFeatureIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FeatureIamPolicyState, opts ...pulumi.ResourceOption) (*FeatureIamPolicy, error) {
	var resource FeatureIamPolicy
	err := ctx.ReadResource("gcp:gkehub/featureIamPolicy:FeatureIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FeatureIamPolicy resources.
type featureIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

type FeatureIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (FeatureIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*featureIamPolicyState)(nil)).Elem()
}

type featureIamPolicyArgs struct {
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a FeatureIamPolicy resource.
type FeatureIamPolicyArgs struct {
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (FeatureIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*featureIamPolicyArgs)(nil)).Elem()
}

type FeatureIamPolicyInput interface {
	pulumi.Input

	ToFeatureIamPolicyOutput() FeatureIamPolicyOutput
	ToFeatureIamPolicyOutputWithContext(ctx context.Context) FeatureIamPolicyOutput
}

func (*FeatureIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureIamPolicy)(nil)).Elem()
}

func (i *FeatureIamPolicy) ToFeatureIamPolicyOutput() FeatureIamPolicyOutput {
	return i.ToFeatureIamPolicyOutputWithContext(context.Background())
}

func (i *FeatureIamPolicy) ToFeatureIamPolicyOutputWithContext(ctx context.Context) FeatureIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureIamPolicyOutput)
}

// FeatureIamPolicyArrayInput is an input type that accepts FeatureIamPolicyArray and FeatureIamPolicyArrayOutput values.
// You can construct a concrete instance of `FeatureIamPolicyArrayInput` via:
//
//	FeatureIamPolicyArray{ FeatureIamPolicyArgs{...} }
type FeatureIamPolicyArrayInput interface {
	pulumi.Input

	ToFeatureIamPolicyArrayOutput() FeatureIamPolicyArrayOutput
	ToFeatureIamPolicyArrayOutputWithContext(context.Context) FeatureIamPolicyArrayOutput
}

type FeatureIamPolicyArray []FeatureIamPolicyInput

func (FeatureIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureIamPolicy)(nil)).Elem()
}

func (i FeatureIamPolicyArray) ToFeatureIamPolicyArrayOutput() FeatureIamPolicyArrayOutput {
	return i.ToFeatureIamPolicyArrayOutputWithContext(context.Background())
}

func (i FeatureIamPolicyArray) ToFeatureIamPolicyArrayOutputWithContext(ctx context.Context) FeatureIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureIamPolicyArrayOutput)
}

// FeatureIamPolicyMapInput is an input type that accepts FeatureIamPolicyMap and FeatureIamPolicyMapOutput values.
// You can construct a concrete instance of `FeatureIamPolicyMapInput` via:
//
//	FeatureIamPolicyMap{ "key": FeatureIamPolicyArgs{...} }
type FeatureIamPolicyMapInput interface {
	pulumi.Input

	ToFeatureIamPolicyMapOutput() FeatureIamPolicyMapOutput
	ToFeatureIamPolicyMapOutputWithContext(context.Context) FeatureIamPolicyMapOutput
}

type FeatureIamPolicyMap map[string]FeatureIamPolicyInput

func (FeatureIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureIamPolicy)(nil)).Elem()
}

func (i FeatureIamPolicyMap) ToFeatureIamPolicyMapOutput() FeatureIamPolicyMapOutput {
	return i.ToFeatureIamPolicyMapOutputWithContext(context.Background())
}

func (i FeatureIamPolicyMap) ToFeatureIamPolicyMapOutputWithContext(ctx context.Context) FeatureIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureIamPolicyMapOutput)
}

type FeatureIamPolicyOutput struct{ *pulumi.OutputState }

func (FeatureIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureIamPolicy)(nil)).Elem()
}

func (o FeatureIamPolicyOutput) ToFeatureIamPolicyOutput() FeatureIamPolicyOutput {
	return o
}

func (o FeatureIamPolicyOutput) ToFeatureIamPolicyOutputWithContext(ctx context.Context) FeatureIamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o FeatureIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o FeatureIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o FeatureIamPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureIamPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o FeatureIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o FeatureIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type FeatureIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (FeatureIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureIamPolicy)(nil)).Elem()
}

func (o FeatureIamPolicyArrayOutput) ToFeatureIamPolicyArrayOutput() FeatureIamPolicyArrayOutput {
	return o
}

func (o FeatureIamPolicyArrayOutput) ToFeatureIamPolicyArrayOutputWithContext(ctx context.Context) FeatureIamPolicyArrayOutput {
	return o
}

func (o FeatureIamPolicyArrayOutput) Index(i pulumi.IntInput) FeatureIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FeatureIamPolicy {
		return vs[0].([]*FeatureIamPolicy)[vs[1].(int)]
	}).(FeatureIamPolicyOutput)
}

type FeatureIamPolicyMapOutput struct{ *pulumi.OutputState }

func (FeatureIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureIamPolicy)(nil)).Elem()
}

func (o FeatureIamPolicyMapOutput) ToFeatureIamPolicyMapOutput() FeatureIamPolicyMapOutput {
	return o
}

func (o FeatureIamPolicyMapOutput) ToFeatureIamPolicyMapOutputWithContext(ctx context.Context) FeatureIamPolicyMapOutput {
	return o
}

func (o FeatureIamPolicyMapOutput) MapIndex(k pulumi.StringInput) FeatureIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FeatureIamPolicy {
		return vs[0].(map[string]*FeatureIamPolicy)[vs[1].(string)]
	}).(FeatureIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureIamPolicyInput)(nil)).Elem(), &FeatureIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureIamPolicyArrayInput)(nil)).Elem(), FeatureIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureIamPolicyMapInput)(nil)).Elem(), FeatureIamPolicyMap{})
	pulumi.RegisterOutputType(FeatureIamPolicyOutput{})
	pulumi.RegisterOutputType(FeatureIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(FeatureIamPolicyMapOutput{})
}
