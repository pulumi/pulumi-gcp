// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class GetBucketIpFilterVpcNetworkSourceResult
    {
        /// <summary>
        /// The list of public or private IPv4 and IPv6 CIDR ranges that can access the bucket.
        /// </summary>
        public readonly ImmutableArray<string> AllowedIpCidrRanges;
        /// <summary>
        /// Name of the network. Format: projects/{PROJECT_ID}/global/networks/{NETWORK_NAME}
        /// </summary>
        public readonly string Network;

        [OutputConstructor]
        private GetBucketIpFilterVpcNetworkSourceResult(
            ImmutableArray<string> allowedIpCidrRanges,

            string network)
        {
            AllowedIpCidrRanges = allowedIpCidrRanges;
            Network = network;
        }
    }
}
