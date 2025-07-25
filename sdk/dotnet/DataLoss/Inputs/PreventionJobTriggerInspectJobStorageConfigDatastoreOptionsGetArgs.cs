// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A representation of a Datastore kind.
        /// Structure is documented below.
        /// </summary>
        [Input("kind", required: true)]
        public Input<Inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs> Kind { get; set; } = null!;

        /// <summary>
        /// Datastore partition ID. A partition ID identifies a grouping of entities. The grouping
        /// is always by project and namespace, however the namespace ID may be empty.
        /// Structure is documented below.
        /// </summary>
        [Input("partitionId", required: true)]
        public Input<Inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs> PartitionId { get; set; } = null!;

        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs Empty => new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs();
    }
}
