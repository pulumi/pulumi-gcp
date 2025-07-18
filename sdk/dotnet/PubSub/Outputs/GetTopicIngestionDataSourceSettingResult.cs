// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PubSub.Outputs
{

    [OutputType]
    public sealed class GetTopicIngestionDataSourceSettingResult
    {
        /// <summary>
        /// Settings for ingestion from Amazon Kinesis Data Streams.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingAwsKineseResult> AwsKineses;
        /// <summary>
        /// Settings for ingestion from Amazon Managed Streaming for Apache Kafka.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingAwsMskResult> AwsMsks;
        /// <summary>
        /// Settings for ingestion from Azure Event Hubs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingAzureEventHubResult> AzureEventHubs;
        /// <summary>
        /// Settings for ingestion from Cloud Storage.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingCloudStorageResult> CloudStorages;
        /// <summary>
        /// Settings for ingestion from Confluent Cloud.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingConfluentCloudResult> ConfluentClouds;
        /// <summary>
        /// Settings for Platform Logs regarding ingestion to Pub/Sub. If unset,
        /// no Platform Logs will be generated.'
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingPlatformLogsSettingResult> PlatformLogsSettings;

        [OutputConstructor]
        private GetTopicIngestionDataSourceSettingResult(
            ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingAwsKineseResult> awsKineses,

            ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingAwsMskResult> awsMsks,

            ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingAzureEventHubResult> azureEventHubs,

            ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingCloudStorageResult> cloudStorages,

            ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingConfluentCloudResult> confluentClouds,

            ImmutableArray<Outputs.GetTopicIngestionDataSourceSettingPlatformLogsSettingResult> platformLogsSettings)
        {
            AwsKineses = awsKineses;
            AwsMsks = awsMsks;
            AzureEventHubs = azureEventHubs;
            CloudStorages = cloudStorages;
            ConfluentClouds = confluentClouds;
            PlatformLogsSettings = platformLogsSettings;
        }
    }
}
