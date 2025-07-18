// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class TransferAgentPoolBandwidthLimitGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
        /// </summary>
        [Input("limitMbps", required: true)]
        public Input<string> LimitMbps { get; set; } = null!;

        public TransferAgentPoolBandwidthLimitGetArgs()
        {
        }
        public static new TransferAgentPoolBandwidthLimitGetArgs Empty => new TransferAgentPoolBandwidthLimitGetArgs();
    }
}
