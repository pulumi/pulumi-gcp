// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Inputs
{

    public sealed class V2VmSchedulingConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines whether the node is preemptible.
        /// </summary>
        [Input("preemptible")]
        public Input<bool>? Preemptible { get; set; }

        /// <summary>
        /// Whether the node is created under a reservation.
        /// </summary>
        [Input("reserved")]
        public Input<bool>? Reserved { get; set; }

        /// <summary>
        /// Optional. Defines whether the node is Spot VM.
        /// </summary>
        [Input("spot")]
        public Input<bool>? Spot { get; set; }

        public V2VmSchedulingConfigGetArgs()
        {
        }
        public static new V2VmSchedulingConfigGetArgs Empty => new V2VmSchedulingConfigGetArgs();
    }
}
