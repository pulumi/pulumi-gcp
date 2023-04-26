// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateNetworkInterfaceAccessConfig {
    /**
     * @return The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    private String natIp;
    /**
     * @return The [networking tier][network-tier] used for configuring
     * this instance template. This field can take the following values: PREMIUM or
     * STANDARD. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    private String networkTier;
    private String publicPtrDomainName;

    private GetRegionInstanceTemplateNetworkInterfaceAccessConfig() {}
    /**
     * @return The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    public String natIp() {
        return this.natIp;
    }
    /**
     * @return The [networking tier][network-tier] used for configuring
     * this instance template. This field can take the following values: PREMIUM or
     * STANDARD. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    public String networkTier() {
        return this.networkTier;
    }
    public String publicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String natIp;
        private String networkTier;
        private String publicPtrDomainName;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        @CustomType.Setter
        public Builder natIp(String natIp) {
            this.natIp = Objects.requireNonNull(natIp);
            return this;
        }
        @CustomType.Setter
        public Builder networkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }
        @CustomType.Setter
        public Builder publicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }
        public GetRegionInstanceTemplateNetworkInterfaceAccessConfig build() {
            final var o = new GetRegionInstanceTemplateNetworkInterfaceAccessConfig();
            o.natIp = natIp;
            o.networkTier = networkTier;
            o.publicPtrDomainName = publicPtrDomainName;
            return o;
        }
    }
}