// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalClusterControlPlaneApiServerArg;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfig;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalClusterControlPlane {
    /**
     * @return Customizes the default API server args. Only a subset of
     * customized flags are supported. Please refer to the API server
     * documentation below to know the exact format:
     * https://kubernetes.io/docs/reference/command-line-tools-reference/kube-apiserver/
     * Structure is documented below.
     * 
     */
    private @Nullable List<BareMetalClusterControlPlaneApiServerArg> apiServerArgs;
    /**
     * @return Configures the node pool running the control plane. If specified the corresponding NodePool will be created for the cluster&#39;s control plane. The NodePool will have the same name and namespace as the cluster.
     * Structure is documented below.
     * 
     */
    private BareMetalClusterControlPlaneControlPlaneNodePoolConfig controlPlaneNodePoolConfig;

    private BareMetalClusterControlPlane() {}
    /**
     * @return Customizes the default API server args. Only a subset of
     * customized flags are supported. Please refer to the API server
     * documentation below to know the exact format:
     * https://kubernetes.io/docs/reference/command-line-tools-reference/kube-apiserver/
     * Structure is documented below.
     * 
     */
    public List<BareMetalClusterControlPlaneApiServerArg> apiServerArgs() {
        return this.apiServerArgs == null ? List.of() : this.apiServerArgs;
    }
    /**
     * @return Configures the node pool running the control plane. If specified the corresponding NodePool will be created for the cluster&#39;s control plane. The NodePool will have the same name and namespace as the cluster.
     * Structure is documented below.
     * 
     */
    public BareMetalClusterControlPlaneControlPlaneNodePoolConfig controlPlaneNodePoolConfig() {
        return this.controlPlaneNodePoolConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterControlPlane defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BareMetalClusterControlPlaneApiServerArg> apiServerArgs;
        private BareMetalClusterControlPlaneControlPlaneNodePoolConfig controlPlaneNodePoolConfig;
        public Builder() {}
        public Builder(BareMetalClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerArgs = defaults.apiServerArgs;
    	      this.controlPlaneNodePoolConfig = defaults.controlPlaneNodePoolConfig;
        }

        @CustomType.Setter
        public Builder apiServerArgs(@Nullable List<BareMetalClusterControlPlaneApiServerArg> apiServerArgs) {
            this.apiServerArgs = apiServerArgs;
            return this;
        }
        public Builder apiServerArgs(BareMetalClusterControlPlaneApiServerArg... apiServerArgs) {
            return apiServerArgs(List.of(apiServerArgs));
        }
        @CustomType.Setter
        public Builder controlPlaneNodePoolConfig(BareMetalClusterControlPlaneControlPlaneNodePoolConfig controlPlaneNodePoolConfig) {
            this.controlPlaneNodePoolConfig = Objects.requireNonNull(controlPlaneNodePoolConfig);
            return this;
        }
        public BareMetalClusterControlPlane build() {
            final var o = new BareMetalClusterControlPlane();
            o.apiServerArgs = apiServerArgs;
            o.controlPlaneNodePoolConfig = controlPlaneNodePoolConfig;
            return o;
        }
    }
}