// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterTpuConfig {
    /**
     * @return Whether Cloud TPU integration is enabled or not
     * 
     */
    private Boolean enabled;
    /**
     * @return IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
     */
    private String ipv4CidrBlock;
    /**
     * @return Whether to use service networking for Cloud TPU or not
     * 
     */
    private Boolean useServiceNetworking;

    private GetClusterTpuConfig() {}
    /**
     * @return Whether Cloud TPU integration is enabled or not
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
     */
    public String ipv4CidrBlock() {
        return this.ipv4CidrBlock;
    }
    /**
     * @return Whether to use service networking for Cloud TPU or not
     * 
     */
    public Boolean useServiceNetworking() {
        return this.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTpuConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String ipv4CidrBlock;
        private Boolean useServiceNetworking;
        public Builder() {}
        public Builder(GetClusterTpuConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ipv4CidrBlock = defaults.ipv4CidrBlock;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetClusterTpuConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4CidrBlock(String ipv4CidrBlock) {
            if (ipv4CidrBlock == null) {
              throw new MissingRequiredPropertyException("GetClusterTpuConfig", "ipv4CidrBlock");
            }
            this.ipv4CidrBlock = ipv4CidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder useServiceNetworking(Boolean useServiceNetworking) {
            if (useServiceNetworking == null) {
              throw new MissingRequiredPropertyException("GetClusterTpuConfig", "useServiceNetworking");
            }
            this.useServiceNetworking = useServiceNetworking;
            return this;
        }
        public GetClusterTpuConfig build() {
            final var _resultValue = new GetClusterTpuConfig();
            _resultValue.enabled = enabled;
            _resultValue.ipv4CidrBlock = ipv4CidrBlock;
            _resultValue.useServiceNetworking = useServiceNetworking;
            return _resultValue;
        }
    }
}
