// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAuthConfigAdditionalVariableEncryptionKeyValue {
    /**
     * @return The [KMS key name] with which the content of the Operation is encrypted. The
     * expected format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*.
     * Will be empty string if google managed.
     * 
     */
    private @Nullable String kmsKeyName;
    /**
     * @return Type of Encryption Key
     * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
     * 
     */
    private String type;

    private ConnectionAuthConfigAdditionalVariableEncryptionKeyValue() {}
    /**
     * @return The [KMS key name] with which the content of the Operation is encrypted. The
     * expected format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*.
     * Will be empty string if google managed.
     * 
     */
    public Optional<String> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }
    /**
     * @return Type of Encryption Key
     * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthConfigAdditionalVariableEncryptionKeyValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kmsKeyName;
        private String type;
        public Builder() {}
        public Builder(ConnectionAuthConfigAdditionalVariableEncryptionKeyValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder kmsKeyName(@Nullable String kmsKeyName) {

            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ConnectionAuthConfigAdditionalVariableEncryptionKeyValue", "type");
            }
            this.type = type;
            return this;
        }
        public ConnectionAuthConfigAdditionalVariableEncryptionKeyValue build() {
            final var _resultValue = new ConnectionAuthConfigAdditionalVariableEncryptionKeyValue();
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
