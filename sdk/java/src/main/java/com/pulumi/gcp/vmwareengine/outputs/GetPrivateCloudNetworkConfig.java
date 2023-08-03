// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateCloudNetworkConfig {
    private String managementCidr;
    private Integer managementIpAddressLayoutVersion;
    private String vmwareEngineNetwork;
    private String vmwareEngineNetworkCanonical;

    private GetPrivateCloudNetworkConfig() {}
    public String managementCidr() {
        return this.managementCidr;
    }
    public Integer managementIpAddressLayoutVersion() {
        return this.managementIpAddressLayoutVersion;
    }
    public String vmwareEngineNetwork() {
        return this.vmwareEngineNetwork;
    }
    public String vmwareEngineNetworkCanonical() {
        return this.vmwareEngineNetworkCanonical;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateCloudNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String managementCidr;
        private Integer managementIpAddressLayoutVersion;
        private String vmwareEngineNetwork;
        private String vmwareEngineNetworkCanonical;
        public Builder() {}
        public Builder(GetPrivateCloudNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementCidr = defaults.managementCidr;
    	      this.managementIpAddressLayoutVersion = defaults.managementIpAddressLayoutVersion;
    	      this.vmwareEngineNetwork = defaults.vmwareEngineNetwork;
    	      this.vmwareEngineNetworkCanonical = defaults.vmwareEngineNetworkCanonical;
        }

        @CustomType.Setter
        public Builder managementCidr(String managementCidr) {
            this.managementCidr = Objects.requireNonNull(managementCidr);
            return this;
        }
        @CustomType.Setter
        public Builder managementIpAddressLayoutVersion(Integer managementIpAddressLayoutVersion) {
            this.managementIpAddressLayoutVersion = Objects.requireNonNull(managementIpAddressLayoutVersion);
            return this;
        }
        @CustomType.Setter
        public Builder vmwareEngineNetwork(String vmwareEngineNetwork) {
            this.vmwareEngineNetwork = Objects.requireNonNull(vmwareEngineNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder vmwareEngineNetworkCanonical(String vmwareEngineNetworkCanonical) {
            this.vmwareEngineNetworkCanonical = Objects.requireNonNull(vmwareEngineNetworkCanonical);
            return this;
        }
        public GetPrivateCloudNetworkConfig build() {
            final var o = new GetPrivateCloudNetworkConfig();
            o.managementCidr = managementCidr;
            o.managementIpAddressLayoutVersion = managementIpAddressLayoutVersion;
            o.vmwareEngineNetwork = vmwareEngineNetwork;
            o.vmwareEngineNetworkCanonical = vmwareEngineNetworkCanonical;
            return o;
        }
    }
}