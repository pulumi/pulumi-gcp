// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.developerconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionCryptoKeyConfig {
    /**
     * @return Required. The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*`.
     * 
     */
    private String keyReference;

    private ConnectionCryptoKeyConfig() {}
    /**
     * @return Required. The name of the key which is used to encrypt/decrypt customer data. For key
     * in Cloud KMS, the key should be in the format of
     * `projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*`.
     * 
     */
    public String keyReference() {
        return this.keyReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionCryptoKeyConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyReference;
        public Builder() {}
        public Builder(ConnectionCryptoKeyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyReference = defaults.keyReference;
        }

        @CustomType.Setter
        public Builder keyReference(String keyReference) {
            if (keyReference == null) {
              throw new MissingRequiredPropertyException("ConnectionCryptoKeyConfig", "keyReference");
            }
            this.keyReference = keyReference;
            return this;
        }
        public ConnectionCryptoKeyConfig build() {
            final var _resultValue = new ConnectionCryptoKeyConfig();
            _resultValue.keyReference = keyReference;
            return _resultValue;
        }
    }
}
