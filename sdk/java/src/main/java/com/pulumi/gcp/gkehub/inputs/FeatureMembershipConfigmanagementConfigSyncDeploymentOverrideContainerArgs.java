// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs Empty = new FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs();

    /**
     * The name of the container.
     * 
     */
    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    /**
     * @return The name of the container.
     * 
     */
    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * The CPU limit of the container.
     * 
     */
    @Import(name="cpuLimit")
    private @Nullable Output<String> cpuLimit;

    /**
     * @return The CPU limit of the container.
     * 
     */
    public Optional<Output<String>> cpuLimit() {
        return Optional.ofNullable(this.cpuLimit);
    }

    /**
     * The CPU request of the container.
     * 
     */
    @Import(name="cpuRequest")
    private @Nullable Output<String> cpuRequest;

    /**
     * @return The CPU request of the container.
     * 
     */
    public Optional<Output<String>> cpuRequest() {
        return Optional.ofNullable(this.cpuRequest);
    }

    /**
     * The memory limit of the container.
     * 
     */
    @Import(name="memoryLimit")
    private @Nullable Output<String> memoryLimit;

    /**
     * @return The memory limit of the container.
     * 
     */
    public Optional<Output<String>> memoryLimit() {
        return Optional.ofNullable(this.memoryLimit);
    }

    /**
     * The memory request of the container.
     * 
     */
    @Import(name="memoryRequest")
    private @Nullable Output<String> memoryRequest;

    /**
     * @return The memory request of the container.
     * 
     */
    public Optional<Output<String>> memoryRequest() {
        return Optional.ofNullable(this.memoryRequest);
    }

    private FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs() {}

    private FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs(FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs $) {
        this.containerName = $.containerName;
        this.cpuLimit = $.cpuLimit;
        this.cpuRequest = $.cpuRequest;
        this.memoryLimit = $.memoryLimit;
        this.memoryRequest = $.memoryRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs $;

        public Builder() {
            $ = new FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs();
        }

        public Builder(FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs defaults) {
            $ = new FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName The name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param cpuLimit The CPU limit of the container.
         * 
         * @return builder
         * 
         */
        public Builder cpuLimit(@Nullable Output<String> cpuLimit) {
            $.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * @param cpuLimit The CPU limit of the container.
         * 
         * @return builder
         * 
         */
        public Builder cpuLimit(String cpuLimit) {
            return cpuLimit(Output.of(cpuLimit));
        }

        /**
         * @param cpuRequest The CPU request of the container.
         * 
         * @return builder
         * 
         */
        public Builder cpuRequest(@Nullable Output<String> cpuRequest) {
            $.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * @param cpuRequest The CPU request of the container.
         * 
         * @return builder
         * 
         */
        public Builder cpuRequest(String cpuRequest) {
            return cpuRequest(Output.of(cpuRequest));
        }

        /**
         * @param memoryLimit The memory limit of the container.
         * 
         * @return builder
         * 
         */
        public Builder memoryLimit(@Nullable Output<String> memoryLimit) {
            $.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * @param memoryLimit The memory limit of the container.
         * 
         * @return builder
         * 
         */
        public Builder memoryLimit(String memoryLimit) {
            return memoryLimit(Output.of(memoryLimit));
        }

        /**
         * @param memoryRequest The memory request of the container.
         * 
         * @return builder
         * 
         */
        public Builder memoryRequest(@Nullable Output<String> memoryRequest) {
            $.memoryRequest = memoryRequest;
            return this;
        }

        /**
         * @param memoryRequest The memory request of the container.
         * 
         * @return builder
         * 
         */
        public Builder memoryRequest(String memoryRequest) {
            return memoryRequest(Output.of(memoryRequest));
        }

        public FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs build() {
            return $;
        }
    }

}
