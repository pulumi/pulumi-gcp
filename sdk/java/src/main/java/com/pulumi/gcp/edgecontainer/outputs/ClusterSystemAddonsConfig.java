// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.edgecontainer.outputs.ClusterSystemAddonsConfigIngress;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSystemAddonsConfig {
    /**
     * @return Config for the Ingress add-on which allows customers to create an Ingress
     * object to manage external access to the servers in a cluster. The add-on
     * consists of istiod and istio-ingress.
     * Structure is documented below.
     * 
     */
    private @Nullable ClusterSystemAddonsConfigIngress ingress;

    private ClusterSystemAddonsConfig() {}
    /**
     * @return Config for the Ingress add-on which allows customers to create an Ingress
     * object to manage external access to the servers in a cluster. The add-on
     * consists of istiod and istio-ingress.
     * Structure is documented below.
     * 
     */
    public Optional<ClusterSystemAddonsConfigIngress> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSystemAddonsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterSystemAddonsConfigIngress ingress;
        public Builder() {}
        public Builder(ClusterSystemAddonsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingress = defaults.ingress;
        }

        @CustomType.Setter
        public Builder ingress(@Nullable ClusterSystemAddonsConfigIngress ingress) {
            this.ingress = ingress;
            return this;
        }
        public ClusterSystemAddonsConfig build() {
            final var o = new ClusterSystemAddonsConfig();
            o.ingress = ingress;
            return o;
        }
    }
}