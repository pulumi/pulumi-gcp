// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class NodePoolNodeConfigGuestAcceleratorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of the accelerator cards exposed to an instance.
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        /// <summary>
        /// Configuration for auto installation of GPU driver.
        /// </summary>
        [Input("gpuDriverInstallationConfig")]
        public Input<Inputs.NodePoolNodeConfigGuestAcceleratorGpuDriverInstallationConfigGetArgs>? GpuDriverInstallationConfig { get; set; }

        /// <summary>
        /// Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning)
        /// </summary>
        [Input("gpuPartitionSize")]
        public Input<string>? GpuPartitionSize { get; set; }

        /// <summary>
        /// Configuration for GPU sharing.
        /// </summary>
        [Input("gpuSharingConfig")]
        public Input<Inputs.NodePoolNodeConfigGuestAcceleratorGpuSharingConfigGetArgs>? GpuSharingConfig { get; set; }

        /// <summary>
        /// The accelerator type resource name.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NodePoolNodeConfigGuestAcceleratorGetArgs()
        {
        }
        public static new NodePoolNodeConfigGuestAcceleratorGetArgs Empty => new NodePoolNodeConfigGuestAcceleratorGetArgs();
    }
}
