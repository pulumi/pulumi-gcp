// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.TcpRouteRuleActionDestinationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TcpRouteRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TcpRouteRuleActionArgs Empty = new TcpRouteRuleActionArgs();

    /**
     * The destination services to which traffic should be forwarded. At least one destination service is required.
     * Structure is documented below.
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<TcpRouteRuleActionDestinationArgs>> destinations;

    /**
     * @return The destination services to which traffic should be forwarded. At least one destination service is required.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TcpRouteRuleActionDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * Specifies the idle timeout for the selected route. The idle timeout is defined as the period in which there are no bytes sent or received on either the upstream or downstream connection. If not set, the default idle timeout is 30 seconds. If set to 0s, the timeout will be disabled.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="idleTimeout")
    private @Nullable Output<String> idleTimeout;

    /**
     * @return Specifies the idle timeout for the selected route. The idle timeout is defined as the period in which there are no bytes sent or received on either the upstream or downstream connection. If not set, the default idle timeout is 30 seconds. If set to 0s, the timeout will be disabled.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    /**
     * If true, Router will use the destination IP and port of the original connection as the destination of the request.
     * 
     */
    @Import(name="originalDestination")
    private @Nullable Output<Boolean> originalDestination;

    /**
     * @return If true, Router will use the destination IP and port of the original connection as the destination of the request.
     * 
     */
    public Optional<Output<Boolean>> originalDestination() {
        return Optional.ofNullable(this.originalDestination);
    }

    private TcpRouteRuleActionArgs() {}

    private TcpRouteRuleActionArgs(TcpRouteRuleActionArgs $) {
        this.destinations = $.destinations;
        this.idleTimeout = $.idleTimeout;
        this.originalDestination = $.originalDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TcpRouteRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TcpRouteRuleActionArgs $;

        public Builder() {
            $ = new TcpRouteRuleActionArgs();
        }

        public Builder(TcpRouteRuleActionArgs defaults) {
            $ = new TcpRouteRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations The destination services to which traffic should be forwarded. At least one destination service is required.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<TcpRouteRuleActionDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations The destination services to which traffic should be forwarded. At least one destination service is required.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<TcpRouteRuleActionDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations The destination services to which traffic should be forwarded. At least one destination service is required.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinations(TcpRouteRuleActionDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param idleTimeout Specifies the idle timeout for the selected route. The idle timeout is defined as the period in which there are no bytes sent or received on either the upstream or downstream connection. If not set, the default idle timeout is 30 seconds. If set to 0s, the timeout will be disabled.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(@Nullable Output<String> idleTimeout) {
            $.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * @param idleTimeout Specifies the idle timeout for the selected route. The idle timeout is defined as the period in which there are no bytes sent or received on either the upstream or downstream connection. If not set, the default idle timeout is 30 seconds. If set to 0s, the timeout will be disabled.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(String idleTimeout) {
            return idleTimeout(Output.of(idleTimeout));
        }

        /**
         * @param originalDestination If true, Router will use the destination IP and port of the original connection as the destination of the request.
         * 
         * @return builder
         * 
         */
        public Builder originalDestination(@Nullable Output<Boolean> originalDestination) {
            $.originalDestination = originalDestination;
            return this;
        }

        /**
         * @param originalDestination If true, Router will use the destination IP and port of the original connection as the destination of the request.
         * 
         * @return builder
         * 
         */
        public Builder originalDestination(Boolean originalDestination) {
            return originalDestination(Output.of(originalDestination));
        }

        public TcpRouteRuleActionArgs build() {
            return $;
        }
    }

}
