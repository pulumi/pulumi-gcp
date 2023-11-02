// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs Empty = new DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs();

    /**
     * The maximum column statistic value allowed for a row to pass this validation.
     * At least one of minValue and maxValue need to be provided.
     * 
     */
    @Import(name="maxValue")
    private @Nullable Output<String> maxValue;

    /**
     * @return The maximum column statistic value allowed for a row to pass this validation.
     * At least one of minValue and maxValue need to be provided.
     * 
     */
    public Optional<Output<String>> maxValue() {
        return Optional.ofNullable(this.maxValue);
    }

    /**
     * The minimum column statistic value allowed for a row to pass this validation.
     * At least one of minValue and maxValue need to be provided.
     * 
     */
    @Import(name="minValue")
    private @Nullable Output<String> minValue;

    /**
     * @return The minimum column statistic value allowed for a row to pass this validation.
     * At least one of minValue and maxValue need to be provided.
     * 
     */
    public Optional<Output<String>> minValue() {
        return Optional.ofNullable(this.minValue);
    }

    /**
     * column statistics.
     * Possible values are: `STATISTIC_UNDEFINED`, `MEAN`, `MIN`, `MAX`.
     * 
     */
    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    /**
     * @return column statistics.
     * Possible values are: `STATISTIC_UNDEFINED`, `MEAN`, `MIN`, `MAX`.
     * 
     */
    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    /**
     * Whether column statistic needs to be strictly lesser than (&#39;&lt;&#39;) the maximum, or if equality is allowed.
     * Only relevant if a maxValue has been defined. Default = false.
     * 
     */
    @Import(name="strictMaxEnabled")
    private @Nullable Output<Boolean> strictMaxEnabled;

    /**
     * @return Whether column statistic needs to be strictly lesser than (&#39;&lt;&#39;) the maximum, or if equality is allowed.
     * Only relevant if a maxValue has been defined. Default = false.
     * 
     */
    public Optional<Output<Boolean>> strictMaxEnabled() {
        return Optional.ofNullable(this.strictMaxEnabled);
    }

    /**
     * Whether column statistic needs to be strictly greater than (&#39;&gt;&#39;) the minimum, or if equality is allowed.
     * Only relevant if a minValue has been defined. Default = false.
     * 
     */
    @Import(name="strictMinEnabled")
    private @Nullable Output<Boolean> strictMinEnabled;

    /**
     * @return Whether column statistic needs to be strictly greater than (&#39;&gt;&#39;) the minimum, or if equality is allowed.
     * Only relevant if a minValue has been defined. Default = false.
     * 
     */
    public Optional<Output<Boolean>> strictMinEnabled() {
        return Optional.ofNullable(this.strictMinEnabled);
    }

    private DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs() {}

    private DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs(DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs $) {
        this.maxValue = $.maxValue;
        this.minValue = $.minValue;
        this.statistic = $.statistic;
        this.strictMaxEnabled = $.strictMaxEnabled;
        this.strictMinEnabled = $.strictMinEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs $;

        public Builder() {
            $ = new DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs();
        }

        public Builder(DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs defaults) {
            $ = new DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxValue The maximum column statistic value allowed for a row to pass this validation.
         * At least one of minValue and maxValue need to be provided.
         * 
         * @return builder
         * 
         */
        public Builder maxValue(@Nullable Output<String> maxValue) {
            $.maxValue = maxValue;
            return this;
        }

        /**
         * @param maxValue The maximum column statistic value allowed for a row to pass this validation.
         * At least one of minValue and maxValue need to be provided.
         * 
         * @return builder
         * 
         */
        public Builder maxValue(String maxValue) {
            return maxValue(Output.of(maxValue));
        }

        /**
         * @param minValue The minimum column statistic value allowed for a row to pass this validation.
         * At least one of minValue and maxValue need to be provided.
         * 
         * @return builder
         * 
         */
        public Builder minValue(@Nullable Output<String> minValue) {
            $.minValue = minValue;
            return this;
        }

        /**
         * @param minValue The minimum column statistic value allowed for a row to pass this validation.
         * At least one of minValue and maxValue need to be provided.
         * 
         * @return builder
         * 
         */
        public Builder minValue(String minValue) {
            return minValue(Output.of(minValue));
        }

        /**
         * @param statistic column statistics.
         * Possible values are: `STATISTIC_UNDEFINED`, `MEAN`, `MIN`, `MAX`.
         * 
         * @return builder
         * 
         */
        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param statistic column statistics.
         * Possible values are: `STATISTIC_UNDEFINED`, `MEAN`, `MIN`, `MAX`.
         * 
         * @return builder
         * 
         */
        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        /**
         * @param strictMaxEnabled Whether column statistic needs to be strictly lesser than (&#39;&lt;&#39;) the maximum, or if equality is allowed.
         * Only relevant if a maxValue has been defined. Default = false.
         * 
         * @return builder
         * 
         */
        public Builder strictMaxEnabled(@Nullable Output<Boolean> strictMaxEnabled) {
            $.strictMaxEnabled = strictMaxEnabled;
            return this;
        }

        /**
         * @param strictMaxEnabled Whether column statistic needs to be strictly lesser than (&#39;&lt;&#39;) the maximum, or if equality is allowed.
         * Only relevant if a maxValue has been defined. Default = false.
         * 
         * @return builder
         * 
         */
        public Builder strictMaxEnabled(Boolean strictMaxEnabled) {
            return strictMaxEnabled(Output.of(strictMaxEnabled));
        }

        /**
         * @param strictMinEnabled Whether column statistic needs to be strictly greater than (&#39;&gt;&#39;) the minimum, or if equality is allowed.
         * Only relevant if a minValue has been defined. Default = false.
         * 
         * @return builder
         * 
         */
        public Builder strictMinEnabled(@Nullable Output<Boolean> strictMinEnabled) {
            $.strictMinEnabled = strictMinEnabled;
            return this;
        }

        /**
         * @param strictMinEnabled Whether column statistic needs to be strictly greater than (&#39;&gt;&#39;) the minimum, or if equality is allowed.
         * Only relevant if a minValue has been defined. Default = false.
         * 
         * @return builder
         * 
         */
        public Builder strictMinEnabled(Boolean strictMinEnabled) {
            return strictMinEnabled(Output.of(strictMinEnabled));
        }

        public DatascanDataQualityResultRuleRuleStatisticRangeExpectationArgs build() {
            return $;
        }
    }

}