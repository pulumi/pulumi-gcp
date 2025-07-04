// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs;
import com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs;
import com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingAutoProvisioningDefaultsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingAutoProvisioningDefaultsArgs Empty = new ClusterClusterAutoscalingAutoProvisioningDefaultsArgs();

    /**
     * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    @Import(name="bootDiskKmsKey")
    private @Nullable Output<String> bootDiskKmsKey;

    /**
     * @return The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    public Optional<Output<String>> bootDiskKmsKey() {
        return Optional.ofNullable(this.bootDiskKmsKey);
    }

    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. Defaults to `100`
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. Defaults to `100`
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * Type of the disk attached to each node (e.g. &#39;pd-standard&#39;, &#39;pd-ssd&#39;, &#39;pd-balanced&#39;, or &#39;hyperdisk-balanced&#39;). Defaults to `hyperdisk-balanced` if `hyperdisk-balanced` is supported and `pd-balanced` is not supported for the machine type; otherwise defaults to `pd-balanced`.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return Type of the disk attached to each node (e.g. &#39;pd-standard&#39;, &#39;pd-ssd&#39;, &#39;pd-balanced&#39;, or &#39;hyperdisk-balanced&#39;). Defaults to `hyperdisk-balanced` if `hyperdisk-balanced` is supported and `pd-balanced` is not supported for the machine type; otherwise defaults to `pd-balanced`.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The default image type used by NAP once a new node pool is being created. Please note that according to the [official documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning#default-image-type) the value must be one of the [COS_CONTAINERD, COS, UBUNTU_CONTAINERD, UBUNTU]. __NOTE__ : COS AND UBUNTU are deprecated as of `GKE 1.24`
     * 
     */
    @Import(name="imageType")
    private @Nullable Output<String> imageType;

    /**
     * @return The default image type used by NAP once a new node pool is being created. Please note that according to the [official documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning#default-image-type) the value must be one of the [COS_CONTAINERD, COS, UBUNTU_CONTAINERD, UBUNTU]. __NOTE__ : COS AND UBUNTU are deprecated as of `GKE 1.24`
     * 
     */
    public Optional<Output<String>> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    /**
     * NodeManagement configuration for this NodePool. Structure is documented below.
     * 
     */
    @Import(name="management")
    private @Nullable Output<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs> management;

    /**
     * @return NodeManagement configuration for this NodePool. Structure is documented below.
     * 
     */
    public Optional<Output<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs>> management() {
        return Optional.ofNullable(this.management);
    }

    /**
     * Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the
     * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such
     * as &#34;Intel Haswell&#34; or &#34;Intel Sandy Bridge&#34;.
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    /**
     * @return Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the
     * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such
     * as &#34;Intel Haswell&#34; or &#34;Intel Sandy Bridge&#34;.
     * 
     */
    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * Scopes that are used by NAP and GKE Autopilot when creating node pools. Use the &#34;https://www.googleapis.com/auth/cloud-platform&#34; scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     * &gt; `monitoring.write` is always enabled regardless of user input.  `monitoring` and `logging.write` may also be enabled depending on the values for `monitoring_service` and `logging_service`.
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return Scopes that are used by NAP and GKE Autopilot when creating node pools. Use the &#34;https://www.googleapis.com/auth/cloud-platform&#34; scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     * &gt; `monitoring.write` is always enabled regardless of user input.  `monitoring` and `logging.write` may also be enabled depending on the values for `monitoring_service` and `logging_service`.
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    /**
     * The `email` of the Google Cloud Platform Service Account to be used by the node VMs created by GKE Autopilot or NAP.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The `email` of the Google Cloud Platform Service Account to be used by the node VMs created by GKE Autopilot or NAP.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Shielded Instance options. Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs> shieldedInstanceConfig;

    /**
     * @return Shielded Instance options. Structure is documented below.
     * 
     */
    public Optional<Output<ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * Specifies the upgrade settings for NAP created node pools
     * 
     */
    @Import(name="upgradeSettings")
    private @Nullable Output<ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs> upgradeSettings;

    /**
     * @return Specifies the upgrade settings for NAP created node pools
     * 
     */
    public Optional<Output<ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs>> upgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }

    private ClusterClusterAutoscalingAutoProvisioningDefaultsArgs() {}

    private ClusterClusterAutoscalingAutoProvisioningDefaultsArgs(ClusterClusterAutoscalingAutoProvisioningDefaultsArgs $) {
        this.bootDiskKmsKey = $.bootDiskKmsKey;
        this.diskSize = $.diskSize;
        this.diskType = $.diskType;
        this.imageType = $.imageType;
        this.management = $.management;
        this.minCpuPlatform = $.minCpuPlatform;
        this.oauthScopes = $.oauthScopes;
        this.serviceAccount = $.serviceAccount;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.upgradeSettings = $.upgradeSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterAutoscalingAutoProvisioningDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterAutoscalingAutoProvisioningDefaultsArgs $;

        public Builder() {
            $ = new ClusterClusterAutoscalingAutoProvisioningDefaultsArgs();
        }

        public Builder(ClusterClusterAutoscalingAutoProvisioningDefaultsArgs defaults) {
            $ = new ClusterClusterAutoscalingAutoProvisioningDefaultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootDiskKmsKey The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
         * 
         * @return builder
         * 
         */
        public Builder bootDiskKmsKey(@Nullable Output<String> bootDiskKmsKey) {
            $.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }

        /**
         * @param bootDiskKmsKey The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
         * 
         * @return builder
         * 
         */
        public Builder bootDiskKmsKey(String bootDiskKmsKey) {
            return bootDiskKmsKey(Output.of(bootDiskKmsKey));
        }

        /**
         * @param diskSize Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. Defaults to `100`
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. Defaults to `100`
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param diskType Type of the disk attached to each node (e.g. &#39;pd-standard&#39;, &#39;pd-ssd&#39;, &#39;pd-balanced&#39;, or &#39;hyperdisk-balanced&#39;). Defaults to `hyperdisk-balanced` if `hyperdisk-balanced` is supported and `pd-balanced` is not supported for the machine type; otherwise defaults to `pd-balanced`.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Type of the disk attached to each node (e.g. &#39;pd-standard&#39;, &#39;pd-ssd&#39;, &#39;pd-balanced&#39;, or &#39;hyperdisk-balanced&#39;). Defaults to `hyperdisk-balanced` if `hyperdisk-balanced` is supported and `pd-balanced` is not supported for the machine type; otherwise defaults to `pd-balanced`.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param imageType The default image type used by NAP once a new node pool is being created. Please note that according to the [official documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning#default-image-type) the value must be one of the [COS_CONTAINERD, COS, UBUNTU_CONTAINERD, UBUNTU]. __NOTE__ : COS AND UBUNTU are deprecated as of `GKE 1.24`
         * 
         * @return builder
         * 
         */
        public Builder imageType(@Nullable Output<String> imageType) {
            $.imageType = imageType;
            return this;
        }

        /**
         * @param imageType The default image type used by NAP once a new node pool is being created. Please note that according to the [official documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning#default-image-type) the value must be one of the [COS_CONTAINERD, COS, UBUNTU_CONTAINERD, UBUNTU]. __NOTE__ : COS AND UBUNTU are deprecated as of `GKE 1.24`
         * 
         * @return builder
         * 
         */
        public Builder imageType(String imageType) {
            return imageType(Output.of(imageType));
        }

        /**
         * @param management NodeManagement configuration for this NodePool. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder management(@Nullable Output<ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs> management) {
            $.management = management;
            return this;
        }

        /**
         * @param management NodeManagement configuration for this NodePool. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder management(ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs management) {
            return management(Output.of(management));
        }

        /**
         * @param minCpuPlatform Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the
         * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such
         * as &#34;Intel Haswell&#34; or &#34;Intel Sandy Bridge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        /**
         * @param minCpuPlatform Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the
         * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such
         * as &#34;Intel Haswell&#34; or &#34;Intel Sandy Bridge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        /**
         * @param oauthScopes Scopes that are used by NAP and GKE Autopilot when creating node pools. Use the &#34;https://www.googleapis.com/auth/cloud-platform&#34; scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
         * 
         * &gt; `monitoring.write` is always enabled regardless of user input.  `monitoring` and `logging.write` may also be enabled depending on the values for `monitoring_service` and `logging_service`.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes Scopes that are used by NAP and GKE Autopilot when creating node pools. Use the &#34;https://www.googleapis.com/auth/cloud-platform&#34; scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
         * 
         * &gt; `monitoring.write` is always enabled regardless of user input.  `monitoring` and `logging.write` may also be enabled depending on the values for `monitoring_service` and `logging_service`.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes Scopes that are used by NAP and GKE Autopilot when creating node pools. Use the &#34;https://www.googleapis.com/auth/cloud-platform&#34; scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
         * 
         * &gt; `monitoring.write` is always enabled regardless of user input.  `monitoring` and `logging.write` may also be enabled depending on the values for `monitoring_service` and `logging_service`.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        /**
         * @param serviceAccount The `email` of the Google Cloud Platform Service Account to be used by the node VMs created by GKE Autopilot or NAP.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The `email` of the Google Cloud Platform Service Account to be used by the node VMs created by GKE Autopilot or NAP.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param shieldedInstanceConfig Shielded Instance options. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(@Nullable Output<ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        /**
         * @param shieldedInstanceConfig Shielded Instance options. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        /**
         * @param upgradeSettings Specifies the upgrade settings for NAP created node pools
         * 
         * @return builder
         * 
         */
        public Builder upgradeSettings(@Nullable Output<ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs> upgradeSettings) {
            $.upgradeSettings = upgradeSettings;
            return this;
        }

        /**
         * @param upgradeSettings Specifies the upgrade settings for NAP created node pools
         * 
         * @return builder
         * 
         */
        public Builder upgradeSettings(ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs upgradeSettings) {
            return upgradeSettings(Output.of(upgradeSettings));
        }

        public ClusterClusterAutoscalingAutoProvisioningDefaultsArgs build() {
            return $;
        }
    }

}
