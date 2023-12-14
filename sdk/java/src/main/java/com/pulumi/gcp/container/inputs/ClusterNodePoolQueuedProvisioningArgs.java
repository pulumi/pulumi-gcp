// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterNodePoolQueuedProvisioningArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolQueuedProvisioningArgs Empty = new ClusterNodePoolQueuedProvisioningArgs();

    /**
     * Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterNodePoolQueuedProvisioningArgs() {}

    private ClusterNodePoolQueuedProvisioningArgs(ClusterNodePoolQueuedProvisioningArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolQueuedProvisioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolQueuedProvisioningArgs $;

        public Builder() {
            $ = new ClusterNodePoolQueuedProvisioningArgs();
        }

        public Builder(ClusterNodePoolQueuedProvisioningArgs defaults) {
            $ = new ClusterNodePoolQueuedProvisioningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterNodePoolQueuedProvisioningArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}