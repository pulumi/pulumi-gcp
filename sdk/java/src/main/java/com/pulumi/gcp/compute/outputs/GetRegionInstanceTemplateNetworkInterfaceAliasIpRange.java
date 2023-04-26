// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateNetworkInterfaceAliasIpRange {
    /**
     * @return The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    private String ipCidrRange;
    /**
     * @return The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    private String subnetworkRangeName;

    private GetRegionInstanceTemplateNetworkInterfaceAliasIpRange() {}
    /**
     * @return The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * @return The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    public String subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipCidrRange;
        private String subnetworkRangeName;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        @CustomType.Setter
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        @CustomType.Setter
        public Builder subnetworkRangeName(String subnetworkRangeName) {
            this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName);
            return this;
        }
        public GetRegionInstanceTemplateNetworkInterfaceAliasIpRange build() {
            final var o = new GetRegionInstanceTemplateNetworkInterfaceAliasIpRange();
            o.ipCidrRange = ipCidrRange;
            o.subnetworkRangeName = subnetworkRangeName;
            return o;
        }
    }
}