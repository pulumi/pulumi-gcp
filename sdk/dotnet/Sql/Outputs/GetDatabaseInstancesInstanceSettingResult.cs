// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Outputs
{

    [OutputType]
    public sealed class GetDatabaseInstancesInstanceSettingResult
    {
        public readonly string ActivationPolicy;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingActiveDirectoryConfigResult> ActiveDirectoryConfigs;
        public readonly string AvailabilityType;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingBackupConfigurationResult> BackupConfigurations;
        public readonly string Collation;
        public readonly string ConnectorEnforcement;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingDatabaseFlagResult> DatabaseFlags;
        public readonly bool DeletionProtectionEnabled;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingDenyMaintenancePeriodResult> DenyMaintenancePeriods;
        public readonly bool DiskAutoresize;
        public readonly int DiskAutoresizeLimit;
        public readonly int DiskSize;
        public readonly string DiskType;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingInsightsConfigResult> InsightsConfigs;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingIpConfigurationResult> IpConfigurations;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingLocationPreferenceResult> LocationPreferences;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingMaintenanceWindowResult> MaintenanceWindows;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingPasswordValidationPolicyResult> PasswordValidationPolicies;
        public readonly string PricingPlan;
        public readonly ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingSqlServerAuditConfigResult> SqlServerAuditConfigs;
        /// <summary>
        /// To filter out the Cloud SQL instances based on the tier(or machine type) of the database instances.
        /// </summary>
        public readonly string Tier;
        public readonly string TimeZone;
        public readonly ImmutableDictionary<string, string> UserLabels;
        public readonly int Version;

        [OutputConstructor]
        private GetDatabaseInstancesInstanceSettingResult(
            string activationPolicy,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingActiveDirectoryConfigResult> activeDirectoryConfigs,

            string availabilityType,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingBackupConfigurationResult> backupConfigurations,

            string collation,

            string connectorEnforcement,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingDatabaseFlagResult> databaseFlags,

            bool deletionProtectionEnabled,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingDenyMaintenancePeriodResult> denyMaintenancePeriods,

            bool diskAutoresize,

            int diskAutoresizeLimit,

            int diskSize,

            string diskType,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingInsightsConfigResult> insightsConfigs,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingIpConfigurationResult> ipConfigurations,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingLocationPreferenceResult> locationPreferences,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingMaintenanceWindowResult> maintenanceWindows,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingPasswordValidationPolicyResult> passwordValidationPolicies,

            string pricingPlan,

            ImmutableArray<Outputs.GetDatabaseInstancesInstanceSettingSqlServerAuditConfigResult> sqlServerAuditConfigs,

            string tier,

            string timeZone,

            ImmutableDictionary<string, string> userLabels,

            int version)
        {
            ActivationPolicy = activationPolicy;
            ActiveDirectoryConfigs = activeDirectoryConfigs;
            AvailabilityType = availabilityType;
            BackupConfigurations = backupConfigurations;
            Collation = collation;
            ConnectorEnforcement = connectorEnforcement;
            DatabaseFlags = databaseFlags;
            DeletionProtectionEnabled = deletionProtectionEnabled;
            DenyMaintenancePeriods = denyMaintenancePeriods;
            DiskAutoresize = diskAutoresize;
            DiskAutoresizeLimit = diskAutoresizeLimit;
            DiskSize = diskSize;
            DiskType = diskType;
            InsightsConfigs = insightsConfigs;
            IpConfigurations = ipConfigurations;
            LocationPreferences = locationPreferences;
            MaintenanceWindows = maintenanceWindows;
            PasswordValidationPolicies = passwordValidationPolicies;
            PricingPlan = pricingPlan;
            SqlServerAuditConfigs = sqlServerAuditConfigs;
            Tier = tier;
            TimeZone = timeZone;
            UserLabels = userLabels;
            Version = version;
        }
    }
}