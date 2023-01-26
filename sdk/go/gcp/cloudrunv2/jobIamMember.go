// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudrunv2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
//
// * `cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
// * `cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved.
// * `cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved.
//
// > **Note:** `cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `cloudrunv2.JobIamBinding` and `cloudrunv2.JobIamMember` or they will fight over what your policy should be.
//
// > **Note:** `cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## google\_cloud\_run\_v2\_job\_iam\_policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudrunv2"
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
//			_, err = cloudrunv2.NewJobIamPolicy(ctx, "policy", &cloudrunv2.JobIamPolicyArgs{
//				Project:    pulumi.Any(google_cloud_run_v2_job.Default.Project),
//				Location:   pulumi.Any(google_cloud_run_v2_job.Default.Location),
//				PolicyData: *pulumi.String(admin.PolicyData),
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
// ## google\_cloud\_run\_v2\_job\_iam\_binding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.NewJobIamBinding(ctx, "binding", &cloudrunv2.JobIamBindingArgs{
//				Project:  pulumi.Any(google_cloud_run_v2_job.Default.Project),
//				Location: pulumi.Any(google_cloud_run_v2_job.Default.Location),
//				Role:     pulumi.String("roles/viewer"),
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
// ## google\_cloud\_run\_v2\_job\_iam\_member
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudrunv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudrunv2.NewJobIamMember(ctx, "member", &cloudrunv2.JobIamMemberArgs{
//				Project:  pulumi.Any(google_cloud_run_v2_job.Default.Project),
//				Location: pulumi.Any(google_cloud_run_v2_job.Default.Location),
//				Role:     pulumi.String("roles/viewer"),
//				Member:   pulumi.String("user:jane@example.com"),
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
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/jobs/{{name}} * {{project}}/{{location}}/{{name}} * {{location}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud Run (v2 API) job IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//
//	$ pulumi import gcp:cloudrunv2/jobIamMember:JobIamMember editor "projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:cloudrunv2/jobIamMember:JobIamMember editor "projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:cloudrunv2/jobIamMember:JobIamMember editor projects/{{project}}/locations/{{location}}/jobs/{{job}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type JobIamMember struct {
	pulumi.CustomResourceState

	Condition JobIamMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the cloud run job Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringOutput `pulumi:"location"`
	Member   pulumi.StringOutput `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudrunv2.JobIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewJobIamMember registers a new resource with the given unique name, arguments, and options.
func NewJobIamMember(ctx *pulumi.Context,
	name string, args *JobIamMemberArgs, opts ...pulumi.ResourceOption) (*JobIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource JobIamMember
	err := ctx.RegisterResource("gcp:cloudrunv2/jobIamMember:JobIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJobIamMember gets an existing JobIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJobIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobIamMemberState, opts ...pulumi.ResourceOption) (*JobIamMember, error) {
	var resource JobIamMember
	err := ctx.ReadResource("gcp:cloudrunv2/jobIamMember:JobIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JobIamMember resources.
type jobIamMemberState struct {
	Condition *JobIamMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the cloud run job Used to find the parent resource to bind the IAM policy to
	Location *string `pulumi:"location"`
	Member   *string `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudrunv2.JobIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type JobIamMemberState struct {
	Condition JobIamMemberConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the cloud run job Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	Member   pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudrunv2.JobIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (JobIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobIamMemberState)(nil)).Elem()
}

type jobIamMemberArgs struct {
	Condition *JobIamMemberCondition `pulumi:"condition"`
	// The location of the cloud run job Used to find the parent resource to bind the IAM policy to
	Location *string `pulumi:"location"`
	Member   string  `pulumi:"member"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `cloudrunv2.JobIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a JobIamMember resource.
type JobIamMemberArgs struct {
	Condition JobIamMemberConditionPtrInput
	// The location of the cloud run job Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	Member   pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `cloudrunv2.JobIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (JobIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobIamMemberArgs)(nil)).Elem()
}

type JobIamMemberInput interface {
	pulumi.Input

	ToJobIamMemberOutput() JobIamMemberOutput
	ToJobIamMemberOutputWithContext(ctx context.Context) JobIamMemberOutput
}

func (*JobIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**JobIamMember)(nil)).Elem()
}

func (i *JobIamMember) ToJobIamMemberOutput() JobIamMemberOutput {
	return i.ToJobIamMemberOutputWithContext(context.Background())
}

func (i *JobIamMember) ToJobIamMemberOutputWithContext(ctx context.Context) JobIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobIamMemberOutput)
}

