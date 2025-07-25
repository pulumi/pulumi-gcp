// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("daysOfWeeks")]
        private InputList<string>? _daysOfWeeks;

        /// <summary>
        /// Optional. Days of week. If left empty, all days of the week will be included.
        /// Each value may be one of: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        /// </summary>
        public InputList<string> DaysOfWeeks
        {
            get => _daysOfWeeks ?? (_daysOfWeeks = new InputList<string>());
            set => _daysOfWeeks = value;
        }

        /// <summary>
        /// Optional. End time (exclusive). Use 24:00 to indicate midnight. If you specify endTime you must also specify startTime. If left empty, this will block for the entire day for the days specified in daysOfWeek.
        /// Structure is documented below.
        /// </summary>
        [Input("endTime")]
        public Input<Inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowEndTimeGetArgs>? EndTime { get; set; }

        /// <summary>
        /// Optional. Start time (inclusive). Use 00:00 for the beginning of the day. If you specify startTime you must also specify endTime. If left empty, this will block for the entire day for the days specified in daysOfWeek.
        /// Structure is documented below.
        /// </summary>
        [Input("startTime")]
        public Input<Inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowStartTimeGetArgs>? StartTime { get; set; }

        public DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowGetArgs()
        {
        }
        public static new DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowGetArgs Empty => new DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowGetArgs();
    }
}
