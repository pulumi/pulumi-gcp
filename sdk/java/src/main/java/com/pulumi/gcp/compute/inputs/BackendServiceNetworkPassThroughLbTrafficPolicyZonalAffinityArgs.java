// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs Empty = new BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs();

    /**
     * This field indicates whether zonal affinity is enabled or not.
     * Default value is `ZONAL_AFFINITY_DISABLED`.
     * Possible values are: `ZONAL_AFFINITY_DISABLED`, `ZONAL_AFFINITY_SPILL_CROSS_ZONE`, `ZONAL_AFFINITY_STAY_WITHIN_ZONE`.
     * 
     */
    @Import(name="spillover")
    private @Nullable Output<String> spillover;

    /**
     * @return This field indicates whether zonal affinity is enabled or not.
     * Default value is `ZONAL_AFFINITY_DISABLED`.
     * Possible values are: `ZONAL_AFFINITY_DISABLED`, `ZONAL_AFFINITY_SPILL_CROSS_ZONE`, `ZONAL_AFFINITY_STAY_WITHIN_ZONE`.
     * 
     */
    public Optional<Output<String>> spillover() {
        return Optional.ofNullable(this.spillover);
    }

    /**
     * The value of the field must be in [0, 1]. When the ratio of the count of healthy backend endpoints in a zone
     * to the count of backend endpoints in that same zone is equal to or above this threshold, the load balancer
     * distributes new connections to all healthy endpoints in the local zone only. When the ratio of the count
     * of healthy backend endpoints in a zone to the count of backend endpoints in that same zone is below this
     * threshold, the load balancer distributes all new connections to all healthy endpoints across all zones.
     * 
     */
    @Import(name="spilloverRatio")
    private @Nullable Output<Double> spilloverRatio;

    /**
     * @return The value of the field must be in [0, 1]. When the ratio of the count of healthy backend endpoints in a zone
     * to the count of backend endpoints in that same zone is equal to or above this threshold, the load balancer
     * distributes new connections to all healthy endpoints in the local zone only. When the ratio of the count
     * of healthy backend endpoints in a zone to the count of backend endpoints in that same zone is below this
     * threshold, the load balancer distributes all new connections to all healthy endpoints across all zones.
     * 
     */
    public Optional<Output<Double>> spilloverRatio() {
        return Optional.ofNullable(this.spilloverRatio);
    }

    private BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs() {}

    private BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs(BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs $) {
        this.spillover = $.spillover;
        this.spilloverRatio = $.spilloverRatio;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs $;

        public Builder() {
            $ = new BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs();
        }

        public Builder(BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs defaults) {
            $ = new BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param spillover This field indicates whether zonal affinity is enabled or not.
         * Default value is `ZONAL_AFFINITY_DISABLED`.
         * Possible values are: `ZONAL_AFFINITY_DISABLED`, `ZONAL_AFFINITY_SPILL_CROSS_ZONE`, `ZONAL_AFFINITY_STAY_WITHIN_ZONE`.
         * 
         * @return builder
         * 
         */
        public Builder spillover(@Nullable Output<String> spillover) {
            $.spillover = spillover;
            return this;
        }

        /**
         * @param spillover This field indicates whether zonal affinity is enabled or not.
         * Default value is `ZONAL_AFFINITY_DISABLED`.
         * Possible values are: `ZONAL_AFFINITY_DISABLED`, `ZONAL_AFFINITY_SPILL_CROSS_ZONE`, `ZONAL_AFFINITY_STAY_WITHIN_ZONE`.
         * 
         * @return builder
         * 
         */
        public Builder spillover(String spillover) {
            return spillover(Output.of(spillover));
        }

        /**
         * @param spilloverRatio The value of the field must be in [0, 1]. When the ratio of the count of healthy backend endpoints in a zone
         * to the count of backend endpoints in that same zone is equal to or above this threshold, the load balancer
         * distributes new connections to all healthy endpoints in the local zone only. When the ratio of the count
         * of healthy backend endpoints in a zone to the count of backend endpoints in that same zone is below this
         * threshold, the load balancer distributes all new connections to all healthy endpoints across all zones.
         * 
         * @return builder
         * 
         */
        public Builder spilloverRatio(@Nullable Output<Double> spilloverRatio) {
            $.spilloverRatio = spilloverRatio;
            return this;
        }

        /**
         * @param spilloverRatio The value of the field must be in [0, 1]. When the ratio of the count of healthy backend endpoints in a zone
         * to the count of backend endpoints in that same zone is equal to or above this threshold, the load balancer
         * distributes new connections to all healthy endpoints in the local zone only. When the ratio of the count
         * of healthy backend endpoints in a zone to the count of backend endpoints in that same zone is below this
         * threshold, the load balancer distributes all new connections to all healthy endpoints across all zones.
         * 
         * @return builder
         * 
         */
        public Builder spilloverRatio(Double spilloverRatio) {
            return spilloverRatio(Output.of(spilloverRatio));
        }

        public BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs build() {
            return $;
        }
    }

}
