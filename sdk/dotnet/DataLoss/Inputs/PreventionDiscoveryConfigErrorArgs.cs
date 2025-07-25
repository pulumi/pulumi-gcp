// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigErrorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list of messages that carry the error details.
        /// </summary>
        [Input("details")]
        public Input<Inputs.PreventionDiscoveryConfigErrorDetailsArgs>? Details { get; set; }

        /// <summary>
        /// The times the error occurred. List includes the oldest timestamp and the last 9 timestamps.
        /// </summary>
        [Input("timestamp")]
        public Input<string>? Timestamp { get; set; }

        public PreventionDiscoveryConfigErrorArgs()
        {
        }
        public static new PreventionDiscoveryConfigErrorArgs Empty => new PreventionDiscoveryConfigErrorArgs();
    }
}
