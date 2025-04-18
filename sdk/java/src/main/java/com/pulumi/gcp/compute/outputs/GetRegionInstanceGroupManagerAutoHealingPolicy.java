// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceGroupManagerAutoHealingPolicy {
    /**
     * @return The health check resource that signals autohealing.
     * 
     */
    private String healthCheck;
    /**
     * @return The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    private Integer initialDelaySec;

    private GetRegionInstanceGroupManagerAutoHealingPolicy() {}
    /**
     * @return The health check resource that signals autohealing.
     * 
     */
    public String healthCheck() {
        return this.healthCheck;
    }
    /**
     * @return The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    public Integer initialDelaySec() {
        return this.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupManagerAutoHealingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String healthCheck;
        private Integer initialDelaySec;
        public Builder() {}
        public Builder(GetRegionInstanceGroupManagerAutoHealingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        @CustomType.Setter
        public Builder healthCheck(String healthCheck) {
            if (healthCheck == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceGroupManagerAutoHealingPolicy", "healthCheck");
            }
            this.healthCheck = healthCheck;
            return this;
        }
        @CustomType.Setter
        public Builder initialDelaySec(Integer initialDelaySec) {
            if (initialDelaySec == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceGroupManagerAutoHealingPolicy", "initialDelaySec");
            }
            this.initialDelaySec = initialDelaySec;
            return this;
        }
        public GetRegionInstanceGroupManagerAutoHealingPolicy build() {
            final var _resultValue = new GetRegionInstanceGroupManagerAutoHealingPolicy();
            _resultValue.healthCheck = healthCheck;
            _resultValue.initialDelaySec = initialDelaySec;
            return _resultValue;
        }
    }
}
