// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.alloydb.outputs.GetClusterContinuousBackupInfoEncryptionInfo;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterContinuousBackupInfo {
    /**
     * @return The earliest restorable time that can be restored to. Output only field.
     * 
     */
    private String earliestRestorableTime;
    /**
     * @return When ContinuousBackup was most recently enabled. Set to null if ContinuousBackup is not enabled.
     * 
     */
    private String enabledTime;
    /**
     * @return Output only. The encryption information for the WALs and backups required for ContinuousBackup.
     * 
     */
    private List<GetClusterContinuousBackupInfoEncryptionInfo> encryptionInfos;
    /**
     * @return Days of the week on which a continuous backup is taken. Output only field. Ignored if passed into the request.
     * 
     */
    private List<String> schedules;

    private GetClusterContinuousBackupInfo() {}
    /**
     * @return The earliest restorable time that can be restored to. Output only field.
     * 
     */
    public String earliestRestorableTime() {
        return this.earliestRestorableTime;
    }
    /**
     * @return When ContinuousBackup was most recently enabled. Set to null if ContinuousBackup is not enabled.
     * 
     */
    public String enabledTime() {
        return this.enabledTime;
    }
    /**
     * @return Output only. The encryption information for the WALs and backups required for ContinuousBackup.
     * 
     */
    public List<GetClusterContinuousBackupInfoEncryptionInfo> encryptionInfos() {
        return this.encryptionInfos;
    }
    /**
     * @return Days of the week on which a continuous backup is taken. Output only field. Ignored if passed into the request.
     * 
     */
    public List<String> schedules() {
        return this.schedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterContinuousBackupInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String earliestRestorableTime;
        private String enabledTime;
        private List<GetClusterContinuousBackupInfoEncryptionInfo> encryptionInfos;
        private List<String> schedules;
        public Builder() {}
        public Builder(GetClusterContinuousBackupInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.earliestRestorableTime = defaults.earliestRestorableTime;
    	      this.enabledTime = defaults.enabledTime;
    	      this.encryptionInfos = defaults.encryptionInfos;
    	      this.schedules = defaults.schedules;
        }

        @CustomType.Setter
        public Builder earliestRestorableTime(String earliestRestorableTime) {
            if (earliestRestorableTime == null) {
              throw new MissingRequiredPropertyException("GetClusterContinuousBackupInfo", "earliestRestorableTime");
            }
            this.earliestRestorableTime = earliestRestorableTime;
            return this;
        }
        @CustomType.Setter
        public Builder enabledTime(String enabledTime) {
            if (enabledTime == null) {
              throw new MissingRequiredPropertyException("GetClusterContinuousBackupInfo", "enabledTime");
            }
            this.enabledTime = enabledTime;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionInfos(List<GetClusterContinuousBackupInfoEncryptionInfo> encryptionInfos) {
            if (encryptionInfos == null) {
              throw new MissingRequiredPropertyException("GetClusterContinuousBackupInfo", "encryptionInfos");
            }
            this.encryptionInfos = encryptionInfos;
            return this;
        }
        public Builder encryptionInfos(GetClusterContinuousBackupInfoEncryptionInfo... encryptionInfos) {
            return encryptionInfos(List.of(encryptionInfos));
        }
        @CustomType.Setter
        public Builder schedules(List<String> schedules) {
            if (schedules == null) {
              throw new MissingRequiredPropertyException("GetClusterContinuousBackupInfo", "schedules");
            }
            this.schedules = schedules;
            return this;
        }
        public Builder schedules(String... schedules) {
            return schedules(List.of(schedules));
        }
        public GetClusterContinuousBackupInfo build() {
            final var _resultValue = new GetClusterContinuousBackupInfo();
            _resultValue.earliestRestorableTime = earliestRestorableTime;
            _resultValue.enabledTime = enabledTime;
            _resultValue.encryptionInfos = encryptionInfos;
            _resultValue.schedules = schedules;
            return _resultValue;
        }
    }
}
