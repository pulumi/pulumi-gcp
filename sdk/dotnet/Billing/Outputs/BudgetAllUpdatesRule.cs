// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Billing.Outputs
{

    [OutputType]
    public sealed class BudgetAllUpdatesRule
    {
        /// <summary>
        /// Boolean. When set to true, disables default notifications sent
        /// when a threshold is exceeded. Default recipients are
        /// those with Billing Account Administrators and Billing
        /// Account Users IAM roles for the target account.
        /// </summary>
        public readonly bool? DisableDefaultIamRecipients;
        /// <summary>
        /// When set to true, and when the budget has a single project configured,
        /// notifications will be sent to project level recipients of that project.
        /// This field will be ignored if the budget has multiple or no project configured.
        /// Currently, project level recipients are the users with Owner role on a cloud project.
        /// </summary>
        public readonly bool? EnableProjectLevelRecipients;
        /// <summary>
        /// The full resource name of a monitoring notification
        /// channel in the form
        /// projects/{project_id}/notificationChannels/{channel_id}.
        /// A maximum of 5 channels are allowed.
        /// </summary>
        public readonly ImmutableArray<string> MonitoringNotificationChannels;
        /// <summary>
        /// The name of the Cloud Pub/Sub topic where budget related
        /// messages will be published, in the form
        /// projects/{project_id}/topics/{topic_id}. Updates are sent
        /// at regular intervals to the topic.
        /// </summary>
        public readonly string? PubsubTopic;
        /// <summary>
        /// The schema version of the notification. Only "1.0" is
        /// accepted. It represents the JSON schema as defined in
        /// https://cloud.google.com/billing/docs/how-to/budgets#notification_format.
        /// </summary>
        public readonly string? SchemaVersion;

        [OutputConstructor]
        private BudgetAllUpdatesRule(
            bool? disableDefaultIamRecipients,

            bool? enableProjectLevelRecipients,

            ImmutableArray<string> monitoringNotificationChannels,

            string? pubsubTopic,

            string? schemaVersion)
        {
            DisableDefaultIamRecipients = disableDefaultIamRecipients;
            EnableProjectLevelRecipients = enableProjectLevelRecipients;
            MonitoringNotificationChannels = monitoringNotificationChannels;
            PubsubTopic = pubsubTopic;
            SchemaVersion = schemaVersion;
        }
    }
}
