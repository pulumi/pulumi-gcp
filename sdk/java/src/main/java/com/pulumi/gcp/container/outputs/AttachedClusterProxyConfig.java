// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.AttachedClusterProxyConfigKubernetesSecret;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttachedClusterProxyConfig {
    /**
     * @return The Kubernetes Secret resource that contains the HTTP(S) proxy configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable AttachedClusterProxyConfigKubernetesSecret kubernetesSecret;

    private AttachedClusterProxyConfig() {}
    /**
     * @return The Kubernetes Secret resource that contains the HTTP(S) proxy configuration.
     * Structure is documented below.
     * 
     */
    public Optional<AttachedClusterProxyConfigKubernetesSecret> kubernetesSecret() {
        return Optional.ofNullable(this.kubernetesSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedClusterProxyConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AttachedClusterProxyConfigKubernetesSecret kubernetesSecret;
        public Builder() {}
        public Builder(AttachedClusterProxyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetesSecret = defaults.kubernetesSecret;
        }

        @CustomType.Setter
        public Builder kubernetesSecret(@Nullable AttachedClusterProxyConfigKubernetesSecret kubernetesSecret) {

            this.kubernetesSecret = kubernetesSecret;
            return this;
        }
        public AttachedClusterProxyConfig build() {
            final var _resultValue = new AttachedClusterProxyConfig();
            _resultValue.kubernetesSecret = kubernetesSecret;
            return _resultValue;
        }
    }
}
