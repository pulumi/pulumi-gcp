// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ClusterAddonsConfigGcsFuseCsiDriverConfig {
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
    private Boolean enabled;

    private ClusterAddonsConfigGcsFuseCsiDriverConfig() {}
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
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigGcsFuseCsiDriverConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(ClusterAddonsConfigGcsFuseCsiDriverConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public ClusterAddonsConfigGcsFuseCsiDriverConfig build() {
            final var o = new ClusterAddonsConfigGcsFuseCsiDriverConfig();
            o.enabled = enabled;
            return o;
        }
    }
}