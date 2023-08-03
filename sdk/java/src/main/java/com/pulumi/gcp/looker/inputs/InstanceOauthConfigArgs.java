// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.looker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceOauthConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceOauthConfigArgs Empty = new InstanceOauthConfigArgs();

    /**
     * The client ID for the Oauth config.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The client ID for the Oauth config.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret for the Oauth config.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret for the Oauth config.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    private InstanceOauthConfigArgs() {}

    private InstanceOauthConfigArgs(InstanceOauthConfigArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceOauthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceOauthConfigArgs $;

        public Builder() {
            $ = new InstanceOauthConfigArgs();
        }

        public Builder(InstanceOauthConfigArgs defaults) {
            $ = new InstanceOauthConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client ID for the Oauth config.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client ID for the Oauth config.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret for the Oauth config.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret for the Oauth config.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public InstanceOauthConfigArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}