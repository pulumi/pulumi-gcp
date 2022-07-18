// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceAttachedDisk {
    /**
     * @return Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    private final @Nullable String deviceName;
    /**
     * @return A 256-bit [customer-supplied encryption key]
     * (&lt;https://cloud.google.com/compute/docs/disks/customer-supplied-encryption&gt;),
     * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
     * 
     */
    private final @Nullable String diskEncryptionKeyRaw;
    private final @Nullable String diskEncryptionKeySha256;
    /**
     * @return The self_link of the encryption key that is
     * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
     * and `disk_encryption_key_raw` may be set.
     * 
     */
    private final @Nullable String kmsKeySelfLink;
    /**
     * @return Either &#34;READ_ONLY&#34; or &#34;READ_WRITE&#34;, defaults to &#34;READ_WRITE&#34;
     * If you have a persistent disk with data that you want to share
     * between multiple instances, detach it from any read-write instances and
     * attach it to one or more instances in read-only mode.
     * 
     */
    private final @Nullable String mode;
    /**
     * @return The name or self_link of the disk to attach to this instance.
     * 
     */
    private final String source;

    @CustomType.Constructor
    private InstanceAttachedDisk(
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("diskEncryptionKeyRaw") @Nullable String diskEncryptionKeyRaw,
        @CustomType.Parameter("diskEncryptionKeySha256") @Nullable String diskEncryptionKeySha256,
        @CustomType.Parameter("kmsKeySelfLink") @Nullable String kmsKeySelfLink,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("source") String source) {
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = source;
    }

    /**
     * @return Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return A 256-bit [customer-supplied encryption key]
     * (&lt;https://cloud.google.com/compute/docs/disks/customer-supplied-encryption&gt;),
     * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
     * 
     */
    public Optional<String> diskEncryptionKeyRaw() {
        return Optional.ofNullable(this.diskEncryptionKeyRaw);
    }
    public Optional<String> diskEncryptionKeySha256() {
        return Optional.ofNullable(this.diskEncryptionKeySha256);
    }
    /**
     * @return The self_link of the encryption key that is
     * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
     * and `disk_encryption_key_raw` may be set.
     * 
     */
    public Optional<String> kmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }
    /**
     * @return Either &#34;READ_ONLY&#34; or &#34;READ_WRITE&#34;, defaults to &#34;READ_WRITE&#34;
     * If you have a persistent disk with data that you want to share
     * between multiple instances, detach it from any read-write instances and
     * attach it to one or more instances in read-only mode.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The name or self_link of the disk to attach to this instance.
     * 
     */
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAttachedDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable String diskEncryptionKeyRaw;
        private @Nullable String diskEncryptionKeySha256;
        private @Nullable String kmsKeySelfLink;
        private @Nullable String mode;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAttachedDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder diskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }
        public Builder diskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }
        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public InstanceAttachedDisk build() {
            return new InstanceAttachedDisk(deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, kmsKeySelfLink, mode, source);
        }
    }
}