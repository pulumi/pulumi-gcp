// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class LakeAssetStatus
    {
        /// <summary>
        /// Number of active assets.
        /// </summary>
        public readonly int? ActiveAssets;
        /// <summary>
        /// Number of assets that are in process of updating the security policy on attached resources.
        /// </summary>
        public readonly int? SecurityPolicyApplyingAssets;
        /// <summary>
        /// Output only. The time when the lake was last updated.
        /// </summary>
        public readonly string? UpdateTime;

        [OutputConstructor]
        private LakeAssetStatus(
            int? activeAssets,

            int? securityPolicyApplyingAssets,

            string? updateTime)
        {
            ActiveAssets = activeAssets;
            SecurityPolicyApplyingAssets = securityPolicyApplyingAssets;
            UpdateTime = updateTime;
        }
    }
}
