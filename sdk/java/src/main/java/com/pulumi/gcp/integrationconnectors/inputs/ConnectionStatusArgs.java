// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionStatusArgs Empty = new ConnectionStatusArgs();

    /**
     * An arbitrary description for the Connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An arbitrary description for the Connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Output)
     * State of the Eventing
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * State of the Eventing
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * (Output)
     * Current status of eventing.
     * Structure is documented below.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return (Output)
     * Current status of eventing.
     * Structure is documented below.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ConnectionStatusArgs() {}

    private ConnectionStatusArgs(ConnectionStatusArgs $) {
        this.description = $.description;
        this.state = $.state;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionStatusArgs $;

        public Builder() {
            $ = new ConnectionStatusArgs();
        }

        public Builder(ConnectionStatusArgs defaults) {
            $ = new ConnectionStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An arbitrary description for the Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An arbitrary description for the Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param state (Output)
         * State of the Eventing
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
         * State of the Eventing
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param status (Output)
         * Current status of eventing.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status (Output)
         * Current status of eventing.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ConnectionStatusArgs build() {
            return $;
        }
    }

}
