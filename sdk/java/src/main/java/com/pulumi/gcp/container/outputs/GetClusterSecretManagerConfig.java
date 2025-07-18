// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.outputs.GetClusterSecretManagerConfigRotationConfig;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterSecretManagerConfig {
    /**
     * @return Enable the Secret manager csi component.
     * 
     */
    private Boolean enabled;
    /**
     * @return Configuration for Secret Manager auto rotation.
     * 
     */
    private List<GetClusterSecretManagerConfigRotationConfig> rotationConfigs;

    private GetClusterSecretManagerConfig() {}
    /**
     * @return Enable the Secret manager csi component.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Configuration for Secret Manager auto rotation.
     * 
     */
    public List<GetClusterSecretManagerConfigRotationConfig> rotationConfigs() {
        return this.rotationConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterSecretManagerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private List<GetClusterSecretManagerConfigRotationConfig> rotationConfigs;
        public Builder() {}
        public Builder(GetClusterSecretManagerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.rotationConfigs = defaults.rotationConfigs;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetClusterSecretManagerConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder rotationConfigs(List<GetClusterSecretManagerConfigRotationConfig> rotationConfigs) {
            if (rotationConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterSecretManagerConfig", "rotationConfigs");
            }
            this.rotationConfigs = rotationConfigs;
            return this;
        }
        public Builder rotationConfigs(GetClusterSecretManagerConfigRotationConfig... rotationConfigs) {
            return rotationConfigs(List.of(rotationConfigs));
        }
        public GetClusterSecretManagerConfig build() {
            final var _resultValue = new GetClusterSecretManagerConfig();
            _resultValue.enabled = enabled;
            _resultValue.rotationConfigs = rotationConfigs;
            return _resultValue;
        }
    }
}
