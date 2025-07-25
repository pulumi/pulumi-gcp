// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub.Inputs
{

    public sealed class ListingPubsubTopicGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataAffinityRegions")]
        private InputList<string>? _dataAffinityRegions;

        /// <summary>
        /// Region hint on where the data might be published. Data affinity regions are modifiable.
        /// See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
        /// </summary>
        public InputList<string> DataAffinityRegions
        {
            get => _dataAffinityRegions ?? (_dataAffinityRegions = new InputList<string>());
            set => _dataAffinityRegions = value;
        }

        /// <summary>
        /// Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
        /// </summary>
        [Input("topic", required: true)]
        public Input<string> Topic { get; set; } = null!;

        public ListingPubsubTopicGetArgs()
        {
        }
        public static new ListingPubsubTopicGetArgs Empty => new ListingPubsubTopicGetArgs();
    }
}
