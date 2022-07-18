// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigComponentConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsClusterLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsClusterLoggingConfigArgs Empty = new AwsClusterLoggingConfigArgs();

    /**
     * Configuration of the logging components.
     * 
     */
    @Import(name="componentConfig")
    private @Nullable Output<AwsClusterLoggingConfigComponentConfigArgs> componentConfig;

    /**
     * @return Configuration of the logging components.
     * 
     */
    public Optional<Output<AwsClusterLoggingConfigComponentConfigArgs>> componentConfig() {
        return Optional.ofNullable(this.componentConfig);
    }

    private AwsClusterLoggingConfigArgs() {}

    private AwsClusterLoggingConfigArgs(AwsClusterLoggingConfigArgs $) {
        this.componentConfig = $.componentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsClusterLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterLoggingConfigArgs $;

        public Builder() {
            $ = new AwsClusterLoggingConfigArgs();
        }

        public Builder(AwsClusterLoggingConfigArgs defaults) {
            $ = new AwsClusterLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentConfig Configuration of the logging components.
         * 
         * @return builder
         * 
         */
        public Builder componentConfig(@Nullable Output<AwsClusterLoggingConfigComponentConfigArgs> componentConfig) {
            $.componentConfig = componentConfig;
            return this;
        }

        /**
         * @param componentConfig Configuration of the logging components.
         * 
         * @return builder
         * 
         */
        public Builder componentConfig(AwsClusterLoggingConfigComponentConfigArgs componentConfig) {
            return componentConfig(Output.of(componentConfig));
        }

        public AwsClusterLoggingConfigArgs build() {
            return $;
        }
    }

}