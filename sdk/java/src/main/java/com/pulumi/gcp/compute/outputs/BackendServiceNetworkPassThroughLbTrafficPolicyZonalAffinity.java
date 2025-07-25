// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinity {
    /**
     * @return This field indicates whether zonal affinity is enabled or not.
     * Default value is `ZONAL_AFFINITY_DISABLED`.
     * Possible values are: `ZONAL_AFFINITY_DISABLED`, `ZONAL_AFFINITY_SPILL_CROSS_ZONE`, `ZONAL_AFFINITY_STAY_WITHIN_ZONE`.
     * 
     */
    private @Nullable String spillover;
    /**
     * @return The value of the field must be in [0, 1]. When the ratio of the count of healthy backend endpoints in a zone
     * to the count of backend endpoints in that same zone is equal to or above this threshold, the load balancer
     * distributes new connections to all healthy endpoints in the local zone only. When the ratio of the count
     * of healthy backend endpoints in a zone to the count of backend endpoints in that same zone is below this
     * threshold, the load balancer distributes all new connections to all healthy endpoints across all zones.
     * 
     */
    private @Nullable Double spilloverRatio;

    private BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinity() {}
    /**
     * @return This field indicates whether zonal affinity is enabled or not.
     * Default value is `ZONAL_AFFINITY_DISABLED`.
     * Possible values are: `ZONAL_AFFINITY_DISABLED`, `ZONAL_AFFINITY_SPILL_CROSS_ZONE`, `ZONAL_AFFINITY_STAY_WITHIN_ZONE`.
     * 
     */
    public Optional<String> spillover() {
        return Optional.ofNullable(this.spillover);
    }
    /**
     * @return The value of the field must be in [0, 1]. When the ratio of the count of healthy backend endpoints in a zone
     * to the count of backend endpoints in that same zone is equal to or above this threshold, the load balancer
     * distributes new connections to all healthy endpoints in the local zone only. When the ratio of the count
     * of healthy backend endpoints in a zone to the count of backend endpoints in that same zone is below this
     * threshold, the load balancer distributes all new connections to all healthy endpoints across all zones.
     * 
     */
    public Optional<Double> spilloverRatio() {
        return Optional.ofNullable(this.spilloverRatio);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String spillover;
        private @Nullable Double spilloverRatio;
        public Builder() {}
        public Builder(BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spillover = defaults.spillover;
    	      this.spilloverRatio = defaults.spilloverRatio;
        }

        @CustomType.Setter
        public Builder spillover(@Nullable String spillover) {

            this.spillover = spillover;
            return this;
        }
        @CustomType.Setter
        public Builder spilloverRatio(@Nullable Double spilloverRatio) {

            this.spilloverRatio = spilloverRatio;
            return this;
        }
        public BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinity build() {
            final var _resultValue = new BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinity();
            _resultValue.spillover = spillover;
            _resultValue.spilloverRatio = spilloverRatio;
            return _resultValue;
        }
    }
}
