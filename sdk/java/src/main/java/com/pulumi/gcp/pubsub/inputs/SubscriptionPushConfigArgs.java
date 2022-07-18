// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionPushConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionPushConfigArgs Empty = new SubscriptionPushConfigArgs();

    /**
     * Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<Map<String,String>> attributes;

    /**
     * @return Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    public Optional<Output<Map<String,String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    @Import(name="oidcToken")
    private @Nullable Output<SubscriptionPushConfigOidcTokenArgs> oidcToken;

    /**
     * @return If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SubscriptionPushConfigOidcTokenArgs>> oidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }

    /**
     * A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * &#34;https://example.com/push&#34;.
     * 
     */
    @Import(name="pushEndpoint", required=true)
    private Output<String> pushEndpoint;

    /**
     * @return A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * &#34;https://example.com/push&#34;.
     * 
     */
    public Output<String> pushEndpoint() {
        return this.pushEndpoint;
    }

    private SubscriptionPushConfigArgs() {}

    private SubscriptionPushConfigArgs(SubscriptionPushConfigArgs $) {
        this.attributes = $.attributes;
        this.oidcToken = $.oidcToken;
        this.pushEndpoint = $.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionPushConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionPushConfigArgs $;

        public Builder() {
            $ = new SubscriptionPushConfigArgs();
        }

        public Builder(SubscriptionPushConfigArgs defaults) {
            $ = new SubscriptionPushConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes Endpoint configuration attributes.
         * Every endpoint has a set of API supported attributes that can
         * be used to control different aspects of the message delivery.
         * The currently supported attribute is x-goog-version, which you
         * can use to change the format of the pushed message. This
         * attribute indicates the version of the data expected by
         * the endpoint. This controls the shape of the pushed message
         * (i.e., its fields and metadata). The endpoint version is
         * based on the version of the Pub/Sub API.
         * If not present during the subscriptions.create call,
         * it will default to the version of the API used to make
         * such call. If not present during a subscriptions.modifyPushConfig
         * call, its value will not be changed. subscriptions.get
         * calls will always return a valid version, even if the
         * subscription was created without this attribute.
         * The possible values for this attribute are:
         * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
         * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Endpoint configuration attributes.
         * Every endpoint has a set of API supported attributes that can
         * be used to control different aspects of the message delivery.
         * The currently supported attribute is x-goog-version, which you
         * can use to change the format of the pushed message. This
         * attribute indicates the version of the data expected by
         * the endpoint. This controls the shape of the pushed message
         * (i.e., its fields and metadata). The endpoint version is
         * based on the version of the Pub/Sub API.
         * If not present during the subscriptions.create call,
         * it will default to the version of the API used to make
         * such call. If not present during a subscriptions.modifyPushConfig
         * call, its value will not be changed. subscriptions.get
         * calls will always return a valid version, even if the
         * subscription was created without this attribute.
         * The possible values for this attribute are:
         * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
         * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
         * 
         * @return builder
         * 
         */
        public Builder attributes(Map<String,String> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param oidcToken If specified, Pub/Sub will generate and attach an OIDC JWT token as
         * an Authorization header in the HTTP request for every pushed message.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oidcToken(@Nullable Output<SubscriptionPushConfigOidcTokenArgs> oidcToken) {
            $.oidcToken = oidcToken;
            return this;
        }

        /**
         * @param oidcToken If specified, Pub/Sub will generate and attach an OIDC JWT token as
         * an Authorization header in the HTTP request for every pushed message.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oidcToken(SubscriptionPushConfigOidcTokenArgs oidcToken) {
            return oidcToken(Output.of(oidcToken));
        }

        /**
         * @param pushEndpoint A URL locating the endpoint to which messages should be pushed.
         * For example, a Webhook endpoint might use
         * &#34;https://example.com/push&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pushEndpoint(Output<String> pushEndpoint) {
            $.pushEndpoint = pushEndpoint;
            return this;
        }

        /**
         * @param pushEndpoint A URL locating the endpoint to which messages should be pushed.
         * For example, a Webhook endpoint might use
         * &#34;https://example.com/push&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pushEndpoint(String pushEndpoint) {
            return pushEndpoint(Output.of(pushEndpoint));
        }

        public SubscriptionPushConfigArgs build() {
            $.pushEndpoint = Objects.requireNonNull($.pushEndpoint, "expected parameter 'pushEndpoint' to be non-null");
            return $;
        }
    }

}