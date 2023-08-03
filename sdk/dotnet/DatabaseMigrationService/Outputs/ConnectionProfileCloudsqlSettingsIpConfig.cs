// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Outputs
{

    [OutputType]
    public sealed class ConnectionProfileCloudsqlSettingsIpConfig
    {
        /// <summary>
        /// The list of external networks that are allowed to connect to the instance using the IP.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork> AuthorizedNetworks;
        /// <summary>
        /// Whether the instance should be assigned an IPv4 address or not.
        /// </summary>
        public readonly bool? EnableIpv4;
        /// <summary>
        /// The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, projects/myProject/global/networks/default.
        /// This setting can be updated, but it cannot be removed after it is set.
        /// </summary>
        public readonly string? PrivateNetwork;
        /// <summary>
        /// Whether SSL connections over IP should be enforced or not.
        /// </summary>
        public readonly bool? RequireSsl;

        [OutputConstructor]
        private ConnectionProfileCloudsqlSettingsIpConfig(
            ImmutableArray<Outputs.ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork> authorizedNetworks,

            bool? enableIpv4,

            string? privateNetwork,

            bool? requireSsl)
        {
            AuthorizedNetworks = authorizedNetworks;
            EnableIpv4 = enableIpv4;
            PrivateNetwork = privateNetwork;
            RequireSsl = requireSsl;
        }
    }
}