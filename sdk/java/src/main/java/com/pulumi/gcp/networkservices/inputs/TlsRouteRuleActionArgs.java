// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionDestinationArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsRouteRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsRouteRuleActionArgs Empty = new TlsRouteRuleActionArgs();

    /**
     * The destination to which traffic should be forwarded.
     * Structure is documented below.
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<TlsRouteRuleActionDestinationArgs>> destinations;

    /**
     * @return The destination to which traffic should be forwarded.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TlsRouteRuleActionDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    private TlsRouteRuleActionArgs() {}

    private TlsRouteRuleActionArgs(TlsRouteRuleActionArgs $) {
        this.destinations = $.destinations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsRouteRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsRouteRuleActionArgs $;

        public Builder() {
            $ = new TlsRouteRuleActionArgs();
        }

        public Builder(TlsRouteRuleActionArgs defaults) {
            $ = new TlsRouteRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations The destination to which traffic should be forwarded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<TlsRouteRuleActionDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations The destination to which traffic should be forwarded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<TlsRouteRuleActionDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations The destination to which traffic should be forwarded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinations(TlsRouteRuleActionDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        public TlsRouteRuleActionArgs build() {
            return $;
        }
    }

}