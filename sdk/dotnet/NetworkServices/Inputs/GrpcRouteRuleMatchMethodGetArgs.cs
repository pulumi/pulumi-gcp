// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class GrpcRouteRuleMatchMethodGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies that matches are case sensitive. The default value is true.
        /// </summary>
        [Input("caseSensitive")]
        public Input<bool>? CaseSensitive { get; set; }

        /// <summary>
        /// Required. Name of the method to match against.
        /// </summary>
        [Input("grpcMethod", required: true)]
        public Input<string> GrpcMethod { get; set; } = null!;

        /// <summary>
        /// Required. Name of the service to match against.
        /// </summary>
        [Input("grpcService", required: true)]
        public Input<string> GrpcService { get; set; } = null!;

        public GrpcRouteRuleMatchMethodGetArgs()
        {
        }
        public static new GrpcRouteRuleMatchMethodGetArgs Empty => new GrpcRouteRuleMatchMethodGetArgs();
    }
}
