// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.SloRequestBasedSliDistributionCutRange;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SloRequestBasedSliDistributionCut {
    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final String distributionFilter;
    /**
     * @return Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min &lt;= X &lt;= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    private final SloRequestBasedSliDistributionCutRange range;

    @CustomType.Constructor
    private SloRequestBasedSliDistributionCut(
        @CustomType.Parameter("distributionFilter") String distributionFilter,
        @CustomType.Parameter("range") SloRequestBasedSliDistributionCutRange range) {
        this.distributionFilter = distributionFilter;
        this.range = range;
    }

    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public String distributionFilter() {
        return this.distributionFilter;
    }
    /**
     * @return Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min &lt;= X &lt;= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    public SloRequestBasedSliDistributionCutRange range() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloRequestBasedSliDistributionCut defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionFilter;
        private SloRequestBasedSliDistributionCutRange range;

        public Builder() {
    	      // Empty
        }

        public Builder(SloRequestBasedSliDistributionCut defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder distributionFilter(String distributionFilter) {
            this.distributionFilter = Objects.requireNonNull(distributionFilter);
            return this;
        }
        public Builder range(SloRequestBasedSliDistributionCutRange range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }        public SloRequestBasedSliDistributionCut build() {
            return new SloRequestBasedSliDistributionCut(distributionFilter, range);
        }
    }
}