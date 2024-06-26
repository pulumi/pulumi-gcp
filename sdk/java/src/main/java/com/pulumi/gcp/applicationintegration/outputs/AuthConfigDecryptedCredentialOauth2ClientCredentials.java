// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.applicationintegration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.applicationintegration.outputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParams;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthConfigDecryptedCredentialOauth2ClientCredentials {
    /**
     * @return The client&#39;s ID.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The client&#39;s secret.
     * 
     */
    private @Nullable String clientSecret;
    /**
     * @return Represent how to pass parameters to fetch access token Possible values: [&#34;REQUEST_TYPE_UNSPECIFIED&#34;, &#34;REQUEST_BODY&#34;, &#34;QUERY_PARAMETERS&#34;, &#34;ENCODED_HEADER&#34;]
     * 
     */
    private @Nullable String requestType;
    /**
     * @return A space-delimited list of requested scope permissions.
     * 
     */
    private @Nullable String scope;
    /**
     * @return The token endpoint is used by the client to obtain an access token by presenting its authorization grant or refresh token.
     * 
     */
    private @Nullable String tokenEndpoint;
    /**
     * @return Token parameters for the auth request.
     * 
     */
    private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParams tokenParams;

    private AuthConfigDecryptedCredentialOauth2ClientCredentials() {}
    /**
     * @return The client&#39;s ID.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The client&#39;s secret.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return Represent how to pass parameters to fetch access token Possible values: [&#34;REQUEST_TYPE_UNSPECIFIED&#34;, &#34;REQUEST_BODY&#34;, &#34;QUERY_PARAMETERS&#34;, &#34;ENCODED_HEADER&#34;]
     * 
     */
    public Optional<String> requestType() {
        return Optional.ofNullable(this.requestType);
    }
    /**
     * @return A space-delimited list of requested scope permissions.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The token endpoint is used by the client to obtain an access token by presenting its authorization grant or refresh token.
     * 
     */
    public Optional<String> tokenEndpoint() {
        return Optional.ofNullable(this.tokenEndpoint);
    }
    /**
     * @return Token parameters for the auth request.
     * 
     */
    public Optional<AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParams> tokenParams() {
        return Optional.ofNullable(this.tokenParams);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthConfigDecryptedCredentialOauth2ClientCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String requestType;
        private @Nullable String scope;
        private @Nullable String tokenEndpoint;
        private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParams tokenParams;
        public Builder() {}
        public Builder(AuthConfigDecryptedCredentialOauth2ClientCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.requestType = defaults.requestType;
    	      this.scope = defaults.scope;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.tokenParams = defaults.tokenParams;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(@Nullable String clientSecret) {

            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder requestType(@Nullable String requestType) {

            this.requestType = requestType;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder tokenEndpoint(@Nullable String tokenEndpoint) {

            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder tokenParams(@Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParams tokenParams) {

            this.tokenParams = tokenParams;
            return this;
        }
        public AuthConfigDecryptedCredentialOauth2ClientCredentials build() {
            final var _resultValue = new AuthConfigDecryptedCredentialOauth2ClientCredentials();
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.requestType = requestType;
            _resultValue.scope = scope;
            _resultValue.tokenEndpoint = tokenEndpoint;
            _resultValue.tokenParams = tokenParams;
            return _resultValue;
        }
    }
}
