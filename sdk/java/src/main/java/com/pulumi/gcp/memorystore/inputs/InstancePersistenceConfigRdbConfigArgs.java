// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePersistenceConfigRdbConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePersistenceConfigRdbConfigArgs Empty = new InstancePersistenceConfigRdbConfigArgs();

    /**
     * Optional. Period between RDB snapshots.
     * Possible values:
     * ONE_HOUR
     * SIX_HOURS
     * TWELVE_HOURS
     * TWENTY_FOUR_HOURS
     * 
     */
    @Import(name="rdbSnapshotPeriod")
    private @Nullable Output<String> rdbSnapshotPeriod;

    /**
     * @return Optional. Period between RDB snapshots.
     * Possible values:
     * ONE_HOUR
     * SIX_HOURS
     * TWELVE_HOURS
     * TWENTY_FOUR_HOURS
     * 
     */
    public Optional<Output<String>> rdbSnapshotPeriod() {
        return Optional.ofNullable(this.rdbSnapshotPeriod);
    }

    /**
     * Optional. Time that the first snapshot was/will be attempted, and to which future
     * snapshots will be aligned. If not provided, the current time will be
     * used.
     * 
     */
    @Import(name="rdbSnapshotStartTime")
    private @Nullable Output<String> rdbSnapshotStartTime;

    /**
     * @return Optional. Time that the first snapshot was/will be attempted, and to which future
     * snapshots will be aligned. If not provided, the current time will be
     * used.
     * 
     */
    public Optional<Output<String>> rdbSnapshotStartTime() {
        return Optional.ofNullable(this.rdbSnapshotStartTime);
    }

    private InstancePersistenceConfigRdbConfigArgs() {}

    private InstancePersistenceConfigRdbConfigArgs(InstancePersistenceConfigRdbConfigArgs $) {
        this.rdbSnapshotPeriod = $.rdbSnapshotPeriod;
        this.rdbSnapshotStartTime = $.rdbSnapshotStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePersistenceConfigRdbConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePersistenceConfigRdbConfigArgs $;

        public Builder() {
            $ = new InstancePersistenceConfigRdbConfigArgs();
        }

        public Builder(InstancePersistenceConfigRdbConfigArgs defaults) {
            $ = new InstancePersistenceConfigRdbConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rdbSnapshotPeriod Optional. Period between RDB snapshots.
         * Possible values:
         * ONE_HOUR
         * SIX_HOURS
         * TWELVE_HOURS
         * TWENTY_FOUR_HOURS
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotPeriod(@Nullable Output<String> rdbSnapshotPeriod) {
            $.rdbSnapshotPeriod = rdbSnapshotPeriod;
            return this;
        }

        /**
         * @param rdbSnapshotPeriod Optional. Period between RDB snapshots.
         * Possible values:
         * ONE_HOUR
         * SIX_HOURS
         * TWELVE_HOURS
         * TWENTY_FOUR_HOURS
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotPeriod(String rdbSnapshotPeriod) {
            return rdbSnapshotPeriod(Output.of(rdbSnapshotPeriod));
        }

        /**
         * @param rdbSnapshotStartTime Optional. Time that the first snapshot was/will be attempted, and to which future
         * snapshots will be aligned. If not provided, the current time will be
         * used.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotStartTime(@Nullable Output<String> rdbSnapshotStartTime) {
            $.rdbSnapshotStartTime = rdbSnapshotStartTime;
            return this;
        }

        /**
         * @param rdbSnapshotStartTime Optional. Time that the first snapshot was/will be attempted, and to which future
         * snapshots will be aligned. If not provided, the current time will be
         * used.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotStartTime(String rdbSnapshotStartTime) {
            return rdbSnapshotStartTime(Output.of(rdbSnapshotStartTime));
        }

        public InstancePersistenceConfigRdbConfigArgs build() {
            return $;
        }
    }

}
