// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetBackendService
    {
        /// <summary>
        /// Provide access to a Backend Service's attribute. For more information
        /// see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/http/backend-service)
        /// and the [API](https://cloud.google.com/compute/docs/reference/latest/backendServices).
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
        ///     var baz = Gcp.Compute.GetBackendService.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var @default = new Gcp.Compute.BackendService("default", new()
        ///     {
        ///         Name = "backend-service",
        ///         HealthChecks = baz.Apply(getBackendServiceResult =&gt; getBackendServiceResult.HealthChecks[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetBackendServiceResult> InvokeAsync(GetBackendServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBackendServiceResult>("gcp:compute/getBackendService:getBackendService", args ?? new GetBackendServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Provide access to a Backend Service's attribute. For more information
        /// see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/http/backend-service)
        /// and the [API](https://cloud.google.com/compute/docs/reference/latest/backendServices).
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
        ///     var baz = Gcp.Compute.GetBackendService.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var @default = new Gcp.Compute.BackendService("default", new()
        ///     {
        ///         Name = "backend-service",
        ///         HealthChecks = baz.Apply(getBackendServiceResult =&gt; getBackendServiceResult.HealthChecks[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetBackendServiceResult> Invoke(GetBackendServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBackendServiceResult>("gcp:compute/getBackendService:getBackendService", args ?? new GetBackendServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provide access to a Backend Service's attribute. For more information
        /// see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/http/backend-service)
        /// and the [API](https://cloud.google.com/compute/docs/reference/latest/backendServices).
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
        ///     var baz = Gcp.Compute.GetBackendService.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var @default = new Gcp.Compute.BackendService("default", new()
        ///     {
        ///         Name = "backend-service",
        ///         HealthChecks = baz.Apply(getBackendServiceResult =&gt; getBackendServiceResult.HealthChecks[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetBackendServiceResult> Invoke(GetBackendServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBackendServiceResult>("gcp:compute/getBackendService:getBackendService", args ?? new GetBackendServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBackendServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Backend Service.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetBackendServiceArgs()
        {
        }
        public static new GetBackendServiceArgs Empty => new GetBackendServiceArgs();
    }

    public sealed class GetBackendServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Backend Service.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetBackendServiceInvokeArgs()
        {
        }
        public static new GetBackendServiceInvokeArgs Empty => new GetBackendServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetBackendServiceResult
    {
        public readonly int AffinityCookieTtlSec;
        /// <summary>
        /// The set of backends that serve this Backend Service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBackendServiceBackendResult> Backends;
        public readonly ImmutableArray<Outputs.GetBackendServiceCdnPolicyResult> CdnPolicies;
        public readonly ImmutableArray<Outputs.GetBackendServiceCircuitBreakerResult> CircuitBreakers;
        public readonly string CompressionMode;
        /// <summary>
        /// Time for which instance will be drained (not accept new connections, but still work to finish started ones).
        /// </summary>
        public readonly int ConnectionDrainingTimeoutSec;
        public readonly ImmutableArray<Outputs.GetBackendServiceConsistentHashResult> ConsistentHash;
        public readonly string CreationTimestamp;
        public readonly ImmutableArray<Outputs.GetBackendServiceCustomMetricResult> CustomMetrics;
        public readonly ImmutableArray<string> CustomRequestHeaders;
        public readonly ImmutableArray<string> CustomResponseHeaders;
        /// <summary>
        /// Textual description for the Backend Service.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetBackendServiceDynamicForwardingResult> DynamicForwardings;
        public readonly string EdgeSecurityPolicy;
        /// <summary>
        /// Whether or not Cloud CDN is enabled on the Backend Service.
        /// </summary>
        public readonly bool EnableCdn;
        public readonly string ExternalManagedMigrationState;
        public readonly double ExternalManagedMigrationTestingPercentage;
        /// <summary>
        /// The fingerprint of the Backend Service.
        /// </summary>
        public readonly string Fingerprint;
        /// <summary>
        /// The unique identifier for the resource. This identifier is defined by the server.
        /// </summary>
        public readonly int GeneratedId;
        /// <summary>
        /// The set of HTTP/HTTPS health checks used by the Backend Service.
        /// </summary>
        public readonly ImmutableArray<string> HealthChecks;
        public readonly ImmutableArray<Outputs.GetBackendServiceIapResult> Iaps;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IpAddressSelectionPolicy;
        public readonly string LoadBalancingScheme;
        public readonly ImmutableArray<Outputs.GetBackendServiceLocalityLbPolicyResult> LocalityLbPolicies;
        public readonly string LocalityLbPolicy;
        public readonly ImmutableArray<Outputs.GetBackendServiceLogConfigResult> LogConfigs;
        public readonly ImmutableArray<Outputs.GetBackendServiceMaxStreamDurationResult> MaxStreamDurations;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetBackendServiceNetworkPassThroughLbTrafficPolicyResult> NetworkPassThroughLbTrafficPolicies;
        public readonly ImmutableArray<Outputs.GetBackendServiceOutlierDetectionResult> OutlierDetections;
        /// <summary>
        /// The name of a service that has been added to an instance group in this backend.
        /// </summary>
        public readonly string PortName;
        public readonly string? Project;
        /// <summary>
        /// The protocol for incoming requests.
        /// </summary>
        public readonly string Protocol;
        public readonly string SecurityPolicy;
        public readonly ImmutableArray<Outputs.GetBackendServiceSecuritySettingResult> SecuritySettings;
        /// <summary>
        /// The URI of the Backend Service.
        /// </summary>
        public readonly string SelfLink;
        public readonly string ServiceLbPolicy;
        /// <summary>
        /// The Backend Service session stickiness configuration.
        /// </summary>
        public readonly string SessionAffinity;
        public readonly ImmutableArray<Outputs.GetBackendServiceStrongSessionAffinityCookyResult> StrongSessionAffinityCookies;
        /// <summary>
        /// The number of seconds to wait for a backend to respond to a request before considering the request failed.
        /// </summary>
        public readonly int TimeoutSec;
        public readonly ImmutableArray<Outputs.GetBackendServiceTlsSettingResult> TlsSettings;

        [OutputConstructor]
        private GetBackendServiceResult(
            int affinityCookieTtlSec,

            ImmutableArray<Outputs.GetBackendServiceBackendResult> backends,

            ImmutableArray<Outputs.GetBackendServiceCdnPolicyResult> cdnPolicies,

            ImmutableArray<Outputs.GetBackendServiceCircuitBreakerResult> circuitBreakers,

            string compressionMode,

            int connectionDrainingTimeoutSec,

            ImmutableArray<Outputs.GetBackendServiceConsistentHashResult> consistentHash,

            string creationTimestamp,

            ImmutableArray<Outputs.GetBackendServiceCustomMetricResult> customMetrics,

            ImmutableArray<string> customRequestHeaders,

            ImmutableArray<string> customResponseHeaders,

            string description,

            ImmutableArray<Outputs.GetBackendServiceDynamicForwardingResult> dynamicForwardings,

            string edgeSecurityPolicy,

            bool enableCdn,

            string externalManagedMigrationState,

            double externalManagedMigrationTestingPercentage,

            string fingerprint,

            int generatedId,

            ImmutableArray<string> healthChecks,

            ImmutableArray<Outputs.GetBackendServiceIapResult> iaps,

            string id,

            string ipAddressSelectionPolicy,

            string loadBalancingScheme,

            ImmutableArray<Outputs.GetBackendServiceLocalityLbPolicyResult> localityLbPolicies,

            string localityLbPolicy,

            ImmutableArray<Outputs.GetBackendServiceLogConfigResult> logConfigs,

            ImmutableArray<Outputs.GetBackendServiceMaxStreamDurationResult> maxStreamDurations,

            string name,

            ImmutableArray<Outputs.GetBackendServiceNetworkPassThroughLbTrafficPolicyResult> networkPassThroughLbTrafficPolicies,

            ImmutableArray<Outputs.GetBackendServiceOutlierDetectionResult> outlierDetections,

            string portName,

            string? project,

            string protocol,

            string securityPolicy,

            ImmutableArray<Outputs.GetBackendServiceSecuritySettingResult> securitySettings,

            string selfLink,

            string serviceLbPolicy,

            string sessionAffinity,

            ImmutableArray<Outputs.GetBackendServiceStrongSessionAffinityCookyResult> strongSessionAffinityCookies,

            int timeoutSec,

            ImmutableArray<Outputs.GetBackendServiceTlsSettingResult> tlsSettings)
        {
            AffinityCookieTtlSec = affinityCookieTtlSec;
            Backends = backends;
            CdnPolicies = cdnPolicies;
            CircuitBreakers = circuitBreakers;
            CompressionMode = compressionMode;
            ConnectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
            ConsistentHash = consistentHash;
            CreationTimestamp = creationTimestamp;
            CustomMetrics = customMetrics;
            CustomRequestHeaders = customRequestHeaders;
            CustomResponseHeaders = customResponseHeaders;
            Description = description;
            DynamicForwardings = dynamicForwardings;
            EdgeSecurityPolicy = edgeSecurityPolicy;
            EnableCdn = enableCdn;
            ExternalManagedMigrationState = externalManagedMigrationState;
            ExternalManagedMigrationTestingPercentage = externalManagedMigrationTestingPercentage;
            Fingerprint = fingerprint;
            GeneratedId = generatedId;
            HealthChecks = healthChecks;
            Iaps = iaps;
            Id = id;
            IpAddressSelectionPolicy = ipAddressSelectionPolicy;
            LoadBalancingScheme = loadBalancingScheme;
            LocalityLbPolicies = localityLbPolicies;
            LocalityLbPolicy = localityLbPolicy;
            LogConfigs = logConfigs;
            MaxStreamDurations = maxStreamDurations;
            Name = name;
            NetworkPassThroughLbTrafficPolicies = networkPassThroughLbTrafficPolicies;
            OutlierDetections = outlierDetections;
            PortName = portName;
            Project = project;
            Protocol = protocol;
            SecurityPolicy = securityPolicy;
            SecuritySettings = securitySettings;
            SelfLink = selfLink;
            ServiceLbPolicy = serviceLbPolicy;
            SessionAffinity = sessionAffinity;
            StrongSessionAffinityCookies = strongSessionAffinityCookies;
            TimeoutSec = timeoutSec;
            TlsSettings = tlsSettings;
        }
    }
}
