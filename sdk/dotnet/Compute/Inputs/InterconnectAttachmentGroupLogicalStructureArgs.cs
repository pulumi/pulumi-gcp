// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InterconnectAttachmentGroupLogicalStructureArgs : global::Pulumi.ResourceArgs
    {
        [Input("regions")]
        private InputList<Inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs>? _regions;

        /// <summary>
        /// (Output)
        /// Regions used to explain this blocker in more
        /// detail. These are region names formatted like "us-central1". This
        /// will be set for some blockers (like INCOMPATIBLE_REGIONS) but does
        /// not apply to others.
        /// </summary>
        public InputList<Inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs> Regions
        {
            get => _regions ?? (_regions = new InputList<Inputs.InterconnectAttachmentGroupLogicalStructureRegionArgs>());
            set => _regions = value;
        }

        public InterconnectAttachmentGroupLogicalStructureArgs()
        {
        }
        public static new InterconnectAttachmentGroupLogicalStructureArgs Empty => new InterconnectAttachmentGroupLogicalStructureArgs();
    }
}
