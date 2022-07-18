// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule {
    /**
     * @return May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    private final List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

    @CustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(@CustomType.Parameter("dayOfWeeks") List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    /**
     * @return May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    public List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder dayOfWeeks(List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(dayOfWeeks);
        }
    }
}