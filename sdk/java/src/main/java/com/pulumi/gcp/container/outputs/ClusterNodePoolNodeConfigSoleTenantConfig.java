// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinity;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigSoleTenantConfig {
    private List<ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities;

    private ClusterNodePoolNodeConfigSoleTenantConfig() {}
    public List<ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigSoleTenantConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities;
        public Builder() {}
        public Builder(ClusterNodePoolNodeConfigSoleTenantConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeAffinities = defaults.nodeAffinities;
        }

        @CustomType.Setter
        public Builder nodeAffinities(List<ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public ClusterNodePoolNodeConfigSoleTenantConfig build() {
            final var o = new ClusterNodePoolNodeConfigSoleTenantConfig();
            o.nodeAffinities = nodeAffinities;
            return o;
        }
    }
}