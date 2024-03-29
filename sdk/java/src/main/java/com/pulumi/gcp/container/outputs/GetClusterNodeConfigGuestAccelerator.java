// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.outputs.GetClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig;
import com.pulumi.gcp.container.outputs.GetClusterNodeConfigGuestAcceleratorGpuSharingConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterNodeConfigGuestAccelerator {
    /**
     * @return The number of the accelerator cards exposed to an instance.
     * 
     */
    private Integer count;
    /**
     * @return Configuration for auto installation of GPU driver.
     * 
     */
    private List<GetClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig> gpuDriverInstallationConfigs;
    /**
     * @return Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning)
     * 
     */
    private String gpuPartitionSize;
    /**
     * @return Configuration for GPU sharing.
     * 
     */
    private List<GetClusterNodeConfigGuestAcceleratorGpuSharingConfig> gpuSharingConfigs;
    /**
     * @return The accelerator type resource name.
     * 
     */
    private String type;

    private GetClusterNodeConfigGuestAccelerator() {}
    /**
     * @return The number of the accelerator cards exposed to an instance.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return Configuration for auto installation of GPU driver.
     * 
     */
    public List<GetClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig> gpuDriverInstallationConfigs() {
        return this.gpuDriverInstallationConfigs;
    }
    /**
     * @return Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning)
     * 
     */
    public String gpuPartitionSize() {
        return this.gpuPartitionSize;
    }
    /**
     * @return Configuration for GPU sharing.
     * 
     */
    public List<GetClusterNodeConfigGuestAcceleratorGpuSharingConfig> gpuSharingConfigs() {
        return this.gpuSharingConfigs;
    }
    /**
     * @return The accelerator type resource name.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private List<GetClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig> gpuDriverInstallationConfigs;
        private String gpuPartitionSize;
        private List<GetClusterNodeConfigGuestAcceleratorGpuSharingConfig> gpuSharingConfigs;
        private String type;
        public Builder() {}
        public Builder(GetClusterNodeConfigGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuDriverInstallationConfigs = defaults.gpuDriverInstallationConfigs;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.gpuSharingConfigs = defaults.gpuSharingConfigs;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetClusterNodeConfigGuestAccelerator", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder gpuDriverInstallationConfigs(List<GetClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig> gpuDriverInstallationConfigs) {
            if (gpuDriverInstallationConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterNodeConfigGuestAccelerator", "gpuDriverInstallationConfigs");
            }
            this.gpuDriverInstallationConfigs = gpuDriverInstallationConfigs;
            return this;
        }
        public Builder gpuDriverInstallationConfigs(GetClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig... gpuDriverInstallationConfigs) {
            return gpuDriverInstallationConfigs(List.of(gpuDriverInstallationConfigs));
        }
        @CustomType.Setter
        public Builder gpuPartitionSize(String gpuPartitionSize) {
            if (gpuPartitionSize == null) {
              throw new MissingRequiredPropertyException("GetClusterNodeConfigGuestAccelerator", "gpuPartitionSize");
            }
            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }
        @CustomType.Setter
        public Builder gpuSharingConfigs(List<GetClusterNodeConfigGuestAcceleratorGpuSharingConfig> gpuSharingConfigs) {
            if (gpuSharingConfigs == null) {
              throw new MissingRequiredPropertyException("GetClusterNodeConfigGuestAccelerator", "gpuSharingConfigs");
            }
            this.gpuSharingConfigs = gpuSharingConfigs;
            return this;
        }
        public Builder gpuSharingConfigs(GetClusterNodeConfigGuestAcceleratorGpuSharingConfig... gpuSharingConfigs) {
            return gpuSharingConfigs(List.of(gpuSharingConfigs));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetClusterNodeConfigGuestAccelerator", "type");
            }
            this.type = type;
            return this;
        }
        public GetClusterNodeConfigGuestAccelerator build() {
            final var _resultValue = new GetClusterNodeConfigGuestAccelerator();
            _resultValue.count = count;
            _resultValue.gpuDriverInstallationConfigs = gpuDriverInstallationConfigs;
            _resultValue.gpuPartitionSize = gpuPartitionSize;
            _resultValue.gpuSharingConfigs = gpuSharingConfigs;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
