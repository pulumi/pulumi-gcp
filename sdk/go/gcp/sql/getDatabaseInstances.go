// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sql

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sql"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sql.GetDatabaseInstances(ctx, &sql.GetDatabaseInstancesArgs{
//				Project: pulumi.StringRef("test-project"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDatabaseInstances(ctx *pulumi.Context, args *GetDatabaseInstancesArgs, opts ...pulumi.InvokeOption) (*GetDatabaseInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDatabaseInstancesResult
	err := ctx.Invoke("gcp:sql/getDatabaseInstances:getDatabaseInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseInstances.
type GetDatabaseInstancesArgs struct {
	// To filter out the Cloud SQL instances which are of the specified database version.
	DatabaseVersion *string `pulumi:"databaseVersion"`
	// The ID of the project in which the resources belong. If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// To filter out the Cloud SQL instances which are located in the specified region.
	Region *string `pulumi:"region"`
	// To filter out the Cloud SQL instances based on the current serving state of the database instance. Supported values include `SQL_INSTANCE_STATE_UNSPECIFIED`, `RUNNABLE`, `SUSPENDED`, `PENDING_DELETE`, `PENDING_CREATE`, `MAINTENANCE`, `FAILED`.
	State *string `pulumi:"state"`
	// To filter out the Cloud SQL instances based on the tier(or machine type) of the database instances.
	Tier *string `pulumi:"tier"`
	// To filter out the Cloud SQL instances which are located in the specified zone. This zone refers to the Compute Engine zone that the instance is currently serving from.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getDatabaseInstances.
type GetDatabaseInstancesResult struct {
	DatabaseVersion *string `pulumi:"databaseVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id        string                         `pulumi:"id"`
	Instances []GetDatabaseInstancesInstance `pulumi:"instances"`
	Project   *string                        `pulumi:"project"`
	Region    *string                        `pulumi:"region"`
	State     *string                        `pulumi:"state"`
	Tier      *string                        `pulumi:"tier"`
	Zone      *string                        `pulumi:"zone"`
}

func GetDatabaseInstancesOutput(ctx *pulumi.Context, args GetDatabaseInstancesOutputArgs, opts ...pulumi.InvokeOption) GetDatabaseInstancesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDatabaseInstancesResultOutput, error) {
			args := v.(GetDatabaseInstancesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:sql/getDatabaseInstances:getDatabaseInstances", args, GetDatabaseInstancesResultOutput{}, options).(GetDatabaseInstancesResultOutput), nil
		}).(GetDatabaseInstancesResultOutput)
}

// A collection of arguments for invoking getDatabaseInstances.
type GetDatabaseInstancesOutputArgs struct {
	// To filter out the Cloud SQL instances which are of the specified database version.
	DatabaseVersion pulumi.StringPtrInput `pulumi:"databaseVersion"`
	// The ID of the project in which the resources belong. If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// To filter out the Cloud SQL instances which are located in the specified region.
	Region pulumi.StringPtrInput `pulumi:"region"`
	// To filter out the Cloud SQL instances based on the current serving state of the database instance. Supported values include `SQL_INSTANCE_STATE_UNSPECIFIED`, `RUNNABLE`, `SUSPENDED`, `PENDING_DELETE`, `PENDING_CREATE`, `MAINTENANCE`, `FAILED`.
	State pulumi.StringPtrInput `pulumi:"state"`
	// To filter out the Cloud SQL instances based on the tier(or machine type) of the database instances.
	Tier pulumi.StringPtrInput `pulumi:"tier"`
	// To filter out the Cloud SQL instances which are located in the specified zone. This zone refers to the Compute Engine zone that the instance is currently serving from.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetDatabaseInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseInstances.
type GetDatabaseInstancesResultOutput struct{ *pulumi.OutputState }

func (GetDatabaseInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseInstancesResult)(nil)).Elem()
}

func (o GetDatabaseInstancesResultOutput) ToGetDatabaseInstancesResultOutput() GetDatabaseInstancesResultOutput {
	return o
}

func (o GetDatabaseInstancesResultOutput) ToGetDatabaseInstancesResultOutputWithContext(ctx context.Context) GetDatabaseInstancesResultOutput {
	return o
}

func (o GetDatabaseInstancesResultOutput) DatabaseVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) *string { return v.DatabaseVersion }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatabaseInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDatabaseInstancesResultOutput) Instances() GetDatabaseInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) []GetDatabaseInstancesInstance { return v.Instances }).(GetDatabaseInstancesInstanceArrayOutput)
}

func (o GetDatabaseInstancesResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o GetDatabaseInstancesResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func (o GetDatabaseInstancesResultOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) *string { return v.State }).(pulumi.StringPtrOutput)
}

func (o GetDatabaseInstancesResultOutput) Tier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) *string { return v.Tier }).(pulumi.StringPtrOutput)
}

func (o GetDatabaseInstancesResultOutput) Zone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseInstancesResult) *string { return v.Zone }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatabaseInstancesResultOutput{})
}
