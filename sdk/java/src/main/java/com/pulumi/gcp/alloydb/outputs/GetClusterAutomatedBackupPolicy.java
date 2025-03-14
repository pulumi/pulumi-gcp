// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.alloydb.outputs.GetClusterAutomatedBackupPolicyEncryptionConfig;
import com.pulumi.gcp.alloydb.outputs.GetClusterAutomatedBackupPolicyQuantityBasedRetention;
import com.pulumi.gcp.alloydb.outputs.GetClusterAutomatedBackupPolicyTimeBasedRetention;
import com.pulumi.gcp.alloydb.outputs.GetClusterAutomatedBackupPolicyWeeklySchedule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterAutomatedBackupPolicy {
    /**
     * @return The length of the time window during which a backup can be taken. If a backup does not succeed within this time window, it will be canceled and considered failed.
     * 
     * The backup window must be at least 5 minutes long. There is no upper bound on the window. If not set, it will default to 1 hour.
     * 
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private String backupWindow;
    /**
     * @return Whether automated backups are enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * 
     */
    private List<GetClusterAutomatedBackupPolicyEncryptionConfig> encryptionConfigs;
    /**
     * @return Labels to apply to backups created using this configuration.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return (optional)
     * The canonical id of the location.If it is not provided, the provider project is used. For example: us-east1.
     * 
     */
    private String location;
    /**
     * @return Quantity-based Backup retention policy to retain recent backups. Conflicts with &#39;time_based_retention&#39;, both can&#39;t be set together.
     * 
     */
    private List<GetClusterAutomatedBackupPolicyQuantityBasedRetention> quantityBasedRetentions;
    /**
     * @return Time-based Backup retention policy. Conflicts with &#39;quantity_based_retention&#39;, both can&#39;t be set together.
     * 
     */
    private List<GetClusterAutomatedBackupPolicyTimeBasedRetention> timeBasedRetentions;
    /**
     * @return Weekly schedule for the Backup.
     * 
     */
    private List<GetClusterAutomatedBackupPolicyWeeklySchedule> weeklySchedules;

    private GetClusterAutomatedBackupPolicy() {}
    /**
     * @return The length of the time window during which a backup can be taken. If a backup does not succeed within this time window, it will be canceled and considered failed.
     * 
     * The backup window must be at least 5 minutes long. There is no upper bound on the window. If not set, it will default to 1 hour.
     * 
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public String backupWindow() {
        return this.backupWindow;
    }
    /**
     * @return Whether automated backups are enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * 
     */
    public List<GetClusterAutomatedBackupPolicyEncryptionConfig> encryptionConfigs() {
        return this.encryptionConfigs;
    }
    /**
     * @return Labels to apply to backups created using this configuration.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return (optional)
     * The canonical id of the location.If it is not provided, the provider project is used. For example: us-east1.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Quantity-based Backup retention policy to retain recent backups. Conflicts with &#39;time_based_retention&#39;, both can&#39;t be set together.
     * 
     */
    public List<GetClusterAutomatedBackupPolicyQuantityBasedRetention> quantityBasedRetentions() {
        return this.quantityBasedRetentions;
    }
    /**
     * @return Time-based Backup retention policy. Conflicts with &#39;quantity_based_retention&#39;, both can&#39;t be set together.
     * 
     */
    public List<GetClusterAutomatedBackupPolicyTimeBasedRetention> timeBasedRetentions() {
        return this.timeBasedRetentions;
    }
    /**
     * @return Weekly schedule for the Backup.
     * 
     */
    public List<GetClusterAutomatedBackupPolicyWeeklySchedule> weeklySchedules() {
        return this.weeklySchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAutomatedBackupPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupWindow;
        private Boolean enabled;
        private List<GetClusterAutomatedBackupPolicyEncryptionConfig> encryptionConfigs;
        private Map<String,String> labels;
        private String location;
        private List<GetClusterAutomatedBackupPolicyQuantityBasedRetention> quantityBasedRetentions;
        private List<GetClusterAutomatedBackupPolicyTimeBasedRetention> timeBasedRetentions;
        private List<GetClusterAutomatedBackupPolicyWeeklySchedule> weeklySchedules;
        public Builder() {}
        public Builder(GetClusterAutomatedBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupWindow = defaults.backupWindow;
    	      this.enabled = defaults.enabled;
    	      this.encryptionConfigs = defaults.encryptionConfigs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.quantityBasedRetentions = defaults.quantityBasedRetentions;
    	      this.timeBasedRetentions = defaults.timeBasedRetentions;
    	      this.weeklySchedules = defaults.weeklySchedules;
        }

        @CustomType.Setter
        public Builder backupWindow(String backupWindow) {
            if (backupWindow == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "backupWindow");
            }
            this.backupWindow = backupWindow;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionConfigs(List<GetClusterAutomatedBackupPolicyEncryptionConfig> encryptionConfigs) {
            if (encryptionConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "encryptionConfigs");
            }
            this.encryptionConfigs = encryptionConfigs;
            return this;
        }
        public Builder encryptionConfigs(GetClusterAutomatedBackupPolicyEncryptionConfig... encryptionConfigs) {
            return encryptionConfigs(List.of(encryptionConfigs));
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder quantityBasedRetentions(List<GetClusterAutomatedBackupPolicyQuantityBasedRetention> quantityBasedRetentions) {
            if (quantityBasedRetentions == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "quantityBasedRetentions");
            }
            this.quantityBasedRetentions = quantityBasedRetentions;
            return this;
        }
        public Builder quantityBasedRetentions(GetClusterAutomatedBackupPolicyQuantityBasedRetention... quantityBasedRetentions) {
            return quantityBasedRetentions(List.of(quantityBasedRetentions));
        }
        @CustomType.Setter
        public Builder timeBasedRetentions(List<GetClusterAutomatedBackupPolicyTimeBasedRetention> timeBasedRetentions) {
            if (timeBasedRetentions == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "timeBasedRetentions");
            }
            this.timeBasedRetentions = timeBasedRetentions;
            return this;
        }
        public Builder timeBasedRetentions(GetClusterAutomatedBackupPolicyTimeBasedRetention... timeBasedRetentions) {
            return timeBasedRetentions(List.of(timeBasedRetentions));
        }
        @CustomType.Setter
        public Builder weeklySchedules(List<GetClusterAutomatedBackupPolicyWeeklySchedule> weeklySchedules) {
            if (weeklySchedules == null) {
              throw new MissingRequiredPropertyException("GetClusterAutomatedBackupPolicy", "weeklySchedules");
            }
            this.weeklySchedules = weeklySchedules;
            return this;
        }
        public Builder weeklySchedules(GetClusterAutomatedBackupPolicyWeeklySchedule... weeklySchedules) {
            return weeklySchedules(List.of(weeklySchedules));
        }
        public GetClusterAutomatedBackupPolicy build() {
            final var _resultValue = new GetClusterAutomatedBackupPolicy();
            _resultValue.backupWindow = backupWindow;
            _resultValue.enabled = enabled;
            _resultValue.encryptionConfigs = encryptionConfigs;
            _resultValue.labels = labels;
            _resultValue.location = location;
            _resultValue.quantityBasedRetentions = quantityBasedRetentions;
            _resultValue.timeBasedRetentions = timeBasedRetentions;
            _resultValue.weeklySchedules = weeklySchedules;
            return _resultValue;
        }
    }
}
