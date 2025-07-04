// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetRegionBackendService
    {
        /// <summary>
        /// Get information about a Regional Backend Service. For more information see
        /// [the official documentation](https://cloud.google.com/compute/docs/load-balancing/internal/backend-service) and
        /// [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionBackendServices).
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
        ///     var myBackend = Gcp.Compute.GetRegionBackendService.Invoke(new()
        ///     {
        ///         Name = "my-backend-service",
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRegionBackendServiceResult> InvokeAsync(GetRegionBackendServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionBackendServiceResult>("gcp:compute/getRegionBackendService:getRegionBackendService", args ?? new GetRegionBackendServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Regional Backend Service. For more information see
        /// [the official documentation](https://cloud.google.com/compute/docs/load-balancing/internal/backend-service) and
        /// [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionBackendServices).
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
        ///     var myBackend = Gcp.Compute.GetRegionBackendService.Invoke(new()
        ///     {
        ///         Name = "my-backend-service",
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegionBackendServiceResult> Invoke(GetRegionBackendServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionBackendServiceResult>("gcp:compute/getRegionBackendService:getRegionBackendService", args ?? new GetRegionBackendServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Regional Backend Service. For more information see
        /// [the official documentation](https://cloud.google.com/compute/docs/load-balancing/internal/backend-service) and
        /// [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionBackendServices).
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
        ///     var myBackend = Gcp.Compute.GetRegionBackendService.Invoke(new()
        ///     {
        ///         Name = "my-backend-service",
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegionBackendServiceResult> Invoke(GetRegionBackendServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionBackendServiceResult>("gcp:compute/getRegionBackendService:getRegionBackendService", args ?? new GetRegionBackendServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionBackendServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the regional backend service.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The region where the backend service resides.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetRegionBackendServiceArgs()
        {
        }
        public static new GetRegionBackendServiceArgs Empty => new GetRegionBackendServiceArgs();
    }

    public sealed class GetRegionBackendServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the regional backend service.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region where the backend service resides.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetRegionBackendServiceInvokeArgs()
        {
        }
        public static new GetRegionBackendServiceInvokeArgs Empty => new GetRegionBackendServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegionBackendServiceResult
    {
        public readonly int AffinityCookieTtlSec;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceBackendResult> Backends;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceCdnPolicyResult> CdnPolicies;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceCircuitBreakerResult> CircuitBreakers;
        public readonly int ConnectionDrainingTimeoutSec;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceConnectionTrackingPolicyResult> ConnectionTrackingPolicies;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceConsistentHashResult> ConsistentHashes;
        public readonly string CreationTimestamp;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceCustomMetricResult> CustomMetrics;
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceDynamicForwardingResult> DynamicForwardings;
        public readonly bool EnableCdn;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceFailoverPolicyResult> FailoverPolicies;
        public readonly string Fingerprint;
        public readonly int GeneratedId;
        public readonly ImmutableArray<string> HealthChecks;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceIapResult> Iaps;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IpAddressSelectionPolicy;
        public readonly string LoadBalancingScheme;
        public readonly string LocalityLbPolicy;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceLogConfigResult> LogConfigs;
        public readonly string Name;
        public readonly string Network;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceOutlierDetectionResult> OutlierDetections;
        public readonly string PortName;
        public readonly string? Project;
        public readonly string Protocol;
        public readonly string? Region;
        public readonly string SecurityPolicy;
        public readonly string SelfLink;
        public readonly string SessionAffinity;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceStrongSessionAffinityCookyResult> StrongSessionAffinityCookies;
        public readonly ImmutableArray<Outputs.GetRegionBackendServiceSubsettingResult> Subsettings;
        public readonly int TimeoutSec;

        [OutputConstructor]
        private GetRegionBackendServiceResult(
            int affinityCookieTtlSec,

            ImmutableArray<Outputs.GetRegionBackendServiceBackendResult> backends,

            ImmutableArray<Outputs.GetRegionBackendServiceCdnPolicyResult> cdnPolicies,

            ImmutableArray<Outputs.GetRegionBackendServiceCircuitBreakerResult> circuitBreakers,

            int connectionDrainingTimeoutSec,

            ImmutableArray<Outputs.GetRegionBackendServiceConnectionTrackingPolicyResult> connectionTrackingPolicies,

            ImmutableArray<Outputs.GetRegionBackendServiceConsistentHashResult> consistentHashes,

            string creationTimestamp,

            ImmutableArray<Outputs.GetRegionBackendServiceCustomMetricResult> customMetrics,

            string description,

            ImmutableArray<Outputs.GetRegionBackendServiceDynamicForwardingResult> dynamicForwardings,

            bool enableCdn,

            ImmutableArray<Outputs.GetRegionBackendServiceFailoverPolicyResult> failoverPolicies,

            string fingerprint,

            int generatedId,

            ImmutableArray<string> healthChecks,

            ImmutableArray<Outputs.GetRegionBackendServiceIapResult> iaps,

            string id,

            string ipAddressSelectionPolicy,

            string loadBalancingScheme,

            string localityLbPolicy,

            ImmutableArray<Outputs.GetRegionBackendServiceLogConfigResult> logConfigs,

            string name,

            string network,

            ImmutableArray<Outputs.GetRegionBackendServiceOutlierDetectionResult> outlierDetections,

            string portName,

            string? project,

            string protocol,

            string? region,

            string securityPolicy,

            string selfLink,

            string sessionAffinity,

            ImmutableArray<Outputs.GetRegionBackendServiceStrongSessionAffinityCookyResult> strongSessionAffinityCookies,

            ImmutableArray<Outputs.GetRegionBackendServiceSubsettingResult> subsettings,

            int timeoutSec)
        {
            AffinityCookieTtlSec = affinityCookieTtlSec;
            Backends = backends;
            CdnPolicies = cdnPolicies;
            CircuitBreakers = circuitBreakers;
            ConnectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
            ConnectionTrackingPolicies = connectionTrackingPolicies;
            ConsistentHashes = consistentHashes;
            CreationTimestamp = creationTimestamp;
            CustomMetrics = customMetrics;
            Description = description;
            DynamicForwardings = dynamicForwardings;
            EnableCdn = enableCdn;
            FailoverPolicies = failoverPolicies;
            Fingerprint = fingerprint;
            GeneratedId = generatedId;
            HealthChecks = healthChecks;
            Iaps = iaps;
            Id = id;
            IpAddressSelectionPolicy = ipAddressSelectionPolicy;
            LoadBalancingScheme = loadBalancingScheme;
            LocalityLbPolicy = localityLbPolicy;
            LogConfigs = logConfigs;
            Name = name;
            Network = network;
            OutlierDetections = outlierDetections;
            PortName = portName;
            Project = project;
            Protocol = protocol;
            Region = region;
            SecurityPolicy = securityPolicy;
            SelfLink = selfLink;
            SessionAffinity = sessionAffinity;
            StrongSessionAffinityCookies = strongSessionAffinityCookies;
            Subsettings = subsettings;
            TimeoutSec = timeoutSec;
        }
    }
}
