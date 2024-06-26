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


public final class DeliveryPipelineConditionTargetsPresentConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineConditionTargetsPresentConditionArgs Empty = new DeliveryPipelineConditionTargetsPresentConditionArgs();

    /**
     * The list of Target names that are missing. For example, projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * 
     */
    @Import(name="missingTargets")
    private @Nullable Output<List<String>> missingTargets;

    /**
     * @return The list of Target names that are missing. For example, projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * 
     */
    public Optional<Output<List<String>>> missingTargets() {
        return Optional.ofNullable(this.missingTargets);
    }

    /**
     * True if there aren&#39;t any missing Targets.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Boolean> status;

    /**
     * @return True if there aren&#39;t any missing Targets.
     * 
     */
    public Optional<Output<Boolean>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Output only. Most recent time at which the pipeline was updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. Most recent time at which the pipeline was updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private DeliveryPipelineConditionTargetsPresentConditionArgs() {}

    private DeliveryPipelineConditionTargetsPresentConditionArgs(DeliveryPipelineConditionTargetsPresentConditionArgs $) {
        this.missingTargets = $.missingTargets;
        this.status = $.status;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineConditionTargetsPresentConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineConditionTargetsPresentConditionArgs $;

        public Builder() {
            $ = new DeliveryPipelineConditionTargetsPresentConditionArgs();
        }

        public Builder(DeliveryPipelineConditionTargetsPresentConditionArgs defaults) {
            $ = new DeliveryPipelineConditionTargetsPresentConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param missingTargets The list of Target names that are missing. For example, projects/{project_id}/locations/{location_name}/targets/{target_name}.
         * 
         * @return builder
         * 
         */
        public Builder missingTargets(@Nullable Output<List<String>> missingTargets) {
            $.missingTargets = missingTargets;
            return this;
        }

        /**
         * @param missingTargets The list of Target names that are missing. For example, projects/{project_id}/locations/{location_name}/targets/{target_name}.
         * 
         * @return builder
         * 
         */
        public Builder missingTargets(List<String> missingTargets) {
            return missingTargets(Output.of(missingTargets));
        }

        /**
         * @param missingTargets The list of Target names that are missing. For example, projects/{project_id}/locations/{location_name}/targets/{target_name}.
         * 
         * @return builder
         * 
         */
        public Builder missingTargets(String... missingTargets) {
            return missingTargets(List.of(missingTargets));
        }

        /**
         * @param status True if there aren&#39;t any missing Targets.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Boolean> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status True if there aren&#39;t any missing Targets.
         * 
         * @return builder
         * 
         */
        public Builder status(Boolean status) {
            return status(Output.of(status));
        }

        /**
         * @param updateTime Output only. Most recent time at which the pipeline was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. Most recent time at which the pipeline was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public DeliveryPipelineConditionTargetsPresentConditionArgs build() {
            return $;
        }
    }

}
