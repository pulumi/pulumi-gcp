// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class AutomationRuleRepairRolloutRuleRepairPhaseRetryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Total number of retries. Retry is skipped if set to 0; The minimum value is 1, and the maximum value is 10.
        /// </summary>
        [Input("attempts", required: true)]
        public Input<string> Attempts { get; set; } = null!;

        /// <summary>
        /// Optional. The pattern of how wait time will be increased. Default is linear. Backoff mode will be ignored if wait is 0.
        /// Possible values are: `BACKOFF_MODE_UNSPECIFIED`, `BACKOFF_MODE_LINEAR`, `BACKOFF_MODE_EXPONENTIAL`.
        /// </summary>
        [Input("backoffMode")]
        public Input<string>? BackoffMode { get; set; }

        /// <summary>
        /// Optional. How long to wait for the first retry. Default is 0, and the maximum value is 14d. A duration in seconds with up to nine fractional digits, ending with 's'. Example: `3.5s`.
        /// </summary>
        [Input("wait")]
        public Input<string>? Wait { get; set; }

        public AutomationRuleRepairRolloutRuleRepairPhaseRetryArgs()
        {
        }
        public static new AutomationRuleRepairRolloutRuleRepairPhaseRetryArgs Empty => new AutomationRuleRepairRolloutRuleRepairPhaseRetryArgs();
    }
}