// JobIamMemberArrayInput is an input type that accepts JobIamMemberArray and JobIamMemberArrayOutput values.
// You can construct a concrete instance of `JobIamMemberArrayInput` via:
//
//	JobIamMemberArray{ JobIamMemberArgs{...} }
type JobIamMemberArrayInput interface {
	pulumi.Input

	ToJobIamMemberArrayOutput() JobIamMemberArrayOutput
	ToJobIamMemberArrayOutputWithContext(context.Context) JobIamMemberArrayOutput
}

type JobIamMemberArray []JobIamMemberInput

func (JobIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobIamMember)(nil)).Elem()
}

func (i JobIamMemberArray) ToJobIamMemberArrayOutput() JobIamMemberArrayOutput {
	return i.ToJobIamMemberArrayOutputWithContext(context.Background())
}

func (i JobIamMemberArray) ToJobIamMemberArrayOutputWithContext(ctx context.Context) JobIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobIamMemberArrayOutput)
}

// JobIamMemberMapInput is an input type that accepts JobIamMemberMap and JobIamMemberMapOutput values.
// You can construct a concrete instance of `JobIamMemberMapInput` via:
//
//	JobIamMemberMap{ "key": JobIamMemberArgs{...} }
type JobIamMemberMapInput interface {
	pulumi.Input

	ToJobIamMemberMapOutput() JobIamMemberMapOutput
	ToJobIamMemberMapOutputWithContext(context.Context) JobIamMemberMapOutput
}

type JobIamMemberMap map[string]JobIamMemberInput

func (JobIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobIamMember)(nil)).Elem()
}

func (i JobIamMemberMap) ToJobIamMemberMapOutput() JobIamMemberMapOutput {
	return i.ToJobIamMemberMapOutputWithContext(context.Background())
}

func (i JobIamMemberMap) ToJobIamMemberMapOutputWithContext(ctx context.Context) JobIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobIamMemberMapOutput)
}

type JobIamMemberOutput struct{ *pulumi.OutputState }

func (JobIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JobIamMember)(nil)).Elem()
}

func (o JobIamMemberOutput) ToJobIamMemberOutput() JobIamMemberOutput {
	return o
}

func (o JobIamMemberOutput) ToJobIamMemberOutputWithContext(ctx context.Context) JobIamMemberOutput {
	return o
}

func (o JobIamMemberOutput) Condition() JobIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *JobIamMember) JobIamMemberConditionPtrOutput { return v.Condition }).(JobIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o JobIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *JobIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the cloud run job Used to find the parent resource to bind the IAM policy to
func (o JobIamMemberOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *JobIamMember) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o JobIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *JobIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o JobIamMemberOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *JobIamMember) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o JobIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *JobIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `cloudrunv2.JobIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o JobIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *JobIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type JobIamMemberArrayOutput struct{ *pulumi.OutputState }

func (JobIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobIamMember)(nil)).Elem()
}

func (o JobIamMemberArrayOutput) ToJobIamMemberArrayOutput() JobIamMemberArrayOutput {
	return o
}

func (o JobIamMemberArrayOutput) ToJobIamMemberArrayOutputWithContext(ctx context.Context) JobIamMemberArrayOutput {
	return o
}

func (o JobIamMemberArrayOutput) Index(i pulumi.IntInput) JobIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JobIamMember {
		return vs[0].([]*JobIamMember)[vs[1].(int)]
	}).(JobIamMemberOutput)
}

type JobIamMemberMapOutput struct{ *pulumi.OutputState }

func (JobIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobIamMember)(nil)).Elem()
}

func (o JobIamMemberMapOutput) ToJobIamMemberMapOutput() JobIamMemberMapOutput {
	return o
}

func (o JobIamMemberMapOutput) ToJobIamMemberMapOutputWithContext(ctx context.Context) JobIamMemberMapOutput {
	return o
}

func (o JobIamMemberMapOutput) MapIndex(k pulumi.StringInput) JobIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JobIamMember {
		return vs[0].(map[string]*JobIamMember)[vs[1].(string)]
	}).(JobIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobIamMemberInput)(nil)).Elem(), &JobIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobIamMemberArrayInput)(nil)).Elem(), JobIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobIamMemberMapInput)(nil)).Elem(), JobIamMemberMap{})
	pulumi.RegisterOutputType(JobIamMemberOutput{})
	pulumi.RegisterOutputType(JobIamMemberArrayOutput{})
	pulumi.RegisterOutputType(JobIamMemberMapOutput{})
}