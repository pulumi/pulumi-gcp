// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionSslConfigAdditionalVariableEncryptionKeyValue;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionSslConfigAdditionalVariableSecretValue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionSslConfigAdditionalVariable {
    /**
     * @return Boolean Value of configVariable.
     * 
     */
    private @Nullable Boolean booleanValue;
    /**
     * @return Encryption key value of configVariable.
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectionSslConfigAdditionalVariableEncryptionKeyValue encryptionKeyValue;
    /**
     * @return Integer Value of configVariable.
     * 
     */
    private @Nullable Integer integerValue;
    /**
     * @return Key for the configVariable
     * 
     */
    private String key;
    /**
     * @return Secret value of configVariable
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectionSslConfigAdditionalVariableSecretValue secretValue;
    /**
     * @return String Value of configVariabley.
     * 
     */
    private @Nullable String stringValue;

    private ConnectionSslConfigAdditionalVariable() {}
    /**
     * @return Boolean Value of configVariable.
     * 
     */
    public Optional<Boolean> booleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }
    /**
     * @return Encryption key value of configVariable.
     * Structure is documented below.
     * 
     */
    public Optional<ConnectionSslConfigAdditionalVariableEncryptionKeyValue> encryptionKeyValue() {
        return Optional.ofNullable(this.encryptionKeyValue);
    }
    /**
     * @return Integer Value of configVariable.
     * 
     */
    public Optional<Integer> integerValue() {
        return Optional.ofNullable(this.integerValue);
    }
    /**
     * @return Key for the configVariable
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Secret value of configVariable
     * Structure is documented below.
     * 
     */
    public Optional<ConnectionSslConfigAdditionalVariableSecretValue> secretValue() {
        return Optional.ofNullable(this.secretValue);
    }
    /**
     * @return String Value of configVariabley.
     * 
     */
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSslConfigAdditionalVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean booleanValue;
        private @Nullable ConnectionSslConfigAdditionalVariableEncryptionKeyValue encryptionKeyValue;
        private @Nullable Integer integerValue;
        private String key;
        private @Nullable ConnectionSslConfigAdditionalVariableSecretValue secretValue;
        private @Nullable String stringValue;
        public Builder() {}
        public Builder(ConnectionSslConfigAdditionalVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.encryptionKeyValue = defaults.encryptionKeyValue;
    	      this.integerValue = defaults.integerValue;
    	      this.key = defaults.key;
    	      this.secretValue = defaults.secretValue;
    	      this.stringValue = defaults.stringValue;
        }

        @CustomType.Setter
        public Builder booleanValue(@Nullable Boolean booleanValue) {

            this.booleanValue = booleanValue;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKeyValue(@Nullable ConnectionSslConfigAdditionalVariableEncryptionKeyValue encryptionKeyValue) {

            this.encryptionKeyValue = encryptionKeyValue;
            return this;
        }
        @CustomType.Setter
        public Builder integerValue(@Nullable Integer integerValue) {

            this.integerValue = integerValue;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("ConnectionSslConfigAdditionalVariable", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder secretValue(@Nullable ConnectionSslConfigAdditionalVariableSecretValue secretValue) {

            this.secretValue = secretValue;
            return this;
        }
        @CustomType.Setter
        public Builder stringValue(@Nullable String stringValue) {

            this.stringValue = stringValue;
            return this;
        }
        public ConnectionSslConfigAdditionalVariable build() {
            final var _resultValue = new ConnectionSslConfigAdditionalVariable();
            _resultValue.booleanValue = booleanValue;
            _resultValue.encryptionKeyValue = encryptionKeyValue;
            _resultValue.integerValue = integerValue;
            _resultValue.key = key;
            _resultValue.secretValue = secretValue;
            _resultValue.stringValue = stringValue;
            return _resultValue;
        }
    }
}
