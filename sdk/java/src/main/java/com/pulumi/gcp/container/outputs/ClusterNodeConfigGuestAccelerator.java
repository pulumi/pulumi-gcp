// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.outputs.ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig;
import com.pulumi.gcp.container.outputs.ClusterNodeConfigGuestAcceleratorGpuSharingConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeConfigGuestAccelerator {
    /**
     * @return The number of the guest accelerator cards exposed to this instance.
     * 
     */
    private Integer count;
    /**
     * @return Configuration for auto installation of GPU driver. Structure is documented below.
     * 
     */
    private @Nullable ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig gpuDriverInstallationConfig;
    /**
     * @return Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    private @Nullable String gpuPartitionSize;
    /**
     * @return Configuration for GPU sharing. Structure is documented below.
     * 
     */
    private @Nullable ClusterNodeConfigGuestAcceleratorGpuSharingConfig gpuSharingConfig;
    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private String type;

    private ClusterNodeConfigGuestAccelerator() {}
    /**
     * @return The number of the guest accelerator cards exposed to this instance.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return Configuration for auto installation of GPU driver. Structure is documented below.
     * 
     */
    public Optional<ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig> gpuDriverInstallationConfig() {
        return Optional.ofNullable(this.gpuDriverInstallationConfig);
    }
    /**
     * @return Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    public Optional<String> gpuPartitionSize() {
        return Optional.ofNullable(this.gpuPartitionSize);
    }
    /**
     * @return Configuration for GPU sharing. Structure is documented below.
     * 
     */
    public Optional<ClusterNodeConfigGuestAcceleratorGpuSharingConfig> gpuSharingConfig() {
        return Optional.ofNullable(this.gpuSharingConfig);
    }
    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private @Nullable ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig gpuDriverInstallationConfig;
        private @Nullable String gpuPartitionSize;
        private @Nullable ClusterNodeConfigGuestAcceleratorGpuSharingConfig gpuSharingConfig;
        private String type;
        public Builder() {}
        public Builder(ClusterNodeConfigGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuDriverInstallationConfig = defaults.gpuDriverInstallationConfig;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.gpuSharingConfig = defaults.gpuSharingConfig;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("ClusterNodeConfigGuestAccelerator", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder gpuDriverInstallationConfig(@Nullable ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig gpuDriverInstallationConfig) {

            this.gpuDriverInstallationConfig = gpuDriverInstallationConfig;
            return this;
        }
        @CustomType.Setter
        public Builder gpuPartitionSize(@Nullable String gpuPartitionSize) {

            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }
        @CustomType.Setter
        public Builder gpuSharingConfig(@Nullable ClusterNodeConfigGuestAcceleratorGpuSharingConfig gpuSharingConfig) {

            this.gpuSharingConfig = gpuSharingConfig;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ClusterNodeConfigGuestAccelerator", "type");
            }
            this.type = type;
            return this;
        }
        public ClusterNodeConfigGuestAccelerator build() {
            final var _resultValue = new ClusterNodeConfigGuestAccelerator();
            _resultValue.count = count;
            _resultValue.gpuDriverInstallationConfig = gpuDriverInstallationConfig;
            _resultValue.gpuPartitionSize = gpuPartitionSize;
            _resultValue.gpuSharingConfig = gpuSharingConfig;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
