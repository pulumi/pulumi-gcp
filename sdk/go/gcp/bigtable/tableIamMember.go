// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigtable

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:
//
// * `bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
// * `bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
// * `bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
//
// > **Note:** `bigtable.TableIamPolicy` **cannot** be used in conjunction with `bigtable.TableIamBinding` and `bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `bigtable.TableIamPolicy` replaces the entire policy.
//
// > **Note:** `bigtable.TableIamBinding` resources **can be** used in conjunction with `bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigtable.TableIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
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
//						Role: "roles/bigtable.user",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bigtable.NewTableIamPolicy(ctx, "editor", &bigtable.TableIamPolicyArgs{
//				Project:    pulumi.String("your-project"),
//				Instance:   pulumi.String("your-bigtable-instance"),
//				Table:      pulumi.String("your-bigtable-table"),
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
// ## bigtable.TableIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigtable.NewTableIamBinding(ctx, "editor", &bigtable.TableIamBindingArgs{
//				Table:    pulumi.String("your-bigtable-table"),
//				Instance: pulumi.String("your-bigtable-instance"),
//				Role:     pulumi.String("roles/bigtable.user"),
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
// ## bigtable.TableIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigtable.NewTableIamMember(ctx, "editor", &bigtable.TableIamMemberArgs{
//				Table:    pulumi.String("your-bigtable-table"),
//				Instance: pulumi.String("your-bigtable-instance"),
//				Role:     pulumi.String("roles/bigtable.user"),
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
// ## bigtable.TableIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
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
//						Role: "roles/bigtable.user",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bigtable.NewTableIamPolicy(ctx, "editor", &bigtable.TableIamPolicyArgs{
//				Project:    pulumi.String("your-project"),
//				Instance:   pulumi.String("your-bigtable-instance"),
//				Table:      pulumi.String("your-bigtable-table"),
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
// ## bigtable.TableIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigtable.NewTableIamBinding(ctx, "editor", &bigtable.TableIamBindingArgs{
//				Table:    pulumi.String("your-bigtable-table"),
//				Instance: pulumi.String("your-bigtable-instance"),
//				Role:     pulumi.String("roles/bigtable.user"),
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
// ## bigtable.TableIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigtable"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigtable.NewTableIamMember(ctx, "editor", &bigtable.TableIamMemberArgs{
//				Table:    pulumi.String("your-bigtable-table"),
//				Instance: pulumi.String("your-bigtable-instance"),
//				Role:     pulumi.String("roles/bigtable.user"),
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
// ### Importing IAM policies
//
// IAM policy imports use the `table` identifier of the Bigtable Table resource only. For example:
//
// * `"projects/{project}/instances/{instance}/tables/{table}"`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
//
// tf
//
// import {
//
//	id = "projects/{project}/instances/{instance}/tables/{table}"
//
//	to = google_bigtable_table_iam_policy.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:bigtable/tableIamMember:TableIamMember default projects/{project}/instances/{instance}/tables/{table}
// ```
type TableIamMember struct {
	pulumi.CustomResourceState

	Condition TableIamMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the tables's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name or relative resource id of the instance that owns the table.
	Instance pulumi.StringOutput `pulumi:"instance"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member pulumi.StringOutput `pulumi:"member"`
	// The project in which the table belongs. If it
	// is not provided, this provider will use the provider default.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
	//
	// `bigtable.TableIamPolicy` only:
	Role pulumi.StringOutput `pulumi:"role"`
	// The name or relative resource id of the table to manage IAM policies for.
	//
	// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
	Table pulumi.StringOutput `pulumi:"table"`
}

// NewTableIamMember registers a new resource with the given unique name, arguments, and options.
func NewTableIamMember(ctx *pulumi.Context,
	name string, args *TableIamMemberArgs, opts ...pulumi.ResourceOption) (*TableIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Instance == nil {
		return nil, errors.New("invalid value for required argument 'Instance'")
	}
	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Table == nil {
		return nil, errors.New("invalid value for required argument 'Table'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TableIamMember
	err := ctx.RegisterResource("gcp:bigtable/tableIamMember:TableIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTableIamMember gets an existing TableIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTableIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableIamMemberState, opts ...pulumi.ResourceOption) (*TableIamMember, error) {
	var resource TableIamMember
	err := ctx.ReadResource("gcp:bigtable/tableIamMember:TableIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TableIamMember resources.
type tableIamMemberState struct {
	Condition *TableIamMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the tables's IAM policy.
	Etag *string `pulumi:"etag"`
	// The name or relative resource id of the instance that owns the table.
	Instance *string `pulumi:"instance"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member *string `pulumi:"member"`
	// The project in which the table belongs. If it
	// is not provided, this provider will use the provider default.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
	//
	// `bigtable.TableIamPolicy` only:
	Role *string `pulumi:"role"`
	// The name or relative resource id of the table to manage IAM policies for.
	//
	// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
	Table *string `pulumi:"table"`
}

