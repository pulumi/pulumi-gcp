// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureMembershipConfigmanagementConfigSyncOci
    {
        /// <summary>
        /// The GCP Service Account Email used for auth when secret_type is gcpserviceaccount.
        /// </summary>
        public readonly string? GcpServiceAccountEmail;
        /// <summary>
        /// The absolute path of the directory that contains the local resources. Default: the root directory of the image.
        /// </summary>
        public readonly string? PolicyDir;
        /// <summary>
        /// Type of secret configured for access to the OCI Image. Must be one of gcenode, gcpserviceaccount or none.
        /// </summary>
        public readonly string? SecretType;
        /// <summary>
        /// The OCI image repository URL for the package to sync from. e.g. LOCATION-docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME.
        /// </summary>
        public readonly string? SyncRepo;
        /// <summary>
        /// Period in seconds(int64 format) between consecutive syncs. Default: 15.
        /// </summary>
        public readonly string? SyncWaitSecs;

        [OutputConstructor]
        private FeatureMembershipConfigmanagementConfigSyncOci(
            string? gcpServiceAccountEmail,

            string? policyDir,

            string? secretType,

            string? syncRepo,

            string? syncWaitSecs)
        {
            GcpServiceAccountEmail = gcpServiceAccountEmail;
            PolicyDir = policyDir;
            SecretType = secretType;
            SyncRepo = syncRepo;
            SyncWaitSecs = syncWaitSecs;
        }
    }
}
