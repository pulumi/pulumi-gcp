// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterClusterAutoscalingAutoProvisioningDefaultManagementUpgradeOption {
    private String autoUpgradeStartTime;
    private String description;

    private GetClusterClusterAutoscalingAutoProvisioningDefaultManagementUpgradeOption() {}
    public String autoUpgradeStartTime() {
        return this.autoUpgradeStartTime;
    }
    public String description() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterAutoscalingAutoProvisioningDefaultManagementUpgradeOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoUpgradeStartTime;
        private String description;
        public Builder() {}
        public Builder(GetClusterClusterAutoscalingAutoProvisioningDefaultManagementUpgradeOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeStartTime = defaults.autoUpgradeStartTime;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder autoUpgradeStartTime(String autoUpgradeStartTime) {
            this.autoUpgradeStartTime = Objects.requireNonNull(autoUpgradeStartTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public GetClusterClusterAutoscalingAutoProvisioningDefaultManagementUpgradeOption build() {
            final var o = new GetClusterClusterAutoscalingAutoProvisioningDefaultManagementUpgradeOption();
            o.autoUpgradeStartTime = autoUpgradeStartTime;
            o.description = description;
            return o;
        }
    }
}