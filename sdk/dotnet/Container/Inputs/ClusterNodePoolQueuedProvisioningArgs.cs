// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolQueuedProvisioningArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether nodes in this node pool are obtainable solely through the ProvisioningRequest API
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public ClusterNodePoolQueuedProvisioningArgs()
        {
        }
        public static new ClusterNodePoolQueuedProvisioningArgs Empty => new ClusterNodePoolQueuedProvisioningArgs();
    }
}
