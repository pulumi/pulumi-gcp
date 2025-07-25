// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterSecretManagerConfigRotationConfig {
    /**
     * @return Enable the Secret manager auto rotation.
     * 
     */
    private Boolean enabled;
    /**
     * @return The interval between two consecutive rotations. Default rotation interval is 2 minutes
     * 
     */
    private String rotationInterval;

    private GetClusterSecretManagerConfigRotationConfig() {}
    /**
     * @return Enable the Secret manager auto rotation.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The interval between two consecutive rotations. Default rotation interval is 2 minutes
     * 
     */
    public String rotationInterval() {
        return this.rotationInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterSecretManagerConfigRotationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String rotationInterval;
        public Builder() {}
        public Builder(GetClusterSecretManagerConfigRotationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.rotationInterval = defaults.rotationInterval;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetClusterSecretManagerConfigRotationConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder rotationInterval(String rotationInterval) {
            if (rotationInterval == null) {
              throw new MissingRequiredPropertyException("GetClusterSecretManagerConfigRotationConfig", "rotationInterval");
            }
            this.rotationInterval = rotationInterval;
            return this;
        }
        public GetClusterSecretManagerConfigRotationConfig build() {
            final var _resultValue = new GetClusterSecretManagerConfigRotationConfig();
            _resultValue.enabled = enabled;
            _resultValue.rotationInterval = rotationInterval;
            return _resultValue;
        }
    }
}
