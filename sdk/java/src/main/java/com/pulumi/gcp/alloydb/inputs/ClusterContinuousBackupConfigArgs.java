// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.alloydb.inputs.ClusterContinuousBackupConfigEncryptionConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterContinuousBackupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterContinuousBackupConfigArgs Empty = new ClusterContinuousBackupConfigArgs();

    /**
     * Whether continuous backup recovery is enabled. If not set, defaults to true.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether continuous backup recovery is enabled. If not set, defaults to true.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<ClusterContinuousBackupConfigEncryptionConfigArgs> encryptionConfig;

    /**
     * @return EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterContinuousBackupConfigEncryptionConfigArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * The numbers of days that are eligible to restore from using PITR. To support the entire recovery window, backups and logs are retained for one day more than the recovery window.
     * If not set, defaults to 14 days.
     * 
     */
    @Import(name="recoveryWindowDays")
    private @Nullable Output<Integer> recoveryWindowDays;

    /**
     * @return The numbers of days that are eligible to restore from using PITR. To support the entire recovery window, backups and logs are retained for one day more than the recovery window.
     * If not set, defaults to 14 days.
     * 
     */
    public Optional<Output<Integer>> recoveryWindowDays() {
        return Optional.ofNullable(this.recoveryWindowDays);
    }

    private ClusterContinuousBackupConfigArgs() {}

    private ClusterContinuousBackupConfigArgs(ClusterContinuousBackupConfigArgs $) {
        this.enabled = $.enabled;
        this.encryptionConfig = $.encryptionConfig;
        this.recoveryWindowDays = $.recoveryWindowDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterContinuousBackupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterContinuousBackupConfigArgs $;

        public Builder() {
            $ = new ClusterContinuousBackupConfigArgs();
        }

        public Builder(ClusterContinuousBackupConfigArgs defaults) {
            $ = new ClusterContinuousBackupConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether continuous backup recovery is enabled. If not set, defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether continuous backup recovery is enabled. If not set, defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<ClusterContinuousBackupConfigEncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(ClusterContinuousBackupConfigEncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param recoveryWindowDays The numbers of days that are eligible to restore from using PITR. To support the entire recovery window, backups and logs are retained for one day more than the recovery window.
         * If not set, defaults to 14 days.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowDays(@Nullable Output<Integer> recoveryWindowDays) {
            $.recoveryWindowDays = recoveryWindowDays;
            return this;
        }

        /**
         * @param recoveryWindowDays The numbers of days that are eligible to restore from using PITR. To support the entire recovery window, backups and logs are retained for one day more than the recovery window.
         * If not set, defaults to 14 days.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowDays(Integer recoveryWindowDays) {
            return recoveryWindowDays(Output.of(recoveryWindowDays));
        }

        public ClusterContinuousBackupConfigArgs build() {
            return $;
        }
    }

}