// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquerydatapolicy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataPolicyDataMaskingPolicy {
    /**
     * @return The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
     * Possible values are: `SHA256`, `ALWAYS_NULL`, `DEFAULT_MASKING_VALUE`, `LAST_FOUR_CHARACTERS`, `FIRST_FOUR_CHARACTERS`, `EMAIL_MASK`, `DATE_YEAR_MASK`.
     * 
     */
    private @Nullable String predefinedExpression;
    /**
     * @return The name of the BigQuery routine that contains the custom masking routine, in the format of projects/{projectNumber}/datasets/{dataset_id}/routines/{routine_id}.
     * 
     */
    private @Nullable String routine;

    private DataPolicyDataMaskingPolicy() {}
    /**
     * @return The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
     * Possible values are: `SHA256`, `ALWAYS_NULL`, `DEFAULT_MASKING_VALUE`, `LAST_FOUR_CHARACTERS`, `FIRST_FOUR_CHARACTERS`, `EMAIL_MASK`, `DATE_YEAR_MASK`.
     * 
     */
    public Optional<String> predefinedExpression() {
        return Optional.ofNullable(this.predefinedExpression);
    }
    /**
     * @return The name of the BigQuery routine that contains the custom masking routine, in the format of projects/{projectNumber}/datasets/{dataset_id}/routines/{routine_id}.
     * 
     */
    public Optional<String> routine() {
        return Optional.ofNullable(this.routine);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPolicyDataMaskingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String predefinedExpression;
        private @Nullable String routine;
        public Builder() {}
        public Builder(DataPolicyDataMaskingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedExpression = defaults.predefinedExpression;
    	      this.routine = defaults.routine;
        }

        @CustomType.Setter
        public Builder predefinedExpression(@Nullable String predefinedExpression) {

            this.predefinedExpression = predefinedExpression;
            return this;
        }
        @CustomType.Setter
        public Builder routine(@Nullable String routine) {

            this.routine = routine;
            return this;
        }
        public DataPolicyDataMaskingPolicy build() {
            final var _resultValue = new DataPolicyDataMaskingPolicy();
            _resultValue.predefinedExpression = predefinedExpression;
            _resultValue.routine = routine;
            return _resultValue;
        }
    }
}
