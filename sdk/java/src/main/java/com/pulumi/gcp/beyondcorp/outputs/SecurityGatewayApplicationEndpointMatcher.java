// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SecurityGatewayApplicationEndpointMatcher {
    /**
     * @return Required. Hostname of the application.
     * 
     */
    private String hostname;
    /**
     * @return Optional. Ports of the application.
     * 
     */
    private @Nullable List<Integer> ports;

    private SecurityGatewayApplicationEndpointMatcher() {}
    /**
     * @return Required. Hostname of the application.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Optional. Ports of the application.
     * 
     */
    public List<Integer> ports() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGatewayApplicationEndpointMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private @Nullable List<Integer> ports;
        public Builder() {}
        public Builder(SecurityGatewayApplicationEndpointMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ports = defaults.ports;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("SecurityGatewayApplicationEndpointMatcher", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<Integer> ports) {

            this.ports = ports;
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }
        public SecurityGatewayApplicationEndpointMatcher build() {
            final var _resultValue = new SecurityGatewayApplicationEndpointMatcher();
            _resultValue.hostname = hostname;
            _resultValue.ports = ports;
            return _resultValue;
        }
    }
}
