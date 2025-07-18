// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container
{
    public static class GetCluster
    {
        /// <summary>
        /// Get info about a GKE cluster from its name and location.
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
        ///     var myCluster = Gcp.Container.GetCluster.Invoke(new()
        ///     {
        ///         Name = "my-cluster",
        ///         Location = "us-east1-a",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.Endpoint),
        ///         ["instanceGroupUrls"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodePools[0]?.InstanceGroupUrls),
        ///         ["nodeConfig"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodeConfigs),
        ///         ["nodePools"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodePools),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetClusterResult> InvokeAsync(GetClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterResult>("gcp:container/getCluster:getCluster", args ?? new GetClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Get info about a GKE cluster from its name and location.
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
        ///     var myCluster = Gcp.Container.GetCluster.Invoke(new()
        ///     {
        ///         Name = "my-cluster",
        ///         Location = "us-east1-a",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.Endpoint),
        ///         ["instanceGroupUrls"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodePools[0]?.InstanceGroupUrls),
        ///         ["nodeConfig"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodeConfigs),
        ///         ["nodePools"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodePools),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClusterResult> Invoke(GetClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterResult>("gcp:container/getCluster:getCluster", args ?? new GetClusterInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get info about a GKE cluster from its name and location.
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
        ///     var myCluster = Gcp.Container.GetCluster.Invoke(new()
        ///     {
        ///         Name = "my-cluster",
        ///         Location = "us-east1-a",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.Endpoint),
        ///         ["instanceGroupUrls"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodePools[0]?.InstanceGroupUrls),
        ///         ["nodeConfig"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodeConfigs),
        ///         ["nodePools"] = myCluster.Apply(getClusterResult =&gt; getClusterResult.NodePools),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClusterResult> Invoke(GetClusterInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterResult>("gcp:container/getCluster:getCluster", args ?? new GetClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location (zone or region) this cluster has been
        /// created in. One of `location`, `region`, `zone`, or a provider-level `zone` must
        /// be specified.
        /// </summary>
        [Input("location")]
        public string? Location { get; set; }

        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetClusterArgs()
        {
        }
        public static new GetClusterArgs Empty => new GetClusterArgs();
    }

    public sealed class GetClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location (zone or region) this cluster has been
        /// created in. One of `location`, `region`, `zone`, or a provider-level `zone` must
        /// be specified.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the cluster.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetClusterInvokeArgs()
        {
        }
        public static new GetClusterInvokeArgs Empty => new GetClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterResult
    {
        public readonly ImmutableArray<Outputs.GetClusterAddonsConfigResult> AddonsConfigs;
        public readonly bool AllowNetAdmin;
        public readonly ImmutableArray<Outputs.GetClusterAnonymousAuthenticationConfigResult> AnonymousAuthenticationConfigs;
        public readonly ImmutableArray<Outputs.GetClusterAuthenticatorGroupsConfigResult> AuthenticatorGroupsConfigs;
        public readonly ImmutableArray<Outputs.GetClusterBinaryAuthorizationResult> BinaryAuthorizations;
        public readonly ImmutableArray<Outputs.GetClusterClusterAutoscalingResult> ClusterAutoscalings;
        public readonly string ClusterIpv4Cidr;
        public readonly ImmutableArray<Outputs.GetClusterClusterTelemetryResult> ClusterTelemetries;
        public readonly ImmutableArray<Outputs.GetClusterConfidentialNodeResult> ConfidentialNodes;
        public readonly ImmutableArray<Outputs.GetClusterControlPlaneEndpointsConfigResult> ControlPlaneEndpointsConfigs;
        public readonly ImmutableArray<Outputs.GetClusterCostManagementConfigResult> CostManagementConfigs;
        public readonly ImmutableArray<Outputs.GetClusterDatabaseEncryptionResult> DatabaseEncryptions;
        public readonly string DatapathProvider;
        public readonly int DefaultMaxPodsPerNode;
        public readonly ImmutableArray<Outputs.GetClusterDefaultSnatStatusResult> DefaultSnatStatuses;
        public readonly bool DeletionProtection;
        public readonly string Description;
        public readonly bool DisableL4LbFirewallReconciliation;
        public readonly ImmutableArray<Outputs.GetClusterDnsConfigResult> DnsConfigs;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        public readonly bool EnableAutopilot;
        public readonly bool EnableCiliumClusterwideNetworkPolicy;
        public readonly bool EnableFqdnNetworkPolicy;
        public readonly bool EnableIntranodeVisibility;
        public readonly ImmutableArray<Outputs.GetClusterEnableK8sBetaApiResult> EnableK8sBetaApis;
        public readonly bool EnableKubernetesAlpha;
        public readonly bool EnableL4IlbSubsetting;
        public readonly bool EnableLegacyAbac;
        public readonly bool EnableMultiNetworking;
        public readonly bool EnableShieldedNodes;
        public readonly bool EnableTpu;
        public readonly string Endpoint;
        public readonly ImmutableArray<Outputs.GetClusterEnterpriseConfigResult> EnterpriseConfigs;
        public readonly ImmutableArray<Outputs.GetClusterFleetResult> Fleets;
        public readonly ImmutableArray<Outputs.GetClusterGatewayApiConfigResult> GatewayApiConfigs;
        public readonly ImmutableArray<Outputs.GetClusterGkeAutoUpgradeConfigResult> GkeAutoUpgradeConfigs;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetClusterIdentityServiceConfigResult> IdentityServiceConfigs;
        public readonly string InTransitEncryptionConfig;
        public readonly int InitialNodeCount;
        public readonly ImmutableArray<Outputs.GetClusterIpAllocationPolicyResult> IpAllocationPolicies;
        public readonly string LabelFingerprint;
        public readonly string? Location;
        public readonly ImmutableArray<Outputs.GetClusterLoggingConfigResult> LoggingConfigs;
        public readonly string LoggingService;
        public readonly ImmutableArray<Outputs.GetClusterMaintenancePolicyResult> MaintenancePolicies;
        public readonly ImmutableArray<Outputs.GetClusterMasterAuthorizedNetworksConfigResult> MasterAuthorizedNetworksConfigs;
        public readonly ImmutableArray<Outputs.GetClusterMasterAuthResult> MasterAuths;
        public readonly string MasterVersion;
        public readonly ImmutableArray<Outputs.GetClusterMeshCertificateResult> MeshCertificates;
        public readonly string MinMasterVersion;
        public readonly ImmutableArray<Outputs.GetClusterMonitoringConfigResult> MonitoringConfigs;
        public readonly string MonitoringService;
        public readonly string Name;
        public readonly string Network;
        public readonly ImmutableArray<Outputs.GetClusterNetworkPerformanceConfigResult> NetworkPerformanceConfigs;
        public readonly ImmutableArray<Outputs.GetClusterNetworkPolicyResult> NetworkPolicies;
        public readonly string NetworkingMode;
        public readonly ImmutableArray<Outputs.GetClusterNodeConfigResult> NodeConfigs;
        public readonly ImmutableArray<string> NodeLocations;
        public readonly ImmutableArray<Outputs.GetClusterNodePoolAutoConfigResult> NodePoolAutoConfigs;
        public readonly ImmutableArray<Outputs.GetClusterNodePoolDefaultResult> NodePoolDefaults;
        public readonly ImmutableArray<Outputs.GetClusterNodePoolResult> NodePools;
        public readonly string NodeVersion;
        public readonly ImmutableArray<Outputs.GetClusterNotificationConfigResult> NotificationConfigs;
        public readonly string Operation;
        public readonly ImmutableArray<Outputs.GetClusterPodAutoscalingResult> PodAutoscalings;
        public readonly ImmutableArray<Outputs.GetClusterPodSecurityPolicyConfigResult> PodSecurityPolicyConfigs;
        public readonly ImmutableArray<Outputs.GetClusterPrivateClusterConfigResult> PrivateClusterConfigs;
        public readonly string PrivateIpv6GoogleAccess;
        public readonly string? Project;
        public readonly ImmutableArray<Outputs.GetClusterProtectConfigResult> ProtectConfigs;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        public readonly ImmutableArray<Outputs.GetClusterReleaseChannelResult> ReleaseChannels;
        public readonly bool RemoveDefaultNodePool;
        public readonly ImmutableDictionary<string, string> ResourceLabels;
        public readonly ImmutableArray<Outputs.GetClusterResourceUsageExportConfigResult> ResourceUsageExportConfigs;
        public readonly ImmutableArray<Outputs.GetClusterSecretManagerConfigResult> SecretManagerConfigs;
        public readonly ImmutableArray<Outputs.GetClusterSecurityPostureConfigResult> SecurityPostureConfigs;
        public readonly string SelfLink;
        public readonly ImmutableArray<Outputs.GetClusterServiceExternalIpsConfigResult> ServiceExternalIpsConfigs;
        public readonly string ServicesIpv4Cidr;
        public readonly string Subnetwork;
        public readonly ImmutableArray<Outputs.GetClusterTpuConfigResult> TpuConfigs;
        public readonly string TpuIpv4CidrBlock;
        public readonly ImmutableArray<Outputs.GetClusterUserManagedKeysConfigResult> UserManagedKeysConfigs;
        public readonly ImmutableArray<Outputs.GetClusterVerticalPodAutoscalingResult> VerticalPodAutoscalings;
        public readonly ImmutableArray<Outputs.GetClusterWorkloadAltsConfigResult> WorkloadAltsConfigs;
        public readonly ImmutableArray<Outputs.GetClusterWorkloadIdentityConfigResult> WorkloadIdentityConfigs;

        [OutputConstructor]
        private GetClusterResult(
            ImmutableArray<Outputs.GetClusterAddonsConfigResult> addonsConfigs,

            bool allowNetAdmin,

            ImmutableArray<Outputs.GetClusterAnonymousAuthenticationConfigResult> anonymousAuthenticationConfigs,

            ImmutableArray<Outputs.GetClusterAuthenticatorGroupsConfigResult> authenticatorGroupsConfigs,

            ImmutableArray<Outputs.GetClusterBinaryAuthorizationResult> binaryAuthorizations,

            ImmutableArray<Outputs.GetClusterClusterAutoscalingResult> clusterAutoscalings,

            string clusterIpv4Cidr,

            ImmutableArray<Outputs.GetClusterClusterTelemetryResult> clusterTelemetries,

            ImmutableArray<Outputs.GetClusterConfidentialNodeResult> confidentialNodes,

            ImmutableArray<Outputs.GetClusterControlPlaneEndpointsConfigResult> controlPlaneEndpointsConfigs,

            ImmutableArray<Outputs.GetClusterCostManagementConfigResult> costManagementConfigs,

            ImmutableArray<Outputs.GetClusterDatabaseEncryptionResult> databaseEncryptions,

            string datapathProvider,

            int defaultMaxPodsPerNode,

            ImmutableArray<Outputs.GetClusterDefaultSnatStatusResult> defaultSnatStatuses,

            bool deletionProtection,

            string description,

            bool disableL4LbFirewallReconciliation,

            ImmutableArray<Outputs.GetClusterDnsConfigResult> dnsConfigs,

            ImmutableDictionary<string, string> effectiveLabels,

            bool enableAutopilot,

            bool enableCiliumClusterwideNetworkPolicy,

            bool enableFqdnNetworkPolicy,

            bool enableIntranodeVisibility,

            ImmutableArray<Outputs.GetClusterEnableK8sBetaApiResult> enableK8sBetaApis,

            bool enableKubernetesAlpha,

            bool enableL4IlbSubsetting,

            bool enableLegacyAbac,

            bool enableMultiNetworking,

            bool enableShieldedNodes,

            bool enableTpu,

            string endpoint,

            ImmutableArray<Outputs.GetClusterEnterpriseConfigResult> enterpriseConfigs,

            ImmutableArray<Outputs.GetClusterFleetResult> fleets,

            ImmutableArray<Outputs.GetClusterGatewayApiConfigResult> gatewayApiConfigs,

            ImmutableArray<Outputs.GetClusterGkeAutoUpgradeConfigResult> gkeAutoUpgradeConfigs,

            string id,

            ImmutableArray<Outputs.GetClusterIdentityServiceConfigResult> identityServiceConfigs,

            string inTransitEncryptionConfig,

            int initialNodeCount,

            ImmutableArray<Outputs.GetClusterIpAllocationPolicyResult> ipAllocationPolicies,

            string labelFingerprint,

            string? location,

            ImmutableArray<Outputs.GetClusterLoggingConfigResult> loggingConfigs,

            string loggingService,

            ImmutableArray<Outputs.GetClusterMaintenancePolicyResult> maintenancePolicies,

            ImmutableArray<Outputs.GetClusterMasterAuthorizedNetworksConfigResult> masterAuthorizedNetworksConfigs,

            ImmutableArray<Outputs.GetClusterMasterAuthResult> masterAuths,

            string masterVersion,

            ImmutableArray<Outputs.GetClusterMeshCertificateResult> meshCertificates,

            string minMasterVersion,

            ImmutableArray<Outputs.GetClusterMonitoringConfigResult> monitoringConfigs,

            string monitoringService,

            string name,

            string network,

            ImmutableArray<Outputs.GetClusterNetworkPerformanceConfigResult> networkPerformanceConfigs,

            ImmutableArray<Outputs.GetClusterNetworkPolicyResult> networkPolicies,

            string networkingMode,

            ImmutableArray<Outputs.GetClusterNodeConfigResult> nodeConfigs,

            ImmutableArray<string> nodeLocations,

            ImmutableArray<Outputs.GetClusterNodePoolAutoConfigResult> nodePoolAutoConfigs,

            ImmutableArray<Outputs.GetClusterNodePoolDefaultResult> nodePoolDefaults,

            ImmutableArray<Outputs.GetClusterNodePoolResult> nodePools,

            string nodeVersion,

            ImmutableArray<Outputs.GetClusterNotificationConfigResult> notificationConfigs,

            string operation,

            ImmutableArray<Outputs.GetClusterPodAutoscalingResult> podAutoscalings,

            ImmutableArray<Outputs.GetClusterPodSecurityPolicyConfigResult> podSecurityPolicyConfigs,

            ImmutableArray<Outputs.GetClusterPrivateClusterConfigResult> privateClusterConfigs,

            string privateIpv6GoogleAccess,

            string? project,

            ImmutableArray<Outputs.GetClusterProtectConfigResult> protectConfigs,

            ImmutableDictionary<string, string> pulumiLabels,

            ImmutableArray<Outputs.GetClusterReleaseChannelResult> releaseChannels,

            bool removeDefaultNodePool,

            ImmutableDictionary<string, string> resourceLabels,

            ImmutableArray<Outputs.GetClusterResourceUsageExportConfigResult> resourceUsageExportConfigs,

            ImmutableArray<Outputs.GetClusterSecretManagerConfigResult> secretManagerConfigs,

            ImmutableArray<Outputs.GetClusterSecurityPostureConfigResult> securityPostureConfigs,

            string selfLink,

            ImmutableArray<Outputs.GetClusterServiceExternalIpsConfigResult> serviceExternalIpsConfigs,

            string servicesIpv4Cidr,

            string subnetwork,

            ImmutableArray<Outputs.GetClusterTpuConfigResult> tpuConfigs,

            string tpuIpv4CidrBlock,

            ImmutableArray<Outputs.GetClusterUserManagedKeysConfigResult> userManagedKeysConfigs,

            ImmutableArray<Outputs.GetClusterVerticalPodAutoscalingResult> verticalPodAutoscalings,

            ImmutableArray<Outputs.GetClusterWorkloadAltsConfigResult> workloadAltsConfigs,

            ImmutableArray<Outputs.GetClusterWorkloadIdentityConfigResult> workloadIdentityConfigs)
        {
            AddonsConfigs = addonsConfigs;
            AllowNetAdmin = allowNetAdmin;
            AnonymousAuthenticationConfigs = anonymousAuthenticationConfigs;
            AuthenticatorGroupsConfigs = authenticatorGroupsConfigs;
            BinaryAuthorizations = binaryAuthorizations;
            ClusterAutoscalings = clusterAutoscalings;
            ClusterIpv4Cidr = clusterIpv4Cidr;
            ClusterTelemetries = clusterTelemetries;
            ConfidentialNodes = confidentialNodes;
            ControlPlaneEndpointsConfigs = controlPlaneEndpointsConfigs;
            CostManagementConfigs = costManagementConfigs;
            DatabaseEncryptions = databaseEncryptions;
            DatapathProvider = datapathProvider;
            DefaultMaxPodsPerNode = defaultMaxPodsPerNode;
            DefaultSnatStatuses = defaultSnatStatuses;
            DeletionProtection = deletionProtection;
            Description = description;
            DisableL4LbFirewallReconciliation = disableL4LbFirewallReconciliation;
            DnsConfigs = dnsConfigs;
            EffectiveLabels = effectiveLabels;
            EnableAutopilot = enableAutopilot;
            EnableCiliumClusterwideNetworkPolicy = enableCiliumClusterwideNetworkPolicy;
            EnableFqdnNetworkPolicy = enableFqdnNetworkPolicy;
            EnableIntranodeVisibility = enableIntranodeVisibility;
            EnableK8sBetaApis = enableK8sBetaApis;
            EnableKubernetesAlpha = enableKubernetesAlpha;
            EnableL4IlbSubsetting = enableL4IlbSubsetting;
            EnableLegacyAbac = enableLegacyAbac;
            EnableMultiNetworking = enableMultiNetworking;
            EnableShieldedNodes = enableShieldedNodes;
            EnableTpu = enableTpu;
            Endpoint = endpoint;
            EnterpriseConfigs = enterpriseConfigs;
            Fleets = fleets;
            GatewayApiConfigs = gatewayApiConfigs;
            GkeAutoUpgradeConfigs = gkeAutoUpgradeConfigs;
            Id = id;
            IdentityServiceConfigs = identityServiceConfigs;
            InTransitEncryptionConfig = inTransitEncryptionConfig;
            InitialNodeCount = initialNodeCount;
            IpAllocationPolicies = ipAllocationPolicies;
            LabelFingerprint = labelFingerprint;
            Location = location;
            LoggingConfigs = loggingConfigs;
            LoggingService = loggingService;
            MaintenancePolicies = maintenancePolicies;
            MasterAuthorizedNetworksConfigs = masterAuthorizedNetworksConfigs;
            MasterAuths = masterAuths;
            MasterVersion = masterVersion;
            MeshCertificates = meshCertificates;
            MinMasterVersion = minMasterVersion;
            MonitoringConfigs = monitoringConfigs;
            MonitoringService = monitoringService;
            Name = name;
            Network = network;
            NetworkPerformanceConfigs = networkPerformanceConfigs;
            NetworkPolicies = networkPolicies;
            NetworkingMode = networkingMode;
            NodeConfigs = nodeConfigs;
            NodeLocations = nodeLocations;
            NodePoolAutoConfigs = nodePoolAutoConfigs;
            NodePoolDefaults = nodePoolDefaults;
            NodePools = nodePools;
            NodeVersion = nodeVersion;
            NotificationConfigs = notificationConfigs;
            Operation = operation;
            PodAutoscalings = podAutoscalings;
            PodSecurityPolicyConfigs = podSecurityPolicyConfigs;
            PrivateClusterConfigs = privateClusterConfigs;
            PrivateIpv6GoogleAccess = privateIpv6GoogleAccess;
            Project = project;
            ProtectConfigs = protectConfigs;
            PulumiLabels = pulumiLabels;
            ReleaseChannels = releaseChannels;
            RemoveDefaultNodePool = removeDefaultNodePool;
            ResourceLabels = resourceLabels;
            ResourceUsageExportConfigs = resourceUsageExportConfigs;
            SecretManagerConfigs = secretManagerConfigs;
            SecurityPostureConfigs = securityPostureConfigs;
            SelfLink = selfLink;
            ServiceExternalIpsConfigs = serviceExternalIpsConfigs;
            ServicesIpv4Cidr = servicesIpv4Cidr;
            Subnetwork = subnetwork;
            TpuConfigs = tpuConfigs;
            TpuIpv4CidrBlock = tpuIpv4CidrBlock;
            UserManagedKeysConfigs = userManagedKeysConfigs;
            VerticalPodAutoscalings = verticalPodAutoscalings;
            WorkloadAltsConfigs = workloadAltsConfigs;
            WorkloadIdentityConfigs = workloadIdentityConfigs;
        }
    }
}
