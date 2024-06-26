// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig {
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private String component;
    /**
     * @return Container resource requirements.
     * Structure is documented below.
     * 
     */
    private @Nullable FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources containerResources;
    /**
     * @return Pod affinity configuration.
     * Possible values are: `AFFINITY_UNSPECIFIED`, `NO_AFFINITY`, `ANTI_AFFINITY`.
     * 
     */
    private @Nullable String podAffinity;
    /**
     * @return Pod tolerations of node taints.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration> podTolerations;
    /**
     * @return Pod replica count.
     * 
     */
    private @Nullable Integer replicaCount;

    private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig() {}
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String component() {
        return this.component;
    }
    /**
     * @return Container resource requirements.
     * Structure is documented below.
     * 
     */
    public Optional<FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources> containerResources() {
        return Optional.ofNullable(this.containerResources);
    }
    /**
     * @return Pod affinity configuration.
     * Possible values are: `AFFINITY_UNSPECIFIED`, `NO_AFFINITY`, `ANTI_AFFINITY`.
     * 
     */
    public Optional<String> podAffinity() {
        return Optional.ofNullable(this.podAffinity);
    }
    /**
     * @return Pod tolerations of node taints.
     * Structure is documented below.
     * 
     */
    public List<FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration> podTolerations() {
        return this.podTolerations == null ? List.of() : this.podTolerations;
    }
    /**
     * @return Pod replica count.
     * 
     */
    public Optional<Integer> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String component;
        private @Nullable FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources containerResources;
        private @Nullable String podAffinity;
        private @Nullable List<FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration> podTolerations;
        private @Nullable Integer replicaCount;
        public Builder() {}
        public Builder(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.component = defaults.component;
    	      this.containerResources = defaults.containerResources;
    	      this.podAffinity = defaults.podAffinity;
    	      this.podTolerations = defaults.podTolerations;
    	      this.replicaCount = defaults.replicaCount;
        }

        @CustomType.Setter
        public Builder component(String component) {
            if (component == null) {
              throw new MissingRequiredPropertyException("FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig", "component");
            }
            this.component = component;
            return this;
        }
        @CustomType.Setter
        public Builder containerResources(@Nullable FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources containerResources) {

            this.containerResources = containerResources;
            return this;
        }
        @CustomType.Setter
        public Builder podAffinity(@Nullable String podAffinity) {

            this.podAffinity = podAffinity;
            return this;
        }
        @CustomType.Setter
        public Builder podTolerations(@Nullable List<FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration> podTolerations) {

            this.podTolerations = podTolerations;
            return this;
        }
        public Builder podTolerations(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration... podTolerations) {
            return podTolerations(List.of(podTolerations));
        }
        @CustomType.Setter
        public Builder replicaCount(@Nullable Integer replicaCount) {

            this.replicaCount = replicaCount;
            return this;
        }
        public FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig build() {
            final var _resultValue = new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig();
            _resultValue.component = component;
            _resultValue.containerResources = containerResources;
            _resultValue.podAffinity = podAffinity;
            _resultValue.podTolerations = podTolerations;
            _resultValue.replicaCount = replicaCount;
            return _resultValue;
        }
    }
}
