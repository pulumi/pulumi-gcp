// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetGke {
    /**
     * @return Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    private final @Nullable String cluster;
    /**
     * @return Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * 
     */
    private final @Nullable Boolean internalIp;

    @CustomType.Constructor
    private TargetGke(
        @CustomType.Parameter("cluster") @Nullable String cluster,
        @CustomType.Parameter("internalIp") @Nullable Boolean internalIp) {
        this.cluster = cluster;
        this.internalIp = internalIp;
    }

    /**
     * @return Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    public Optional<String> cluster() {
        return Optional.ofNullable(this.cluster);
    }
    /**
     * @return Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * 
     */
    public Optional<Boolean> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGke defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cluster;
        private @Nullable Boolean internalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGke defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.internalIp = defaults.internalIp;
        }

        public Builder cluster(@Nullable String cluster) {
            this.cluster = cluster;
            return this;
        }
        public Builder internalIp(@Nullable Boolean internalIp) {
            this.internalIp = internalIp;
            return this;
        }        public TargetGke build() {
            return new TargetGke(cluster, internalIp);
        }
    }
}