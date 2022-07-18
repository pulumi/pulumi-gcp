// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek {
    /**
     * @return The day of the week to create the snapshot. e.g. MONDAY
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    private final String day;
    /**
     * @return The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(
        @CustomType.Parameter("day") String day,
        @CustomType.Parameter("startTime") String startTime) {
        this.day = day;
        this.startTime = startTime;
    }

    /**
     * @return The day of the week to create the snapshot. e.g. MONDAY
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(day, startTime);
        }
    }
}