// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterWorkloadIdentityConfig {
    /**
     * @return The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    private final @Nullable String workloadPool;

    @CustomType.Constructor
    private ClusterWorkloadIdentityConfig(@CustomType.Parameter("workloadPool") @Nullable String workloadPool) {
        this.workloadPool = workloadPool;
    }

    /**
     * @return The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    public Optional<String> workloadPool() {
        return Optional.ofNullable(this.workloadPool);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterWorkloadIdentityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterWorkloadIdentityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder workloadPool(@Nullable String workloadPool) {
            this.workloadPool = workloadPool;
            return this;
        }        public ClusterWorkloadIdentityConfig build() {
            return new ClusterWorkloadIdentityConfig(workloadPool);
        }
    }
}