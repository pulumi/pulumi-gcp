// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
// * `securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
// * `securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
//
// > **Note:** `securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `securitycenter.V2OrganizationSourceIamBinding` and `securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## securitycenter.V2OrganizationSourceIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
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
//			_, err = securitycenter.NewV2OrganizationSourceIamPolicy(ctx, "policy", &securitycenter.V2OrganizationSourceIamPolicyArgs{
//				Source:     pulumi.Any(customSource.Name),
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
// ## securitycenter.V2OrganizationSourceIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamBinding(ctx, "binding", &securitycenter.V2OrganizationSourceIamBindingArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
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
// ## securitycenter.V2OrganizationSourceIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamMember(ctx, "member", &securitycenter.V2OrganizationSourceIamMemberArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
//				Member: pulumi.String("user:jane@example.com"),
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
// ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
// ---
//
// # IAM policy for Security Command Center (SCC) v2 API OrganizationSource
// Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
// * `securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
// * `securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
//
// > **Note:** `securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `securitycenter.V2OrganizationSourceIamBinding` and `securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## securitycenter.V2OrganizationSourceIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
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
//			_, err = securitycenter.NewV2OrganizationSourceIamPolicy(ctx, "policy", &securitycenter.V2OrganizationSourceIamPolicyArgs{
//				Source:     pulumi.Any(customSource.Name),
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
// ## securitycenter.V2OrganizationSourceIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamBinding(ctx, "binding", &securitycenter.V2OrganizationSourceIamBindingArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
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
// ## securitycenter.V2OrganizationSourceIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewV2OrganizationSourceIamMember(ctx, "member", &securitycenter.V2OrganizationSourceIamMemberArgs{
//				Source: pulumi.Any(customSource.Name),
//				Role:   pulumi.String("roles/viewer"),
//				Member: pulumi.String("user:jane@example.com"),
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
// * organizations/{{organization}}/sources/{{source}}
//
// * {{organization}}/{{source}}
//
// * {{source}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Security Command Center (SCC) v2 API organizationsource IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamPolicy:V2OrganizationSourceIamPolicy editor "organizations/{{organization}}/sources/{{source}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamPolicy:V2OrganizationSourceIamPolicy editor "organizations/{{organization}}/sources/{{source}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:securitycenter/v2OrganizationSourceIamPolicy:V2OrganizationSourceIamPolicy editor organizations/{{organization}}/sources/{{source}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type V2OrganizationSourceIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag         pulumi.StringOutput `pulumi:"etag"`
	Organization pulumi.StringOutput `pulumi:"organization"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringOutput `pulumi:"source"`
}

// NewV2OrganizationSourceIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewV2OrganizationSourceIamPolicy(ctx *pulumi.Context,
	name string, args *V2OrganizationSourceIamPolicyArgs, opts ...pulumi.ResourceOption) (*V2OrganizationSourceIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	if args.Source == nil {
		return nil, errors.New("invalid value for required argument 'Source'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource V2OrganizationSourceIamPolicy
	err := ctx.RegisterResource("gcp:securitycenter/v2OrganizationSourceIamPolicy:V2OrganizationSourceIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetV2OrganizationSourceIamPolicy gets an existing V2OrganizationSourceIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetV2OrganizationSourceIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *V2OrganizationSourceIamPolicyState, opts ...pulumi.ResourceOption) (*V2OrganizationSourceIamPolicy, error) {
	var resource V2OrganizationSourceIamPolicy
	err := ctx.ReadResource("gcp:securitycenter/v2OrganizationSourceIamPolicy:V2OrganizationSourceIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering V2OrganizationSourceIamPolicy resources.
type v2organizationSourceIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag         *string `pulumi:"etag"`
	Organization *string `pulumi:"organization"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// Used to find the parent resource to bind the IAM policy to
	Source *string `pulumi:"source"`
}

type V2OrganizationSourceIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag         pulumi.StringPtrInput
	Organization pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringPtrInput
}

func (V2OrganizationSourceIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*v2organizationSourceIamPolicyState)(nil)).Elem()
}

