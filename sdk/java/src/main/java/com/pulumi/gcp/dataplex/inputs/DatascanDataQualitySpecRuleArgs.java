// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleNonNullExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRangeExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRegexExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRowConditionExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSetExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleStatisticRangeExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTableConditionExpectationArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleUniquenessExpectationArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanDataQualitySpecRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataQualitySpecRuleArgs Empty = new DatascanDataQualitySpecRuleArgs();

    /**
     * The unnested column which this rule is evaluated against.
     * 
     */
    @Import(name="column")
    private @Nullable Output<String> column;

    /**
     * @return The unnested column which this rule is evaluated against.
     * 
     */
    public Optional<Output<String>> column() {
        return Optional.ofNullable(this.column);
    }

    /**
     * The dimension a rule belongs to. Results are also aggregated at the dimension level. Supported dimensions are [&#34;COMPLETENESS&#34;, &#34;ACCURACY&#34;, &#34;CONSISTENCY&#34;, &#34;VALIDITY&#34;, &#34;UNIQUENESS&#34;, &#34;INTEGRITY&#34;]
     * 
     */
    @Import(name="dimension", required=true)
    private Output<String> dimension;

    /**
     * @return The dimension a rule belongs to. Results are also aggregated at the dimension level. Supported dimensions are [&#34;COMPLETENESS&#34;, &#34;ACCURACY&#34;, &#34;CONSISTENCY&#34;, &#34;VALIDITY&#34;, &#34;UNIQUENESS&#34;, &#34;INTEGRITY&#34;]
     * 
     */
    public Output<String> dimension() {
        return this.dimension;
    }

    /**
     * Rows with null values will automatically fail a rule, unless ignoreNull is true. In that case, such null rows are trivially considered passing. Only applicable to ColumnMap rules.
     * 
     */
    @Import(name="ignoreNull")
    private @Nullable Output<Boolean> ignoreNull;

    /**
     * @return Rows with null values will automatically fail a rule, unless ignoreNull is true. In that case, such null rows are trivially considered passing. Only applicable to ColumnMap rules.
     * 
     */
    public Optional<Output<Boolean>> ignoreNull() {
        return Optional.ofNullable(this.ignoreNull);
    }

    /**
     * ColumnMap rule which evaluates whether each column value is null.
     * 
     */
    @Import(name="nonNullExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleNonNullExpectationArgs> nonNullExpectation;

    /**
     * @return ColumnMap rule which evaluates whether each column value is null.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleNonNullExpectationArgs>> nonNullExpectation() {
        return Optional.ofNullable(this.nonNullExpectation);
    }

    /**
     * ColumnMap rule which evaluates whether each column value lies between a specified range.
     * Structure is documented below.
     * 
     */
    @Import(name="rangeExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleRangeExpectationArgs> rangeExpectation;

    /**
     * @return ColumnMap rule which evaluates whether each column value lies between a specified range.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleRangeExpectationArgs>> rangeExpectation() {
        return Optional.ofNullable(this.rangeExpectation);
    }

    /**
     * ColumnMap rule which evaluates whether each column value matches a specified regex.
     * Structure is documented below.
     * 
     */
    @Import(name="regexExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleRegexExpectationArgs> regexExpectation;

    /**
     * @return ColumnMap rule which evaluates whether each column value matches a specified regex.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleRegexExpectationArgs>> regexExpectation() {
        return Optional.ofNullable(this.regexExpectation);
    }

    /**
     * Table rule which evaluates whether each row passes the specified condition.
     * Structure is documented below.
     * 
     */
    @Import(name="rowConditionExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleRowConditionExpectationArgs> rowConditionExpectation;

    /**
     * @return Table rule which evaluates whether each row passes the specified condition.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleRowConditionExpectationArgs>> rowConditionExpectation() {
        return Optional.ofNullable(this.rowConditionExpectation);
    }

    /**
     * ColumnMap rule which evaluates whether each column value is contained by a specified set.
     * Structure is documented below.
     * 
     */
    @Import(name="setExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleSetExpectationArgs> setExpectation;

    /**
     * @return ColumnMap rule which evaluates whether each column value is contained by a specified set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleSetExpectationArgs>> setExpectation() {
        return Optional.ofNullable(this.setExpectation);
    }

    /**
     * ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
     * Structure is documented below.
     * 
     */
    @Import(name="statisticRangeExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleStatisticRangeExpectationArgs> statisticRangeExpectation;

    /**
     * @return ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleStatisticRangeExpectationArgs>> statisticRangeExpectation() {
        return Optional.ofNullable(this.statisticRangeExpectation);
    }

    /**
     * Table rule which evaluates whether the provided expression is true.
     * Structure is documented below.
     * 
     */
    @Import(name="tableConditionExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleTableConditionExpectationArgs> tableConditionExpectation;

    /**
     * @return Table rule which evaluates whether the provided expression is true.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleTableConditionExpectationArgs>> tableConditionExpectation() {
        return Optional.ofNullable(this.tableConditionExpectation);
    }

    /**
     * The minimum ratio of passing_rows / total_rows required to pass this rule, with a range of [0.0, 1.0]. 0 indicates default value (i.e. 1.0).
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    /**
     * @return The minimum ratio of passing_rows / total_rows required to pass this rule, with a range of [0.0, 1.0]. 0 indicates default value (i.e. 1.0).
     * 
     */
    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * ColumnAggregate rule which evaluates whether the column has duplicates.
     * 
     */
    @Import(name="uniquenessExpectation")
    private @Nullable Output<DatascanDataQualitySpecRuleUniquenessExpectationArgs> uniquenessExpectation;

    /**
     * @return ColumnAggregate rule which evaluates whether the column has duplicates.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecRuleUniquenessExpectationArgs>> uniquenessExpectation() {
        return Optional.ofNullable(this.uniquenessExpectation);
    }

    private DatascanDataQualitySpecRuleArgs() {}

    private DatascanDataQualitySpecRuleArgs(DatascanDataQualitySpecRuleArgs $) {
        this.column = $.column;
        this.dimension = $.dimension;
        this.ignoreNull = $.ignoreNull;
        this.nonNullExpectation = $.nonNullExpectation;
        this.rangeExpectation = $.rangeExpectation;
        this.regexExpectation = $.regexExpectation;
        this.rowConditionExpectation = $.rowConditionExpectation;
        this.setExpectation = $.setExpectation;
        this.statisticRangeExpectation = $.statisticRangeExpectation;
        this.tableConditionExpectation = $.tableConditionExpectation;
        this.threshold = $.threshold;
        this.uniquenessExpectation = $.uniquenessExpectation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataQualitySpecRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataQualitySpecRuleArgs $;

        public Builder() {
            $ = new DatascanDataQualitySpecRuleArgs();
        }

        public Builder(DatascanDataQualitySpecRuleArgs defaults) {
            $ = new DatascanDataQualitySpecRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param column The unnested column which this rule is evaluated against.
         * 
         * @return builder
         * 
         */
        public Builder column(@Nullable Output<String> column) {
            $.column = column;
            return this;
        }

        /**
         * @param column The unnested column which this rule is evaluated against.
         * 
         * @return builder
         * 
         */
        public Builder column(String column) {
            return column(Output.of(column));
        }

        /**
         * @param dimension The dimension a rule belongs to. Results are also aggregated at the dimension level. Supported dimensions are [&#34;COMPLETENESS&#34;, &#34;ACCURACY&#34;, &#34;CONSISTENCY&#34;, &#34;VALIDITY&#34;, &#34;UNIQUENESS&#34;, &#34;INTEGRITY&#34;]
         * 
         * @return builder
         * 
         */
        public Builder dimension(Output<String> dimension) {
            $.dimension = dimension;
            return this;
        }

        /**
         * @param dimension The dimension a rule belongs to. Results are also aggregated at the dimension level. Supported dimensions are [&#34;COMPLETENESS&#34;, &#34;ACCURACY&#34;, &#34;CONSISTENCY&#34;, &#34;VALIDITY&#34;, &#34;UNIQUENESS&#34;, &#34;INTEGRITY&#34;]
         * 
         * @return builder
         * 
         */
        public Builder dimension(String dimension) {
            return dimension(Output.of(dimension));
        }

        /**
         * @param ignoreNull Rows with null values will automatically fail a rule, unless ignoreNull is true. In that case, such null rows are trivially considered passing. Only applicable to ColumnMap rules.
         * 
         * @return builder
         * 
         */
        public Builder ignoreNull(@Nullable Output<Boolean> ignoreNull) {
            $.ignoreNull = ignoreNull;
            return this;
        }

        /**
         * @param ignoreNull Rows with null values will automatically fail a rule, unless ignoreNull is true. In that case, such null rows are trivially considered passing. Only applicable to ColumnMap rules.
         * 
         * @return builder
         * 
         */
        public Builder ignoreNull(Boolean ignoreNull) {
            return ignoreNull(Output.of(ignoreNull));
        }

        /**
         * @param nonNullExpectation ColumnMap rule which evaluates whether each column value is null.
         * 
         * @return builder
         * 
         */
        public Builder nonNullExpectation(@Nullable Output<DatascanDataQualitySpecRuleNonNullExpectationArgs> nonNullExpectation) {
            $.nonNullExpectation = nonNullExpectation;
            return this;
        }

        /**
         * @param nonNullExpectation ColumnMap rule which evaluates whether each column value is null.
         * 
         * @return builder
         * 
         */
        public Builder nonNullExpectation(DatascanDataQualitySpecRuleNonNullExpectationArgs nonNullExpectation) {
            return nonNullExpectation(Output.of(nonNullExpectation));
        }

        /**
         * @param rangeExpectation ColumnMap rule which evaluates whether each column value lies between a specified range.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rangeExpectation(@Nullable Output<DatascanDataQualitySpecRuleRangeExpectationArgs> rangeExpectation) {
            $.rangeExpectation = rangeExpectation;
            return this;
        }

        /**
         * @param rangeExpectation ColumnMap rule which evaluates whether each column value lies between a specified range.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rangeExpectation(DatascanDataQualitySpecRuleRangeExpectationArgs rangeExpectation) {
            return rangeExpectation(Output.of(rangeExpectation));
        }

        /**
         * @param regexExpectation ColumnMap rule which evaluates whether each column value matches a specified regex.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder regexExpectation(@Nullable Output<DatascanDataQualitySpecRuleRegexExpectationArgs> regexExpectation) {
            $.regexExpectation = regexExpectation;
            return this;
        }

        /**
         * @param regexExpectation ColumnMap rule which evaluates whether each column value matches a specified regex.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder regexExpectation(DatascanDataQualitySpecRuleRegexExpectationArgs regexExpectation) {
            return regexExpectation(Output.of(regexExpectation));
        }

        /**
         * @param rowConditionExpectation Table rule which evaluates whether each row passes the specified condition.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rowConditionExpectation(@Nullable Output<DatascanDataQualitySpecRuleRowConditionExpectationArgs> rowConditionExpectation) {
            $.rowConditionExpectation = rowConditionExpectation;
            return this;
        }

        /**
         * @param rowConditionExpectation Table rule which evaluates whether each row passes the specified condition.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rowConditionExpectation(DatascanDataQualitySpecRuleRowConditionExpectationArgs rowConditionExpectation) {
            return rowConditionExpectation(Output.of(rowConditionExpectation));
        }

        /**
         * @param setExpectation ColumnMap rule which evaluates whether each column value is contained by a specified set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder setExpectation(@Nullable Output<DatascanDataQualitySpecRuleSetExpectationArgs> setExpectation) {
            $.setExpectation = setExpectation;
            return this;
        }

        /**
         * @param setExpectation ColumnMap rule which evaluates whether each column value is contained by a specified set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder setExpectation(DatascanDataQualitySpecRuleSetExpectationArgs setExpectation) {
            return setExpectation(Output.of(setExpectation));
        }

        /**
         * @param statisticRangeExpectation ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder statisticRangeExpectation(@Nullable Output<DatascanDataQualitySpecRuleStatisticRangeExpectationArgs> statisticRangeExpectation) {
            $.statisticRangeExpectation = statisticRangeExpectation;
            return this;
        }

        /**
         * @param statisticRangeExpectation ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder statisticRangeExpectation(DatascanDataQualitySpecRuleStatisticRangeExpectationArgs statisticRangeExpectation) {
            return statisticRangeExpectation(Output.of(statisticRangeExpectation));
        }

        /**
         * @param tableConditionExpectation Table rule which evaluates whether the provided expression is true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tableConditionExpectation(@Nullable Output<DatascanDataQualitySpecRuleTableConditionExpectationArgs> tableConditionExpectation) {
            $.tableConditionExpectation = tableConditionExpectation;
            return this;
        }

        /**
         * @param tableConditionExpectation Table rule which evaluates whether the provided expression is true.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tableConditionExpectation(DatascanDataQualitySpecRuleTableConditionExpectationArgs tableConditionExpectation) {
            return tableConditionExpectation(Output.of(tableConditionExpectation));
        }

        /**
         * @param threshold The minimum ratio of passing_rows / total_rows required to pass this rule, with a range of [0.0, 1.0]. 0 indicates default value (i.e. 1.0).
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The minimum ratio of passing_rows / total_rows required to pass this rule, with a range of [0.0, 1.0]. 0 indicates default value (i.e. 1.0).
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param uniquenessExpectation ColumnAggregate rule which evaluates whether the column has duplicates.
         * 
         * @return builder
         * 
         */
        public Builder uniquenessExpectation(@Nullable Output<DatascanDataQualitySpecRuleUniquenessExpectationArgs> uniquenessExpectation) {
            $.uniquenessExpectation = uniquenessExpectation;
            return this;
        }

        /**
         * @param uniquenessExpectation ColumnAggregate rule which evaluates whether the column has duplicates.
         * 
         * @return builder
         * 
         */
        public Builder uniquenessExpectation(DatascanDataQualitySpecRuleUniquenessExpectationArgs uniquenessExpectation) {
            return uniquenessExpectation(Output.of(uniquenessExpectation));
        }

        public DatascanDataQualitySpecRuleArgs build() {
            $.dimension = Objects.requireNonNull($.dimension, "expected parameter 'dimension' to be non-null");
            return $;
        }
    }

}