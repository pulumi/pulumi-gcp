// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.beyondcorp.outputs.SecurityGatewayApplicationUpstreamEgressPolicy;
import com.pulumi.gcp.beyondcorp.outputs.SecurityGatewayApplicationUpstreamNetwork;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityGatewayApplicationUpstream {
    /**
     * @return Optional. Routing policy information.
     * Structure is documented below.
     * 
     */
    private @Nullable SecurityGatewayApplicationUpstreamEgressPolicy egressPolicy;
    /**
     * @return Network to forward traffic to.
     * Structure is documented below.
     * 
     */
    private @Nullable SecurityGatewayApplicationUpstreamNetwork network;

    private SecurityGatewayApplicationUpstream() {}
    /**
     * @return Optional. Routing policy information.
     * Structure is documented below.
     * 
     */
    public Optional<SecurityGatewayApplicationUpstreamEgressPolicy> egressPolicy() {
        return Optional.ofNullable(this.egressPolicy);
    }
    /**
     * @return Network to forward traffic to.
     * Structure is documented below.
     * 
     */
    public Optional<SecurityGatewayApplicationUpstreamNetwork> network() {
        return Optional.ofNullable(this.network);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGatewayApplicationUpstream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SecurityGatewayApplicationUpstreamEgressPolicy egressPolicy;
        private @Nullable SecurityGatewayApplicationUpstreamNetwork network;
        public Builder() {}
        public Builder(SecurityGatewayApplicationUpstream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressPolicy = defaults.egressPolicy;
    	      this.network = defaults.network;
        }

        @CustomType.Setter
        public Builder egressPolicy(@Nullable SecurityGatewayApplicationUpstreamEgressPolicy egressPolicy) {

            this.egressPolicy = egressPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable SecurityGatewayApplicationUpstreamNetwork network) {

            this.network = network;
            return this;
        }
        public SecurityGatewayApplicationUpstream build() {
            final var _resultValue = new SecurityGatewayApplicationUpstream();
            _resultValue.egressPolicy = egressPolicy;
            _resultValue.network = network;
            return _resultValue;
        }
    }
}
