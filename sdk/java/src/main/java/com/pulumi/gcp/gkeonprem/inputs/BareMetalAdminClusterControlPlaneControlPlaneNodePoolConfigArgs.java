// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs;
import java.util.Objects;


public final class BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs Empty = new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs();

    /**
     * The generic configuration for a node pool running the control plane.
     * Structure is documented below.
     * 
     */
    @Import(name="nodePoolConfig", required=true)
    private Output<BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs> nodePoolConfig;

    /**
     * @return The generic configuration for a node pool running the control plane.
     * Structure is documented below.
     * 
     */
    public Output<BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs> nodePoolConfig() {
        return this.nodePoolConfig;
    }

    private BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs() {}

    private BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs(BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs $) {
        this.nodePoolConfig = $.nodePoolConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs $;

        public Builder() {
            $ = new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs();
        }

        public Builder(BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs defaults) {
            $ = new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodePoolConfig The generic configuration for a node pool running the control plane.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolConfig(Output<BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs> nodePoolConfig) {
            $.nodePoolConfig = nodePoolConfig;
            return this;
        }

        /**
         * @param nodePoolConfig The generic configuration for a node pool running the control plane.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolConfig(BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs nodePoolConfig) {
            return nodePoolConfig(Output.of(nodePoolConfig));
        }

        public BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs build() {
            if ($.nodePoolConfig == null) {
                throw new MissingRequiredPropertyException("BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs", "nodePoolConfig");
            }
            return $;
        }
    }

}
