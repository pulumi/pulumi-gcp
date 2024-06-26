// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPolicyExternalIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyExternalIpArgs Empty = new NetworkPolicyExternalIpArgs();

    /**
     * True if the service is enabled; false otherwise.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return True if the service is enabled; false otherwise.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * (Output)
     * State of the service. New values may be added to this enum when appropriate.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * State of the service. New values may be added to this enum when appropriate.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private NetworkPolicyExternalIpArgs() {}

    private NetworkPolicyExternalIpArgs(NetworkPolicyExternalIpArgs $) {
        this.enabled = $.enabled;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyExternalIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyExternalIpArgs $;

        public Builder() {
            $ = new NetworkPolicyExternalIpArgs();
        }

        public Builder(NetworkPolicyExternalIpArgs defaults) {
            $ = new NetworkPolicyExternalIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled True if the service is enabled; false otherwise.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled True if the service is enabled; false otherwise.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param state (Output)
         * State of the service. New values may be added to this enum when appropriate.
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
         * State of the service. New values may be added to this enum when appropriate.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public NetworkPolicyExternalIpArgs build() {
            return $;
        }
    }

}
