// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class GetJobTerminalConditionResult
    {
        public readonly string ExecutionReason;
        public readonly string LastTransitionTime;
        public readonly string Message;
        public readonly string Reason;
        public readonly string RevisionReason;
        public readonly string Severity;
        public readonly string State;
        public readonly string Type;

        [OutputConstructor]
        private GetJobTerminalConditionResult(
            string executionReason,

            string lastTransitionTime,

            string message,

            string reason,

            string revisionReason,

            string severity,

            string state,

            string type)
        {
            ExecutionReason = executionReason;
            LastTransitionTime = lastTransitionTime;
            Message = message;
            Reason = reason;
            RevisionReason = revisionReason;
            Severity = severity;
            State = state;
            Type = type;
        }
    }
}