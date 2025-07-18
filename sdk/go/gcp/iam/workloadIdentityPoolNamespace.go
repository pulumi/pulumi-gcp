// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Iam Workload Identity Pool Namespace Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			pool, err := iam.NewWorkloadIdentityPool(ctx, "pool", &iam.WorkloadIdentityPoolArgs{
//				WorkloadIdentityPoolId: pulumi.String("example-pool"),
//				Mode:                   pulumi.String("TRUST_DOMAIN"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewWorkloadIdentityPoolNamespace(ctx, "example", &iam.WorkloadIdentityPoolNamespaceArgs{
//				WorkloadIdentityPoolId:          pool.WorkloadIdentityPoolId,
//				WorkloadIdentityPoolNamespaceId: pulumi.String("example-namespace"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Iam Workload Identity Pool Namespace Full
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			pool, err := iam.NewWorkloadIdentityPool(ctx, "pool", &iam.WorkloadIdentityPoolArgs{
//				WorkloadIdentityPoolId: pulumi.String("example-pool"),
//				Mode:                   pulumi.String("TRUST_DOMAIN"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewWorkloadIdentityPoolNamespace(ctx, "example", &iam.WorkloadIdentityPoolNamespaceArgs{
//				WorkloadIdentityPoolId:          pool.WorkloadIdentityPoolId,
//				WorkloadIdentityPoolNamespaceId: pulumi.String("example-namespace"),
//				Description:                     pulumi.String("Example Namespace in a Workload Identity Pool"),
//				Disabled:                        pulumi.Bool(true),
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
// WorkloadIdentityPoolNamespace can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}/namespaces/{{workload_identity_pool_namespace_id}}`
//
// * `{{project}}/{{workload_identity_pool_id}}/{{workload_identity_pool_namespace_id}}`
//
// * `{{workload_identity_pool_id}}/{{workload_identity_pool_namespace_id}}`
//
// When using the `pulumi import` command, WorkloadIdentityPoolNamespace can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:iam/workloadIdentityPoolNamespace:WorkloadIdentityPoolNamespace default projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}/namespaces/{{workload_identity_pool_namespace_id}}
// ```
//
// ```sh
// $ pulumi import gcp:iam/workloadIdentityPoolNamespace:WorkloadIdentityPoolNamespace default {{project}}/{{workload_identity_pool_id}}/{{workload_identity_pool_namespace_id}}
// ```
//
// ```sh
// $ pulumi import gcp:iam/workloadIdentityPoolNamespace:WorkloadIdentityPoolNamespace default {{workload_identity_pool_id}}/{{workload_identity_pool_namespace_id}}
// ```
type WorkloadIdentityPoolNamespace struct {
	pulumi.CustomResourceState

	// A description of the namespace. Cannot exceed 256 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the namespace is disabled. If disabled, credentials may no longer be issued for
	// identities within this namespace, however existing credentials will still be accepted until
	// they expire.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// The resource name of the namespace as
	// `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/namespaces/{workload_identity_pool_namespace_id}`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Defines the owner that is allowed to mutate this resource. If present, this resource can only
	// be mutated by the owner.
	// Structure is documented below.
	OwnerServices WorkloadIdentityPoolNamespaceOwnerServiceArrayOutput `pulumi:"ownerServices"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The current state of the namespace.
	// * `ACTIVE`: The namespace is active.
	// * `DELETED`: The namespace is soft-deleted. Soft-deleted namespaces are permanently deleted
	//   after approximately 30 days. You can restore a soft-deleted namespace using
	//   UndeleteWorkloadIdentityPoolNamespace. You cannot reuse the ID of a soft-deleted namespace
	//   until it is permanently deleted.
	State pulumi.StringOutput `pulumi:"state"`
	// The ID to use for the pool, which becomes the final component of the resource name. This
	// value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
	// `gcp-` is reserved for use by Google, and may not be specified.
	WorkloadIdentityPoolId pulumi.StringOutput `pulumi:"workloadIdentityPoolId"`
	// The ID to use for the namespace. This value must:
	// * contain at most 63 characters
	// * contain only lowercase alphanumeric characters or `-`
	// * start with an alphanumeric character
	// * end with an alphanumeric character
	//
	// The prefix `gcp-` will be reserved for future uses.
	WorkloadIdentityPoolNamespaceId pulumi.StringOutput `pulumi:"workloadIdentityPoolNamespaceId"`
}

// NewWorkloadIdentityPoolNamespace registers a new resource with the given unique name, arguments, and options.
func NewWorkloadIdentityPoolNamespace(ctx *pulumi.Context,
	name string, args *WorkloadIdentityPoolNamespaceArgs, opts ...pulumi.ResourceOption) (*WorkloadIdentityPoolNamespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.WorkloadIdentityPoolId == nil {
		return nil, errors.New("invalid value for required argument 'WorkloadIdentityPoolId'")
	}
	if args.WorkloadIdentityPoolNamespaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkloadIdentityPoolNamespaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkloadIdentityPoolNamespace
	err := ctx.RegisterResource("gcp:iam/workloadIdentityPoolNamespace:WorkloadIdentityPoolNamespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkloadIdentityPoolNamespace gets an existing WorkloadIdentityPoolNamespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkloadIdentityPoolNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkloadIdentityPoolNamespaceState, opts ...pulumi.ResourceOption) (*WorkloadIdentityPoolNamespace, error) {
	var resource WorkloadIdentityPoolNamespace
	err := ctx.ReadResource("gcp:iam/workloadIdentityPoolNamespace:WorkloadIdentityPoolNamespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkloadIdentityPoolNamespace resources.
type workloadIdentityPoolNamespaceState struct {
	// A description of the namespace. Cannot exceed 256 characters.
	Description *string `pulumi:"description"`
	// Whether the namespace is disabled. If disabled, credentials may no longer be issued for
	// identities within this namespace, however existing credentials will still be accepted until
	// they expire.
	Disabled *bool `pulumi:"disabled"`
	// The resource name of the namespace as
	// `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/namespaces/{workload_identity_pool_namespace_id}`.
	Name *string `pulumi:"name"`
	// Defines the owner that is allowed to mutate this resource. If present, this resource can only
	// be mutated by the owner.
	// Structure is documented below.
	OwnerServices []WorkloadIdentityPoolNamespaceOwnerService `pulumi:"ownerServices"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The current state of the namespace.
	// * `ACTIVE`: The namespace is active.
	// * `DELETED`: The namespace is soft-deleted. Soft-deleted namespaces are permanently deleted
	//   after approximately 30 days. You can restore a soft-deleted namespace using
	//   UndeleteWorkloadIdentityPoolNamespace. You cannot reuse the ID of a soft-deleted namespace
	//   until it is permanently deleted.
	State *string `pulumi:"state"`
	// The ID to use for the pool, which becomes the final component of the resource name. This
	// value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
	// `gcp-` is reserved for use by Google, and may not be specified.
	WorkloadIdentityPoolId *string `pulumi:"workloadIdentityPoolId"`
	// The ID to use for the namespace. This value must:
	// * contain at most 63 characters
	// * contain only lowercase alphanumeric characters or `-`
	// * start with an alphanumeric character
	// * end with an alphanumeric character
	//
	// The prefix `gcp-` will be reserved for future uses.
	WorkloadIdentityPoolNamespaceId *string `pulumi:"workloadIdentityPoolNamespaceId"`
}

type WorkloadIdentityPoolNamespaceState struct {
	// A description of the namespace. Cannot exceed 256 characters.
	Description pulumi.StringPtrInput
	// Whether the namespace is disabled. If disabled, credentials may no longer be issued for
	// identities within this namespace, however existing credentials will still be accepted until
	// they expire.
	Disabled pulumi.BoolPtrInput
	// The resource name of the namespace as
	// `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/namespaces/{workload_identity_pool_namespace_id}`.
	Name pulumi.StringPtrInput
	// Defines the owner that is allowed to mutate this resource. If present, this resource can only
	// be mutated by the owner.
	// Structure is documented below.
	OwnerServices WorkloadIdentityPoolNamespaceOwnerServiceArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The current state of the namespace.
	// * `ACTIVE`: The namespace is active.
	// * `DELETED`: The namespace is soft-deleted. Soft-deleted namespaces are permanently deleted
	//   after approximately 30 days. You can restore a soft-deleted namespace using
	//   UndeleteWorkloadIdentityPoolNamespace. You cannot reuse the ID of a soft-deleted namespace
	//   until it is permanently deleted.
	State pulumi.StringPtrInput
	// The ID to use for the pool, which becomes the final component of the resource name. This
	// value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
	// `gcp-` is reserved for use by Google, and may not be specified.
	WorkloadIdentityPoolId pulumi.StringPtrInput
	// The ID to use for the namespace. This value must:
	// * contain at most 63 characters
	// * contain only lowercase alphanumeric characters or `-`
	// * start with an alphanumeric character
	// * end with an alphanumeric character
	//
	// The prefix `gcp-` will be reserved for future uses.
	WorkloadIdentityPoolNamespaceId pulumi.StringPtrInput
}

func (WorkloadIdentityPoolNamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*workloadIdentityPoolNamespaceState)(nil)).Elem()
}

