// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiDeploymentResourcePoolDedicatedResourcesMachineSpec
    {
        /// <summary>
        /// The number of accelerators to attach to the machine.
        /// </summary>
        public readonly int? AcceleratorCount;
        /// <summary>
        /// The type of accelerator(s) that may be attached to the machine as per accelerator_count. See possible values [here](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/MachineSpec#AcceleratorType).
        /// </summary>
        public readonly string? AcceleratorType;
        /// <summary>
        /// The type of the machine. See the [list of machine types supported for prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types).
        /// </summary>
        public readonly string? MachineType;

        [OutputConstructor]
        private AiDeploymentResourcePoolDedicatedResourcesMachineSpec(
            int? acceleratorCount,

            string? acceleratorType,

            string? machineType)
        {
            AcceleratorCount = acceleratorCount;
            AcceleratorType = acceleratorType;
            MachineType = machineType;
        }
    }
}
