// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigActionPubSubNotificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How much data to include in the pub/sub message.
        /// Possible values are: `TABLE_PROFILE`, `RESOURCE_NAME`.
        /// </summary>
        [Input("detailOfMessage")]
        public Input<string>? DetailOfMessage { get; set; }

        /// <summary>
        /// The type of event that triggers a Pub/Sub. At most one PubSubNotification per EventType is permitted.
        /// Possible values are: `NEW_PROFILE`, `CHANGED_PROFILE`, `SCORE_INCREASED`, `ERROR_CHANGED`.
        /// </summary>
        [Input("event")]
        public Input<string>? Event { get; set; }

        /// <summary>
        /// Conditions for triggering pubsub
        /// Structure is documented below.
        /// </summary>
        [Input("pubsubCondition")]
        public Input<Inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionArgs>? PubsubCondition { get; set; }

        /// <summary>
        /// Cloud Pub/Sub topic to send notifications to. Format is projects/{project}/topics/{topic}.
        /// </summary>
        [Input("topic")]
        public Input<string>? Topic { get; set; }

        public PreventionDiscoveryConfigActionPubSubNotificationArgs()
        {
        }
        public static new PreventionDiscoveryConfigActionPubSubNotificationArgs Empty => new PreventionDiscoveryConfigActionPubSubNotificationArgs();
    }
}
