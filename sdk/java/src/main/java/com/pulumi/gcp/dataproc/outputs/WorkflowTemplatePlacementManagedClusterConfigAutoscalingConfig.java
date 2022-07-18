// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig {
    /**
     * @return Optional. The autoscaling policy used by the cluster. Only resource names including projectid and location (region) are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` Note that the policy must be in the same project and Dataproc region.
     * 
     */
    private final @Nullable String policy;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig(@CustomType.Parameter("policy") @Nullable String policy) {
        this.policy = policy;
    }

    /**
     * @return Optional. The autoscaling policy used by the cluster. Only resource names including projectid and location (region) are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` Note that the policy must be in the same project and Dataproc region.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig(policy);
        }
    }
}