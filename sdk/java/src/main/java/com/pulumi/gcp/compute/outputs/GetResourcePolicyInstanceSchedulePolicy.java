// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetResourcePolicyInstanceSchedulePolicyVmStartSchedule;
import com.pulumi.gcp.compute.outputs.GetResourcePolicyInstanceSchedulePolicyVmStopSchedule;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourcePolicyInstanceSchedulePolicy {
    private final String expirationTime;
    private final String startTime;
    private final String timeZone;
    private final List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules;
    private final List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules;

    @CustomType.Constructor
    private GetResourcePolicyInstanceSchedulePolicy(
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("timeZone") String timeZone,
        @CustomType.Parameter("vmStartSchedules") List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules,
        @CustomType.Parameter("vmStopSchedules") List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules) {
        this.expirationTime = expirationTime;
        this.startTime = startTime;
        this.timeZone = timeZone;
        this.vmStartSchedules = vmStartSchedules;
        this.vmStopSchedules = vmStopSchedules;
    }

    public String expirationTime() {
        return this.expirationTime;
    }
    public String startTime() {
        return this.startTime;
    }
    public String timeZone() {
        return this.timeZone;
    }
    public List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules() {
        return this.vmStartSchedules;
    }
    public List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules() {
        return this.vmStopSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyInstanceSchedulePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String startTime;
        private String timeZone;
        private List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules;
        private List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyInstanceSchedulePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.vmStartSchedules = defaults.vmStartSchedules;
    	      this.vmStopSchedules = defaults.vmStopSchedules;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder vmStartSchedules(List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules) {
            this.vmStartSchedules = Objects.requireNonNull(vmStartSchedules);
            return this;
        }
        public Builder vmStartSchedules(GetResourcePolicyInstanceSchedulePolicyVmStartSchedule... vmStartSchedules) {
            return vmStartSchedules(List.of(vmStartSchedules));
        }
        public Builder vmStopSchedules(List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules) {
            this.vmStopSchedules = Objects.requireNonNull(vmStopSchedules);
            return this;
        }
        public Builder vmStopSchedules(GetResourcePolicyInstanceSchedulePolicyVmStopSchedule... vmStopSchedules) {
            return vmStopSchedules(List.of(vmStopSchedules));
        }        public GetResourcePolicyInstanceSchedulePolicy build() {
            return new GetResourcePolicyInstanceSchedulePolicy(expirationTime, startTime, timeZone, vmStartSchedules, vmStopSchedules);
        }
    }
}