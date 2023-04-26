// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpRouteRuleActionRequestMirrorPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteRuleActionRequestMirrorPolicyArgs Empty = new HttpRouteRuleActionRequestMirrorPolicyArgs();

    /**
     * The destination the requests will be mirrored to.
     * Structure is documented below.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<HttpRouteRuleActionRequestMirrorPolicyDestinationArgs> destination;

    /**
     * @return The destination the requests will be mirrored to.
     * Structure is documented below.
     * 
     */
    public Optional<Output<HttpRouteRuleActionRequestMirrorPolicyDestinationArgs>> destination() {
        return Optional.ofNullable(this.destination);
    }

    private HttpRouteRuleActionRequestMirrorPolicyArgs() {}

    private HttpRouteRuleActionRequestMirrorPolicyArgs(HttpRouteRuleActionRequestMirrorPolicyArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteRuleActionRequestMirrorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteRuleActionRequestMirrorPolicyArgs $;

        public Builder() {
            $ = new HttpRouteRuleActionRequestMirrorPolicyArgs();
        }

        public Builder(HttpRouteRuleActionRequestMirrorPolicyArgs defaults) {
            $ = new HttpRouteRuleActionRequestMirrorPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination The destination the requests will be mirrored to.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<HttpRouteRuleActionRequestMirrorPolicyDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The destination the requests will be mirrored to.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destination(HttpRouteRuleActionRequestMirrorPolicyDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        public HttpRouteRuleActionRequestMirrorPolicyArgs build() {
            return $;
        }
    }

}