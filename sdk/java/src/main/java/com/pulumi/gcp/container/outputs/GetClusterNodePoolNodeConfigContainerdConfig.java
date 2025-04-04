// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfig;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolNodeConfigContainerdConfig {
    /**
     * @return Parameters for private container registries configuration.
     * 
     */
    private List<GetClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfig> privateRegistryAccessConfigs;

    private GetClusterNodePoolNodeConfigContainerdConfig() {}
    /**
     * @return Parameters for private container registries configuration.
     * 
     */
    public List<GetClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfig> privateRegistryAccessConfigs() {
        return this.privateRegistryAccessConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigContainerdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfig> privateRegistryAccessConfigs;
        public Builder() {}
        public Builder(GetClusterNodePoolNodeConfigContainerdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateRegistryAccessConfigs = defaults.privateRegistryAccessConfigs;
        }

        @CustomType.Setter
        public Builder privateRegistryAccessConfigs(List<GetClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfig> privateRegistryAccessConfigs) {
            if (privateRegistryAccessConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterNodePoolNodeConfigContainerdConfig", "privateRegistryAccessConfigs");
            }
            this.privateRegistryAccessConfigs = privateRegistryAccessConfigs;
            return this;
        }
        public Builder privateRegistryAccessConfigs(GetClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfig... privateRegistryAccessConfigs) {
            return privateRegistryAccessConfigs(List.of(privateRegistryAccessConfigs));
        }
        public GetClusterNodePoolNodeConfigContainerdConfig build() {
            final var _resultValue = new GetClusterNodePoolNodeConfigContainerdConfig();
            _resultValue.privateRegistryAccessConfigs = privateRegistryAccessConfigs;
            return _resultValue;
        }
    }
}
