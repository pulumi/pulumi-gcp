// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.notebooks.outputs.RuntimeSoftwareConfigKernel;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeSoftwareConfig {
    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    private @Nullable String customGpuDriverPath;
    /**
     * @return Verifies core internal services are running. Default: True.
     * 
     */
    private @Nullable Boolean enableHealthMonitoring;
    /**
     * @return Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    private @Nullable Boolean idleShutdown;
    /**
     * @return Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    private @Nullable Integer idleShutdownTimeout;
    /**
     * @return Install Nvidia Driver automatically.
     * 
     */
    private @Nullable Boolean installGpuDriver;
    /**
     * @return Use a list of container images to use as Kernels in the notebook instance.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RuntimeSoftwareConfigKernel> kernels;
    /**
     * @return Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    private @Nullable String notebookUpgradeSchedule;
    /**
     * @return Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    private @Nullable String postStartupScript;
    /**
     * @return Behavior for the post startup script.
     * Possible values are: `POST_STARTUP_SCRIPT_BEHAVIOR_UNSPECIFIED`, `RUN_EVERY_START`, `DOWNLOAD_AND_RUN_EVERY_START`.
     * 
     */
    private @Nullable String postStartupScriptBehavior;
    /**
     * @return (Output)
     * Bool indicating whether an newer image is available in an image family.
     * 
     */
    private @Nullable Boolean upgradeable;

    private RuntimeSoftwareConfig() {}
    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    public Optional<String> customGpuDriverPath() {
        return Optional.ofNullable(this.customGpuDriverPath);
    }
    /**
     * @return Verifies core internal services are running. Default: True.
     * 
     */
    public Optional<Boolean> enableHealthMonitoring() {
        return Optional.ofNullable(this.enableHealthMonitoring);
    }
    /**
     * @return Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    public Optional<Boolean> idleShutdown() {
        return Optional.ofNullable(this.idleShutdown);
    }
    /**
     * @return Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    public Optional<Integer> idleShutdownTimeout() {
        return Optional.ofNullable(this.idleShutdownTimeout);
    }
    /**
     * @return Install Nvidia Driver automatically.
     * 
     */
    public Optional<Boolean> installGpuDriver() {
        return Optional.ofNullable(this.installGpuDriver);
    }
    /**
     * @return Use a list of container images to use as Kernels in the notebook instance.
     * Structure is documented below.
     * 
     */
    public List<RuntimeSoftwareConfigKernel> kernels() {
        return this.kernels == null ? List.of() : this.kernels;
    }
    /**
     * @return Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    public Optional<String> notebookUpgradeSchedule() {
        return Optional.ofNullable(this.notebookUpgradeSchedule);
    }
    /**
     * @return Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    public Optional<String> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }
    /**
     * @return Behavior for the post startup script.
     * Possible values are: `POST_STARTUP_SCRIPT_BEHAVIOR_UNSPECIFIED`, `RUN_EVERY_START`, `DOWNLOAD_AND_RUN_EVERY_START`.
     * 
     */
    public Optional<String> postStartupScriptBehavior() {
        return Optional.ofNullable(this.postStartupScriptBehavior);
    }
    /**
     * @return (Output)
     * Bool indicating whether an newer image is available in an image family.
     * 
     */
    public Optional<Boolean> upgradeable() {
        return Optional.ofNullable(this.upgradeable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeSoftwareConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customGpuDriverPath;
        private @Nullable Boolean enableHealthMonitoring;
        private @Nullable Boolean idleShutdown;
        private @Nullable Integer idleShutdownTimeout;
        private @Nullable Boolean installGpuDriver;
        private @Nullable List<RuntimeSoftwareConfigKernel> kernels;
        private @Nullable String notebookUpgradeSchedule;
        private @Nullable String postStartupScript;
        private @Nullable String postStartupScriptBehavior;
        private @Nullable Boolean upgradeable;
        public Builder() {}
        public Builder(RuntimeSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.enableHealthMonitoring = defaults.enableHealthMonitoring;
    	      this.idleShutdown = defaults.idleShutdown;
    	      this.idleShutdownTimeout = defaults.idleShutdownTimeout;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.kernels = defaults.kernels;
    	      this.notebookUpgradeSchedule = defaults.notebookUpgradeSchedule;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.postStartupScriptBehavior = defaults.postStartupScriptBehavior;
    	      this.upgradeable = defaults.upgradeable;
        }

        @CustomType.Setter
        public Builder customGpuDriverPath(@Nullable String customGpuDriverPath) {

            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }
        @CustomType.Setter
        public Builder enableHealthMonitoring(@Nullable Boolean enableHealthMonitoring) {

            this.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }
        @CustomType.Setter
        public Builder idleShutdown(@Nullable Boolean idleShutdown) {

            this.idleShutdown = idleShutdown;
            return this;
        }
        @CustomType.Setter
        public Builder idleShutdownTimeout(@Nullable Integer idleShutdownTimeout) {

            this.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder installGpuDriver(@Nullable Boolean installGpuDriver) {

            this.installGpuDriver = installGpuDriver;
            return this;
        }
        @CustomType.Setter
        public Builder kernels(@Nullable List<RuntimeSoftwareConfigKernel> kernels) {

            this.kernels = kernels;
            return this;
        }
        public Builder kernels(RuntimeSoftwareConfigKernel... kernels) {
            return kernels(List.of(kernels));
        }
        @CustomType.Setter
        public Builder notebookUpgradeSchedule(@Nullable String notebookUpgradeSchedule) {

            this.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }
        @CustomType.Setter
        public Builder postStartupScript(@Nullable String postStartupScript) {

            this.postStartupScript = postStartupScript;
            return this;
        }
        @CustomType.Setter
        public Builder postStartupScriptBehavior(@Nullable String postStartupScriptBehavior) {

            this.postStartupScriptBehavior = postStartupScriptBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeable(@Nullable Boolean upgradeable) {

            this.upgradeable = upgradeable;
            return this;
        }
        public RuntimeSoftwareConfig build() {
            final var _resultValue = new RuntimeSoftwareConfig();
            _resultValue.customGpuDriverPath = customGpuDriverPath;
            _resultValue.enableHealthMonitoring = enableHealthMonitoring;
            _resultValue.idleShutdown = idleShutdown;
            _resultValue.idleShutdownTimeout = idleShutdownTimeout;
            _resultValue.installGpuDriver = installGpuDriver;
            _resultValue.kernels = kernels;
            _resultValue.notebookUpgradeSchedule = notebookUpgradeSchedule;
            _resultValue.postStartupScript = postStartupScript;
            _resultValue.postStartupScriptBehavior = postStartupScriptBehavior;
            _resultValue.upgradeable = upgradeable;
            return _resultValue;
        }
    }
}
