// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datacatalog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
//
// * `datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
// * `datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
// * `datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
//
// > **Note:** `datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `datacatalog.TagTemplateIamBinding` and `datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## datacatalog.TagTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
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
//			_, err = datacatalog.NewTagTemplateIamPolicy(ctx, "policy", &datacatalog.TagTemplateIamPolicyArgs{
//				TagTemplate: pulumi.Any(basicTagTemplate.Name),
//				PolicyData:  pulumi.String(admin.PolicyData),
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
// ## datacatalog.TagTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datacatalog.NewTagTemplateIamBinding(ctx, "binding", &datacatalog.TagTemplateIamBindingArgs{
//				TagTemplate: pulumi.Any(basicTagTemplate.Name),
//				Role:        pulumi.String("roles/viewer"),
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
// ## datacatalog.TagTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datacatalog.NewTagTemplateIamMember(ctx, "member", &datacatalog.TagTemplateIamMemberArgs{
//				TagTemplate: pulumi.Any(basicTagTemplate.Name),
//				Role:        pulumi.String("roles/viewer"),
//				Member:      pulumi.String("user:jane@example.com"),
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
// # IAM policy for Data Catalog TagTemplate
// Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
//
// * `datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
// * `datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
// * `datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
//
// > **Note:** `datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `datacatalog.TagTemplateIamBinding` and `datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## datacatalog.TagTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
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
//			_, err = datacatalog.NewTagTemplateIamPolicy(ctx, "policy", &datacatalog.TagTemplateIamPolicyArgs{
//				TagTemplate: pulumi.Any(basicTagTemplate.Name),
//				PolicyData:  pulumi.String(admin.PolicyData),
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
// ## datacatalog.TagTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datacatalog.NewTagTemplateIamBinding(ctx, "binding", &datacatalog.TagTemplateIamBindingArgs{
//				TagTemplate: pulumi.Any(basicTagTemplate.Name),
//				Role:        pulumi.String("roles/viewer"),
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
// ## datacatalog.TagTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datacatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datacatalog.NewTagTemplateIamMember(ctx, "member", &datacatalog.TagTemplateIamMemberArgs{
//				TagTemplate: pulumi.Any(basicTagTemplate.Name),
//				Role:        pulumi.String("roles/viewer"),
//				Member:      pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
//
// * {{project}}/{{region}}/{{tag_template}}
//
// * {{region}}/{{tag_template}}
//
// * {{tag_template}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Data Catalog tagtemplate IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy editor "projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy editor "projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy editor projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type TagTemplateIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Template location region.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringOutput `pulumi:"region"`
	// Used to find the parent resource to bind the IAM policy to
	TagTemplate pulumi.StringOutput `pulumi:"tagTemplate"`
}

// NewTagTemplateIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewTagTemplateIamPolicy(ctx *pulumi.Context,
	name string, args *TagTemplateIamPolicyArgs, opts ...pulumi.ResourceOption) (*TagTemplateIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	if args.TagTemplate == nil {
		return nil, errors.New("invalid value for required argument 'TagTemplate'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TagTemplateIamPolicy
	err := ctx.RegisterResource("gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTagTemplateIamPolicy gets an existing TagTemplateIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTagTemplateIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagTemplateIamPolicyState, opts ...pulumi.ResourceOption) (*TagTemplateIamPolicy, error) {
	var resource TagTemplateIamPolicy
	err := ctx.ReadResource("gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TagTemplateIamPolicy resources.
type tagTemplateIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Template location region.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region *string `pulumi:"region"`
	// Used to find the parent resource to bind the IAM policy to
	TagTemplate *string `pulumi:"tagTemplate"`
}

type TagTemplateIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// Template location region.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	TagTemplate pulumi.StringPtrInput
}

func (TagTemplateIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagTemplateIamPolicyState)(nil)).Elem()
}

type tagTemplateIamPolicyArgs struct {
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// Template location region.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region *string `pulumi:"region"`
	// Used to find the parent resource to bind the IAM policy to
	TagTemplate string `pulumi:"tagTemplate"`
}

// The set of arguments for constructing a TagTemplateIamPolicy resource.
type TagTemplateIamPolicyArgs struct {
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// Template location region.
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
	// region is specified, it is taken from the provider configuration.
	Region pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	TagTemplate pulumi.StringInput
}

func (TagTemplateIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagTemplateIamPolicyArgs)(nil)).Elem()
}

type TagTemplateIamPolicyInput interface {
	pulumi.Input

	ToTagTemplateIamPolicyOutput() TagTemplateIamPolicyOutput
	ToTagTemplateIamPolicyOutputWithContext(ctx context.Context) TagTemplateIamPolicyOutput
}

func (*TagTemplateIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**TagTemplateIamPolicy)(nil)).Elem()
}

func (i *TagTemplateIamPolicy) ToTagTemplateIamPolicyOutput() TagTemplateIamPolicyOutput {
	return i.ToTagTemplateIamPolicyOutputWithContext(context.Background())
}

func (i *TagTemplateIamPolicy) ToTagTemplateIamPolicyOutputWithContext(ctx context.Context) TagTemplateIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagTemplateIamPolicyOutput)
}

