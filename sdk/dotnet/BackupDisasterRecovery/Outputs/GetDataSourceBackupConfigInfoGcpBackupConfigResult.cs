// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BackupDisasterRecovery.Outputs
{

    [OutputType]
    public sealed class GetDataSourceBackupConfigInfoGcpBackupConfigResult
    {
        /// <summary>
        /// The name of the backup plan.
        /// </summary>
        public readonly string BackupPlan;
        /// <summary>
        /// The name of the backup plan association.
        /// </summary>
        public readonly string BackupPlanAssociation;
        /// <summary>
        /// The description of the backup plan.
        /// </summary>
        public readonly string BackupPlanDescription;
        /// <summary>
        /// The names of the backup plan rules which point to this backupvault
        /// </summary>
        public readonly ImmutableArray<string> BackupPlanRules;

        [OutputConstructor]
        private GetDataSourceBackupConfigInfoGcpBackupConfigResult(
            string backupPlan,

            string backupPlanAssociation,

            string backupPlanDescription,

            ImmutableArray<string> backupPlanRules)
        {
            BackupPlan = backupPlan;
            BackupPlanAssociation = backupPlanAssociation;
            BackupPlanDescription = backupPlanDescription;
            BackupPlanRules = backupPlanRules;
        }
    }
}
