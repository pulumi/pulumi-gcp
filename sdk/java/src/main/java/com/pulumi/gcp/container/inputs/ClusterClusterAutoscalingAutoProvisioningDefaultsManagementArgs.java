// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs Empty = new ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs();

    /**
     * Specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
     * 
     */
    @Import(name="autoRepair")
    private @Nullable Output<Boolean> autoRepair;

    /**
     * @return Specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
     * 
     */
    public Optional<Output<Boolean>> autoRepair() {
        return Optional.ofNullable(this.autoRepair);
    }

    /**
     * Specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<Boolean> autoUpgrade;

    /**
     * @return Specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
     * 
     */
    public Optional<Output<Boolean>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    @Import(name="upgradeOptions")
    private @Nullable Output<List<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs>> upgradeOptions;

    public Optional<Output<List<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs>>> upgradeOptions() {
        return Optional.ofNullable(this.upgradeOptions);
    }

    private ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs() {}

    private ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs $) {
        this.autoRepair = $.autoRepair;
        this.autoUpgrade = $.autoUpgrade;
        this.upgradeOptions = $.upgradeOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs $;

        public Builder() {
            $ = new ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs();
        }

        public Builder(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs defaults) {
            $ = new ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRepair Specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(@Nullable Output<Boolean> autoRepair) {
            $.autoRepair = autoRepair;
            return this;
        }

        /**
         * @param autoRepair Specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(Boolean autoRepair) {
            return autoRepair(Output.of(autoRepair));
        }

        /**
         * @param autoUpgrade Specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade Specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(Boolean autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        public Builder upgradeOptions(@Nullable Output<List<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs>> upgradeOptions) {
            $.upgradeOptions = upgradeOptions;
            return this;
        }

        public Builder upgradeOptions(List<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs> upgradeOptions) {
            return upgradeOptions(Output.of(upgradeOptions));
        }

        public Builder upgradeOptions(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs... upgradeOptions) {
            return upgradeOptions(List.of(upgradeOptions));
        }

        public ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs build() {
            return $;
        }
    }

}