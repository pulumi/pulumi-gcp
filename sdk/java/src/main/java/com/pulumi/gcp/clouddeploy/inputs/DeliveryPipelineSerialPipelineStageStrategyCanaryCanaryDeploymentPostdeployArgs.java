// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs Empty = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs();

    /**
     * Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<String>> actions;

    /**
     * @return Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
     * 
     */
    public Optional<Output<List<String>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs() {}

    private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs $) {
        this.actions = $.actions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs $;

        public Builder() {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs();
        }

        public Builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs defaults) {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs build() {
            return $;
        }
    }

}