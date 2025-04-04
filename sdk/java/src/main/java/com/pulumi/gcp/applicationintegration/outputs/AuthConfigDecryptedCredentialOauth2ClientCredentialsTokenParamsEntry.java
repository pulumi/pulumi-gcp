// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.applicationintegration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.applicationintegration.outputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey;
import com.pulumi.gcp.applicationintegration.outputs.AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValue;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntry {
    /**
     * @return Key of the map entry.
     * Structure is documented below.
     * 
     */
    private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey key;
    /**
     * @return Value of the map entry.
     * Structure is documented below.
     * 
     */
    private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValue value;

    private AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntry() {}
    /**
     * @return Key of the map entry.
     * Structure is documented below.
     * 
     */
    public Optional<AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Value of the map entry.
     * Structure is documented below.
     * 
     */
    public Optional<AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValue> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey key;
        private @Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValue value;
        public Builder() {}
        public Builder(AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryKey key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValue value) {

            this.value = value;
            return this;
        }
        public AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntry build() {
            final var _resultValue = new AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntry();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
