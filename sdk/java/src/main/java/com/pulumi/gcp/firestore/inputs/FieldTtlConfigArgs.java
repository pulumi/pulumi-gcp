// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FieldTtlConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldTtlConfigArgs Empty = new FieldTtlConfigArgs();

    /**
     * (Output)
     * The state of the TTL configuration.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * The state of the TTL configuration.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private FieldTtlConfigArgs() {}

    private FieldTtlConfigArgs(FieldTtlConfigArgs $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldTtlConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldTtlConfigArgs $;

        public Builder() {
            $ = new FieldTtlConfigArgs();
        }

        public Builder(FieldTtlConfigArgs defaults) {
            $ = new FieldTtlConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param state (Output)
         * The state of the TTL configuration.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * The state of the TTL configuration.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public FieldTtlConfigArgs build() {
            return $;
        }
    }

}