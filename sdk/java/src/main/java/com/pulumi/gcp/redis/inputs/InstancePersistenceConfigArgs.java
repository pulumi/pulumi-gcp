// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePersistenceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePersistenceConfigArgs Empty = new InstancePersistenceConfigArgs();

    /**
     * Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * - DISABLED: 	Persistence is disabled for the instance, and any existing snapshots are deleted.
     * - RDB: RDB based Persistence is enabled.
     *   Possible values are `DISABLED` and `RDB`.
     * 
     */
    @Import(name="persistenceMode")
    private @Nullable Output<String> persistenceMode;

    /**
     * @return Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * - DISABLED: 	Persistence is disabled for the instance, and any existing snapshots are deleted.
     * - RDB: RDB based Persistence is enabled.
     *   Possible values are `DISABLED` and `RDB`.
     * 
     */
    public Optional<Output<String>> persistenceMode() {
        return Optional.ofNullable(this.persistenceMode);
    }

    /**
     * - 
     * Output only. The next time that a snapshot attempt is scheduled to occur.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
     * to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="rdbNextSnapshotTime")
    private @Nullable Output<String> rdbNextSnapshotTime;

    /**
     * @return -
     * Output only. The next time that a snapshot attempt is scheduled to occur.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
     * to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> rdbNextSnapshotTime() {
        return Optional.ofNullable(this.rdbNextSnapshotTime);
    }

    /**
     * Optional. Available snapshot periods for scheduling.
     * - ONE_HOUR:	Snapshot every 1 hour.
     * - SIX_HOURS:	Snapshot every 6 hours.
     * - TWELVE_HOURS:	Snapshot every 12 hours.
     * - TWENTY_FOUR_HOURS:	Snapshot every 24 horus.
     *   Possible values are `ONE_HOUR`, `SIX_HOURS`, `TWELVE_HOURS`, and `TWENTY_FOUR_HOURS`.
     * 
     */
    @Import(name="rdbSnapshotPeriod")
    private @Nullable Output<String> rdbSnapshotPeriod;

    /**
     * @return Optional. Available snapshot periods for scheduling.
     * - ONE_HOUR:	Snapshot every 1 hour.
     * - SIX_HOURS:	Snapshot every 6 hours.
     * - TWELVE_HOURS:	Snapshot every 12 hours.
     * - TWENTY_FOUR_HOURS:	Snapshot every 24 horus.
     *   Possible values are `ONE_HOUR`, `SIX_HOURS`, `TWELVE_HOURS`, and `TWENTY_FOUR_HOURS`.
     * 
     */
    public Optional<Output<String>> rdbSnapshotPeriod() {
        return Optional.ofNullable(this.rdbSnapshotPeriod);
    }

    /**
     * Optional. Date and time that the first snapshot was/will be attempted,
     * and to which future snapshots will be aligned. If not provided,
     * the current time will be used.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution
     * and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="rdbSnapshotStartTime")
    private @Nullable Output<String> rdbSnapshotStartTime;

    /**
     * @return Optional. Date and time that the first snapshot was/will be attempted,
     * and to which future snapshots will be aligned. If not provided,
     * the current time will be used.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution
     * and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> rdbSnapshotStartTime() {
        return Optional.ofNullable(this.rdbSnapshotStartTime);
    }

    private InstancePersistenceConfigArgs() {}

    private InstancePersistenceConfigArgs(InstancePersistenceConfigArgs $) {
        this.persistenceMode = $.persistenceMode;
        this.rdbNextSnapshotTime = $.rdbNextSnapshotTime;
        this.rdbSnapshotPeriod = $.rdbSnapshotPeriod;
        this.rdbSnapshotStartTime = $.rdbSnapshotStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePersistenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePersistenceConfigArgs $;

        public Builder() {
            $ = new InstancePersistenceConfigArgs();
        }

        public Builder(InstancePersistenceConfigArgs defaults) {
            $ = new InstancePersistenceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param persistenceMode Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
         * - DISABLED: 	Persistence is disabled for the instance, and any existing snapshots are deleted.
         * - RDB: RDB based Persistence is enabled.
         *   Possible values are `DISABLED` and `RDB`.
         * 
         * @return builder
         * 
         */
        public Builder persistenceMode(@Nullable Output<String> persistenceMode) {
            $.persistenceMode = persistenceMode;
            return this;
        }

        /**
         * @param persistenceMode Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
         * - DISABLED: 	Persistence is disabled for the instance, and any existing snapshots are deleted.
         * - RDB: RDB based Persistence is enabled.
         *   Possible values are `DISABLED` and `RDB`.
         * 
         * @return builder
         * 
         */
        public Builder persistenceMode(String persistenceMode) {
            return persistenceMode(Output.of(persistenceMode));
        }

        /**
         * @param rdbNextSnapshotTime -
         * Output only. The next time that a snapshot attempt is scheduled to occur.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
         * to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder rdbNextSnapshotTime(@Nullable Output<String> rdbNextSnapshotTime) {
            $.rdbNextSnapshotTime = rdbNextSnapshotTime;
            return this;
        }

        /**
         * @param rdbNextSnapshotTime -
         * Output only. The next time that a snapshot attempt is scheduled to occur.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
         * to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder rdbNextSnapshotTime(String rdbNextSnapshotTime) {
            return rdbNextSnapshotTime(Output.of(rdbNextSnapshotTime));
        }

        /**
         * @param rdbSnapshotPeriod Optional. Available snapshot periods for scheduling.
         * - ONE_HOUR:	Snapshot every 1 hour.
         * - SIX_HOURS:	Snapshot every 6 hours.
         * - TWELVE_HOURS:	Snapshot every 12 hours.
         * - TWENTY_FOUR_HOURS:	Snapshot every 24 horus.
         *   Possible values are `ONE_HOUR`, `SIX_HOURS`, `TWELVE_HOURS`, and `TWENTY_FOUR_HOURS`.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotPeriod(@Nullable Output<String> rdbSnapshotPeriod) {
            $.rdbSnapshotPeriod = rdbSnapshotPeriod;
            return this;
        }

        /**
         * @param rdbSnapshotPeriod Optional. Available snapshot periods for scheduling.
         * - ONE_HOUR:	Snapshot every 1 hour.
         * - SIX_HOURS:	Snapshot every 6 hours.
         * - TWELVE_HOURS:	Snapshot every 12 hours.
         * - TWENTY_FOUR_HOURS:	Snapshot every 24 horus.
         *   Possible values are `ONE_HOUR`, `SIX_HOURS`, `TWELVE_HOURS`, and `TWENTY_FOUR_HOURS`.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotPeriod(String rdbSnapshotPeriod) {
            return rdbSnapshotPeriod(Output.of(rdbSnapshotPeriod));
        }

        /**
         * @param rdbSnapshotStartTime Optional. Date and time that the first snapshot was/will be attempted,
         * and to which future snapshots will be aligned. If not provided,
         * the current time will be used.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution
         * and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotStartTime(@Nullable Output<String> rdbSnapshotStartTime) {
            $.rdbSnapshotStartTime = rdbSnapshotStartTime;
            return this;
        }

        /**
         * @param rdbSnapshotStartTime Optional. Date and time that the first snapshot was/will be attempted,
         * and to which future snapshots will be aligned. If not provided,
         * the current time will be used.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution
         * and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotStartTime(String rdbSnapshotStartTime) {
            return rdbSnapshotStartTime(Output.of(rdbSnapshotStartTime));
        }

        public InstancePersistenceConfigArgs build() {
            return $;
        }
    }

}