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
public final class ClusterNodePoolNodeConfigKubeletConfig {
    /**
     * @return Defines a comma-separated allowlist of unsafe sysctls or sysctl patterns which can be set on the Pods. The allowed sysctl groups are `kernel.shm*`, `kernel.msg*`, `kernel.sem`, `fs.mqueue.*`, and `net.*`.
     * 
     */
    private @Nullable List<String> allowedUnsafeSysctls;
    /**
     * @return Defines the maximum number of container log files that can be present for a container. The integer must be between 2 and 10, inclusive.
     * 
     */
    private @Nullable Integer containerLogMaxFiles;
    /**
     * @return Defines the maximum size of the
     * container log file before it is rotated. Specified as a positive number and a
     * unit suffix, such as `&#34;100Ki&#34;`, `&#34;10Mi&#34;`. Valid units are &#34;Ki&#34;, &#34;Mi&#34;, &#34;Gi&#34;.
     * The value must be between `&#34;10Mi&#34;` and `&#34;500Mi&#34;`, inclusive. And the total container log size
     * (`container_log_max_size` * `container_log_max_files`) cannot exceed 1% of the total storage of the node.
     * 
     */
    private @Nullable String containerLogMaxSize;
    /**
     * @return If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    private @Nullable Boolean cpuCfsQuota;
    /**
     * @return The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `&#34;300ms&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;,
     * &#34;h&#34;. The value must be a positive duration.
     * 
     */
    private @Nullable String cpuCfsQuotaPeriod;
    /**
     * @return The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `&#34;none&#34;` or `&#34;static&#34;`. If unset (or set to the empty string `&#34;&#34;`), the API will treat the field as if set to &#34;none&#34;.
     * Prior to the 6.4.0 this field was marked as required. The workaround for the required field
     * is setting the empty string `&#34;&#34;`, which will function identically to not setting this field.
     * 
     */
    private @Nullable String cpuManagerPolicy;
    /**
     * @return Defines the percent of disk usage after which image garbage collection is always run. The integer must be between 10 and 85, inclusive.
     * 
     */
    private @Nullable Integer imageGcHighThresholdPercent;
    /**
     * @return Defines the percent of disk usage before which image garbage collection is never run. Lowest disk usage to garbage collect to. The integer must be between 10 and 85, inclusive.
     * 
     */
    private @Nullable Integer imageGcLowThresholdPercent;
    /**
     * @return Defines the maximum age an image can be unused before it is garbage collected. Specified as a sequence of decimal numbers, each with optional fraction and a unit suffix, such as `&#34;300s&#34;`, `&#34;1.5m&#34;`, and `&#34;2h45m&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;, &#34;h&#34;. The value must be a positive duration.
     * 
     */
    private @Nullable String imageMaximumGcAge;
    /**
     * @return Defines the minimum age for an unused image before it is garbage collected. Specified as a sequence of decimal numbers, each with optional fraction and a unit suffix, such as `&#34;300s&#34;`, `&#34;1.5m&#34;`. The value cannot be greater than &#34;2m&#34;.
     * 
     */
    private @Nullable String imageMinimumGcAge;
    /**
     * @return Controls whether the kubelet read-only port is enabled. It is strongly recommended to set this to `FALSE`. Possible values: `TRUE`, `FALSE`.
     * 
     */
    private @Nullable String insecureKubeletReadonlyPortEnabled;
    /**
     * @return Controls the maximum number of processes allowed to run in a pod. The value must be greater than or equal to 1024 and less than 4194304.
     * 
     */
    private @Nullable Integer podPidsLimit;

    private ClusterNodePoolNodeConfigKubeletConfig() {}
    /**
     * @return Defines a comma-separated allowlist of unsafe sysctls or sysctl patterns which can be set on the Pods. The allowed sysctl groups are `kernel.shm*`, `kernel.msg*`, `kernel.sem`, `fs.mqueue.*`, and `net.*`.
     * 
     */
    public List<String> allowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? List.of() : this.allowedUnsafeSysctls;
    }
    /**
     * @return Defines the maximum number of container log files that can be present for a container. The integer must be between 2 and 10, inclusive.
     * 
     */
    public Optional<Integer> containerLogMaxFiles() {
        return Optional.ofNullable(this.containerLogMaxFiles);
    }
    /**
     * @return Defines the maximum size of the
     * container log file before it is rotated. Specified as a positive number and a
     * unit suffix, such as `&#34;100Ki&#34;`, `&#34;10Mi&#34;`. Valid units are &#34;Ki&#34;, &#34;Mi&#34;, &#34;Gi&#34;.
     * The value must be between `&#34;10Mi&#34;` and `&#34;500Mi&#34;`, inclusive. And the total container log size
     * (`container_log_max_size` * `container_log_max_files`) cannot exceed 1% of the total storage of the node.
     * 
     */
    public Optional<String> containerLogMaxSize() {
        return Optional.ofNullable(this.containerLogMaxSize);
    }
    /**
     * @return If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    public Optional<Boolean> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }
    /**
     * @return The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `&#34;300ms&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;,
     * &#34;h&#34;. The value must be a positive duration.
     * 
     */
    public Optional<String> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }
    /**
     * @return The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `&#34;none&#34;` or `&#34;static&#34;`. If unset (or set to the empty string `&#34;&#34;`), the API will treat the field as if set to &#34;none&#34;.
     * Prior to the 6.4.0 this field was marked as required. The workaround for the required field
     * is setting the empty string `&#34;&#34;`, which will function identically to not setting this field.
     * 
     */
    public Optional<String> cpuManagerPolicy() {
        return Optional.ofNullable(this.cpuManagerPolicy);
    }
    /**
     * @return Defines the percent of disk usage after which image garbage collection is always run. The integer must be between 10 and 85, inclusive.
     * 
     */
    public Optional<Integer> imageGcHighThresholdPercent() {
        return Optional.ofNullable(this.imageGcHighThresholdPercent);
    }
    /**
     * @return Defines the percent of disk usage before which image garbage collection is never run. Lowest disk usage to garbage collect to. The integer must be between 10 and 85, inclusive.
     * 
     */
    public Optional<Integer> imageGcLowThresholdPercent() {
        return Optional.ofNullable(this.imageGcLowThresholdPercent);
    }
    /**
     * @return Defines the maximum age an image can be unused before it is garbage collected. Specified as a sequence of decimal numbers, each with optional fraction and a unit suffix, such as `&#34;300s&#34;`, `&#34;1.5m&#34;`, and `&#34;2h45m&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;, &#34;h&#34;. The value must be a positive duration.
     * 
     */
    public Optional<String> imageMaximumGcAge() {
        return Optional.ofNullable(this.imageMaximumGcAge);
    }
    /**
     * @return Defines the minimum age for an unused image before it is garbage collected. Specified as a sequence of decimal numbers, each with optional fraction and a unit suffix, such as `&#34;300s&#34;`, `&#34;1.5m&#34;`. The value cannot be greater than &#34;2m&#34;.
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
     * @return Controls the maximum number of processes allowed to run in a pod. The value must be greater than or equal to 1024 and less than 4194304.
     * 
     */
    public Optional<Integer> podPidsLimit() {
        return Optional.ofNullable(this.podPidsLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigKubeletConfig defaults) {
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
        public Builder(ClusterNodePoolNodeConfigKubeletConfig defaults) {
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
        public ClusterNodePoolNodeConfigKubeletConfig build() {
            final var _resultValue = new ClusterNodePoolNodeConfigKubeletConfig();
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
