// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class WireGroupWireWireProperty
    {
        /// <summary>
        /// The unmetered bandwidth setting.
        /// </summary>
        public readonly int? BandwidthUnmetered;
        /// <summary>
        /// Response when a fault is detected in a pseudowire:
        /// NONE: default.
        /// DISABLE_PORT: set the port line protocol down when inline probes detect a fault. This setting is only permitted on port mode pseudowires.
        /// </summary>
        public readonly string? FaultResponse;

        [OutputConstructor]
        private WireGroupWireWireProperty(
            int? bandwidthUnmetered,

            string? faultResponse)
        {
            BandwidthUnmetered = bandwidthUnmetered;
            FaultResponse = faultResponse;
        }
    }
}
