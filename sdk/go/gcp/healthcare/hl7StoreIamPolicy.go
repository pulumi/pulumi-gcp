// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package healthcare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Healthcare HL7v2 store. Each of these resources serves a different use case:
//
// * `healthcare.Hl7StoreIamPolicy`: Authoritative. Sets the IAM policy for the HL7v2 store and replaces any existing policy already attached.
// * `healthcare.Hl7StoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the HL7v2 store are preserved.
// * `healthcare.Hl7StoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the HL7v2 store are preserved.
//
// > **Note:** `healthcare.Hl7StoreIamPolicy` **cannot** be used in conjunction with `healthcare.Hl7StoreIamBinding` and `healthcare.Hl7StoreIamMember` or they will fight over what your policy should be.
//
// > **Note:** `healthcare.Hl7StoreIamBinding` resources **can be** used in conjunction with `healthcare.Hl7StoreIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## healthcare.Hl7StoreIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
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
//						Role: "roles/editor",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = healthcare.NewHl7StoreIamPolicy(ctx, "hl7_v2_store", &healthcare.Hl7StoreIamPolicyArgs{
//				Hl7V2StoreId: pulumi.String("your-hl7-v2-store-id"),
//				PolicyData:   pulumi.String(admin.PolicyData),
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
// ## healthcare.Hl7StoreIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := healthcare.NewHl7StoreIamBinding(ctx, "hl7_v2_store", &healthcare.Hl7StoreIamBindingArgs{
//				Hl7V2StoreId: pulumi.String("your-hl7-v2-store-id"),
//				Role:         pulumi.String("roles/editor"),
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
// ## healthcare.Hl7StoreIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := healthcare.NewHl7StoreIamMember(ctx, "hl7_v2_store", &healthcare.Hl7StoreIamMemberArgs{
//				Hl7V2StoreId: pulumi.String("your-hl7-v2-store-id"),
//				Role:         pulumi.String("roles/editor"),
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
// ## healthcare.Hl7StoreIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := healthcare.NewHl7StoreIamBinding(ctx, "hl7_v2_store", &healthcare.Hl7StoreIamBindingArgs{
//				Hl7V2StoreId: pulumi.String("your-hl7-v2-store-id"),
//				Role:         pulumi.String("roles/editor"),
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
// ## healthcare.Hl7StoreIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := healthcare.NewHl7StoreIamMember(ctx, "hl7_v2_store", &healthcare.Hl7StoreIamMemberArgs{
//				Hl7V2StoreId: pulumi.String("your-hl7-v2-store-id"),
//				Role:         pulumi.String("roles/editor"),
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
// ### Importing IAM policies
//
// IAM policy imports use the identifier of the Google Cloud Healthcare HL7v2 store resource. For example:
//
// * `"{{project_id}}/{{location}}/{{dataset}}/{{hl7_v2_store}}"`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
//
// tf
//
// import {
//
//	id = "{{project_id}}/{{location}}/{{dataset}}/{{hl7_v2_store}}"
//
//	to = google_healthcare_hl7_v2_store_iam_policy.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:healthcare/hl7StoreIamPolicy:Hl7StoreIamPolicy default {{project_id}}/{{location}}/{{dataset}}/{{hl7_v2_store}}
// ```
type Hl7StoreIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the HL7v2 store's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId pulumi.StringOutput `pulumi:"hl7V2StoreId"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
}

