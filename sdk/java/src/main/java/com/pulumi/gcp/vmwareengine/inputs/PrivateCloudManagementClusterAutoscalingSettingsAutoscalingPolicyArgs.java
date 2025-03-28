// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs;
import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs;
import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs Empty = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="autoscalePolicyId", required=true)
    private Output<String> autoscalePolicyId;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> autoscalePolicyId() {
        return this.autoscalePolicyId;
    }

    /**
     * Utilization thresholds pertaining to amount of consumed memory.
     * Structure is documented below.
     * 
     */
    @Import(name="consumedMemoryThresholds")
    private @Nullable Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs> consumedMemoryThresholds;

    /**
     * @return Utilization thresholds pertaining to amount of consumed memory.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs>> consumedMemoryThresholds() {
        return Optional.ofNullable(this.consumedMemoryThresholds);
    }

    /**
     * Utilization thresholds pertaining to CPU utilization.
     * Structure is documented below.
     * 
     */
    @Import(name="cpuThresholds")
    private @Nullable Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs> cpuThresholds;

    /**
     * @return Utilization thresholds pertaining to CPU utilization.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs>> cpuThresholds() {
        return Optional.ofNullable(this.cpuThresholds);
    }

    /**
     * The canonical identifier of the node type to add or remove.
     * 
     */
    @Import(name="nodeTypeId", required=true)
    private Output<String> nodeTypeId;

    /**
     * @return The canonical identifier of the node type to add or remove.
     * 
     */
    public Output<String> nodeTypeId() {
        return this.nodeTypeId;
    }

    /**
     * Number of nodes to add to a cluster during a scale-out operation.
     * Must be divisible by 2 for stretched clusters.
     * 
     */
    @Import(name="scaleOutSize", required=true)
    private Output<Integer> scaleOutSize;

    /**
     * @return Number of nodes to add to a cluster during a scale-out operation.
     * Must be divisible by 2 for stretched clusters.
     * 
     */
    public Output<Integer> scaleOutSize() {
        return this.scaleOutSize;
    }

    /**
     * Utilization thresholds pertaining to amount of consumed storage.
     * Structure is documented below.
     * 
     */
    @Import(name="storageThresholds")
    private @Nullable Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs> storageThresholds;

    /**
     * @return Utilization thresholds pertaining to amount of consumed storage.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs>> storageThresholds() {
        return Optional.ofNullable(this.storageThresholds);
    }

    private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs() {}

    private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs $) {
        this.autoscalePolicyId = $.autoscalePolicyId;
        this.consumedMemoryThresholds = $.consumedMemoryThresholds;
        this.cpuThresholds = $.cpuThresholds;
        this.nodeTypeId = $.nodeTypeId;
        this.scaleOutSize = $.scaleOutSize;
        this.storageThresholds = $.storageThresholds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs $;

        public Builder() {
            $ = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs();
        }

        public Builder(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs defaults) {
            $ = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalePolicyId The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder autoscalePolicyId(Output<String> autoscalePolicyId) {
            $.autoscalePolicyId = autoscalePolicyId;
            return this;
        }

        /**
         * @param autoscalePolicyId The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder autoscalePolicyId(String autoscalePolicyId) {
            return autoscalePolicyId(Output.of(autoscalePolicyId));
        }

        /**
         * @param consumedMemoryThresholds Utilization thresholds pertaining to amount of consumed memory.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder consumedMemoryThresholds(@Nullable Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs> consumedMemoryThresholds) {
            $.consumedMemoryThresholds = consumedMemoryThresholds;
            return this;
        }

        /**
         * @param consumedMemoryThresholds Utilization thresholds pertaining to amount of consumed memory.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder consumedMemoryThresholds(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs consumedMemoryThresholds) {
            return consumedMemoryThresholds(Output.of(consumedMemoryThresholds));
        }

        /**
         * @param cpuThresholds Utilization thresholds pertaining to CPU utilization.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cpuThresholds(@Nullable Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs> cpuThresholds) {
            $.cpuThresholds = cpuThresholds;
            return this;
        }

        /**
         * @param cpuThresholds Utilization thresholds pertaining to CPU utilization.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cpuThresholds(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs cpuThresholds) {
            return cpuThresholds(Output.of(cpuThresholds));
        }

        /**
         * @param nodeTypeId The canonical identifier of the node type to add or remove.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeId(Output<String> nodeTypeId) {
            $.nodeTypeId = nodeTypeId;
            return this;
        }

        /**
         * @param nodeTypeId The canonical identifier of the node type to add or remove.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeId(String nodeTypeId) {
            return nodeTypeId(Output.of(nodeTypeId));
        }

        /**
         * @param scaleOutSize Number of nodes to add to a cluster during a scale-out operation.
         * Must be divisible by 2 for stretched clusters.
         * 
         * @return builder
         * 
         */
        public Builder scaleOutSize(Output<Integer> scaleOutSize) {
            $.scaleOutSize = scaleOutSize;
            return this;
        }

        /**
         * @param scaleOutSize Number of nodes to add to a cluster during a scale-out operation.
         * Must be divisible by 2 for stretched clusters.
         * 
         * @return builder
         * 
         */
        public Builder scaleOutSize(Integer scaleOutSize) {
            return scaleOutSize(Output.of(scaleOutSize));
        }

        /**
         * @param storageThresholds Utilization thresholds pertaining to amount of consumed storage.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageThresholds(@Nullable Output<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs> storageThresholds) {
            $.storageThresholds = storageThresholds;
            return this;
        }

        /**
         * @param storageThresholds Utilization thresholds pertaining to amount of consumed storage.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageThresholds(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs storageThresholds) {
            return storageThresholds(Output.of(storageThresholds));
        }

        public PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs build() {
            if ($.autoscalePolicyId == null) {
                throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs", "autoscalePolicyId");
            }
            if ($.nodeTypeId == null) {
                throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs", "nodeTypeId");
            }
            if ($.scaleOutSize == null) {
                throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs", "scaleOutSize");
            }
            return $;
        }
    }

}
