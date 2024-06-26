// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimits;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequests;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources {
    /**
     * @return Limits describes the maximum amount of compute resources allowed for use by the running container.
     * 
     */
    private @Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimits limits;
    /**
     * @return Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
     * 
     */
    private @Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequests requests;

    private FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources() {}
    /**
     * @return Limits describes the maximum amount of compute resources allowed for use by the running container.
     * 
     */
    public Optional<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimits> limits() {
        return Optional.ofNullable(this.limits);
    }
    /**
     * @return Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
     * 
     */
    public Optional<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequests> requests() {
        return Optional.ofNullable(this.requests);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimits limits;
        private @Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequests requests;
        public Builder() {}
        public Builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        @CustomType.Setter
        public Builder limits(@Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimits limits) {

            this.limits = limits;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequests requests) {

            this.requests = requests;
            return this;
        }
        public FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources build() {
            final var _resultValue = new FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources();
            _resultValue.limits = limits;
            _resultValue.requests = requests;
            return _resultValue;
        }
    }
}
