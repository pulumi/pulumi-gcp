// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryPipelineSerialPipelineStageStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineSerialPipelineStageStrategyArgs Empty = new DeliveryPipelineSerialPipelineStageStrategyArgs();

    /**
     * Canary deployment strategy provides progressive percentage based deployments to a Target.
     * 
     */
    @Import(name="canary")
    private @Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryArgs> canary;

    /**
     * @return Canary deployment strategy provides progressive percentage based deployments to a Target.
     * 
     */
    public Optional<Output<DeliveryPipelineSerialPipelineStageStrategyCanaryArgs>> canary() {
        return Optional.ofNullable(this.canary);
    }

    /**
     * Standard deployment strategy executes a single deploy and allows verifying the deployment.
     * 
     */
    @Import(name="standard")
    private @Nullable Output<DeliveryPipelineSerialPipelineStageStrategyStandardArgs> standard;

    /**
     * @return Standard deployment strategy executes a single deploy and allows verifying the deployment.
     * 
     */
    public Optional<Output<DeliveryPipelineSerialPipelineStageStrategyStandardArgs>> standard() {
        return Optional.ofNullable(this.standard);
    }

    private DeliveryPipelineSerialPipelineStageStrategyArgs() {}

    private DeliveryPipelineSerialPipelineStageStrategyArgs(DeliveryPipelineSerialPipelineStageStrategyArgs $) {
        this.canary = $.canary;
        this.standard = $.standard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineSerialPipelineStageStrategyArgs $;

        public Builder() {
            $ = new DeliveryPipelineSerialPipelineStageStrategyArgs();
        }

        public Builder(DeliveryPipelineSerialPipelineStageStrategyArgs defaults) {
            $ = new DeliveryPipelineSerialPipelineStageStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canary Canary deployment strategy provides progressive percentage based deployments to a Target.
         * 
         * @return builder
         * 
         */
        public Builder canary(@Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryArgs> canary) {
            $.canary = canary;
            return this;
        }

        /**
         * @param canary Canary deployment strategy provides progressive percentage based deployments to a Target.
         * 
         * @return builder
         * 
         */
        public Builder canary(DeliveryPipelineSerialPipelineStageStrategyCanaryArgs canary) {
            return canary(Output.of(canary));
        }

        /**
         * @param standard Standard deployment strategy executes a single deploy and allows verifying the deployment.
         * 
         * @return builder
         * 
         */
        public Builder standard(@Nullable Output<DeliveryPipelineSerialPipelineStageStrategyStandardArgs> standard) {
            $.standard = standard;
            return this;
        }

        /**
         * @param standard Standard deployment strategy executes a single deploy and allows verifying the deployment.
         * 
         * @return builder
         * 
         */
        public Builder standard(DeliveryPipelineSerialPipelineStageStrategyStandardArgs standard) {
            return standard(Output.of(standard));
        }

        public DeliveryPipelineSerialPipelineStageStrategyArgs build() {
            return $;
        }
    }

}
