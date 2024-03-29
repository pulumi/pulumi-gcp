// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigMasterAuthorizedNetworksConfig {
    /**
     * @return cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    private List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
    /**
     * @return Whether or not master authorized networks is enabled.
     * 
     */
    private Boolean enabled;

    private GetEnvironmentConfigMasterAuthorizedNetworksConfig() {}
    /**
     * @return cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    public List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * @return Whether or not master authorized networks is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigMasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetEnvironmentConfigMasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder cidrBlocks(List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            if (cidrBlocks == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigMasterAuthorizedNetworksConfig", "cidrBlocks");
            }
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigMasterAuthorizedNetworksConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetEnvironmentConfigMasterAuthorizedNetworksConfig build() {
            final var _resultValue = new GetEnvironmentConfigMasterAuthorizedNetworksConfig();
            _resultValue.cidrBlocks = cidrBlocks;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
