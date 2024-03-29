// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerWebhookConfig {
    /**
     * @return Resource name for the secret required as a URL parameter.
     * 
     */
    private String secret;
    /**
     * @return Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    private String state;

    private GetTriggerWebhookConfig() {}
    /**
     * @return Resource name for the secret required as a URL parameter.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerWebhookConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secret;
        private String state;
        public Builder() {}
        public Builder(GetTriggerWebhookConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetTriggerWebhookConfig", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetTriggerWebhookConfig", "state");
            }
            this.state = state;
            return this;
        }
        public GetTriggerWebhookConfig build() {
            final var _resultValue = new GetTriggerWebhookConfig();
            _resultValue.secret = secret;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
