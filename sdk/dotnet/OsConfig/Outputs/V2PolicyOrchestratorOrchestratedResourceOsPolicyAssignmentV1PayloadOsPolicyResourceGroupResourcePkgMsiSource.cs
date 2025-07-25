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
    public sealed class V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSource
    {
        /// <summary>
        /// Defaults to false. When false, files are subject to validations
        /// based on the file type:
        /// Remote: A checksum must be specified.
        /// Cloud Storage: An object generation number must be specified.
        /// </summary>
        public readonly bool? AllowInsecure;
        /// <summary>
        /// Specifies a file available as a Cloud Storage Object.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcs? Gcs;
        /// <summary>
        /// A local path within the VM to use.
        /// </summary>
        public readonly string? LocalPath;
        /// <summary>
        /// Specifies a file available via some URI.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemote? Remote;

        [OutputConstructor]
        private V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSource(
            bool? allowInsecure,

            Outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcs? gcs,

            string? localPath,

            Outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemote? remote)
        {
            AllowInsecure = allowInsecure;
            Gcs = gcs;
            LocalPath = localPath;
            Remote = remote;
        }
    }
}
