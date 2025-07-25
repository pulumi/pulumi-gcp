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
    public sealed class NodePoolNodeConfigAdvancedMachineFeatures
    {
        /// <summary>
        /// Whether the node should have nested virtualization enabled.
        /// </summary>
        public readonly bool? EnableNestedVirtualization;
        /// <summary>
        /// Level of Performance Monitoring Unit (PMU) requested. If unset, no access to the PMU is assumed.
        /// </summary>
        public readonly string? PerformanceMonitoringUnit;
        /// <summary>
        /// The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
        /// </summary>
        public readonly int ThreadsPerCore;

        [OutputConstructor]
        private NodePoolNodeConfigAdvancedMachineFeatures(
            bool? enableNestedVirtualization,

            string? performanceMonitoringUnit,

            int threadsPerCore)
        {
            EnableNestedVirtualization = enableNestedVirtualization;
            PerformanceMonitoringUnit = performanceMonitoringUnit;
            ThreadsPerCore = threadsPerCore;
        }
    }
}
