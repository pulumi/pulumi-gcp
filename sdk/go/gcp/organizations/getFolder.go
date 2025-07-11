// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a Google Cloud Folder.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myFolder1, err := organizations.LookupFolder(ctx, &organizations.LookupFolderArgs{
//				Folder:             "folders/12345",
//				LookupOrganization: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			myFolder2, err := organizations.LookupFolder(ctx, &organizations.LookupFolderArgs{
//				Folder: "folders/23456",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("myFolder1Organization", myFolder1.Organization)
//			ctx.Export("myFolder2Parent", myFolder2.Parent)
//			return nil
//		})
//	}
//
// ```
func LookupFolder(ctx *pulumi.Context, args *LookupFolderArgs, opts ...pulumi.InvokeOption) (*LookupFolderResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFolderResult
	err := ctx.Invoke("gcp:organizations/getFolder:getFolder", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFolder.
type LookupFolderArgs struct {
	// The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
	Folder string `pulumi:"folder"`
	// `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
	LookupOrganization *bool `pulumi:"lookupOrganization"`
}

// A collection of values returned by getFolder.
type LookupFolderResult struct {
	// Timestamp when the Organization was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
	CreateTime         string `pulumi:"createTime"`
	DeletionProtection bool   `pulumi:"deletionProtection"`
	// The folder's display name.
	DisplayName string `pulumi:"displayName"`
	Folder      string `pulumi:"folder"`
	FolderId    string `pulumi:"folderId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Folder's current lifecycle state.
	LifecycleState     string `pulumi:"lifecycleState"`
	LookupOrganization *bool  `pulumi:"lookupOrganization"`
	// The resource name of the Folder in the form `folders/{folder_id}`.
	Name string `pulumi:"name"`
	// If `lookupOrganization` is enable, the resource name of the Organization that the folder belongs.
	Organization string `pulumi:"organization"`
	// The resource name of the parent Folder or Organization.
	Parent string `pulumi:"parent"`
}

func LookupFolderOutput(ctx *pulumi.Context, args LookupFolderOutputArgs, opts ...pulumi.InvokeOption) LookupFolderResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFolderResultOutput, error) {
			args := v.(LookupFolderArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:organizations/getFolder:getFolder", args, LookupFolderResultOutput{}, options).(LookupFolderResultOutput), nil
		}).(LookupFolderResultOutput)
}

// A collection of arguments for invoking getFolder.
type LookupFolderOutputArgs struct {
	// The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
	Folder pulumi.StringInput `pulumi:"folder"`
	// `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
	LookupOrganization pulumi.BoolPtrInput `pulumi:"lookupOrganization"`
}

func (LookupFolderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFolderArgs)(nil)).Elem()
}

// A collection of values returned by getFolder.
type LookupFolderResultOutput struct{ *pulumi.OutputState }

func (LookupFolderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFolderResult)(nil)).Elem()
}

func (o LookupFolderResultOutput) ToLookupFolderResultOutput() LookupFolderResultOutput {
	return o
}

func (o LookupFolderResultOutput) ToLookupFolderResultOutputWithContext(ctx context.Context) LookupFolderResultOutput {
	return o
}

// Timestamp when the Organization was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
func (o LookupFolderResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o LookupFolderResultOutput) DeletionProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFolderResult) bool { return v.DeletionProtection }).(pulumi.BoolOutput)
}

// The folder's display name.
func (o LookupFolderResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupFolderResultOutput) Folder() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.Folder }).(pulumi.StringOutput)
}

func (o LookupFolderResultOutput) FolderId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.FolderId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFolderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Folder's current lifecycle state.
func (o LookupFolderResultOutput) LifecycleState() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.LifecycleState }).(pulumi.StringOutput)
}

func (o LookupFolderResultOutput) LookupOrganization() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFolderResult) *bool { return v.LookupOrganization }).(pulumi.BoolPtrOutput)
}

// The resource name of the Folder in the form `folders/{folder_id}`.
func (o LookupFolderResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.Name }).(pulumi.StringOutput)
}

// If `lookupOrganization` is enable, the resource name of the Organization that the folder belongs.
func (o LookupFolderResultOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.Organization }).(pulumi.StringOutput)
}

// The resource name of the parent Folder or Organization.
func (o LookupFolderResultOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFolderResult) string { return v.Parent }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFolderResultOutput{})
}
