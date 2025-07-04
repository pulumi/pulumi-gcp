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
    public sealed class RegionSecurityPolicyDdosProtectionConfig
    {
        /// <summary>
        /// Google Cloud Armor offers the following options to help protect systems against DDoS attacks:
        /// - STANDARD: basic always-on protection for network load balancers, protocol forwarding, or VMs with public IP addresses.
        /// - ADVANCED: additional protections for Managed Protection Plus subscribers who use network load balancers, protocol forwarding, or VMs with public IP addresses.
        /// - ADVANCED_PREVIEW: flag to enable the security policy in preview mode.
        /// Possible values are: `ADVANCED`, `ADVANCED_PREVIEW`, `STANDARD`.
        /// </summary>
        public readonly string DdosProtection;

        [OutputConstructor]
        private RegionSecurityPolicyDdosProtectionConfig(string ddosProtection)
        {
            DdosProtection = ddosProtection;
        }
    }
}
