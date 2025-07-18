// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudFunctions.Outputs
{

    [OutputType]
    public sealed class GetFunctionEventTriggerResult
    {
        /// <summary>
        /// The type of event to observe. For example: `"google.storage.object.finalize"`.
        /// See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/)
        /// for a full reference of accepted triggers.
        /// </summary>
        public readonly string EventType;
        /// <summary>
        /// Policy for failed executions. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFunctionEventTriggerFailurePolicyResult> FailurePolicies;
        /// <summary>
        /// The name of the resource whose events are being observed, for example, `"myBucket"`
        /// </summary>
        public readonly string Resource;

        [OutputConstructor]
        private GetFunctionEventTriggerResult(
            string eventType,

            ImmutableArray<Outputs.GetFunctionEventTriggerFailurePolicyResult> failurePolicies,

            string resource)
        {
            EventType = eventType;
            FailurePolicies = failurePolicies;
            Resource = resource;
        }
    }
}
