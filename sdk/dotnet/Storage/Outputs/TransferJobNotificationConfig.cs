// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class TransferJobNotificationConfig
    {
        /// <summary>
        /// Event types for which a notification is desired. If empty, send notifications for all event types. The valid types are "TRANSFER_OPERATION_SUCCESS", "TRANSFER_OPERATION_FAILED", "TRANSFER_OPERATION_ABORTED".
        /// </summary>
        public readonly ImmutableArray<string> EventTypes;
        /// <summary>
        /// The desired format of the notification message payloads. One of "NONE" or "JSON".
        /// </summary>
        public readonly string PayloadFormat;
        /// <summary>
        /// The Topic.name of the Pub/Sub topic to which to publish notifications. Must be of the format: projects/{project}/topics/{topic}. Not matching this format results in an INVALID_ARGUMENT error.
        /// </summary>
        public readonly string PubsubTopic;

        [OutputConstructor]
        private TransferJobNotificationConfig(
            ImmutableArray<string> eventTypes,

            string payloadFormat,

            string pubsubTopic)
        {
            EventTypes = eventTypes;
            PayloadFormat = payloadFormat;
            PubsubTopic = pubsubTopic;
        }
    }
}
