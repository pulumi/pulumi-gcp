// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.alloydb.outputs.ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTime;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterMaintenanceUpdatePolicyMaintenanceWindow {
    /**
     * @return Preferred day of the week for maintenance, e.g. MONDAY, TUESDAY, etc.
     * Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
     * 
     */
    private String day;
    /**
     * @return Preferred time to start the maintenance operation on the specified day. Maintenance will start within 1 hour of this time.
     * Structure is documented below.
     * 
     */
    private ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTime startTime;

    private ClusterMaintenanceUpdatePolicyMaintenanceWindow() {}
    /**
     * @return Preferred day of the week for maintenance, e.g. MONDAY, TUESDAY, etc.
     * Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return Preferred time to start the maintenance operation on the specified day. Maintenance will start within 1 hour of this time.
     * Structure is documented below.
     * 
     */
    public ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTime startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenanceUpdatePolicyMaintenanceWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String day;
        private ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTime startTime;
        public Builder() {}
        public Builder(ClusterMaintenanceUpdatePolicyMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder day(String day) {
            if (day == null) {
              throw new MissingRequiredPropertyException("ClusterMaintenanceUpdatePolicyMaintenanceWindow", "day");
            }
            this.day = day;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(ClusterMaintenanceUpdatePolicyMaintenanceWindowStartTime startTime) {
            if (startTime == null) {
              throw new MissingRequiredPropertyException("ClusterMaintenanceUpdatePolicyMaintenanceWindow", "startTime");
            }
            this.startTime = startTime;
            return this;
        }
        public ClusterMaintenanceUpdatePolicyMaintenanceWindow build() {
            final var _resultValue = new ClusterMaintenanceUpdatePolicyMaintenanceWindow();
            _resultValue.day = day;
            _resultValue.startTime = startTime;
            return _resultValue;
        }
    }
}
