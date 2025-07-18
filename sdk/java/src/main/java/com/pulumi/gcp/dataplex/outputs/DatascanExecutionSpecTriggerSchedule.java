// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatascanExecutionSpecTriggerSchedule {
    /**
     * @return Cron schedule for running scans periodically. This field is required for Schedule scans.
     * 
     */
    private String cron;

    private DatascanExecutionSpecTriggerSchedule() {}
    /**
     * @return Cron schedule for running scans periodically. This field is required for Schedule scans.
     * 
     */
    public String cron() {
        return this.cron;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanExecutionSpecTriggerSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cron;
        public Builder() {}
        public Builder(DatascanExecutionSpecTriggerSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cron = defaults.cron;
        }

        @CustomType.Setter
        public Builder cron(String cron) {
            if (cron == null) {
              throw new MissingRequiredPropertyException("DatascanExecutionSpecTriggerSchedule", "cron");
            }
            this.cron = cron;
            return this;
        }
        public DatascanExecutionSpecTriggerSchedule build() {
            final var _resultValue = new DatascanExecutionSpecTriggerSchedule();
            _resultValue.cron = cron;
            return _resultValue;
        }
    }
}
