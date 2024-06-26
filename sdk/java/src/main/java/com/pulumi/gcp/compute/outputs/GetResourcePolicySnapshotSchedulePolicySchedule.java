// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule;
import com.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule;
import com.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicySchedule {
    /**
     * @return The policy will execute every nth day at the specified time.
     * 
     */
    private List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules;
    /**
     * @return The policy will execute every nth hour starting at the specified time.
     * 
     */
    private List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules;
    /**
     * @return Allows specifying a snapshot time for each day of the week.
     * 
     */
    private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules;

    private GetResourcePolicySnapshotSchedulePolicySchedule() {}
    /**
     * @return The policy will execute every nth day at the specified time.
     * 
     */
    public List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules() {
        return this.dailySchedules;
    }
    /**
     * @return The policy will execute every nth hour starting at the specified time.
     * 
     */
    public List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules() {
        return this.hourlySchedules;
    }
    /**
     * @return Allows specifying a snapshot time for each day of the week.
     * 
     */
    public List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules() {
        return this.weeklySchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicySchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules;
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules;
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules;
        public Builder() {}
        public Builder(GetResourcePolicySnapshotSchedulePolicySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedules = defaults.dailySchedules;
    	      this.hourlySchedules = defaults.hourlySchedules;
    	      this.weeklySchedules = defaults.weeklySchedules;
        }

        @CustomType.Setter
        public Builder dailySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules) {
            if (dailySchedules == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicySnapshotSchedulePolicySchedule", "dailySchedules");
            }
            this.dailySchedules = dailySchedules;
            return this;
        }
        public Builder dailySchedules(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule... dailySchedules) {
            return dailySchedules(List.of(dailySchedules));
        }
        @CustomType.Setter
        public Builder hourlySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules) {
            if (hourlySchedules == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicySnapshotSchedulePolicySchedule", "hourlySchedules");
            }
            this.hourlySchedules = hourlySchedules;
            return this;
        }
        public Builder hourlySchedules(GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule... hourlySchedules) {
            return hourlySchedules(List.of(hourlySchedules));
        }
        @CustomType.Setter
        public Builder weeklySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules) {
            if (weeklySchedules == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicySnapshotSchedulePolicySchedule", "weeklySchedules");
            }
            this.weeklySchedules = weeklySchedules;
            return this;
        }
        public Builder weeklySchedules(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule... weeklySchedules) {
            return weeklySchedules(List.of(weeklySchedules));
        }
        public GetResourcePolicySnapshotSchedulePolicySchedule build() {
            final var _resultValue = new GetResourcePolicySnapshotSchedulePolicySchedule();
            _resultValue.dailySchedules = dailySchedules;
            _resultValue.hourlySchedules = hourlySchedules;
            _resultValue.weeklySchedules = weeklySchedules;
            return _resultValue;
        }
    }
}
