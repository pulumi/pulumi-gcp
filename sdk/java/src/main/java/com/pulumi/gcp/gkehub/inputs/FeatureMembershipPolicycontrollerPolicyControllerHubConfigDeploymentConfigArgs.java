// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs;
import com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs Empty = new FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs();

    /**
     * The name of the component. One of `admission` `audit` or `mutation`
     * 
     */
    @Import(name="componentName", required=true)
    private Output<String> componentName;

    /**
     * @return The name of the component. One of `admission` `audit` or `mutation`
     * 
     */
    public Output<String> componentName() {
        return this.componentName;
    }

    /**
     * Container resource requirements.
     * 
     */
    @Import(name="containerResources")
    private @Nullable Output<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs> containerResources;

    /**
     * @return Container resource requirements.
     * 
     */
    public Optional<Output<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs>> containerResources() {
        return Optional.ofNullable(this.containerResources);
    }

    /**
     * Pod affinity configuration. Possible values: AFFINITY_UNSPECIFIED, NO_AFFINITY, ANTI_AFFINITY
     * 
     */
    @Import(name="podAffinity")
    private @Nullable Output<String> podAffinity;

    /**
     * @return Pod affinity configuration. Possible values: AFFINITY_UNSPECIFIED, NO_AFFINITY, ANTI_AFFINITY
     * 
     */
    public Optional<Output<String>> podAffinity() {
        return Optional.ofNullable(this.podAffinity);
    }

    /**
     * Pod tolerations of node taints.
     * 
     */
    @Import(name="podTolerations")
    private @Nullable Output<List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs>> podTolerations;

    /**
     * @return Pod tolerations of node taints.
     * 
     */
    public Optional<Output<List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs>>> podTolerations() {
        return Optional.ofNullable(this.podTolerations);
    }

    /**
     * Pod replica count.
     * 
     */
    @Import(name="replicaCount")
    private @Nullable Output<Integer> replicaCount;

    /**
     * @return Pod replica count.
     * 
     */
    public Optional<Output<Integer>> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    private FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs() {}

    private FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs $) {
        this.componentName = $.componentName;
        this.containerResources = $.containerResources;
        this.podAffinity = $.podAffinity;
        this.podTolerations = $.podTolerations;
        this.replicaCount = $.replicaCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs $;

        public Builder() {
            $ = new FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs();
        }

        public Builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs defaults) {
            $ = new FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentName The name of the component. One of `admission` `audit` or `mutation`
         * 
         * @return builder
         * 
         */
        public Builder componentName(Output<String> componentName) {
            $.componentName = componentName;
            return this;
        }

        /**
         * @param componentName The name of the component. One of `admission` `audit` or `mutation`
         * 
         * @return builder
         * 
         */
        public Builder componentName(String componentName) {
            return componentName(Output.of(componentName));
        }

        /**
         * @param containerResources Container resource requirements.
         * 
         * @return builder
         * 
         */
        public Builder containerResources(@Nullable Output<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs> containerResources) {
            $.containerResources = containerResources;
            return this;
        }

        /**
         * @param containerResources Container resource requirements.
         * 
         * @return builder
         * 
         */
        public Builder containerResources(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs containerResources) {
            return containerResources(Output.of(containerResources));
        }

        /**
         * @param podAffinity Pod affinity configuration. Possible values: AFFINITY_UNSPECIFIED, NO_AFFINITY, ANTI_AFFINITY
         * 
         * @return builder
         * 
         */
        public Builder podAffinity(@Nullable Output<String> podAffinity) {
            $.podAffinity = podAffinity;
            return this;
        }

        /**
         * @param podAffinity Pod affinity configuration. Possible values: AFFINITY_UNSPECIFIED, NO_AFFINITY, ANTI_AFFINITY
         * 
         * @return builder
         * 
         */
        public Builder podAffinity(String podAffinity) {
            return podAffinity(Output.of(podAffinity));
        }

        /**
         * @param podTolerations Pod tolerations of node taints.
         * 
         * @return builder
         * 
         */
        public Builder podTolerations(@Nullable Output<List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs>> podTolerations) {
            $.podTolerations = podTolerations;
            return this;
        }

        /**
         * @param podTolerations Pod tolerations of node taints.
         * 
         * @return builder
         * 
         */
        public Builder podTolerations(List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs> podTolerations) {
            return podTolerations(Output.of(podTolerations));
        }

        /**
         * @param podTolerations Pod tolerations of node taints.
         * 
         * @return builder
         * 
         */
        public Builder podTolerations(FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs... podTolerations) {
            return podTolerations(List.of(podTolerations));
        }

        /**
         * @param replicaCount Pod replica count.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            $.replicaCount = replicaCount;
            return this;
        }

        /**
         * @param replicaCount Pod replica count.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(Integer replicaCount) {
            return replicaCount(Output.of(replicaCount));
        }

        public FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs build() {
            if ($.componentName == null) {
                throw new MissingRequiredPropertyException("FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs", "componentName");
            }
            return $;
        }
    }

}