type workloadIdentityPoolNamespaceArgs struct {
	// A description of the namespace. Cannot exceed 256 characters.
	Description *string `pulumi:"description"`
	// Whether the namespace is disabled. If disabled, credentials may no longer be issued for
	// identities within this namespace, however existing credentials will still be accepted until
	// they expire.
	Disabled *bool `pulumi:"disabled"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The ID to use for the pool, which becomes the final component of the resource name. This
	// value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
	// `gcp-` is reserved for use by Google, and may not be specified.
	WorkloadIdentityPoolId string `pulumi:"workloadIdentityPoolId"`
	// The ID to use for the namespace. This value must:
	// * contain at most 63 characters
	// * contain only lowercase alphanumeric characters or `-`
	// * start with an alphanumeric character
	// * end with an alphanumeric character
	//
	// The prefix `gcp-` will be reserved for future uses.
	WorkloadIdentityPoolNamespaceId string `pulumi:"workloadIdentityPoolNamespaceId"`
}

// The set of arguments for constructing a WorkloadIdentityPoolNamespace resource.
type WorkloadIdentityPoolNamespaceArgs struct {
	// A description of the namespace. Cannot exceed 256 characters.
	Description pulumi.StringPtrInput
	// Whether the namespace is disabled. If disabled, credentials may no longer be issued for
	// identities within this namespace, however existing credentials will still be accepted until
	// they expire.
	Disabled pulumi.BoolPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The ID to use for the pool, which becomes the final component of the resource name. This
	// value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
	// `gcp-` is reserved for use by Google, and may not be specified.
	WorkloadIdentityPoolId pulumi.StringInput
	// The ID to use for the namespace. This value must:
	// * contain at most 63 characters
	// * contain only lowercase alphanumeric characters or `-`
	// * start with an alphanumeric character
	// * end with an alphanumeric character
	//
	// The prefix `gcp-` will be reserved for future uses.
	WorkloadIdentityPoolNamespaceId pulumi.StringInput
}

func (WorkloadIdentityPoolNamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workloadIdentityPoolNamespaceArgs)(nil)).Elem()
}

type WorkloadIdentityPoolNamespaceInput interface {
	pulumi.Input

	ToWorkloadIdentityPoolNamespaceOutput() WorkloadIdentityPoolNamespaceOutput
	ToWorkloadIdentityPoolNamespaceOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceOutput
}

func (*WorkloadIdentityPoolNamespace) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkloadIdentityPoolNamespace)(nil)).Elem()
}

func (i *WorkloadIdentityPoolNamespace) ToWorkloadIdentityPoolNamespaceOutput() WorkloadIdentityPoolNamespaceOutput {
	return i.ToWorkloadIdentityPoolNamespaceOutputWithContext(context.Background())
}

func (i *WorkloadIdentityPoolNamespace) ToWorkloadIdentityPoolNamespaceOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadIdentityPoolNamespaceOutput)
}

// WorkloadIdentityPoolNamespaceArrayInput is an input type that accepts WorkloadIdentityPoolNamespaceArray and WorkloadIdentityPoolNamespaceArrayOutput values.
// You can construct a concrete instance of `WorkloadIdentityPoolNamespaceArrayInput` via:
//
//	WorkloadIdentityPoolNamespaceArray{ WorkloadIdentityPoolNamespaceArgs{...} }
type WorkloadIdentityPoolNamespaceArrayInput interface {
	pulumi.Input

	ToWorkloadIdentityPoolNamespaceArrayOutput() WorkloadIdentityPoolNamespaceArrayOutput
	ToWorkloadIdentityPoolNamespaceArrayOutputWithContext(context.Context) WorkloadIdentityPoolNamespaceArrayOutput
}

type WorkloadIdentityPoolNamespaceArray []WorkloadIdentityPoolNamespaceInput

func (WorkloadIdentityPoolNamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkloadIdentityPoolNamespace)(nil)).Elem()
}

func (i WorkloadIdentityPoolNamespaceArray) ToWorkloadIdentityPoolNamespaceArrayOutput() WorkloadIdentityPoolNamespaceArrayOutput {
	return i.ToWorkloadIdentityPoolNamespaceArrayOutputWithContext(context.Background())
}

func (i WorkloadIdentityPoolNamespaceArray) ToWorkloadIdentityPoolNamespaceArrayOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadIdentityPoolNamespaceArrayOutput)
}

// WorkloadIdentityPoolNamespaceMapInput is an input type that accepts WorkloadIdentityPoolNamespaceMap and WorkloadIdentityPoolNamespaceMapOutput values.
// You can construct a concrete instance of `WorkloadIdentityPoolNamespaceMapInput` via:
//
//	WorkloadIdentityPoolNamespaceMap{ "key": WorkloadIdentityPoolNamespaceArgs{...} }
type WorkloadIdentityPoolNamespaceMapInput interface {
	pulumi.Input

	ToWorkloadIdentityPoolNamespaceMapOutput() WorkloadIdentityPoolNamespaceMapOutput
	ToWorkloadIdentityPoolNamespaceMapOutputWithContext(context.Context) WorkloadIdentityPoolNamespaceMapOutput
}

type WorkloadIdentityPoolNamespaceMap map[string]WorkloadIdentityPoolNamespaceInput

func (WorkloadIdentityPoolNamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkloadIdentityPoolNamespace)(nil)).Elem()
}

func (i WorkloadIdentityPoolNamespaceMap) ToWorkloadIdentityPoolNamespaceMapOutput() WorkloadIdentityPoolNamespaceMapOutput {
	return i.ToWorkloadIdentityPoolNamespaceMapOutputWithContext(context.Background())
}

func (i WorkloadIdentityPoolNamespaceMap) ToWorkloadIdentityPoolNamespaceMapOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadIdentityPoolNamespaceMapOutput)
}

type WorkloadIdentityPoolNamespaceOutput struct{ *pulumi.OutputState }

func (WorkloadIdentityPoolNamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkloadIdentityPoolNamespace)(nil)).Elem()
}

func (o WorkloadIdentityPoolNamespaceOutput) ToWorkloadIdentityPoolNamespaceOutput() WorkloadIdentityPoolNamespaceOutput {
	return o
}

func (o WorkloadIdentityPoolNamespaceOutput) ToWorkloadIdentityPoolNamespaceOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceOutput {
	return o
}

// A description of the namespace. Cannot exceed 256 characters.
func (o WorkloadIdentityPoolNamespaceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether the namespace is disabled. If disabled, credentials may no longer be issued for
// identities within this namespace, however existing credentials will still be accepted until
// they expire.
func (o WorkloadIdentityPoolNamespaceOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// The resource name of the namespace as
// `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/namespaces/{workload_identity_pool_namespace_id}`.
func (o WorkloadIdentityPoolNamespaceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Defines the owner that is allowed to mutate this resource. If present, this resource can only
// be mutated by the owner.
// Structure is documented below.
func (o WorkloadIdentityPoolNamespaceOutput) OwnerServices() WorkloadIdentityPoolNamespaceOwnerServiceArrayOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) WorkloadIdentityPoolNamespaceOwnerServiceArrayOutput {
		return v.OwnerServices
	}).(WorkloadIdentityPoolNamespaceOwnerServiceArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o WorkloadIdentityPoolNamespaceOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The current state of the namespace.
//   - `ACTIVE`: The namespace is active.
//   - `DELETED`: The namespace is soft-deleted. Soft-deleted namespaces are permanently deleted
//     after approximately 30 days. You can restore a soft-deleted namespace using
//     UndeleteWorkloadIdentityPoolNamespace. You cannot reuse the ID of a soft-deleted namespace
//     until it is permanently deleted.
func (o WorkloadIdentityPoolNamespaceOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The ID to use for the pool, which becomes the final component of the resource name. This
// value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
// `gcp-` is reserved for use by Google, and may not be specified.
func (o WorkloadIdentityPoolNamespaceOutput) WorkloadIdentityPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.StringOutput { return v.WorkloadIdentityPoolId }).(pulumi.StringOutput)
}

// The ID to use for the namespace. This value must:
// * contain at most 63 characters
// * contain only lowercase alphanumeric characters or `-`
// * start with an alphanumeric character
// * end with an alphanumeric character
//
// The prefix `gcp-` will be reserved for future uses.
func (o WorkloadIdentityPoolNamespaceOutput) WorkloadIdentityPoolNamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkloadIdentityPoolNamespace) pulumi.StringOutput { return v.WorkloadIdentityPoolNamespaceId }).(pulumi.StringOutput)
}

type WorkloadIdentityPoolNamespaceArrayOutput struct{ *pulumi.OutputState }

func (WorkloadIdentityPoolNamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkloadIdentityPoolNamespace)(nil)).Elem()
}

func (o WorkloadIdentityPoolNamespaceArrayOutput) ToWorkloadIdentityPoolNamespaceArrayOutput() WorkloadIdentityPoolNamespaceArrayOutput {
	return o
}

func (o WorkloadIdentityPoolNamespaceArrayOutput) ToWorkloadIdentityPoolNamespaceArrayOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceArrayOutput {
	return o
}

func (o WorkloadIdentityPoolNamespaceArrayOutput) Index(i pulumi.IntInput) WorkloadIdentityPoolNamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkloadIdentityPoolNamespace {
		return vs[0].([]*WorkloadIdentityPoolNamespace)[vs[1].(int)]
	}).(WorkloadIdentityPoolNamespaceOutput)
}

type WorkloadIdentityPoolNamespaceMapOutput struct{ *pulumi.OutputState }

func (WorkloadIdentityPoolNamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkloadIdentityPoolNamespace)(nil)).Elem()
}

func (o WorkloadIdentityPoolNamespaceMapOutput) ToWorkloadIdentityPoolNamespaceMapOutput() WorkloadIdentityPoolNamespaceMapOutput {
	return o
}

func (o WorkloadIdentityPoolNamespaceMapOutput) ToWorkloadIdentityPoolNamespaceMapOutputWithContext(ctx context.Context) WorkloadIdentityPoolNamespaceMapOutput {
	return o
}

func (o WorkloadIdentityPoolNamespaceMapOutput) MapIndex(k pulumi.StringInput) WorkloadIdentityPoolNamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkloadIdentityPoolNamespace {
		return vs[0].(map[string]*WorkloadIdentityPoolNamespace)[vs[1].(string)]
	}).(WorkloadIdentityPoolNamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadIdentityPoolNamespaceInput)(nil)).Elem(), &WorkloadIdentityPoolNamespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadIdentityPoolNamespaceArrayInput)(nil)).Elem(), WorkloadIdentityPoolNamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadIdentityPoolNamespaceMapInput)(nil)).Elem(), WorkloadIdentityPoolNamespaceMap{})
	pulumi.RegisterOutputType(WorkloadIdentityPoolNamespaceOutput{})
	pulumi.RegisterOutputType(WorkloadIdentityPoolNamespaceArrayOutput{})
	pulumi.RegisterOutputType(WorkloadIdentityPoolNamespaceMapOutput{})
}
