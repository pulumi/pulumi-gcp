// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ClusterWorkloadAltsConfig {
    /**
     * @return Whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workloadPool) must be non-empty).
     * 
     */
    private Boolean enableAlts;

    private ClusterWorkloadAltsConfig() {}
    /**
     * @return Whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workloadPool) must be non-empty).
     * 
     */
    public Boolean enableAlts() {
        return this.enableAlts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterWorkloadAltsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableAlts;
        public Builder() {}
        public Builder(ClusterWorkloadAltsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAlts = defaults.enableAlts;
        }

        @CustomType.Setter
        public Builder enableAlts(Boolean enableAlts) {
            if (enableAlts == null) {
              throw new MissingRequiredPropertyException("ClusterWorkloadAltsConfig", "enableAlts");
            }
            this.enableAlts = enableAlts;
            return this;
        }
        public ClusterWorkloadAltsConfig build() {
            final var _resultValue = new ClusterWorkloadAltsConfig();
            _resultValue.enableAlts = enableAlts;
            return _resultValue;
        }
    }
}