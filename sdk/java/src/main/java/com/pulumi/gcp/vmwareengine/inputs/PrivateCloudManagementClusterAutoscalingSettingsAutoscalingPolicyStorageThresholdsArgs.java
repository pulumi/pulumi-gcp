// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs Empty = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs();

    /**
     * The utilization triggering the scale-in operation in percent.
     * 
     */
    @Import(name="scaleIn", required=true)
    private Output<Integer> scaleIn;

    /**
     * @return The utilization triggering the scale-in operation in percent.
     * 
     */
    public Output<Integer> scaleIn() {
        return this.scaleIn;
    }

    /**
     * The utilization triggering the scale-out operation in percent.
     * 
     */
    @Import(name="scaleOut", required=true)
    private Output<Integer> scaleOut;

    /**
     * @return The utilization triggering the scale-out operation in percent.
     * 
     */
    public Output<Integer> scaleOut() {
        return this.scaleOut;
    }

    private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs() {}

    private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs $) {
        this.scaleIn = $.scaleIn;
        this.scaleOut = $.scaleOut;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs $;

        public Builder() {
            $ = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs();
        }

        public Builder(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs defaults) {
            $ = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scaleIn The utilization triggering the scale-in operation in percent.
         * 
         * @return builder
         * 
         */
        public Builder scaleIn(Output<Integer> scaleIn) {
            $.scaleIn = scaleIn;
            return this;
        }

        /**
         * @param scaleIn The utilization triggering the scale-in operation in percent.
         * 
         * @return builder
         * 
         */
        public Builder scaleIn(Integer scaleIn) {
            return scaleIn(Output.of(scaleIn));
        }

        /**
         * @param scaleOut The utilization triggering the scale-out operation in percent.
         * 
         * @return builder
         * 
         */
        public Builder scaleOut(Output<Integer> scaleOut) {
            $.scaleOut = scaleOut;
            return this;
        }

        /**
         * @param scaleOut The utilization triggering the scale-out operation in percent.
         * 
         * @return builder
         * 
         */
        public Builder scaleOut(Integer scaleOut) {
            return scaleOut(Output.of(scaleOut));
        }

        public PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs build() {
            if ($.scaleIn == null) {
                throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs", "scaleIn");
            }
            if ($.scaleOut == null) {
                throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs", "scaleOut");
            }
            return $;
        }
    }

}
