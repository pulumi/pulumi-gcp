// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutRangeArgs;
import java.lang.String;
import java.util.Objects;


public final class SloRequestBasedSliDistributionCutArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloRequestBasedSliDistributionCutArgs Empty = new SloRequestBasedSliDistributionCutArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="distributionFilter", required=true)
    private Output<String> distributionFilter;

    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Output<String> distributionFilter() {
        return this.distributionFilter;
    }

    /**
     * Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max.
     * Structure is documented below.
     * 
     */
    @Import(name="range", required=true)
    private Output<SloRequestBasedSliDistributionCutRangeArgs> range;

    /**
     * @return Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max.
     * Structure is documented below.
     * 
     */
    public Output<SloRequestBasedSliDistributionCutRangeArgs> range() {
        return this.range;
    }

    private SloRequestBasedSliDistributionCutArgs() {}

    private SloRequestBasedSliDistributionCutArgs(SloRequestBasedSliDistributionCutArgs $) {
        this.distributionFilter = $.distributionFilter;
        this.range = $.range;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloRequestBasedSliDistributionCutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloRequestBasedSliDistributionCutArgs $;

        public Builder() {
            $ = new SloRequestBasedSliDistributionCutArgs();
        }

        public Builder(SloRequestBasedSliDistributionCutArgs defaults) {
            $ = new SloRequestBasedSliDistributionCutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributionFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * aggregating values to quantify the good service provided.
         * Must have ValueType = DISTRIBUTION and
         * MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder distributionFilter(Output<String> distributionFilter) {
            $.distributionFilter = distributionFilter;
            return this;
        }

        /**
         * @param distributionFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * aggregating values to quantify the good service provided.
         * Must have ValueType = DISTRIBUTION and
         * MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder distributionFilter(String distributionFilter) {
            return distributionFilter(Output.of(distributionFilter));
        }

        /**
         * @param range Range of numerical values. The computed good_service
         * will be the count of values x in the Distribution such
         * that range.min &lt;= x &lt;= range.max. inclusive of min and
         * max. Open ranges can be defined by setting
         * just one of min or max.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder range(Output<SloRequestBasedSliDistributionCutRangeArgs> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range Range of numerical values. The computed good_service
         * will be the count of values x in the Distribution such
         * that range.min &lt;= x &lt;= range.max. inclusive of min and
         * max. Open ranges can be defined by setting
         * just one of min or max.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder range(SloRequestBasedSliDistributionCutRangeArgs range) {
            return range(Output.of(range));
        }

        public SloRequestBasedSliDistributionCutArgs build() {
            if ($.distributionFilter == null) {
                throw new MissingRequiredPropertyException("SloRequestBasedSliDistributionCutArgs", "distributionFilter");
            }
            if ($.range == null) {
                throw new MissingRequiredPropertyException("SloRequestBasedSliDistributionCutArgs", "range");
            }
            return $;
        }
    }

}