// NewHl7StoreIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewHl7StoreIamPolicy(ctx *pulumi.Context,
	name string, args *Hl7StoreIamPolicyArgs, opts ...pulumi.ResourceOption) (*Hl7StoreIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hl7V2StoreId == nil {
		return nil, errors.New("invalid value for required argument 'Hl7V2StoreId'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Hl7StoreIamPolicy
	err := ctx.RegisterResource("gcp:healthcare/hl7StoreIamPolicy:Hl7StoreIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHl7StoreIamPolicy gets an existing Hl7StoreIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHl7StoreIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Hl7StoreIamPolicyState, opts ...pulumi.ResourceOption) (*Hl7StoreIamPolicy, error) {
	var resource Hl7StoreIamPolicy
	err := ctx.ReadResource("gcp:healthcare/hl7StoreIamPolicy:Hl7StoreIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Hl7StoreIamPolicy resources.
type hl7StoreIamPolicyState struct {
	// (Computed) The etag of the HL7v2 store's IAM policy.
	Etag *string `pulumi:"etag"`
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId *string `pulumi:"hl7V2StoreId"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
}

type Hl7StoreIamPolicyState struct {
	// (Computed) The etag of the HL7v2 store's IAM policy.
	Etag pulumi.StringPtrInput
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
}

func (Hl7StoreIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*hl7StoreIamPolicyState)(nil)).Elem()
}

type hl7StoreIamPolicyArgs struct {
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId string `pulumi:"hl7V2StoreId"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
}

// The set of arguments for constructing a Hl7StoreIamPolicy resource.
type Hl7StoreIamPolicyArgs struct {
	// The HL7v2 store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
	// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	Hl7V2StoreId pulumi.StringInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
}

func (Hl7StoreIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hl7StoreIamPolicyArgs)(nil)).Elem()
}

type Hl7StoreIamPolicyInput interface {
	pulumi.Input

	ToHl7StoreIamPolicyOutput() Hl7StoreIamPolicyOutput
	ToHl7StoreIamPolicyOutputWithContext(ctx context.Context) Hl7StoreIamPolicyOutput
}

func (*Hl7StoreIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**Hl7StoreIamPolicy)(nil)).Elem()
}

func (i *Hl7StoreIamPolicy) ToHl7StoreIamPolicyOutput() Hl7StoreIamPolicyOutput {
	return i.ToHl7StoreIamPolicyOutputWithContext(context.Background())
}

func (i *Hl7StoreIamPolicy) ToHl7StoreIamPolicyOutputWithContext(ctx context.Context) Hl7StoreIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Hl7StoreIamPolicyOutput)
}

// Hl7StoreIamPolicyArrayInput is an input type that accepts Hl7StoreIamPolicyArray and Hl7StoreIamPolicyArrayOutput values.
// You can construct a concrete instance of `Hl7StoreIamPolicyArrayInput` via:
//
//	Hl7StoreIamPolicyArray{ Hl7StoreIamPolicyArgs{...} }
type Hl7StoreIamPolicyArrayInput interface {
	pulumi.Input

	ToHl7StoreIamPolicyArrayOutput() Hl7StoreIamPolicyArrayOutput
	ToHl7StoreIamPolicyArrayOutputWithContext(context.Context) Hl7StoreIamPolicyArrayOutput
}

type Hl7StoreIamPolicyArray []Hl7StoreIamPolicyInput

func (Hl7StoreIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hl7StoreIamPolicy)(nil)).Elem()
}

func (i Hl7StoreIamPolicyArray) ToHl7StoreIamPolicyArrayOutput() Hl7StoreIamPolicyArrayOutput {
	return i.ToHl7StoreIamPolicyArrayOutputWithContext(context.Background())
}

func (i Hl7StoreIamPolicyArray) ToHl7StoreIamPolicyArrayOutputWithContext(ctx context.Context) Hl7StoreIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Hl7StoreIamPolicyArrayOutput)
}

// Hl7StoreIamPolicyMapInput is an input type that accepts Hl7StoreIamPolicyMap and Hl7StoreIamPolicyMapOutput values.
// You can construct a concrete instance of `Hl7StoreIamPolicyMapInput` via:
//
//	Hl7StoreIamPolicyMap{ "key": Hl7StoreIamPolicyArgs{...} }
type Hl7StoreIamPolicyMapInput interface {
	pulumi.Input

	ToHl7StoreIamPolicyMapOutput() Hl7StoreIamPolicyMapOutput
	ToHl7StoreIamPolicyMapOutputWithContext(context.Context) Hl7StoreIamPolicyMapOutput
}

