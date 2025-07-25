// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apihub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.apihub.outputs.PluginInstanceAuthConfigApiKeyConfig;
import com.pulumi.gcp.apihub.outputs.PluginInstanceAuthConfigGoogleServiceAccountConfig;
import com.pulumi.gcp.apihub.outputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfig;
import com.pulumi.gcp.apihub.outputs.PluginInstanceAuthConfigUserPasswordConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PluginInstanceAuthConfig {
    /**
     * @return Config for authentication with API key.
     * Structure is documented below.
     * 
     */
    private @Nullable PluginInstanceAuthConfigApiKeyConfig apiKeyConfig;
    /**
     * @return Possible values:
     * AUTH_TYPE_UNSPECIFIED
     * NO_AUTH
     * GOOGLE_SERVICE_ACCOUNT
     * USER_PASSWORD
     * API_KEY
     * OAUTH2_CLIENT_CREDENTIALS
     * 
     */
    private String authType;
    /**
     * @return Config for Google service account authentication.
     * Structure is documented below.
     * 
     */
    private @Nullable PluginInstanceAuthConfigGoogleServiceAccountConfig googleServiceAccountConfig;
    /**
     * @return Parameters to support Oauth 2.0 client credentials grant authentication.
     * See https://tools.ietf.org/html/rfc6749#section-1.3.4 for more details.
     * Structure is documented below.
     * 
     */
    private @Nullable PluginInstanceAuthConfigOauth2ClientCredentialsConfig oauth2ClientCredentialsConfig;
    /**
     * @return Parameters to support Username and Password Authentication.
     * Structure is documented below.
     * 
     */
    private @Nullable PluginInstanceAuthConfigUserPasswordConfig userPasswordConfig;

    private PluginInstanceAuthConfig() {}
    /**
     * @return Config for authentication with API key.
     * Structure is documented below.
     * 
     */
    public Optional<PluginInstanceAuthConfigApiKeyConfig> apiKeyConfig() {
        return Optional.ofNullable(this.apiKeyConfig);
    }
    /**
     * @return Possible values:
     * AUTH_TYPE_UNSPECIFIED
     * NO_AUTH
     * GOOGLE_SERVICE_ACCOUNT
     * USER_PASSWORD
     * API_KEY
     * OAUTH2_CLIENT_CREDENTIALS
     * 
     */
    public String authType() {
        return this.authType;
    }
    /**
     * @return Config for Google service account authentication.
     * Structure is documented below.
     * 
     */
    public Optional<PluginInstanceAuthConfigGoogleServiceAccountConfig> googleServiceAccountConfig() {
        return Optional.ofNullable(this.googleServiceAccountConfig);
    }
    /**
     * @return Parameters to support Oauth 2.0 client credentials grant authentication.
     * See https://tools.ietf.org/html/rfc6749#section-1.3.4 for more details.
     * Structure is documented below.
     * 
     */
    public Optional<PluginInstanceAuthConfigOauth2ClientCredentialsConfig> oauth2ClientCredentialsConfig() {
        return Optional.ofNullable(this.oauth2ClientCredentialsConfig);
    }
    /**
     * @return Parameters to support Username and Password Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<PluginInstanceAuthConfigUserPasswordConfig> userPasswordConfig() {
        return Optional.ofNullable(this.userPasswordConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PluginInstanceAuthConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PluginInstanceAuthConfigApiKeyConfig apiKeyConfig;
        private String authType;
        private @Nullable PluginInstanceAuthConfigGoogleServiceAccountConfig googleServiceAccountConfig;
        private @Nullable PluginInstanceAuthConfigOauth2ClientCredentialsConfig oauth2ClientCredentialsConfig;
        private @Nullable PluginInstanceAuthConfigUserPasswordConfig userPasswordConfig;
        public Builder() {}
        public Builder(PluginInstanceAuthConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyConfig = defaults.apiKeyConfig;
    	      this.authType = defaults.authType;
    	      this.googleServiceAccountConfig = defaults.googleServiceAccountConfig;
    	      this.oauth2ClientCredentialsConfig = defaults.oauth2ClientCredentialsConfig;
    	      this.userPasswordConfig = defaults.userPasswordConfig;
        }

        @CustomType.Setter
        public Builder apiKeyConfig(@Nullable PluginInstanceAuthConfigApiKeyConfig apiKeyConfig) {

            this.apiKeyConfig = apiKeyConfig;
            return this;
        }
        @CustomType.Setter
        public Builder authType(String authType) {
            if (authType == null) {
              throw new MissingRequiredPropertyException("PluginInstanceAuthConfig", "authType");
            }
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder googleServiceAccountConfig(@Nullable PluginInstanceAuthConfigGoogleServiceAccountConfig googleServiceAccountConfig) {

            this.googleServiceAccountConfig = googleServiceAccountConfig;
            return this;
        }
        @CustomType.Setter
        public Builder oauth2ClientCredentialsConfig(@Nullable PluginInstanceAuthConfigOauth2ClientCredentialsConfig oauth2ClientCredentialsConfig) {

            this.oauth2ClientCredentialsConfig = oauth2ClientCredentialsConfig;
            return this;
        }
        @CustomType.Setter
        public Builder userPasswordConfig(@Nullable PluginInstanceAuthConfigUserPasswordConfig userPasswordConfig) {

            this.userPasswordConfig = userPasswordConfig;
            return this;
        }
        public PluginInstanceAuthConfig build() {
            final var _resultValue = new PluginInstanceAuthConfig();
            _resultValue.apiKeyConfig = apiKeyConfig;
            _resultValue.authType = authType;
            _resultValue.googleServiceAccountConfig = googleServiceAccountConfig;
            _resultValue.oauth2ClientCredentialsConfig = oauth2ClientCredentialsConfig;
            _resultValue.userPasswordConfig = userPasswordConfig;
            return _resultValue;
        }
    }
}
