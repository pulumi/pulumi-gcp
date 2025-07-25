// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class InstanceNetworkInterfaceIpv6AccessConfig
    {
        /// <summary>
        /// The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address, it must be unused and in the same region as the instance's zone. If not specified, Google Cloud will automatically assign an external IPv6 address from the instance's subnetwork.
        /// </summary>
        public readonly string? ExternalIpv6;
        /// <summary>
        /// The prefix length of the external IPv6 range.
        /// </summary>
        public readonly string? ExternalIpv6PrefixLength;
        /// <summary>
        /// A unique name for the resource, required by GCE.
        /// Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The service-level to be provided for IPv6 traffic when the subnet has an external subnet. Only PREMIUM tier is valid for IPv6
        /// </summary>
        public readonly string NetworkTier;
        /// <summary>
        /// The domain name to be used when creating DNSv6 records for the external IPv6 ranges.
        /// </summary>
        public readonly string? PublicPtrDomainName;
        /// <summary>
        /// A full or partial URL to a security policy to add to this instance. If this field is set to an empty string it will remove the associated security policy.
        /// </summary>
        public readonly string? SecurityPolicy;

        [OutputConstructor]
        private InstanceNetworkInterfaceIpv6AccessConfig(
            string? externalIpv6,

            string? externalIpv6PrefixLength,

            string? name,

            string networkTier,

            string? publicPtrDomainName,

            string? securityPolicy)
        {
            ExternalIpv6 = externalIpv6;
            ExternalIpv6PrefixLength = externalIpv6PrefixLength;
            Name = name;
            NetworkTier = networkTier;
            PublicPtrDomainName = publicPtrDomainName;
            SecurityPolicy = securityPolicy;
        }
    }
}
