// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPlanBackupScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPlanBackupScheduleArgs Empty = new BackupPlanBackupScheduleArgs();

    /**
     * A standard cron string that defines a repeating schedule for
     * creating Backups via this BackupPlan.
     * If this is defined, then backupRetainDays must also be defined.
     * 
     */
    @Import(name="cronSchedule")
    private @Nullable Output<String> cronSchedule;

    /**
     * @return A standard cron string that defines a repeating schedule for
     * creating Backups via this BackupPlan.
     * If this is defined, then backupRetainDays must also be defined.
     * 
     */
    public Optional<Output<String>> cronSchedule() {
        return Optional.ofNullable(this.cronSchedule);
    }

    /**
     * This flag denotes whether automatic Backup creation is paused for this BackupPlan.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return This flag denotes whether automatic Backup creation is paused for this BackupPlan.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    private BackupPlanBackupScheduleArgs() {}

    private BackupPlanBackupScheduleArgs(BackupPlanBackupScheduleArgs $) {
        this.cronSchedule = $.cronSchedule;
        this.paused = $.paused;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanBackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanBackupScheduleArgs $;

        public Builder() {
            $ = new BackupPlanBackupScheduleArgs();
        }

        public Builder(BackupPlanBackupScheduleArgs defaults) {
            $ = new BackupPlanBackupScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronSchedule A standard cron string that defines a repeating schedule for
         * creating Backups via this BackupPlan.
         * If this is defined, then backupRetainDays must also be defined.
         * 
         * @return builder
         * 
         */
        public Builder cronSchedule(@Nullable Output<String> cronSchedule) {
            $.cronSchedule = cronSchedule;
            return this;
        }

        /**
         * @param cronSchedule A standard cron string that defines a repeating schedule for
         * creating Backups via this BackupPlan.
         * If this is defined, then backupRetainDays must also be defined.
         * 
         * @return builder
         * 
         */
        public Builder cronSchedule(String cronSchedule) {
            return cronSchedule(Output.of(cronSchedule));
        }

        /**
         * @param paused This flag denotes whether automatic Backup creation is paused for this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused This flag denotes whether automatic Backup creation is paused for this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        public BackupPlanBackupScheduleArgs build() {
            return $;
        }
    }

}