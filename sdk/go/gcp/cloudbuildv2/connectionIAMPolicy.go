// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudbuildv2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/connections/{{name}} * {{project}}/{{location}}/{{name}} * {{location}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud Build V2 connection IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//
//	$ pulumi import gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy editor "projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy editor "projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy editor projects/{{project}}/locations/{{location}}/connections/{{connection}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ConnectionIAMPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringOutput `pulumi:"etag"`
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

// NewConnectionIAMPolicy registers a new resource with the given unique name, arguments, and options.
func NewConnectionIAMPolicy(ctx *pulumi.Context,
	name string, args *ConnectionIAMPolicyArgs, opts ...pulumi.ResourceOption) (*ConnectionIAMPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	var resource ConnectionIAMPolicy
	err := ctx.RegisterResource("gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectionIAMPolicy gets an existing ConnectionIAMPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectionIAMPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionIAMPolicyState, opts ...pulumi.ResourceOption) (*ConnectionIAMPolicy, error) {
	var resource ConnectionIAMPolicy
	err := ctx.ReadResource("gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectionIAMPolicy resources.
type connectionIAMPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag     *string `pulumi:"etag"`
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

type ConnectionIAMPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag     pulumi.StringPtrInput
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

func (ConnectionIAMPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionIAMPolicyState)(nil)).Elem()
}

type connectionIAMPolicyArgs struct {
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

// The set of arguments for constructing a ConnectionIAMPolicy resource.
type ConnectionIAMPolicyArgs struct {
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

func (ConnectionIAMPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionIAMPolicyArgs)(nil)).Elem()
}

type ConnectionIAMPolicyInput interface {
	pulumi.Input

	ToConnectionIAMPolicyOutput() ConnectionIAMPolicyOutput
	ToConnectionIAMPolicyOutputWithContext(ctx context.Context) ConnectionIAMPolicyOutput
}

func (*ConnectionIAMPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionIAMPolicy)(nil)).Elem()
}

func (i *ConnectionIAMPolicy) ToConnectionIAMPolicyOutput() ConnectionIAMPolicyOutput {
	return i.ToConnectionIAMPolicyOutputWithContext(context.Background())
}

func (i *ConnectionIAMPolicy) ToConnectionIAMPolicyOutputWithContext(ctx context.Context) ConnectionIAMPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIAMPolicyOutput)
}

// ConnectionIAMPolicyArrayInput is an input type that accepts ConnectionIAMPolicyArray and ConnectionIAMPolicyArrayOutput values.
// You can construct a concrete instance of `ConnectionIAMPolicyArrayInput` via:
//
//	ConnectionIAMPolicyArray{ ConnectionIAMPolicyArgs{...} }
type ConnectionIAMPolicyArrayInput interface {
	pulumi.Input

	ToConnectionIAMPolicyArrayOutput() ConnectionIAMPolicyArrayOutput
	ToConnectionIAMPolicyArrayOutputWithContext(context.Context) ConnectionIAMPolicyArrayOutput
}

type ConnectionIAMPolicyArray []ConnectionIAMPolicyInput

func (ConnectionIAMPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionIAMPolicy)(nil)).Elem()
}

func (i ConnectionIAMPolicyArray) ToConnectionIAMPolicyArrayOutput() ConnectionIAMPolicyArrayOutput {
	return i.ToConnectionIAMPolicyArrayOutputWithContext(context.Background())
}

func (i ConnectionIAMPolicyArray) ToConnectionIAMPolicyArrayOutputWithContext(ctx context.Context) ConnectionIAMPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIAMPolicyArrayOutput)
}

// ConnectionIAMPolicyMapInput is an input type that accepts ConnectionIAMPolicyMap and ConnectionIAMPolicyMapOutput values.
// You can construct a concrete instance of `ConnectionIAMPolicyMapInput` via:
//
//	ConnectionIAMPolicyMap{ "key": ConnectionIAMPolicyArgs{...} }
type ConnectionIAMPolicyMapInput interface {
	pulumi.Input

	ToConnectionIAMPolicyMapOutput() ConnectionIAMPolicyMapOutput
	ToConnectionIAMPolicyMapOutputWithContext(context.Context) ConnectionIAMPolicyMapOutput
}

type ConnectionIAMPolicyMap map[string]ConnectionIAMPolicyInput

func (ConnectionIAMPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionIAMPolicy)(nil)).Elem()
}

func (i ConnectionIAMPolicyMap) ToConnectionIAMPolicyMapOutput() ConnectionIAMPolicyMapOutput {
	return i.ToConnectionIAMPolicyMapOutputWithContext(context.Background())
}

func (i ConnectionIAMPolicyMap) ToConnectionIAMPolicyMapOutputWithContext(ctx context.Context) ConnectionIAMPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIAMPolicyMapOutput)
}

type ConnectionIAMPolicyOutput struct{ *pulumi.OutputState }

func (ConnectionIAMPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionIAMPolicy)(nil)).Elem()
}

func (o ConnectionIAMPolicyOutput) ToConnectionIAMPolicyOutput() ConnectionIAMPolicyOutput {
	return o
}

func (o ConnectionIAMPolicyOutput) ToConnectionIAMPolicyOutputWithContext(ctx context.Context) ConnectionIAMPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o ConnectionIAMPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o ConnectionIAMPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ConnectionIAMPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o ConnectionIAMPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ConnectionIAMPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIAMPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type ConnectionIAMPolicyArrayOutput struct{ *pulumi.OutputState }

func (ConnectionIAMPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionIAMPolicy)(nil)).Elem()
}

func (o ConnectionIAMPolicyArrayOutput) ToConnectionIAMPolicyArrayOutput() ConnectionIAMPolicyArrayOutput {
	return o
}

func (o ConnectionIAMPolicyArrayOutput) ToConnectionIAMPolicyArrayOutputWithContext(ctx context.Context) ConnectionIAMPolicyArrayOutput {
	return o
}

func (o ConnectionIAMPolicyArrayOutput) Index(i pulumi.IntInput) ConnectionIAMPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectionIAMPolicy {
		return vs[0].([]*ConnectionIAMPolicy)[vs[1].(int)]
	}).(ConnectionIAMPolicyOutput)
}

type ConnectionIAMPolicyMapOutput struct{ *pulumi.OutputState }

func (ConnectionIAMPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionIAMPolicy)(nil)).Elem()
}

func (o ConnectionIAMPolicyMapOutput) ToConnectionIAMPolicyMapOutput() ConnectionIAMPolicyMapOutput {
	return o
}

func (o ConnectionIAMPolicyMapOutput) ToConnectionIAMPolicyMapOutputWithContext(ctx context.Context) ConnectionIAMPolicyMapOutput {
	return o
}

func (o ConnectionIAMPolicyMapOutput) MapIndex(k pulumi.StringInput) ConnectionIAMPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectionIAMPolicy {
		return vs[0].(map[string]*ConnectionIAMPolicy)[vs[1].(string)]
	}).(ConnectionIAMPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIAMPolicyInput)(nil)).Elem(), &ConnectionIAMPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIAMPolicyArrayInput)(nil)).Elem(), ConnectionIAMPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIAMPolicyMapInput)(nil)).Elem(), ConnectionIAMPolicyMap{})
	pulumi.RegisterOutputType(ConnectionIAMPolicyOutput{})
	pulumi.RegisterOutputType(ConnectionIAMPolicyArrayOutput{})
	pulumi.RegisterOutputType(ConnectionIAMPolicyMapOutput{})
}