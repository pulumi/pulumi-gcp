// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.redis.outputs.GetClusterDiscoveryEndpointPscConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterDiscoveryEndpoint {
    /**
     * @return Output only. Network address of the exposed Redis endpoint used by clients to connect to the service.
     * 
     */
    private String address;
    /**
     * @return Output only. The port number of the exposed Redis endpoint.
     * 
     */
    private Integer port;
    /**
     * @return Output only. Customer configuration for where the endpoint
     * is created and accessed from.
     * 
     */
    private List<GetClusterDiscoveryEndpointPscConfig> pscConfigs;

    private GetClusterDiscoveryEndpoint() {}
    /**
     * @return Output only. Network address of the exposed Redis endpoint used by clients to connect to the service.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Output only. The port number of the exposed Redis endpoint.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Output only. Customer configuration for where the endpoint
     * is created and accessed from.
     * 
     */
    public List<GetClusterDiscoveryEndpointPscConfig> pscConfigs() {
        return this.pscConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterDiscoveryEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer port;
        private List<GetClusterDiscoveryEndpointPscConfig> pscConfigs;
        public Builder() {}
        public Builder(GetClusterDiscoveryEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.pscConfigs = defaults.pscConfigs;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetClusterDiscoveryEndpoint", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetClusterDiscoveryEndpoint", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder pscConfigs(List<GetClusterDiscoveryEndpointPscConfig> pscConfigs) {
            if (pscConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterDiscoveryEndpoint", "pscConfigs");
            }
            this.pscConfigs = pscConfigs;
            return this;
        }
        public Builder pscConfigs(GetClusterDiscoveryEndpointPscConfig... pscConfigs) {
            return pscConfigs(List.of(pscConfigs));
        }
        public GetClusterDiscoveryEndpoint build() {
            final var _resultValue = new GetClusterDiscoveryEndpoint();
            _resultValue.address = address;
            _resultValue.port = port;
            _resultValue.pscConfigs = pscConfigs;
            return _resultValue;
        }
    }
}
