// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigee

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// You can combine policies and resources into a shared flow that you can consume from multiple API proxies, and even from other shared flows. Although it's like a proxy, a shared flow has no endpoint. It can be used only from an API proxy or shared flow that's in the same organization as the shared flow itself.
//
// To get more information about SharedFlow, see:
//
// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.sharedflows)
// * How-to Guides
//   - [Sharedflows](https://cloud.google.com/apigee/docs/resources)
//
// ## Import
//
// # SharedFlow can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:apigee/sharedflow:Sharedflow default {{org_id}}/sharedflows/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:apigee/sharedflow:Sharedflow default {{org_id}}/{{name}}
//
// ```
type Sharedflow struct {
	pulumi.CustomResourceState

	// Path to the config zip bundle.
	ConfigBundle pulumi.StringOutput `pulumi:"configBundle"`
	// A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
	// will trigger an update.
	DetectMd5hash pulumi.StringPtrOutput `pulumi:"detectMd5hash"`
	// The id of the most recently created revision for this shared flow.
	LatestRevisionId pulumi.StringOutput `pulumi:"latestRevisionId"`
	// (Computed) Base 64 MD5 hash of the uploaded data. It is speculative as remote does not return hash of the bundle. Remote changes are detected using returned lastModified timestamp.
	Md5hash pulumi.StringOutput `pulumi:"md5hash"`
	// Metadata describing the shared flow.
	// Structure is documented below.
	MetaDatas SharedflowMetaDataArrayOutput `pulumi:"metaDatas"`
	// The ID of the shared flow.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Apigee Organization name associated with the Apigee instance.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// A list of revisions of this shared flow.
	Revisions pulumi.StringArrayOutput `pulumi:"revisions"`
}

// NewSharedflow registers a new resource with the given unique name, arguments, and options.
func NewSharedflow(ctx *pulumi.Context,
	name string, args *SharedflowArgs, opts ...pulumi.ResourceOption) (*Sharedflow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigBundle == nil {
		return nil, errors.New("invalid value for required argument 'ConfigBundle'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	var resource Sharedflow
	err := ctx.RegisterResource("gcp:apigee/sharedflow:Sharedflow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSharedflow gets an existing Sharedflow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSharedflow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SharedflowState, opts ...pulumi.ResourceOption) (*Sharedflow, error) {
	var resource Sharedflow
	err := ctx.ReadResource("gcp:apigee/sharedflow:Sharedflow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Sharedflow resources.
type sharedflowState struct {
	// Path to the config zip bundle.
	ConfigBundle *string `pulumi:"configBundle"`
	// A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
	// will trigger an update.
	DetectMd5hash *string `pulumi:"detectMd5hash"`
	// The id of the most recently created revision for this shared flow.
	LatestRevisionId *string `pulumi:"latestRevisionId"`
	// (Computed) Base 64 MD5 hash of the uploaded data. It is speculative as remote does not return hash of the bundle. Remote changes are detected using returned lastModified timestamp.
	Md5hash *string `pulumi:"md5hash"`
	// Metadata describing the shared flow.
	// Structure is documented below.
	MetaDatas []SharedflowMetaData `pulumi:"metaDatas"`
	// The ID of the shared flow.
	Name *string `pulumi:"name"`
	// The Apigee Organization name associated with the Apigee instance.
	OrgId *string `pulumi:"orgId"`
	// A list of revisions of this shared flow.
	Revisions []string `pulumi:"revisions"`
}

type SharedflowState struct {
	// Path to the config zip bundle.
	ConfigBundle pulumi.StringPtrInput
	// A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
	// will trigger an update.
	DetectMd5hash pulumi.StringPtrInput
	// The id of the most recently created revision for this shared flow.
	LatestRevisionId pulumi.StringPtrInput
	// (Computed) Base 64 MD5 hash of the uploaded data. It is speculative as remote does not return hash of the bundle. Remote changes are detected using returned lastModified timestamp.
	Md5hash pulumi.StringPtrInput
	// Metadata describing the shared flow.
	// Structure is documented below.
	MetaDatas SharedflowMetaDataArrayInput
	// The ID of the shared flow.
	Name pulumi.StringPtrInput
	// The Apigee Organization name associated with the Apigee instance.
	OrgId pulumi.StringPtrInput
	// A list of revisions of this shared flow.
	Revisions pulumi.StringArrayInput
}

func (SharedflowState) ElementType() reflect.Type {
	return reflect.TypeOf((*sharedflowState)(nil)).Elem()
}

type sharedflowArgs struct {
	// Path to the config zip bundle.
	ConfigBundle string `pulumi:"configBundle"`
	// A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
	// will trigger an update.
	DetectMd5hash *string `pulumi:"detectMd5hash"`
	// The ID of the shared flow.
	Name *string `pulumi:"name"`
	// The Apigee Organization name associated with the Apigee instance.
	OrgId string `pulumi:"orgId"`
}

// The set of arguments for constructing a Sharedflow resource.
type SharedflowArgs struct {
	// Path to the config zip bundle.
	ConfigBundle pulumi.StringInput
	// A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
	// will trigger an update.
	DetectMd5hash pulumi.StringPtrInput
	// The ID of the shared flow.
	Name pulumi.StringPtrInput
	// The Apigee Organization name associated with the Apigee instance.
	OrgId pulumi.StringInput
}

func (SharedflowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sharedflowArgs)(nil)).Elem()
}

type SharedflowInput interface {
	pulumi.Input

	ToSharedflowOutput() SharedflowOutput
	ToSharedflowOutputWithContext(ctx context.Context) SharedflowOutput
}

func (*Sharedflow) ElementType() reflect.Type {
	return reflect.TypeOf((**Sharedflow)(nil)).Elem()
}

func (i *Sharedflow) ToSharedflowOutput() SharedflowOutput {
	return i.ToSharedflowOutputWithContext(context.Background())
}

func (i *Sharedflow) ToSharedflowOutputWithContext(ctx context.Context) SharedflowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedflowOutput)
}

// SharedflowArrayInput is an input type that accepts SharedflowArray and SharedflowArrayOutput values.
// You can construct a concrete instance of `SharedflowArrayInput` via:
//
//	SharedflowArray{ SharedflowArgs{...} }
type SharedflowArrayInput interface {
	pulumi.Input

	ToSharedflowArrayOutput() SharedflowArrayOutput
	ToSharedflowArrayOutputWithContext(context.Context) SharedflowArrayOutput
}

type SharedflowArray []SharedflowInput

func (SharedflowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sharedflow)(nil)).Elem()
}

