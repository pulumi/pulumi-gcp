// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring
{
    public static class GetMeshIstioService
    {
        /// <summary>
        /// A Monitoring Service is the root resource under which operational aspects of a
        /// generic service are accessible. A service is some discrete, autonomous, and
        /// network-accessible unit, designed to solve an individual concern
        /// 
        /// An Mesh Istio monitoring service is automatically created by GCP to monitor
        /// Mesh Istio services.
        /// 
        /// 
        /// To get more information about Service, see:
        /// 
        /// * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
        /// * How-to Guides
        ///     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
        ///     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
        /// 
        /// ## Example Usage
        /// 
        /// ### Monitoring Mesh Istio Service
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Monitors the default MeshIstio service
        ///     var @default = Gcp.Monitoring.GetMeshIstioService.Invoke(new()
        ///     {
        ///         MeshUid = "proj-573164786102",
        ///         ServiceNamespace = "istio-system",
        ///         ServiceName = "prometheus",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMeshIstioServiceResult> InvokeAsync(GetMeshIstioServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMeshIstioServiceResult>("gcp:monitoring/getMeshIstioService:getMeshIstioService", args ?? new GetMeshIstioServiceArgs(), options.WithDefaults());

        /// <summary>
        /// A Monitoring Service is the root resource under which operational aspects of a
        /// generic service are accessible. A service is some discrete, autonomous, and
        /// network-accessible unit, designed to solve an individual concern
        /// 
        /// An Mesh Istio monitoring service is automatically created by GCP to monitor
        /// Mesh Istio services.
        /// 
        /// 
        /// To get more information about Service, see:
        /// 
        /// * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
        /// * How-to Guides
        ///     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
        ///     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
        /// 
        /// ## Example Usage
        /// 
        /// ### Monitoring Mesh Istio Service
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Monitors the default MeshIstio service
        ///     var @default = Gcp.Monitoring.GetMeshIstioService.Invoke(new()
        ///     {
        ///         MeshUid = "proj-573164786102",
        ///         ServiceNamespace = "istio-system",
        ///         ServiceName = "prometheus",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMeshIstioServiceResult> Invoke(GetMeshIstioServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMeshIstioServiceResult>("gcp:monitoring/getMeshIstioService:getMeshIstioService", args ?? new GetMeshIstioServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// A Monitoring Service is the root resource under which operational aspects of a
        /// generic service are accessible. A service is some discrete, autonomous, and
        /// network-accessible unit, designed to solve an individual concern
        /// 
        /// An Mesh Istio monitoring service is automatically created by GCP to monitor
        /// Mesh Istio services.
        /// 
        /// 
        /// To get more information about Service, see:
        /// 
        /// * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
        /// * How-to Guides
        ///     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
        ///     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
        /// 
        /// ## Example Usage
        /// 
        /// ### Monitoring Mesh Istio Service
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Monitors the default MeshIstio service
        ///     var @default = Gcp.Monitoring.GetMeshIstioService.Invoke(new()
        ///     {
        ///         MeshUid = "proj-573164786102",
        ///         ServiceNamespace = "istio-system",
        ///         ServiceName = "prometheus",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMeshIstioServiceResult> Invoke(GetMeshIstioServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMeshIstioServiceResult>("gcp:monitoring/getMeshIstioService:getMeshIstioService", args ?? new GetMeshIstioServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMeshIstioServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the mesh in which this Istio service is defined.
        /// Corresponds to the meshUid metric label in Istio metrics.
        /// </summary>
        [Input("meshUid", required: true)]
        public string MeshUid { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The name of the Istio service underlying this service.
        /// Corresponds to the destination_service_name metric label in Istio metrics.
        /// 
        /// - - -
        /// 
        /// Other optional fields include:
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        /// <summary>
        /// The namespace of the Istio service underlying this service.
        /// Corresponds to the destination_service_namespace metric label in Istio metrics.
        /// </summary>
        [Input("serviceNamespace", required: true)]
        public string ServiceNamespace { get; set; } = null!;

        public GetMeshIstioServiceArgs()
        {
        }
        public static new GetMeshIstioServiceArgs Empty => new GetMeshIstioServiceArgs();
    }

    public sealed class GetMeshIstioServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the mesh in which this Istio service is defined.
        /// Corresponds to the meshUid metric label in Istio metrics.
        /// </summary>
        [Input("meshUid", required: true)]
        public Input<string> MeshUid { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the Istio service underlying this service.
        /// Corresponds to the destination_service_name metric label in Istio metrics.
        /// 
        /// - - -
        /// 
        /// Other optional fields include:
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// The namespace of the Istio service underlying this service.
        /// Corresponds to the destination_service_namespace metric label in Istio metrics.
        /// </summary>
        [Input("serviceNamespace", required: true)]
        public Input<string> ServiceNamespace { get; set; } = null!;

        public GetMeshIstioServiceInvokeArgs()
        {
        }
        public static new GetMeshIstioServiceInvokeArgs Empty => new GetMeshIstioServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetMeshIstioServiceResult
    {
        /// <summary>
        /// Name used for UI elements listing this (Monitoring) Service.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string MeshUid;
        /// <summary>
        /// The full REST resource name for this channel. The syntax is:
        /// `projects/[PROJECT_ID]/services/[SERVICE_ID]`.
        /// </summary>
        public readonly string Name;
        public readonly string? Project;
        public readonly string ServiceId;
        public readonly string ServiceName;
        public readonly string ServiceNamespace;
        /// <summary>
        /// Configuration for how to query telemetry on the Service. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMeshIstioServiceTelemetryResult> Telemetries;
        public readonly ImmutableDictionary<string, string> UserLabels;

        [OutputConstructor]
        private GetMeshIstioServiceResult(
            string displayName,

            string id,

            string meshUid,

            string name,

            string? project,

            string serviceId,

            string serviceName,

            string serviceNamespace,

            ImmutableArray<Outputs.GetMeshIstioServiceTelemetryResult> telemetries,

            ImmutableDictionary<string, string> userLabels)
        {
            DisplayName = displayName;
            Id = id;
            MeshUid = meshUid;
            Name = name;
            Project = project;
            ServiceId = serviceId;
            ServiceName = serviceName;
            ServiceNamespace = serviceNamespace;
            Telemetries = telemetries;
            UserLabels = userLabels;
        }
    }
}
