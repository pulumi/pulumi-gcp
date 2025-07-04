// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class NodePoolNodeConfigLocalNvmeSsdBlockConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size.
        /// </summary>
        [Input("localSsdCount", required: true)]
        public Input<int> LocalSsdCount { get; set; } = null!;

        public NodePoolNodeConfigLocalNvmeSsdBlockConfigArgs()
        {
        }
        public static new NodePoolNodeConfigLocalNvmeSsdBlockConfigArgs Empty => new NodePoolNodeConfigLocalNvmeSsdBlockConfigArgs();
    }
}
