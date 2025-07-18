// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class MetastoreServiceScalingConfigAutoscalingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines whether autoscaling is enabled. The default value is false.
        /// </summary>
        [Input("autoscalingEnabled")]
        public Input<bool>? AutoscalingEnabled { get; set; }

        /// <summary>
        /// (Output)
        /// Output only. The scaling factor of a service with autoscaling enabled.
        /// </summary>
        [Input("autoscalingFactor")]
        public Input<double>? AutoscalingFactor { get; set; }

        /// <summary>
        /// Represents the limit configuration of a metastore service.
        /// Structure is documented below.
        /// </summary>
        [Input("limitConfig")]
        public Input<Inputs.MetastoreServiceScalingConfigAutoscalingConfigLimitConfigArgs>? LimitConfig { get; set; }

        public MetastoreServiceScalingConfigAutoscalingConfigArgs()
        {
        }
        public static new MetastoreServiceScalingConfigAutoscalingConfigArgs Empty => new MetastoreServiceScalingConfigAutoscalingConfigArgs();
    }
}
