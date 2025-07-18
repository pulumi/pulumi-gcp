// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudScheduler.Inputs
{

    public sealed class JobPubsubTargetArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputMap<string>? _attributes;

        /// <summary>
        /// Attributes for PubsubMessage.
        /// Pubsub message must contain either non-empty data, or at least one attribute.
        /// </summary>
        public InputMap<string> Attributes
        {
            get => _attributes ?? (_attributes = new InputMap<string>());
            set => _attributes = value;
        }

        /// <summary>
        /// The message payload for PubsubMessage.
        /// Pubsub message must contain either non-empty data, or at least one attribute.
        /// A base64-encoded string.
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// The full resource name for the Cloud Pub/Sub topic to which
        /// messages will be published when a job is delivered. ~&gt;**NOTE:**
        /// The topic name must be in the same format as required by PubSub's
        /// PublishRequest.name, e.g. `projects/my-project/topics/my-topic`.
        /// </summary>
        [Input("topicName", required: true)]
        public Input<string> TopicName { get; set; } = null!;

        public JobPubsubTargetArgs()
        {
        }
        public static new JobPubsubTargetArgs Empty => new JobPubsubTargetArgs();
    }
}
