// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm
    {
        /// <summary>
        /// Whether dependencies should also be installed.
        /// - install when false: `rpm --upgrade --replacepkgs package.rpm`
        /// - install when true: `yum -y install package.rpm` or
        /// `zypper -y install package.rpm`
        /// </summary>
        public readonly bool? PullDeps;
        /// <summary>
        /// A remote or local file.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSource Source;

        [OutputConstructor]
        private V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm(
            bool? pullDeps,

            Outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSource source)
        {
            PullDeps = pullDeps;
            Source = source;
        }
    }
}
