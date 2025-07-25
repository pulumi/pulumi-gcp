// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class ClusterNodePoolAutoConfigLinuxNodeConfig
    {
        /// <summary>
        /// Possible cgroup modes that can be used.
        /// Accepted values are:
        /// * `CGROUP_MODE_UNSPECIFIED`: CGROUP_MODE_UNSPECIFIED is when unspecified cgroup configuration is used. The default for the GKE node OS image will be used.
        /// * `CGROUP_MODE_V1`: CGROUP_MODE_V1 specifies to use cgroupv1 for the cgroup configuration on the node image.
        /// * `CGROUP_MODE_V2`: CGROUP_MODE_V2 specifies to use cgroupv2 for the cgroup configuration on the node image.
        /// </summary>
        public readonly string? CgroupMode;

        [OutputConstructor]
        private ClusterNodePoolAutoConfigLinuxNodeConfig(string? cgroupMode)
        {
            CgroupMode = cgroupMode;
        }
    }
}
