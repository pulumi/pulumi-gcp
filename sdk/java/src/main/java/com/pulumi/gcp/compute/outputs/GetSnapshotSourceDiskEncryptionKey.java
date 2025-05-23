// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotSourceDiskEncryptionKey {
    /**
     * @return The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    private String kmsKeySelfLink;
    /**
     * @return The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    private String kmsKeyServiceAccount;
    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    private String rawKey;
    /**
     * @return Specifies an encryption key stored in Google Cloud KMS, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    private String rsaEncryptedKey;

    private GetSnapshotSourceDiskEncryptionKey() {}
    /**
     * @return The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    public String kmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }
    /**
     * @return The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    public String kmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount;
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
     * @return Specifies an encryption key stored in Google Cloud KMS, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    public String rsaEncryptedKey() {
        return this.rsaEncryptedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotSourceDiskEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeySelfLink;
        private String kmsKeyServiceAccount;
        private String rawKey;
        private String rsaEncryptedKey;
        public Builder() {}
        public Builder(GetSnapshotSourceDiskEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.rsaEncryptedKey = defaults.rsaEncryptedKey;
        }

        @CustomType.Setter
        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            if (kmsKeySelfLink == null) {
              throw new MissingRequiredPropertyException("GetSnapshotSourceDiskEncryptionKey", "kmsKeySelfLink");
            }
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyServiceAccount(String kmsKeyServiceAccount) {
            if (kmsKeyServiceAccount == null) {
              throw new MissingRequiredPropertyException("GetSnapshotSourceDiskEncryptionKey", "kmsKeyServiceAccount");
            }
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder rawKey(String rawKey) {
            if (rawKey == null) {
              throw new MissingRequiredPropertyException("GetSnapshotSourceDiskEncryptionKey", "rawKey");
            }
            this.rawKey = rawKey;
            return this;
        }
        @CustomType.Setter
        public Builder rsaEncryptedKey(String rsaEncryptedKey) {
            if (rsaEncryptedKey == null) {
              throw new MissingRequiredPropertyException("GetSnapshotSourceDiskEncryptionKey", "rsaEncryptedKey");
            }
            this.rsaEncryptedKey = rsaEncryptedKey;
            return this;
        }
        public GetSnapshotSourceDiskEncryptionKey build() {
            final var _resultValue = new GetSnapshotSourceDiskEncryptionKey();
            _resultValue.kmsKeySelfLink = kmsKeySelfLink;
            _resultValue.kmsKeyServiceAccount = kmsKeyServiceAccount;
            _resultValue.rawKey = rawKey;
            _resultValue.rsaEncryptedKey = rsaEncryptedKey;
            return _resultValue;
        }
    }
}
