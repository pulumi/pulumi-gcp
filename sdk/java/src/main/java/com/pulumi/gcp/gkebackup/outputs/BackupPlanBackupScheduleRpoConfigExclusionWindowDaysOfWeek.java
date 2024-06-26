// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeek {
    /**
     * @return A list of days of week.
     * Each value may be one of: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
     * 
     */
    private @Nullable List<String> daysOfWeeks;

    private BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeek() {}
    /**
     * @return A list of days of week.
     * Each value may be one of: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
     * 
     */
    public List<String> daysOfWeeks() {
        return this.daysOfWeeks == null ? List.of() : this.daysOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeek defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> daysOfWeeks;
        public Builder() {}
        public Builder(BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeek defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfWeeks = defaults.daysOfWeeks;
        }

        @CustomType.Setter
        public Builder daysOfWeeks(@Nullable List<String> daysOfWeeks) {

            this.daysOfWeeks = daysOfWeeks;
            return this;
        }
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }
        public BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeek build() {
            final var _resultValue = new BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeek();
            _resultValue.daysOfWeeks = daysOfWeeks;
            return _resultValue;
        }
    }
}
