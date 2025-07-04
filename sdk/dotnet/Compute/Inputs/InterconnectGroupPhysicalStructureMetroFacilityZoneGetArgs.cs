// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InterconnectGroupPhysicalStructureMetroFacilityZoneGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("interconnects")]
        private InputList<string>? _interconnects;

        /// <summary>
        /// (Output)
        /// Interconnects used to explain this blocker in more
        /// detail.
        /// </summary>
        public InputList<string> Interconnects
        {
            get => _interconnects ?? (_interconnects = new InputList<string>());
            set => _interconnects = value;
        }

        /// <summary>
        /// (Output)
        /// The name of the zone, either "zone1" or "zone2".
        /// This is the second component of the location of Interconnects in
        /// this facility.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public InterconnectGroupPhysicalStructureMetroFacilityZoneGetArgs()
        {
        }
        public static new InterconnectGroupPhysicalStructureMetroFacilityZoneGetArgs Empty => new InterconnectGroupPhysicalStructureMetroFacilityZoneGetArgs();
    }
}
