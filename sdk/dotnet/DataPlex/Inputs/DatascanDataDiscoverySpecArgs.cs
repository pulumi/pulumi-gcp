// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataDiscoverySpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for metadata publishing.
        /// Structure is documented below.
        /// </summary>
        [Input("bigqueryPublishingConfig")]
        public Input<Inputs.DatascanDataDiscoverySpecBigqueryPublishingConfigArgs>? BigqueryPublishingConfig { get; set; }

        /// <summary>
        /// Configurations related to Cloud Storage as the data source.
        /// Structure is documented below.
        /// </summary>
        [Input("storageConfig")]
        public Input<Inputs.DatascanDataDiscoverySpecStorageConfigArgs>? StorageConfig { get; set; }

        public DatascanDataDiscoverySpecArgs()
        {
        }
        public static new DatascanDataDiscoverySpecArgs Empty => new DatascanDataDiscoverySpecArgs();
    }
}
