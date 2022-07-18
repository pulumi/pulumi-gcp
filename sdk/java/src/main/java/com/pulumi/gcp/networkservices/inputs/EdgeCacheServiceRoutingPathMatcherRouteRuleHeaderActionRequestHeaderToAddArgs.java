// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs();

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    /**
     * @return Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue", required=true)
    private Output<String> headerValue;

    /**
     * @return The value of the header to add.
     * 
     */
    public Output<String> headerValue() {
        return this.headerValue;
    }

    /**
     * Whether to replace all existing headers with the same name.
     * 
     */
    @Import(name="replace")
    private @Nullable Output<Boolean> replace;

    /**
     * @return Whether to replace all existing headers with the same name.
     * 
     */
    public Optional<Output<Boolean>> replace() {
        return Optional.ofNullable(this.replace);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
        this.replace = $.replace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName Headers to remove from the response prior to sending it back to the client.
         * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
         * 
         * @return builder
         * 
         */
        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName Headers to remove from the response prior to sending it back to the client.
         * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param headerValue The value of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        /**
         * @param headerValue The value of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        /**
         * @param replace Whether to replace all existing headers with the same name.
         * 
         * @return builder
         * 
         */
        public Builder replace(@Nullable Output<Boolean> replace) {
            $.replace = replace;
            return this;
        }

        /**
         * @param replace Whether to replace all existing headers with the same name.
         * 
         * @return builder
         * 
         */
        public Builder replace(Boolean replace) {
            return replace(Output.of(replace));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.headerValue = Objects.requireNonNull($.headerValue, "expected parameter 'headerValue' to be non-null");
            return $;
        }
    }

}