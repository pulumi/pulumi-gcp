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
    public sealed class TcpRouteRuleActionDestination
    {
        /// <summary>
        /// The URL of a BackendService to route traffic to.
        /// </summary>
        public readonly string? ServiceName;
        /// <summary>
        /// Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports.
        /// If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend.
        /// If weights are specified for any one service name, they need to be specified for all of them.
        /// If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
        /// </summary>
        public readonly int? Weight;

        [OutputConstructor]
        private TcpRouteRuleActionDestination(
            string? serviceName,

            int? weight)
        {
            ServiceName = serviceName;
            Weight = weight;
        }
    }
}
