// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gemini

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
//
// * `gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
// * `gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
// * `gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
//
// > **Note:** `gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gemini.RepositoryGroupIamBinding` and `gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gemini.RepositoryGroupIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
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
//						Role: "roles/cloudaicompanion.repositoryGroupsUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = gemini.NewRepositoryGroupIamPolicy(ctx, "policy", &gemini.RepositoryGroupIamPolicyArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				PolicyData:          pulumi.String(admin.PolicyData),
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
// ## gemini.RepositoryGroupIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamBinding(ctx, "binding", &gemini.RepositoryGroupIamBindingArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
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
// ## gemini.RepositoryGroupIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamMember(ctx, "member", &gemini.RepositoryGroupIamMemberArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
//				Member:              pulumi.String("user:jane@example.com"),
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
// # IAM policy for Gemini for Google Cloud RepositoryGroup
// Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
//
// * `gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
// * `gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
// * `gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
//
// > **Note:** `gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gemini.RepositoryGroupIamBinding` and `gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
//
// > **Note:** `gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## gemini.RepositoryGroupIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
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
//						Role: "roles/cloudaicompanion.repositoryGroupsUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = gemini.NewRepositoryGroupIamPolicy(ctx, "policy", &gemini.RepositoryGroupIamPolicyArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				PolicyData:          pulumi.String(admin.PolicyData),
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
// ## gemini.RepositoryGroupIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamBinding(ctx, "binding", &gemini.RepositoryGroupIamBindingArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
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
// ## gemini.RepositoryGroupIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/gemini"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gemini.NewRepositoryGroupIamMember(ctx, "member", &gemini.RepositoryGroupIamMemberArgs{
//				Project:             pulumi.Any(example.Project),
//				Location:            pulumi.Any(example.Location),
//				CodeRepositoryIndex: pulumi.Any(example.CodeRepositoryIndex),
//				RepositoryGroupId:   pulumi.Any(example.RepositoryGroupId),
//				Role:                pulumi.String("roles/cloudaicompanion.repositoryGroupsUser"),
//				Member:              pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
//
// * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
//
// * {{location}}/{{code_repository_index}}/{{repository_group_id}}
//
// * {{repository_group_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy editor "projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy editor "projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type RepositoryGroupIamPolicy struct {
	pulumi.CustomResourceState

	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex pulumi.StringOutput `pulumi:"codeRepositoryIndex"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	RepositoryGroupId pulumi.StringOutput `pulumi:"repositoryGroupId"`
}

// NewRepositoryGroupIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewRepositoryGroupIamPolicy(ctx *pulumi.Context,
	name string, args *RepositoryGroupIamPolicyArgs, opts ...pulumi.ResourceOption) (*RepositoryGroupIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CodeRepositoryIndex == nil {
		return nil, errors.New("invalid value for required argument 'CodeRepositoryIndex'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	if args.RepositoryGroupId == nil {
		return nil, errors.New("invalid value for required argument 'RepositoryGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RepositoryGroupIamPolicy
	err := ctx.RegisterResource("gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepositoryGroupIamPolicy gets an existing RepositoryGroupIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepositoryGroupIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryGroupIamPolicyState, opts ...pulumi.ResourceOption) (*RepositoryGroupIamPolicy, error) {
	var resource RepositoryGroupIamPolicy
	err := ctx.ReadResource("gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RepositoryGroupIamPolicy resources.
type repositoryGroupIamPolicyState struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex *string `pulumi:"codeRepositoryIndex"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	RepositoryGroupId *string `pulumi:"repositoryGroupId"`
}

type RepositoryGroupIamPolicyState struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	RepositoryGroupId pulumi.StringPtrInput
}

func (RepositoryGroupIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryGroupIamPolicyState)(nil)).Elem()
}

type repositoryGroupIamPolicyArgs struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex string `pulumi:"codeRepositoryIndex"`
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	RepositoryGroupId string `pulumi:"repositoryGroupId"`
}

// The set of arguments for constructing a RepositoryGroupIamPolicy resource.
type RepositoryGroupIamPolicyArgs struct {
	// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
	CodeRepositoryIndex pulumi.StringInput
	// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
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
	RepositoryGroupId pulumi.StringInput
}

func (RepositoryGroupIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryGroupIamPolicyArgs)(nil)).Elem()
}

type RepositoryGroupIamPolicyInput interface {
	pulumi.Input

	ToRepositoryGroupIamPolicyOutput() RepositoryGroupIamPolicyOutput
	ToRepositoryGroupIamPolicyOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyOutput
}

func (*RepositoryGroupIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryGroupIamPolicy)(nil)).Elem()
}

func (i *RepositoryGroupIamPolicy) ToRepositoryGroupIamPolicyOutput() RepositoryGroupIamPolicyOutput {
	return i.ToRepositoryGroupIamPolicyOutputWithContext(context.Background())
}

func (i *RepositoryGroupIamPolicy) ToRepositoryGroupIamPolicyOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGroupIamPolicyOutput)
}

// RepositoryGroupIamPolicyArrayInput is an input type that accepts RepositoryGroupIamPolicyArray and RepositoryGroupIamPolicyArrayOutput values.
// You can construct a concrete instance of `RepositoryGroupIamPolicyArrayInput` via:
//
//	RepositoryGroupIamPolicyArray{ RepositoryGroupIamPolicyArgs{...} }
type RepositoryGroupIamPolicyArrayInput interface {
	pulumi.Input

	ToRepositoryGroupIamPolicyArrayOutput() RepositoryGroupIamPolicyArrayOutput
	ToRepositoryGroupIamPolicyArrayOutputWithContext(context.Context) RepositoryGroupIamPolicyArrayOutput
}

