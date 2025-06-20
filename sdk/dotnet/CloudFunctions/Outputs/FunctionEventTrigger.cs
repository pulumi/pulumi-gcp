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
    public sealed class FunctionEventTrigger
    {
        /// <summary>
        /// The type of event to observe. For example: `"google.storage.object.finalize"`.
        /// See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
        /// full reference of accepted triggers.
        /// </summary>
        public readonly string EventType;
        /// <summary>
        /// Specifies policy for failed executions. Structure is documented below.
        /// </summary>
        public readonly Outputs.FunctionEventTriggerFailurePolicy? FailurePolicy;
        /// <summary>
        /// Required. The name or partial URI of the resource from
        /// which to observe events. For example, `"myBucket"` or `"projects/my-project/topics/my-topic"`
        /// </summary>
        public readonly string Resource;

        [OutputConstructor]
        private FunctionEventTrigger(
            string eventType,

            Outputs.FunctionEventTriggerFailurePolicy? failurePolicy,

            string resource)
        {
            EventType = eventType;
            FailurePolicy = failurePolicy;
            Resource = resource;
        }
    }
}
