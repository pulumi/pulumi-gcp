// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholds;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholds;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholds;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy {
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private String autoscalePolicyId;
    /**
     * @return Utilization thresholds pertaining to amount of consumed memory.
     * Structure is documented below.
     * 
     */
    private @Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholds consumedMemoryThresholds;
    /**
     * @return Utilization thresholds pertaining to CPU utilization.
     * Structure is documented below.
     * 
     */
    private @Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholds cpuThresholds;
    /**
     * @return The canonical identifier of the node type to add or remove.
     * 
     */
    private String nodeTypeId;
    /**
     * @return Number of nodes to add to a cluster during a scale-out operation.
     * Must be divisible by 2 for stretched clusters.
     * 
     */
    private Integer scaleOutSize;
    /**
     * @return Utilization thresholds pertaining to amount of consumed storage.
     * Structure is documented below.
     * 
     */
    private @Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholds storageThresholds;

    private PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy() {}
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String autoscalePolicyId() {
        return this.autoscalePolicyId;
    }
    /**
     * @return Utilization thresholds pertaining to amount of consumed memory.
     * Structure is documented below.
     * 
     */
    public Optional<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholds> consumedMemoryThresholds() {
        return Optional.ofNullable(this.consumedMemoryThresholds);
    }
    /**
     * @return Utilization thresholds pertaining to CPU utilization.
     * Structure is documented below.
     * 
     */
    public Optional<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholds> cpuThresholds() {
        return Optional.ofNullable(this.cpuThresholds);
    }
    /**
     * @return The canonical identifier of the node type to add or remove.
     * 
     */
    public String nodeTypeId() {
        return this.nodeTypeId;
    }
    /**
     * @return Number of nodes to add to a cluster during a scale-out operation.
     * Must be divisible by 2 for stretched clusters.
     * 
     */
    public Integer scaleOutSize() {
        return this.scaleOutSize;
    }
    /**
     * @return Utilization thresholds pertaining to amount of consumed storage.
     * Structure is documented below.
     * 
     */
    public Optional<PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholds> storageThresholds() {
        return Optional.ofNullable(this.storageThresholds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoscalePolicyId;
        private @Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholds consumedMemoryThresholds;
        private @Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholds cpuThresholds;
        private String nodeTypeId;
        private Integer scaleOutSize;
        private @Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholds storageThresholds;
        public Builder() {}
        public Builder(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalePolicyId = defaults.autoscalePolicyId;
    	      this.consumedMemoryThresholds = defaults.consumedMemoryThresholds;
    	      this.cpuThresholds = defaults.cpuThresholds;
    	      this.nodeTypeId = defaults.nodeTypeId;
    	      this.scaleOutSize = defaults.scaleOutSize;
    	      this.storageThresholds = defaults.storageThresholds;
        }

        @CustomType.Setter
        public Builder autoscalePolicyId(String autoscalePolicyId) {
            if (autoscalePolicyId == null) {
              throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy", "autoscalePolicyId");
            }
            this.autoscalePolicyId = autoscalePolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder consumedMemoryThresholds(@Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholds consumedMemoryThresholds) {

            this.consumedMemoryThresholds = consumedMemoryThresholds;
            return this;
        }
        @CustomType.Setter
        public Builder cpuThresholds(@Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholds cpuThresholds) {

            this.cpuThresholds = cpuThresholds;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeId(String nodeTypeId) {
            if (nodeTypeId == null) {
              throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy", "nodeTypeId");
            }
            this.nodeTypeId = nodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder scaleOutSize(Integer scaleOutSize) {
            if (scaleOutSize == null) {
              throw new MissingRequiredPropertyException("PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy", "scaleOutSize");
            }
            this.scaleOutSize = scaleOutSize;
            return this;
        }
        @CustomType.Setter
        public Builder storageThresholds(@Nullable PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholds storageThresholds) {

            this.storageThresholds = storageThresholds;
            return this;
        }
        public PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy build() {
            final var _resultValue = new PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicy();
            _resultValue.autoscalePolicyId = autoscalePolicyId;
            _resultValue.consumedMemoryThresholds = consumedMemoryThresholds;
            _resultValue.cpuThresholds = cpuThresholds;
            _resultValue.nodeTypeId = nodeTypeId;
            _resultValue.scaleOutSize = scaleOutSize;
            _resultValue.storageThresholds = storageThresholds;
            return _resultValue;
        }
    }
}
