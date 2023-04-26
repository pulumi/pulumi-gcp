// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("identifyingFields")]
        private InputList<Inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsIdentifyingFieldArgs>? _identifyingFields;

        /// <summary>
        /// The columns that are the primary keys for table objects included in ContentItem. A copy of this
        /// cell's value will stored alongside alongside each finding so that the finding can be traced to
        /// the specific row it came from. No more than 3 may be provided.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsIdentifyingFieldArgs> IdentifyingFields
        {
            get => _identifyingFields ?? (_identifyingFields = new InputList<Inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsIdentifyingFieldArgs>());
            set => _identifyingFields = value;
        }

        public PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs Empty => new PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs();
    }
}