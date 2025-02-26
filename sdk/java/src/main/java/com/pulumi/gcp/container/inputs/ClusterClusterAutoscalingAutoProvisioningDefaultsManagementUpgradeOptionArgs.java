// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs Empty = new ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs();

    /**
     * This field is set when upgrades are about to commence with the approximate start time for the upgrades, in RFC3339 text format.
     * 
     */
    @Import(name="autoUpgradeStartTime")
    private @Nullable Output<String> autoUpgradeStartTime;

    /**
     * @return This field is set when upgrades are about to commence with the approximate start time for the upgrades, in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> autoUpgradeStartTime() {
        return Optional.ofNullable(this.autoUpgradeStartTime);
    }

    /**
     * Description of the cluster.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the cluster.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    private ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs() {}

    private ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs $) {
        this.autoUpgradeStartTime = $.autoUpgradeStartTime;
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs $;

        public Builder() {
            $ = new ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs();
        }

        public Builder(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs defaults) {
            $ = new ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeStartTime This field is set when upgrades are about to commence with the approximate start time for the upgrades, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeStartTime(@Nullable Output<String> autoUpgradeStartTime) {
            $.autoUpgradeStartTime = autoUpgradeStartTime;
            return this;
        }

        /**
         * @param autoUpgradeStartTime This field is set when upgrades are about to commence with the approximate start time for the upgrades, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeStartTime(String autoUpgradeStartTime) {
            return autoUpgradeStartTime(Output.of(autoUpgradeStartTime));
        }

        /**
         * @param description Description of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs build() {
            return $;
        }
    }

}
