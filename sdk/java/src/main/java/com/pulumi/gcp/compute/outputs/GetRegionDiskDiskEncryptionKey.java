// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionDiskDiskEncryptionKey {
    /**
     * @return The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    private String kmsKeyName;
    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    private String rawKey;
    /**
     * @return Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit
     * customer-supplied encryption key to either encrypt or decrypt
     * this resource. You can provide either the rawKey or the rsaEncryptedKey.
     * 
     */
    private String rsaEncryptedKey;
    /**
     * @return The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    private String sha256;

    private GetRegionDiskDiskEncryptionKey() {}
    /**
     * @return The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    public String rawKey() {
        return this.rawKey;
    }
    /**
     * @return Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit
     * customer-supplied encryption key to either encrypt or decrypt
     * this resource. You can provide either the rawKey or the rsaEncryptedKey.
     * 
     */
    public String rsaEncryptedKey() {
        return this.rsaEncryptedKey;
    }
    /**
     * @return The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    public String sha256() {
        return this.sha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionDiskDiskEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyName;
        private String rawKey;
        private String rsaEncryptedKey;
        private String sha256;
        public Builder() {}
        public Builder(GetRegionDiskDiskEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.rawKey = defaults.rawKey;
    	      this.rsaEncryptedKey = defaults.rsaEncryptedKey;
    	      this.sha256 = defaults.sha256;
        }

        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("GetRegionDiskDiskEncryptionKey", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder rawKey(String rawKey) {
            if (rawKey == null) {
              throw new MissingRequiredPropertyException("GetRegionDiskDiskEncryptionKey", "rawKey");
            }
            this.rawKey = rawKey;
            return this;
        }
        @CustomType.Setter
        public Builder rsaEncryptedKey(String rsaEncryptedKey) {
            if (rsaEncryptedKey == null) {
              throw new MissingRequiredPropertyException("GetRegionDiskDiskEncryptionKey", "rsaEncryptedKey");
            }
            this.rsaEncryptedKey = rsaEncryptedKey;
            return this;
        }
        @CustomType.Setter
        public Builder sha256(String sha256) {
            if (sha256 == null) {
              throw new MissingRequiredPropertyException("GetRegionDiskDiskEncryptionKey", "sha256");
            }
            this.sha256 = sha256;
            return this;
        }
        public GetRegionDiskDiskEncryptionKey build() {
            final var _resultValue = new GetRegionDiskDiskEncryptionKey();
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.rawKey = rawKey;
            _resultValue.rsaEncryptedKey = rsaEncryptedKey;
            _resultValue.sha256 = sha256;
            return _resultValue;
        }
    }
}