func (i SharedflowArray) ToSharedflowArrayOutput() SharedflowArrayOutput {
	return i.ToSharedflowArrayOutputWithContext(context.Background())
}

func (i SharedflowArray) ToSharedflowArrayOutputWithContext(ctx context.Context) SharedflowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedflowArrayOutput)
}

// SharedflowMapInput is an input type that accepts SharedflowMap and SharedflowMapOutput values.
// You can construct a concrete instance of `SharedflowMapInput` via:
//
//	SharedflowMap{ "key": SharedflowArgs{...} }
type SharedflowMapInput interface {
	pulumi.Input

	ToSharedflowMapOutput() SharedflowMapOutput
	ToSharedflowMapOutputWithContext(context.Context) SharedflowMapOutput
}

type SharedflowMap map[string]SharedflowInput

func (SharedflowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sharedflow)(nil)).Elem()
}

func (i SharedflowMap) ToSharedflowMapOutput() SharedflowMapOutput {
	return i.ToSharedflowMapOutputWithContext(context.Background())
}

func (i SharedflowMap) ToSharedflowMapOutputWithContext(ctx context.Context) SharedflowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedflowMapOutput)
}

type SharedflowOutput struct{ *pulumi.OutputState }

func (SharedflowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Sharedflow)(nil)).Elem()
}

func (o SharedflowOutput) ToSharedflowOutput() SharedflowOutput {
	return o
}

func (o SharedflowOutput) ToSharedflowOutputWithContext(ctx context.Context) SharedflowOutput {
	return o
}

// Path to the config zip bundle.
func (o SharedflowOutput) ConfigBundle() pulumi.StringOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringOutput { return v.ConfigBundle }).(pulumi.StringOutput)
}

// A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
// will trigger an update.
func (o SharedflowOutput) DetectMd5hash() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringPtrOutput { return v.DetectMd5hash }).(pulumi.StringPtrOutput)
}

// The id of the most recently created revision for this shared flow.
func (o SharedflowOutput) LatestRevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringOutput { return v.LatestRevisionId }).(pulumi.StringOutput)
}

// (Computed) Base 64 MD5 hash of the uploaded data. It is speculative as remote does not return hash of the bundle. Remote changes are detected using returned lastModified timestamp.
func (o SharedflowOutput) Md5hash() pulumi.StringOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringOutput { return v.Md5hash }).(pulumi.StringOutput)
}

// Metadata describing the shared flow.
// Structure is documented below.
func (o SharedflowOutput) MetaDatas() SharedflowMetaDataArrayOutput {
	return o.ApplyT(func(v *Sharedflow) SharedflowMetaDataArrayOutput { return v.MetaDatas }).(SharedflowMetaDataArrayOutput)
}

// The ID of the shared flow.
func (o SharedflowOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Apigee Organization name associated with the Apigee instance.
func (o SharedflowOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// A list of revisions of this shared flow.
func (o SharedflowOutput) Revisions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Sharedflow) pulumi.StringArrayOutput { return v.Revisions }).(pulumi.StringArrayOutput)
}

type SharedflowArrayOutput struct{ *pulumi.OutputState }

func (SharedflowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sharedflow)(nil)).Elem()
}

func (o SharedflowArrayOutput) ToSharedflowArrayOutput() SharedflowArrayOutput {
	return o
}

func (o SharedflowArrayOutput) ToSharedflowArrayOutputWithContext(ctx context.Context) SharedflowArrayOutput {
	return o
}

func (o SharedflowArrayOutput) Index(i pulumi.IntInput) SharedflowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Sharedflow {
		return vs[0].([]*Sharedflow)[vs[1].(int)]
	}).(SharedflowOutput)
}

type SharedflowMapOutput struct{ *pulumi.OutputState }

func (SharedflowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sharedflow)(nil)).Elem()
}

func (o SharedflowMapOutput) ToSharedflowMapOutput() SharedflowMapOutput {
	return o
}

func (o SharedflowMapOutput) ToSharedflowMapOutputWithContext(ctx context.Context) SharedflowMapOutput {
	return o
}

func (o SharedflowMapOutput) MapIndex(k pulumi.StringInput) SharedflowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Sharedflow {
		return vs[0].(map[string]*Sharedflow)[vs[1].(string)]
	}).(SharedflowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SharedflowInput)(nil)).Elem(), &Sharedflow{})
	pulumi.RegisterInputType(reflect.TypeOf((*SharedflowArrayInput)(nil)).Elem(), SharedflowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SharedflowMapInput)(nil)).Elem(), SharedflowMap{})
	pulumi.RegisterOutputType(SharedflowOutput{})
	pulumi.RegisterOutputType(SharedflowArrayOutput{})
	pulumi.RegisterOutputType(SharedflowMapOutput{})
}