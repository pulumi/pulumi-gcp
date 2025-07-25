// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PrivilegedAccessManager.Inputs
{

    public sealed class EntitlementApprovalWorkflowManualApprovalsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Do the approvers need to provide a justification for their actions?
        /// </summary>
        [Input("requireApproverJustification")]
        public Input<bool>? RequireApproverJustification { get; set; }

        [Input("steps", required: true)]
        private InputList<Inputs.EntitlementApprovalWorkflowManualApprovalsStepGetArgs>? _steps;

        /// <summary>
        /// List of approval steps in this workflow. These steps would be followed in the specified order sequentially.  1 step is supported for now.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.EntitlementApprovalWorkflowManualApprovalsStepGetArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.EntitlementApprovalWorkflowManualApprovalsStepGetArgs>());
            set => _steps = value;
        }

        public EntitlementApprovalWorkflowManualApprovalsGetArgs()
        {
        }
        public static new EntitlementApprovalWorkflowManualApprovalsGetArgs Empty => new EntitlementApprovalWorkflowManualApprovalsGetArgs();
    }
}
