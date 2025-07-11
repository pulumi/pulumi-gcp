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
    public sealed class GetResourcePolicyWorkloadPolicyResult
    {
        /// <summary>
        /// The accelerator topology. This field can be set only when the workload policy type is HIGH_THROUGHPUT
        /// and cannot be set if max topology distance is set.
        /// </summary>
        public readonly string AcceleratorTopology;
        /// <summary>
        /// The maximum topology distance. This field can be set only when the workload policy type is HIGH_THROUGHPUT
        /// and cannot be set if accelerator topology is set. Possible values: ["BLOCK", "CLUSTER", "SUBBLOCK"]
        /// </summary>
        public readonly string MaxTopologyDistance;
        /// <summary>
        /// The type of workload policy. Possible values: ["HIGH_AVAILABILITY", "HIGH_THROUGHPUT"]
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetResourcePolicyWorkloadPolicyResult(
            string acceleratorTopology,

            string maxTopologyDistance,

            string type)
        {
            AcceleratorTopology = acceleratorTopology;
            MaxTopologyDistance = maxTopologyDistance;
            Type = type;
        }
    }
}
