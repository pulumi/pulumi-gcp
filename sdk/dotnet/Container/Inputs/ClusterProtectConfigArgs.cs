// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterProtectConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ) WorkloadConfig defines which actions are enabled for a cluster's workload configurations. Structure is documented below
        /// </summary>
        [Input("workloadConfig")]
        public Input<Inputs.ClusterProtectConfigWorkloadConfigArgs>? WorkloadConfig { get; set; }

        /// <summary>
        /// ) Sets which mode to use for Protect workload vulnerability scanning feature. Accepted values are WORKLOAD_VULNERABILITY_MODE_UNSPECIFIED, DISABLED, BASIC.
        /// </summary>
        [Input("workloadVulnerabilityMode")]
        public Input<string>? WorkloadVulnerabilityMode { get; set; }

        public ClusterProtectConfigArgs()
        {
        }
        public static new ClusterProtectConfigArgs Empty => new ClusterProtectConfigArgs();
    }
}