type RepositoryGroupIamPolicyArray []RepositoryGroupIamPolicyInput

func (RepositoryGroupIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryGroupIamPolicy)(nil)).Elem()
}

func (i RepositoryGroupIamPolicyArray) ToRepositoryGroupIamPolicyArrayOutput() RepositoryGroupIamPolicyArrayOutput {
	return i.ToRepositoryGroupIamPolicyArrayOutputWithContext(context.Background())
}

func (i RepositoryGroupIamPolicyArray) ToRepositoryGroupIamPolicyArrayOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGroupIamPolicyArrayOutput)
}

// RepositoryGroupIamPolicyMapInput is an input type that accepts RepositoryGroupIamPolicyMap and RepositoryGroupIamPolicyMapOutput values.
// You can construct a concrete instance of `RepositoryGroupIamPolicyMapInput` via:
//
//	RepositoryGroupIamPolicyMap{ "key": RepositoryGroupIamPolicyArgs{...} }
type RepositoryGroupIamPolicyMapInput interface {
	pulumi.Input

	ToRepositoryGroupIamPolicyMapOutput() RepositoryGroupIamPolicyMapOutput
	ToRepositoryGroupIamPolicyMapOutputWithContext(context.Context) RepositoryGroupIamPolicyMapOutput
}

type RepositoryGroupIamPolicyMap map[string]RepositoryGroupIamPolicyInput

func (RepositoryGroupIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryGroupIamPolicy)(nil)).Elem()
}

func (i RepositoryGroupIamPolicyMap) ToRepositoryGroupIamPolicyMapOutput() RepositoryGroupIamPolicyMapOutput {
	return i.ToRepositoryGroupIamPolicyMapOutputWithContext(context.Background())
}

func (i RepositoryGroupIamPolicyMap) ToRepositoryGroupIamPolicyMapOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryGroupIamPolicyMapOutput)
}

type RepositoryGroupIamPolicyOutput struct{ *pulumi.OutputState }

func (RepositoryGroupIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryGroupIamPolicy)(nil)).Elem()
}

func (o RepositoryGroupIamPolicyOutput) ToRepositoryGroupIamPolicyOutput() RepositoryGroupIamPolicyOutput {
	return o
}

func (o RepositoryGroupIamPolicyOutput) ToRepositoryGroupIamPolicyOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyOutput {
	return o
}

// Required. Id of the Code Repository Index. Used to find the parent resource to bind the IAM policy to
func (o RepositoryGroupIamPolicyOutput) CodeRepositoryIndex() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamPolicy) pulumi.StringOutput { return v.CodeRepositoryIndex }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o RepositoryGroupIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the Code Repository Index, for example `us-central1`. Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o RepositoryGroupIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o RepositoryGroupIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o RepositoryGroupIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o RepositoryGroupIamPolicyOutput) RepositoryGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryGroupIamPolicy) pulumi.StringOutput { return v.RepositoryGroupId }).(pulumi.StringOutput)
}

type RepositoryGroupIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (RepositoryGroupIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryGroupIamPolicy)(nil)).Elem()
}

func (o RepositoryGroupIamPolicyArrayOutput) ToRepositoryGroupIamPolicyArrayOutput() RepositoryGroupIamPolicyArrayOutput {
	return o
}

func (o RepositoryGroupIamPolicyArrayOutput) ToRepositoryGroupIamPolicyArrayOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyArrayOutput {
	return o
}

func (o RepositoryGroupIamPolicyArrayOutput) Index(i pulumi.IntInput) RepositoryGroupIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RepositoryGroupIamPolicy {
		return vs[0].([]*RepositoryGroupIamPolicy)[vs[1].(int)]
	}).(RepositoryGroupIamPolicyOutput)
}

type RepositoryGroupIamPolicyMapOutput struct{ *pulumi.OutputState }

func (RepositoryGroupIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryGroupIamPolicy)(nil)).Elem()
}

func (o RepositoryGroupIamPolicyMapOutput) ToRepositoryGroupIamPolicyMapOutput() RepositoryGroupIamPolicyMapOutput {
	return o
}

func (o RepositoryGroupIamPolicyMapOutput) ToRepositoryGroupIamPolicyMapOutputWithContext(ctx context.Context) RepositoryGroupIamPolicyMapOutput {
	return o
}

func (o RepositoryGroupIamPolicyMapOutput) MapIndex(k pulumi.StringInput) RepositoryGroupIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RepositoryGroupIamPolicy {
		return vs[0].(map[string]*RepositoryGroupIamPolicy)[vs[1].(string)]
	}).(RepositoryGroupIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGroupIamPolicyInput)(nil)).Elem(), &RepositoryGroupIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGroupIamPolicyArrayInput)(nil)).Elem(), RepositoryGroupIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryGroupIamPolicyMapInput)(nil)).Elem(), RepositoryGroupIamPolicyMap{})
	pulumi.RegisterOutputType(RepositoryGroupIamPolicyOutput{})
	pulumi.RegisterOutputType(RepositoryGroupIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(RepositoryGroupIamPolicyMapOutput{})
}
