// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnConnectionDetailCloudVpn {
    /**
     * @return (Output)
     * The created Cloud VPN gateway name.
     * 
     */
    private @Nullable String gateway;

    private VpnConnectionDetailCloudVpn() {}
    /**
     * @return (Output)
     * The created Cloud VPN gateway name.
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionDetailCloudVpn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gateway;
        public Builder() {}
        public Builder(VpnConnectionDetailCloudVpn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gateway = defaults.gateway;
        }

        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {
            this.gateway = gateway;
            return this;
        }
        public VpnConnectionDetailCloudVpn build() {
            final var o = new VpnConnectionDetailCloudVpn();
            o.gateway = gateway;
            return o;
        }
    }
}