// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataplex

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
//
// * `dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
// * `dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
// * `dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
//
// > **Note:** `dataplex.AssetIamPolicy` **cannot** be used in conjunction with `dataplex.AssetIamBinding` and `dataplex.AssetIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.AssetIamBinding` resources **can be** used in conjunction with `dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## google\_dataplex\_asset\_iam\_policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
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
//			_, err = dataplex.NewAssetIamPolicy(ctx, "policy", &dataplex.AssetIamPolicyArgs{
//				Project:      pulumi.Any(google_dataplex_asset.Example.Project),
//				Location:     pulumi.Any(google_dataplex_asset.Example.Location),
//				Lake:         pulumi.Any(google_dataplex_asset.Example.Lake),
//				DataplexZone: pulumi.Any(google_dataplex_asset.Example.Dataplex_zone),
//				Asset:        pulumi.Any(google_dataplex_asset.Example.Name),
//				PolicyData:   *pulumi.String(admin.PolicyData),
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
// ## google\_dataplex\_asset\_iam\_binding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewAssetIamBinding(ctx, "binding", &dataplex.AssetIamBindingArgs{
//				Project:      pulumi.Any(google_dataplex_asset.Example.Project),
//				Location:     pulumi.Any(google_dataplex_asset.Example.Location),
//				Lake:         pulumi.Any(google_dataplex_asset.Example.Lake),
//				DataplexZone: pulumi.Any(google_dataplex_asset.Example.Dataplex_zone),
//				Asset:        pulumi.Any(google_dataplex_asset.Example.Name),
//				Role:         pulumi.String("roles/viewer"),
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
// ## google\_dataplex\_asset\_iam\_member
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewAssetIamMember(ctx, "member", &dataplex.AssetIamMemberArgs{
//				Project:      pulumi.Any(google_dataplex_asset.Example.Project),
//				Location:     pulumi.Any(google_dataplex_asset.Example.Location),
//				Lake:         pulumi.Any(google_dataplex_asset.Example.Lake),
//				DataplexZone: pulumi.Any(google_dataplex_asset.Example.Dataplex_zone),
//				Asset:        pulumi.Any(google_dataplex_asset.Example.Name),
//				Role:         pulumi.String("roles/viewer"),
//				Member:       pulumi.String("user:jane@example.com"),
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
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}} * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}} * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Dataplex asset IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamMember:AssetIamMember editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamMember:AssetIamMember editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamMember:AssetIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type AssetIamMember struct {
	pulumi.CustomResourceState

	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringOutput              `pulumi:"asset"`
	Condition    AssetIamMemberConditionPtrOutput `pulumi:"condition"`
	DataplexZone pulumi.StringOutput              `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringOutput `pulumi:"etag"`
	Lake     pulumi.StringOutput `pulumi:"lake"`
	Location pulumi.StringOutput `pulumi:"location"`
	Member   pulumi.StringOutput `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewAssetIamMember registers a new resource with the given unique name, arguments, and options.
func NewAssetIamMember(ctx *pulumi.Context,
	name string, args *AssetIamMemberArgs, opts ...pulumi.ResourceOption) (*AssetIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Asset == nil {
		return nil, errors.New("invalid value for required argument 'Asset'")
	}
	if args.DataplexZone == nil {
		return nil, errors.New("invalid value for required argument 'DataplexZone'")
	}
	if args.Lake == nil {
		return nil, errors.New("invalid value for required argument 'Lake'")
	}
	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource AssetIamMember
	err := ctx.RegisterResource("gcp:dataplex/assetIamMember:AssetIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssetIamMember gets an existing AssetIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssetIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssetIamMemberState, opts ...pulumi.ResourceOption) (*AssetIamMember, error) {
	var resource AssetIamMember
	err := ctx.ReadResource("gcp:dataplex/assetIamMember:AssetIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssetIamMember resources.
type assetIamMemberState struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        *string                  `pulumi:"asset"`
	Condition    *AssetIamMemberCondition `pulumi:"condition"`
	DataplexZone *string                  `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag     *string `pulumi:"etag"`
	Lake     *string `pulumi:"lake"`
	Location *string `pulumi:"location"`
	Member   *string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type AssetIamMemberState struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringPtrInput
	Condition    AssetIamMemberConditionPtrInput
	DataplexZone pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringPtrInput
	Lake     pulumi.StringPtrInput
	Location pulumi.StringPtrInput
	Member   pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (AssetIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*assetIamMemberState)(nil)).Elem()
}

type assetIamMemberArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        string                   `pulumi:"asset"`
	Condition    *AssetIamMemberCondition `pulumi:"condition"`
	DataplexZone string                   `pulumi:"dataplexZone"`
	Lake         string                   `pulumi:"lake"`
	Location     *string                  `pulumi:"location"`
	Member       string                   `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a AssetIamMember resource.
type AssetIamMemberArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringInput
	Condition    AssetIamMemberConditionPtrInput
	DataplexZone pulumi.StringInput
	Lake         pulumi.StringInput
	Location     pulumi.StringPtrInput
	Member       pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (AssetIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assetIamMemberArgs)(nil)).Elem()
}

type AssetIamMemberInput interface {
	pulumi.Input

	ToAssetIamMemberOutput() AssetIamMemberOutput
	ToAssetIamMemberOutputWithContext(ctx context.Context) AssetIamMemberOutput
}

func (*AssetIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**AssetIamMember)(nil)).Elem()
}

