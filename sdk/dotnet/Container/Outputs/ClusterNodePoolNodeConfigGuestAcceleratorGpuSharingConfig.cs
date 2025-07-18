// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class ClusterNodePoolNodeConfigGuestAcceleratorGpuSharingConfig
    {
        /// <summary>
        /// The type of GPU sharing strategy to enable on the GPU node.
        /// Accepted values are:
        /// * `"TIME_SHARING"`: Allow multiple containers to have [time-shared](https://cloud.google.com/kubernetes-engine/docs/concepts/timesharing-gpus) access to a single GPU device.
        /// * `"MPS"`: Enable co-operative multi-process CUDA workloads to run concurrently on a single GPU device with [MPS](https://cloud.google.com/kubernetes-engine/docs/how-to/nvidia-mps-gpus)
        /// </summary>
        public readonly string GpuSharingStrategy;
        /// <summary>
        /// The maximum number of containers that can share a GPU.
        /// </summary>
        public readonly int MaxSharedClientsPerGpu;

        [OutputConstructor]
        private ClusterNodePoolNodeConfigGuestAcceleratorGpuSharingConfig(
            string gpuSharingStrategy,

            int maxSharedClientsPerGpu)
        {
            GpuSharingStrategy = gpuSharingStrategy;
            MaxSharedClientsPerGpu = maxSharedClientsPerGpu;
        }
    }
}
