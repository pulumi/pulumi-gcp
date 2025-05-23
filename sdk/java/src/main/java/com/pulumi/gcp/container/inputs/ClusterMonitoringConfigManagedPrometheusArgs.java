// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMonitoringConfigManagedPrometheusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMonitoringConfigManagedPrometheusArgs Empty = new ClusterMonitoringConfigManagedPrometheusArgs();

    /**
     * Configuration options for GKE Auto-Monitoring.
     * 
     */
    @Import(name="autoMonitoringConfig")
    private @Nullable Output<ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs> autoMonitoringConfig;

    /**
     * @return Configuration options for GKE Auto-Monitoring.
     * 
     */
    public Optional<Output<ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs>> autoMonitoringConfig() {
        return Optional.ofNullable(this.autoMonitoringConfig);
    }

    /**
     * Whether or not the managed collection is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether or not the managed collection is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterMonitoringConfigManagedPrometheusArgs() {}

    private ClusterMonitoringConfigManagedPrometheusArgs(ClusterMonitoringConfigManagedPrometheusArgs $) {
        this.autoMonitoringConfig = $.autoMonitoringConfig;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMonitoringConfigManagedPrometheusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMonitoringConfigManagedPrometheusArgs $;

        public Builder() {
            $ = new ClusterMonitoringConfigManagedPrometheusArgs();
        }

        public Builder(ClusterMonitoringConfigManagedPrometheusArgs defaults) {
            $ = new ClusterMonitoringConfigManagedPrometheusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoMonitoringConfig Configuration options for GKE Auto-Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder autoMonitoringConfig(@Nullable Output<ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs> autoMonitoringConfig) {
            $.autoMonitoringConfig = autoMonitoringConfig;
            return this;
        }

        /**
         * @param autoMonitoringConfig Configuration options for GKE Auto-Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder autoMonitoringConfig(ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs autoMonitoringConfig) {
            return autoMonitoringConfig(Output.of(autoMonitoringConfig));
        }

        /**
         * @param enabled Whether or not the managed collection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not the managed collection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterMonitoringConfigManagedPrometheusArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ClusterMonitoringConfigManagedPrometheusArgs", "enabled");
            }
            return $;
        }
    }

}
