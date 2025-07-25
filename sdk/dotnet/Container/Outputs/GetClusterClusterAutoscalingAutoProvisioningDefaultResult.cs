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
    public sealed class GetClusterClusterAutoscalingAutoProvisioningDefaultResult
    {
        /// <summary>
        /// The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool.
        /// </summary>
        public readonly string BootDiskKmsKey;
        /// <summary>
        /// Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB.
        /// </summary>
        public readonly int DiskSize;
        /// <summary>
        /// Type of the disk attached to each node.
        /// </summary>
        public readonly string DiskType;
        /// <summary>
        /// The default image type used by NAP once a new node pool is being created.
        /// </summary>
        public readonly string ImageType;
        /// <summary>
        /// NodeManagement configuration for this NodePool.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultManagementResult> Managements;
        /// <summary>
        /// Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as Intel Haswell.
        /// </summary>
        public readonly string MinCpuPlatform;
        /// <summary>
        /// Scopes that are used by NAP when creating node pools.
        /// </summary>
        public readonly ImmutableArray<string> OauthScopes;
        /// <summary>
        /// The Google Cloud Platform Service Account to be used by the node VMs.
        /// </summary>
        public readonly string ServiceAccount;
        /// <summary>
        /// Shielded Instance options.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultShieldedInstanceConfigResult> ShieldedInstanceConfigs;
        /// <summary>
        /// Specifies the upgrade settings for NAP created node pools
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingResult> UpgradeSettings;

        [OutputConstructor]
        private GetClusterClusterAutoscalingAutoProvisioningDefaultResult(
            string bootDiskKmsKey,

            int diskSize,

            string diskType,

            string imageType,

            ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultManagementResult> managements,

            string minCpuPlatform,

            ImmutableArray<string> oauthScopes,

            string serviceAccount,

            ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultShieldedInstanceConfigResult> shieldedInstanceConfigs,

            ImmutableArray<Outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingResult> upgradeSettings)
        {
            BootDiskKmsKey = bootDiskKmsKey;
            DiskSize = diskSize;
            DiskType = diskType;
            ImageType = imageType;
            Managements = managements;
            MinCpuPlatform = minCpuPlatform;
            OauthScopes = oauthScopes;
            ServiceAccount = serviceAccount;
            ShieldedInstanceConfigs = shieldedInstanceConfigs;
            UpgradeSettings = upgradeSettings;
        }
    }
}
