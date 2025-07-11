// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneArgs : global::Pulumi.ResourceArgs
    {
        [Input("attachments")]
        private InputList<string>? _attachments;

        /// <summary>
        /// (Output)
        /// URLs of Attachments in the given zone, to the given
        /// region, on Interconnects in the given facility and metro. Every
        /// Attachment in the AG has such an entry.
        /// </summary>
        public InputList<string> Attachments
        {
            get => _attachments ?? (_attachments = new InputList<string>());
            set => _attachments = value;
        }

        /// <summary>
        /// (Output)
        /// The zones that Attachments in this group are present
        /// in, in the given facilities.  This is inherited from their
        /// Interconnects.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneArgs()
        {
        }
        public static new InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneArgs Empty => new InterconnectAttachmentGroupLogicalStructureRegionMetroFacilityZoneArgs();
    }
}
