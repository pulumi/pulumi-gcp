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
    public sealed class InterconnectGroupPhysicalStructureMetroFacilityZone
    {
        /// <summary>
        /// Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
        /// strings. Users are encouraged, but not required, to use their preferred
        /// format for resource links as keys.
        /// Note that there are add-members and remove-members methods in gcloud.
        /// The size of this map is limited by an "Interconnects per group" quota.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<string> Interconnects;
        /// <summary>
        /// (Output)
        /// The name of the zone, either "zone1" or "zone2".
        /// This is the second component of the location of Interconnects in
        /// this facility.
        /// </summary>
        public readonly string? Zone;

        [OutputConstructor]
        private InterconnectGroupPhysicalStructureMetroFacilityZone(
            ImmutableArray<string> interconnects,

            string? zone)
        {
            Interconnects = interconnects;
            Zone = zone;
        }
    }
}
