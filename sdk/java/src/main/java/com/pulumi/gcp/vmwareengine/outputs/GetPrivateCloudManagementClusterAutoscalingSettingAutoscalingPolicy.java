// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyConsumedMemoryThreshold;
import com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyCpuThreshold;
import com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyStorageThreshold;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy {
    private String autoscalePolicyId;
    /**
     * @return Utilization thresholds pertaining to amount of consumed memory.
     * 
     */
    private List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyConsumedMemoryThreshold> consumedMemoryThresholds;
    /**
     * @return Utilization thresholds pertaining to CPU utilization.
     * 
     */
    private List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyCpuThreshold> cpuThresholds;
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
     * 
     */
    private List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyStorageThreshold> storageThresholds;

    private GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy() {}
    public String autoscalePolicyId() {
        return this.autoscalePolicyId;
    }
    /**
     * @return Utilization thresholds pertaining to amount of consumed memory.
     * 
     */
    public List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyConsumedMemoryThreshold> consumedMemoryThresholds() {
        return this.consumedMemoryThresholds;
    }
    /**
     * @return Utilization thresholds pertaining to CPU utilization.
     * 
     */
    public List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyCpuThreshold> cpuThresholds() {
        return this.cpuThresholds;
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
     * 
     */
    public List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyStorageThreshold> storageThresholds() {
        return this.storageThresholds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoscalePolicyId;
        private List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyConsumedMemoryThreshold> consumedMemoryThresholds;
        private List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyCpuThreshold> cpuThresholds;
        private String nodeTypeId;
        private Integer scaleOutSize;
        private List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyStorageThreshold> storageThresholds;
        public Builder() {}
        public Builder(GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy defaults) {
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
              throw new MissingRequiredPropertyException("GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy", "autoscalePolicyId");
            }
            this.autoscalePolicyId = autoscalePolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder consumedMemoryThresholds(List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyConsumedMemoryThreshold> consumedMemoryThresholds) {
            if (consumedMemoryThresholds == null) {
              throw new MissingRequiredPropertyException("GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy", "consumedMemoryThresholds");
            }
            this.consumedMemoryThresholds = consumedMemoryThresholds;
            return this;
        }
        public Builder consumedMemoryThresholds(GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyConsumedMemoryThreshold... consumedMemoryThresholds) {
            return consumedMemoryThresholds(List.of(consumedMemoryThresholds));
        }
        @CustomType.Setter
        public Builder cpuThresholds(List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyCpuThreshold> cpuThresholds) {
            if (cpuThresholds == null) {
              throw new MissingRequiredPropertyException("GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy", "cpuThresholds");
            }
            this.cpuThresholds = cpuThresholds;
            return this;
        }
        public Builder cpuThresholds(GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyCpuThreshold... cpuThresholds) {
            return cpuThresholds(List.of(cpuThresholds));
        }
        @CustomType.Setter
        public Builder nodeTypeId(String nodeTypeId) {
            if (nodeTypeId == null) {
              throw new MissingRequiredPropertyException("GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy", "nodeTypeId");
            }
            this.nodeTypeId = nodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder scaleOutSize(Integer scaleOutSize) {
            if (scaleOutSize == null) {
              throw new MissingRequiredPropertyException("GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy", "scaleOutSize");
            }
            this.scaleOutSize = scaleOutSize;
            return this;
        }
        @CustomType.Setter
        public Builder storageThresholds(List<GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyStorageThreshold> storageThresholds) {
            if (storageThresholds == null) {
              throw new MissingRequiredPropertyException("GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy", "storageThresholds");
            }
            this.storageThresholds = storageThresholds;
            return this;
        }
        public Builder storageThresholds(GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicyStorageThreshold... storageThresholds) {
            return storageThresholds(List.of(storageThresholds));
        }
        public GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy build() {
            final var _resultValue = new GetPrivateCloudManagementClusterAutoscalingSettingAutoscalingPolicy();
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
