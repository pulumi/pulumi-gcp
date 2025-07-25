// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InterconnectGroupIntentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The reliability the user intends this group to be capable of, in terms
        /// of the Interconnect product SLAs.
        /// Possible values are: `PRODUCTION_NON_CRITICAL`, `PRODUCTION_CRITICAL`, `NO_SLA`, `AVAILABILITY_SLA_UNSPECIFIED`.
        /// </summary>
        [Input("topologyCapability")]
        public Input<string>? TopologyCapability { get; set; }

        public InterconnectGroupIntentArgs()
        {
        }
        public static new InterconnectGroupIntentArgs Empty => new InterconnectGroupIntentArgs();
    }
}
