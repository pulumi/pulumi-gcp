// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudasset

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Searches all Google Cloud resources within the specified scope, such as a project, folder, or organization. See the
// [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources)
// for more details.
//
// ## Example Usage
//
// ### Searching For All Projects In An Org
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudasset"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudasset.LookupSearchAllResources(ctx, &cloudasset.LookupSearchAllResourcesArgs{
//				Scope: "organizations/0123456789",
//				AssetTypes: []string{
//					"cloudresourcemanager.googleapis.com/Project",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Searching For All Projects With CloudBuild API Enabled
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudasset"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudasset.LookupSearchAllResources(ctx, &cloudasset.LookupSearchAllResourcesArgs{
//				Scope: "organizations/0123456789",
//				AssetTypes: []string{
//					"serviceusage.googleapis.com/Service",
//				},
//				Query: pulumi.StringRef("displayName:cloudbuild.googleapis.com AND state:ENABLED"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Searching For All Service Accounts In A Project
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudasset"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudasset.LookupSearchAllResources(ctx, &cloudasset.LookupSearchAllResourcesArgs{
//				Scope: "projects/my-project-id",
//				AssetTypes: []string{
//					"iam.googleapis.com/ServiceAccount",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSearchAllResources(ctx *pulumi.Context, args *LookupSearchAllResourcesArgs, opts ...pulumi.InvokeOption) (*LookupSearchAllResourcesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSearchAllResourcesResult
	err := ctx.Invoke("gcp:cloudasset/getSearchAllResources:getSearchAllResources", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSearchAllResources.
type LookupSearchAllResourcesArgs struct {
	// A list of asset types that this request searches for. If empty, it will search all the [supported asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
	AssetTypes []string `pulumi:"assetTypes"`
	// The query statement. See [how to construct a query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query) for more information. If not specified or empty, it will search all the resources within the specified `scope` and `assetTypes`.
	Query *string `pulumi:"query"`
	// A scope can be a project, a folder, or an organization. The search is limited to the resources within the scope. The allowed value must be: organization number (such as "organizations/123"), folder number (such as "folders/1234"), project number (such as "projects/12345") or project id (such as "projects/abc")
	Scope string `pulumi:"scope"`
}

// A collection of values returned by getSearchAllResources.
type LookupSearchAllResourcesResult struct {
	AssetTypes []string `pulumi:"assetTypes"`
	// The provider-assigned unique ID for this managed resource.
	Id    string  `pulumi:"id"`
	Query *string `pulumi:"query"`
	// A list of search results based on provided inputs. Structure is defined below.
	Results []GetSearchAllResourcesResult `pulumi:"results"`
	Scope   string                        `pulumi:"scope"`
}

func LookupSearchAllResourcesOutput(ctx *pulumi.Context, args LookupSearchAllResourcesOutputArgs, opts ...pulumi.InvokeOption) LookupSearchAllResourcesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSearchAllResourcesResultOutput, error) {
			args := v.(LookupSearchAllResourcesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:cloudasset/getSearchAllResources:getSearchAllResources", args, LookupSearchAllResourcesResultOutput{}, options).(LookupSearchAllResourcesResultOutput), nil
		}).(LookupSearchAllResourcesResultOutput)
}

// A collection of arguments for invoking getSearchAllResources.
type LookupSearchAllResourcesOutputArgs struct {
	// A list of asset types that this request searches for. If empty, it will search all the [supported asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
	AssetTypes pulumi.StringArrayInput `pulumi:"assetTypes"`
	// The query statement. See [how to construct a query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query) for more information. If not specified or empty, it will search all the resources within the specified `scope` and `assetTypes`.
	Query pulumi.StringPtrInput `pulumi:"query"`
	// A scope can be a project, a folder, or an organization. The search is limited to the resources within the scope. The allowed value must be: organization number (such as "organizations/123"), folder number (such as "folders/1234"), project number (such as "projects/12345") or project id (such as "projects/abc")
	Scope pulumi.StringInput `pulumi:"scope"`
}

func (LookupSearchAllResourcesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSearchAllResourcesArgs)(nil)).Elem()
}

// A collection of values returned by getSearchAllResources.
type LookupSearchAllResourcesResultOutput struct{ *pulumi.OutputState }

func (LookupSearchAllResourcesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSearchAllResourcesResult)(nil)).Elem()
}

func (o LookupSearchAllResourcesResultOutput) ToLookupSearchAllResourcesResultOutput() LookupSearchAllResourcesResultOutput {
	return o
}

func (o LookupSearchAllResourcesResultOutput) ToLookupSearchAllResourcesResultOutputWithContext(ctx context.Context) LookupSearchAllResourcesResultOutput {
	return o
}

func (o LookupSearchAllResourcesResultOutput) AssetTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSearchAllResourcesResult) []string { return v.AssetTypes }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSearchAllResourcesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchAllResourcesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSearchAllResourcesResultOutput) Query() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchAllResourcesResult) *string { return v.Query }).(pulumi.StringPtrOutput)
}

// A list of search results based on provided inputs. Structure is defined below.
func (o LookupSearchAllResourcesResultOutput) Results() GetSearchAllResourcesResultArrayOutput {
	return o.ApplyT(func(v LookupSearchAllResourcesResult) []GetSearchAllResourcesResult { return v.Results }).(GetSearchAllResourcesResultArrayOutput)
}

func (o LookupSearchAllResourcesResultOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchAllResourcesResult) string { return v.Scope }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSearchAllResourcesResultOutput{})
}