// TagTemplateIamPolicyArrayInput is an input type that accepts TagTemplateIamPolicyArray and TagTemplateIamPolicyArrayOutput values.
// You can construct a concrete instance of `TagTemplateIamPolicyArrayInput` via:
//
//	TagTemplateIamPolicyArray{ TagTemplateIamPolicyArgs{...} }
type TagTemplateIamPolicyArrayInput interface {
	pulumi.Input

	ToTagTemplateIamPolicyArrayOutput() TagTemplateIamPolicyArrayOutput
	ToTagTemplateIamPolicyArrayOutputWithContext(context.Context) TagTemplateIamPolicyArrayOutput
}

type TagTemplateIamPolicyArray []TagTemplateIamPolicyInput

func (TagTemplateIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagTemplateIamPolicy)(nil)).Elem()
}

func (i TagTemplateIamPolicyArray) ToTagTemplateIamPolicyArrayOutput() TagTemplateIamPolicyArrayOutput {
	return i.ToTagTemplateIamPolicyArrayOutputWithContext(context.Background())
}

func (i TagTemplateIamPolicyArray) ToTagTemplateIamPolicyArrayOutputWithContext(ctx context.Context) TagTemplateIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagTemplateIamPolicyArrayOutput)
}

// TagTemplateIamPolicyMapInput is an input type that accepts TagTemplateIamPolicyMap and TagTemplateIamPolicyMapOutput values.
// You can construct a concrete instance of `TagTemplateIamPolicyMapInput` via:
//
//	TagTemplateIamPolicyMap{ "key": TagTemplateIamPolicyArgs{...} }
type TagTemplateIamPolicyMapInput interface {
	pulumi.Input

	ToTagTemplateIamPolicyMapOutput() TagTemplateIamPolicyMapOutput
	ToTagTemplateIamPolicyMapOutputWithContext(context.Context) TagTemplateIamPolicyMapOutput
}

type TagTemplateIamPolicyMap map[string]TagTemplateIamPolicyInput

func (TagTemplateIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagTemplateIamPolicy)(nil)).Elem()
}

func (i TagTemplateIamPolicyMap) ToTagTemplateIamPolicyMapOutput() TagTemplateIamPolicyMapOutput {
	return i.ToTagTemplateIamPolicyMapOutputWithContext(context.Background())
}

func (i TagTemplateIamPolicyMap) ToTagTemplateIamPolicyMapOutputWithContext(ctx context.Context) TagTemplateIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagTemplateIamPolicyMapOutput)
}

type TagTemplateIamPolicyOutput struct{ *pulumi.OutputState }

func (TagTemplateIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TagTemplateIamPolicy)(nil)).Elem()
}

func (o TagTemplateIamPolicyOutput) ToTagTemplateIamPolicyOutput() TagTemplateIamPolicyOutput {
	return o
}

func (o TagTemplateIamPolicyOutput) ToTagTemplateIamPolicyOutputWithContext(ctx context.Context) TagTemplateIamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o TagTemplateIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *TagTemplateIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o TagTemplateIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *TagTemplateIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o TagTemplateIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *TagTemplateIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Template location region.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
// region is specified, it is taken from the provider configuration.
func (o TagTemplateIamPolicyOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *TagTemplateIamPolicy) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o TagTemplateIamPolicyOutput) TagTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v *TagTemplateIamPolicy) pulumi.StringOutput { return v.TagTemplate }).(pulumi.StringOutput)
}

type TagTemplateIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (TagTemplateIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagTemplateIamPolicy)(nil)).Elem()
}

func (o TagTemplateIamPolicyArrayOutput) ToTagTemplateIamPolicyArrayOutput() TagTemplateIamPolicyArrayOutput {
	return o
}

func (o TagTemplateIamPolicyArrayOutput) ToTagTemplateIamPolicyArrayOutputWithContext(ctx context.Context) TagTemplateIamPolicyArrayOutput {
	return o
}

func (o TagTemplateIamPolicyArrayOutput) Index(i pulumi.IntInput) TagTemplateIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TagTemplateIamPolicy {
		return vs[0].([]*TagTemplateIamPolicy)[vs[1].(int)]
	}).(TagTemplateIamPolicyOutput)
}

type TagTemplateIamPolicyMapOutput struct{ *pulumi.OutputState }

func (TagTemplateIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagTemplateIamPolicy)(nil)).Elem()
}

func (o TagTemplateIamPolicyMapOutput) ToTagTemplateIamPolicyMapOutput() TagTemplateIamPolicyMapOutput {
	return o
}

func (o TagTemplateIamPolicyMapOutput) ToTagTemplateIamPolicyMapOutputWithContext(ctx context.Context) TagTemplateIamPolicyMapOutput {
	return o
}

func (o TagTemplateIamPolicyMapOutput) MapIndex(k pulumi.StringInput) TagTemplateIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TagTemplateIamPolicy {
		return vs[0].(map[string]*TagTemplateIamPolicy)[vs[1].(string)]
	}).(TagTemplateIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagTemplateIamPolicyInput)(nil)).Elem(), &TagTemplateIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagTemplateIamPolicyArrayInput)(nil)).Elem(), TagTemplateIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagTemplateIamPolicyMapInput)(nil)).Elem(), TagTemplateIamPolicyMap{})
	pulumi.RegisterOutputType(TagTemplateIamPolicyOutput{})
	pulumi.RegisterOutputType(TagTemplateIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(TagTemplateIamPolicyMapOutput{})
}
