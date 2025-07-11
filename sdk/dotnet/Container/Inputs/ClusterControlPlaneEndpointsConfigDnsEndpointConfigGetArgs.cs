// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterControlPlaneEndpointsConfigDnsEndpointConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls whether user traffic is allowed over this endpoint. Note that GCP-managed services may still use the endpoint even if this is false.
        /// </summary>
        [Input("allowExternalTraffic")]
        public Input<bool>? AllowExternalTraffic { get; set; }

        /// <summary>
        /// The cluster's DNS endpoint.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        public ClusterControlPlaneEndpointsConfigDnsEndpointConfigGetArgs()
        {
        }
        public static new ClusterControlPlaneEndpointsConfigDnsEndpointConfigGetArgs Empty => new ClusterControlPlaneEndpointsConfigDnsEndpointConfigGetArgs();
    }
}
