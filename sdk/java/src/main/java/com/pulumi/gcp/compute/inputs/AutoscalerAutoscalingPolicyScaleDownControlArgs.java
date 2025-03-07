// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScaleDownControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScaleDownControlArgs Empty = new AutoscalerAutoscalingPolicyScaleDownControlArgs();

    /**
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    @Import(name="maxScaledDownReplicas")
    private @Nullable Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas;

    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs>> maxScaledDownReplicas() {
        return Optional.ofNullable(this.maxScaledDownReplicas);
    }

    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    @Import(name="timeWindowSec")
    private @Nullable Output<Integer> timeWindowSec;

    /**
     * @return How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    public Optional<Output<Integer>> timeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    private AutoscalerAutoscalingPolicyScaleDownControlArgs() {}

    private AutoscalerAutoscalingPolicyScaleDownControlArgs(AutoscalerAutoscalingPolicyScaleDownControlArgs $) {
        this.maxScaledDownReplicas = $.maxScaledDownReplicas;
        this.timeWindowSec = $.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalerAutoscalingPolicyScaleDownControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalerAutoscalingPolicyScaleDownControlArgs $;

        public Builder() {
            $ = new AutoscalerAutoscalingPolicyScaleDownControlArgs();
        }

        public Builder(AutoscalerAutoscalingPolicyScaleDownControlArgs defaults) {
            $ = new AutoscalerAutoscalingPolicyScaleDownControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxScaledDownReplicas A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxScaledDownReplicas(@Nullable Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas) {
            $.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }

        /**
         * @param maxScaledDownReplicas A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxScaledDownReplicas(AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs maxScaledDownReplicas) {
            return maxScaledDownReplicas(Output.of(maxScaledDownReplicas));
        }

        /**
         * @param timeWindowSec How long back autoscaling should look when computing recommendations
         * to include directives regarding slower scale down, as described above.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSec(@Nullable Output<Integer> timeWindowSec) {
            $.timeWindowSec = timeWindowSec;
            return this;
        }

        /**
         * @param timeWindowSec How long back autoscaling should look when computing recommendations
         * to include directives regarding slower scale down, as described above.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSec(Integer timeWindowSec) {
            return timeWindowSec(Output.of(timeWindowSec));
        }

        public AutoscalerAutoscalingPolicyScaleDownControlArgs build() {
            return $;
        }
    }

}
