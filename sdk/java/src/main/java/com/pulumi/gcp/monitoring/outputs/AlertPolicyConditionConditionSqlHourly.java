// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyConditionConditionSqlHourly {
    /**
     * @return The number of minutes after the hour (in UTC) to run the query.
     * Must be greater than or equal to 0 minutes and less than or equal to
     * 59 minutes.  If left unspecified, then an arbitrary offset is used.
     * 
     */
    private @Nullable Integer minuteOffset;
    /**
     * @return Number of hours between runs. The interval must be greater than or
     * equal to 1 hour and less than or equal to 48 hours.
     * 
     */
    private Integer periodicity;

    private AlertPolicyConditionConditionSqlHourly() {}
    /**
     * @return The number of minutes after the hour (in UTC) to run the query.
     * Must be greater than or equal to 0 minutes and less than or equal to
     * 59 minutes.  If left unspecified, then an arbitrary offset is used.
     * 
     */
    public Optional<Integer> minuteOffset() {
        return Optional.ofNullable(this.minuteOffset);
    }
    /**
     * @return Number of hours between runs. The interval must be greater than or
     * equal to 1 hour and less than or equal to 48 hours.
     * 
     */
    public Integer periodicity() {
        return this.periodicity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionSqlHourly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minuteOffset;
        private Integer periodicity;
        public Builder() {}
        public Builder(AlertPolicyConditionConditionSqlHourly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minuteOffset = defaults.minuteOffset;
    	      this.periodicity = defaults.periodicity;
        }

        @CustomType.Setter
        public Builder minuteOffset(@Nullable Integer minuteOffset) {

            this.minuteOffset = minuteOffset;
            return this;
        }
        @CustomType.Setter
        public Builder periodicity(Integer periodicity) {
            if (periodicity == null) {
              throw new MissingRequiredPropertyException("AlertPolicyConditionConditionSqlHourly", "periodicity");
            }
            this.periodicity = periodicity;
            return this;
        }
        public AlertPolicyConditionConditionSqlHourly build() {
            final var _resultValue = new AlertPolicyConditionConditionSqlHourly();
            _resultValue.minuteOffset = minuteOffset;
            _resultValue.periodicity = periodicity;
            return _resultValue;
        }
    }
}
