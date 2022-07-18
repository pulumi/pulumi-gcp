// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataproc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/services/{{service_id}} * {{project}}/{{location}}/{{service_id}} * {{location}}/{{service_id}} * {{service_id}} Any variables not passed in the import command will be taken from the provider configuration. Dataproc metastore service IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//  $ pulumi import gcp:dataproc/metastoreServiceIamPolicy:MetastoreServiceIamPolicy editor "projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer user:jane@example.com"
// ```
//
//  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//  $ pulumi import gcp:dataproc/metastoreServiceIamPolicy:MetastoreServiceIamPolicy editor "projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer"
// ```
//
//  IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//  $ pulumi import gcp:dataproc/metastoreServiceIamPolicy:MetastoreServiceIamPolicy editor projects/{{project}}/locations/{{location}}/services/{{service_id}}
// ```
//
//  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type MetastoreServiceIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringOutput `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project   pulumi.StringOutput `pulumi:"project"`
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
}

// NewMetastoreServiceIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewMetastoreServiceIamPolicy(ctx *pulumi.Context,
	name string, args *MetastoreServiceIamPolicyArgs, opts ...pulumi.ResourceOption) (*MetastoreServiceIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	if args.ServiceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceId'")
	}
	var resource MetastoreServiceIamPolicy
	err := ctx.RegisterResource("gcp:dataproc/metastoreServiceIamPolicy:MetastoreServiceIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMetastoreServiceIamPolicy gets an existing MetastoreServiceIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetastoreServiceIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MetastoreServiceIamPolicyState, opts ...pulumi.ResourceOption) (*MetastoreServiceIamPolicy, error) {
	var resource MetastoreServiceIamPolicy
	err := ctx.ReadResource("gcp:dataproc/metastoreServiceIamPolicy:MetastoreServiceIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MetastoreServiceIamPolicy resources.
type metastoreServiceIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project   *string `pulumi:"project"`
	ServiceId *string `pulumi:"serviceId"`
}

type MetastoreServiceIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project   pulumi.StringPtrInput
	ServiceId pulumi.StringPtrInput
}

func (MetastoreServiceIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreServiceIamPolicyState)(nil)).Elem()
}

type metastoreServiceIamPolicyArgs struct {
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project   *string `pulumi:"project"`
	ServiceId string  `pulumi:"serviceId"`
}

// The set of arguments for constructing a MetastoreServiceIamPolicy resource.
type MetastoreServiceIamPolicyArgs struct {
	// The  location where the autoscaling policy should reside.
	// The default value is `global`.
	// Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project   pulumi.StringPtrInput
	ServiceId pulumi.StringInput
}

func (MetastoreServiceIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreServiceIamPolicyArgs)(nil)).Elem()
}

type MetastoreServiceIamPolicyInput interface {
	pulumi.Input

	ToMetastoreServiceIamPolicyOutput() MetastoreServiceIamPolicyOutput
	ToMetastoreServiceIamPolicyOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyOutput
}

func (*MetastoreServiceIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreServiceIamPolicy)(nil)).Elem()
}

func (i *MetastoreServiceIamPolicy) ToMetastoreServiceIamPolicyOutput() MetastoreServiceIamPolicyOutput {
	return i.ToMetastoreServiceIamPolicyOutputWithContext(context.Background())
}

func (i *MetastoreServiceIamPolicy) ToMetastoreServiceIamPolicyOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreServiceIamPolicyOutput)
}

// MetastoreServiceIamPolicyArrayInput is an input type that accepts MetastoreServiceIamPolicyArray and MetastoreServiceIamPolicyArrayOutput values.
// You can construct a concrete instance of `MetastoreServiceIamPolicyArrayInput` via:
//
//          MetastoreServiceIamPolicyArray{ MetastoreServiceIamPolicyArgs{...} }
type MetastoreServiceIamPolicyArrayInput interface {
	pulumi.Input

	ToMetastoreServiceIamPolicyArrayOutput() MetastoreServiceIamPolicyArrayOutput
	ToMetastoreServiceIamPolicyArrayOutputWithContext(context.Context) MetastoreServiceIamPolicyArrayOutput
}

type MetastoreServiceIamPolicyArray []MetastoreServiceIamPolicyInput

func (MetastoreServiceIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreServiceIamPolicy)(nil)).Elem()
}

func (i MetastoreServiceIamPolicyArray) ToMetastoreServiceIamPolicyArrayOutput() MetastoreServiceIamPolicyArrayOutput {
	return i.ToMetastoreServiceIamPolicyArrayOutputWithContext(context.Background())
}

