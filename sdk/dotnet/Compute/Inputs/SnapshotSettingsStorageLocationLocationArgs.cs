// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class SnapshotSettingsStorageLocationLocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier for this object. Format specified above.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Name of the location. It should be one of the Cloud Storage buckets.
        /// Only one location can be specified. (should match location)
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public SnapshotSettingsStorageLocationLocationArgs()
        {
        }
        public static new SnapshotSettingsStorageLocationLocationArgs Empty => new SnapshotSettingsStorageLocationLocationArgs();
    }
}
