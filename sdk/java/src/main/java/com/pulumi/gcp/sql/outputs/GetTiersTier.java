// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
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
            this.diskQuota = Objects.requireNonNull(diskQuota);
            return this;
        }
        @CustomType.Setter
        public Builder ram(Integer ram) {
            this.ram = Objects.requireNonNull(ram);
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public GetTiersTier build() {
            final var o = new GetTiersTier();
            o.diskQuota = diskQuota;
            o.ram = ram;
            o.regions = regions;
            o.tier = tier;
            return o;
        }
    }
}