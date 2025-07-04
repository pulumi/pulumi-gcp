// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spanner

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
//
// * `spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
//
// > **Warning:** It's entirely possibly to lock yourself out of your database using `spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
//
// * `spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
// * `spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
//
// > **Note:** `spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `spanner.DatabaseIAMBinding` and `spanner.DatabaseIAMMember` or they will fight over what your policy should be.
//
// > **Note:** `spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
//
// ## spanner.DatabaseIAMPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
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
//			_, err = spanner.NewDatabaseIAMPolicy(ctx, "database", &spanner.DatabaseIAMPolicyArgs{
//				Instance:   pulumi.String("your-instance-name"),
//				Database:   pulumi.String("your-database-name"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
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
//						Condition: {
//							Title:       "My Role",
//							Description: pulumi.StringRef("Grant permissions on my_role"),
//							Expression:  "(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = spanner.NewDatabaseIAMPolicy(ctx, "database", &spanner.DatabaseIAMPolicyArgs{
//				Instance:   pulumi.String("your-instance-name"),
//				Database:   pulumi.String("your-database-name"),
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
// ## spanner.DatabaseIAMBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMBinding(ctx, "database", &spanner.DatabaseIAMBindingArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMBinding(ctx, "database", &spanner.DatabaseIAMBindingArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &spanner.DatabaseIAMBindingConditionArgs{
//					Title:       pulumi.String("My Role"),
//					Description: pulumi.String("Grant permissions on my_role"),
//					Expression:  pulumi.String("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))"),
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
// ## spanner.DatabaseIAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMMember(ctx, "database", &spanner.DatabaseIAMMemberArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMMember(ctx, "database", &spanner.DatabaseIAMMemberArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
//				Member:   pulumi.String("user:jane@example.com"),
//				Condition: &spanner.DatabaseIAMMemberConditionArgs{
//					Title:       pulumi.String("My Role"),
//					Description: pulumi.String("Grant permissions on my_role"),
//					Expression:  pulumi.String("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))"),
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
// ## spanner.DatabaseIAMBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMBinding(ctx, "database", &spanner.DatabaseIAMBindingArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMBinding(ctx, "database", &spanner.DatabaseIAMBindingArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &spanner.DatabaseIAMBindingConditionArgs{
//					Title:       pulumi.String("My Role"),
//					Description: pulumi.String("Grant permissions on my_role"),
//					Expression:  pulumi.String("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))"),
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
// ## spanner.DatabaseIAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMMember(ctx, "database", &spanner.DatabaseIAMMemberArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/spanner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spanner.NewDatabaseIAMMember(ctx, "database", &spanner.DatabaseIAMMemberArgs{
//				Instance: pulumi.String("your-instance-name"),
//				Database: pulumi.String("your-database-name"),
//				Role:     pulumi.String("roles/compute.networkUser"),
//				Member:   pulumi.String("user:jane@example.com"),
//				Condition: &spanner.DatabaseIAMMemberConditionArgs{
//					Title:       pulumi.String("My Role"),
//					Description: pulumi.String("Grant permissions on my_role"),
//					Expression:  pulumi.String("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))"),
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
// ## Import
//
// ### Importing IAM policies
//
// IAM policy imports use the identifier of the Spanner Database resource in question. For example:
//
// * `{{project}}/{{instance}}/{{database}}`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
//
// tf
//
// import {
//
//	id = {{project}}/{{instance}}/{{database}}
//
//	to = google_spanner_database_iam_policy.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy default {{project}}/{{instance}}/{{database}}
// ```
type DatabaseIAMPolicy struct {
	pulumi.CustomResourceState

	// The name of the Spanner database.
	Database pulumi.StringOutput `pulumi:"database"`
	// (Computed) The etag of the database's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name of the Spanner instance the database belongs to.
	Instance pulumi.StringOutput `pulumi:"instance"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewDatabaseIAMPolicy registers a new resource with the given unique name, arguments, and options.
func NewDatabaseIAMPolicy(ctx *pulumi.Context,
	name string, args *DatabaseIAMPolicyArgs, opts ...pulumi.ResourceOption) (*DatabaseIAMPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Instance == nil {
		return nil, errors.New("invalid value for required argument 'Instance'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseIAMPolicy
	err := ctx.RegisterResource("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseIAMPolicy gets an existing DatabaseIAMPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseIAMPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseIAMPolicyState, opts ...pulumi.ResourceOption) (*DatabaseIAMPolicy, error) {
	var resource DatabaseIAMPolicy
	err := ctx.ReadResource("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseIAMPolicy resources.
type databaseIAMPolicyState struct {
	// The name of the Spanner database.
	Database *string `pulumi:"database"`
	// (Computed) The etag of the database's IAM policy.
	Etag *string `pulumi:"etag"`
	// The name of the Spanner instance the database belongs to.
	Instance *string `pulumi:"instance"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

type DatabaseIAMPolicyState struct {
	// The name of the Spanner database.
	Database pulumi.StringPtrInput
	// (Computed) The etag of the database's IAM policy.
	Etag pulumi.StringPtrInput
	// The name of the Spanner instance the database belongs to.
	Instance pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DatabaseIAMPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseIAMPolicyState)(nil)).Elem()
}

