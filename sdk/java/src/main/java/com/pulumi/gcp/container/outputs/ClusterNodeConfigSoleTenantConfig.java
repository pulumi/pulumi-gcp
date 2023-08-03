// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterNodeConfigSoleTenantConfigNodeAffinity;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterNodeConfigSoleTenantConfig {
    private List<ClusterNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities;

    private ClusterNodeConfigSoleTenantConfig() {}
    public List<ClusterNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigSoleTenantConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ClusterNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities;
        public Builder() {}
        public Builder(ClusterNodeConfigSoleTenantConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeAffinities = defaults.nodeAffinities;
        }

        @CustomType.Setter
        public Builder nodeAffinities(List<ClusterNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(ClusterNodeConfigSoleTenantConfigNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public ClusterNodeConfigSoleTenantConfig build() {
            final var o = new ClusterNodeConfigSoleTenantConfig();
            o.nodeAffinities = nodeAffinities;
            return o;
        }
    }
}