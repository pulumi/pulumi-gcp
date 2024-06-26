// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NodePoolNodeConfigLocalNvmeSsdBlockConfig {
    /**
     * @return Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size.
     * 
     */
    private Integer localSsdCount;

    private NodePoolNodeConfigLocalNvmeSsdBlockConfig() {}
    /**
     * @return Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size.
     * 
     */
    public Integer localSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigLocalNvmeSsdBlockConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer localSsdCount;
        public Builder() {}
        public Builder(NodePoolNodeConfigLocalNvmeSsdBlockConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        @CustomType.Setter
        public Builder localSsdCount(Integer localSsdCount) {
            if (localSsdCount == null) {
              throw new MissingRequiredPropertyException("NodePoolNodeConfigLocalNvmeSsdBlockConfig", "localSsdCount");
            }
            this.localSsdCount = localSsdCount;
            return this;
        }
        public NodePoolNodeConfigLocalNvmeSsdBlockConfig build() {
            final var _resultValue = new NodePoolNodeConfigLocalNvmeSsdBlockConfig();
            _resultValue.localSsdCount = localSsdCount;
            return _resultValue;
        }
    }
}
