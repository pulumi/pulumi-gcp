// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupScheduleEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupScheduleEncryptionConfigArgs Empty = new BackupScheduleEncryptionConfigArgs();

    /**
     * The encryption type of backups created by the backup schedule.
     * Possible values are USE_DATABASE_ENCRYPTION, GOOGLE_DEFAULT_ENCRYPTION, or CUSTOMER_MANAGED_ENCRYPTION.
     * If you use CUSTOMER_MANAGED_ENCRYPTION, you must specify a kmsKeyName.
     * If your backup type is incremental-backup, the encryption type must be GOOGLE_DEFAULT_ENCRYPTION.
     * Possible values are: `USE_DATABASE_ENCRYPTION`, `GOOGLE_DEFAULT_ENCRYPTION`, `CUSTOMER_MANAGED_ENCRYPTION`.
     * 
     */
    @Import(name="encryptionType", required=true)
    private Output<String> encryptionType;

    /**
     * @return The encryption type of backups created by the backup schedule.
     * Possible values are USE_DATABASE_ENCRYPTION, GOOGLE_DEFAULT_ENCRYPTION, or CUSTOMER_MANAGED_ENCRYPTION.
     * If you use CUSTOMER_MANAGED_ENCRYPTION, you must specify a kmsKeyName.
     * If your backup type is incremental-backup, the encryption type must be GOOGLE_DEFAULT_ENCRYPTION.
     * Possible values are: `USE_DATABASE_ENCRYPTION`, `GOOGLE_DEFAULT_ENCRYPTION`, `CUSTOMER_MANAGED_ENCRYPTION`.
     * 
     */
    public Output<String> encryptionType() {
        return this.encryptionType;
    }

    /**
     * The resource name of the Cloud KMS key to use for encryption.
     * Format: &#39;projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}&#39;
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The resource name of the Cloud KMS key to use for encryption.
     * Format: &#39;projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}&#39;
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    private BackupScheduleEncryptionConfigArgs() {}

    private BackupScheduleEncryptionConfigArgs(BackupScheduleEncryptionConfigArgs $) {
        this.encryptionType = $.encryptionType;
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupScheduleEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupScheduleEncryptionConfigArgs $;

        public Builder() {
            $ = new BackupScheduleEncryptionConfigArgs();
        }

        public Builder(BackupScheduleEncryptionConfigArgs defaults) {
            $ = new BackupScheduleEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionType The encryption type of backups created by the backup schedule.
         * Possible values are USE_DATABASE_ENCRYPTION, GOOGLE_DEFAULT_ENCRYPTION, or CUSTOMER_MANAGED_ENCRYPTION.
         * If you use CUSTOMER_MANAGED_ENCRYPTION, you must specify a kmsKeyName.
         * If your backup type is incremental-backup, the encryption type must be GOOGLE_DEFAULT_ENCRYPTION.
         * Possible values are: `USE_DATABASE_ENCRYPTION`, `GOOGLE_DEFAULT_ENCRYPTION`, `CUSTOMER_MANAGED_ENCRYPTION`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        /**
         * @param encryptionType The encryption type of backups created by the backup schedule.
         * Possible values are USE_DATABASE_ENCRYPTION, GOOGLE_DEFAULT_ENCRYPTION, or CUSTOMER_MANAGED_ENCRYPTION.
         * If you use CUSTOMER_MANAGED_ENCRYPTION, you must specify a kmsKeyName.
         * If your backup type is incremental-backup, the encryption type must be GOOGLE_DEFAULT_ENCRYPTION.
         * Possible values are: `USE_DATABASE_ENCRYPTION`, `GOOGLE_DEFAULT_ENCRYPTION`, `CUSTOMER_MANAGED_ENCRYPTION`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        /**
         * @param kmsKeyName The resource name of the Cloud KMS key to use for encryption.
         * Format: &#39;projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}&#39;
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The resource name of the Cloud KMS key to use for encryption.
         * Format: &#39;projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}&#39;
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public BackupScheduleEncryptionConfigArgs build() {
            if ($.encryptionType == null) {
                throw new MissingRequiredPropertyException("BackupScheduleEncryptionConfigArgs", "encryptionType");
            }
            return $;
        }
    }

}
