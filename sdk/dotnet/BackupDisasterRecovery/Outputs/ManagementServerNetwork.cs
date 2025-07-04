// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BackupDisasterRecovery.Outputs
{

    [OutputType]
    public sealed class ManagementServerNetwork
    {
        /// <summary>
        /// Network with format `projects/{{project_id}}/global/networks/{{network_id}}`
        /// </summary>
        public readonly string Network;
        /// <summary>
        /// Type of Network peeringMode
        /// Default value is `PRIVATE_SERVICE_ACCESS`.
        /// Possible values are: `PRIVATE_SERVICE_ACCESS`.
        /// </summary>
        public readonly string? PeeringMode;

        [OutputConstructor]
        private ManagementServerNetwork(
            string network,

            string? peeringMode)
        {
            Network = network;
            PeeringMode = peeringMode;
        }
    }
}
