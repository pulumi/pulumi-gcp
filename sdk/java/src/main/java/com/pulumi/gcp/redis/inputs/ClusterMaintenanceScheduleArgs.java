// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMaintenanceScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenanceScheduleArgs Empty = new ClusterMaintenanceScheduleArgs();

    /**
     * (Output)
     * Output only. The end time of any upcoming scheduled maintenance for this cluster.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return (Output)
     * Output only. The end time of any upcoming scheduled maintenance for this cluster.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * (Output)
     * Output only. The deadline that the maintenance schedule start time
     * can not go beyond, including reschedule.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="scheduleDeadlineTime")
    private @Nullable Output<String> scheduleDeadlineTime;

    /**
     * @return (Output)
     * Output only. The deadline that the maintenance schedule start time
     * can not go beyond, including reschedule.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    public Optional<Output<String>> scheduleDeadlineTime() {
        return Optional.ofNullable(this.scheduleDeadlineTime);
    }

    /**
     * (Output)
     * Output only. The start time of any upcoming scheduled maintenance for this cluster.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return (Output)
     * Output only. The start time of any upcoming scheduled maintenance for this cluster.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private ClusterMaintenanceScheduleArgs() {}

    private ClusterMaintenanceScheduleArgs(ClusterMaintenanceScheduleArgs $) {
        this.endTime = $.endTime;
        this.scheduleDeadlineTime = $.scheduleDeadlineTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenanceScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenanceScheduleArgs $;

        public Builder() {
            $ = new ClusterMaintenanceScheduleArgs();
        }

        public Builder(ClusterMaintenanceScheduleArgs defaults) {
            $ = new ClusterMaintenanceScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime (Output)
         * Output only. The end time of any upcoming scheduled maintenance for this cluster.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime (Output)
         * Output only. The end time of any upcoming scheduled maintenance for this cluster.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param scheduleDeadlineTime (Output)
         * Output only. The deadline that the maintenance schedule start time
         * can not go beyond, including reschedule.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder scheduleDeadlineTime(@Nullable Output<String> scheduleDeadlineTime) {
            $.scheduleDeadlineTime = scheduleDeadlineTime;
            return this;
        }

        /**
         * @param scheduleDeadlineTime (Output)
         * Output only. The deadline that the maintenance schedule start time
         * can not go beyond, including reschedule.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder scheduleDeadlineTime(String scheduleDeadlineTime) {
            return scheduleDeadlineTime(Output.of(scheduleDeadlineTime));
        }

        /**
         * @param startTime (Output)
         * Output only. The start time of any upcoming scheduled maintenance for this cluster.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime (Output)
         * Output only. The start time of any upcoming scheduled maintenance for this cluster.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ClusterMaintenanceScheduleArgs build() {
            return $;
        }
    }

}
