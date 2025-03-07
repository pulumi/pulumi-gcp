// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.pubsub.outputs.SubscriptionPushConfigNoWrapper;
import com.pulumi.gcp.pubsub.outputs.SubscriptionPushConfigOidcToken;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionPushConfig {
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
    private @Nullable Map<String,String> attributes;
    /**
     * @return When set, the payload to the push endpoint is not wrapped.Sets the
     * `data` field as the HTTP body for delivery.
     * Structure is documented below.
     * 
     */
    private @Nullable SubscriptionPushConfigNoWrapper noWrapper;
    /**
     * @return If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    private @Nullable SubscriptionPushConfigOidcToken oidcToken;
    /**
     * @return A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * &#34;https://example.com/push&#34;.
     * 
     */
    private String pushEndpoint;

    private SubscriptionPushConfig() {}
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
    public Map<String,String> attributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }
    /**
     * @return When set, the payload to the push endpoint is not wrapped.Sets the
     * `data` field as the HTTP body for delivery.
     * Structure is documented below.
     * 
     */
    public Optional<SubscriptionPushConfigNoWrapper> noWrapper() {
        return Optional.ofNullable(this.noWrapper);
    }
    /**
     * @return If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    public Optional<SubscriptionPushConfigOidcToken> oidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }
    /**
     * @return A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * &#34;https://example.com/push&#34;.
     * 
     */
    public String pushEndpoint() {
        return this.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPushConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> attributes;
        private @Nullable SubscriptionPushConfigNoWrapper noWrapper;
        private @Nullable SubscriptionPushConfigOidcToken oidcToken;
        private String pushEndpoint;
        public Builder() {}
        public Builder(SubscriptionPushConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.noWrapper = defaults.noWrapper;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        @CustomType.Setter
        public Builder attributes(@Nullable Map<String,String> attributes) {

            this.attributes = attributes;
            return this;
        }
        @CustomType.Setter
        public Builder noWrapper(@Nullable SubscriptionPushConfigNoWrapper noWrapper) {

            this.noWrapper = noWrapper;
            return this;
        }
        @CustomType.Setter
        public Builder oidcToken(@Nullable SubscriptionPushConfigOidcToken oidcToken) {

            this.oidcToken = oidcToken;
            return this;
        }
        @CustomType.Setter
        public Builder pushEndpoint(String pushEndpoint) {
            if (pushEndpoint == null) {
              throw new MissingRequiredPropertyException("SubscriptionPushConfig", "pushEndpoint");
            }
            this.pushEndpoint = pushEndpoint;
            return this;
        }
        public SubscriptionPushConfig build() {
            final var _resultValue = new SubscriptionPushConfig();
            _resultValue.attributes = attributes;
            _resultValue.noWrapper = noWrapper;
            _resultValue.oidcToken = oidcToken;
            _resultValue.pushEndpoint = pushEndpoint;
            return _resultValue;
        }
    }
}
