// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceFromMachineImageAdvancedMachineFeaturesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable nested virtualization or not.
        /// </summary>
        [Input("enableNestedVirtualization")]
        public Input<bool>? EnableNestedVirtualization { get; set; }

        /// <summary>
        /// Whether to enable UEFI networking for the instance.
        /// </summary>
        [Input("enableUefiNetworking")]
        public Input<bool>? EnableUefiNetworking { get; set; }

        /// <summary>
        /// The PMU is a hardware component within the CPU core that monitors how the processor runs code. Valid values for the level of PMU are "STANDARD", "ENHANCED", and "ARCHITECTURAL".
        /// </summary>
        [Input("performanceMonitoringUnit")]
        public Input<string>? PerformanceMonitoringUnit { get; set; }

        /// <summary>
        /// The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
        /// </summary>
        [Input("threadsPerCore")]
        public Input<int>? ThreadsPerCore { get; set; }

        /// <summary>
        /// Turbo frequency mode to use for the instance. Currently supported modes is "ALL_CORE_MAX".
        /// </summary>
        [Input("turboMode")]
        public Input<string>? TurboMode { get; set; }

        /// <summary>
        /// The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance\'s nominal CPU count and the underlying platform\'s SMT width.
        /// </summary>
        [Input("visibleCoreCount")]
        public Input<int>? VisibleCoreCount { get; set; }

        public InstanceFromMachineImageAdvancedMachineFeaturesArgs()
        {
        }
        public static new InstanceFromMachineImageAdvancedMachineFeaturesArgs Empty => new InstanceFromMachineImageAdvancedMachineFeaturesArgs();
    }
}
