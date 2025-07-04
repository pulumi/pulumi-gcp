// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package container

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
//
// To get more information about GKE versions, see:
//   - [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
//
// > If you are using the `container.getEngineVersions` datasource with a
// regional cluster, ensure that you have provided a region as the `location` to
// the datasource. A region can have a different set of supported versions than
// its component zones, and not all zones in a region are guaranteed to
// support the same version.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/container"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			central1b, err := container.GetEngineVersions(ctx, &container.GetEngineVersionsArgs{
//				Location:      pulumi.StringRef("us-central1-b"),
//				VersionPrefix: pulumi.StringRef("1.12."),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = container.NewCluster(ctx, "foo", &container.ClusterArgs{
//				Name:             pulumi.String("test-cluster"),
//				Location:         pulumi.String("us-central1-b"),
//				NodeVersion:      pulumi.String(central1b.LatestNodeVersion),
//				InitialNodeCount: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("stableChannelDefaultVersion", central1b.ReleaseChannelDefaultVersion.STABLE)
//			ctx.Export("stableChannelLatestVersion", central1b.ReleaseChannelLatestVersion.STABLE)
//			return nil
//		})
//	}
//
// ```
func GetEngineVersions(ctx *pulumi.Context, args *GetEngineVersionsArgs, opts ...pulumi.InvokeOption) (*GetEngineVersionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEngineVersionsResult
	err := ctx.Invoke("gcp:container/getEngineVersions:getEngineVersions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEngineVersions.
type GetEngineVersionsArgs struct {
	// The location (region or zone) to list versions for.
	// Must exactly match the location the cluster will be deployed in, or listed
	// versions may not be available. If `location`, `region`, and `zone` are not
	// specified, the provider-level zone must be set and is used instead.
	Location *string `pulumi:"location"`
	// ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
	// Defaults to the project that the provider is authenticated with.
	Project *string `pulumi:"project"`
	// If provided, the provider will only return versions
	// that match the string prefix. For example, `1.11.` will match all `1.11` series
	// releases. Since this is just a string match, it's recommended that you append a
	// `.` after minor versions to ensure that prefixes such as `1.1` don't match
	// versions like `1.12.5-gke.10` accidentally. See [the docs on versioning schema](https://cloud.google.com/kubernetes-engine/versioning-and-upgrades#versioning_scheme)
	// for full details on how version strings are formatted.
	VersionPrefix *string `pulumi:"versionPrefix"`
}

// A collection of values returned by getEngineVersions.
type GetEngineVersionsResult struct {
	// Version of Kubernetes the service deploys by default.
	DefaultClusterVersion string `pulumi:"defaultClusterVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The latest version available in the given zone for use with master instances.
	LatestMasterVersion string `pulumi:"latestMasterVersion"`
	// The latest version available in the given zone for use with node instances.
	LatestNodeVersion string  `pulumi:"latestNodeVersion"`
	Location          *string `pulumi:"location"`
	Project           *string `pulumi:"project"`
	// A map from a release channel name to the channel's default version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
	ReleaseChannelDefaultVersion map[string]string `pulumi:"releaseChannelDefaultVersion"`
	// A map from a release channel name to the channel's latest version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
	ReleaseChannelLatestVersion map[string]string `pulumi:"releaseChannelLatestVersion"`
	// A map from a release channel name to the channel's auto upgrade target version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
	ReleaseChannelUpgradeTargetVersion map[string]string `pulumi:"releaseChannelUpgradeTargetVersion"`
	// A list of versions available in the given zone for use with master instances.
	ValidMasterVersions []string `pulumi:"validMasterVersions"`
	// A list of versions available in the given zone for use with node instances.
	ValidNodeVersions []string `pulumi:"validNodeVersions"`
	VersionPrefix     *string  `pulumi:"versionPrefix"`
}

func GetEngineVersionsOutput(ctx *pulumi.Context, args GetEngineVersionsOutputArgs, opts ...pulumi.InvokeOption) GetEngineVersionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEngineVersionsResultOutput, error) {
			args := v.(GetEngineVersionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("gcp:container/getEngineVersions:getEngineVersions", args, GetEngineVersionsResultOutput{}, options).(GetEngineVersionsResultOutput), nil
		}).(GetEngineVersionsResultOutput)
}

// A collection of arguments for invoking getEngineVersions.
type GetEngineVersionsOutputArgs struct {
	// The location (region or zone) to list versions for.
	// Must exactly match the location the cluster will be deployed in, or listed
	// versions may not be available. If `location`, `region`, and `zone` are not
	// specified, the provider-level zone must be set and is used instead.
	Location pulumi.StringPtrInput `pulumi:"location"`
	// ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
	// Defaults to the project that the provider is authenticated with.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// If provided, the provider will only return versions
	// that match the string prefix. For example, `1.11.` will match all `1.11` series
	// releases. Since this is just a string match, it's recommended that you append a
	// `.` after minor versions to ensure that prefixes such as `1.1` don't match
	// versions like `1.12.5-gke.10` accidentally. See [the docs on versioning schema](https://cloud.google.com/kubernetes-engine/versioning-and-upgrades#versioning_scheme)
	// for full details on how version strings are formatted.
	VersionPrefix pulumi.StringPtrInput `pulumi:"versionPrefix"`
}

func (GetEngineVersionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEngineVersionsArgs)(nil)).Elem()
}

// A collection of values returned by getEngineVersions.
type GetEngineVersionsResultOutput struct{ *pulumi.OutputState }

func (GetEngineVersionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEngineVersionsResult)(nil)).Elem()
}

func (o GetEngineVersionsResultOutput) ToGetEngineVersionsResultOutput() GetEngineVersionsResultOutput {
	return o
}

func (o GetEngineVersionsResultOutput) ToGetEngineVersionsResultOutputWithContext(ctx context.Context) GetEngineVersionsResultOutput {
	return o
}

// Version of Kubernetes the service deploys by default.
func (o GetEngineVersionsResultOutput) DefaultClusterVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) string { return v.DefaultClusterVersion }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEngineVersionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The latest version available in the given zone for use with master instances.
func (o GetEngineVersionsResultOutput) LatestMasterVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) string { return v.LatestMasterVersion }).(pulumi.StringOutput)
}

// The latest version available in the given zone for use with node instances.
func (o GetEngineVersionsResultOutput) LatestNodeVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) string { return v.LatestNodeVersion }).(pulumi.StringOutput)
}

func (o GetEngineVersionsResultOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) *string { return v.Location }).(pulumi.StringPtrOutput)
}

func (o GetEngineVersionsResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

// A map from a release channel name to the channel's default version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
func (o GetEngineVersionsResultOutput) ReleaseChannelDefaultVersion() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) map[string]string { return v.ReleaseChannelDefaultVersion }).(pulumi.StringMapOutput)
}

// A map from a release channel name to the channel's latest version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
func (o GetEngineVersionsResultOutput) ReleaseChannelLatestVersion() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) map[string]string { return v.ReleaseChannelLatestVersion }).(pulumi.StringMapOutput)
}

// A map from a release channel name to the channel's auto upgrade target version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
func (o GetEngineVersionsResultOutput) ReleaseChannelUpgradeTargetVersion() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) map[string]string { return v.ReleaseChannelUpgradeTargetVersion }).(pulumi.StringMapOutput)
}

// A list of versions available in the given zone for use with master instances.
func (o GetEngineVersionsResultOutput) ValidMasterVersions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) []string { return v.ValidMasterVersions }).(pulumi.StringArrayOutput)
}

// A list of versions available in the given zone for use with node instances.
func (o GetEngineVersionsResultOutput) ValidNodeVersions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) []string { return v.ValidNodeVersions }).(pulumi.StringArrayOutput)
}

func (o GetEngineVersionsResultOutput) VersionPrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEngineVersionsResult) *string { return v.VersionPrefix }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEngineVersionsResultOutput{})
}
