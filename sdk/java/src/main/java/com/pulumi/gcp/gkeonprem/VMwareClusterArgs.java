// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStorageArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterUpgradePolicyArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterVcenterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMwareClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareClusterArgs Empty = new VMwareClusterArgs();

    /**
     * The admin cluster this VMware User Cluster belongs to.
     * This is the full resource name of the admin cluster&#39;s hub membership.
     * In the future, references to other resource types might be allowed if
     * admin clusters are modeled as their own resources.
     * 
     */
    @Import(name="adminClusterMembership", required=true)
    private Output<String> adminClusterMembership;

    /**
     * @return The admin cluster this VMware User Cluster belongs to.
     * This is the full resource name of the admin cluster&#39;s hub membership.
     * In the future, references to other resource types might be allowed if
     * admin clusters are modeled as their own resources.
     * 
     */
    public Output<String> adminClusterMembership() {
        return this.adminClusterMembership;
    }

    /**
     * Annotations on the VMware User Cluster.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations on the VMware User Cluster.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * AAGConfig specifies whether to spread VMware User Cluster nodes across at
     * least three physical hosts in the datacenter.
     * Structure is documented below.
     * 
     */
    @Import(name="antiAffinityGroups")
    private @Nullable Output<VMwareClusterAntiAffinityGroupsArgs> antiAffinityGroups;

    /**
     * @return AAGConfig specifies whether to spread VMware User Cluster nodes across at
     * least three physical hosts in the datacenter.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterAntiAffinityGroupsArgs>> antiAffinityGroups() {
        return Optional.ofNullable(this.antiAffinityGroups);
    }

    /**
     * RBAC policy that will be applied and managed by GKE On-Prem.
     * Structure is documented below.
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<VMwareClusterAuthorizationArgs> authorization;

    /**
     * @return RBAC policy that will be applied and managed by GKE On-Prem.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterAuthorizationArgs>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * Configuration for auto repairing.
     * Structure is documented below.
     * 
     */
    @Import(name="autoRepairConfig")
    private @Nullable Output<VMwareClusterAutoRepairConfigArgs> autoRepairConfig;

    /**
     * @return Configuration for auto repairing.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterAutoRepairConfigArgs>> autoRepairConfig() {
        return Optional.ofNullable(this.autoRepairConfig);
    }

    /**
     * VMware User Cluster control plane nodes must have either 1 or 3 replicas.
     * Structure is documented below.
     * 
     */
    @Import(name="controlPlaneNode", required=true)
    private Output<VMwareClusterControlPlaneNodeArgs> controlPlaneNode;

    /**
     * @return VMware User Cluster control plane nodes must have either 1 or 3 replicas.
     * Structure is documented below.
     * 
     */
    public Output<VMwareClusterControlPlaneNodeArgs> controlPlaneNode() {
        return this.controlPlaneNode;
    }

    /**
     * VmwareDataplaneV2Config specifies configuration for Dataplane V2.
     * Structure is documented below.
     * 
     */
    @Import(name="dataplaneV2")
    private @Nullable Output<VMwareClusterDataplaneV2Args> dataplaneV2;

    /**
     * @return VmwareDataplaneV2Config specifies configuration for Dataplane V2.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterDataplaneV2Args>> dataplaneV2() {
        return Optional.ofNullable(this.dataplaneV2);
    }

    /**
     * A human readable description of this VMware User Cluster.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human readable description of this VMware User Cluster.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Disable bundled ingress.
     * 
     */
    @Import(name="disableBundledIngress")
    private @Nullable Output<Boolean> disableBundledIngress;

    /**
     * @return Disable bundled ingress.
     * 
     */
    public Optional<Output<Boolean>> disableBundledIngress() {
        return Optional.ofNullable(this.disableBundledIngress);
    }

    /**
     * Enable advanced cluster. Default to false.
     * 
     */
    @Import(name="enableAdvancedCluster")
    private @Nullable Output<Boolean> enableAdvancedCluster;

    /**
     * @return Enable advanced cluster. Default to false.
     * 
     */
    public Optional<Output<Boolean>> enableAdvancedCluster() {
        return Optional.ofNullable(this.enableAdvancedCluster);
    }

    /**
     * Enable control plane V2. Default to false.
     * 
     */
    @Import(name="enableControlPlaneV2")
    private @Nullable Output<Boolean> enableControlPlaneV2;

    /**
     * @return Enable control plane V2. Default to false.
     * 
     */
    public Optional<Output<Boolean>> enableControlPlaneV2() {
        return Optional.ofNullable(this.enableControlPlaneV2);
    }

    /**
     * Load Balancer configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<VMwareClusterLoadBalancerArgs> loadBalancer;

    /**
     * @return Load Balancer configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterLoadBalancerArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The VMware cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The VMware cluster name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The VMware User Cluster network configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<VMwareClusterNetworkConfigArgs> networkConfig;

    /**
     * @return The VMware User Cluster network configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The Anthos clusters on the VMware version for your user cluster.
     * 
     */
    @Import(name="onPremVersion", required=true)
    private Output<String> onPremVersion;

    /**
     * @return The Anthos clusters on the VMware version for your user cluster.
     * 
     */
    public Output<String> onPremVersion() {
        return this.onPremVersion;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Storage configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="storage")
    private @Nullable Output<VMwareClusterStorageArgs> storage;

    /**
     * @return Storage configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterStorageArgs>> storage() {
        return Optional.ofNullable(this.storage);
    }

    /**
     * Specifies upgrade policy for the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="upgradePolicy")
    private @Nullable Output<VMwareClusterUpgradePolicyArgs> upgradePolicy;

    /**
     * @return Specifies upgrade policy for the cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterUpgradePolicyArgs>> upgradePolicy() {
        return Optional.ofNullable(this.upgradePolicy);
    }

    /**
     * VmwareVCenterConfig specifies vCenter config for the user cluster.
     * Inherited from the admin cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="vcenter")
    private @Nullable Output<VMwareClusterVcenterArgs> vcenter;

    /**
     * @return VmwareVCenterConfig specifies vCenter config for the user cluster.
     * Inherited from the admin cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareClusterVcenterArgs>> vcenter() {
        return Optional.ofNullable(this.vcenter);
    }

    /**
     * Enable VM tracking.
     * 
     */
    @Import(name="vmTrackingEnabled")
    private @Nullable Output<Boolean> vmTrackingEnabled;

    /**
     * @return Enable VM tracking.
     * 
     */
    public Optional<Output<Boolean>> vmTrackingEnabled() {
        return Optional.ofNullable(this.vmTrackingEnabled);
    }

    private VMwareClusterArgs() {}

    private VMwareClusterArgs(VMwareClusterArgs $) {
        this.adminClusterMembership = $.adminClusterMembership;
        this.annotations = $.annotations;
        this.antiAffinityGroups = $.antiAffinityGroups;
        this.authorization = $.authorization;
        this.autoRepairConfig = $.autoRepairConfig;
        this.controlPlaneNode = $.controlPlaneNode;
        this.dataplaneV2 = $.dataplaneV2;
        this.description = $.description;
        this.disableBundledIngress = $.disableBundledIngress;
        this.enableAdvancedCluster = $.enableAdvancedCluster;
        this.enableControlPlaneV2 = $.enableControlPlaneV2;
        this.loadBalancer = $.loadBalancer;
        this.location = $.location;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.onPremVersion = $.onPremVersion;
        this.project = $.project;
        this.storage = $.storage;
        this.upgradePolicy = $.upgradePolicy;
        this.vcenter = $.vcenter;
        this.vmTrackingEnabled = $.vmTrackingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareClusterArgs $;

        public Builder() {
            $ = new VMwareClusterArgs();
        }

        public Builder(VMwareClusterArgs defaults) {
            $ = new VMwareClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminClusterMembership The admin cluster this VMware User Cluster belongs to.
         * This is the full resource name of the admin cluster&#39;s hub membership.
         * In the future, references to other resource types might be allowed if
         * admin clusters are modeled as their own resources.
         * 
         * @return builder
         * 
         */
        public Builder adminClusterMembership(Output<String> adminClusterMembership) {
            $.adminClusterMembership = adminClusterMembership;
            return this;
        }

        /**
         * @param adminClusterMembership The admin cluster this VMware User Cluster belongs to.
         * This is the full resource name of the admin cluster&#39;s hub membership.
         * In the future, references to other resource types might be allowed if
         * admin clusters are modeled as their own resources.
         * 
         * @return builder
         * 
         */
        public Builder adminClusterMembership(String adminClusterMembership) {
            return adminClusterMembership(Output.of(adminClusterMembership));
        }

        /**
         * @param annotations Annotations on the VMware User Cluster.
         * This field has the same restrictions as Kubernetes annotations.
         * The total size of all keys and values combined is limited to 256k.
         * Key can have 2 segments: prefix (optional) and name (required),
         * separated by a slash (/).
         * Prefix must be a DNS subdomain.
         * Name must be 63 characters or less, begin and end with alphanumerics,
         * with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations on the VMware User Cluster.
         * This field has the same restrictions as Kubernetes annotations.
         * The total size of all keys and values combined is limited to 256k.
         * Key can have 2 segments: prefix (optional) and name (required),
         * separated by a slash (/).
         * Prefix must be a DNS subdomain.
         * Name must be 63 characters or less, begin and end with alphanumerics,
         * with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param antiAffinityGroups AAGConfig specifies whether to spread VMware User Cluster nodes across at
         * least three physical hosts in the datacenter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder antiAffinityGroups(@Nullable Output<VMwareClusterAntiAffinityGroupsArgs> antiAffinityGroups) {
            $.antiAffinityGroups = antiAffinityGroups;
            return this;
        }

        /**
         * @param antiAffinityGroups AAGConfig specifies whether to spread VMware User Cluster nodes across at
         * least three physical hosts in the datacenter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder antiAffinityGroups(VMwareClusterAntiAffinityGroupsArgs antiAffinityGroups) {
            return antiAffinityGroups(Output.of(antiAffinityGroups));
        }

        /**
         * @param authorization RBAC policy that will be applied and managed by GKE On-Prem.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authorization(@Nullable Output<VMwareClusterAuthorizationArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization RBAC policy that will be applied and managed by GKE On-Prem.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authorization(VMwareClusterAuthorizationArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param autoRepairConfig Configuration for auto repairing.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoRepairConfig(@Nullable Output<VMwareClusterAutoRepairConfigArgs> autoRepairConfig) {
            $.autoRepairConfig = autoRepairConfig;
            return this;
        }

        /**
         * @param autoRepairConfig Configuration for auto repairing.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoRepairConfig(VMwareClusterAutoRepairConfigArgs autoRepairConfig) {
            return autoRepairConfig(Output.of(autoRepairConfig));
        }

        /**
         * @param controlPlaneNode VMware User Cluster control plane nodes must have either 1 or 3 replicas.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneNode(Output<VMwareClusterControlPlaneNodeArgs> controlPlaneNode) {
            $.controlPlaneNode = controlPlaneNode;
            return this;
        }

        /**
         * @param controlPlaneNode VMware User Cluster control plane nodes must have either 1 or 3 replicas.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneNode(VMwareClusterControlPlaneNodeArgs controlPlaneNode) {
            return controlPlaneNode(Output.of(controlPlaneNode));
        }

        /**
         * @param dataplaneV2 VmwareDataplaneV2Config specifies configuration for Dataplane V2.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataplaneV2(@Nullable Output<VMwareClusterDataplaneV2Args> dataplaneV2) {
            $.dataplaneV2 = dataplaneV2;
            return this;
        }

        /**
         * @param dataplaneV2 VmwareDataplaneV2Config specifies configuration for Dataplane V2.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataplaneV2(VMwareClusterDataplaneV2Args dataplaneV2) {
            return dataplaneV2(Output.of(dataplaneV2));
        }

        /**
         * @param description A human readable description of this VMware User Cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human readable description of this VMware User Cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disableBundledIngress Disable bundled ingress.
         * 
         * @return builder
         * 
         */
        public Builder disableBundledIngress(@Nullable Output<Boolean> disableBundledIngress) {
            $.disableBundledIngress = disableBundledIngress;
            return this;
        }

        /**
         * @param disableBundledIngress Disable bundled ingress.
         * 
         * @return builder
         * 
         */
        public Builder disableBundledIngress(Boolean disableBundledIngress) {
            return disableBundledIngress(Output.of(disableBundledIngress));
        }

        /**
         * @param enableAdvancedCluster Enable advanced cluster. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder enableAdvancedCluster(@Nullable Output<Boolean> enableAdvancedCluster) {
            $.enableAdvancedCluster = enableAdvancedCluster;
            return this;
        }

        /**
         * @param enableAdvancedCluster Enable advanced cluster. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder enableAdvancedCluster(Boolean enableAdvancedCluster) {
            return enableAdvancedCluster(Output.of(enableAdvancedCluster));
        }

        /**
         * @param enableControlPlaneV2 Enable control plane V2. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder enableControlPlaneV2(@Nullable Output<Boolean> enableControlPlaneV2) {
            $.enableControlPlaneV2 = enableControlPlaneV2;
            return this;
        }

        /**
         * @param enableControlPlaneV2 Enable control plane V2. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder enableControlPlaneV2(Boolean enableControlPlaneV2) {
            return enableControlPlaneV2(Output.of(enableControlPlaneV2));
        }

        /**
         * @param loadBalancer Load Balancer configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<VMwareClusterLoadBalancerArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer Load Balancer configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(VMwareClusterLoadBalancerArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The VMware cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The VMware cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig The VMware User Cluster network configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<VMwareClusterNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig The VMware User Cluster network configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(VMwareClusterNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param onPremVersion The Anthos clusters on the VMware version for your user cluster.
         * 
         * @return builder
         * 
         */
        public Builder onPremVersion(Output<String> onPremVersion) {
            $.onPremVersion = onPremVersion;
            return this;
        }

        /**
         * @param onPremVersion The Anthos clusters on the VMware version for your user cluster.
         * 
         * @return builder
         * 
         */
        public Builder onPremVersion(String onPremVersion) {
            return onPremVersion(Output.of(onPremVersion));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param storage Storage configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<VMwareClusterStorageArgs> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage Storage configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storage(VMwareClusterStorageArgs storage) {
            return storage(Output.of(storage));
        }

        /**
         * @param upgradePolicy Specifies upgrade policy for the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upgradePolicy(@Nullable Output<VMwareClusterUpgradePolicyArgs> upgradePolicy) {
            $.upgradePolicy = upgradePolicy;
            return this;
        }

        /**
         * @param upgradePolicy Specifies upgrade policy for the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upgradePolicy(VMwareClusterUpgradePolicyArgs upgradePolicy) {
            return upgradePolicy(Output.of(upgradePolicy));
        }

        /**
         * @param vcenter VmwareVCenterConfig specifies vCenter config for the user cluster.
         * Inherited from the admin cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vcenter(@Nullable Output<VMwareClusterVcenterArgs> vcenter) {
            $.vcenter = vcenter;
            return this;
        }

        /**
         * @param vcenter VmwareVCenterConfig specifies vCenter config for the user cluster.
         * Inherited from the admin cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vcenter(VMwareClusterVcenterArgs vcenter) {
            return vcenter(Output.of(vcenter));
        }

        /**
         * @param vmTrackingEnabled Enable VM tracking.
         * 
         * @return builder
         * 
         */
        public Builder vmTrackingEnabled(@Nullable Output<Boolean> vmTrackingEnabled) {
            $.vmTrackingEnabled = vmTrackingEnabled;
            return this;
        }

        /**
         * @param vmTrackingEnabled Enable VM tracking.
         * 
         * @return builder
         * 
         */
        public Builder vmTrackingEnabled(Boolean vmTrackingEnabled) {
            return vmTrackingEnabled(Output.of(vmTrackingEnabled));
        }

        public VMwareClusterArgs build() {
            if ($.adminClusterMembership == null) {
                throw new MissingRequiredPropertyException("VMwareClusterArgs", "adminClusterMembership");
            }
            if ($.controlPlaneNode == null) {
                throw new MissingRequiredPropertyException("VMwareClusterArgs", "controlPlaneNode");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("VMwareClusterArgs", "location");
            }
            if ($.onPremVersion == null) {
                throw new MissingRequiredPropertyException("VMwareClusterArgs", "onPremVersion");
            }
            return $;
        }
    }

}
