// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeConfigEphemeralStorageLocalSsdConfig {
    /**
     * @return Number of local SSDs to be utilized for GKE Data Cache. Uses NVMe interfaces.
     * 
     */
    private @Nullable Integer dataCacheCount;
    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD must be 375 or 3000 GB in size, and all local SSDs must share the same size.
     * 
     */
    private Integer localSsdCount;

    private NodePoolNodeConfigEphemeralStorageLocalSsdConfig() {}
    /**
     * @return Number of local SSDs to be utilized for GKE Data Cache. Uses NVMe interfaces.
     * 
     */
    public Optional<Integer> dataCacheCount() {
        return Optional.ofNullable(this.dataCacheCount);
    }
    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD must be 375 or 3000 GB in size, and all local SSDs must share the same size.
     * 
     */
    public Integer localSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigEphemeralStorageLocalSsdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dataCacheCount;
        private Integer localSsdCount;
        public Builder() {}
        public Builder(NodePoolNodeConfigEphemeralStorageLocalSsdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCacheCount = defaults.dataCacheCount;
    	      this.localSsdCount = defaults.localSsdCount;
        }

        @CustomType.Setter
        public Builder dataCacheCount(@Nullable Integer dataCacheCount) {

            this.dataCacheCount = dataCacheCount;
            return this;
        }
        @CustomType.Setter
        public Builder localSsdCount(Integer localSsdCount) {
            if (localSsdCount == null) {
              throw new MissingRequiredPropertyException("NodePoolNodeConfigEphemeralStorageLocalSsdConfig", "localSsdCount");
            }
            this.localSsdCount = localSsdCount;
            return this;
        }
        public NodePoolNodeConfigEphemeralStorageLocalSsdConfig build() {
            final var _resultValue = new NodePoolNodeConfigEphemeralStorageLocalSsdConfig();
            _resultValue.dataCacheCount = dataCacheCount;
            _resultValue.localSsdCount = localSsdCount;
            return _resultValue;
        }
    }
}
