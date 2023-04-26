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
//	$ pulumi import gcp:dataplex/assetIamPolicy:AssetIamPolicy editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamPolicy:AssetIamPolicy editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:dataplex/assetIamPolicy:AssetIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type AssetIamPolicy struct {
	pulumi.CustomResourceState

	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringOutput `pulumi:"asset"`
	DataplexZone pulumi.StringOutput `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringOutput `pulumi:"etag"`
	Lake     pulumi.StringOutput `pulumi:"lake"`
	Location pulumi.StringOutput `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewAssetIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewAssetIamPolicy(ctx *pulumi.Context,
	name string, args *AssetIamPolicyArgs, opts ...pulumi.ResourceOption) (*AssetIamPolicy, error) {
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
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	var resource AssetIamPolicy
	err := ctx.RegisterResource("gcp:dataplex/assetIamPolicy:AssetIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssetIamPolicy gets an existing AssetIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssetIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssetIamPolicyState, opts ...pulumi.ResourceOption) (*AssetIamPolicy, error) {
	var resource AssetIamPolicy
	err := ctx.ReadResource("gcp:dataplex/assetIamPolicy:AssetIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssetIamPolicy resources.
type assetIamPolicyState struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        *string `pulumi:"asset"`
	DataplexZone *string `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag     *string `pulumi:"etag"`
	Lake     *string `pulumi:"lake"`
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

type AssetIamPolicyState struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringPtrInput
	DataplexZone pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringPtrInput
	Lake     pulumi.StringPtrInput
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (AssetIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*assetIamPolicyState)(nil)).Elem()
}

type assetIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        string  `pulumi:"asset"`
	DataplexZone string  `pulumi:"dataplexZone"`
	Lake         string  `pulumi:"lake"`
	Location     *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a AssetIamPolicy resource.
type AssetIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	Asset        pulumi.StringInput
	DataplexZone pulumi.StringInput
	Lake         pulumi.StringInput
	Location     pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (AssetIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assetIamPolicyArgs)(nil)).Elem()
}

type AssetIamPolicyInput interface {
	pulumi.Input

	ToAssetIamPolicyOutput() AssetIamPolicyOutput
	ToAssetIamPolicyOutputWithContext(ctx context.Context) AssetIamPolicyOutput
}

func (*AssetIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AssetIamPolicy)(nil)).Elem()
}

func (i *AssetIamPolicy) ToAssetIamPolicyOutput() AssetIamPolicyOutput {
	return i.ToAssetIamPolicyOutputWithContext(context.Background())
}

func (i *AssetIamPolicy) ToAssetIamPolicyOutputWithContext(ctx context.Context) AssetIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamPolicyOutput)
}

// AssetIamPolicyArrayInput is an input type that accepts AssetIamPolicyArray and AssetIamPolicyArrayOutput values.
// You can construct a concrete instance of `AssetIamPolicyArrayInput` via:
//
//	AssetIamPolicyArray{ AssetIamPolicyArgs{...} }
type AssetIamPolicyArrayInput interface {
	pulumi.Input

	ToAssetIamPolicyArrayOutput() AssetIamPolicyArrayOutput
	ToAssetIamPolicyArrayOutputWithContext(context.Context) AssetIamPolicyArrayOutput
}

type AssetIamPolicyArray []AssetIamPolicyInput

func (AssetIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssetIamPolicy)(nil)).Elem()
}

func (i AssetIamPolicyArray) ToAssetIamPolicyArrayOutput() AssetIamPolicyArrayOutput {
	return i.ToAssetIamPolicyArrayOutputWithContext(context.Background())
}

func (i AssetIamPolicyArray) ToAssetIamPolicyArrayOutputWithContext(ctx context.Context) AssetIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamPolicyArrayOutput)
}

// AssetIamPolicyMapInput is an input type that accepts AssetIamPolicyMap and AssetIamPolicyMapOutput values.
// You can construct a concrete instance of `AssetIamPolicyMapInput` via:
//
//	AssetIamPolicyMap{ "key": AssetIamPolicyArgs{...} }
type AssetIamPolicyMapInput interface {
	pulumi.Input

	ToAssetIamPolicyMapOutput() AssetIamPolicyMapOutput
	ToAssetIamPolicyMapOutputWithContext(context.Context) AssetIamPolicyMapOutput
}

type AssetIamPolicyMap map[string]AssetIamPolicyInput

func (AssetIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssetIamPolicy)(nil)).Elem()
}

func (i AssetIamPolicyMap) ToAssetIamPolicyMapOutput() AssetIamPolicyMapOutput {
	return i.ToAssetIamPolicyMapOutputWithContext(context.Background())
}

func (i AssetIamPolicyMap) ToAssetIamPolicyMapOutputWithContext(ctx context.Context) AssetIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssetIamPolicyMapOutput)
}

type AssetIamPolicyOutput struct{ *pulumi.OutputState }

func (AssetIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssetIamPolicy)(nil)).Elem()
}

func (o AssetIamPolicyOutput) ToAssetIamPolicyOutput() AssetIamPolicyOutput {
	return o
}

func (o AssetIamPolicyOutput) ToAssetIamPolicyOutputWithContext(ctx context.Context) AssetIamPolicyOutput {
	return o
}

// Used to find the parent resource to bind the IAM policy to
func (o AssetIamPolicyOutput) Asset() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.Asset }).(pulumi.StringOutput)
}

func (o AssetIamPolicyOutput) DataplexZone() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.DataplexZone }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o AssetIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o AssetIamPolicyOutput) Lake() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.Lake }).(pulumi.StringOutput)
}

func (o AssetIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o AssetIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o AssetIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AssetIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type AssetIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (AssetIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssetIamPolicy)(nil)).Elem()
}

func (o AssetIamPolicyArrayOutput) ToAssetIamPolicyArrayOutput() AssetIamPolicyArrayOutput {
	return o
}

func (o AssetIamPolicyArrayOutput) ToAssetIamPolicyArrayOutputWithContext(ctx context.Context) AssetIamPolicyArrayOutput {
	return o
}

func (o AssetIamPolicyArrayOutput) Index(i pulumi.IntInput) AssetIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AssetIamPolicy {
		return vs[0].([]*AssetIamPolicy)[vs[1].(int)]
	}).(AssetIamPolicyOutput)
}

type AssetIamPolicyMapOutput struct{ *pulumi.OutputState }

func (AssetIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssetIamPolicy)(nil)).Elem()
}

func (o AssetIamPolicyMapOutput) ToAssetIamPolicyMapOutput() AssetIamPolicyMapOutput {
	return o
}

func (o AssetIamPolicyMapOutput) ToAssetIamPolicyMapOutputWithContext(ctx context.Context) AssetIamPolicyMapOutput {
	return o
}

func (o AssetIamPolicyMapOutput) MapIndex(k pulumi.StringInput) AssetIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AssetIamPolicy {
		return vs[0].(map[string]*AssetIamPolicy)[vs[1].(string)]
	}).(AssetIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamPolicyInput)(nil)).Elem(), &AssetIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamPolicyArrayInput)(nil)).Elem(), AssetIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssetIamPolicyMapInput)(nil)).Elem(), AssetIamPolicyMap{})
	pulumi.RegisterOutputType(AssetIamPolicyOutput{})
	pulumi.RegisterOutputType(AssetIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(AssetIamPolicyMapOutput{})
}