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
//	$ pulumi import gcp:dataplex/assetIamBinding:AssetIamBinding editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamBinding:AssetIamBinding editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamBinding:AssetIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type AssetIamBinding struct {
	pulumi.CustomResourceState

	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringOutput               `pulumi:"asset"`
	Condition    AssetIamBindingConditionPtrOutput `pulumi:"condition"`
	DataplexZone pulumi.StringOutput               `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringOutput      `pulumi:"etag"`
	Lake     pulumi.StringOutput      `pulumi:"lake"`
	Location pulumi.StringOutput      `pulumi:"location"`
	Members  pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewAssetIamBinding registers a new resource with the given unique name, arguments, and options.
func NewAssetIamBinding(ctx *pulumi.Context,
	name string, args *AssetIamBindingArgs, opts ...pulumi.ResourceOption) (*AssetIamBinding, error) {
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
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource AssetIamBinding
	err := ctx.RegisterResource("gcp:dataplex/assetIamBinding:AssetIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssetIamBinding gets an existing AssetIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssetIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssetIamBindingState, opts ...pulumi.ResourceOption) (*AssetIamBinding, error) {
	var resource AssetIamBinding
	err := ctx.ReadResource("gcp:dataplex/assetIamBinding:AssetIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssetIamBinding resources.
type assetIamBindingState struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        *string                   `pulumi:"asset"`
	Condition    *AssetIamBindingCondition `pulumi:"condition"`
	DataplexZone *string                   `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag     *string  `pulumi:"etag"`
	Lake     *string  `pulumi:"lake"`
	Location *string  `pulumi:"location"`
	Members  []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type AssetIamBindingState struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringPtrInput
	Condition    AssetIamBindingConditionPtrInput
	DataplexZone pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringPtrInput
	Lake     pulumi.StringPtrInput
	Location pulumi.StringPtrInput
	Members  pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (AssetIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*assetIamBindingState)(nil)).Elem()
}

type assetIamBindingArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        string                    `pulumi:"asset"`
	Condition    *AssetIamBindingCondition `pulumi:"condition"`
	DataplexZone string                    `pulumi:"dataplexZone"`
	Lake         string                    `pulumi:"lake"`
	Location     *string                   `pulumi:"location"`
	Members      []string                  `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a AssetIamBinding resource.
type AssetIamBindingArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringInput
	Condition    AssetIamBindingConditionPtrInput
	DataplexZone pulumi.StringInput
	Lake         pulumi.StringInput
	Location     pulumi.StringPtrInput
	Members      pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (AssetIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assetIamBindingArgs)(nil)).Elem()
}

type AssetIamBindingInput interface {
	pulumi.Input

	ToAssetIamBindingOutput() AssetIamBindingOutput
	ToAssetIamBindingOutputWithContext(ctx context.Context) AssetIamBindingOutput
}

func (*AssetIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**AssetIamBinding)(nil)).Elem()
}

func (i *AssetIamBinding) ToAssetIamBindingOutput() AssetIamBindingOutput {
	return i.ToAssetIamBindingOutputWithContext(context.Background())
}

func (i *AssetIamBinding) ToAssetIamBindingOutputWithContext(ctx context.Context) AssetIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamBindingOutput)
}

// AssetIamBindingArrayInput is an input type that accepts AssetIamBindingArray and AssetIamBindingArrayOutput values.
// You can construct a concrete instance of `AssetIamBindingArrayInput` via:
//
//	AssetIamBindingArray{ AssetIamBindingArgs{...} }
type AssetIamBindingArrayInput interface {
	pulumi.Input

	ToAssetIamBindingArrayOutput() AssetIamBindingArrayOutput
	ToAssetIamBindingArrayOutputWithContext(context.Context) AssetIamBindingArrayOutput
}

type AssetIamBindingArray []AssetIamBindingInput

func (AssetIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssetIamBinding)(nil)).Elem()
}

func (i AssetIamBindingArray) ToAssetIamBindingArrayOutput() AssetIamBindingArrayOutput {
	return i.ToAssetIamBindingArrayOutputWithContext(context.Background())
}

func (i AssetIamBindingArray) ToAssetIamBindingArrayOutputWithContext(ctx context.Context) AssetIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamBindingArrayOutput)
}

// AssetIamBindingMapInput is an input type that accepts AssetIamBindingMap and AssetIamBindingMapOutput values.
// You can construct a concrete instance of `AssetIamBindingMapInput` via:
//
//	AssetIamBindingMap{ "key": AssetIamBindingArgs{...} }
type AssetIamBindingMapInput interface {
	pulumi.Input

	ToAssetIamBindingMapOutput() AssetIamBindingMapOutput
	ToAssetIamBindingMapOutputWithContext(context.Context) AssetIamBindingMapOutput
}

type AssetIamBindingMap map[string]AssetIamBindingInput

func (AssetIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssetIamBinding)(nil)).Elem()
}

func (i AssetIamBindingMap) ToAssetIamBindingMapOutput() AssetIamBindingMapOutput {
	return i.ToAssetIamBindingMapOutputWithContext(context.Background())
}

func (i AssetIamBindingMap) ToAssetIamBindingMapOutputWithContext(ctx context.Context) AssetIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamBindingMapOutput)
}

type AssetIamBindingOutput struct{ *pulumi.OutputState }

func (AssetIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssetIamBinding)(nil)).Elem()
}

func (o AssetIamBindingOutput) ToAssetIamBindingOutput() AssetIamBindingOutput {
	return o
}

func (o AssetIamBindingOutput) ToAssetIamBindingOutputWithContext(ctx context.Context) AssetIamBindingOutput {
	return o
}

// Used to find the parent resource to bind the IAM policy to
func (o AssetIamBindingOutput) Asset() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.Asset }).(pulumi.StringOutput)
}

func (o AssetIamBindingOutput) Condition() AssetIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *AssetIamBinding) AssetIamBindingConditionPtrOutput { return v.Condition }).(AssetIamBindingConditionPtrOutput)
}

func (o AssetIamBindingOutput) DataplexZone() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.DataplexZone }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o AssetIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o AssetIamBindingOutput) Lake() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.Lake }).(pulumi.StringOutput)
}

func (o AssetIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o AssetIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o AssetIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `dataplex.AssetIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o AssetIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type AssetIamBindingArrayOutput struct{ *pulumi.OutputState }

func (AssetIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssetIamBinding)(nil)).Elem()
}

func (o AssetIamBindingArrayOutput) ToAssetIamBindingArrayOutput() AssetIamBindingArrayOutput {
	return o
}

func (o AssetIamBindingArrayOutput) ToAssetIamBindingArrayOutputWithContext(ctx context.Context) AssetIamBindingArrayOutput {
	return o
}

func (o AssetIamBindingArrayOutput) Index(i pulumi.IntInput) AssetIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AssetIamBinding {
		return vs[0].([]*AssetIamBinding)[vs[1].(int)]
	}).(AssetIamBindingOutput)
}

type AssetIamBindingMapOutput struct{ *pulumi.OutputState }

func (AssetIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssetIamBinding)(nil)).Elem()
}

func (o AssetIamBindingMapOutput) ToAssetIamBindingMapOutput() AssetIamBindingMapOutput {
	return o
}

func (o AssetIamBindingMapOutput) ToAssetIamBindingMapOutputWithContext(ctx context.Context) AssetIamBindingMapOutput {
	return o
}

func (o AssetIamBindingMapOutput) MapIndex(k pulumi.StringInput) AssetIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AssetIamBinding {
		return vs[0].(map[string]*AssetIamBinding)[vs[1].(string)]
	}).(AssetIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamBindingInput)(nil)).Elem(), &AssetIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamBindingArrayInput)(nil)).Elem(), AssetIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamBindingMapInput)(nil)).Elem(), AssetIamBindingMap{})
	pulumi.RegisterOutputType(AssetIamBindingOutput{})
	pulumi.RegisterOutputType(AssetIamBindingArrayOutput{})
	pulumi.RegisterOutputType(AssetIamBindingMapOutput{})
}