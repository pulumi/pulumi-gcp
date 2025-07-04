// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apphub
{
    public static class GetDiscoveredWorkload
    {
        /// <summary>
        /// Get information about a discovered workload from its uri.
        /// 
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
        ///     var my_workload = Gcp.Apphub.GetDiscoveredWorkload.Invoke(new()
        ///     {
        ///         Location = "us-central1",
        ///         WorkloadUri = "my-workload-uri",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDiscoveredWorkloadResult> InvokeAsync(GetDiscoveredWorkloadArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDiscoveredWorkloadResult>("gcp:apphub/getDiscoveredWorkload:getDiscoveredWorkload", args ?? new GetDiscoveredWorkloadArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a discovered workload from its uri.
        /// 
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
        ///     var my_workload = Gcp.Apphub.GetDiscoveredWorkload.Invoke(new()
        ///     {
        ///         Location = "us-central1",
        ///         WorkloadUri = "my-workload-uri",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDiscoveredWorkloadResult> Invoke(GetDiscoveredWorkloadInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDiscoveredWorkloadResult>("gcp:apphub/getDiscoveredWorkload:getDiscoveredWorkload", args ?? new GetDiscoveredWorkloadInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a discovered workload from its uri.
        /// 
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
        ///     var my_workload = Gcp.Apphub.GetDiscoveredWorkload.Invoke(new()
        ///     {
        ///         Location = "us-central1",
        ///         WorkloadUri = "my-workload-uri",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDiscoveredWorkloadResult> Invoke(GetDiscoveredWorkloadInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDiscoveredWorkloadResult>("gcp:apphub/getDiscoveredWorkload:getDiscoveredWorkload", args ?? new GetDiscoveredWorkloadInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDiscoveredWorkloadArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location of the discovered workload.
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// The host project of the discovered workload.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The uri of the workload (instance group managed by the Instance Group Manager). Example: "//compute.googleapis.com/projects/1/regions/us-east1/instanceGroups/id1"
        /// </summary>
        [Input("workloadUri", required: true)]
        public string WorkloadUri { get; set; } = null!;

        public GetDiscoveredWorkloadArgs()
        {
        }
        public static new GetDiscoveredWorkloadArgs Empty => new GetDiscoveredWorkloadArgs();
    }

    public sealed class GetDiscoveredWorkloadInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location of the discovered workload.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The host project of the discovered workload.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The uri of the workload (instance group managed by the Instance Group Manager). Example: "//compute.googleapis.com/projects/1/regions/us-east1/instanceGroups/id1"
        /// </summary>
        [Input("workloadUri", required: true)]
        public Input<string> WorkloadUri { get; set; } = null!;

        public GetDiscoveredWorkloadInvokeArgs()
        {
        }
        public static new GetDiscoveredWorkloadInvokeArgs Empty => new GetDiscoveredWorkloadInvokeArgs();
    }


    [OutputType]
    public sealed class GetDiscoveredWorkloadResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The location that the underlying resource resides in.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// Resource name of a Workload. Format: "projects/{host-project-id}/locations/{location}/applications/{application-id}/workloads/{workload-id}".
        /// </summary>
        public readonly string Name;
        public readonly string? Project;
        /// <summary>
        /// Properties of an underlying compute resource that can comprise a Workload. Structure is documented below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDiscoveredWorkloadWorkloadPropertyResult> WorkloadProperties;
        /// <summary>
        /// Reference to an underlying networking resource that can comprise a Workload. Structure is documented below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDiscoveredWorkloadWorkloadReferenceResult> WorkloadReferences;
        public readonly string WorkloadUri;

        [OutputConstructor]
        private GetDiscoveredWorkloadResult(
            string id,

            string location,

            string name,

            string? project,

            ImmutableArray<Outputs.GetDiscoveredWorkloadWorkloadPropertyResult> workloadProperties,

            ImmutableArray<Outputs.GetDiscoveredWorkloadWorkloadReferenceResult> workloadReferences,

            string workloadUri)
        {
            Id = id;
            Location = location;
            Name = name;
            Project = project;
            WorkloadProperties = workloadProperties;
            WorkloadReferences = workloadReferences;
            WorkloadUri = workloadUri;
        }
    }
}
