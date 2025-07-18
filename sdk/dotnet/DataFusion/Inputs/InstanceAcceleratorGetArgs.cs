// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataFusion.Inputs
{

    public sealed class InstanceAcceleratorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of an accelator for a CDF instance.
        /// Possible values are: `CDC`, `HEALTHCARE`, `CCAI_INSIGHTS`.
        /// </summary>
        [Input("acceleratorType", required: true)]
        public Input<string> AcceleratorType { get; set; } = null!;

        /// <summary>
        /// The type of an accelator for a CDF instance.
        /// Possible values are: `ENABLED`, `DISABLED`.
        /// </summary>
        [Input("state", required: true)]
        public Input<string> State { get; set; } = null!;

        public InstanceAcceleratorGetArgs()
        {
        }
        public static new InstanceAcceleratorGetArgs Empty => new InstanceAcceleratorGetArgs();
    }
}
