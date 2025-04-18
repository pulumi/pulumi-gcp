// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workbench.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupAcceleratorConfigArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupBootDiskArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupConfidentialInstanceConfigArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupContainerImageArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupDataDisksArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupNetworkInterfaceArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupServiceAccountArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupShieldedInstanceConfigArgs;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupVmImageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGceSetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGceSetupArgs Empty = new InstanceGceSetupArgs();

    /**
     * The hardware accelerators used on this instance. If you use accelerators, make sure that your configuration has
     * [enough vCPUs and memory to support the `machine_type` you have selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
     * Currently supports only one accelerator configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="acceleratorConfigs")
    private @Nullable Output<List<InstanceGceSetupAcceleratorConfigArgs>> acceleratorConfigs;

    /**
     * @return The hardware accelerators used on this instance. If you use accelerators, make sure that your configuration has
     * [enough vCPUs and memory to support the `machine_type` you have selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
     * Currently supports only one accelerator configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceGceSetupAcceleratorConfigArgs>>> acceleratorConfigs() {
        return Optional.ofNullable(this.acceleratorConfigs);
    }

    /**
     * The definition of a boot disk.
     * Structure is documented below.
     * 
     */
    @Import(name="bootDisk")
    private @Nullable Output<InstanceGceSetupBootDiskArgs> bootDisk;

    /**
     * @return The definition of a boot disk.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupBootDiskArgs>> bootDisk() {
        return Optional.ofNullable(this.bootDisk);
    }

    /**
     * Confidential instance configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="confidentialInstanceConfig")
    private @Nullable Output<InstanceGceSetupConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    /**
     * @return Confidential instance configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupConfidentialInstanceConfigArgs>> confidentialInstanceConfig() {
        return Optional.ofNullable(this.confidentialInstanceConfig);
    }

    /**
     * Use a container image to start the workbench instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<InstanceGceSetupContainerImageArgs> containerImage;

    /**
     * @return Use a container image to start the workbench instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupContainerImageArgs>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    /**
     * Data disks attached to the VM instance. Currently supports only one data disk.
     * Structure is documented below.
     * 
     */
    @Import(name="dataDisks")
    private @Nullable Output<InstanceGceSetupDataDisksArgs> dataDisks;

    /**
     * @return Data disks attached to the VM instance. Currently supports only one data disk.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupDataDisksArgs>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    /**
     * Optional. If true, no external IP will be assigned to this VM instance.
     * 
     */
    @Import(name="disablePublicIp")
    private @Nullable Output<Boolean> disablePublicIp;

    /**
     * @return Optional. If true, no external IP will be assigned to this VM instance.
     * 
     */
    public Optional<Output<Boolean>> disablePublicIp() {
        return Optional.ofNullable(this.disablePublicIp);
    }

    /**
     * Optional. Flag to enable ip forwarding or not, default false/off.
     * https://cloud.google.com/vpc/docs/using-routes#canipforward
     * 
     */
    @Import(name="enableIpForwarding")
    private @Nullable Output<Boolean> enableIpForwarding;

    /**
     * @return Optional. Flag to enable ip forwarding or not, default false/off.
     * https://cloud.google.com/vpc/docs/using-routes#canipforward
     * 
     */
    public Optional<Output<Boolean>> enableIpForwarding() {
        return Optional.ofNullable(this.enableIpForwarding);
    }

    /**
     * Optional. The machine type of the VM instance. https://cloud.google.com/compute/docs/machine-resource
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Optional. The machine type of the VM instance. https://cloud.google.com/compute/docs/machine-resource
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Optional. Custom metadata to apply to this instance.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Optional. Custom metadata to apply to this instance.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The network interfaces for the VM. Supports only one interface.
     * Structure is documented below.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<InstanceGceSetupNetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return The network interfaces for the VM. Supports only one interface.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceGceSetupNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * The service account that serves as an identity for the VM instance. Currently supports only one service account.
     * Structure is documented below.
     * 
     */
    @Import(name="serviceAccounts")
    private @Nullable Output<List<InstanceGceSetupServiceAccountArgs>> serviceAccounts;

    /**
     * @return The service account that serves as an identity for the VM instance. Currently supports only one service account.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceGceSetupServiceAccountArgs>>> serviceAccounts() {
        return Optional.ofNullable(this.serviceAccounts);
    }

    /**
     * A set of Shielded Instance options. See [Images using supported Shielded
     * VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * Not all combinations are valid.
     * Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<InstanceGceSetupShieldedInstanceConfigArgs> shieldedInstanceConfig;

    /**
     * @return A set of Shielded Instance options. See [Images using supported Shielded
     * VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * Not all combinations are valid.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * Optional. The Compute Engine tags to add to instance (see [Tagging
     * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Optional. The Compute Engine tags to add to instance (see [Tagging
     * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Definition of a custom Compute Engine virtual machine image for starting
     * a workbench instance with the environment installed directly on the VM.
     * Structure is documented below.
     * 
     */
    @Import(name="vmImage")
    private @Nullable Output<InstanceGceSetupVmImageArgs> vmImage;

    /**
     * @return Definition of a custom Compute Engine virtual machine image for starting
     * a workbench instance with the environment installed directly on the VM.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupVmImageArgs>> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    private InstanceGceSetupArgs() {}

    private InstanceGceSetupArgs(InstanceGceSetupArgs $) {
        this.acceleratorConfigs = $.acceleratorConfigs;
        this.bootDisk = $.bootDisk;
        this.confidentialInstanceConfig = $.confidentialInstanceConfig;
        this.containerImage = $.containerImage;
        this.dataDisks = $.dataDisks;
        this.disablePublicIp = $.disablePublicIp;
        this.enableIpForwarding = $.enableIpForwarding;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.networkInterfaces = $.networkInterfaces;
        this.serviceAccounts = $.serviceAccounts;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.tags = $.tags;
        this.vmImage = $.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGceSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGceSetupArgs $;

        public Builder() {
            $ = new InstanceGceSetupArgs();
        }

        public Builder(InstanceGceSetupArgs defaults) {
            $ = new InstanceGceSetupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorConfigs The hardware accelerators used on this instance. If you use accelerators, make sure that your configuration has
         * [enough vCPUs and memory to support the `machine_type` you have selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
         * Currently supports only one accelerator configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfigs(@Nullable Output<List<InstanceGceSetupAcceleratorConfigArgs>> acceleratorConfigs) {
            $.acceleratorConfigs = acceleratorConfigs;
            return this;
        }

        /**
         * @param acceleratorConfigs The hardware accelerators used on this instance. If you use accelerators, make sure that your configuration has
         * [enough vCPUs and memory to support the `machine_type` you have selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
         * Currently supports only one accelerator configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfigs(List<InstanceGceSetupAcceleratorConfigArgs> acceleratorConfigs) {
            return acceleratorConfigs(Output.of(acceleratorConfigs));
        }

        /**
         * @param acceleratorConfigs The hardware accelerators used on this instance. If you use accelerators, make sure that your configuration has
         * [enough vCPUs and memory to support the `machine_type` you have selected](https://cloud.google.com/compute/docs/gpus/#gpus-list).
         * Currently supports only one accelerator configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfigs(InstanceGceSetupAcceleratorConfigArgs... acceleratorConfigs) {
            return acceleratorConfigs(List.of(acceleratorConfigs));
        }

        /**
         * @param bootDisk The definition of a boot disk.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bootDisk(@Nullable Output<InstanceGceSetupBootDiskArgs> bootDisk) {
            $.bootDisk = bootDisk;
            return this;
        }

        /**
         * @param bootDisk The definition of a boot disk.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bootDisk(InstanceGceSetupBootDiskArgs bootDisk) {
            return bootDisk(Output.of(bootDisk));
        }

        /**
         * @param confidentialInstanceConfig Confidential instance configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder confidentialInstanceConfig(@Nullable Output<InstanceGceSetupConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            $.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        /**
         * @param confidentialInstanceConfig Confidential instance configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder confidentialInstanceConfig(InstanceGceSetupConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            return confidentialInstanceConfig(Output.of(confidentialInstanceConfig));
        }

        /**
         * @param containerImage Use a container image to start the workbench instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(@Nullable Output<InstanceGceSetupContainerImageArgs> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        /**
         * @param containerImage Use a container image to start the workbench instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(InstanceGceSetupContainerImageArgs containerImage) {
            return containerImage(Output.of(containerImage));
        }

        /**
         * @param dataDisks Data disks attached to the VM instance. Currently supports only one data disk.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(@Nullable Output<InstanceGceSetupDataDisksArgs> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        /**
         * @param dataDisks Data disks attached to the VM instance. Currently supports only one data disk.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(InstanceGceSetupDataDisksArgs dataDisks) {
            return dataDisks(Output.of(dataDisks));
        }

        /**
         * @param disablePublicIp Optional. If true, no external IP will be assigned to this VM instance.
         * 
         * @return builder
         * 
         */
        public Builder disablePublicIp(@Nullable Output<Boolean> disablePublicIp) {
            $.disablePublicIp = disablePublicIp;
            return this;
        }

        /**
         * @param disablePublicIp Optional. If true, no external IP will be assigned to this VM instance.
         * 
         * @return builder
         * 
         */
        public Builder disablePublicIp(Boolean disablePublicIp) {
            return disablePublicIp(Output.of(disablePublicIp));
        }

        /**
         * @param enableIpForwarding Optional. Flag to enable ip forwarding or not, default false/off.
         * https://cloud.google.com/vpc/docs/using-routes#canipforward
         * 
         * @return builder
         * 
         */
        public Builder enableIpForwarding(@Nullable Output<Boolean> enableIpForwarding) {
            $.enableIpForwarding = enableIpForwarding;
            return this;
        }

        /**
         * @param enableIpForwarding Optional. Flag to enable ip forwarding or not, default false/off.
         * https://cloud.google.com/vpc/docs/using-routes#canipforward
         * 
         * @return builder
         * 
         */
        public Builder enableIpForwarding(Boolean enableIpForwarding) {
            return enableIpForwarding(Output.of(enableIpForwarding));
        }

        /**
         * @param machineType Optional. The machine type of the VM instance. https://cloud.google.com/compute/docs/machine-resource
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Optional. The machine type of the VM instance. https://cloud.google.com/compute/docs/machine-resource
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param metadata Optional. Custom metadata to apply to this instance.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. Custom metadata to apply to this instance.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param networkInterfaces The network interfaces for the VM. Supports only one interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<InstanceGceSetupNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces The network interfaces for the VM. Supports only one interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<InstanceGceSetupNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces The network interfaces for the VM. Supports only one interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(InstanceGceSetupNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param serviceAccounts The service account that serves as an identity for the VM instance. Currently supports only one service account.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccounts(@Nullable Output<List<InstanceGceSetupServiceAccountArgs>> serviceAccounts) {
            $.serviceAccounts = serviceAccounts;
            return this;
        }

        /**
         * @param serviceAccounts The service account that serves as an identity for the VM instance. Currently supports only one service account.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccounts(List<InstanceGceSetupServiceAccountArgs> serviceAccounts) {
            return serviceAccounts(Output.of(serviceAccounts));
        }

        /**
         * @param serviceAccounts The service account that serves as an identity for the VM instance. Currently supports only one service account.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccounts(InstanceGceSetupServiceAccountArgs... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }

        /**
         * @param shieldedInstanceConfig A set of Shielded Instance options. See [Images using supported Shielded
         * VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
         * Not all combinations are valid.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(@Nullable Output<InstanceGceSetupShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        /**
         * @param shieldedInstanceConfig A set of Shielded Instance options. See [Images using supported Shielded
         * VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
         * Not all combinations are valid.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(InstanceGceSetupShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        /**
         * @param tags Optional. The Compute Engine tags to add to instance (see [Tagging
         * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional. The Compute Engine tags to add to instance (see [Tagging
         * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optional. The Compute Engine tags to add to instance (see [Tagging
         * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vmImage Definition of a custom Compute Engine virtual machine image for starting
         * a workbench instance with the environment installed directly on the VM.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(@Nullable Output<InstanceGceSetupVmImageArgs> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        /**
         * @param vmImage Definition of a custom Compute Engine virtual machine image for starting
         * a workbench instance with the environment installed directly on the VM.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(InstanceGceSetupVmImageArgs vmImage) {
            return vmImage(Output.of(vmImage));
        }

        public InstanceGceSetupArgs build() {
            return $;
        }
    }

}
