// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ClusterNodeConfigEphemeralStorageLocalSsdConfig {
    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    private Integer localSsdCount;

    private ClusterNodeConfigEphemeralStorageLocalSsdConfig() {}
    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    public Integer localSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigEphemeralStorageLocalSsdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer localSsdCount;
        public Builder() {}
        public Builder(ClusterNodeConfigEphemeralStorageLocalSsdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        @CustomType.Setter
        public Builder localSsdCount(Integer localSsdCount) {
            if (localSsdCount == null) {
              throw new MissingRequiredPropertyException("ClusterNodeConfigEphemeralStorageLocalSsdConfig", "localSsdCount");
            }
            this.localSsdCount = localSsdCount;
            return this;
        }
        public ClusterNodeConfigEphemeralStorageLocalSsdConfig build() {
            final var _resultValue = new ClusterNodeConfigEphemeralStorageLocalSsdConfig();
            _resultValue.localSsdCount = localSsdCount;
            return _resultValue;
        }
    }
}
