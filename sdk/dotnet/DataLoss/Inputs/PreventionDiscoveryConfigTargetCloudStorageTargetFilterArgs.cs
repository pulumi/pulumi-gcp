// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bucket to scan. Targets including this can only include one target (the target with this bucket). This enables profiling the contents of a single bucket, while the other options allow for easy profiling of many buckets within a project or an organization.
        /// Structure is documented below.
        /// </summary>
        [Input("cloudStorageResourceReference")]
        public Input<Inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCloudStorageResourceReferenceArgs>? CloudStorageResourceReference { get; set; }

        /// <summary>
        /// A specific set of buckets for this filter to apply to.
        /// Structure is documented below.
        /// </summary>
        [Input("collection")]
        public Input<Inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionArgs>? Collection { get; set; }

        /// <summary>
        /// Match discovery resources not covered by any other filter.
        /// </summary>
        [Input("others")]
        public Input<Inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterOthersArgs>? Others { get; set; }

        public PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs()
        {
        }
        public static new PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs Empty => new PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs();
    }
}
