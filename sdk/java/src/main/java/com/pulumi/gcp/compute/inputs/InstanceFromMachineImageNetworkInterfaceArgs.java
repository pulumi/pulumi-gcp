// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAccessConfigArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageNetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageNetworkInterfaceArgs Empty = new InstanceFromMachineImageNetworkInterfaceArgs();

    /**
     * Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
     * 
     */
    @Import(name="accessConfigs")
    private @Nullable Output<List<InstanceFromMachineImageNetworkInterfaceAccessConfigArgs>> accessConfigs;

    /**
     * @return Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
     * 
     */
    public Optional<Output<List<InstanceFromMachineImageNetworkInterfaceAccessConfigArgs>>> accessConfigs() {
        return Optional.ofNullable(this.accessConfigs);
    }

    /**
     * An array of alias IP ranges for this network interface.
     * 
     */
    @Import(name="aliasIpRanges")
    private @Nullable Output<List<InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges;

    /**
     * @return An array of alias IP ranges for this network interface.
     * 
     */
    public Optional<Output<List<InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs>>> aliasIpRanges() {
        return Optional.ofNullable(this.aliasIpRanges);
    }

    /**
     * The prefix length of the primary internal IPv6 range.
     * 
     */
    @Import(name="internalIpv6PrefixLength")
    private @Nullable Output<Integer> internalIpv6PrefixLength;

    /**
     * @return The prefix length of the primary internal IPv6 range.
     * 
     */
    public Optional<Output<Integer>> internalIpv6PrefixLength() {
        return Optional.ofNullable(this.internalIpv6PrefixLength);
    }

    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    @Import(name="ipv6AccessConfigs")
    private @Nullable Output<List<InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs;

    /**
     * @return An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    public Optional<Output<List<InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs>>> ipv6AccessConfigs() {
        return Optional.ofNullable(this.ipv6AccessConfigs);
    }

    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork.
     * 
     */
    @Import(name="ipv6AccessType")
    private @Nullable Output<String> ipv6AccessType;

    /**
     * @return One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork.
     * 
     */
    public Optional<Output<String>> ipv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }

    /**
     * An IPv6 internal network address for this network interface. If not specified, Google Cloud will automatically assign an internal IPv6 address from the instance&#39;s subnetwork.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return An IPv6 internal network address for this network interface. If not specified, Google Cloud will automatically assign an internal IPv6 address from the instance&#39;s subnetwork.
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name or self_link of the network attached to this interface.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The name or self_link of the network attached to this interface.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The URL of the network attachment that this interface should connect to in the following format: projects/{projectNumber}/regions/{region_name}/networkAttachments/{network_attachment_name}.
     * 
     */
    @Import(name="networkAttachment")
    private @Nullable Output<String> networkAttachment;

    /**
     * @return The URL of the network attachment that this interface should connect to in the following format: projects/{projectNumber}/regions/{region_name}/networkAttachments/{network_attachment_name}.
     * 
     */
    public Optional<Output<String>> networkAttachment() {
        return Optional.ofNullable(this.networkAttachment);
    }

    /**
     * The private IP address assigned to the instance.
     * 
     */
    @Import(name="networkIp")
    private @Nullable Output<String> networkIp;

    /**
     * @return The private IP address assigned to the instance.
     * 
     */
    public Optional<Output<String>> networkIp() {
        return Optional.ofNullable(this.networkIp);
    }

    /**
     * The type of vNIC to be used on this interface. Possible values:GVNIC, VIRTIO_NET, IDPF, MRDMA, and IRDMA
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<String> nicType;

    /**
     * @return The type of vNIC to be used on this interface. Possible values:GVNIC, VIRTIO_NET, IDPF, MRDMA, and IRDMA
     * 
     */
    public Optional<Output<String>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    @Import(name="queueCount")
    private @Nullable Output<Integer> queueCount;

    /**
     * @return The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    public Optional<Output<Integer>> queueCount() {
        return Optional.ofNullable(this.queueCount);
    }

    /**
     * A full or partial URL to a security policy to add to this instance. If this field is set to an empty string it will remove the associated security policy.
     * 
     */
    @Import(name="securityPolicy")
    private @Nullable Output<String> securityPolicy;

    /**
     * @return A full or partial URL to a security policy to add to this instance. If this field is set to an empty string it will remove the associated security policy.
     * 
     */
    public Optional<Output<String>> securityPolicy() {
        return Optional.ofNullable(this.securityPolicy);
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<String> stackType;

    /**
     * @return The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used.
     * 
     */
    public Optional<Output<String>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    /**
     * The name or self_link of the subnetwork attached to this interface.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The name or self_link of the subnetwork attached to this interface.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The project in which the subnetwork belongs.
     * 
     */
    @Import(name="subnetworkProject")
    private @Nullable Output<String> subnetworkProject;

    /**
     * @return The project in which the subnetwork belongs.
     * 
     */
    public Optional<Output<String>> subnetworkProject() {
        return Optional.ofNullable(this.subnetworkProject);
    }

    private InstanceFromMachineImageNetworkInterfaceArgs() {}

    private InstanceFromMachineImageNetworkInterfaceArgs(InstanceFromMachineImageNetworkInterfaceArgs $) {
        this.accessConfigs = $.accessConfigs;
        this.aliasIpRanges = $.aliasIpRanges;
        this.internalIpv6PrefixLength = $.internalIpv6PrefixLength;
        this.ipv6AccessConfigs = $.ipv6AccessConfigs;
        this.ipv6AccessType = $.ipv6AccessType;
        this.ipv6Address = $.ipv6Address;
        this.name = $.name;
        this.network = $.network;
        this.networkAttachment = $.networkAttachment;
        this.networkIp = $.networkIp;
        this.nicType = $.nicType;
        this.queueCount = $.queueCount;
        this.securityPolicy = $.securityPolicy;
        this.stackType = $.stackType;
        this.subnetwork = $.subnetwork;
        this.subnetworkProject = $.subnetworkProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageNetworkInterfaceArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageNetworkInterfaceArgs();
        }

        public Builder(InstanceFromMachineImageNetworkInterfaceArgs defaults) {
            $ = new InstanceFromMachineImageNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConfigs Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(@Nullable Output<List<InstanceFromMachineImageNetworkInterfaceAccessConfigArgs>> accessConfigs) {
            $.accessConfigs = accessConfigs;
            return this;
        }

        /**
         * @param accessConfigs Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(List<InstanceFromMachineImageNetworkInterfaceAccessConfigArgs> accessConfigs) {
            return accessConfigs(Output.of(accessConfigs));
        }

        /**
         * @param accessConfigs Access configurations, i.e. IPs via which this instance can be accessed via the Internet.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(InstanceFromMachineImageNetworkInterfaceAccessConfigArgs... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }

        /**
         * @param aliasIpRanges An array of alias IP ranges for this network interface.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(@Nullable Output<List<InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges) {
            $.aliasIpRanges = aliasIpRanges;
            return this;
        }

        /**
         * @param aliasIpRanges An array of alias IP ranges for this network interface.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(List<InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs> aliasIpRanges) {
            return aliasIpRanges(Output.of(aliasIpRanges));
        }

        /**
         * @param aliasIpRanges An array of alias IP ranges for this network interface.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }

        /**
         * @param internalIpv6PrefixLength The prefix length of the primary internal IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder internalIpv6PrefixLength(@Nullable Output<Integer> internalIpv6PrefixLength) {
            $.internalIpv6PrefixLength = internalIpv6PrefixLength;
            return this;
        }

        /**
         * @param internalIpv6PrefixLength The prefix length of the primary internal IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder internalIpv6PrefixLength(Integer internalIpv6PrefixLength) {
            return internalIpv6PrefixLength(Output.of(internalIpv6PrefixLength));
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(@Nullable Output<List<InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs) {
            $.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(List<InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs> ipv6AccessConfigs) {
            return ipv6AccessConfigs(Output.of(ipv6AccessConfigs));
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(InstanceFromMachineImageNetworkInterfaceIpv6AccessConfigArgs... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }

        /**
         * @param ipv6AccessType One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            $.ipv6AccessType = ipv6AccessType;
            return this;
        }

        /**
         * @param ipv6AccessType One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessType(String ipv6AccessType) {
            return ipv6AccessType(Output.of(ipv6AccessType));
        }

        /**
         * @param ipv6Address An IPv6 internal network address for this network interface. If not specified, Google Cloud will automatically assign an internal IPv6 address from the instance&#39;s subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address An IPv6 internal network address for this network interface. If not specified, Google Cloud will automatically assign an internal IPv6 address from the instance&#39;s subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        /**
         * @param name A unique name for the resource, required by GCE.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by GCE.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The name or self_link of the network attached to this interface.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name or self_link of the network attached to this interface.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkAttachment The URL of the network attachment that this interface should connect to in the following format: projects/{projectNumber}/regions/{region_name}/networkAttachments/{network_attachment_name}.
         * 
         * @return builder
         * 
         */
        public Builder networkAttachment(@Nullable Output<String> networkAttachment) {
            $.networkAttachment = networkAttachment;
            return this;
        }

        /**
         * @param networkAttachment The URL of the network attachment that this interface should connect to in the following format: projects/{projectNumber}/regions/{region_name}/networkAttachments/{network_attachment_name}.
         * 
         * @return builder
         * 
         */
        public Builder networkAttachment(String networkAttachment) {
            return networkAttachment(Output.of(networkAttachment));
        }

        /**
         * @param networkIp The private IP address assigned to the instance.
         * 
         * @return builder
         * 
         */
        public Builder networkIp(@Nullable Output<String> networkIp) {
            $.networkIp = networkIp;
            return this;
        }

        /**
         * @param networkIp The private IP address assigned to the instance.
         * 
         * @return builder
         * 
         */
        public Builder networkIp(String networkIp) {
            return networkIp(Output.of(networkIp));
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. Possible values:GVNIC, VIRTIO_NET, IDPF, MRDMA, and IRDMA
         * 
         * @return builder
         * 
         */
        public Builder nicType(@Nullable Output<String> nicType) {
            $.nicType = nicType;
            return this;
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. Possible values:GVNIC, VIRTIO_NET, IDPF, MRDMA, and IRDMA
         * 
         * @return builder
         * 
         */
        public Builder nicType(String nicType) {
            return nicType(Output.of(nicType));
        }

        /**
         * @param queueCount The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
         * 
         * @return builder
         * 
         */
        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            $.queueCount = queueCount;
            return this;
        }

        /**
         * @param queueCount The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
         * 
         * @return builder
         * 
         */
        public Builder queueCount(Integer queueCount) {
            return queueCount(Output.of(queueCount));
        }

        /**
         * @param securityPolicy A full or partial URL to a security policy to add to this instance. If this field is set to an empty string it will remove the associated security policy.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicy(@Nullable Output<String> securityPolicy) {
            $.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * @param securityPolicy A full or partial URL to a security policy to add to this instance. If this field is set to an empty string it will remove the associated security policy.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicy(String securityPolicy) {
            return securityPolicy(Output.of(securityPolicy));
        }

        /**
         * @param stackType The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used.
         * 
         * @return builder
         * 
         */
        public Builder stackType(@Nullable Output<String> stackType) {
            $.stackType = stackType;
            return this;
        }

        /**
         * @param stackType The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used.
         * 
         * @return builder
         * 
         */
        public Builder stackType(String stackType) {
            return stackType(Output.of(stackType));
        }

        /**
         * @param subnetwork The name or self_link of the subnetwork attached to this interface.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The name or self_link of the subnetwork attached to this interface.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param subnetworkProject The project in which the subnetwork belongs.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkProject(@Nullable Output<String> subnetworkProject) {
            $.subnetworkProject = subnetworkProject;
            return this;
        }

        /**
         * @param subnetworkProject The project in which the subnetwork belongs.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkProject(String subnetworkProject) {
            return subnetworkProject(Output.of(subnetworkProject));
        }

        public InstanceFromMachineImageNetworkInterfaceArgs build() {
            return $;
        }
    }

}
