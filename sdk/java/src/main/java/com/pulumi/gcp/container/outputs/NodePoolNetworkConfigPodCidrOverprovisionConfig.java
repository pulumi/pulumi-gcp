// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class NodePoolNetworkConfigPodCidrOverprovisionConfig {
    private Boolean disabled;

    private NodePoolNetworkConfigPodCidrOverprovisionConfig() {}
    public Boolean disabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNetworkConfigPodCidrOverprovisionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disabled;
        public Builder() {}
        public Builder(NodePoolNetworkConfigPodCidrOverprovisionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public NodePoolNetworkConfigPodCidrOverprovisionConfig build() {
            final var o = new NodePoolNetworkConfigPodCidrOverprovisionConfig();
            o.disabled = disabled;
            return o;
        }
    }
}