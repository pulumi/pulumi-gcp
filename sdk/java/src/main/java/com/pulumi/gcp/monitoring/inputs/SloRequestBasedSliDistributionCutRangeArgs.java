// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloRequestBasedSliDistributionCutRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloRequestBasedSliDistributionCutRangeArgs Empty = new SloRequestBasedSliDistributionCutRangeArgs();

    /**
     * max value for the range (inclusive). If not given,
     * will be set to &#34;infinity&#34;, defining an open range
     * &#34;&gt;= range.min&#34;
     * 
     */
    @Import(name="max")
    private @Nullable Output<Double> max;

    /**
     * @return max value for the range (inclusive). If not given,
     * will be set to &#34;infinity&#34;, defining an open range
     * &#34;&gt;= range.min&#34;
     * 
     */
    public Optional<Output<Double>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * Min value for the range (inclusive). If not given,
     * will be set to &#34;-infinity&#34;, defining an open range
     * &#34;&lt; range.max&#34;
     * 
     */
    @Import(name="min")
    private @Nullable Output<Double> min;

    /**
     * @return Min value for the range (inclusive). If not given,
     * will be set to &#34;-infinity&#34;, defining an open range
     * &#34;&lt; range.max&#34;
     * 
     */
    public Optional<Output<Double>> min() {
        return Optional.ofNullable(this.min);
    }

    private SloRequestBasedSliDistributionCutRangeArgs() {}

    private SloRequestBasedSliDistributionCutRangeArgs(SloRequestBasedSliDistributionCutRangeArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloRequestBasedSliDistributionCutRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloRequestBasedSliDistributionCutRangeArgs $;

        public Builder() {
            $ = new SloRequestBasedSliDistributionCutRangeArgs();
        }

        public Builder(SloRequestBasedSliDistributionCutRangeArgs defaults) {
            $ = new SloRequestBasedSliDistributionCutRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max max value for the range (inclusive). If not given,
         * will be set to &#34;infinity&#34;, defining an open range
         * &#34;&gt;= range.min&#34;
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<Double> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max max value for the range (inclusive). If not given,
         * will be set to &#34;infinity&#34;, defining an open range
         * &#34;&gt;= range.min&#34;
         * 
         * @return builder
         * 
         */
        public Builder max(Double max) {
            return max(Output.of(max));
        }

        /**
         * @param min Min value for the range (inclusive). If not given,
         * will be set to &#34;-infinity&#34;, defining an open range
         * &#34;&lt; range.max&#34;
         * 
         * @return builder
         * 
         */
        public Builder min(@Nullable Output<Double> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min Min value for the range (inclusive). If not given,
         * will be set to &#34;-infinity&#34;, defining an open range
         * &#34;&lt; range.max&#34;
         * 
         * @return builder
         * 
         */
        public Builder min(Double min) {
            return min(Output.of(min));
        }

        public SloRequestBasedSliDistributionCutRangeArgs build() {
            return $;
        }
    }

}
