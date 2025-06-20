// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalClusterLoadBalancerVipConfig
    {
        /// <summary>
        /// The VIP which you previously set aside for the Kubernetes API of this Bare Metal User Cluster.
        /// </summary>
        public readonly string ControlPlaneVip;
        /// <summary>
        /// The VIP which you previously set aside for ingress traffic into this Bare Metal User Cluster.
        /// </summary>
        public readonly string IngressVip;

        [OutputConstructor]
        private BareMetalClusterLoadBalancerVipConfig(
            string controlPlaneVip,

            string ingressVip)
        {
            ControlPlaneVip = controlPlaneVip;
            IngressVip = ingressVip;
        }
    }
}
