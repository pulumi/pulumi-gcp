// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeSnapshotPolicyDailyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeSnapshotPolicyDailyScheduleArgs Empty = new VolumeSnapshotPolicyDailyScheduleArgs();

    /**
     * Set the hour to create the snapshot (0-23), defaults to midnight (0).
     * 
     */
    @Import(name="hour")
    private @Nullable Output<Integer> hour;

    /**
     * @return Set the hour to create the snapshot (0-23), defaults to midnight (0).
     * 
     */
    public Optional<Output<Integer>> hour() {
        return Optional.ofNullable(this.hour);
    }

    /**
     * Set the minute of the hour to create the snapshot (0-59), defaults to the top of the hour (0).
     * 
     */
    @Import(name="minute")
    private @Nullable Output<Integer> minute;

    /**
     * @return Set the minute of the hour to create the snapshot (0-59), defaults to the top of the hour (0).
     * 
     */
    public Optional<Output<Integer>> minute() {
        return Optional.ofNullable(this.minute);
    }

    /**
     * The maximum number of snapshots to keep for the daily schedule.
     * 
     */
    @Import(name="snapshotsToKeep", required=true)
    private Output<Integer> snapshotsToKeep;

    /**
     * @return The maximum number of snapshots to keep for the daily schedule.
     * 
     */
    public Output<Integer> snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    private VolumeSnapshotPolicyDailyScheduleArgs() {}

    private VolumeSnapshotPolicyDailyScheduleArgs(VolumeSnapshotPolicyDailyScheduleArgs $) {
        this.hour = $.hour;
        this.minute = $.minute;
        this.snapshotsToKeep = $.snapshotsToKeep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeSnapshotPolicyDailyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeSnapshotPolicyDailyScheduleArgs $;

        public Builder() {
            $ = new VolumeSnapshotPolicyDailyScheduleArgs();
        }

        public Builder(VolumeSnapshotPolicyDailyScheduleArgs defaults) {
            $ = new VolumeSnapshotPolicyDailyScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hour Set the hour to create the snapshot (0-23), defaults to midnight (0).
         * 
         * @return builder
         * 
         */
        public Builder hour(@Nullable Output<Integer> hour) {
            $.hour = hour;
            return this;
        }

        /**
         * @param hour Set the hour to create the snapshot (0-23), defaults to midnight (0).
         * 
         * @return builder
         * 
         */
        public Builder hour(Integer hour) {
            return hour(Output.of(hour));
        }

        /**
         * @param minute Set the minute of the hour to create the snapshot (0-59), defaults to the top of the hour (0).
         * 
         * @return builder
         * 
         */
        public Builder minute(@Nullable Output<Integer> minute) {
            $.minute = minute;
            return this;
        }

        /**
         * @param minute Set the minute of the hour to create the snapshot (0-59), defaults to the top of the hour (0).
         * 
         * @return builder
         * 
         */
        public Builder minute(Integer minute) {
            return minute(Output.of(minute));
        }

        /**
         * @param snapshotsToKeep The maximum number of snapshots to keep for the daily schedule.
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(Output<Integer> snapshotsToKeep) {
            $.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        /**
         * @param snapshotsToKeep The maximum number of snapshots to keep for the daily schedule.
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(Integer snapshotsToKeep) {
            return snapshotsToKeep(Output.of(snapshotsToKeep));
        }

        public VolumeSnapshotPolicyDailyScheduleArgs build() {
            if ($.snapshotsToKeep == null) {
                throw new MissingRequiredPropertyException("VolumeSnapshotPolicyDailyScheduleArgs", "snapshotsToKeep");
            }
            return $;
        }
    }

}
