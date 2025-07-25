// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis
{
    public static class GetInstance
    {
        /// <summary>
        /// Get info about a Google Cloud Redis instance.
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
        ///     var myInstance = Gcp.Redis.GetInstance.Invoke(new()
        ///     {
        ///         Name = "my-redis-instance",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["instanceMemorySizeGb"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.MemorySizeGb),
        ///         ["instanceConnectMode"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.ConnectMode),
        ///         ["instanceAuthorizedNetwork"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.AuthorizedNetwork),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstanceResult> InvokeAsync(GetInstanceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceResult>("gcp:redis/getInstance:getInstance", args ?? new GetInstanceArgs(), options.WithDefaults());

        /// <summary>
        /// Get info about a Google Cloud Redis instance.
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
        ///     var myInstance = Gcp.Redis.GetInstance.Invoke(new()
        ///     {
        ///         Name = "my-redis-instance",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["instanceMemorySizeGb"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.MemorySizeGb),
        ///         ["instanceConnectMode"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.ConnectMode),
        ///         ["instanceAuthorizedNetwork"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.AuthorizedNetwork),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceResult> Invoke(GetInstanceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceResult>("gcp:redis/getInstance:getInstance", args ?? new GetInstanceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get info about a Google Cloud Redis instance.
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
        ///     var myInstance = Gcp.Redis.GetInstance.Invoke(new()
        ///     {
        ///         Name = "my-redis-instance",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["instanceMemorySizeGb"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.MemorySizeGb),
        ///         ["instanceConnectMode"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.ConnectMode),
        ///         ["instanceAuthorizedNetwork"] = myInstance.Apply(getInstanceResult =&gt; getInstanceResult.AuthorizedNetwork),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceResult> Invoke(GetInstanceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceResult>("gcp:redis/getInstance:getInstance", args ?? new GetInstanceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of a Redis instance.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The region in which the resource belongs. If it
        /// is not provided, the provider region is used.
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
        /// The name of a Redis instance.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region in which the resource belongs. If it
        /// is not provided, the provider region is used.
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
        public readonly string AlternativeLocationId;
        public readonly bool AuthEnabled;
        public readonly string AuthString;
        public readonly string AuthorizedNetwork;
        public readonly string ConnectMode;
        public readonly string CreateTime;
        public readonly string CurrentLocationId;
        public readonly string CustomerManagedKey;
        public readonly string DisplayName;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        public readonly string EffectiveReservedIpRange;
        public readonly string Host;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string LocationId;
        public readonly ImmutableArray<Outputs.GetInstanceMaintenancePolicyResult> MaintenancePolicies;
        public readonly ImmutableArray<Outputs.GetInstanceMaintenanceScheduleResult> MaintenanceSchedules;
        public readonly string MaintenanceVersion;
        public readonly int MemorySizeGb;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetInstanceNodeResult> Nodes;
        public readonly ImmutableArray<Outputs.GetInstancePersistenceConfigResult> PersistenceConfigs;
        public readonly string PersistenceIamIdentity;
        public readonly int Port;
        public readonly string? Project;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        public readonly string ReadEndpoint;
        public readonly int ReadEndpointPort;
        public readonly string ReadReplicasMode;
        public readonly ImmutableDictionary<string, string> RedisConfigs;
        public readonly string RedisVersion;
        public readonly string? Region;
        public readonly int ReplicaCount;
        public readonly string ReservedIpRange;
        public readonly string SecondaryIpRange;
        public readonly ImmutableArray<Outputs.GetInstanceServerCaCertResult> ServerCaCerts;
        public readonly string Tier;
        public readonly string TransitEncryptionMode;

        [OutputConstructor]
        private GetInstanceResult(
            string alternativeLocationId,

            bool authEnabled,

            string authString,

            string authorizedNetwork,

            string connectMode,

            string createTime,

            string currentLocationId,

            string customerManagedKey,

            string displayName,

            ImmutableDictionary<string, string> effectiveLabels,

            string effectiveReservedIpRange,

            string host,

            string id,

            ImmutableDictionary<string, string> labels,

            string locationId,

            ImmutableArray<Outputs.GetInstanceMaintenancePolicyResult> maintenancePolicies,

            ImmutableArray<Outputs.GetInstanceMaintenanceScheduleResult> maintenanceSchedules,

            string maintenanceVersion,

            int memorySizeGb,

            string name,

            ImmutableArray<Outputs.GetInstanceNodeResult> nodes,

            ImmutableArray<Outputs.GetInstancePersistenceConfigResult> persistenceConfigs,

            string persistenceIamIdentity,

            int port,

            string? project,

            ImmutableDictionary<string, string> pulumiLabels,

            string readEndpoint,

            int readEndpointPort,

            string readReplicasMode,

            ImmutableDictionary<string, string> redisConfigs,

            string redisVersion,

            string? region,

            int replicaCount,

            string reservedIpRange,

            string secondaryIpRange,

            ImmutableArray<Outputs.GetInstanceServerCaCertResult> serverCaCerts,

            string tier,

            string transitEncryptionMode)
        {
            AlternativeLocationId = alternativeLocationId;
            AuthEnabled = authEnabled;
            AuthString = authString;
            AuthorizedNetwork = authorizedNetwork;
            ConnectMode = connectMode;
            CreateTime = createTime;
            CurrentLocationId = currentLocationId;
            CustomerManagedKey = customerManagedKey;
            DisplayName = displayName;
            EffectiveLabels = effectiveLabels;
            EffectiveReservedIpRange = effectiveReservedIpRange;
            Host = host;
            Id = id;
            Labels = labels;
            LocationId = locationId;
            MaintenancePolicies = maintenancePolicies;
            MaintenanceSchedules = maintenanceSchedules;
            MaintenanceVersion = maintenanceVersion;
            MemorySizeGb = memorySizeGb;
            Name = name;
            Nodes = nodes;
            PersistenceConfigs = persistenceConfigs;
            PersistenceIamIdentity = persistenceIamIdentity;
            Port = port;
            Project = project;
            PulumiLabels = pulumiLabels;
            ReadEndpoint = readEndpoint;
            ReadEndpointPort = readEndpointPort;
            ReadReplicasMode = readReplicasMode;
            RedisConfigs = redisConfigs;
            RedisVersion = redisVersion;
            Region = region;
            ReplicaCount = replicaCount;
            ReservedIpRange = reservedIpRange;
            SecondaryIpRange = secondaryIpRange;
            ServerCaCerts = serverCaCerts;
            Tier = tier;
            TransitEncryptionMode = transitEncryptionMode;
        }
    }
}
