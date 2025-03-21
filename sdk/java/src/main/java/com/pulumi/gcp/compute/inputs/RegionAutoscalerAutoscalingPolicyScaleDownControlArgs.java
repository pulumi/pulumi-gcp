// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionAutoscalerAutoscalingPolicyScaleDownControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyScaleDownControlArgs Empty = new RegionAutoscalerAutoscalingPolicyScaleDownControlArgs();

    /**
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    @Import(name="maxScaledDownReplicas")
    private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas;

    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs>> maxScaledDownReplicas() {
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

    private RegionAutoscalerAutoscalingPolicyScaleDownControlArgs() {}

    private RegionAutoscalerAutoscalingPolicyScaleDownControlArgs(RegionAutoscalerAutoscalingPolicyScaleDownControlArgs $) {
        this.maxScaledDownReplicas = $.maxScaledDownReplicas;
        this.timeWindowSec = $.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionAutoscalerAutoscalingPolicyScaleDownControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionAutoscalerAutoscalingPolicyScaleDownControlArgs $;

        public Builder() {
            $ = new RegionAutoscalerAutoscalingPolicyScaleDownControlArgs();
        }

        public Builder(RegionAutoscalerAutoscalingPolicyScaleDownControlArgs defaults) {
            $ = new RegionAutoscalerAutoscalingPolicyScaleDownControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxScaledDownReplicas A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maxScaledDownReplicas(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas) {
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
        public Builder maxScaledDownReplicas(RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs maxScaledDownReplicas) {
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

        public RegionAutoscalerAutoscalingPolicyScaleDownControlArgs build() {
            return $;
        }
    }

}
