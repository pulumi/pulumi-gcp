// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNotificationConfigPubsubArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not the notification config is enabled
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Choose what type of notifications you want to receive. If no filters are applied, you'll receive all notification types. Structure is documented below.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.ClusterNotificationConfigPubsubFilterArgs>? Filter { get; set; }

        /// <summary>
        /// The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
        /// </summary>
        [Input("topic")]
        public Input<string>? Topic { get; set; }

        public ClusterNotificationConfigPubsubArgs()
        {
        }
        public static new ClusterNotificationConfigPubsubArgs Empty => new ClusterNotificationConfigPubsubArgs();
    }
}
