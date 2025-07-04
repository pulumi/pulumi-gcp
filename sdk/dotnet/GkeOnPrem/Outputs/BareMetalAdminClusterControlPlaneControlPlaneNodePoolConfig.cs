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
    public sealed class BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfig
    {
        /// <summary>
        /// The generic configuration for a node pool running the control plane.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfig NodePoolConfig;

        [OutputConstructor]
        private BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfig(Outputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfig nodePoolConfig)
        {
            NodePoolConfig = nodePoolConfig;
        }
    }
}
