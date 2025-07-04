// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Memcache
{
    public static class GetInstance
    {
        /// <summary>
        /// Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances).
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
        ///     var qa = Gcp.Memcache.GetInstance.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstanceResult> InvokeAsync(GetInstanceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceResult>("gcp:memcache/getInstance:getInstance", args ?? new GetInstanceArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances).
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
        ///     var qa = Gcp.Memcache.GetInstance.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceResult> Invoke(GetInstanceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceResult>("gcp:memcache/getInstance:getInstance", args ?? new GetInstanceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about the available instance. For more details refer the [API docs](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances).
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
        ///     var qa = Gcp.Memcache.GetInstance.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceResult> Invoke(GetInstanceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceResult>("gcp:memcache/getInstance:getInstance", args ?? new GetInstanceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the memcache instance.
        /// 'memcache_instance_id'
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// (optional)
        /// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// (optional)
        /// The canonical id of the region. If it is not provided, the provider project is used. For example: us-east1.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetInstanceArgs()
        {
        }
        public static new GetInstanceArgs Empty => new GetInstanceArgs();
    }

    public sealed class GetInstanceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the memcache instance.
        /// 'memcache_instance_id'
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (optional)
        /// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// (optional)
        /// The canonical id of the region. If it is not provided, the provider project is used. For example: us-east1.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetInstanceInvokeArgs()
        {
        }
        public static new GetInstanceInvokeArgs Empty => new GetInstanceInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceResult
    {
        public readonly string AuthorizedNetwork;
        public readonly string CreateTime;
        public readonly string DiscoveryEndpoint;
        public readonly string DisplayName;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly ImmutableArray<Outputs.GetInstanceMaintenancePolicyResult> MaintenancePolicies;
        public readonly ImmutableArray<Outputs.GetInstanceMaintenanceScheduleResult> MaintenanceSchedules;
        public readonly string MemcacheFullVersion;
        public readonly ImmutableArray<Outputs.GetInstanceMemcacheNodeResult> MemcacheNodes;
        public readonly ImmutableArray<Outputs.GetInstanceMemcacheParameterResult> MemcacheParameters;
        public readonly string MemcacheVersion;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetInstanceNodeConfigResult> NodeConfigs;
        public readonly int NodeCount;
        public readonly string? Project;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        public readonly string? Region;
        public readonly ImmutableArray<string> ReservedIpRangeIds;
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetInstanceResult(
            string authorizedNetwork,

            string createTime,

            string discoveryEndpoint,

            string displayName,

            ImmutableDictionary<string, string> effectiveLabels,

            string id,

            ImmutableDictionary<string, string> labels,

            ImmutableArray<Outputs.GetInstanceMaintenancePolicyResult> maintenancePolicies,

            ImmutableArray<Outputs.GetInstanceMaintenanceScheduleResult> maintenanceSchedules,

            string memcacheFullVersion,

            ImmutableArray<Outputs.GetInstanceMemcacheNodeResult> memcacheNodes,

            ImmutableArray<Outputs.GetInstanceMemcacheParameterResult> memcacheParameters,

            string memcacheVersion,

            string name,

            ImmutableArray<Outputs.GetInstanceNodeConfigResult> nodeConfigs,

            int nodeCount,

            string? project,

            ImmutableDictionary<string, string> pulumiLabels,

            string? region,

            ImmutableArray<string> reservedIpRangeIds,

            ImmutableArray<string> zones)
        {
            AuthorizedNetwork = authorizedNetwork;
            CreateTime = createTime;
            DiscoveryEndpoint = discoveryEndpoint;
            DisplayName = displayName;
            EffectiveLabels = effectiveLabels;
            Id = id;
            Labels = labels;
            MaintenancePolicies = maintenancePolicies;
            MaintenanceSchedules = maintenanceSchedules;
            MemcacheFullVersion = memcacheFullVersion;
            MemcacheNodes = memcacheNodes;
            MemcacheParameters = memcacheParameters;
            MemcacheVersion = memcacheVersion;
            Name = name;
            NodeConfigs = nodeConfigs;
            NodeCount = nodeCount;
            Project = project;
            PulumiLabels = pulumiLabels;
            Region = region;
            ReservedIpRangeIds = reservedIpRangeIds;
            Zones = zones;
        }
    }
}
