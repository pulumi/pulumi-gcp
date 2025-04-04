// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterControlPlaneEndpointsConfigDnsEndpointConfig;
import com.pulumi.gcp.container.outputs.ClusterControlPlaneEndpointsConfigIpEndpointsConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterControlPlaneEndpointsConfig {
    /**
     * @return DNS endpoint configuration.
     * 
     */
    private @Nullable ClusterControlPlaneEndpointsConfigDnsEndpointConfig dnsEndpointConfig;
    /**
     * @return IP endpoint configuration.
     * 
     */
    private @Nullable ClusterControlPlaneEndpointsConfigIpEndpointsConfig ipEndpointsConfig;

    private ClusterControlPlaneEndpointsConfig() {}
    /**
     * @return DNS endpoint configuration.
     * 
     */
    public Optional<ClusterControlPlaneEndpointsConfigDnsEndpointConfig> dnsEndpointConfig() {
        return Optional.ofNullable(this.dnsEndpointConfig);
    }
    /**
     * @return IP endpoint configuration.
     * 
     */
    public Optional<ClusterControlPlaneEndpointsConfigIpEndpointsConfig> ipEndpointsConfig() {
        return Optional.ofNullable(this.ipEndpointsConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterControlPlaneEndpointsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterControlPlaneEndpointsConfigDnsEndpointConfig dnsEndpointConfig;
        private @Nullable ClusterControlPlaneEndpointsConfigIpEndpointsConfig ipEndpointsConfig;
        public Builder() {}
        public Builder(ClusterControlPlaneEndpointsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsEndpointConfig = defaults.dnsEndpointConfig;
    	      this.ipEndpointsConfig = defaults.ipEndpointsConfig;
        }

        @CustomType.Setter
        public Builder dnsEndpointConfig(@Nullable ClusterControlPlaneEndpointsConfigDnsEndpointConfig dnsEndpointConfig) {

            this.dnsEndpointConfig = dnsEndpointConfig;
            return this;
        }
        @CustomType.Setter
        public Builder ipEndpointsConfig(@Nullable ClusterControlPlaneEndpointsConfigIpEndpointsConfig ipEndpointsConfig) {

            this.ipEndpointsConfig = ipEndpointsConfig;
            return this;
        }
        public ClusterControlPlaneEndpointsConfig build() {
            final var _resultValue = new ClusterControlPlaneEndpointsConfig();
            _resultValue.dnsEndpointConfig = dnsEndpointConfig;
            _resultValue.ipEndpointsConfig = ipEndpointsConfig;
            return _resultValue;
        }
    }
}
