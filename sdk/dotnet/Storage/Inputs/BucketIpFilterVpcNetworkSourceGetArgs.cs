// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class BucketIpFilterVpcNetworkSourceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedIpCidrRanges", required: true)]
        private InputList<string>? _allowedIpCidrRanges;

        /// <summary>
        /// The list of public or private IPv4 and IPv6 CIDR ranges that can access the bucket.
        /// </summary>
        public InputList<string> AllowedIpCidrRanges
        {
            get => _allowedIpCidrRanges ?? (_allowedIpCidrRanges = new InputList<string>());
            set => _allowedIpCidrRanges = value;
        }

        /// <summary>
        /// Name of the network. Format: `projects/PROJECT_ID/global/networks/NETWORK_NAME`
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        public BucketIpFilterVpcNetworkSourceGetArgs()
        {
        }
        public static new BucketIpFilterVpcNetworkSourceGetArgs Empty => new BucketIpFilterVpcNetworkSourceGetArgs();
    }
}
