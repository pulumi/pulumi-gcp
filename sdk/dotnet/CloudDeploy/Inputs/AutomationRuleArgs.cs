// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class AutomationRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The `AdvanceRolloutRule` will automatically advance a successful Rollout.
        /// Structure is documented below.
        /// </summary>
        [Input("advanceRolloutRule")]
        public Input<Inputs.AutomationRuleAdvanceRolloutRuleArgs>? AdvanceRolloutRule { get; set; }

        /// <summary>
        /// Optional. `PromoteReleaseRule` will automatically promote a release from the current target to a specified target.
        /// Structure is documented below.
        /// </summary>
        [Input("promoteReleaseRule")]
        public Input<Inputs.AutomationRulePromoteReleaseRuleArgs>? PromoteReleaseRule { get; set; }

        /// <summary>
        /// Optional. The RepairRolloutRule will automatically repair a failed rollout.
        /// Structure is documented below.
        /// </summary>
        [Input("repairRolloutRule")]
        public Input<Inputs.AutomationRuleRepairRolloutRuleArgs>? RepairRolloutRule { get; set; }

        /// <summary>
        /// Optional. The `TimedPromoteReleaseRule` will automatically promote a release from the current target(s) to the specified target(s) on a configured schedule.
        /// Structure is documented below.
        /// </summary>
        [Input("timedPromoteReleaseRule")]
        public Input<Inputs.AutomationRuleTimedPromoteReleaseRuleArgs>? TimedPromoteReleaseRule { get; set; }

        public AutomationRuleArgs()
        {
        }
        public static new AutomationRuleArgs Empty => new AutomationRuleArgs();
    }
}
