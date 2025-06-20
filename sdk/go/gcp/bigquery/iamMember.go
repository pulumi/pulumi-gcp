// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigquery

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
//
// * `bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
// * `bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
// * `bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `bigquery.IamPolicy`: Retrieves the IAM policy for the table
//
// > **Note:** `bigquery.IamPolicy` **cannot** be used in conjunction with `bigquery.IamBinding` and `bigquery.IamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigquery.IamBinding` resources **can be** used in conjunction with `bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigquery.IamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
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
//						Role: "roles/bigquery.dataOwner",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bigquery.NewIamPolicy(ctx, "policy", &bigquery.IamPolicyArgs{
//				Project:    pulumi.Any(test.Project),
//				DatasetId:  pulumi.Any(test.DatasetId),
//				TableId:    pulumi.Any(test.TableId),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// ## bigquery.IamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquery.NewIamBinding(ctx, "binding", &bigquery.IamBindingArgs{
//				Project:   pulumi.Any(test.Project),
//				DatasetId: pulumi.Any(test.DatasetId),
//				TableId:   pulumi.Any(test.TableId),
//				Role:      pulumi.String("roles/bigquery.dataOwner"),
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
// ## bigquery.IamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquery.NewIamMember(ctx, "member", &bigquery.IamMemberArgs{
//				Project:   pulumi.Any(test.Project),
//				DatasetId: pulumi.Any(test.DatasetId),
//				TableId:   pulumi.Any(test.TableId),
//				Role:      pulumi.String("roles/bigquery.dataOwner"),
//				Member:    pulumi.String("user:jane@example.com"),
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
// ## This resource supports User Project Overrides.
//
// -
//
// # IAM policy for BigQuery Table
// Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
//
// * `bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
// * `bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
// * `bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `bigquery.IamPolicy`: Retrieves the IAM policy for the table
//
// > **Note:** `bigquery.IamPolicy` **cannot** be used in conjunction with `bigquery.IamBinding` and `bigquery.IamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigquery.IamBinding` resources **can be** used in conjunction with `bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigquery.IamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
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
//						Role: "roles/bigquery.dataOwner",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bigquery.NewIamPolicy(ctx, "policy", &bigquery.IamPolicyArgs{
//				Project:    pulumi.Any(test.Project),
//				DatasetId:  pulumi.Any(test.DatasetId),
//				TableId:    pulumi.Any(test.TableId),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// ## bigquery.IamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquery.NewIamBinding(ctx, "binding", &bigquery.IamBindingArgs{
//				Project:   pulumi.Any(test.Project),
//				DatasetId: pulumi.Any(test.DatasetId),
//				TableId:   pulumi.Any(test.TableId),
//				Role:      pulumi.String("roles/bigquery.dataOwner"),
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
// ## bigquery.IamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigquery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigquery.NewIamMember(ctx, "member", &bigquery.IamMemberArgs{
//				Project:   pulumi.Any(test.Project),
//				DatasetId: pulumi.Any(test.DatasetId),
//				TableId:   pulumi.Any(test.TableId),
//				Role:      pulumi.String("roles/bigquery.dataOwner"),
//				Member:    pulumi.String("user:jane@example.com"),
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
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
//
// * {{project}}/{{dataset_id}}/{{table_id}}
//
// * {{dataset_id}}/{{table_id}}
//
// * {{table_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// BigQuery table IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:bigquery/iamMember:IamMember editor "projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:bigquery/iamMember:IamMember editor "projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:bigquery/iamMember:IamMember editor projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type IamMember struct {
	pulumi.CustomResourceState

	Condition IamMemberConditionPtrOutput `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	DatasetId pulumi.StringOutput `pulumi:"datasetId"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member pulumi.StringOutput `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	TableId pulumi.StringOutput `pulumi:"tableId"`
}

// NewIamMember registers a new resource with the given unique name, arguments, and options.
func NewIamMember(ctx *pulumi.Context,
	name string, args *IamMemberArgs, opts ...pulumi.ResourceOption) (*IamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatasetId == nil {
		return nil, errors.New("invalid value for required argument 'DatasetId'")
	}
	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.TableId == nil {
		return nil, errors.New("invalid value for required argument 'TableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IamMember
	err := ctx.RegisterResource("gcp:bigquery/iamMember:IamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIamMember gets an existing IamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IamMemberState, opts ...pulumi.ResourceOption) (*IamMember, error) {
	var resource IamMember
	err := ctx.ReadResource("gcp:bigquery/iamMember:IamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IamMember resources.
type iamMemberState struct {
	Condition *IamMemberCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	DatasetId *string `pulumi:"datasetId"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member *string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	TableId *string `pulumi:"tableId"`
}

type IamMemberState struct {
	Condition IamMemberConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	DatasetId pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	TableId pulumi.StringPtrInput
}

func (IamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*iamMemberState)(nil)).Elem()
}

