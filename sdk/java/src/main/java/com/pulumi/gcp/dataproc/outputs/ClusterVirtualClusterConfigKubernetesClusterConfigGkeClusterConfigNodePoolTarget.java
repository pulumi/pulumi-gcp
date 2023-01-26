// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget {
    /**
     * @return The target GKE node pool.
     * 
     */
    private String nodePool;
    /**
     * @return The configuration for the GKE node pool.
     * If specified, Dataproc attempts to create a node pool with the specified shape.
     * If one with the same name already exists, it is verified against all specified fields.
     * If a field differs, the virtual cluster creation will fail.
     * 
     */
    private @Nullable ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig nodePoolConfig;
    /**
     * @return The roles associated with the GKE node pool.
     * One of `&#34;DEFAULT&#34;`, `&#34;CONTROLLER&#34;`, `&#34;SPARK_DRIVER&#34;` or `&#34;SPARK_EXECUTOR&#34;`.
     * 
     */
    private List<String> roles;

    private ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget() {}
    /**
     * @return The target GKE node pool.
     * 
     */
    public String nodePool() {
        return this.nodePool;
    }
    /**
     * @return The configuration for the GKE node pool.
     * If specified, Dataproc attempts to create a node pool with the specified shape.
     * If one with the same name already exists, it is verified against all specified fields.
     * If a field differs, the virtual cluster creation will fail.
     * 
     */
    public Optional<ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig> nodePoolConfig() {
        return Optional.ofNullable(this.nodePoolConfig);
    }
    /**
     * @return The roles associated with the GKE node pool.
     * One of `&#34;DEFAULT&#34;`, `&#34;CONTROLLER&#34;`, `&#34;SPARK_DRIVER&#34;` or `&#34;SPARK_EXECUTOR&#34;`.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String nodePool;
        private @Nullable ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig nodePoolConfig;
        private List<String> roles;
        public Builder() {}
        public Builder(ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodePool = defaults.nodePool;
    	      this.nodePoolConfig = defaults.nodePoolConfig;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder nodePool(String nodePool) {
            this.nodePool = Objects.requireNonNull(nodePool);
            return this;
        }
        @CustomType.Setter
        public Builder nodePoolConfig(@Nullable ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTargetNodePoolConfig nodePoolConfig) {
            this.nodePoolConfig = nodePoolConfig;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget build() {
            final var o = new ClusterVirtualClusterConfigKubernetesClusterConfigGkeClusterConfigNodePoolTarget();
            o.nodePool = nodePool;
            o.nodePoolConfig = nodePoolConfig;
            o.roles = roles;
            return o;
        }
    }
}