// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigSandboxConfig {
    /**
     * @return Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     * * `&#34;gvisor&#34;`: Pods run within a gVisor sandbox.
     * 
     */
    private String sandboxType;

    private ClusterNodePoolNodeConfigSandboxConfig() {}
    /**
     * @return Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     * * `&#34;gvisor&#34;`: Pods run within a gVisor sandbox.
     * 
     */
    public String sandboxType() {
        return this.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sandboxType;
        public Builder() {}
        public Builder(ClusterNodePoolNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        @CustomType.Setter
        public Builder sandboxType(String sandboxType) {
            if (sandboxType == null) {
              throw new MissingRequiredPropertyException("ClusterNodePoolNodeConfigSandboxConfig", "sandboxType");
            }
            this.sandboxType = sandboxType;
            return this;
        }
        public ClusterNodePoolNodeConfigSandboxConfig build() {
            final var _resultValue = new ClusterNodePoolNodeConfigSandboxConfig();
            _resultValue.sandboxType = sandboxType;
            return _resultValue;
        }
    }
}
