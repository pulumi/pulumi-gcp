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
    public sealed class BareMetalAdminClusterLoadBalancerVipConfig
    {
        /// <summary>
        /// The VIP which you previously set aside for the Kubernetes API of this Bare Metal Admin Cluster.
        /// </summary>
        public readonly string ControlPlaneVip;

        [OutputConstructor]
        private BareMetalAdminClusterLoadBalancerVipConfig(string controlPlaneVip)
        {
            ControlPlaneVip = controlPlaneVip;
        }
    }
}
