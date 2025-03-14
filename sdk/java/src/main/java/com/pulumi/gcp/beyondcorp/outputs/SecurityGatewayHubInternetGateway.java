// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SecurityGatewayHubInternetGateway {
    /**
     * @return (Output)
     * Output only. List of IP addresses assigned to the Cloud NAT.
     * 
     */
    private @Nullable List<String> assignedIps;

    private SecurityGatewayHubInternetGateway() {}
    /**
     * @return (Output)
     * Output only. List of IP addresses assigned to the Cloud NAT.
     * 
     */
    public List<String> assignedIps() {
        return this.assignedIps == null ? List.of() : this.assignedIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGatewayHubInternetGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> assignedIps;
        public Builder() {}
        public Builder(SecurityGatewayHubInternetGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedIps = defaults.assignedIps;
        }

        @CustomType.Setter
        public Builder assignedIps(@Nullable List<String> assignedIps) {

            this.assignedIps = assignedIps;
            return this;
        }
        public Builder assignedIps(String... assignedIps) {
            return assignedIps(List.of(assignedIps));
        }
        public SecurityGatewayHubInternetGateway build() {
            final var _resultValue = new SecurityGatewayHubInternetGateway();
            _resultValue.assignedIps = assignedIps;
            return _resultValue;
        }
    }
}