type databaseIAMPolicyArgs struct {
	// The name of the Spanner database.
	Database string `pulumi:"database"`
	// The name of the Spanner instance the database belongs to.
	Instance string `pulumi:"instance"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a DatabaseIAMPolicy resource.
type DatabaseIAMPolicyArgs struct {
	// The name of the Spanner database.
	Database pulumi.StringInput
	// The name of the Spanner instance the database belongs to.
	Instance pulumi.StringInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput
}

func (DatabaseIAMPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseIAMPolicyArgs)(nil)).Elem()
}

type DatabaseIAMPolicyInput interface {
	pulumi.Input

	ToDatabaseIAMPolicyOutput() DatabaseIAMPolicyOutput
	ToDatabaseIAMPolicyOutputWithContext(ctx context.Context) DatabaseIAMPolicyOutput
}

func (*DatabaseIAMPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseIAMPolicy)(nil)).Elem()
}

func (i *DatabaseIAMPolicy) ToDatabaseIAMPolicyOutput() DatabaseIAMPolicyOutput {
	return i.ToDatabaseIAMPolicyOutputWithContext(context.Background())
}

func (i *DatabaseIAMPolicy) ToDatabaseIAMPolicyOutputWithContext(ctx context.Context) DatabaseIAMPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseIAMPolicyOutput)
}

// DatabaseIAMPolicyArrayInput is an input type that accepts DatabaseIAMPolicyArray and DatabaseIAMPolicyArrayOutput values.
// You can construct a concrete instance of `DatabaseIAMPolicyArrayInput` via:
//
//	DatabaseIAMPolicyArray{ DatabaseIAMPolicyArgs{...} }
type DatabaseIAMPolicyArrayInput interface {
	pulumi.Input

	ToDatabaseIAMPolicyArrayOutput() DatabaseIAMPolicyArrayOutput
	ToDatabaseIAMPolicyArrayOutputWithContext(context.Context) DatabaseIAMPolicyArrayOutput
}

type DatabaseIAMPolicyArray []DatabaseIAMPolicyInput

func (DatabaseIAMPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseIAMPolicy)(nil)).Elem()
}

func (i DatabaseIAMPolicyArray) ToDatabaseIAMPolicyArrayOutput() DatabaseIAMPolicyArrayOutput {
	return i.ToDatabaseIAMPolicyArrayOutputWithContext(context.Background())
}

func (i DatabaseIAMPolicyArray) ToDatabaseIAMPolicyArrayOutputWithContext(ctx context.Context) DatabaseIAMPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseIAMPolicyArrayOutput)
}

// DatabaseIAMPolicyMapInput is an input type that accepts DatabaseIAMPolicyMap and DatabaseIAMPolicyMapOutput values.
// You can construct a concrete instance of `DatabaseIAMPolicyMapInput` via:
//
//	DatabaseIAMPolicyMap{ "key": DatabaseIAMPolicyArgs{...} }
type DatabaseIAMPolicyMapInput interface {
	pulumi.Input

	ToDatabaseIAMPolicyMapOutput() DatabaseIAMPolicyMapOutput
	ToDatabaseIAMPolicyMapOutputWithContext(context.Context) DatabaseIAMPolicyMapOutput
}

type DatabaseIAMPolicyMap map[string]DatabaseIAMPolicyInput

func (DatabaseIAMPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseIAMPolicy)(nil)).Elem()
}

func (i DatabaseIAMPolicyMap) ToDatabaseIAMPolicyMapOutput() DatabaseIAMPolicyMapOutput {
	return i.ToDatabaseIAMPolicyMapOutputWithContext(context.Background())
}

func (i DatabaseIAMPolicyMap) ToDatabaseIAMPolicyMapOutputWithContext(ctx context.Context) DatabaseIAMPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseIAMPolicyMapOutput)
}

type DatabaseIAMPolicyOutput struct{ *pulumi.OutputState }

func (DatabaseIAMPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseIAMPolicy)(nil)).Elem()
}

func (o DatabaseIAMPolicyOutput) ToDatabaseIAMPolicyOutput() DatabaseIAMPolicyOutput {
	return o
}

func (o DatabaseIAMPolicyOutput) ToDatabaseIAMPolicyOutputWithContext(ctx context.Context) DatabaseIAMPolicyOutput {
	return o
}

// The name of the Spanner database.
func (o DatabaseIAMPolicyOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseIAMPolicy) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// (Computed) The etag of the database's IAM policy.
func (o DatabaseIAMPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseIAMPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name of the Spanner instance the database belongs to.
func (o DatabaseIAMPolicyOutput) Instance() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseIAMPolicy) pulumi.StringOutput { return v.Instance }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o DatabaseIAMPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseIAMPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs. If it
// is not provided, the provider project is used.
func (o DatabaseIAMPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseIAMPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type DatabaseIAMPolicyArrayOutput struct{ *pulumi.OutputState }

func (DatabaseIAMPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseIAMPolicy)(nil)).Elem()
}

func (o DatabaseIAMPolicyArrayOutput) ToDatabaseIAMPolicyArrayOutput() DatabaseIAMPolicyArrayOutput {
	return o
}

func (o DatabaseIAMPolicyArrayOutput) ToDatabaseIAMPolicyArrayOutputWithContext(ctx context.Context) DatabaseIAMPolicyArrayOutput {
	return o
}

func (o DatabaseIAMPolicyArrayOutput) Index(i pulumi.IntInput) DatabaseIAMPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseIAMPolicy {
		return vs[0].([]*DatabaseIAMPolicy)[vs[1].(int)]
	}).(DatabaseIAMPolicyOutput)
}

type DatabaseIAMPolicyMapOutput struct{ *pulumi.OutputState }

func (DatabaseIAMPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseIAMPolicy)(nil)).Elem()
}

func (o DatabaseIAMPolicyMapOutput) ToDatabaseIAMPolicyMapOutput() DatabaseIAMPolicyMapOutput {
	return o
}

func (o DatabaseIAMPolicyMapOutput) ToDatabaseIAMPolicyMapOutputWithContext(ctx context.Context) DatabaseIAMPolicyMapOutput {
	return o
}

func (o DatabaseIAMPolicyMapOutput) MapIndex(k pulumi.StringInput) DatabaseIAMPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseIAMPolicy {
		return vs[0].(map[string]*DatabaseIAMPolicy)[vs[1].(string)]
	}).(DatabaseIAMPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseIAMPolicyInput)(nil)).Elem(), &DatabaseIAMPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseIAMPolicyArrayInput)(nil)).Elem(), DatabaseIAMPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseIAMPolicyMapInput)(nil)).Elem(), DatabaseIAMPolicyMap{})
	pulumi.RegisterOutputType(DatabaseIAMPolicyOutput{})
	pulumi.RegisterOutputType(DatabaseIAMPolicyArrayOutput{})
	pulumi.RegisterOutputType(DatabaseIAMPolicyMapOutput{})
}
