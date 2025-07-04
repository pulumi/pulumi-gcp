// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class MetastoreServiceScalingConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Represents the autoscaling configuration of a metastore service.
        /// Structure is documented below.
        /// </summary>
        [Input("autoscalingConfig")]
        public Input<Inputs.MetastoreServiceScalingConfigAutoscalingConfigGetArgs>? AutoscalingConfig { get; set; }

        /// <summary>
        /// Metastore instance sizes.
        /// Possible values are: `EXTRA_SMALL`, `SMALL`, `MEDIUM`, `LARGE`, `EXTRA_LARGE`.
        /// </summary>
        [Input("instanceSize")]
        public Input<string>? InstanceSize { get; set; }

        /// <summary>
        /// Scaling factor, in increments of 0.1 for values less than 1.0, and increments of 1.0 for values greater than 1.0.
        /// </summary>
        [Input("scalingFactor")]
        public Input<double>? ScalingFactor { get; set; }

        public MetastoreServiceScalingConfigGetArgs()
        {
        }
        public static new MetastoreServiceScalingConfigGetArgs Empty => new MetastoreServiceScalingConfigGetArgs();
    }
}
