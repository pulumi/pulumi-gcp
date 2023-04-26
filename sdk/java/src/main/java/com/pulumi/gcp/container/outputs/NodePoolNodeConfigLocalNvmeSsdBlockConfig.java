// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NodePoolNodeConfigLocalNvmeSsdBlockConfig {
    private Integer localSsdCount;

    private NodePoolNodeConfigLocalNvmeSsdBlockConfig() {}
    public Integer localSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigLocalNvmeSsdBlockConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer localSsdCount;
        public Builder() {}
        public Builder(NodePoolNodeConfigLocalNvmeSsdBlockConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        @CustomType.Setter
        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public NodePoolNodeConfigLocalNvmeSsdBlockConfig build() {
            final var o = new NodePoolNodeConfigLocalNvmeSsdBlockConfig();
            o.localSsdCount = localSsdCount;
            return o;
        }
    }
}