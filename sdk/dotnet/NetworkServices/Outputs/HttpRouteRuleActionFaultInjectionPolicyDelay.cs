// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Outputs
{

    [OutputType]
    public sealed class HttpRouteRuleActionFaultInjectionPolicyDelay
    {
        /// <summary>
        /// Specify a fixed delay before forwarding the request.
        /// </summary>
        public readonly string? FixedDelay;
        /// <summary>
        /// The percentage of traffic on which delay will be injected.
        /// </summary>
        public readonly int? Percentage;

        [OutputConstructor]
        private HttpRouteRuleActionFaultInjectionPolicyDelay(
            string? fixedDelay,

            int? percentage)
        {
            FixedDelay = fixedDelay;
            Percentage = percentage;
        }
    }
}
