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
public final class ClusterNetworkPolicy {
    /**
     * @return Whether network policy is enabled on the cluster.
     * 
     */
    private Boolean enabled;
    /**
     * @return The selected network policy provider. Defaults to PROVIDER_UNSPECIFIED.
     * 
     */
    private @Nullable String provider;

    private ClusterNetworkPolicy() {}
    /**
     * @return Whether network policy is enabled on the cluster.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The selected network policy provider. Defaults to PROVIDER_UNSPECIFIED.
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworkPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String provider;
        public Builder() {}
        public Builder(ClusterNetworkPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ClusterNetworkPolicy", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        public ClusterNetworkPolicy build() {
            final var _resultValue = new ClusterNetworkPolicy();
            _resultValue.enabled = enabled;
            _resultValue.provider = provider;
            return _resultValue;
        }
    }
}
