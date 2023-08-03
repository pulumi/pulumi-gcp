// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs;
import com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureSpecFleetobservabilityLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureSpecFleetobservabilityLoggingConfigArgs Empty = new FeatureSpecFleetobservabilityLoggingConfigArgs();

    /**
     * Specified if applying the default routing config to logs not specified in other configs.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultConfig")
    private @Nullable Output<FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs> defaultConfig;

    /**
     * @return Specified if applying the default routing config to logs not specified in other configs.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs>> defaultConfig() {
        return Optional.ofNullable(this.defaultConfig);
    }

    /**
     * Specified if applying the routing config to all logs for all fleet scopes.
     * Structure is documented below.
     * 
     */
    @Import(name="fleetScopeLogsConfig")
    private @Nullable Output<FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs> fleetScopeLogsConfig;

    /**
     * @return Specified if applying the routing config to all logs for all fleet scopes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs>> fleetScopeLogsConfig() {
        return Optional.ofNullable(this.fleetScopeLogsConfig);
    }

    private FeatureSpecFleetobservabilityLoggingConfigArgs() {}

    private FeatureSpecFleetobservabilityLoggingConfigArgs(FeatureSpecFleetobservabilityLoggingConfigArgs $) {
        this.defaultConfig = $.defaultConfig;
        this.fleetScopeLogsConfig = $.fleetScopeLogsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureSpecFleetobservabilityLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureSpecFleetobservabilityLoggingConfigArgs $;

        public Builder() {
            $ = new FeatureSpecFleetobservabilityLoggingConfigArgs();
        }

        public Builder(FeatureSpecFleetobservabilityLoggingConfigArgs defaults) {
            $ = new FeatureSpecFleetobservabilityLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultConfig Specified if applying the default routing config to logs not specified in other configs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultConfig(@Nullable Output<FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs> defaultConfig) {
            $.defaultConfig = defaultConfig;
            return this;
        }

        /**
         * @param defaultConfig Specified if applying the default routing config to logs not specified in other configs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultConfig(FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs defaultConfig) {
            return defaultConfig(Output.of(defaultConfig));
        }

        /**
         * @param fleetScopeLogsConfig Specified if applying the routing config to all logs for all fleet scopes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fleetScopeLogsConfig(@Nullable Output<FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs> fleetScopeLogsConfig) {
            $.fleetScopeLogsConfig = fleetScopeLogsConfig;
            return this;
        }

        /**
         * @param fleetScopeLogsConfig Specified if applying the routing config to all logs for all fleet scopes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fleetScopeLogsConfig(FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs fleetScopeLogsConfig) {
            return fleetScopeLogsConfig(Output.of(fleetScopeLogsConfig));
        }

        public FeatureSpecFleetobservabilityLoggingConfigArgs build() {
            return $;
        }
    }

}