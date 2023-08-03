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
    public sealed class GrpcRouteRuleMatch
    {
        /// <summary>
        /// Specifies a list of HTTP request headers to match against.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GrpcRouteRuleMatchHeader> Headers;
        /// <summary>
        /// A gRPC method to match against. If this field is empty or omitted, will match all methods.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.GrpcRouteRuleMatchMethod? Method;

        [OutputConstructor]
        private GrpcRouteRuleMatch(
            ImmutableArray<Outputs.GrpcRouteRuleMatchHeader> headers,

            Outputs.GrpcRouteRuleMatchMethod? method)
        {
            Headers = headers;
            Method = method;
        }
    }
}