// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionSqlDailyExecutionTime;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyConditionConditionSqlDaily {
    /**
     * @return The time of day (in UTC) at which the query should run. If left
     * unspecified, the server picks an arbitrary time of day and runs
     * the query at the same time each day.
     * Structure is documented below.
     * 
     */
    private @Nullable AlertPolicyConditionConditionSqlDailyExecutionTime executionTime;
    /**
     * @return The number of days between runs. Must be greater than or equal
     * to 1 day and less than or equal to 30 days.
     * 
     */
    private Integer periodicity;

    private AlertPolicyConditionConditionSqlDaily() {}
    /**
     * @return The time of day (in UTC) at which the query should run. If left
     * unspecified, the server picks an arbitrary time of day and runs
     * the query at the same time each day.
     * Structure is documented below.
     * 
     */
    public Optional<AlertPolicyConditionConditionSqlDailyExecutionTime> executionTime() {
        return Optional.ofNullable(this.executionTime);
    }
    /**
     * @return The number of days between runs. Must be greater than or equal
     * to 1 day and less than or equal to 30 days.
     * 
     */
    public Integer periodicity() {
        return this.periodicity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionSqlDaily defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AlertPolicyConditionConditionSqlDailyExecutionTime executionTime;
        private Integer periodicity;
        public Builder() {}
        public Builder(AlertPolicyConditionConditionSqlDaily defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionTime = defaults.executionTime;
    	      this.periodicity = defaults.periodicity;
        }

        @CustomType.Setter
        public Builder executionTime(@Nullable AlertPolicyConditionConditionSqlDailyExecutionTime executionTime) {

            this.executionTime = executionTime;
            return this;
        }
        @CustomType.Setter
        public Builder periodicity(Integer periodicity) {
            if (periodicity == null) {
              throw new MissingRequiredPropertyException("AlertPolicyConditionConditionSqlDaily", "periodicity");
            }
            this.periodicity = periodicity;
            return this;
        }
        public AlertPolicyConditionConditionSqlDaily build() {
            final var _resultValue = new AlertPolicyConditionConditionSqlDaily();
            _resultValue.executionTime = executionTime;
            _resultValue.periodicity = periodicity;
            return _resultValue;
        }
    }
}
