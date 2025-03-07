// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePolicyInstanceSchedulePolicyVmStartSchedule {
    /**
     * @return Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    private String schedule;

    private GetResourcePolicyInstanceSchedulePolicyVmStartSchedule() {}
    /**
     * @return Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    public String schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyInstanceSchedulePolicyVmStartSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String schedule;
        public Builder() {}
        public Builder(GetResourcePolicyInstanceSchedulePolicyVmStartSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder schedule(String schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicyInstanceSchedulePolicyVmStartSchedule", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        public GetResourcePolicyInstanceSchedulePolicyVmStartSchedule build() {
            final var _resultValue = new GetResourcePolicyInstanceSchedulePolicyVmStartSchedule();
            _resultValue.schedule = schedule;
            return _resultValue;
        }
    }
}
