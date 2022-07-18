// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigTable.Inputs
{

    public sealed class InstanceClusterAutoscalingConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CPU utilization target in percentage. Must be between 10 and 80.
        /// </summary>
        [Input("cpuTarget", required: true)]
        public Input<int> CpuTarget { get; set; } = null!;

        /// <summary>
        /// The maximum number of nodes for autoscaling.
        /// </summary>
        [Input("maxNodes", required: true)]
        public Input<int> MaxNodes { get; set; } = null!;

        /// <summary>
        /// The minimum number of nodes for autoscaling.
        /// </summary>
        [Input("minNodes", required: true)]
        public Input<int> MinNodes { get; set; } = null!;

        public InstanceClusterAutoscalingConfigArgs()
        {
        }
    }
}