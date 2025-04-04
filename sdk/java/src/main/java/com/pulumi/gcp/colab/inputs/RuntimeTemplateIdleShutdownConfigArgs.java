// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.colab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeTemplateIdleShutdownConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeTemplateIdleShutdownConfigArgs Empty = new RuntimeTemplateIdleShutdownConfigArgs();

    /**
     * The duration after which the runtime is automatically shut down. An input of 0s disables the idle shutdown feature, and a valid range is [10m, 24h].
     * 
     */
    @Import(name="idleTimeout")
    private @Nullable Output<String> idleTimeout;

    /**
     * @return The duration after which the runtime is automatically shut down. An input of 0s disables the idle shutdown feature, and a valid range is [10m, 24h].
     * 
     */
    public Optional<Output<String>> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    private RuntimeTemplateIdleShutdownConfigArgs() {}

    private RuntimeTemplateIdleShutdownConfigArgs(RuntimeTemplateIdleShutdownConfigArgs $) {
        this.idleTimeout = $.idleTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeTemplateIdleShutdownConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeTemplateIdleShutdownConfigArgs $;

        public Builder() {
            $ = new RuntimeTemplateIdleShutdownConfigArgs();
        }

        public Builder(RuntimeTemplateIdleShutdownConfigArgs defaults) {
            $ = new RuntimeTemplateIdleShutdownConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idleTimeout The duration after which the runtime is automatically shut down. An input of 0s disables the idle shutdown feature, and a valid range is [10m, 24h].
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(@Nullable Output<String> idleTimeout) {
            $.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * @param idleTimeout The duration after which the runtime is automatically shut down. An input of 0s disables the idle shutdown feature, and a valid range is [10m, 24h].
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(String idleTimeout) {
            return idleTimeout(Output.of(idleTimeout));
        }

        public RuntimeTemplateIdleShutdownConfigArgs build() {
            return $;
        }
    }

}
