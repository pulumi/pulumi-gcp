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

// Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
//
// * `healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
// * `healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
// * `healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
//
// > **Note:** `healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `healthcare.DicomStoreIamBinding` and `healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
//
// > **Note:** `healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## healthcare.DicomStoreIamPolicy
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
//			_, err = healthcare.NewDicomStoreIamPolicy(ctx, "dicom_store", &healthcare.DicomStoreIamPolicyArgs{
//				DicomStoreId: pulumi.String("your-dicom-store-id"),
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
// ## healthcare.DicomStoreIamBinding
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
//			_, err := healthcare.NewDicomStoreIamBinding(ctx, "dicom_store", &healthcare.DicomStoreIamBindingArgs{
//				DicomStoreId: pulumi.String("your-dicom-store-id"),
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
// ## healthcare.DicomStoreIamMember
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
//			_, err := healthcare.NewDicomStoreIamMember(ctx, "dicom_store", &healthcare.DicomStoreIamMemberArgs{
//				DicomStoreId: pulumi.String("your-dicom-store-id"),
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
// ## healthcare.DicomStoreIamBinding
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
//			_, err := healthcare.NewDicomStoreIamBinding(ctx, "dicom_store", &healthcare.DicomStoreIamBindingArgs{
//				DicomStoreId: pulumi.String("your-dicom-store-id"),
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
// ## healthcare.DicomStoreIamMember
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
//			_, err := healthcare.NewDicomStoreIamMember(ctx, "dicom_store", &healthcare.DicomStoreIamMemberArgs{
//				DicomStoreId: pulumi.String("your-dicom-store-id"),
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
// IAM policy imports use the identifier of the Healthcare DICOM store resource. For example:
//
// * `"{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}"`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
//
// tf
//
// import {
//
//	id = "{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}"
//
//	to = google_healthcare_dicom_store_iam_policy.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember default {{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}
// ```
type DicomStoreIamMember struct {
	pulumi.CustomResourceState

	Condition DicomStoreIamMemberConditionPtrOutput `pulumi:"condition"`
	// The DICOM store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
	// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	DicomStoreId pulumi.StringOutput `pulumi:"dicomStoreId"`
	// (Computed) The etag of the DICOM store's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member pulumi.StringOutput `pulumi:"member"`
	// The role that should be applied. Only one
	// `healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewDicomStoreIamMember registers a new resource with the given unique name, arguments, and options.
func NewDicomStoreIamMember(ctx *pulumi.Context,
	name string, args *DicomStoreIamMemberArgs, opts ...pulumi.ResourceOption) (*DicomStoreIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DicomStoreId == nil {
		return nil, errors.New("invalid value for required argument 'DicomStoreId'")
	}
	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DicomStoreIamMember
	err := ctx.RegisterResource("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDicomStoreIamMember gets an existing DicomStoreIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDicomStoreIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DicomStoreIamMemberState, opts ...pulumi.ResourceOption) (*DicomStoreIamMember, error) {
	var resource DicomStoreIamMember
	err := ctx.ReadResource("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DicomStoreIamMember resources.
type dicomStoreIamMemberState struct {
	Condition *DicomStoreIamMemberCondition `pulumi:"condition"`
	// The DICOM store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
	// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	DicomStoreId *string `pulumi:"dicomStoreId"`
	// (Computed) The etag of the DICOM store's IAM policy.
	Etag *string `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member *string `pulumi:"member"`
	// The role that should be applied. Only one
	// `healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type DicomStoreIamMemberState struct {
	Condition DicomStoreIamMemberConditionPtrInput
	// The DICOM store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
	// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	DicomStoreId pulumi.StringPtrInput
	// (Computed) The etag of the DICOM store's IAM policy.
	Etag pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (DicomStoreIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*dicomStoreIamMemberState)(nil)).Elem()
}

type dicomStoreIamMemberArgs struct {
	Condition *DicomStoreIamMemberCondition `pulumi:"condition"`
	// The DICOM store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
	// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	DicomStoreId string `pulumi:"dicomStoreId"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member string `pulumi:"member"`
	// The role that should be applied. Only one
	// `healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a DicomStoreIamMember resource.
type DicomStoreIamMemberArgs struct {
	Condition DicomStoreIamMemberConditionPtrInput
	// The DICOM store ID, in the form
	// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
	// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
	// project setting will be used as a fallback.
	DicomStoreId pulumi.StringInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member pulumi.StringInput
	// The role that should be applied. Only one
	// `healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (DicomStoreIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dicomStoreIamMemberArgs)(nil)).Elem()
}

type DicomStoreIamMemberInput interface {
	pulumi.Input

	ToDicomStoreIamMemberOutput() DicomStoreIamMemberOutput
	ToDicomStoreIamMemberOutputWithContext(ctx context.Context) DicomStoreIamMemberOutput
}

func (*DicomStoreIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**DicomStoreIamMember)(nil)).Elem()
}

func (i *DicomStoreIamMember) ToDicomStoreIamMemberOutput() DicomStoreIamMemberOutput {
	return i.ToDicomStoreIamMemberOutputWithContext(context.Background())
}

func (i *DicomStoreIamMember) ToDicomStoreIamMemberOutputWithContext(ctx context.Context) DicomStoreIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DicomStoreIamMemberOutput)
}

// DicomStoreIamMemberArrayInput is an input type that accepts DicomStoreIamMemberArray and DicomStoreIamMemberArrayOutput values.
// You can construct a concrete instance of `DicomStoreIamMemberArrayInput` via:
//
//	DicomStoreIamMemberArray{ DicomStoreIamMemberArgs{...} }
type DicomStoreIamMemberArrayInput interface {
	pulumi.Input

	ToDicomStoreIamMemberArrayOutput() DicomStoreIamMemberArrayOutput
	ToDicomStoreIamMemberArrayOutputWithContext(context.Context) DicomStoreIamMemberArrayOutput
}

type DicomStoreIamMemberArray []DicomStoreIamMemberInput

func (DicomStoreIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DicomStoreIamMember)(nil)).Elem()
}

