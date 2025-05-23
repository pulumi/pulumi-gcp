// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheOriginFlexShielding {
    /**
     * @return Whenever possible, content will be fetched from origin and cached in or
     * near the specified origin. Best effort.
     * You must specify exactly one FlexShieldingRegion.
     * Each value may be one of: `AFRICA_SOUTH1`, `ME_CENTRAL1`.
     * 
     */
    private @Nullable String flexShieldingRegions;

    private EdgeCacheOriginFlexShielding() {}
    /**
     * @return Whenever possible, content will be fetched from origin and cached in or
     * near the specified origin. Best effort.
     * You must specify exactly one FlexShieldingRegion.
     * Each value may be one of: `AFRICA_SOUTH1`, `ME_CENTRAL1`.
     * 
     */
    public Optional<String> flexShieldingRegions() {
        return Optional.ofNullable(this.flexShieldingRegions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheOriginFlexShielding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String flexShieldingRegions;
        public Builder() {}
        public Builder(EdgeCacheOriginFlexShielding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flexShieldingRegions = defaults.flexShieldingRegions;
        }

        @CustomType.Setter
        public Builder flexShieldingRegions(@Nullable String flexShieldingRegions) {

            this.flexShieldingRegions = flexShieldingRegions;
            return this;
        }
        public EdgeCacheOriginFlexShielding build() {
            final var _resultValue = new EdgeCacheOriginFlexShielding();
            _resultValue.flexShieldingRegions = flexShieldingRegions;
            return _resultValue;
        }
    }
}
