// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The generic configuration for a node pool running the control plane.
        /// Structure is documented below.
        /// </summary>
        [Input("nodePoolConfig", required: true)]
        public Input<Inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs> NodePoolConfig { get; set; } = null!;

        public BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs()
        {
        }
        public static new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs Empty => new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs();
    }
}