func (i DicomStoreIamMemberArray) ToDicomStoreIamMemberArrayOutput() DicomStoreIamMemberArrayOutput {
	return i.ToDicomStoreIamMemberArrayOutputWithContext(context.Background())
}

func (i DicomStoreIamMemberArray) ToDicomStoreIamMemberArrayOutputWithContext(ctx context.Context) DicomStoreIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DicomStoreIamMemberArrayOutput)
}

// DicomStoreIamMemberMapInput is an input type that accepts DicomStoreIamMemberMap and DicomStoreIamMemberMapOutput values.
// You can construct a concrete instance of `DicomStoreIamMemberMapInput` via:
//
//	DicomStoreIamMemberMap{ "key": DicomStoreIamMemberArgs{...} }
type DicomStoreIamMemberMapInput interface {
	pulumi.Input

	ToDicomStoreIamMemberMapOutput() DicomStoreIamMemberMapOutput
	ToDicomStoreIamMemberMapOutputWithContext(context.Context) DicomStoreIamMemberMapOutput
}

type DicomStoreIamMemberMap map[string]DicomStoreIamMemberInput

func (DicomStoreIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DicomStoreIamMember)(nil)).Elem()
}

func (i DicomStoreIamMemberMap) ToDicomStoreIamMemberMapOutput() DicomStoreIamMemberMapOutput {
	return i.ToDicomStoreIamMemberMapOutputWithContext(context.Background())
}

func (i DicomStoreIamMemberMap) ToDicomStoreIamMemberMapOutputWithContext(ctx context.Context) DicomStoreIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DicomStoreIamMemberMapOutput)
}

type DicomStoreIamMemberOutput struct{ *pulumi.OutputState }

func (DicomStoreIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DicomStoreIamMember)(nil)).Elem()
}

func (o DicomStoreIamMemberOutput) ToDicomStoreIamMemberOutput() DicomStoreIamMemberOutput {
	return o
}

func (o DicomStoreIamMemberOutput) ToDicomStoreIamMemberOutputWithContext(ctx context.Context) DicomStoreIamMemberOutput {
	return o
}

func (o DicomStoreIamMemberOutput) Condition() DicomStoreIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *DicomStoreIamMember) DicomStoreIamMemberConditionPtrOutput { return v.Condition }).(DicomStoreIamMemberConditionPtrOutput)
}

// The DICOM store ID, in the form
// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
// project setting will be used as a fallback.
func (o DicomStoreIamMemberOutput) DicomStoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *DicomStoreIamMember) pulumi.StringOutput { return v.DicomStoreId }).(pulumi.StringOutput)
}

// (Computed) The etag of the DICOM store's IAM policy.
func (o DicomStoreIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *DicomStoreIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
func (o DicomStoreIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *DicomStoreIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o DicomStoreIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *DicomStoreIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type DicomStoreIamMemberArrayOutput struct{ *pulumi.OutputState }

func (DicomStoreIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DicomStoreIamMember)(nil)).Elem()
}

func (o DicomStoreIamMemberArrayOutput) ToDicomStoreIamMemberArrayOutput() DicomStoreIamMemberArrayOutput {
	return o
}

func (o DicomStoreIamMemberArrayOutput) ToDicomStoreIamMemberArrayOutputWithContext(ctx context.Context) DicomStoreIamMemberArrayOutput {
	return o
}

func (o DicomStoreIamMemberArrayOutput) Index(i pulumi.IntInput) DicomStoreIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DicomStoreIamMember {
		return vs[0].([]*DicomStoreIamMember)[vs[1].(int)]
	}).(DicomStoreIamMemberOutput)
}

type DicomStoreIamMemberMapOutput struct{ *pulumi.OutputState }

func (DicomStoreIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DicomStoreIamMember)(nil)).Elem()
}

func (o DicomStoreIamMemberMapOutput) ToDicomStoreIamMemberMapOutput() DicomStoreIamMemberMapOutput {
	return o
}

func (o DicomStoreIamMemberMapOutput) ToDicomStoreIamMemberMapOutputWithContext(ctx context.Context) DicomStoreIamMemberMapOutput {
	return o
}

func (o DicomStoreIamMemberMapOutput) MapIndex(k pulumi.StringInput) DicomStoreIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DicomStoreIamMember {
		return vs[0].(map[string]*DicomStoreIamMember)[vs[1].(string)]
	}).(DicomStoreIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DicomStoreIamMemberInput)(nil)).Elem(), &DicomStoreIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*DicomStoreIamMemberArrayInput)(nil)).Elem(), DicomStoreIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DicomStoreIamMemberMapInput)(nil)).Elem(), DicomStoreIamMemberMap{})
	pulumi.RegisterOutputType(DicomStoreIamMemberOutput{})
	pulumi.RegisterOutputType(DicomStoreIamMemberArrayOutput{})
	pulumi.RegisterOutputType(DicomStoreIamMemberMapOutput{})
}
