// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.alloydb.outputs.InstanceNetworkConfigAuthorizedExternalNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceNetworkConfig {
    /**
     * @return Name of the allocated IP range for the private IP AlloyDB instance, for example: &#34;google-managed-services-default&#34;.
     * If set, the instance IPs will be created from this allocated range and will override the IP range used by the parent cluster.
     * The range name must comply with RFC 1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
     */
    private @Nullable String allocatedIpRangeOverride;
    /**
     * @return A list of external networks authorized to access this instance. This
     * field is only allowed to be set when `enable_public_ip` is set to
     * true.
     * Structure is documented below.
     * 
     */
    private @Nullable List<InstanceNetworkConfigAuthorizedExternalNetwork> authorizedExternalNetworks;
    /**
     * @return Enabling outbound public ip for the instance.
     * 
     */
    private @Nullable Boolean enableOutboundPublicIp;
    /**
     * @return Enabling public ip for the instance. If a user wishes to disable this,
     * please also clear the list of the authorized external networks set on
     * the same instance.
     * 
     */
    private @Nullable Boolean enablePublicIp;

    private InstanceNetworkConfig() {}
    /**
     * @return Name of the allocated IP range for the private IP AlloyDB instance, for example: &#34;google-managed-services-default&#34;.
     * If set, the instance IPs will be created from this allocated range and will override the IP range used by the parent cluster.
     * The range name must comply with RFC 1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
     */
    public Optional<String> allocatedIpRangeOverride() {
        return Optional.ofNullable(this.allocatedIpRangeOverride);
    }
    /**
     * @return A list of external networks authorized to access this instance. This
     * field is only allowed to be set when `enable_public_ip` is set to
     * true.
     * Structure is documented below.
     * 
     */
    public List<InstanceNetworkConfigAuthorizedExternalNetwork> authorizedExternalNetworks() {
        return this.authorizedExternalNetworks == null ? List.of() : this.authorizedExternalNetworks;
    }
    /**
     * @return Enabling outbound public ip for the instance.
     * 
     */
    public Optional<Boolean> enableOutboundPublicIp() {
        return Optional.ofNullable(this.enableOutboundPublicIp);
    }
    /**
     * @return Enabling public ip for the instance. If a user wishes to disable this,
     * please also clear the list of the authorized external networks set on
     * the same instance.
     * 
     */
    public Optional<Boolean> enablePublicIp() {
        return Optional.ofNullable(this.enablePublicIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allocatedIpRangeOverride;
        private @Nullable List<InstanceNetworkConfigAuthorizedExternalNetwork> authorizedExternalNetworks;
        private @Nullable Boolean enableOutboundPublicIp;
        private @Nullable Boolean enablePublicIp;
        public Builder() {}
        public Builder(InstanceNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRangeOverride = defaults.allocatedIpRangeOverride;
    	      this.authorizedExternalNetworks = defaults.authorizedExternalNetworks;
    	      this.enableOutboundPublicIp = defaults.enableOutboundPublicIp;
    	      this.enablePublicIp = defaults.enablePublicIp;
        }

        @CustomType.Setter
        public Builder allocatedIpRangeOverride(@Nullable String allocatedIpRangeOverride) {

            this.allocatedIpRangeOverride = allocatedIpRangeOverride;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedExternalNetworks(@Nullable List<InstanceNetworkConfigAuthorizedExternalNetwork> authorizedExternalNetworks) {

            this.authorizedExternalNetworks = authorizedExternalNetworks;
            return this;
        }
        public Builder authorizedExternalNetworks(InstanceNetworkConfigAuthorizedExternalNetwork... authorizedExternalNetworks) {
            return authorizedExternalNetworks(List.of(authorizedExternalNetworks));
        }
        @CustomType.Setter
        public Builder enableOutboundPublicIp(@Nullable Boolean enableOutboundPublicIp) {

            this.enableOutboundPublicIp = enableOutboundPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder enablePublicIp(@Nullable Boolean enablePublicIp) {

            this.enablePublicIp = enablePublicIp;
            return this;
        }
        public InstanceNetworkConfig build() {
            final var _resultValue = new InstanceNetworkConfig();
            _resultValue.allocatedIpRangeOverride = allocatedIpRangeOverride;
            _resultValue.authorizedExternalNetworks = authorizedExternalNetworks;
            _resultValue.enableOutboundPublicIp = enableOutboundPublicIp;
            _resultValue.enablePublicIp = enablePublicIp;
            return _resultValue;
        }
    }
}
