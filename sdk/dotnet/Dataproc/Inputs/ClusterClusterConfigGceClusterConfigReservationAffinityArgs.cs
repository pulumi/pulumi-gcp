// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigGceClusterConfigReservationAffinityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Corresponds to the type of reservation consumption.
        /// </summary>
        [Input("consumeReservationType")]
        public Input<string>? ConsumeReservationType { get; set; }

        /// <summary>
        /// Corresponds to the label key of reservation resource.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// Corresponds to the label values of reservation resource.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public ClusterClusterConfigGceClusterConfigReservationAffinityArgs()
        {
        }
        public static new ClusterClusterConfigGceClusterConfigReservationAffinityArgs Empty => new ClusterClusterConfigGceClusterConfigReservationAffinityArgs();
    }
}