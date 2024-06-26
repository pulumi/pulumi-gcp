// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.applicationintegration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.applicationintegration.outputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValue;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey {
    /**
     * @return Passing a literal value
     * Structure is documented below.
     * 
     */
    private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValue literalValue;

    private AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey() {}
    /**
     * @return Passing a literal value
     * Structure is documented below.
     * 
     */
    public Optional<AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValue> literalValue() {
        return Optional.ofNullable(this.literalValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValue literalValue;
        public Builder() {}
        public Builder(AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.literalValue = defaults.literalValue;
        }

        @CustomType.Setter
        public Builder literalValue(@Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKeyLiteralValue literalValue) {

            this.literalValue = literalValue;
            return this;
        }
        public AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey build() {
            final var _resultValue = new AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey();
            _resultValue.literalValue = literalValue;
            return _resultValue;
        }
    }
}
