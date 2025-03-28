// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeConfigKubeletConfig {
    /**
     * @return Defines a comma-separated allowlist of unsafe sysctls or sysctl patterns which can be set on the Pods.
     * 
     */
    private @Nullable List<String> allowedUnsafeSysctls;
    /**
     * @return Defines the maximum number of container log files that can be present for a container.
     * 
     */
    private @Nullable Integer containerLogMaxFiles;
    /**
     * @return Defines the maximum size of the container log file before it is rotated.
     * 
     */
    private @Nullable String containerLogMaxSize;
    /**
     * @return Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    private @Nullable Boolean cpuCfsQuota;
    /**
     * @return Set the CPU CFS quota period value &#39;cpu.cfs_period_us&#39;.
     * 
     */
    private @Nullable String cpuCfsQuotaPeriod;
    /**
     * @return Control the CPU management policy on the node.
     * 
     */
    private @Nullable String cpuManagerPolicy;
    /**
     * @return Defines the percent of disk usage after which image garbage collection is always run.
     * 
     */
    private @Nullable Integer imageGcHighThresholdPercent;
    /**
     * @return Defines the percent of disk usage before which image garbage collection is never run. Lowest disk usage to garbage collect to.
     * 
     */
    private @Nullable Integer imageGcLowThresholdPercent;
    /**
     * @return Defines the maximum age an image can be unused before it is garbage collected.
     * 
     */
    private @Nullable String imageMaximumGcAge;
    /**
     * @return Defines the minimum age for an unused image before it is garbage collected.
     * 
     */
    private @Nullable String imageMinimumGcAge;
    /**
     * @return Controls whether the kubelet read-only port is enabled. It is strongly recommended to set this to `FALSE`. Possible values: `TRUE`, `FALSE`.
     * 
     */
    private @Nullable String insecureKubeletReadonlyPortEnabled;
    /**
     * @return Controls the maximum number of processes allowed to run in a pod.
     * 
     */
    private @Nullable Integer podPidsLimit;

    private NodePoolNodeConfigKubeletConfig() {}
    /**
     * @return Defines a comma-separated allowlist of unsafe sysctls or sysctl patterns which can be set on the Pods.
     * 
     */
    public List<String> allowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? List.of() : this.allowedUnsafeSysctls;
    }
    /**
     * @return Defines the maximum number of container log files that can be present for a container.
     * 
     */
    public Optional<Integer> containerLogMaxFiles() {
        return Optional.ofNullable(this.containerLogMaxFiles);
    }
    /**
     * @return Defines the maximum size of the container log file before it is rotated.
     * 
     */
    public Optional<String> containerLogMaxSize() {
        return Optional.ofNullable(this.containerLogMaxSize);
    }
    /**
     * @return Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    public Optional<Boolean> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }
    /**
     * @return Set the CPU CFS quota period value &#39;cpu.cfs_period_us&#39;.
     * 
     */
    public Optional<String> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }
    /**
     * @return Control the CPU management policy on the node.
     * 
     */
    public Optional<String> cpuManagerPolicy() {
        return Optional.ofNullable(this.cpuManagerPolicy);
    }
    /**
     * @return Defines the percent of disk usage after which image garbage collection is always run.
     * 
     */
    public Optional<Integer> imageGcHighThresholdPercent() {
        return Optional.ofNullable(this.imageGcHighThresholdPercent);
    }
    /**
     * @return Defines the percent of disk usage before which image garbage collection is never run. Lowest disk usage to garbage collect to.
     * 
     */
    public Optional<Integer> imageGcLowThresholdPercent() {
        return Optional.ofNullable(this.imageGcLowThresholdPercent);
    }
    /**
     * @return Defines the maximum age an image can be unused before it is garbage collected.
     * 
     */
    public Optional<String> imageMaximumGcAge() {
        return Optional.ofNullable(this.imageMaximumGcAge);
    }
    /**
     * @return Defines the minimum age for an unused image before it is garbage collected.
     * 
     */
    public Optional<String> imageMinimumGcAge() {
        return Optional.ofNullable(this.imageMinimumGcAge);
    }
    /**
     * @return Controls whether the kubelet read-only port is enabled. It is strongly recommended to set this to `FALSE`. Possible values: `TRUE`, `FALSE`.
     * 
     */
    public Optional<String> insecureKubeletReadonlyPortEnabled() {
        return Optional.ofNullable(this.insecureKubeletReadonlyPortEnabled);
    }
    /**
     * @return Controls the maximum number of processes allowed to run in a pod.
     * 
     */
    public Optional<Integer> podPidsLimit() {
        return Optional.ofNullable(this.podPidsLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedUnsafeSysctls;
        private @Nullable Integer containerLogMaxFiles;
        private @Nullable String containerLogMaxSize;
        private @Nullable Boolean cpuCfsQuota;
        private @Nullable String cpuCfsQuotaPeriod;
        private @Nullable String cpuManagerPolicy;
        private @Nullable Integer imageGcHighThresholdPercent;
        private @Nullable Integer imageGcLowThresholdPercent;
        private @Nullable String imageMaximumGcAge;
        private @Nullable String imageMinimumGcAge;
        private @Nullable String insecureKubeletReadonlyPortEnabled;
        private @Nullable Integer podPidsLimit;
        public Builder() {}
        public Builder(NodePoolNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.containerLogMaxFiles = defaults.containerLogMaxFiles;
    	      this.containerLogMaxSize = defaults.containerLogMaxSize;
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
    	      this.imageGcHighThresholdPercent = defaults.imageGcHighThresholdPercent;
    	      this.imageGcLowThresholdPercent = defaults.imageGcLowThresholdPercent;
    	      this.imageMaximumGcAge = defaults.imageMaximumGcAge;
    	      this.imageMinimumGcAge = defaults.imageMinimumGcAge;
    	      this.insecureKubeletReadonlyPortEnabled = defaults.insecureKubeletReadonlyPortEnabled;
    	      this.podPidsLimit = defaults.podPidsLimit;
        }

        @CustomType.Setter
        public Builder allowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {

            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }
        @CustomType.Setter
        public Builder containerLogMaxFiles(@Nullable Integer containerLogMaxFiles) {

            this.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }
        @CustomType.Setter
        public Builder containerLogMaxSize(@Nullable String containerLogMaxSize) {

            this.containerLogMaxSize = containerLogMaxSize;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {

            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {

            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder cpuManagerPolicy(@Nullable String cpuManagerPolicy) {

            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder imageGcHighThresholdPercent(@Nullable Integer imageGcHighThresholdPercent) {

            this.imageGcHighThresholdPercent = imageGcHighThresholdPercent;
            return this;
        }
        @CustomType.Setter
        public Builder imageGcLowThresholdPercent(@Nullable Integer imageGcLowThresholdPercent) {

            this.imageGcLowThresholdPercent = imageGcLowThresholdPercent;
            return this;
        }
        @CustomType.Setter
        public Builder imageMaximumGcAge(@Nullable String imageMaximumGcAge) {

            this.imageMaximumGcAge = imageMaximumGcAge;
            return this;
        }
        @CustomType.Setter
        public Builder imageMinimumGcAge(@Nullable String imageMinimumGcAge) {

            this.imageMinimumGcAge = imageMinimumGcAge;
            return this;
        }
        @CustomType.Setter
        public Builder insecureKubeletReadonlyPortEnabled(@Nullable String insecureKubeletReadonlyPortEnabled) {

            this.insecureKubeletReadonlyPortEnabled = insecureKubeletReadonlyPortEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder podPidsLimit(@Nullable Integer podPidsLimit) {

            this.podPidsLimit = podPidsLimit;
            return this;
        }
        public NodePoolNodeConfigKubeletConfig build() {
            final var _resultValue = new NodePoolNodeConfigKubeletConfig();
            _resultValue.allowedUnsafeSysctls = allowedUnsafeSysctls;
            _resultValue.containerLogMaxFiles = containerLogMaxFiles;
            _resultValue.containerLogMaxSize = containerLogMaxSize;
            _resultValue.cpuCfsQuota = cpuCfsQuota;
            _resultValue.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            _resultValue.cpuManagerPolicy = cpuManagerPolicy;
            _resultValue.imageGcHighThresholdPercent = imageGcHighThresholdPercent;
            _resultValue.imageGcLowThresholdPercent = imageGcLowThresholdPercent;
            _resultValue.imageMaximumGcAge = imageMaximumGcAge;
            _resultValue.imageMinimumGcAge = imageMinimumGcAge;
            _resultValue.insecureKubeletReadonlyPortEnabled = insecureKubeletReadonlyPortEnabled;
            _resultValue.podPidsLimit = podPidsLimit;
            return _resultValue;
        }
    }
}
