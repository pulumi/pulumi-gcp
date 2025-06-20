// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterAddonsConfigIstioConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication type between services in Istio. Available options include `AUTH_MUTUAL_TLS`.
        /// </summary>
        [Input("auth")]
        public Input<string>? Auth { get; set; }

        /// <summary>
        /// The status of the Istio addon, which makes it easy to set up Istio for services in a
        /// cluster. It is disabled by default. Set `disabled = false` to enable.
        /// </summary>
        [Input("disabled", required: true)]
        public Input<bool> Disabled { get; set; } = null!;

        public ClusterAddonsConfigIstioConfigArgs()
        {
        }
        public static new ClusterAddonsConfigIstioConfigArgs Empty => new ClusterAddonsConfigIstioConfigArgs();
    }
}
