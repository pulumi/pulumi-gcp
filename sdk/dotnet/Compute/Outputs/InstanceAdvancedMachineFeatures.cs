// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class InstanceAdvancedMachineFeatures
    {
        /// <summary>
        /// Defines whether the instance should have nested virtualization  enabled. Defaults to false.
        /// </summary>
        public readonly bool? EnableNestedVirtualization;
        /// <summary>
        /// Whether to enable UEFI networking for instance creation.
        /// </summary>
        public readonly bool? EnableUefiNetworking;
        /// <summary>
        /// [The PMU](https://cloud.google.com/compute/docs/pmu-overview) is a hardware component within the CPU core that monitors how the processor runs code. Valid values for the level of PMU are `STANDARD`, `ENHANCED`, and `ARCHITECTURAL`.
        /// </summary>
        public readonly string? PerformanceMonitoringUnit;
        /// <summary>
        /// The number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
        /// </summary>
        public readonly int? ThreadsPerCore;
        /// <summary>
        /// Turbo frequency mode to use for the instance. Supported modes are currently either `ALL_CORE_MAX` or unset (default).
        /// </summary>
        public readonly string? TurboMode;
        /// <summary>
        /// The number of physical cores to expose to an instance. [visible cores info (VC)](https://cloud.google.com/compute/docs/instances/customize-visible-cores).
        /// </summary>
        public readonly int? VisibleCoreCount;

        [OutputConstructor]
        private InstanceAdvancedMachineFeatures(
            bool? enableNestedVirtualization,

            bool? enableUefiNetworking,

            string? performanceMonitoringUnit,

            int? threadsPerCore,

            string? turboMode,

            int? visibleCoreCount)
        {
            EnableNestedVirtualization = enableNestedVirtualization;
            EnableUefiNetworking = enableUefiNetworking;
            PerformanceMonitoringUnit = performanceMonitoringUnit;
            ThreadsPerCore = threadsPerCore;
            TurboMode = turboMode;
            VisibleCoreCount = visibleCoreCount;
        }
    }
}
