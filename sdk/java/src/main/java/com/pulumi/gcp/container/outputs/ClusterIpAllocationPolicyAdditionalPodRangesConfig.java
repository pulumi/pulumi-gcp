// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterIpAllocationPolicyAdditionalPodRangesConfig {
    /**
     * @return The names of the Pod ranges to add to the cluster.
     * 
     */
    private List<String> podRangeNames;

    private ClusterIpAllocationPolicyAdditionalPodRangesConfig() {}
    /**
     * @return The names of the Pod ranges to add to the cluster.
     * 
     */
    public List<String> podRangeNames() {
        return this.podRangeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIpAllocationPolicyAdditionalPodRangesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> podRangeNames;
        public Builder() {}
        public Builder(ClusterIpAllocationPolicyAdditionalPodRangesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podRangeNames = defaults.podRangeNames;
        }

        @CustomType.Setter
        public Builder podRangeNames(List<String> podRangeNames) {
            this.podRangeNames = Objects.requireNonNull(podRangeNames);
            return this;
        }
        public Builder podRangeNames(String... podRangeNames) {
            return podRangeNames(List.of(podRangeNames));
        }
        public ClusterIpAllocationPolicyAdditionalPodRangesConfig build() {
            final var o = new ClusterIpAllocationPolicyAdditionalPodRangesConfig();
            o.podRangeNames = podRangeNames;
            return o;
        }
    }
}