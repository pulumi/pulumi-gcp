// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.BackendServiceDynamicForwardingIpPortSelection;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceDynamicForwarding {
    /**
     * @return IP:PORT based dynamic forwarding configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable BackendServiceDynamicForwardingIpPortSelection ipPortSelection;

    private BackendServiceDynamicForwarding() {}
    /**
     * @return IP:PORT based dynamic forwarding configuration.
     * Structure is documented below.
     * 
     */
    public Optional<BackendServiceDynamicForwardingIpPortSelection> ipPortSelection() {
        return Optional.ofNullable(this.ipPortSelection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceDynamicForwarding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BackendServiceDynamicForwardingIpPortSelection ipPortSelection;
        public Builder() {}
        public Builder(BackendServiceDynamicForwarding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipPortSelection = defaults.ipPortSelection;
        }

        @CustomType.Setter
        public Builder ipPortSelection(@Nullable BackendServiceDynamicForwardingIpPortSelection ipPortSelection) {

            this.ipPortSelection = ipPortSelection;
            return this;
        }
        public BackendServiceDynamicForwarding build() {
            final var _resultValue = new BackendServiceDynamicForwarding();
            _resultValue.ipPortSelection = ipPortSelection;
            return _resultValue;
        }
    }
}
