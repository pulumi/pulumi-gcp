// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PubSub.Inputs
{

    public sealed class TopicIngestionDataSourceSettingsAzureEventHubsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure event hub client ID to use for ingestion.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The Azure event hub to ingest data from.
        /// </summary>
        [Input("eventHub")]
        public Input<string>? EventHub { get; set; }

        /// <summary>
        /// The GCP service account to be used for Federated Identity authentication
        /// with Azure (via a `AssumeRoleWithWebIdentity` call for the provided
        /// role).
        /// </summary>
        [Input("gcpServiceAccount")]
        public Input<string>? GcpServiceAccount { get; set; }

        /// <summary>
        /// The Azure event hub namespace to ingest data from.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The name of the resource group within an Azure subscription.
        /// </summary>
        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        /// <summary>
        /// The Azure event hub subscription ID to use for ingestion.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        /// <summary>
        /// The Azure event hub tenant ID to use for ingestion.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public TopicIngestionDataSourceSettingsAzureEventHubsGetArgs()
        {
        }
        public static new TopicIngestionDataSourceSettingsAzureEventHubsGetArgs Empty => new TopicIngestionDataSourceSettingsAzureEventHubsGetArgs();
    }
}
