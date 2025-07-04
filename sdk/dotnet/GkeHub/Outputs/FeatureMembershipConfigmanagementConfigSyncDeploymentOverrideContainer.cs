// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainer
    {
        /// <summary>
        /// The name of the container.
        /// </summary>
        public readonly string? ContainerName;
        /// <summary>
        /// The CPU limit of the container.
        /// </summary>
        public readonly string? CpuLimit;
        /// <summary>
        /// The CPU request of the container.
        /// </summary>
        public readonly string? CpuRequest;
        /// <summary>
        /// The memory limit of the container.
        /// </summary>
        public readonly string? MemoryLimit;
        /// <summary>
        /// The memory request of the container.
        /// </summary>
        public readonly string? MemoryRequest;

        [OutputConstructor]
        private FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainer(
            string? containerName,

            string? cpuLimit,

            string? cpuRequest,

            string? memoryLimit,

            string? memoryRequest)
        {
            ContainerName = containerName;
            CpuLimit = cpuLimit;
            CpuRequest = cpuRequest;
            MemoryLimit = memoryLimit;
            MemoryRequest = memoryRequest;
        }
    }
}
