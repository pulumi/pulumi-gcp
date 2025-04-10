// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTiersTier {
    /**
     * @return The maximum disk size of this tier in bytes.
     * 
     */
    private Integer diskQuota;
    /**
     * @return The maximum ram usage of this tier in bytes.
     * 
     */
    private Integer ram;
    /**
     * @return The applicable regions for this tier.
     * 
     */
    private List<String> regions;
    /**
     * @return An identifier for the machine type, for example, db-custom-1-3840.
     * 
     */
    private String tier;

    private GetTiersTier() {}
    /**
     * @return The maximum disk size of this tier in bytes.
     * 
     */
    public Integer diskQuota() {
        return this.diskQuota;
    }
    /**
     * @return The maximum ram usage of this tier in bytes.
     * 
     */
    public Integer ram() {
        return this.ram;
    }
    /**
     * @return The applicable regions for this tier.
     * 
     */
    public List<String> regions() {
        return this.regions;
    }
    /**
     * @return An identifier for the machine type, for example, db-custom-1-3840.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTiersTier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer diskQuota;
        private Integer ram;
        private List<String> regions;
        private String tier;
        public Builder() {}
        public Builder(GetTiersTier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskQuota = defaults.diskQuota;
    	      this.ram = defaults.ram;
    	      this.regions = defaults.regions;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder diskQuota(Integer diskQuota) {
            if (diskQuota == null) {
              throw new MissingRequiredPropertyException("GetTiersTier", "diskQuota");
            }
            this.diskQuota = diskQuota;
            return this;
        }
        @CustomType.Setter
        public Builder ram(Integer ram) {
            if (ram == null) {
              throw new MissingRequiredPropertyException("GetTiersTier", "ram");
            }
            this.ram = ram;
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<String> regions) {
            if (regions == null) {
              throw new MissingRequiredPropertyException("GetTiersTier", "regions");
            }
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            if (tier == null) {
              throw new MissingRequiredPropertyException("GetTiersTier", "tier");
            }
            this.tier = tier;
            return this;
        }
        public GetTiersTier build() {
            final var _resultValue = new GetTiersTier();
            _resultValue.diskQuota = diskQuota;
            _resultValue.ram = ram;
            _resultValue.regions = regions;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
