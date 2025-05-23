// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.memorystore.outputs.InstanceAutomatedBackupConfigFixedFrequencySchedule;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceAutomatedBackupConfig {
    /**
     * @return Trigger automated backups at a fixed frequency.
     * Structure is documented below.
     * 
     */
    private InstanceAutomatedBackupConfigFixedFrequencySchedule fixedFrequencySchedule;
    /**
     * @return How long to keep automated backups before the backups are deleted.
     * The value should be between 1 day and 365 days. If not specified, the default value is 35 days.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;. The default_value is &#34;3024000s&#34;
     * 
     */
    private String retention;

    private InstanceAutomatedBackupConfig() {}
    /**
     * @return Trigger automated backups at a fixed frequency.
     * Structure is documented below.
     * 
     */
    public InstanceAutomatedBackupConfigFixedFrequencySchedule fixedFrequencySchedule() {
        return this.fixedFrequencySchedule;
    }
    /**
     * @return How long to keep automated backups before the backups are deleted.
     * The value should be between 1 day and 365 days. If not specified, the default value is 35 days.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;. The default_value is &#34;3024000s&#34;
     * 
     */
    public String retention() {
        return this.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAutomatedBackupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private InstanceAutomatedBackupConfigFixedFrequencySchedule fixedFrequencySchedule;
        private String retention;
        public Builder() {}
        public Builder(InstanceAutomatedBackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedFrequencySchedule = defaults.fixedFrequencySchedule;
    	      this.retention = defaults.retention;
        }

        @CustomType.Setter
        public Builder fixedFrequencySchedule(InstanceAutomatedBackupConfigFixedFrequencySchedule fixedFrequencySchedule) {
            if (fixedFrequencySchedule == null) {
              throw new MissingRequiredPropertyException("InstanceAutomatedBackupConfig", "fixedFrequencySchedule");
            }
            this.fixedFrequencySchedule = fixedFrequencySchedule;
            return this;
        }
        @CustomType.Setter
        public Builder retention(String retention) {
            if (retention == null) {
              throw new MissingRequiredPropertyException("InstanceAutomatedBackupConfig", "retention");
            }
            this.retention = retention;
            return this;
        }
        public InstanceAutomatedBackupConfig build() {
            final var _resultValue = new InstanceAutomatedBackupConfig();
            _resultValue.fixedFrequencySchedule = fixedFrequencySchedule;
            _resultValue.retention = retention;
            return _resultValue;
        }
    }
}
