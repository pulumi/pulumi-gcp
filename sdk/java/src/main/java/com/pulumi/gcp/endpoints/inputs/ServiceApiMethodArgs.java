// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceApiMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceApiMethodArgs Empty = new ServiceApiMethodArgs();

    /**
     * The simple name of the endpoint as described in the config.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The simple name of the endpoint as described in the config.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type URL for the request to this API.
     * 
     */
    @Import(name="requestType")
    private @Nullable Output<String> requestType;

    /**
     * @return The type URL for the request to this API.
     * 
     */
    public Optional<Output<String>> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    /**
     * The type URL for the response from this API.
     * 
     */
    @Import(name="responseType")
    private @Nullable Output<String> responseType;

    /**
     * @return The type URL for the response from this API.
     * 
     */
    public Optional<Output<String>> responseType() {
        return Optional.ofNullable(this.responseType);
    }

    /**
     * `SYNTAX_PROTO2` or `SYNTAX_PROTO3`.
     * 
     */
    @Import(name="syntax")
    private @Nullable Output<String> syntax;

    /**
     * @return `SYNTAX_PROTO2` or `SYNTAX_PROTO3`.
     * 
     */
    public Optional<Output<String>> syntax() {
        return Optional.ofNullable(this.syntax);
    }

    private ServiceApiMethodArgs() {}

    private ServiceApiMethodArgs(ServiceApiMethodArgs $) {
        this.name = $.name;
        this.requestType = $.requestType;
        this.responseType = $.responseType;
        this.syntax = $.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceApiMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceApiMethodArgs $;

        public Builder() {
            $ = new ServiceApiMethodArgs();
        }

        public Builder(ServiceApiMethodArgs defaults) {
            $ = new ServiceApiMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The simple name of the endpoint as described in the config.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The simple name of the endpoint as described in the config.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requestType The type URL for the request to this API.
         * 
         * @return builder
         * 
         */
        public Builder requestType(@Nullable Output<String> requestType) {
            $.requestType = requestType;
            return this;
        }

        /**
         * @param requestType The type URL for the request to this API.
         * 
         * @return builder
         * 
         */
        public Builder requestType(String requestType) {
            return requestType(Output.of(requestType));
        }

        /**
         * @param responseType The type URL for the response from this API.
         * 
         * @return builder
         * 
         */
        public Builder responseType(@Nullable Output<String> responseType) {
            $.responseType = responseType;
            return this;
        }

        /**
         * @param responseType The type URL for the response from this API.
         * 
         * @return builder
         * 
         */
        public Builder responseType(String responseType) {
            return responseType(Output.of(responseType));
        }

        /**
         * @param syntax `SYNTAX_PROTO2` or `SYNTAX_PROTO3`.
         * 
         * @return builder
         * 
         */
        public Builder syntax(@Nullable Output<String> syntax) {
            $.syntax = syntax;
            return this;
        }

        /**
         * @param syntax `SYNTAX_PROTO2` or `SYNTAX_PROTO3`.
         * 
         * @return builder
         * 
         */
        public Builder syntax(String syntax) {
            return syntax(Output.of(syntax));
        }

        public ServiceApiMethodArgs build() {
            return $;
        }
    }

}
