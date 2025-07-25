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
    public sealed class GrpcRouteRuleActionFaultInjectionPolicyAbort
    {
        /// <summary>
        /// The HTTP status code used to abort the request.
        /// </summary>
        public readonly int? HttpStatus;
        /// <summary>
        /// The percentage of traffic which will be aborted.
        /// </summary>
        public readonly int? Percentage;

        [OutputConstructor]
        private GrpcRouteRuleActionFaultInjectionPolicyAbort(
            int? httpStatus,

            int? percentage)
        {
            HttpStatus = httpStatus;
            Percentage = percentage;
        }
    }
}
