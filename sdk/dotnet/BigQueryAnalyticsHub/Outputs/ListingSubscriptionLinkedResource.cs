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
    public sealed class ListingSubscriptionLinkedResource
    {
        /// <summary>
        /// (Output)
        /// Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        /// </summary>
        public readonly string? LinkedDataset;
        /// <summary>
        /// (Output)
        /// Output only. Listing for which linked resource is created.
        /// </summary>
        public readonly string? Listing;

        [OutputConstructor]
        private ListingSubscriptionLinkedResource(
            string? linkedDataset,

            string? listing)
        {
            LinkedDataset = linkedDataset;
            Listing = listing;
        }
    }
}
