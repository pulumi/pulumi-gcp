// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class ServiceScalingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Total instance count for the service in manual scaling mode. This number of instances is divided among all revisions with specified traffic based on the percent of traffic they are receiving.
        /// </summary>
        [Input("manualInstanceCount")]
        public Input<int>? ManualInstanceCount { get; set; }

        /// <summary>
        /// Minimum number of instances for the service, to be divided among all revisions receiving traffic.
        /// </summary>
        [Input("minInstanceCount")]
        public Input<int>? MinInstanceCount { get; set; }

        /// <summary>
        /// The [scaling mode](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services#scalingmode) for the service.
        /// Possible values are: `AUTOMATIC`, `MANUAL`.
        /// </summary>
        [Input("scalingMode")]
        public Input<string>? ScalingMode { get; set; }

        public ServiceScalingArgs()
        {
        }
        public static new ServiceScalingArgs Empty => new ServiceScalingArgs();
    }
}
