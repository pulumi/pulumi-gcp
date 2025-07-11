// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupVaultBackupRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupVaultBackupRetentionPolicyArgs Empty = new BackupVaultBackupRetentionPolicyArgs();

    /**
     * Minimum retention duration in days for backups in the backup vault.
     * 
     */
    @Import(name="backupMinimumEnforcedRetentionDays", required=true)
    private Output<Integer> backupMinimumEnforcedRetentionDays;

    /**
     * @return Minimum retention duration in days for backups in the backup vault.
     * 
     */
    public Output<Integer> backupMinimumEnforcedRetentionDays() {
        return this.backupMinimumEnforcedRetentionDays;
    }

    /**
     * Indicates if the daily backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    @Import(name="dailyBackupImmutable")
    private @Nullable Output<Boolean> dailyBackupImmutable;

    /**
     * @return Indicates if the daily backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    public Optional<Output<Boolean>> dailyBackupImmutable() {
        return Optional.ofNullable(this.dailyBackupImmutable);
    }

    /**
     * Indicates if the manual backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    @Import(name="manualBackupImmutable")
    private @Nullable Output<Boolean> manualBackupImmutable;

    /**
     * @return Indicates if the manual backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    public Optional<Output<Boolean>> manualBackupImmutable() {
        return Optional.ofNullable(this.manualBackupImmutable);
    }

    /**
     * Indicates if the monthly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    @Import(name="monthlyBackupImmutable")
    private @Nullable Output<Boolean> monthlyBackupImmutable;

    /**
     * @return Indicates if the monthly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    public Optional<Output<Boolean>> monthlyBackupImmutable() {
        return Optional.ofNullable(this.monthlyBackupImmutable);
    }

    /**
     * Indicates if the weekly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    @Import(name="weeklyBackupImmutable")
    private @Nullable Output<Boolean> weeklyBackupImmutable;

    /**
     * @return Indicates if the weekly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
     * 
     */
    public Optional<Output<Boolean>> weeklyBackupImmutable() {
        return Optional.ofNullable(this.weeklyBackupImmutable);
    }

    private BackupVaultBackupRetentionPolicyArgs() {}

    private BackupVaultBackupRetentionPolicyArgs(BackupVaultBackupRetentionPolicyArgs $) {
        this.backupMinimumEnforcedRetentionDays = $.backupMinimumEnforcedRetentionDays;
        this.dailyBackupImmutable = $.dailyBackupImmutable;
        this.manualBackupImmutable = $.manualBackupImmutable;
        this.monthlyBackupImmutable = $.monthlyBackupImmutable;
        this.weeklyBackupImmutable = $.weeklyBackupImmutable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupVaultBackupRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupVaultBackupRetentionPolicyArgs $;

        public Builder() {
            $ = new BackupVaultBackupRetentionPolicyArgs();
        }

        public Builder(BackupVaultBackupRetentionPolicyArgs defaults) {
            $ = new BackupVaultBackupRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupMinimumEnforcedRetentionDays Minimum retention duration in days for backups in the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder backupMinimumEnforcedRetentionDays(Output<Integer> backupMinimumEnforcedRetentionDays) {
            $.backupMinimumEnforcedRetentionDays = backupMinimumEnforcedRetentionDays;
            return this;
        }

        /**
         * @param backupMinimumEnforcedRetentionDays Minimum retention duration in days for backups in the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder backupMinimumEnforcedRetentionDays(Integer backupMinimumEnforcedRetentionDays) {
            return backupMinimumEnforcedRetentionDays(Output.of(backupMinimumEnforcedRetentionDays));
        }

        /**
         * @param dailyBackupImmutable Indicates if the daily backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder dailyBackupImmutable(@Nullable Output<Boolean> dailyBackupImmutable) {
            $.dailyBackupImmutable = dailyBackupImmutable;
            return this;
        }

        /**
         * @param dailyBackupImmutable Indicates if the daily backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder dailyBackupImmutable(Boolean dailyBackupImmutable) {
            return dailyBackupImmutable(Output.of(dailyBackupImmutable));
        }

        /**
         * @param manualBackupImmutable Indicates if the manual backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder manualBackupImmutable(@Nullable Output<Boolean> manualBackupImmutable) {
            $.manualBackupImmutable = manualBackupImmutable;
            return this;
        }

        /**
         * @param manualBackupImmutable Indicates if the manual backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder manualBackupImmutable(Boolean manualBackupImmutable) {
            return manualBackupImmutable(Output.of(manualBackupImmutable));
        }

        /**
         * @param monthlyBackupImmutable Indicates if the monthly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder monthlyBackupImmutable(@Nullable Output<Boolean> monthlyBackupImmutable) {
            $.monthlyBackupImmutable = monthlyBackupImmutable;
            return this;
        }

        /**
         * @param monthlyBackupImmutable Indicates if the monthly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder monthlyBackupImmutable(Boolean monthlyBackupImmutable) {
            return monthlyBackupImmutable(Output.of(monthlyBackupImmutable));
        }

        /**
         * @param weeklyBackupImmutable Indicates if the weekly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder weeklyBackupImmutable(@Nullable Output<Boolean> weeklyBackupImmutable) {
            $.weeklyBackupImmutable = weeklyBackupImmutable;
            return this;
        }

        /**
         * @param weeklyBackupImmutable Indicates if the weekly backups are immutable. At least one of daily_backup_immutable, weekly_backup_immutable, monthly_backup_immutable and manual_backup_immutable must be true.
         * 
         * @return builder
         * 
         */
        public Builder weeklyBackupImmutable(Boolean weeklyBackupImmutable) {
            return weeklyBackupImmutable(Output.of(weeklyBackupImmutable));
        }

        public BackupVaultBackupRetentionPolicyArgs build() {
            if ($.backupMinimumEnforcedRetentionDays == null) {
                throw new MissingRequiredPropertyException("BackupVaultBackupRetentionPolicyArgs", "backupMinimumEnforcedRetentionDays");
            }
            return $;
        }
    }

}
