// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionUrlMapDefaultRouteActionWeightedBackendServiceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The full or partial URL to the RegionBackendService resource being mirrored to.
        /// The backend service configured for a mirroring policy must reference backends that are of the same type as the original backend service matched in the URL map.
        /// Serverless NEG backends are not currently supported as a mirrored backend service.
        /// </summary>
        [Input("backendService")]
        public Input<string>? BackendService { get; set; }

        /// <summary>
        /// Specifies changes to request and response headers that need to take effect for the selected backendService.
        /// headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
        /// headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL.
        /// Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
        /// Structure is documented below.
        /// </summary>
        [Input("headerAction")]
        public Input<Inputs.RegionUrlMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs>? HeaderAction { get; set; }

        /// <summary>
        /// Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) .
        /// The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy.
        /// The value must be from 0 to 1000.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public RegionUrlMapDefaultRouteActionWeightedBackendServiceGetArgs()
        {
        }
        public static new RegionUrlMapDefaultRouteActionWeightedBackendServiceGetArgs Empty => new RegionUrlMapDefaultRouteActionWeightedBackendServiceGetArgs();
    }
}