func (i MetastoreServiceIamPolicyArray) ToMetastoreServiceIamPolicyArrayOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreServiceIamPolicyArrayOutput)
}

// MetastoreServiceIamPolicyMapInput is an input type that accepts MetastoreServiceIamPolicyMap and MetastoreServiceIamPolicyMapOutput values.
// You can construct a concrete instance of `MetastoreServiceIamPolicyMapInput` via:
//
//          MetastoreServiceIamPolicyMap{ "key": MetastoreServiceIamPolicyArgs{...} }
type MetastoreServiceIamPolicyMapInput interface {
	pulumi.Input

	ToMetastoreServiceIamPolicyMapOutput() MetastoreServiceIamPolicyMapOutput
	ToMetastoreServiceIamPolicyMapOutputWithContext(context.Context) MetastoreServiceIamPolicyMapOutput
}

type MetastoreServiceIamPolicyMap map[string]MetastoreServiceIamPolicyInput

func (MetastoreServiceIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreServiceIamPolicy)(nil)).Elem()
}

func (i MetastoreServiceIamPolicyMap) ToMetastoreServiceIamPolicyMapOutput() MetastoreServiceIamPolicyMapOutput {
	return i.ToMetastoreServiceIamPolicyMapOutputWithContext(context.Background())
}

func (i MetastoreServiceIamPolicyMap) ToMetastoreServiceIamPolicyMapOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreServiceIamPolicyMapOutput)
}

type MetastoreServiceIamPolicyOutput struct{ *pulumi.OutputState }

func (MetastoreServiceIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreServiceIamPolicy)(nil)).Elem()
}

func (o MetastoreServiceIamPolicyOutput) ToMetastoreServiceIamPolicyOutput() MetastoreServiceIamPolicyOutput {
	return o
}

func (o MetastoreServiceIamPolicyOutput) ToMetastoreServiceIamPolicyOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o MetastoreServiceIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreServiceIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The  location where the autoscaling policy should reside.
// The default value is `global`.
// Used to find the parent resource to bind the IAM policy to
func (o MetastoreServiceIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreServiceIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o MetastoreServiceIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreServiceIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o MetastoreServiceIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreServiceIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

func (o MetastoreServiceIamPolicyOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreServiceIamPolicy) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

type MetastoreServiceIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (MetastoreServiceIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreServiceIamPolicy)(nil)).Elem()
}

func (o MetastoreServiceIamPolicyArrayOutput) ToMetastoreServiceIamPolicyArrayOutput() MetastoreServiceIamPolicyArrayOutput {
	return o
}

func (o MetastoreServiceIamPolicyArrayOutput) ToMetastoreServiceIamPolicyArrayOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyArrayOutput {
	return o
}

func (o MetastoreServiceIamPolicyArrayOutput) Index(i pulumi.IntInput) MetastoreServiceIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MetastoreServiceIamPolicy {
		return vs[0].([]*MetastoreServiceIamPolicy)[vs[1].(int)]
	}).(MetastoreServiceIamPolicyOutput)
}

type MetastoreServiceIamPolicyMapOutput struct{ *pulumi.OutputState }

func (MetastoreServiceIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreServiceIamPolicy)(nil)).Elem()
}

func (o MetastoreServiceIamPolicyMapOutput) ToMetastoreServiceIamPolicyMapOutput() MetastoreServiceIamPolicyMapOutput {
	return o
}

func (o MetastoreServiceIamPolicyMapOutput) ToMetastoreServiceIamPolicyMapOutputWithContext(ctx context.Context) MetastoreServiceIamPolicyMapOutput {
	return o
}

func (o MetastoreServiceIamPolicyMapOutput) MapIndex(k pulumi.StringInput) MetastoreServiceIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MetastoreServiceIamPolicy {
		return vs[0].(map[string]*MetastoreServiceIamPolicy)[vs[1].(string)]
	}).(MetastoreServiceIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreServiceIamPolicyInput)(nil)).Elem(), &MetastoreServiceIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreServiceIamPolicyArrayInput)(nil)).Elem(), MetastoreServiceIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreServiceIamPolicyMapInput)(nil)).Elem(), MetastoreServiceIamPolicyMap{})
	pulumi.RegisterOutputType(MetastoreServiceIamPolicyOutput{})
	pulumi.RegisterOutputType(MetastoreServiceIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(MetastoreServiceIamPolicyMapOutput{})
}