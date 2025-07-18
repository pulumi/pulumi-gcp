// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Outputs
{

    [OutputType]
    public sealed class DnsZonePeeringConfig
    {
        /// <summary>
        /// The name of the producer VPC network.
        /// </summary>
        public readonly string TargetNetworkId;
        /// <summary>
        /// The ID of the project that contains the producer VPC network.
        /// </summary>
        public readonly string TargetProjectId;

        [OutputConstructor]
        private DnsZonePeeringConfig(
            string targetNetworkId,

            string targetProjectId)
        {
            TargetNetworkId = targetNetworkId;
            TargetProjectId = targetProjectId;
        }
    }
}
