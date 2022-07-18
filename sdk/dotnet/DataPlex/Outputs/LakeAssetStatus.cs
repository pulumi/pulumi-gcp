// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        public readonly int? ActiveAssets;
        public readonly int? SecurityPolicyApplyingAssets;
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