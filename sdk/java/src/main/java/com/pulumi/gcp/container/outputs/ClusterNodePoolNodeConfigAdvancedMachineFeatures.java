// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigAdvancedMachineFeatures {
    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    private Integer threadsPerCore;

    private ClusterNodePoolNodeConfigAdvancedMachineFeatures() {}
    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    public Integer threadsPerCore() {
        return this.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigAdvancedMachineFeatures defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer threadsPerCore;
        public Builder() {}
        public Builder(ClusterNodePoolNodeConfigAdvancedMachineFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        @CustomType.Setter
        public Builder threadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }
        public ClusterNodePoolNodeConfigAdvancedMachineFeatures build() {
            final var o = new ClusterNodePoolNodeConfigAdvancedMachineFeatures();
            o.threadsPerCore = threadsPerCore;
            return o;
        }
    }
}