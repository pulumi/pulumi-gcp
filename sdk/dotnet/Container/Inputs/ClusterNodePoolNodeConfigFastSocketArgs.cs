// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolNodeConfigFastSocketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not the NCCL Fast Socket is enabled
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public ClusterNodePoolNodeConfigFastSocketArgs()
        {
        }
        public static new ClusterNodePoolNodeConfigFastSocketArgs Empty => new ClusterNodePoolNodeConfigFastSocketArgs();
    }
}