type TableIamMemberState struct {
	Condition TableIamMemberConditionPtrInput
	// (Computed) The etag of the tables's IAM policy.
	Etag pulumi.StringPtrInput
	// The name or relative resource id of the instance that owns the table.
	Instance pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member pulumi.StringPtrInput
	// The project in which the table belongs. If it
	// is not provided, this provider will use the provider default.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
	//
	// `bigtable.TableIamPolicy` only:
	Role pulumi.StringPtrInput
	// The name or relative resource id of the table to manage IAM policies for.
	//
	// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
	Table pulumi.StringPtrInput
}

func (TableIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableIamMemberState)(nil)).Elem()
}

type tableIamMemberArgs struct {
	Condition *TableIamMemberCondition `pulumi:"condition"`
	// The name or relative resource id of the instance that owns the table.
	Instance string `pulumi:"instance"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member string `pulumi:"member"`
	// The project in which the table belongs. If it
	// is not provided, this provider will use the provider default.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
	//
	// `bigtable.TableIamPolicy` only:
	Role string `pulumi:"role"`
	// The name or relative resource id of the table to manage IAM policies for.
	//
	// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
	Table string `pulumi:"table"`
}

// The set of arguments for constructing a TableIamMember resource.
type TableIamMemberArgs struct {
	Condition TableIamMemberConditionPtrInput
	// The name or relative resource id of the instance that owns the table.
	Instance pulumi.StringInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Member pulumi.StringInput
	// The project in which the table belongs. If it
	// is not provided, this provider will use the provider default.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
	//
	// `bigtable.TableIamPolicy` only:
	Role pulumi.StringInput
	// The name or relative resource id of the table to manage IAM policies for.
	//
	// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
	Table pulumi.StringInput
}

func (TableIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableIamMemberArgs)(nil)).Elem()
}

type TableIamMemberInput interface {
	pulumi.Input

	ToTableIamMemberOutput() TableIamMemberOutput
	ToTableIamMemberOutputWithContext(ctx context.Context) TableIamMemberOutput
}

func (*TableIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**TableIamMember)(nil)).Elem()
}

func (i *TableIamMember) ToTableIamMemberOutput() TableIamMemberOutput {
	return i.ToTableIamMemberOutputWithContext(context.Background())
}

func (i *TableIamMember) ToTableIamMemberOutputWithContext(ctx context.Context) TableIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableIamMemberOutput)
}

// TableIamMemberArrayInput is an input type that accepts TableIamMemberArray and TableIamMemberArrayOutput values.
// You can construct a concrete instance of `TableIamMemberArrayInput` via:
//
//	TableIamMemberArray{ TableIamMemberArgs{...} }
type TableIamMemberArrayInput interface {
	pulumi.Input

	ToTableIamMemberArrayOutput() TableIamMemberArrayOutput
	ToTableIamMemberArrayOutputWithContext(context.Context) TableIamMemberArrayOutput
}

type TableIamMemberArray []TableIamMemberInput

func (TableIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableIamMember)(nil)).Elem()
}

func (i TableIamMemberArray) ToTableIamMemberArrayOutput() TableIamMemberArrayOutput {
	return i.ToTableIamMemberArrayOutputWithContext(context.Background())
}

func (i TableIamMemberArray) ToTableIamMemberArrayOutputWithContext(ctx context.Context) TableIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableIamMemberArrayOutput)
}

// TableIamMemberMapInput is an input type that accepts TableIamMemberMap and TableIamMemberMapOutput values.
// You can construct a concrete instance of `TableIamMemberMapInput` via:
//
//	TableIamMemberMap{ "key": TableIamMemberArgs{...} }
type TableIamMemberMapInput interface {
	pulumi.Input

	ToTableIamMemberMapOutput() TableIamMemberMapOutput
	ToTableIamMemberMapOutputWithContext(context.Context) TableIamMemberMapOutput
}

type TableIamMemberMap map[string]TableIamMemberInput

func (TableIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableIamMember)(nil)).Elem()
}

func (i TableIamMemberMap) ToTableIamMemberMapOutput() TableIamMemberMapOutput {
	return i.ToTableIamMemberMapOutputWithContext(context.Background())
}

func (i TableIamMemberMap) ToTableIamMemberMapOutputWithContext(ctx context.Context) TableIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableIamMemberMapOutput)
}

type TableIamMemberOutput struct{ *pulumi.OutputState }

func (TableIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TableIamMember)(nil)).Elem()
}

func (o TableIamMemberOutput) ToTableIamMemberOutput() TableIamMemberOutput {
	return o
}

func (o TableIamMemberOutput) ToTableIamMemberOutputWithContext(ctx context.Context) TableIamMemberOutput {
	return o
}

func (o TableIamMemberOutput) Condition() TableIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *TableIamMember) TableIamMemberConditionPtrOutput { return v.Condition }).(TableIamMemberConditionPtrOutput)
}

// (Computed) The etag of the tables's IAM policy.
func (o TableIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name or relative resource id of the instance that owns the table.
func (o TableIamMemberOutput) Instance() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamMember) pulumi.StringOutput { return v.Instance }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
func (o TableIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The project in which the table belongs. If it
// is not provided, this provider will use the provider default.
func (o TableIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
//
// `bigtable.TableIamPolicy` only:
func (o TableIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// The name or relative resource id of the table to manage IAM policies for.
//
// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
func (o TableIamMemberOutput) Table() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamMember) pulumi.StringOutput { return v.Table }).(pulumi.StringOutput)
}

type TableIamMemberArrayOutput struct{ *pulumi.OutputState }

func (TableIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableIamMember)(nil)).Elem()
}

func (o TableIamMemberArrayOutput) ToTableIamMemberArrayOutput() TableIamMemberArrayOutput {
	return o
}

func (o TableIamMemberArrayOutput) ToTableIamMemberArrayOutputWithContext(ctx context.Context) TableIamMemberArrayOutput {
	return o
}

func (o TableIamMemberArrayOutput) Index(i pulumi.IntInput) TableIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TableIamMember {
		return vs[0].([]*TableIamMember)[vs[1].(int)]
	}).(TableIamMemberOutput)
}

type TableIamMemberMapOutput struct{ *pulumi.OutputState }

func (TableIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableIamMember)(nil)).Elem()
}

func (o TableIamMemberMapOutput) ToTableIamMemberMapOutput() TableIamMemberMapOutput {
	return o
}

func (o TableIamMemberMapOutput) ToTableIamMemberMapOutputWithContext(ctx context.Context) TableIamMemberMapOutput {
	return o
}

func (o TableIamMemberMapOutput) MapIndex(k pulumi.StringInput) TableIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TableIamMember {
		return vs[0].(map[string]*TableIamMember)[vs[1].(string)]
	}).(TableIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableIamMemberInput)(nil)).Elem(), &TableIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableIamMemberArrayInput)(nil)).Elem(), TableIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableIamMemberMapInput)(nil)).Elem(), TableIamMemberMap{})
	pulumi.RegisterOutputType(TableIamMemberOutput{})
	pulumi.RegisterOutputType(TableIamMemberArrayOutput{})
	pulumi.RegisterOutputType(TableIamMemberMapOutput{})
}
