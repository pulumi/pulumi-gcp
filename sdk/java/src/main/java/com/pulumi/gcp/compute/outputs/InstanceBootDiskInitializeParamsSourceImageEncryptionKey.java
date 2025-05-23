// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceBootDiskInitializeParamsSourceImageEncryptionKey {
    /**
     * @return The self link of the encryption key that is stored in Google Cloud KMS. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
     * 
     */
    private @Nullable String kmsKeySelfLink;
    /**
     * @return The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used.
     * 
     */
    private @Nullable String kmsKeyServiceAccount;
    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
     * 
     */
    private @Nullable String rawKey;
    /**
     * @return Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
     * 
     */
    private @Nullable String rsaEncryptedKey;
    /**
     * @return The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * encoded SHA-256 hash of the [customer-supplied encryption key]
     * (https://cloud.google.com/compute/docs/disks/customer-supplied-encryption) that protects this resource.
     * 
     */
    private @Nullable String sha256;

    private InstanceBootDiskInitializeParamsSourceImageEncryptionKey() {}
    /**
     * @return The self link of the encryption key that is stored in Google Cloud KMS. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
     * 
     */
    public Optional<String> kmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }
    /**
     * @return The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used.
     * 
     */
    public Optional<String> kmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }
    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
     * 
     */
    public Optional<String> rawKey() {
        return Optional.ofNullable(this.rawKey);
    }
    /**
     * @return Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. Only one of kms_key_self_link, rsa_encrypted_key and raw_key may be set.
     * 
     */
    public Optional<String> rsaEncryptedKey() {
        return Optional.ofNullable(this.rsaEncryptedKey);
    }
    /**
     * @return The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * encoded SHA-256 hash of the [customer-supplied encryption key]
     * (https://cloud.google.com/compute/docs/disks/customer-supplied-encryption) that protects this resource.
     * 
     */
    public Optional<String> sha256() {
        return Optional.ofNullable(this.sha256);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceBootDiskInitializeParamsSourceImageEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kmsKeySelfLink;
        private @Nullable String kmsKeyServiceAccount;
        private @Nullable String rawKey;
        private @Nullable String rsaEncryptedKey;
        private @Nullable String sha256;
        public Builder() {}
        public Builder(InstanceBootDiskInitializeParamsSourceImageEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.rsaEncryptedKey = defaults.rsaEncryptedKey;
    	      this.sha256 = defaults.sha256;
        }

        @CustomType.Setter
        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {

            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {

            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder rawKey(@Nullable String rawKey) {

            this.rawKey = rawKey;
            return this;
        }
        @CustomType.Setter
        public Builder rsaEncryptedKey(@Nullable String rsaEncryptedKey) {

            this.rsaEncryptedKey = rsaEncryptedKey;
            return this;
        }
        @CustomType.Setter
        public Builder sha256(@Nullable String sha256) {

            this.sha256 = sha256;
            return this;
        }
        public InstanceBootDiskInitializeParamsSourceImageEncryptionKey build() {
            final var _resultValue = new InstanceBootDiskInitializeParamsSourceImageEncryptionKey();
            _resultValue.kmsKeySelfLink = kmsKeySelfLink;
            _resultValue.kmsKeyServiceAccount = kmsKeyServiceAccount;
            _resultValue.rawKey = rawKey;
            _resultValue.rsaEncryptedKey = rsaEncryptedKey;
            _resultValue.sha256 = sha256;
            return _resultValue;
        }
    }
}
