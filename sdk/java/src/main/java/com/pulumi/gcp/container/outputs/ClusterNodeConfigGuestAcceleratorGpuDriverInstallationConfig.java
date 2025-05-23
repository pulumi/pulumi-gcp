// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig {
    /**
     * @return Mode for how the GPU driver is installed.
     * Accepted values are:
     * * `&#34;GPU_DRIVER_VERSION_UNSPECIFIED&#34;`: Default value is to install the &#34;Default&#34; GPU driver. Before GKE `1.30.1-gke.1156000`, the default value is to not install any GPU driver.
     * * `&#34;INSTALLATION_DISABLED&#34;`: Disable GPU driver auto installation and needs manual installation.
     * * `&#34;DEFAULT&#34;`: &#34;Default&#34; GPU driver in COS and Ubuntu.
     * * `&#34;LATEST&#34;`: &#34;Latest&#34; GPU driver in COS.
     * 
     */
    private String gpuDriverVersion;

    private ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig() {}
    /**
     * @return Mode for how the GPU driver is installed.
     * Accepted values are:
     * * `&#34;GPU_DRIVER_VERSION_UNSPECIFIED&#34;`: Default value is to install the &#34;Default&#34; GPU driver. Before GKE `1.30.1-gke.1156000`, the default value is to not install any GPU driver.
     * * `&#34;INSTALLATION_DISABLED&#34;`: Disable GPU driver auto installation and needs manual installation.
     * * `&#34;DEFAULT&#34;`: &#34;Default&#34; GPU driver in COS and Ubuntu.
     * * `&#34;LATEST&#34;`: &#34;Latest&#34; GPU driver in COS.
     * 
     */
    public String gpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gpuDriverVersion;
        public Builder() {}
        public Builder(ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gpuDriverVersion = defaults.gpuDriverVersion;
        }

        @CustomType.Setter
        public Builder gpuDriverVersion(String gpuDriverVersion) {
            if (gpuDriverVersion == null) {
              throw new MissingRequiredPropertyException("ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig", "gpuDriverVersion");
            }
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig build() {
            final var _resultValue = new ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfig();
            _resultValue.gpuDriverVersion = gpuDriverVersion;
            return _resultValue;
        }
    }
}
