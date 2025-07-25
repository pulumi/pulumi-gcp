// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class MetastoreServiceScalingConfigAutoscalingConfigLimitConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum scaling factor that the service will autoscale to. The default value is 6.0.
        /// </summary>
        [Input("maxScalingFactor")]
        public Input<double>? MaxScalingFactor { get; set; }

        /// <summary>
        /// The minimum scaling factor that the service will autoscale to. The default value is 0.1.
        /// </summary>
        [Input("minScalingFactor")]
        public Input<double>? MinScalingFactor { get; set; }

        public MetastoreServiceScalingConfigAutoscalingConfigLimitConfigGetArgs()
        {
        }
        public static new MetastoreServiceScalingConfigAutoscalingConfigLimitConfigGetArgs Empty => new MetastoreServiceScalingConfigAutoscalingConfigLimitConfigGetArgs();
    }
}
