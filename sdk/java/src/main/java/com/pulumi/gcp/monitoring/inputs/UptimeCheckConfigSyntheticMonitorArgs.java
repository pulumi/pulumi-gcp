// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args;
import java.util.Objects;


public final class UptimeCheckConfigSyntheticMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigSyntheticMonitorArgs Empty = new UptimeCheckConfigSyntheticMonitorArgs();

    /**
     * Target a Synthetic Monitor GCFv2 Instance
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_cloud_function_v2&#34;&gt;&lt;/a&gt;The `cloud_function_v2` block supports:
     * 
     */
    @Import(name="cloudFunctionV2", required=true)
    private Output<UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args> cloudFunctionV2;

    /**
     * @return Target a Synthetic Monitor GCFv2 Instance
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_cloud_function_v2&#34;&gt;&lt;/a&gt;The `cloud_function_v2` block supports:
     * 
     */
    public Output<UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args> cloudFunctionV2() {
        return this.cloudFunctionV2;
    }

    private UptimeCheckConfigSyntheticMonitorArgs() {}

    private UptimeCheckConfigSyntheticMonitorArgs(UptimeCheckConfigSyntheticMonitorArgs $) {
        this.cloudFunctionV2 = $.cloudFunctionV2;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigSyntheticMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigSyntheticMonitorArgs $;

        public Builder() {
            $ = new UptimeCheckConfigSyntheticMonitorArgs();
        }

        public Builder(UptimeCheckConfigSyntheticMonitorArgs defaults) {
            $ = new UptimeCheckConfigSyntheticMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudFunctionV2 Target a Synthetic Monitor GCFv2 Instance
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_cloud_function_v2&#34;&gt;&lt;/a&gt;The `cloud_function_v2` block supports:
         * 
         * @return builder
         * 
         */
        public Builder cloudFunctionV2(Output<UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args> cloudFunctionV2) {
            $.cloudFunctionV2 = cloudFunctionV2;
            return this;
        }

        /**
         * @param cloudFunctionV2 Target a Synthetic Monitor GCFv2 Instance
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_cloud_function_v2&#34;&gt;&lt;/a&gt;The `cloud_function_v2` block supports:
         * 
         * @return builder
         * 
         */
        public Builder cloudFunctionV2(UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args cloudFunctionV2) {
            return cloudFunctionV2(Output.of(cloudFunctionV2));
        }

        public UptimeCheckConfigSyntheticMonitorArgs build() {
            $.cloudFunctionV2 = Objects.requireNonNull($.cloudFunctionV2, "expected parameter 'cloudFunctionV2' to be non-null");
            return $;
        }
    }

}