type Hl7StoreIamPolicyMap map[string]Hl7StoreIamPolicyInput

func (Hl7StoreIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hl7StoreIamPolicy)(nil)).Elem()
}

func (i Hl7StoreIamPolicyMap) ToHl7StoreIamPolicyMapOutput() Hl7StoreIamPolicyMapOutput {
	return i.ToHl7StoreIamPolicyMapOutputWithContext(context.Background())
}

func (i Hl7StoreIamPolicyMap) ToHl7StoreIamPolicyMapOutputWithContext(ctx context.Context) Hl7StoreIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Hl7StoreIamPolicyMapOutput)
}

type Hl7StoreIamPolicyOutput struct{ *pulumi.OutputState }

func (Hl7StoreIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Hl7StoreIamPolicy)(nil)).Elem()
}

func (o Hl7StoreIamPolicyOutput) ToHl7StoreIamPolicyOutput() Hl7StoreIamPolicyOutput {
	return o
}

func (o Hl7StoreIamPolicyOutput) ToHl7StoreIamPolicyOutputWithContext(ctx context.Context) Hl7StoreIamPolicyOutput {
	return o
}

// (Computed) The etag of the HL7v2 store's IAM policy.
func (o Hl7StoreIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *Hl7StoreIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The HL7v2 store ID, in the form
// `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
// `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
// project setting will be used as a fallback.
func (o Hl7StoreIamPolicyOutput) Hl7V2StoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *Hl7StoreIamPolicy) pulumi.StringOutput { return v.Hl7V2StoreId }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o Hl7StoreIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *Hl7StoreIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

type Hl7StoreIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (Hl7StoreIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hl7StoreIamPolicy)(nil)).Elem()
}

func (o Hl7StoreIamPolicyArrayOutput) ToHl7StoreIamPolicyArrayOutput() Hl7StoreIamPolicyArrayOutput {
	return o
}

func (o Hl7StoreIamPolicyArrayOutput) ToHl7StoreIamPolicyArrayOutputWithContext(ctx context.Context) Hl7StoreIamPolicyArrayOutput {
	return o
}

func (o Hl7StoreIamPolicyArrayOutput) Index(i pulumi.IntInput) Hl7StoreIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Hl7StoreIamPolicy {
		return vs[0].([]*Hl7StoreIamPolicy)[vs[1].(int)]
	}).(Hl7StoreIamPolicyOutput)
}

type Hl7StoreIamPolicyMapOutput struct{ *pulumi.OutputState }

func (Hl7StoreIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hl7StoreIamPolicy)(nil)).Elem()
}

func (o Hl7StoreIamPolicyMapOutput) ToHl7StoreIamPolicyMapOutput() Hl7StoreIamPolicyMapOutput {
	return o
}

func (o Hl7StoreIamPolicyMapOutput) ToHl7StoreIamPolicyMapOutputWithContext(ctx context.Context) Hl7StoreIamPolicyMapOutput {
	return o
}

func (o Hl7StoreIamPolicyMapOutput) MapIndex(k pulumi.StringInput) Hl7StoreIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Hl7StoreIamPolicy {
		return vs[0].(map[string]*Hl7StoreIamPolicy)[vs[1].(string)]
	}).(Hl7StoreIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Hl7StoreIamPolicyInput)(nil)).Elem(), &Hl7StoreIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*Hl7StoreIamPolicyArrayInput)(nil)).Elem(), Hl7StoreIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*Hl7StoreIamPolicyMapInput)(nil)).Elem(), Hl7StoreIamPolicyMap{})
	pulumi.RegisterOutputType(Hl7StoreIamPolicyOutput{})
	pulumi.RegisterOutputType(Hl7StoreIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(Hl7StoreIamPolicyMapOutput{})
}
