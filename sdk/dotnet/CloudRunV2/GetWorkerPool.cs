// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2
{
    public static class GetWorkerPool
    {
        /// <summary>
        /// Get information about a Google Cloud Run v2 Worker Pool. For more information see
        /// the [official documentation](https://cloud.google.com/run/docs/)
        /// and [API](https://cloud.google.com/run/docs/apis).
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
        ///     var myWorkerPool = Gcp.CloudRunV2.GetWorkerPool.Invoke(new()
        ///     {
        ///         Name = "my-worker-pool",
        ///         Location = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWorkerPoolResult> InvokeAsync(GetWorkerPoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWorkerPoolResult>("gcp:cloudrunv2/getWorkerPool:getWorkerPool", args ?? new GetWorkerPoolArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Google Cloud Run v2 Worker Pool. For more information see
        /// the [official documentation](https://cloud.google.com/run/docs/)
        /// and [API](https://cloud.google.com/run/docs/apis).
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
        ///     var myWorkerPool = Gcp.CloudRunV2.GetWorkerPool.Invoke(new()
        ///     {
        ///         Name = "my-worker-pool",
        ///         Location = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWorkerPoolResult> Invoke(GetWorkerPoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWorkerPoolResult>("gcp:cloudrunv2/getWorkerPool:getWorkerPool", args ?? new GetWorkerPoolInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Google Cloud Run v2 Worker Pool. For more information see
        /// the [official documentation](https://cloud.google.com/run/docs/)
        /// and [API](https://cloud.google.com/run/docs/apis).
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
        ///     var myWorkerPool = Gcp.CloudRunV2.GetWorkerPool.Invoke(new()
        ///     {
        ///         Name = "my-worker-pool",
        ///         Location = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWorkerPoolResult> Invoke(GetWorkerPoolInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWorkerPoolResult>("gcp:cloudrunv2/getWorkerPool:getWorkerPool", args ?? new GetWorkerPoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWorkerPoolArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location of the instance. eg us-central1
        /// 
        /// - - -
        /// </summary>
        [Input("location")]
        public string? Location { get; set; }

        /// <summary>
        /// The name of the Cloud Run v2 Worker Pool.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetWorkerPoolArgs()
        {
        }
        public static new GetWorkerPoolArgs Empty => new GetWorkerPoolArgs();
    }

    public sealed class GetWorkerPoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location of the instance. eg us-central1
        /// 
        /// - - -
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the Cloud Run v2 Worker Pool.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetWorkerPoolInvokeArgs()
        {
        }
        public static new GetWorkerPoolInvokeArgs Empty => new GetWorkerPoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetWorkerPoolResult
    {
        public readonly ImmutableDictionary<string, string> Annotations;
        public readonly ImmutableArray<Outputs.GetWorkerPoolBinaryAuthorizationResult> BinaryAuthorizations;
        public readonly string Client;
        public readonly string ClientVersion;
        public readonly ImmutableArray<Outputs.GetWorkerPoolConditionResult> Conditions;
        public readonly string CreateTime;
        public readonly string Creator;
        public readonly ImmutableArray<string> CustomAudiences;
        public readonly string DeleteTime;
        public readonly bool DeletionProtection;
        public readonly string Description;
        public readonly ImmutableDictionary<string, string> EffectiveAnnotations;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        public readonly string Etag;
        public readonly string ExpireTime;
        public readonly string Generation;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetWorkerPoolInstanceSplitStatusResult> InstanceSplitStatuses;
        public readonly ImmutableArray<Outputs.GetWorkerPoolInstanceSplitResult> InstanceSplits;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string LastModifier;
        public readonly string LatestCreatedRevision;
        public readonly string LatestReadyRevision;
        public readonly string LaunchStage;
        public readonly string? Location;
        public readonly string Name;
        public readonly string ObservedGeneration;
        public readonly string? Project;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        public readonly bool Reconciling;
        public readonly ImmutableArray<Outputs.GetWorkerPoolScalingResult> Scalings;
        public readonly ImmutableArray<Outputs.GetWorkerPoolTemplateResult> Templates;
        public readonly ImmutableArray<Outputs.GetWorkerPoolTerminalConditionResult> TerminalConditions;
        public readonly string Uid;
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetWorkerPoolResult(
            ImmutableDictionary<string, string> annotations,

            ImmutableArray<Outputs.GetWorkerPoolBinaryAuthorizationResult> binaryAuthorizations,

            string client,

            string clientVersion,

            ImmutableArray<Outputs.GetWorkerPoolConditionResult> conditions,

            string createTime,

            string creator,

            ImmutableArray<string> customAudiences,

            string deleteTime,

            bool deletionProtection,

            string description,

            ImmutableDictionary<string, string> effectiveAnnotations,

            ImmutableDictionary<string, string> effectiveLabels,

            string etag,

            string expireTime,

            string generation,

            string id,

            ImmutableArray<Outputs.GetWorkerPoolInstanceSplitStatusResult> instanceSplitStatuses,

            ImmutableArray<Outputs.GetWorkerPoolInstanceSplitResult> instanceSplits,

            ImmutableDictionary<string, string> labels,

            string lastModifier,

            string latestCreatedRevision,

            string latestReadyRevision,

            string launchStage,

            string? location,

            string name,

            string observedGeneration,

            string? project,

            ImmutableDictionary<string, string> pulumiLabels,

            bool reconciling,

            ImmutableArray<Outputs.GetWorkerPoolScalingResult> scalings,

            ImmutableArray<Outputs.GetWorkerPoolTemplateResult> templates,

            ImmutableArray<Outputs.GetWorkerPoolTerminalConditionResult> terminalConditions,

            string uid,

            string updateTime)
        {
            Annotations = annotations;
            BinaryAuthorizations = binaryAuthorizations;
            Client = client;
            ClientVersion = clientVersion;
            Conditions = conditions;
            CreateTime = createTime;
            Creator = creator;
            CustomAudiences = customAudiences;
            DeleteTime = deleteTime;
            DeletionProtection = deletionProtection;
            Description = description;
            EffectiveAnnotations = effectiveAnnotations;
            EffectiveLabels = effectiveLabels;
            Etag = etag;
            ExpireTime = expireTime;
            Generation = generation;
            Id = id;
            InstanceSplitStatuses = instanceSplitStatuses;
            InstanceSplits = instanceSplits;
            Labels = labels;
            LastModifier = lastModifier;
            LatestCreatedRevision = latestCreatedRevision;
            LatestReadyRevision = latestReadyRevision;
            LaunchStage = launchStage;
            Location = location;
            Name = name;
            ObservedGeneration = observedGeneration;
            Project = project;
            PulumiLabels = pulumiLabels;
            Reconciling = reconciling;
            Scalings = scalings;
            Templates = templates;
            TerminalConditions = terminalConditions;
            Uid = uid;
            UpdateTime = updateTime;
        }
    }
}
