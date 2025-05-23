// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime {
    /**
     * @return Hours of day in 24 hour format. Should be from 0 to 23.
     * An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    private Integer hours;

    private InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime() {}
    /**
     * @return Hours of day in 24 hour format. Should be from 0 to 23.
     * An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    public Integer hours() {
        return this.hours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer hours;
        public Builder() {}
        public Builder(InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
        }

        @CustomType.Setter
        public Builder hours(Integer hours) {
            if (hours == null) {
              throw new MissingRequiredPropertyException("InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime", "hours");
            }
            this.hours = hours;
            return this;
        }
        public InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime build() {
            final var _resultValue = new InstanceAutomatedBackupConfigFixedFrequencyScheduleStartTime();
            _resultValue.hours = hours;
            return _resultValue;
        }
    }
}
