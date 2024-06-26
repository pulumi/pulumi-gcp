// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolNodeConfigWorkloadMetadataConfig {
    /**
     * @return Mode is the configuration for how to expose metadata to workloads running on the node.
     * 
     */
    private String mode;

    private GetClusterNodePoolNodeConfigWorkloadMetadataConfig() {}
    /**
     * @return Mode is the configuration for how to expose metadata to workloads running on the node.
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigWorkloadMetadataConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        public Builder() {}
        public Builder(GetClusterNodePoolNodeConfigWorkloadMetadataConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetClusterNodePoolNodeConfigWorkloadMetadataConfig", "mode");
            }
            this.mode = mode;
            return this;
        }
        public GetClusterNodePoolNodeConfigWorkloadMetadataConfig build() {
            final var _resultValue = new GetClusterNodePoolNodeConfigWorkloadMetadataConfig();
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
