// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class ReservationAutoscaleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The slot capacity added to this reservation when autoscale happens. Will be between [0, max_slots].
        /// </summary>
        [Input("currentSlots")]
        public Input<int>? CurrentSlots { get; set; }

        /// <summary>
        /// Number of slots to be scaled when needed.
        /// </summary>
        [Input("maxSlots")]
        public Input<int>? MaxSlots { get; set; }

        public ReservationAutoscaleGetArgs()
        {
        }
        public static new ReservationAutoscaleGetArgs Empty => new ReservationAutoscaleGetArgs();
    }
}