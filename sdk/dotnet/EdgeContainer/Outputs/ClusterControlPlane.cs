// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Outputs
{

    [OutputType]
    public sealed class ClusterControlPlane
    {
        /// <summary>
        /// Local control plane configuration.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ClusterControlPlaneLocal? Local;
        /// <summary>
        /// Remote control plane configuration.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ClusterControlPlaneRemote? Remote;

        [OutputConstructor]
        private ClusterControlPlane(
            Outputs.ClusterControlPlaneLocal? local,

            Outputs.ClusterControlPlaneRemote? remote)
        {
            Local = local;
            Remote = remote;
        }
    }
}
