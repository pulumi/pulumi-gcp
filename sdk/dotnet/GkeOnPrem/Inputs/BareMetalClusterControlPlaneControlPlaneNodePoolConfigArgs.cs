// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The generic configuration for a node pool running the control plane.
        /// Structure is documented below.
        /// </summary>
        [Input("nodePoolConfig", required: true)]
        public Input<Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs> NodePoolConfig { get; set; } = null!;

        public BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs()
        {
        }
        public static new BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs Empty => new BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs();
    }
}
