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


public final class DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs Empty = new DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs();

    /**
     * Optional. A sequence of skaffold custom actions to invoke during execution of the predeploy job.
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<String>> actions;

    /**
     * @return Optional. A sequence of skaffold custom actions to invoke during execution of the predeploy job.
     * 
     */
    public Optional<Output<List<String>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    private DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs() {}

    private DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs(DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs $) {
        this.actions = $.actions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs $;

        public Builder() {
            $ = new DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs();
        }

        public Builder(DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs defaults) {
            $ = new DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Optional. A sequence of skaffold custom actions to invoke during execution of the predeploy job.
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Optional. A sequence of skaffold custom actions to invoke during execution of the predeploy job.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions Optional. A sequence of skaffold custom actions to invoke during execution of the predeploy job.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs build() {
            return $;
        }
    }

}
