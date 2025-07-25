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
    public sealed class V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFile
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
        public readonly Outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcs? Gcs;
        /// <summary>
        /// A local path within the VM to use.
        /// </summary>
        public readonly string? LocalPath;
        /// <summary>
        /// Specifies a file available via some URI.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote? Remote;

        [OutputConstructor]
        private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFile(
            bool? allowInsecure,

            Outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcs? gcs,

            string? localPath,

            Outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote? remote)
        {
            AllowInsecure = allowInsecure;
            Gcs = gcs;
            LocalPath = localPath;
            Remote = remote;
        }
    }
}
