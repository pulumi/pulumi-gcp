// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamDestinationConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration for how data should be loaded to Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        [Input("bigqueryDestinationConfig")]
        public Input<Inputs.StreamDestinationConfigBigqueryDestinationConfigArgs>? BigqueryDestinationConfig { get; set; }

        /// <summary>
        /// Destination connection profile resource. Format: projects/{project}/locations/{location}/connectionProfiles/{name}
        /// </summary>
        [Input("destinationConnectionProfile", required: true)]
        public Input<string> DestinationConnectionProfile { get; set; } = null!;

        /// <summary>
        /// A configuration for how data should be loaded to Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        [Input("gcsDestinationConfig")]
        public Input<Inputs.StreamDestinationConfigGcsDestinationConfigArgs>? GcsDestinationConfig { get; set; }

        public StreamDestinationConfigArgs()
        {
        }
        public static new StreamDestinationConfigArgs Empty => new StreamDestinationConfigArgs();
    }
}