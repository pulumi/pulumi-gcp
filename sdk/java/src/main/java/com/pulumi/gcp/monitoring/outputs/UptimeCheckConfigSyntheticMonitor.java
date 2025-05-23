// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigSyntheticMonitorCloudFunctionV2;
import java.util.Objects;

@CustomType
public final class UptimeCheckConfigSyntheticMonitor {
    /**
     * @return Target a Synthetic Monitor GCFv2 Instance
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_synthetic_monitor_cloud_function_v2&#34;&gt;&lt;/a&gt;The `cloud_function_v2` block supports:
     * 
     */
    private UptimeCheckConfigSyntheticMonitorCloudFunctionV2 cloudFunctionV2;

    private UptimeCheckConfigSyntheticMonitor() {}
    /**
     * @return Target a Synthetic Monitor GCFv2 Instance
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_synthetic_monitor_cloud_function_v2&#34;&gt;&lt;/a&gt;The `cloud_function_v2` block supports:
     * 
     */
    public UptimeCheckConfigSyntheticMonitorCloudFunctionV2 cloudFunctionV2() {
        return this.cloudFunctionV2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigSyntheticMonitor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private UptimeCheckConfigSyntheticMonitorCloudFunctionV2 cloudFunctionV2;
        public Builder() {}
        public Builder(UptimeCheckConfigSyntheticMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunctionV2 = defaults.cloudFunctionV2;
        }

        @CustomType.Setter
        public Builder cloudFunctionV2(UptimeCheckConfigSyntheticMonitorCloudFunctionV2 cloudFunctionV2) {
            if (cloudFunctionV2 == null) {
              throw new MissingRequiredPropertyException("UptimeCheckConfigSyntheticMonitor", "cloudFunctionV2");
            }
            this.cloudFunctionV2 = cloudFunctionV2;
            return this;
        }
        public UptimeCheckConfigSyntheticMonitor build() {
            final var _resultValue = new UptimeCheckConfigSyntheticMonitor();
            _resultValue.cloudFunctionV2 = cloudFunctionV2;
            return _resultValue;
        }
    }
}
