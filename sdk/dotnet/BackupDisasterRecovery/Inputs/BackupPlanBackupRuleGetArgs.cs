// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BackupDisasterRecovery.Inputs
{

    public sealed class BackupPlanBackupRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures the duration for which backup data will be kept. The value should be greater than or equal to minimum enforced retention of the backup vault.
        /// </summary>
        [Input("backupRetentionDays", required: true)]
        public Input<int> BackupRetentionDays { get; set; } = null!;

        /// <summary>
        /// The unique ID of this `BackupRule`. The `rule_id` is unique per `BackupPlan`.
        /// </summary>
        [Input("ruleId", required: true)]
        public Input<string> RuleId { get; set; } = null!;

        /// <summary>
        /// StandardSchedule defines a schedule that runs within the confines of a defined window of days.
        /// Structure is documented below.
        /// </summary>
        [Input("standardSchedule", required: true)]
        public Input<Inputs.BackupPlanBackupRuleStandardScheduleGetArgs> StandardSchedule { get; set; } = null!;

        public BackupPlanBackupRuleGetArgs()
        {
        }
        public static new BackupPlanBackupRuleGetArgs Empty => new BackupPlanBackupRuleGetArgs();
    }
}
