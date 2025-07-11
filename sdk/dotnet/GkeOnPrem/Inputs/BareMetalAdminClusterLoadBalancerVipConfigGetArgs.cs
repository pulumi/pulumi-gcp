// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterLoadBalancerVipConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The VIP which you previously set aside for the Kubernetes API of this Bare Metal Admin Cluster.
        /// </summary>
        [Input("controlPlaneVip", required: true)]
        public Input<string> ControlPlaneVip { get; set; } = null!;

        public BareMetalAdminClusterLoadBalancerVipConfigGetArgs()
        {
        }
        public static new BareMetalAdminClusterLoadBalancerVipConfigGetArgs Empty => new BareMetalAdminClusterLoadBalancerVipConfigGetArgs();
    }
}
