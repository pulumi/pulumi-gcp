// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterAddonsConfigGcsFuseCsiDriverConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigGcsFuseCsiDriverConfigArgs Empty = new ClusterAddonsConfigGcsFuseCsiDriverConfigArgs();

    /**
     * Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
     * 
     * for autopilot clusters. Resource limits for `cpu` and `memory` must be defined to enable node auto-provisioning for GKE Standard.
     * 
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     * not.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
     * 
     * for autopilot clusters. Resource limits for `cpu` and `memory` must be defined to enable node auto-provisioning for GKE Standard.
     * 
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     * not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterAddonsConfigGcsFuseCsiDriverConfigArgs() {}

    private ClusterAddonsConfigGcsFuseCsiDriverConfigArgs(ClusterAddonsConfigGcsFuseCsiDriverConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAddonsConfigGcsFuseCsiDriverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAddonsConfigGcsFuseCsiDriverConfigArgs $;

        public Builder() {
            $ = new ClusterAddonsConfigGcsFuseCsiDriverConfigArgs();
        }

        public Builder(ClusterAddonsConfigGcsFuseCsiDriverConfigArgs defaults) {
            $ = new ClusterAddonsConfigGcsFuseCsiDriverConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
         * 
         * for autopilot clusters. Resource limits for `cpu` and `memory` must be defined to enable node auto-provisioning for GKE Standard.
         * 
         * If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * not.
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
         * for autopilot clusters. Resource limits for `cpu` and `memory` must be defined to enable node auto-provisioning for GKE Standard.
         * 
         * If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterAddonsConfigGcsFuseCsiDriverConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}