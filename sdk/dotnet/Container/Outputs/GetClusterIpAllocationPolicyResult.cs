// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class GetClusterIpAllocationPolicyResult
    {
        /// <summary>
        /// AdditionalPodRangesConfig is the configuration for additional pod secondary ranges supporting the ClusterUpdate message.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterIpAllocationPolicyAdditionalPodRangesConfigResult> AdditionalPodRangesConfigs;
        /// <summary>
        /// The IP address range for the cluster pod IPs. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to pick a specific range to use.
        /// </summary>
        public readonly string ClusterIpv4CidrBlock;
        /// <summary>
        /// The name of the existing secondary range in the cluster's subnetwork to use for pod IP addresses. Alternatively, cluster_ipv4_cidr_block can be used to automatically create a GKE-managed one.
        /// </summary>
        public readonly string ClusterSecondaryRangeName;
        /// <summary>
        /// Configuration for cluster level pod cidr overprovision. Default is disabled=false.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterIpAllocationPolicyPodCidrOverprovisionConfigResult> PodCidrOverprovisionConfigs;
        /// <summary>
        /// The IP address range of the services IPs in this cluster. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) from the RFC-1918 private networks (e.g. 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16) to pick a specific range to use.
        /// </summary>
        public readonly string ServicesIpv4CidrBlock;
        /// <summary>
        /// The name of the existing secondary range in the cluster's subnetwork to use for service ClusterIPs. Alternatively, services_ipv4_cidr_block can be used to automatically create a GKE-managed one.
        /// </summary>
        public readonly string ServicesSecondaryRangeName;
        /// <summary>
        /// The IP Stack type of the cluster. Choose between IPV4 and IPV4_IPV6. Default type is IPV4 Only if not set
        /// </summary>
        public readonly string StackType;

        [OutputConstructor]
        private GetClusterIpAllocationPolicyResult(
            ImmutableArray<Outputs.GetClusterIpAllocationPolicyAdditionalPodRangesConfigResult> additionalPodRangesConfigs,

            string clusterIpv4CidrBlock,

            string clusterSecondaryRangeName,

            ImmutableArray<Outputs.GetClusterIpAllocationPolicyPodCidrOverprovisionConfigResult> podCidrOverprovisionConfigs,

            string servicesIpv4CidrBlock,

            string servicesSecondaryRangeName,

            string stackType)
        {
            AdditionalPodRangesConfigs = additionalPodRangesConfigs;
            ClusterIpv4CidrBlock = clusterIpv4CidrBlock;
            ClusterSecondaryRangeName = clusterSecondaryRangeName;
            PodCidrOverprovisionConfigs = podCidrOverprovisionConfigs;
            ServicesIpv4CidrBlock = servicesIpv4CidrBlock;
            ServicesSecondaryRangeName = servicesSecondaryRangeName;
            StackType = stackType;
        }
    }
}
