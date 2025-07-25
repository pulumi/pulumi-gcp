// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSecretManagerConfigRotationConfig {
    /**
     * @return Enable the roation in Secret Manager add-on for this cluster.
     * 
     */
    private Boolean enabled;
    /**
     * @return The interval between two consecutive rotations. Default rotation interval is 2 minutes.
     * 
     */
    private @Nullable String rotationInterval;

    private ClusterSecretManagerConfigRotationConfig() {}
    /**
     * @return Enable the roation in Secret Manager add-on for this cluster.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The interval between two consecutive rotations. Default rotation interval is 2 minutes.
     * 
     */
    public Optional<String> rotationInterval() {
        return Optional.ofNullable(this.rotationInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSecretManagerConfigRotationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String rotationInterval;
        public Builder() {}
        public Builder(ClusterSecretManagerConfigRotationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.rotationInterval = defaults.rotationInterval;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ClusterSecretManagerConfigRotationConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder rotationInterval(@Nullable String rotationInterval) {

            this.rotationInterval = rotationInterval;
            return this;
        }
        public ClusterSecretManagerConfigRotationConfig build() {
            final var _resultValue = new ClusterSecretManagerConfigRotationConfig();
            _resultValue.enabled = enabled;
            _resultValue.rotationInterval = rotationInterval;
            return _resultValue;
        }
    }
}
