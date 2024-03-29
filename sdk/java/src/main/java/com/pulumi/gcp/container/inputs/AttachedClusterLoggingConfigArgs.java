// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigComponentConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttachedClusterLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedClusterLoggingConfigArgs Empty = new AttachedClusterLoggingConfigArgs();

    /**
     * The configuration of the logging components
     * Structure is documented below.
     * 
     */
    @Import(name="componentConfig")
    private @Nullable Output<AttachedClusterLoggingConfigComponentConfigArgs> componentConfig;

    /**
     * @return The configuration of the logging components
     * Structure is documented below.
     * 
     */
    public Optional<Output<AttachedClusterLoggingConfigComponentConfigArgs>> componentConfig() {
        return Optional.ofNullable(this.componentConfig);
    }

    private AttachedClusterLoggingConfigArgs() {}

    private AttachedClusterLoggingConfigArgs(AttachedClusterLoggingConfigArgs $) {
        this.componentConfig = $.componentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedClusterLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedClusterLoggingConfigArgs $;

        public Builder() {
            $ = new AttachedClusterLoggingConfigArgs();
        }

        public Builder(AttachedClusterLoggingConfigArgs defaults) {
            $ = new AttachedClusterLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentConfig The configuration of the logging components
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder componentConfig(@Nullable Output<AttachedClusterLoggingConfigComponentConfigArgs> componentConfig) {
            $.componentConfig = componentConfig;
            return this;
        }

        /**
         * @param componentConfig The configuration of the logging components
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder componentConfig(AttachedClusterLoggingConfigComponentConfigArgs componentConfig) {
            return componentConfig(Output.of(componentConfig));
        }

        public AttachedClusterLoggingConfigArgs build() {
            return $;
        }
    }

}
