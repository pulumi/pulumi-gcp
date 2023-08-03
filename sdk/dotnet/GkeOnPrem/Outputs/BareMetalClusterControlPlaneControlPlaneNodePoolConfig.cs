// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalClusterControlPlaneControlPlaneNodePoolConfig
    {
        /// <summary>
        /// The generic configuration for a node pool running the control plane.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfig NodePoolConfig;

        [OutputConstructor]
        private BareMetalClusterControlPlaneControlPlaneNodePoolConfig(Outputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfig nodePoolConfig)
        {
            NodePoolConfig = nodePoolConfig;
        }
    }
}