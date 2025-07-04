// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether dependencies should also be installed.
        /// - install when false: `rpm --upgrade --replacepkgs package.rpm`
        /// - install when true: `yum -y install package.rpm` or
        /// `zypper -y install package.rpm`
        /// </summary>
        [Input("pullDeps")]
        public Input<bool>? PullDeps { get; set; }

        /// <summary>
        /// A remote or local file.
        /// Structure is documented below.
        /// </summary>
        [Input("source", required: true)]
        public Input<Inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs> Source { get; set; } = null!;

        public V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs()
        {
        }
        public static new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs Empty => new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs();
    }
}
