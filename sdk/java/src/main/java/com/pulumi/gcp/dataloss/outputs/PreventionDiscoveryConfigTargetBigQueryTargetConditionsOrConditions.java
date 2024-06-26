// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditions {
    /**
     * @return Duration format. The minimum age a table must have before Cloud DLP can profile it. Value greater than 1.
     * 
     */
    private @Nullable String minAge;
    /**
     * @return Minimum number of rows that should be present before Cloud DLP profiles as a table.
     * 
     */
    private @Nullable Integer minRowCount;

    private PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditions() {}
    /**
     * @return Duration format. The minimum age a table must have before Cloud DLP can profile it. Value greater than 1.
     * 
     */
    public Optional<String> minAge() {
        return Optional.ofNullable(this.minAge);
    }
    /**
     * @return Minimum number of rows that should be present before Cloud DLP profiles as a table.
     * 
     */
    public Optional<Integer> minRowCount() {
        return Optional.ofNullable(this.minRowCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String minAge;
        private @Nullable Integer minRowCount;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAge = defaults.minAge;
    	      this.minRowCount = defaults.minRowCount;
        }

        @CustomType.Setter
        public Builder minAge(@Nullable String minAge) {

            this.minAge = minAge;
            return this;
        }
        @CustomType.Setter
        public Builder minRowCount(@Nullable Integer minRowCount) {

            this.minRowCount = minRowCount;
            return this;
        }
        public PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditions build() {
            final var _resultValue = new PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditions();
            _resultValue.minAge = minAge;
            _resultValue.minRowCount = minRowCount;
            return _resultValue;
        }
    }
}
