// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionPipelineReadyConditionArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionTargetsPresentConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryPipelineConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineConditionArgs Empty = new DeliveryPipelineConditionArgs();

    @Import(name="pipelineReadyConditions")
    private @Nullable Output<List<DeliveryPipelineConditionPipelineReadyConditionArgs>> pipelineReadyConditions;

    public Optional<Output<List<DeliveryPipelineConditionPipelineReadyConditionArgs>>> pipelineReadyConditions() {
        return Optional.ofNullable(this.pipelineReadyConditions);
    }

    @Import(name="targetsPresentConditions")
    private @Nullable Output<List<DeliveryPipelineConditionTargetsPresentConditionArgs>> targetsPresentConditions;

    public Optional<Output<List<DeliveryPipelineConditionTargetsPresentConditionArgs>>> targetsPresentConditions() {
        return Optional.ofNullable(this.targetsPresentConditions);
    }

    private DeliveryPipelineConditionArgs() {}

    private DeliveryPipelineConditionArgs(DeliveryPipelineConditionArgs $) {
        this.pipelineReadyConditions = $.pipelineReadyConditions;
        this.targetsPresentConditions = $.targetsPresentConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineConditionArgs $;

        public Builder() {
            $ = new DeliveryPipelineConditionArgs();
        }

        public Builder(DeliveryPipelineConditionArgs defaults) {
            $ = new DeliveryPipelineConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder pipelineReadyConditions(@Nullable Output<List<DeliveryPipelineConditionPipelineReadyConditionArgs>> pipelineReadyConditions) {
            $.pipelineReadyConditions = pipelineReadyConditions;
            return this;
        }

        public Builder pipelineReadyConditions(List<DeliveryPipelineConditionPipelineReadyConditionArgs> pipelineReadyConditions) {
            return pipelineReadyConditions(Output.of(pipelineReadyConditions));
        }

        public Builder pipelineReadyConditions(DeliveryPipelineConditionPipelineReadyConditionArgs... pipelineReadyConditions) {
            return pipelineReadyConditions(List.of(pipelineReadyConditions));
        }

        public Builder targetsPresentConditions(@Nullable Output<List<DeliveryPipelineConditionTargetsPresentConditionArgs>> targetsPresentConditions) {
            $.targetsPresentConditions = targetsPresentConditions;
            return this;
        }

        public Builder targetsPresentConditions(List<DeliveryPipelineConditionTargetsPresentConditionArgs> targetsPresentConditions) {
            return targetsPresentConditions(Output.of(targetsPresentConditions));
        }

        public Builder targetsPresentConditions(DeliveryPipelineConditionTargetsPresentConditionArgs... targetsPresentConditions) {
            return targetsPresentConditions(List.of(targetsPresentConditions));
        }

        public DeliveryPipelineConditionArgs build() {
            return $;
        }
    }

}