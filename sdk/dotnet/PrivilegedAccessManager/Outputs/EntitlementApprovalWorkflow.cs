// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PrivilegedAccessManager.Outputs
{

    [OutputType]
    public sealed class EntitlementApprovalWorkflow
    {
        /// <summary>
        /// A manual approval workflow where users who are designated as approvers need to call the ApproveGrant/DenyGrant APIs for an Grant.
        /// The workflow can consist of multiple serial steps where each step defines who can act as Approver in that step and how many of those users should approve before the workflow moves to the next step.
        /// This can be used to create approval workflows such as
        /// * Require an approval from any user in a group G.
        /// * Require an approval from any k number of users from a Group G.
        /// * Require an approval from any user in a group G and then from a user U. etc.
        /// A single user might be part of `approvers` ACL for multiple steps in this workflow but they can only approve once and that approval will only be considered to satisfy the approval step at which it was granted.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.EntitlementApprovalWorkflowManualApprovals ManualApprovals;

        [OutputConstructor]
        private EntitlementApprovalWorkflow(Outputs.EntitlementApprovalWorkflowManualApprovals manualApprovals)
        {
            ManualApprovals = manualApprovals;
        }
    }
}
