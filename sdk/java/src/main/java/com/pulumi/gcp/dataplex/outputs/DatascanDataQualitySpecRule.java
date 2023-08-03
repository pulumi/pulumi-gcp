// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleNonNullExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleRangeExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleRegexExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleRowConditionExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleSetExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleStatisticRangeExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleTableConditionExpectation;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRuleUniquenessExpectation;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataQualitySpecRule {
    /**
     * @return The unnested column which this rule is evaluated against.
     * 
     */
    private @Nullable String column;
    /**
     * @return The dimension a rule belongs to. Results are also aggregated at the dimension level. Supported dimensions are [&#34;COMPLETENESS&#34;, &#34;ACCURACY&#34;, &#34;CONSISTENCY&#34;, &#34;VALIDITY&#34;, &#34;UNIQUENESS&#34;, &#34;INTEGRITY&#34;]
     * 
     */
    private String dimension;
    /**
     * @return Rows with null values will automatically fail a rule, unless ignoreNull is true. In that case, such null rows are trivially considered passing. Only applicable to ColumnMap rules.
     * 
     */
    private @Nullable Boolean ignoreNull;
    /**
     * @return ColumnMap rule which evaluates whether each column value is null.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleNonNullExpectation nonNullExpectation;
    /**
     * @return ColumnMap rule which evaluates whether each column value lies between a specified range.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleRangeExpectation rangeExpectation;
    /**
     * @return ColumnMap rule which evaluates whether each column value matches a specified regex.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleRegexExpectation regexExpectation;
    /**
     * @return Table rule which evaluates whether each row passes the specified condition.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleRowConditionExpectation rowConditionExpectation;
    /**
     * @return ColumnMap rule which evaluates whether each column value is contained by a specified set.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleSetExpectation setExpectation;
    /**
     * @return ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleStatisticRangeExpectation statisticRangeExpectation;
    /**
     * @return Table rule which evaluates whether the provided expression is true.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleTableConditionExpectation tableConditionExpectation;
    /**
     * @return The minimum ratio of passing_rows / total_rows required to pass this rule, with a range of [0.0, 1.0]. 0 indicates default value (i.e. 1.0).
     * 
     */
    private @Nullable Double threshold;
    /**
     * @return ColumnAggregate rule which evaluates whether the column has duplicates.
     * 
     */
    private @Nullable DatascanDataQualitySpecRuleUniquenessExpectation uniquenessExpectation;

    private DatascanDataQualitySpecRule() {}
    /**
     * @return The unnested column which this rule is evaluated against.
     * 
     */
    public Optional<String> column() {
        return Optional.ofNullable(this.column);
    }
    /**
     * @return The dimension a rule belongs to. Results are also aggregated at the dimension level. Supported dimensions are [&#34;COMPLETENESS&#34;, &#34;ACCURACY&#34;, &#34;CONSISTENCY&#34;, &#34;VALIDITY&#34;, &#34;UNIQUENESS&#34;, &#34;INTEGRITY&#34;]
     * 
     */
    public String dimension() {
        return this.dimension;
    }
    /**
     * @return Rows with null values will automatically fail a rule, unless ignoreNull is true. In that case, such null rows are trivially considered passing. Only applicable to ColumnMap rules.
     * 
     */
    public Optional<Boolean> ignoreNull() {
        return Optional.ofNullable(this.ignoreNull);
    }
    /**
     * @return ColumnMap rule which evaluates whether each column value is null.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleNonNullExpectation> nonNullExpectation() {
        return Optional.ofNullable(this.nonNullExpectation);
    }
    /**
     * @return ColumnMap rule which evaluates whether each column value lies between a specified range.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleRangeExpectation> rangeExpectation() {
        return Optional.ofNullable(this.rangeExpectation);
    }
    /**
     * @return ColumnMap rule which evaluates whether each column value matches a specified regex.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleRegexExpectation> regexExpectation() {
        return Optional.ofNullable(this.regexExpectation);
    }
    /**
     * @return Table rule which evaluates whether each row passes the specified condition.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleRowConditionExpectation> rowConditionExpectation() {
        return Optional.ofNullable(this.rowConditionExpectation);
    }
    /**
     * @return ColumnMap rule which evaluates whether each column value is contained by a specified set.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleSetExpectation> setExpectation() {
        return Optional.ofNullable(this.setExpectation);
    }
    /**
     * @return ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleStatisticRangeExpectation> statisticRangeExpectation() {
        return Optional.ofNullable(this.statisticRangeExpectation);
    }
    /**
     * @return Table rule which evaluates whether the provided expression is true.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleTableConditionExpectation> tableConditionExpectation() {
        return Optional.ofNullable(this.tableConditionExpectation);
    }
    /**
     * @return The minimum ratio of passing_rows / total_rows required to pass this rule, with a range of [0.0, 1.0]. 0 indicates default value (i.e. 1.0).
     * 
     */
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return ColumnAggregate rule which evaluates whether the column has duplicates.
     * 
     */
    public Optional<DatascanDataQualitySpecRuleUniquenessExpectation> uniquenessExpectation() {
        return Optional.ofNullable(this.uniquenessExpectation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataQualitySpecRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String column;
        private String dimension;
        private @Nullable Boolean ignoreNull;
        private @Nullable DatascanDataQualitySpecRuleNonNullExpectation nonNullExpectation;
        private @Nullable DatascanDataQualitySpecRuleRangeExpectation rangeExpectation;
        private @Nullable DatascanDataQualitySpecRuleRegexExpectation regexExpectation;
        private @Nullable DatascanDataQualitySpecRuleRowConditionExpectation rowConditionExpectation;
        private @Nullable DatascanDataQualitySpecRuleSetExpectation setExpectation;
        private @Nullable DatascanDataQualitySpecRuleStatisticRangeExpectation statisticRangeExpectation;
        private @Nullable DatascanDataQualitySpecRuleTableConditionExpectation tableConditionExpectation;
        private @Nullable Double threshold;
        private @Nullable DatascanDataQualitySpecRuleUniquenessExpectation uniquenessExpectation;
        public Builder() {}
        public Builder(DatascanDataQualitySpecRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.dimension = defaults.dimension;
    	      this.ignoreNull = defaults.ignoreNull;
    	      this.nonNullExpectation = defaults.nonNullExpectation;
    	      this.rangeExpectation = defaults.rangeExpectation;
    	      this.regexExpectation = defaults.regexExpectation;
    	      this.rowConditionExpectation = defaults.rowConditionExpectation;
    	      this.setExpectation = defaults.setExpectation;
    	      this.statisticRangeExpectation = defaults.statisticRangeExpectation;
    	      this.tableConditionExpectation = defaults.tableConditionExpectation;
    	      this.threshold = defaults.threshold;
    	      this.uniquenessExpectation = defaults.uniquenessExpectation;
        }

        @CustomType.Setter
        public Builder column(@Nullable String column) {
            this.column = column;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(String dimension) {
            this.dimension = Objects.requireNonNull(dimension);
            return this;
        }
        @CustomType.Setter
        public Builder ignoreNull(@Nullable Boolean ignoreNull) {
            this.ignoreNull = ignoreNull;
            return this;
        }
        @CustomType.Setter
        public Builder nonNullExpectation(@Nullable DatascanDataQualitySpecRuleNonNullExpectation nonNullExpectation) {
            this.nonNullExpectation = nonNullExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder rangeExpectation(@Nullable DatascanDataQualitySpecRuleRangeExpectation rangeExpectation) {
            this.rangeExpectation = rangeExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder regexExpectation(@Nullable DatascanDataQualitySpecRuleRegexExpectation regexExpectation) {
            this.regexExpectation = regexExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder rowConditionExpectation(@Nullable DatascanDataQualitySpecRuleRowConditionExpectation rowConditionExpectation) {
            this.rowConditionExpectation = rowConditionExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder setExpectation(@Nullable DatascanDataQualitySpecRuleSetExpectation setExpectation) {
            this.setExpectation = setExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder statisticRangeExpectation(@Nullable DatascanDataQualitySpecRuleStatisticRangeExpectation statisticRangeExpectation) {
            this.statisticRangeExpectation = statisticRangeExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder tableConditionExpectation(@Nullable DatascanDataQualitySpecRuleTableConditionExpectation tableConditionExpectation) {
            this.tableConditionExpectation = tableConditionExpectation;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder uniquenessExpectation(@Nullable DatascanDataQualitySpecRuleUniquenessExpectation uniquenessExpectation) {
            this.uniquenessExpectation = uniquenessExpectation;
            return this;
        }
        public DatascanDataQualitySpecRule build() {
            final var o = new DatascanDataQualitySpecRule();
            o.column = column;
            o.dimension = dimension;
            o.ignoreNull = ignoreNull;
            o.nonNullExpectation = nonNullExpectation;
            o.rangeExpectation = rangeExpectation;
            o.regexExpectation = regexExpectation;
            o.rowConditionExpectation = rowConditionExpectation;
            o.setExpectation = setExpectation;
            o.statisticRangeExpectation = statisticRangeExpectation;
            o.tableConditionExpectation = tableConditionExpectation;
            o.threshold = threshold;
            o.uniquenessExpectation = uniquenessExpectation;
            return o;
        }
    }
}