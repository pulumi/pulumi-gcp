// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.memcache.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs;
import java.lang.String;
import java.util.Objects;


public final class InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs Empty = new InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs();

    /**
     * Required. The day of week that maintenance updates occur.
     * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
     * - MONDAY: Monday
     * - TUESDAY: Tuesday
     * - WEDNESDAY: Wednesday
     * - THURSDAY: Thursday
     * - FRIDAY: Friday
     * - SATURDAY: Saturday
     * - SUNDAY: Sunday
     *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="day", required=true)
    private Output<String> day;

    /**
     * @return Required. The day of week that maintenance updates occur.
     * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
     * - MONDAY: Monday
     * - TUESDAY: Tuesday
     * - WEDNESDAY: Wednesday
     * - THURSDAY: Thursday
     * - FRIDAY: Friday
     * - SATURDAY: Saturday
     * - SUNDAY: Sunday
     *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    public Output<String> day() {
        return this.day;
    }

    /**
     * Required. The length of the maintenance window, ranging from 3 hours to 8 hours.
     * A duration in seconds with up to nine fractional digits,
     * terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return Required. The length of the maintenance window, ranging from 3 hours to 8 hours.
     * A duration in seconds with up to nine fractional digits,
     * terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * Required. Start time of the window in UTC time.
     * Structure is documented below.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs> startTime;

    /**
     * @return Required. Start time of the window in UTC time.
     * Structure is documented below.
     * 
     */
    public Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs> startTime() {
        return this.startTime;
    }

    private InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs() {}

    private InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs(InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs $) {
        this.day = $.day;
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs $;

        public Builder() {
            $ = new InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs();
        }

        public Builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs defaults) {
            $ = new InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Required. The day of week that maintenance updates occur.
         * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
         * - MONDAY: Monday
         * - TUESDAY: Tuesday
         * - WEDNESDAY: Wednesday
         * - THURSDAY: Thursday
         * - FRIDAY: Friday
         * - SATURDAY: Saturday
         * - SUNDAY: Sunday
         *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
         * 
         * @return builder
         * 
         */
        public Builder day(Output<String> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Required. The day of week that maintenance updates occur.
         * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
         * - MONDAY: Monday
         * - TUESDAY: Tuesday
         * - WEDNESDAY: Wednesday
         * - THURSDAY: Thursday
         * - FRIDAY: Friday
         * - SATURDAY: Saturday
         * - SUNDAY: Sunday
         *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
         * 
         * @return builder
         * 
         */
        public Builder day(String day) {
            return day(Output.of(day));
        }

        /**
         * @param duration Required. The length of the maintenance window, ranging from 3 hours to 8 hours.
         * A duration in seconds with up to nine fractional digits,
         * terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Required. The length of the maintenance window, ranging from 3 hours to 8 hours.
         * A duration in seconds with up to nine fractional digits,
         * terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param startTime Required. Start time of the window in UTC time.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Required. Start time of the window in UTC time.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder startTime(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs startTime) {
            return startTime(Output.of(startTime));
        }

        public InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}