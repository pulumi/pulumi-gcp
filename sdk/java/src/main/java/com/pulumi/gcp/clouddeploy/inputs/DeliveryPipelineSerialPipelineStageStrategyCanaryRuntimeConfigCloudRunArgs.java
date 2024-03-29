// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs Empty = new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs();

    /**
     * Whether Cloud Deploy should update the traffic stanza in a Cloud Run Service on the user&#39;s behalf to facilitate traffic splitting. This is required to be true for CanaryDeployments, but optional for CustomCanaryDeployments.
     * 
     */
    @Import(name="automaticTrafficControl")
    private @Nullable Output<Boolean> automaticTrafficControl;

    /**
     * @return Whether Cloud Deploy should update the traffic stanza in a Cloud Run Service on the user&#39;s behalf to facilitate traffic splitting. This is required to be true for CanaryDeployments, but optional for CustomCanaryDeployments.
     * 
     */
    public Optional<Output<Boolean>> automaticTrafficControl() {
        return Optional.ofNullable(this.automaticTrafficControl);
    }

    /**
     * Optional. A list of tags that are added to the canary revision while the canary phase is in progress.
     * 
     */
    @Import(name="canaryRevisionTags")
    private @Nullable Output<List<String>> canaryRevisionTags;

    /**
     * @return Optional. A list of tags that are added to the canary revision while the canary phase is in progress.
     * 
     */
    public Optional<Output<List<String>>> canaryRevisionTags() {
        return Optional.ofNullable(this.canaryRevisionTags);
    }

    /**
     * Optional. A list of tags that are added to the prior revision while the canary phase is in progress.
     * 
     */
    @Import(name="priorRevisionTags")
    private @Nullable Output<List<String>> priorRevisionTags;

    /**
     * @return Optional. A list of tags that are added to the prior revision while the canary phase is in progress.
     * 
     */
    public Optional<Output<List<String>>> priorRevisionTags() {
        return Optional.ofNullable(this.priorRevisionTags);
    }

    /**
     * Optional. A list of tags that are added to the final stable revision when the stable phase is applied.
     * 
     */
    @Import(name="stableRevisionTags")
    private @Nullable Output<List<String>> stableRevisionTags;

    /**
     * @return Optional. A list of tags that are added to the final stable revision when the stable phase is applied.
     * 
     */
    public Optional<Output<List<String>>> stableRevisionTags() {
        return Optional.ofNullable(this.stableRevisionTags);
    }

    private DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs() {}

    private DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs $) {
        this.automaticTrafficControl = $.automaticTrafficControl;
        this.canaryRevisionTags = $.canaryRevisionTags;
        this.priorRevisionTags = $.priorRevisionTags;
        this.stableRevisionTags = $.stableRevisionTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs $;

        public Builder() {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs();
        }

        public Builder(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs defaults) {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automaticTrafficControl Whether Cloud Deploy should update the traffic stanza in a Cloud Run Service on the user&#39;s behalf to facilitate traffic splitting. This is required to be true for CanaryDeployments, but optional for CustomCanaryDeployments.
         * 
         * @return builder
         * 
         */
        public Builder automaticTrafficControl(@Nullable Output<Boolean> automaticTrafficControl) {
            $.automaticTrafficControl = automaticTrafficControl;
            return this;
        }

        /**
         * @param automaticTrafficControl Whether Cloud Deploy should update the traffic stanza in a Cloud Run Service on the user&#39;s behalf to facilitate traffic splitting. This is required to be true for CanaryDeployments, but optional for CustomCanaryDeployments.
         * 
         * @return builder
         * 
         */
        public Builder automaticTrafficControl(Boolean automaticTrafficControl) {
            return automaticTrafficControl(Output.of(automaticTrafficControl));
        }

        /**
         * @param canaryRevisionTags Optional. A list of tags that are added to the canary revision while the canary phase is in progress.
         * 
         * @return builder
         * 
         */
        public Builder canaryRevisionTags(@Nullable Output<List<String>> canaryRevisionTags) {
            $.canaryRevisionTags = canaryRevisionTags;
            return this;
        }

        /**
         * @param canaryRevisionTags Optional. A list of tags that are added to the canary revision while the canary phase is in progress.
         * 
         * @return builder
         * 
         */
        public Builder canaryRevisionTags(List<String> canaryRevisionTags) {
            return canaryRevisionTags(Output.of(canaryRevisionTags));
        }

        /**
         * @param canaryRevisionTags Optional. A list of tags that are added to the canary revision while the canary phase is in progress.
         * 
         * @return builder
         * 
         */
        public Builder canaryRevisionTags(String... canaryRevisionTags) {
            return canaryRevisionTags(List.of(canaryRevisionTags));
        }

        /**
         * @param priorRevisionTags Optional. A list of tags that are added to the prior revision while the canary phase is in progress.
         * 
         * @return builder
         * 
         */
        public Builder priorRevisionTags(@Nullable Output<List<String>> priorRevisionTags) {
            $.priorRevisionTags = priorRevisionTags;
            return this;
        }

        /**
         * @param priorRevisionTags Optional. A list of tags that are added to the prior revision while the canary phase is in progress.
         * 
         * @return builder
         * 
         */
        public Builder priorRevisionTags(List<String> priorRevisionTags) {
            return priorRevisionTags(Output.of(priorRevisionTags));
        }

        /**
         * @param priorRevisionTags Optional. A list of tags that are added to the prior revision while the canary phase is in progress.
         * 
         * @return builder
         * 
         */
        public Builder priorRevisionTags(String... priorRevisionTags) {
            return priorRevisionTags(List.of(priorRevisionTags));
        }

        /**
         * @param stableRevisionTags Optional. A list of tags that are added to the final stable revision when the stable phase is applied.
         * 
         * @return builder
         * 
         */
        public Builder stableRevisionTags(@Nullable Output<List<String>> stableRevisionTags) {
            $.stableRevisionTags = stableRevisionTags;
            return this;
        }

        /**
         * @param stableRevisionTags Optional. A list of tags that are added to the final stable revision when the stable phase is applied.
         * 
         * @return builder
         * 
         */
        public Builder stableRevisionTags(List<String> stableRevisionTags) {
            return stableRevisionTags(Output.of(stableRevisionTags));
        }

        /**
         * @param stableRevisionTags Optional. A list of tags that are added to the final stable revision when the stable phase is applied.
         * 
         * @return builder
         * 
         */
        public Builder stableRevisionTags(String... stableRevisionTags) {
            return stableRevisionTags(List.of(stableRevisionTags));
        }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs build() {
            return $;
        }
    }

}
