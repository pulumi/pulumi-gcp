// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule {
    /**
     * @return May contain up to seven (one for each day of the week) snapshot times.
     * 
     */
    private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

    private GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule() {}
    /**
     * @return May contain up to seven (one for each day of the week) snapshot times.
     * 
     */
    public List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;
        public Builder() {}
        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        @CustomType.Setter
        public Builder dayOfWeeks(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
            if (dayOfWeeks == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule", "dayOfWeeks");
            }
            this.dayOfWeeks = dayOfWeeks;
            return this;
        }
        public Builder dayOfWeeks(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }
        public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule build() {
            final var _resultValue = new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule();
            _resultValue.dayOfWeeks = dayOfWeeks;
            return _resultValue;
        }
    }
}
