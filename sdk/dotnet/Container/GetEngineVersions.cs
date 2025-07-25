// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container
{
    public static class GetEngineVersions
    {
        /// <summary>
        /// Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
        /// 
        /// To get more information about GKE versions, see:
        ///   * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
        /// 
        /// &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
        /// regional cluster, ensure that you have provided a region as the `location` to
        /// the datasource. A region can have a different set of supported versions than
        /// its component zones, and not all zones in a region are guaranteed to
        /// support the same version.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var central1b = Gcp.Container.GetEngineVersions.Invoke(new()
        ///     {
        ///         Location = "us-central1-b",
        ///         VersionPrefix = "1.12.",
        ///     });
        /// 
        ///     var foo = new Gcp.Container.Cluster("foo", new()
        ///     {
        ///         Name = "test-cluster",
        ///         Location = "us-central1-b",
        ///         NodeVersion = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.LatestNodeVersion),
        ///         InitialNodeCount = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["stableChannelDefaultVersion"] = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.ReleaseChannelDefaultVersion?.STABLE),
        ///         ["stableChannelLatestVersion"] = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.ReleaseChannelLatestVersion?.STABLE),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEngineVersionsResult> InvokeAsync(GetEngineVersionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEngineVersionsResult>("gcp:container/getEngineVersions:getEngineVersions", args ?? new GetEngineVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
        /// 
        /// To get more information about GKE versions, see:
        ///   * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
        /// 
        /// &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
        /// regional cluster, ensure that you have provided a region as the `location` to
        /// the datasource. A region can have a different set of supported versions than
        /// its component zones, and not all zones in a region are guaranteed to
        /// support the same version.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var central1b = Gcp.Container.GetEngineVersions.Invoke(new()
        ///     {
        ///         Location = "us-central1-b",
        ///         VersionPrefix = "1.12.",
        ///     });
        /// 
        ///     var foo = new Gcp.Container.Cluster("foo", new()
        ///     {
        ///         Name = "test-cluster",
        ///         Location = "us-central1-b",
        ///         NodeVersion = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.LatestNodeVersion),
        ///         InitialNodeCount = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["stableChannelDefaultVersion"] = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.ReleaseChannelDefaultVersion?.STABLE),
        ///         ["stableChannelLatestVersion"] = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.ReleaseChannelLatestVersion?.STABLE),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEngineVersionsResult> Invoke(GetEngineVersionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEngineVersionsResult>("gcp:container/getEngineVersions:getEngineVersions", args ?? new GetEngineVersionsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
        /// 
        /// To get more information about GKE versions, see:
        ///   * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
        /// 
        /// &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
        /// regional cluster, ensure that you have provided a region as the `location` to
        /// the datasource. A region can have a different set of supported versions than
        /// its component zones, and not all zones in a region are guaranteed to
        /// support the same version.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var central1b = Gcp.Container.GetEngineVersions.Invoke(new()
        ///     {
        ///         Location = "us-central1-b",
        ///         VersionPrefix = "1.12.",
        ///     });
        /// 
        ///     var foo = new Gcp.Container.Cluster("foo", new()
        ///     {
        ///         Name = "test-cluster",
        ///         Location = "us-central1-b",
        ///         NodeVersion = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.LatestNodeVersion),
        ///         InitialNodeCount = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["stableChannelDefaultVersion"] = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.ReleaseChannelDefaultVersion?.STABLE),
        ///         ["stableChannelLatestVersion"] = central1b.Apply(getEngineVersionsResult =&gt; getEngineVersionsResult.ReleaseChannelLatestVersion?.STABLE),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEngineVersionsResult> Invoke(GetEngineVersionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEngineVersionsResult>("gcp:container/getEngineVersions:getEngineVersions", args ?? new GetEngineVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEngineVersionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location (region or zone) to list versions for.
        /// Must exactly match the location the cluster will be deployed in, or listed
        /// versions may not be available. If `location`, `region`, and `zone` are not
        /// specified, the provider-level zone must be set and is used instead.
        /// </summary>
        [Input("location")]
        public string? Location { get; set; }

        /// <summary>
        /// ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
        /// Defaults to the project that the provider is authenticated with.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// If provided, the provider will only return versions
        /// that match the string prefix. For example, `1.11.` will match all `1.11` series
        /// releases. Since this is just a string match, it's recommended that you append a
        /// `.` after minor versions to ensure that prefixes such as `1.1` don't match
        /// versions like `1.12.5-gke.10` accidentally. See [the docs on versioning schema](https://cloud.google.com/kubernetes-engine/versioning-and-upgrades#versioning_scheme)
        /// for full details on how version strings are formatted.
        /// </summary>
        [Input("versionPrefix")]
        public string? VersionPrefix { get; set; }

        public GetEngineVersionsArgs()
        {
        }
        public static new GetEngineVersionsArgs Empty => new GetEngineVersionsArgs();
    }

    public sealed class GetEngineVersionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location (region or zone) to list versions for.
        /// Must exactly match the location the cluster will be deployed in, or listed
        /// versions may not be available. If `location`, `region`, and `zone` are not
        /// specified, the provider-level zone must be set and is used instead.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
        /// Defaults to the project that the provider is authenticated with.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// If provided, the provider will only return versions
        /// that match the string prefix. For example, `1.11.` will match all `1.11` series
        /// releases. Since this is just a string match, it's recommended that you append a
        /// `.` after minor versions to ensure that prefixes such as `1.1` don't match
        /// versions like `1.12.5-gke.10` accidentally. See [the docs on versioning schema](https://cloud.google.com/kubernetes-engine/versioning-and-upgrades#versioning_scheme)
        /// for full details on how version strings are formatted.
        /// </summary>
        [Input("versionPrefix")]
        public Input<string>? VersionPrefix { get; set; }

        public GetEngineVersionsInvokeArgs()
        {
        }
        public static new GetEngineVersionsInvokeArgs Empty => new GetEngineVersionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEngineVersionsResult
    {
        /// <summary>
        /// Version of Kubernetes the service deploys by default.
        /// </summary>
        public readonly string DefaultClusterVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The latest version available in the given zone for use with master instances.
        /// </summary>
        public readonly string LatestMasterVersion;
        /// <summary>
        /// The latest version available in the given zone for use with node instances.
        /// </summary>
        public readonly string LatestNodeVersion;
        public readonly string? Location;
        public readonly string? Project;
        /// <summary>
        /// A map from a release channel name to the channel's default version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
        /// </summary>
        public readonly ImmutableDictionary<string, string> ReleaseChannelDefaultVersion;
        /// <summary>
        /// A map from a release channel name to the channel's latest version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
        /// </summary>
        public readonly ImmutableDictionary<string, string> ReleaseChannelLatestVersion;
        /// <summary>
        /// A map from a release channel name to the channel's auto upgrade target version. See the docs on [available release channel names](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.Channel_1) for more details.
        /// </summary>
        public readonly ImmutableDictionary<string, string> ReleaseChannelUpgradeTargetVersion;
        /// <summary>
        /// A list of versions available in the given zone for use with master instances.
        /// </summary>
        public readonly ImmutableArray<string> ValidMasterVersions;
        /// <summary>
        /// A list of versions available in the given zone for use with node instances.
        /// </summary>
        public readonly ImmutableArray<string> ValidNodeVersions;
        public readonly string? VersionPrefix;

        [OutputConstructor]
        private GetEngineVersionsResult(
            string defaultClusterVersion,

            string id,

            string latestMasterVersion,

            string latestNodeVersion,

            string? location,

            string? project,

            ImmutableDictionary<string, string> releaseChannelDefaultVersion,

            ImmutableDictionary<string, string> releaseChannelLatestVersion,

            ImmutableDictionary<string, string> releaseChannelUpgradeTargetVersion,

            ImmutableArray<string> validMasterVersions,

            ImmutableArray<string> validNodeVersions,

            string? versionPrefix)
        {
            DefaultClusterVersion = defaultClusterVersion;
            Id = id;
            LatestMasterVersion = latestMasterVersion;
            LatestNodeVersion = latestNodeVersion;
            Location = location;
            Project = project;
            ReleaseChannelDefaultVersion = releaseChannelDefaultVersion;
            ReleaseChannelLatestVersion = releaseChannelLatestVersion;
            ReleaseChannelUpgradeTargetVersion = releaseChannelUpgradeTargetVersion;
            ValidMasterVersions = validMasterVersions;
            ValidNodeVersions = validNodeVersions;
            VersionPrefix = versionPrefix;
        }
    }
}
