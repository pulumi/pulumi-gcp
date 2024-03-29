// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnterpriseKeyWafSettings {
    /**
     * @return Supported WAF features. For more information, see https://cloud.google.com/recaptcha-enterprise/docs/usecase#comparison_of_features. Possible values: CHALLENGE_PAGE, SESSION_TOKEN, ACTION_TOKEN, EXPRESS
     * 
     */
    private String wafFeature;
    /**
     * @return The WAF service that uses this key. Possible values: CA, FASTLY
     * 
     */
    private String wafService;

    private EnterpriseKeyWafSettings() {}
    /**
     * @return Supported WAF features. For more information, see https://cloud.google.com/recaptcha-enterprise/docs/usecase#comparison_of_features. Possible values: CHALLENGE_PAGE, SESSION_TOKEN, ACTION_TOKEN, EXPRESS
     * 
     */
    public String wafFeature() {
        return this.wafFeature;
    }
    /**
     * @return The WAF service that uses this key. Possible values: CA, FASTLY
     * 
     */
    public String wafService() {
        return this.wafService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyWafSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String wafFeature;
        private String wafService;
        public Builder() {}
        public Builder(EnterpriseKeyWafSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wafFeature = defaults.wafFeature;
    	      this.wafService = defaults.wafService;
        }

        @CustomType.Setter
        public Builder wafFeature(String wafFeature) {
            if (wafFeature == null) {
              throw new MissingRequiredPropertyException("EnterpriseKeyWafSettings", "wafFeature");
            }
            this.wafFeature = wafFeature;
            return this;
        }
        @CustomType.Setter
        public Builder wafService(String wafService) {
            if (wafService == null) {
              throw new MissingRequiredPropertyException("EnterpriseKeyWafSettings", "wafService");
            }
            this.wafService = wafService;
            return this;
        }
        public EnterpriseKeyWafSettings build() {
            final var _resultValue = new EnterpriseKeyWafSettings();
            _resultValue.wafFeature = wafFeature;
            _resultValue.wafService = wafService;
            return _resultValue;
        }
    }
}
