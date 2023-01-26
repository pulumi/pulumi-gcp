// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigManagedPrometheusConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttachedClusterMonitoringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedClusterMonitoringConfigArgs Empty = new AttachedClusterMonitoringConfigArgs();

    /**
     * Enable Google Cloud Managed Service for Prometheus in the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="managedPrometheusConfig")
    private @Nullable Output<AttachedClusterMonitoringConfigManagedPrometheusConfigArgs> managedPrometheusConfig;

    /**
     * @return Enable Google Cloud Managed Service for Prometheus in the cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AttachedClusterMonitoringConfigManagedPrometheusConfigArgs>> managedPrometheusConfig() {
        return Optional.ofNullable(this.managedPrometheusConfig);
    }

    private AttachedClusterMonitoringConfigArgs() {}

    private AttachedClusterMonitoringConfigArgs(AttachedClusterMonitoringConfigArgs $) {
        this.managedPrometheusConfig = $.managedPrometheusConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedClusterMonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedClusterMonitoringConfigArgs $;

        public Builder() {
            $ = new AttachedClusterMonitoringConfigArgs();
        }

        public Builder(AttachedClusterMonitoringConfigArgs defaults) {
            $ = new AttachedClusterMonitoringConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedPrometheusConfig Enable Google Cloud Managed Service for Prometheus in the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder managedPrometheusConfig(@Nullable Output<AttachedClusterMonitoringConfigManagedPrometheusConfigArgs> managedPrometheusConfig) {
            $.managedPrometheusConfig = managedPrometheusConfig;
            return this;
        }

        /**
         * @param managedPrometheusConfig Enable Google Cloud Managed Service for Prometheus in the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder managedPrometheusConfig(AttachedClusterMonitoringConfigManagedPrometheusConfigArgs managedPrometheusConfig) {
            return managedPrometheusConfig(Output.of(managedPrometheusConfig));
        }

        public AttachedClusterMonitoringConfigArgs build() {
            return $;
        }
    }

}