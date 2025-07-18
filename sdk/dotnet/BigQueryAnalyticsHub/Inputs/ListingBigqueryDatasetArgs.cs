// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub.Inputs
{

    public sealed class ListingBigqueryDatasetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
        /// </summary>
        [Input("dataset", required: true)]
        public Input<string> Dataset { get; set; } = null!;

        [Input("selectedResources")]
        private InputList<Inputs.ListingBigqueryDatasetSelectedResourceArgs>? _selectedResources;

        /// <summary>
        /// Resource in this dataset that is selectively shared. This field is required for data clean room exchanges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ListingBigqueryDatasetSelectedResourceArgs> SelectedResources
        {
            get => _selectedResources ?? (_selectedResources = new InputList<Inputs.ListingBigqueryDatasetSelectedResourceArgs>());
            set => _selectedResources = value;
        }

        public ListingBigqueryDatasetArgs()
        {
        }
        public static new ListingBigqueryDatasetArgs Empty => new ListingBigqueryDatasetArgs();
    }
}