func (i *AssetIamMember) ToAssetIamMemberOutput() AssetIamMemberOutput {
	return i.ToAssetIamMemberOutputWithContext(context.Background())
}

func (i *AssetIamMember) ToAssetIamMemberOutputWithContext(ctx context.Context) AssetIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamMemberOutput)
}

// AssetIamMemberArrayInput is an input type that accepts AssetIamMemberArray and AssetIamMemberArrayOutput values.
// You can construct a concrete instance of `AssetIamMemberArrayInput` via:
//
//	AssetIamMemberArray{ AssetIamMemberArgs{...} }
type AssetIamMemberArrayInput interface {
	pulumi.Input

	ToAssetIamMemberArrayOutput() AssetIamMemberArrayOutput
	ToAssetIamMemberArrayOutputWithContext(context.Context) AssetIamMemberArrayOutput
}

type AssetIamMemberArray []AssetIamMemberInput

func (AssetIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssetIamMember)(nil)).Elem()
}

func (i AssetIamMemberArray) ToAssetIamMemberArrayOutput() AssetIamMemberArrayOutput {
	return i.ToAssetIamMemberArrayOutputWithContext(context.Background())
}

func (i AssetIamMemberArray) ToAssetIamMemberArrayOutputWithContext(ctx context.Context) AssetIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamMemberArrayOutput)
}

// AssetIamMemberMapInput is an input type that accepts AssetIamMemberMap and AssetIamMemberMapOutput values.
// You can construct a concrete instance of `AssetIamMemberMapInput` via:
//
//	AssetIamMemberMap{ "key": AssetIamMemberArgs{...} }
type AssetIamMemberMapInput interface {
	pulumi.Input

	ToAssetIamMemberMapOutput() AssetIamMemberMapOutput
	ToAssetIamMemberMapOutputWithContext(context.Context) AssetIamMemberMapOutput
}

type AssetIamMemberMap map[string]AssetIamMemberInput

func (AssetIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssetIamMember)(nil)).Elem()
}

func (i AssetIamMemberMap) ToAssetIamMemberMapOutput() AssetIamMemberMapOutput {
	return i.ToAssetIamMemberMapOutputWithContext(context.Background())
}

func (i AssetIamMemberMap) ToAssetIamMemberMapOutputWithContext(ctx context.Context) AssetIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamMemberMapOutput)
}

type AssetIamMemberOutput struct{ *pulumi.OutputState }

func (AssetIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssetIamMember)(nil)).Elem()
}

func (o AssetIamMemberOutput) ToAssetIamMemberOutput() AssetIamMemberOutput {
	return o
}

func (o AssetIamMemberOutput) ToAssetIamMemberOutputWithContext(ctx context.Context) AssetIamMemberOutput {
	return o
}

// Used to find the parent resource to bind the IAM policy to
func (o AssetIamMemberOutput) Asset() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Asset }).(pulumi.StringOutput)
}

func (o AssetIamMemberOutput) Condition() AssetIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *AssetIamMember) AssetIamMemberConditionPtrOutput { return v.Condition }).(AssetIamMemberConditionPtrOutput)
}

func (o AssetIamMemberOutput) DataplexZone() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.DataplexZone }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o AssetIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o AssetIamMemberOutput) Lake() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Lake }).(pulumi.StringOutput)
}

func (o AssetIamMemberOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o AssetIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o AssetIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o AssetIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type AssetIamMemberArrayOutput struct{ *pulumi.OutputState }

func (AssetIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssetIamMember)(nil)).Elem()
}

func (o AssetIamMemberArrayOutput) ToAssetIamMemberArrayOutput() AssetIamMemberArrayOutput {
	return o
}

func (o AssetIamMemberArrayOutput) ToAssetIamMemberArrayOutputWithContext(ctx context.Context) AssetIamMemberArrayOutput {
	return o
}

func (o AssetIamMemberArrayOutput) Index(i pulumi.IntInput) AssetIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AssetIamMember {
		return vs[0].([]*AssetIamMember)[vs[1].(int)]
	}).(AssetIamMemberOutput)
}

type AssetIamMemberMapOutput struct{ *pulumi.OutputState }

func (AssetIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssetIamMember)(nil)).Elem()
}

func (o AssetIamMemberMapOutput) ToAssetIamMemberMapOutput() AssetIamMemberMapOutput {
	return o
}

func (o AssetIamMemberMapOutput) ToAssetIamMemberMapOutputWithContext(ctx context.Context) AssetIamMemberMapOutput {
	return o
}

func (o AssetIamMemberMapOutput) MapIndex(k pulumi.StringInput) AssetIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AssetIamMember {
		return vs[0].(map[string]*AssetIamMember)[vs[1].(string)]
	}).(AssetIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamMemberInput)(nil)).Elem(), &AssetIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamMemberArrayInput)(nil)).Elem(), AssetIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamMemberMapInput)(nil)).Elem(), AssetIamMemberMap{})
	pulumi.RegisterOutputType(AssetIamMemberOutput{})
	pulumi.RegisterOutputType(AssetIamMemberArrayOutput{})
	pulumi.RegisterOutputType(AssetIamMemberMapOutput{})
}