type v2organizationSourceIamPolicyArgs struct {
	Organization string `pulumi:"organization"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// Used to find the parent resource to bind the IAM policy to
	Source string `pulumi:"source"`
}

// The set of arguments for constructing a V2OrganizationSourceIamPolicy resource.
type V2OrganizationSourceIamPolicyArgs struct {
	Organization pulumi.StringInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Source pulumi.StringInput
}

func (V2OrganizationSourceIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*v2organizationSourceIamPolicyArgs)(nil)).Elem()
}

type V2OrganizationSourceIamPolicyInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamPolicyOutput() V2OrganizationSourceIamPolicyOutput
	ToV2OrganizationSourceIamPolicyOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyOutput
}

func (*V2OrganizationSourceIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**V2OrganizationSourceIamPolicy)(nil)).Elem()
}

func (i *V2OrganizationSourceIamPolicy) ToV2OrganizationSourceIamPolicyOutput() V2OrganizationSourceIamPolicyOutput {
	return i.ToV2OrganizationSourceIamPolicyOutputWithContext(context.Background())
}

func (i *V2OrganizationSourceIamPolicy) ToV2OrganizationSourceIamPolicyOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamPolicyOutput)
}

// V2OrganizationSourceIamPolicyArrayInput is an input type that accepts V2OrganizationSourceIamPolicyArray and V2OrganizationSourceIamPolicyArrayOutput values.
// You can construct a concrete instance of `V2OrganizationSourceIamPolicyArrayInput` via:
//
//	V2OrganizationSourceIamPolicyArray{ V2OrganizationSourceIamPolicyArgs{...} }
type V2OrganizationSourceIamPolicyArrayInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamPolicyArrayOutput() V2OrganizationSourceIamPolicyArrayOutput
	ToV2OrganizationSourceIamPolicyArrayOutputWithContext(context.Context) V2OrganizationSourceIamPolicyArrayOutput
}

type V2OrganizationSourceIamPolicyArray []V2OrganizationSourceIamPolicyInput

func (V2OrganizationSourceIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2OrganizationSourceIamPolicy)(nil)).Elem()
}

func (i V2OrganizationSourceIamPolicyArray) ToV2OrganizationSourceIamPolicyArrayOutput() V2OrganizationSourceIamPolicyArrayOutput {
	return i.ToV2OrganizationSourceIamPolicyArrayOutputWithContext(context.Background())
}

func (i V2OrganizationSourceIamPolicyArray) ToV2OrganizationSourceIamPolicyArrayOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamPolicyArrayOutput)
}

// V2OrganizationSourceIamPolicyMapInput is an input type that accepts V2OrganizationSourceIamPolicyMap and V2OrganizationSourceIamPolicyMapOutput values.
// You can construct a concrete instance of `V2OrganizationSourceIamPolicyMapInput` via:
//
//	V2OrganizationSourceIamPolicyMap{ "key": V2OrganizationSourceIamPolicyArgs{...} }
type V2OrganizationSourceIamPolicyMapInput interface {
	pulumi.Input

	ToV2OrganizationSourceIamPolicyMapOutput() V2OrganizationSourceIamPolicyMapOutput
	ToV2OrganizationSourceIamPolicyMapOutputWithContext(context.Context) V2OrganizationSourceIamPolicyMapOutput
}

type V2OrganizationSourceIamPolicyMap map[string]V2OrganizationSourceIamPolicyInput

func (V2OrganizationSourceIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2OrganizationSourceIamPolicy)(nil)).Elem()
}

func (i V2OrganizationSourceIamPolicyMap) ToV2OrganizationSourceIamPolicyMapOutput() V2OrganizationSourceIamPolicyMapOutput {
	return i.ToV2OrganizationSourceIamPolicyMapOutputWithContext(context.Background())
}

func (i V2OrganizationSourceIamPolicyMap) ToV2OrganizationSourceIamPolicyMapOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2OrganizationSourceIamPolicyMapOutput)
}

type V2OrganizationSourceIamPolicyOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**V2OrganizationSourceIamPolicy)(nil)).Elem()
}

func (o V2OrganizationSourceIamPolicyOutput) ToV2OrganizationSourceIamPolicyOutput() V2OrganizationSourceIamPolicyOutput {
	return o
}

func (o V2OrganizationSourceIamPolicyOutput) ToV2OrganizationSourceIamPolicyOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o V2OrganizationSourceIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o V2OrganizationSourceIamPolicyOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamPolicy) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o V2OrganizationSourceIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o V2OrganizationSourceIamPolicyOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v *V2OrganizationSourceIamPolicy) pulumi.StringOutput { return v.Source }).(pulumi.StringOutput)
}

type V2OrganizationSourceIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2OrganizationSourceIamPolicy)(nil)).Elem()
}

func (o V2OrganizationSourceIamPolicyArrayOutput) ToV2OrganizationSourceIamPolicyArrayOutput() V2OrganizationSourceIamPolicyArrayOutput {
	return o
}

func (o V2OrganizationSourceIamPolicyArrayOutput) ToV2OrganizationSourceIamPolicyArrayOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyArrayOutput {
	return o
}

func (o V2OrganizationSourceIamPolicyArrayOutput) Index(i pulumi.IntInput) V2OrganizationSourceIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *V2OrganizationSourceIamPolicy {
		return vs[0].([]*V2OrganizationSourceIamPolicy)[vs[1].(int)]
	}).(V2OrganizationSourceIamPolicyOutput)
}

type V2OrganizationSourceIamPolicyMapOutput struct{ *pulumi.OutputState }

func (V2OrganizationSourceIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2OrganizationSourceIamPolicy)(nil)).Elem()
}

func (o V2OrganizationSourceIamPolicyMapOutput) ToV2OrganizationSourceIamPolicyMapOutput() V2OrganizationSourceIamPolicyMapOutput {
	return o
}

func (o V2OrganizationSourceIamPolicyMapOutput) ToV2OrganizationSourceIamPolicyMapOutputWithContext(ctx context.Context) V2OrganizationSourceIamPolicyMapOutput {
	return o
}

func (o V2OrganizationSourceIamPolicyMapOutput) MapIndex(k pulumi.StringInput) V2OrganizationSourceIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *V2OrganizationSourceIamPolicy {
		return vs[0].(map[string]*V2OrganizationSourceIamPolicy)[vs[1].(string)]
	}).(V2OrganizationSourceIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamPolicyInput)(nil)).Elem(), &V2OrganizationSourceIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamPolicyArrayInput)(nil)).Elem(), V2OrganizationSourceIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2OrganizationSourceIamPolicyMapInput)(nil)).Elem(), V2OrganizationSourceIamPolicyMap{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamPolicyOutput{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(V2OrganizationSourceIamPolicyMapOutput{})
}