type iamMemberArgs struct {
	Condition *IamMemberCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	DatasetId string `pulumi:"datasetId"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	TableId string `pulumi:"tableId"`
}

// The set of arguments for constructing a IamMember resource.
type IamMemberArgs struct {
	Condition IamMemberConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	DatasetId pulumi.StringInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Member pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	TableId pulumi.StringInput
}

func (IamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*iamMemberArgs)(nil)).Elem()
}

type IamMemberInput interface {
	pulumi.Input

	ToIamMemberOutput() IamMemberOutput
	ToIamMemberOutputWithContext(ctx context.Context) IamMemberOutput
}

func (*IamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**IamMember)(nil)).Elem()
}

func (i *IamMember) ToIamMemberOutput() IamMemberOutput {
	return i.ToIamMemberOutputWithContext(context.Background())
}

func (i *IamMember) ToIamMemberOutputWithContext(ctx context.Context) IamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IamMemberOutput)
}

// IamMemberArrayInput is an input type that accepts IamMemberArray and IamMemberArrayOutput values.
// You can construct a concrete instance of `IamMemberArrayInput` via:
//
//	IamMemberArray{ IamMemberArgs{...} }
type IamMemberArrayInput interface {
	pulumi.Input

	ToIamMemberArrayOutput() IamMemberArrayOutput
	ToIamMemberArrayOutputWithContext(context.Context) IamMemberArrayOutput
}

type IamMemberArray []IamMemberInput

func (IamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IamMember)(nil)).Elem()
}

func (i IamMemberArray) ToIamMemberArrayOutput() IamMemberArrayOutput {
	return i.ToIamMemberArrayOutputWithContext(context.Background())
}

func (i IamMemberArray) ToIamMemberArrayOutputWithContext(ctx context.Context) IamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IamMemberArrayOutput)
}

// IamMemberMapInput is an input type that accepts IamMemberMap and IamMemberMapOutput values.
// You can construct a concrete instance of `IamMemberMapInput` via:
//
//	IamMemberMap{ "key": IamMemberArgs{...} }
type IamMemberMapInput interface {
	pulumi.Input

	ToIamMemberMapOutput() IamMemberMapOutput
	ToIamMemberMapOutputWithContext(context.Context) IamMemberMapOutput
}

type IamMemberMap map[string]IamMemberInput

func (IamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IamMember)(nil)).Elem()
}

func (i IamMemberMap) ToIamMemberMapOutput() IamMemberMapOutput {
	return i.ToIamMemberMapOutputWithContext(context.Background())
}

func (i IamMemberMap) ToIamMemberMapOutputWithContext(ctx context.Context) IamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IamMemberMapOutput)
}

type IamMemberOutput struct{ *pulumi.OutputState }

func (IamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IamMember)(nil)).Elem()
}

func (o IamMemberOutput) ToIamMemberOutput() IamMemberOutput {
	return o
}

func (o IamMemberOutput) ToIamMemberOutputWithContext(ctx context.Context) IamMemberOutput {
	return o
}

func (o IamMemberOutput) Condition() IamMemberConditionPtrOutput {
	return o.ApplyT(func(v *IamMember) IamMemberConditionPtrOutput { return v.Condition }).(IamMemberConditionPtrOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o IamMemberOutput) DatasetId() pulumi.StringOutput {
	return o.ApplyT(func(v *IamMember) pulumi.StringOutput { return v.DatasetId }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o IamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *IamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
func (o IamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *IamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o IamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *IamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o IamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *IamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o IamMemberOutput) TableId() pulumi.StringOutput {
	return o.ApplyT(func(v *IamMember) pulumi.StringOutput { return v.TableId }).(pulumi.StringOutput)
}

type IamMemberArrayOutput struct{ *pulumi.OutputState }

func (IamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IamMember)(nil)).Elem()
}

func (o IamMemberArrayOutput) ToIamMemberArrayOutput() IamMemberArrayOutput {
	return o
}

func (o IamMemberArrayOutput) ToIamMemberArrayOutputWithContext(ctx context.Context) IamMemberArrayOutput {
	return o
}

func (o IamMemberArrayOutput) Index(i pulumi.IntInput) IamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IamMember {
		return vs[0].([]*IamMember)[vs[1].(int)]
	}).(IamMemberOutput)
}

type IamMemberMapOutput struct{ *pulumi.OutputState }

func (IamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IamMember)(nil)).Elem()
}

func (o IamMemberMapOutput) ToIamMemberMapOutput() IamMemberMapOutput {
	return o
}

func (o IamMemberMapOutput) ToIamMemberMapOutputWithContext(ctx context.Context) IamMemberMapOutput {
	return o
}

func (o IamMemberMapOutput) MapIndex(k pulumi.StringInput) IamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IamMember {
		return vs[0].(map[string]*IamMember)[vs[1].(string)]
	}).(IamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IamMemberInput)(nil)).Elem(), &IamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*IamMemberArrayInput)(nil)).Elem(), IamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IamMemberMapInput)(nil)).Elem(), IamMemberMap{})
	pulumi.RegisterOutputType(IamMemberOutput{})
	pulumi.RegisterOutputType(IamMemberArrayOutput{})
	pulumi.RegisterOutputType(IamMemberMapOutput{})
}
