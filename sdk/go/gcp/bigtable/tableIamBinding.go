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
// $ pulumi import gcp:bigtable/tableIamBinding:TableIamBinding default projects/{project}/instances/{instance}/tables/{table}
// ```
type TableIamBinding struct {
	pulumi.CustomResourceState

	Condition TableIamBindingConditionPtrOutput `pulumi:"condition"`
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
	Members pulumi.StringArrayOutput `pulumi:"members"`
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

// NewTableIamBinding registers a new resource with the given unique name, arguments, and options.
func NewTableIamBinding(ctx *pulumi.Context,
	name string, args *TableIamBindingArgs, opts ...pulumi.ResourceOption) (*TableIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Instance == nil {
		return nil, errors.New("invalid value for required argument 'Instance'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Table == nil {
		return nil, errors.New("invalid value for required argument 'Table'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TableIamBinding
	err := ctx.RegisterResource("gcp:bigtable/tableIamBinding:TableIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTableIamBinding gets an existing TableIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTableIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableIamBindingState, opts ...pulumi.ResourceOption) (*TableIamBinding, error) {
	var resource TableIamBinding
	err := ctx.ReadResource("gcp:bigtable/tableIamBinding:TableIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TableIamBinding resources.
type tableIamBindingState struct {
	Condition *TableIamBindingCondition `pulumi:"condition"`
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
	Members []string `pulumi:"members"`
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

type TableIamBindingState struct {
	Condition TableIamBindingConditionPtrInput
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
	Members pulumi.StringArrayInput
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

func (TableIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableIamBindingState)(nil)).Elem()
}

type tableIamBindingArgs struct {
	Condition *TableIamBindingCondition `pulumi:"condition"`
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
	Members []string `pulumi:"members"`
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

// The set of arguments for constructing a TableIamBinding resource.
type TableIamBindingArgs struct {
	Condition TableIamBindingConditionPtrInput
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
	Members pulumi.StringArrayInput
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

func (TableIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableIamBindingArgs)(nil)).Elem()
}

type TableIamBindingInput interface {
	pulumi.Input

	ToTableIamBindingOutput() TableIamBindingOutput
	ToTableIamBindingOutputWithContext(ctx context.Context) TableIamBindingOutput
}

func (*TableIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**TableIamBinding)(nil)).Elem()
}

func (i *TableIamBinding) ToTableIamBindingOutput() TableIamBindingOutput {
	return i.ToTableIamBindingOutputWithContext(context.Background())
}

func (i *TableIamBinding) ToTableIamBindingOutputWithContext(ctx context.Context) TableIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableIamBindingOutput)
}

// TableIamBindingArrayInput is an input type that accepts TableIamBindingArray and TableIamBindingArrayOutput values.
// You can construct a concrete instance of `TableIamBindingArrayInput` via:
//
//	TableIamBindingArray{ TableIamBindingArgs{...} }
type TableIamBindingArrayInput interface {
	pulumi.Input

	ToTableIamBindingArrayOutput() TableIamBindingArrayOutput
	ToTableIamBindingArrayOutputWithContext(context.Context) TableIamBindingArrayOutput
}

type TableIamBindingArray []TableIamBindingInput

func (TableIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableIamBinding)(nil)).Elem()
}

func (i TableIamBindingArray) ToTableIamBindingArrayOutput() TableIamBindingArrayOutput {
	return i.ToTableIamBindingArrayOutputWithContext(context.Background())
}

func (i TableIamBindingArray) ToTableIamBindingArrayOutputWithContext(ctx context.Context) TableIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableIamBindingArrayOutput)
}

// TableIamBindingMapInput is an input type that accepts TableIamBindingMap and TableIamBindingMapOutput values.
// You can construct a concrete instance of `TableIamBindingMapInput` via:
//
//	TableIamBindingMap{ "key": TableIamBindingArgs{...} }
type TableIamBindingMapInput interface {
	pulumi.Input

	ToTableIamBindingMapOutput() TableIamBindingMapOutput
	ToTableIamBindingMapOutputWithContext(context.Context) TableIamBindingMapOutput
}

type TableIamBindingMap map[string]TableIamBindingInput

func (TableIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableIamBinding)(nil)).Elem()
}

func (i TableIamBindingMap) ToTableIamBindingMapOutput() TableIamBindingMapOutput {
	return i.ToTableIamBindingMapOutputWithContext(context.Background())
}

func (i TableIamBindingMap) ToTableIamBindingMapOutputWithContext(ctx context.Context) TableIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableIamBindingMapOutput)
}

type TableIamBindingOutput struct{ *pulumi.OutputState }

func (TableIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TableIamBinding)(nil)).Elem()
}

func (o TableIamBindingOutput) ToTableIamBindingOutput() TableIamBindingOutput {
	return o
}

func (o TableIamBindingOutput) ToTableIamBindingOutputWithContext(ctx context.Context) TableIamBindingOutput {
	return o
}

func (o TableIamBindingOutput) Condition() TableIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *TableIamBinding) TableIamBindingConditionPtrOutput { return v.Condition }).(TableIamBindingConditionPtrOutput)
}

// (Computed) The etag of the tables's IAM policy.
func (o TableIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name or relative resource id of the instance that owns the table.
func (o TableIamBindingOutput) Instance() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamBinding) pulumi.StringOutput { return v.Instance }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
func (o TableIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TableIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The project in which the table belongs. If it
// is not provided, this provider will use the provider default.
func (o TableIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
//
// `bigtable.TableIamPolicy` only:
func (o TableIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// The name or relative resource id of the table to manage IAM policies for.
//
// For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
func (o TableIamBindingOutput) Table() pulumi.StringOutput {
	return o.ApplyT(func(v *TableIamBinding) pulumi.StringOutput { return v.Table }).(pulumi.StringOutput)
}

type TableIamBindingArrayOutput struct{ *pulumi.OutputState }

func (TableIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableIamBinding)(nil)).Elem()
}

func (o TableIamBindingArrayOutput) ToTableIamBindingArrayOutput() TableIamBindingArrayOutput {
	return o
}

func (o TableIamBindingArrayOutput) ToTableIamBindingArrayOutputWithContext(ctx context.Context) TableIamBindingArrayOutput {
	return o
}

func (o TableIamBindingArrayOutput) Index(i pulumi.IntInput) TableIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TableIamBinding {
		return vs[0].([]*TableIamBinding)[vs[1].(int)]
	}).(TableIamBindingOutput)
}

type TableIamBindingMapOutput struct{ *pulumi.OutputState }

func (TableIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableIamBinding)(nil)).Elem()
}

func (o TableIamBindingMapOutput) ToTableIamBindingMapOutput() TableIamBindingMapOutput {
	return o
}

func (o TableIamBindingMapOutput) ToTableIamBindingMapOutputWithContext(ctx context.Context) TableIamBindingMapOutput {
	return o
}

func (o TableIamBindingMapOutput) MapIndex(k pulumi.StringInput) TableIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TableIamBinding {
		return vs[0].(map[string]*TableIamBinding)[vs[1].(string)]
	}).(TableIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableIamBindingInput)(nil)).Elem(), &TableIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableIamBindingArrayInput)(nil)).Elem(), TableIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableIamBindingMapInput)(nil)).Elem(), TableIamBindingMap{})
	pulumi.RegisterOutputType(TableIamBindingOutput{})
	pulumi.RegisterOutputType(TableIamBindingArrayOutput{})
	pulumi.RegisterOutputType(TableIamBindingMapOutput{})
}
