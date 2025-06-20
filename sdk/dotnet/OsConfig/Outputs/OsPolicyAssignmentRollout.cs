// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class OsPolicyAssignmentRollout
    {
        /// <summary>
        /// The maximum number (or percentage) of VMs
        /// per zone to disrupt at any given moment. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentRolloutDisruptionBudget DisruptionBudget;
        /// <summary>
        /// This determines the minimum duration of
        /// time to wait after the configuration changes are applied through the current
        /// rollout. A VM continues to count towards the `disruption_budget` at least
        /// until this duration of time has passed after configuration changes are
        /// applied.
        /// </summary>
        public readonly string MinWaitDuration;

        [OutputConstructor]
        private OsPolicyAssignmentRollout(
            Outputs.OsPolicyAssignmentRolloutDisruptionBudget disruptionBudget,

            string minWaitDuration)
        {
            DisruptionBudget = disruptionBudget;
            MinWaitDuration = minWaitDuration;
        }
    }
}
