// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class TransferJobNotificationConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("eventTypes")]
        private InputList<string>? _eventTypes;

        /// <summary>
        /// Event types for which a notification is desired. If empty, send notifications for all event types. The valid types are "TRANSFER_OPERATION_SUCCESS", "TRANSFER_OPERATION_FAILED", "TRANSFER_OPERATION_ABORTED".
        /// </summary>
        public InputList<string> EventTypes
        {
            get => _eventTypes ?? (_eventTypes = new InputList<string>());
            set => _eventTypes = value;
        }

        /// <summary>
        /// The desired format of the notification message payloads. One of "NONE" or "JSON".
        /// </summary>
        [Input("payloadFormat", required: true)]
        public Input<string> PayloadFormat { get; set; } = null!;

        /// <summary>
        /// The Topic.name of the Pub/Sub topic to which to publish notifications. Must be of the format: projects/{project}/topics/{topic}. Not matching this format results in an INVALID_ARGUMENT error.
        /// </summary>
        [Input("pubsubTopic", required: true)]
        public Input<string> PubsubTopic { get; set; } = null!;

        public TransferJobNotificationConfigArgs()
        {
        }
        public static new TransferJobNotificationConfigArgs Empty => new TransferJobNotificationConfigArgs();
    }
}
