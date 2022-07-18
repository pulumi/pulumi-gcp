// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingActiveDirectoryConfig;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingBackupConfiguration;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingDatabaseFlag;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingInsightsConfig;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingIpConfiguration;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingLocationPreference;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingMaintenanceWindow;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingSqlServerAuditConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstanceSetting {
    private final String activationPolicy;
    private final List<GetDatabaseInstanceSettingActiveDirectoryConfig> activeDirectoryConfigs;
    private final String availabilityType;
    private final List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations;
    private final String collation;
    private final List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags;
    private final Boolean diskAutoresize;
    private final Integer diskAutoresizeLimit;
    private final Integer diskSize;
    private final String diskType;
    private final List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs;
    private final List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations;
    private final List<GetDatabaseInstanceSettingLocationPreference> locationPreferences;
    private final List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows;
    private final String pricingPlan;
    private final List<GetDatabaseInstanceSettingSqlServerAuditConfig> sqlServerAuditConfigs;
    private final String tier;
    private final Map<String,String> userLabels;
    private final Integer version;

    @CustomType.Constructor
    private GetDatabaseInstanceSetting(
        @CustomType.Parameter("activationPolicy") String activationPolicy,
        @CustomType.Parameter("activeDirectoryConfigs") List<GetDatabaseInstanceSettingActiveDirectoryConfig> activeDirectoryConfigs,
        @CustomType.Parameter("availabilityType") String availabilityType,
        @CustomType.Parameter("backupConfigurations") List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations,
        @CustomType.Parameter("collation") String collation,
        @CustomType.Parameter("databaseFlags") List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags,
        @CustomType.Parameter("diskAutoresize") Boolean diskAutoresize,
        @CustomType.Parameter("diskAutoresizeLimit") Integer diskAutoresizeLimit,
        @CustomType.Parameter("diskSize") Integer diskSize,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("insightsConfigs") List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs,
        @CustomType.Parameter("ipConfigurations") List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations,
        @CustomType.Parameter("locationPreferences") List<GetDatabaseInstanceSettingLocationPreference> locationPreferences,
        @CustomType.Parameter("maintenanceWindows") List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows,
        @CustomType.Parameter("pricingPlan") String pricingPlan,
        @CustomType.Parameter("sqlServerAuditConfigs") List<GetDatabaseInstanceSettingSqlServerAuditConfig> sqlServerAuditConfigs,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("userLabels") Map<String,String> userLabels,
        @CustomType.Parameter("version") Integer version) {
        this.activationPolicy = activationPolicy;
        this.activeDirectoryConfigs = activeDirectoryConfigs;
        this.availabilityType = availabilityType;
        this.backupConfigurations = backupConfigurations;
        this.collation = collation;
        this.databaseFlags = databaseFlags;
        this.diskAutoresize = diskAutoresize;
        this.diskAutoresizeLimit = diskAutoresizeLimit;
        this.diskSize = diskSize;
        this.diskType = diskType;
        this.insightsConfigs = insightsConfigs;
        this.ipConfigurations = ipConfigurations;
        this.locationPreferences = locationPreferences;
        this.maintenanceWindows = maintenanceWindows;
        this.pricingPlan = pricingPlan;
        this.sqlServerAuditConfigs = sqlServerAuditConfigs;
        this.tier = tier;
        this.userLabels = userLabels;
        this.version = version;
    }

    public String activationPolicy() {
        return this.activationPolicy;
    }
    public List<GetDatabaseInstanceSettingActiveDirectoryConfig> activeDirectoryConfigs() {
        return this.activeDirectoryConfigs;
    }
    public String availabilityType() {
        return this.availabilityType;
    }
    public List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations() {
        return this.backupConfigurations;
    }
    public String collation() {
        return this.collation;
    }
    public List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags() {
        return this.databaseFlags;
    }
    public Boolean diskAutoresize() {
        return this.diskAutoresize;
    }
    public Integer diskAutoresizeLimit() {
        return this.diskAutoresizeLimit;
    }
    public Integer diskSize() {
        return this.diskSize;
    }
    public String diskType() {
        return this.diskType;
    }
    public List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs() {
        return this.insightsConfigs;
    }
    public List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    public List<GetDatabaseInstanceSettingLocationPreference> locationPreferences() {
        return this.locationPreferences;
    }
    public List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    public String pricingPlan() {
        return this.pricingPlan;
    }
    public List<GetDatabaseInstanceSettingSqlServerAuditConfig> sqlServerAuditConfigs() {
        return this.sqlServerAuditConfigs;
    }
    public String tier() {
        return this.tier;
    }
    public Map<String,String> userLabels() {
        return this.userLabels;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationPolicy;
        private List<GetDatabaseInstanceSettingActiveDirectoryConfig> activeDirectoryConfigs;
        private String availabilityType;
        private List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations;
        private String collation;
        private List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags;
        private Boolean diskAutoresize;
        private Integer diskAutoresizeLimit;
        private Integer diskSize;
        private String diskType;
        private List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs;
        private List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations;
        private List<GetDatabaseInstanceSettingLocationPreference> locationPreferences;
        private List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows;
        private String pricingPlan;
        private List<GetDatabaseInstanceSettingSqlServerAuditConfig> sqlServerAuditConfigs;
        private String tier;
        private Map<String,String> userLabels;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.activeDirectoryConfigs = defaults.activeDirectoryConfigs;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfigurations = defaults.backupConfigurations;
    	      this.collation = defaults.collation;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.diskAutoresize = defaults.diskAutoresize;
    	      this.diskAutoresizeLimit = defaults.diskAutoresizeLimit;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
    	      this.insightsConfigs = defaults.insightsConfigs;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.locationPreferences = defaults.locationPreferences;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.sqlServerAuditConfigs = defaults.sqlServerAuditConfigs;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.version = defaults.version;
        }

        public Builder activationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }
        public Builder activeDirectoryConfigs(List<GetDatabaseInstanceSettingActiveDirectoryConfig> activeDirectoryConfigs) {
            this.activeDirectoryConfigs = Objects.requireNonNull(activeDirectoryConfigs);
            return this;
        }
        public Builder activeDirectoryConfigs(GetDatabaseInstanceSettingActiveDirectoryConfig... activeDirectoryConfigs) {
            return activeDirectoryConfigs(List.of(activeDirectoryConfigs));
        }
        public Builder availabilityType(String availabilityType) {
            this.availabilityType = Objects.requireNonNull(availabilityType);
            return this;
        }
        public Builder backupConfigurations(List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations) {
            this.backupConfigurations = Objects.requireNonNull(backupConfigurations);
            return this;
        }
        public Builder backupConfigurations(GetDatabaseInstanceSettingBackupConfiguration... backupConfigurations) {
            return backupConfigurations(List.of(backupConfigurations));
        }
        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }
        public Builder databaseFlags(List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }
        public Builder databaseFlags(GetDatabaseInstanceSettingDatabaseFlag... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }
        public Builder diskAutoresize(Boolean diskAutoresize) {
            this.diskAutoresize = Objects.requireNonNull(diskAutoresize);
            return this;
        }
        public Builder diskAutoresizeLimit(Integer diskAutoresizeLimit) {
            this.diskAutoresizeLimit = Objects.requireNonNull(diskAutoresizeLimit);
            return this;
        }
        public Builder diskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder insightsConfigs(List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs) {
            this.insightsConfigs = Objects.requireNonNull(insightsConfigs);
            return this;
        }
        public Builder insightsConfigs(GetDatabaseInstanceSettingInsightsConfig... insightsConfigs) {
            return insightsConfigs(List.of(insightsConfigs));
        }
        public Builder ipConfigurations(List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(GetDatabaseInstanceSettingIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder locationPreferences(List<GetDatabaseInstanceSettingLocationPreference> locationPreferences) {
            this.locationPreferences = Objects.requireNonNull(locationPreferences);
            return this;
        }
        public Builder locationPreferences(GetDatabaseInstanceSettingLocationPreference... locationPreferences) {
            return locationPreferences(List.of(locationPreferences));
        }
        public Builder maintenanceWindows(List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }
        public Builder maintenanceWindows(GetDatabaseInstanceSettingMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        public Builder pricingPlan(String pricingPlan) {
            this.pricingPlan = Objects.requireNonNull(pricingPlan);
            return this;
        }
        public Builder sqlServerAuditConfigs(List<GetDatabaseInstanceSettingSqlServerAuditConfig> sqlServerAuditConfigs) {
            this.sqlServerAuditConfigs = Objects.requireNonNull(sqlServerAuditConfigs);
            return this;
        }
        public Builder sqlServerAuditConfigs(GetDatabaseInstanceSettingSqlServerAuditConfig... sqlServerAuditConfigs) {
            return sqlServerAuditConfigs(List.of(sqlServerAuditConfigs));
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetDatabaseInstanceSetting build() {
            return new GetDatabaseInstanceSetting(activationPolicy, activeDirectoryConfigs, availabilityType, backupConfigurations, collation, databaseFlags, diskAutoresize, diskAutoresizeLimit, diskSize, diskType, insightsConfigs, ipConfigurations, locationPreferences, maintenanceWindows, pricingPlan, sqlServerAuditConfigs, tier, userLabels, version);
        }
    }
}