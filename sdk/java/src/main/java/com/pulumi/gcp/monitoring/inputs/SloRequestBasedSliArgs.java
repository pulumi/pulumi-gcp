// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutArgs;
import com.pulumi.gcp.monitoring.inputs.SloRequestBasedSliGoodTotalRatioArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloRequestBasedSliArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloRequestBasedSliArgs Empty = new SloRequestBasedSliArgs();

    /**
     * Used when good_service is defined by a count of values aggregated in a
     * Distribution that fall into a good range. The total_service is the
     * total count of all values aggregated in the Distribution.
     * Defines a distribution TimeSeries filter and thresholds used for
     * measuring good service and total service.
     * Structure is documented below.
     * 
     */
    @Import(name="distributionCut")
    private @Nullable Output<SloRequestBasedSliDistributionCutArgs> distributionCut;

    /**
     * @return Used when good_service is defined by a count of values aggregated in a
     * Distribution that fall into a good range. The total_service is the
     * total count of all values aggregated in the Distribution.
     * Defines a distribution TimeSeries filter and thresholds used for
     * measuring good service and total service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SloRequestBasedSliDistributionCutArgs>> distributionCut() {
        return Optional.ofNullable(this.distributionCut);
    }

    /**
     * A means to compute a ratio of `good_service` to `total_service`.
     * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     * Must specify exactly two of good, bad, and total service filters.
     * The relationship good_service + bad_service = total_service
     * will be assumed.
     * Structure is documented below.
     * 
     */
    @Import(name="goodTotalRatio")
    private @Nullable Output<SloRequestBasedSliGoodTotalRatioArgs> goodTotalRatio;

    /**
     * @return A means to compute a ratio of `good_service` to `total_service`.
     * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     * Must specify exactly two of good, bad, and total service filters.
     * The relationship good_service + bad_service = total_service
     * will be assumed.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SloRequestBasedSliGoodTotalRatioArgs>> goodTotalRatio() {
        return Optional.ofNullable(this.goodTotalRatio);
    }

    private SloRequestBasedSliArgs() {}

    private SloRequestBasedSliArgs(SloRequestBasedSliArgs $) {
        this.distributionCut = $.distributionCut;
        this.goodTotalRatio = $.goodTotalRatio;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloRequestBasedSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloRequestBasedSliArgs $;

        public Builder() {
            $ = new SloRequestBasedSliArgs();
        }

        public Builder(SloRequestBasedSliArgs defaults) {
            $ = new SloRequestBasedSliArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributionCut Used when good_service is defined by a count of values aggregated in a
         * Distribution that fall into a good range. The total_service is the
         * total count of all values aggregated in the Distribution.
         * Defines a distribution TimeSeries filter and thresholds used for
         * measuring good service and total service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder distributionCut(@Nullable Output<SloRequestBasedSliDistributionCutArgs> distributionCut) {
            $.distributionCut = distributionCut;
            return this;
        }

        /**
         * @param distributionCut Used when good_service is defined by a count of values aggregated in a
         * Distribution that fall into a good range. The total_service is the
         * total count of all values aggregated in the Distribution.
         * Defines a distribution TimeSeries filter and thresholds used for
         * measuring good service and total service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder distributionCut(SloRequestBasedSliDistributionCutArgs distributionCut) {
            return distributionCut(Output.of(distributionCut));
        }

        /**
         * @param goodTotalRatio A means to compute a ratio of `good_service` to `total_service`.
         * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
         * Must specify exactly two of good, bad, and total service filters.
         * The relationship good_service + bad_service = total_service
         * will be assumed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder goodTotalRatio(@Nullable Output<SloRequestBasedSliGoodTotalRatioArgs> goodTotalRatio) {
            $.goodTotalRatio = goodTotalRatio;
            return this;
        }

        /**
         * @param goodTotalRatio A means to compute a ratio of `good_service` to `total_service`.
         * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
         * Must specify exactly two of good, bad, and total service filters.
         * The relationship good_service + bad_service = total_service
         * will be assumed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder goodTotalRatio(SloRequestBasedSliGoodTotalRatioArgs goodTotalRatio) {
            return goodTotalRatio(Output.of(goodTotalRatio));
        }

        public SloRequestBasedSliArgs build() {
            return $;
        }
    }

}