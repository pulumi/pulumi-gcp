// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The full or partial URL to the BackendService resource being mirrored to.
        /// </summary>
        [Input("backendService", required: true)]
        public Input<string> BackendService { get; set; } = null!;

        /// <summary>
        /// The percentage of requests to be mirrored to backendService.
        /// The value must be between 0.0 and 100.0 inclusive.
        /// </summary>
        [Input("mirrorPercent")]
        public Input<double>? MirrorPercent { get; set; }

        public URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs()
        {
        }
        public static new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs Empty => new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyGetArgs();
    }
}
