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
    public sealed class VmwareAdminClusterNetworkConfigHaControlPlaneConfig
    {
        /// <summary>
        /// Static IP addresses for the control plane nodes.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlock? ControlPlaneIpBlock;

        [OutputConstructor]
        private VmwareAdminClusterNetworkConfigHaControlPlaneConfig(Outputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlock? controlPlaneIpBlock)
        {
            ControlPlaneIpBlock = controlPlaneIpBlock;
        }
    }
}
