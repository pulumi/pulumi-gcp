// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Filestore.Outputs
{

    [OutputType]
    public sealed class GetInstanceFileShareResult
    {
        /// <summary>
        /// File share capacity in GiB. This must be at least 1024 GiB
        /// for the standard tier, or 2560 GiB for the premium tier.
        /// </summary>
        public readonly int CapacityGb;
        /// <summary>
        /// The name of a Filestore instance.
        /// 
        /// - - -
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Nfs Export Options. There is a limit of 10 export options per file share.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceFileShareNfsExportOptionResult> NfsExportOptions;
        /// <summary>
        /// The resource name of the backup, in the format
        /// projects/{projectId}/locations/{locationId}/backups/{backupId},
        /// that this file share has been restored from.
        /// </summary>
        public readonly string SourceBackup;

        [OutputConstructor]
        private GetInstanceFileShareResult(
            int capacityGb,

            string name,

            ImmutableArray<Outputs.GetInstanceFileShareNfsExportOptionResult> nfsExportOptions,

            string sourceBackup)
        {
            CapacityGb = capacityGb;
            Name = name;
            NfsExportOptions = nfsExportOptions;
            SourceBackup = sourceBackup;
        }
    }
}
