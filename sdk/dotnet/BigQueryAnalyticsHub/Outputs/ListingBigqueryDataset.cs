// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub.Outputs
{

    [OutputType]
    public sealed class ListingBigqueryDataset
    {
        /// <summary>
        /// Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
        /// </summary>
        public readonly string Dataset;
        /// <summary>
        /// Resource in this dataset that is selectively shared. This field is required for data clean room exchanges.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ListingBigqueryDatasetSelectedResource> SelectedResources;

        [OutputConstructor]
        private ListingBigqueryDataset(
            string dataset,

            ImmutableArray<Outputs.ListingBigqueryDatasetSelectedResource> selectedResources)
        {
            Dataset = dataset;
            SelectedResources = selectedResources;
        }
    }
}
