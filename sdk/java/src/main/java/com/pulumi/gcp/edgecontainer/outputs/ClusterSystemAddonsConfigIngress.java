// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSystemAddonsConfigIngress {
    /**
     * @return Whether Ingress is disabled.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Ingress VIP.
     * 
     */
    private @Nullable String ipv4Vip;

    private ClusterSystemAddonsConfigIngress() {}
    /**
     * @return Whether Ingress is disabled.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Ingress VIP.
     * 
     */
    public Optional<String> ipv4Vip() {
        return Optional.ofNullable(this.ipv4Vip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSystemAddonsConfigIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable String ipv4Vip;
        public Builder() {}
        public Builder(ClusterSystemAddonsConfigIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.ipv4Vip = defaults.ipv4Vip;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Vip(@Nullable String ipv4Vip) {
            this.ipv4Vip = ipv4Vip;
            return this;
        }
        public ClusterSystemAddonsConfigIngress build() {
            final var o = new ClusterSystemAddonsConfigIngress();
            o.disabled = disabled;
            o.ipv4Vip = ipv4Vip;
            return o;
        }
    }
}