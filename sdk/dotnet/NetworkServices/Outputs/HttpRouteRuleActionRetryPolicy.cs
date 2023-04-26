// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Outputs
{

    [OutputType]
    public sealed class HttpRouteRuleActionRetryPolicy
    {
        /// <summary>
        /// Specifies the allowed number of retries.
        /// </summary>
        public readonly int? NumRetries;
        /// <summary>
        /// Specifies a non-zero timeout per retry attempt. A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        public readonly string? PerTryTimeout;
        /// <summary>
        /// Specifies one or more conditions when this retry policy applies.
        /// </summary>
        public readonly ImmutableArray<string> RetryConditions;

        [OutputConstructor]
        private HttpRouteRuleActionRetryPolicy(
            int? numRetries,

            string? perTryTimeout,

            ImmutableArray<string> retryConditions)
        {
            NumRetries = numRetries;
            PerTryTimeout = perTryTimeout;
            RetryConditions = retryConditions;
        }
    }
}