# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SubnetArgs', 'Subnet']

@pulumi.input_type
class SubnetArgs:
    def __init__(__self__, *,
                 ip_cidr_range: pulumi.Input[str],
                 parent: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Subnet resource.
        :param pulumi.Input[str] ip_cidr_range: The IP address range of the subnet in CIDR format.
        :param pulumi.Input[str] parent: The resource name of the private cloud to create a new subnet in.
               Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
               For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        :param pulumi.Input[str] name: The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
               where n ranges from 1 to 5.
               
               
               - - -
        """
        pulumi.set(__self__, "ip_cidr_range", ip_cidr_range)
        pulumi.set(__self__, "parent", parent)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="ipCidrRange")
    def ip_cidr_range(self) -> pulumi.Input[str]:
        """
        The IP address range of the subnet in CIDR format.
        """
        return pulumi.get(self, "ip_cidr_range")

    @ip_cidr_range.setter
    def ip_cidr_range(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip_cidr_range", value)

    @property
    @pulumi.getter
    def parent(self) -> pulumi.Input[str]:
        """
        The resource name of the private cloud to create a new subnet in.
        Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
        For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: pulumi.Input[str]):
        pulumi.set(self, "parent", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
        where n ranges from 1 to 5.


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SubnetState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 dhcp_address_ranges: Optional[pulumi.Input[Sequence[pulumi.Input['SubnetDhcpAddressRangeArgs']]]] = None,
                 gateway_id: Optional[pulumi.Input[str]] = None,
                 gateway_ip: Optional[pulumi.Input[str]] = None,
                 ip_cidr_range: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 standard_config: Optional[pulumi.Input[bool]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 update_time: Optional[pulumi.Input[str]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Subnet resources.
        :param pulumi.Input[str] create_time: Creation time of this resource.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
               up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[Sequence[pulumi.Input['SubnetDhcpAddressRangeArgs']]] dhcp_address_ranges: DHCP address ranges.
               Structure is documented below.
        :param pulumi.Input[str] gateway_id: The canonical identifier of the logical router that this subnet is attached to.
        :param pulumi.Input[str] gateway_ip: The IP address of the gateway of this subnet. Must fall within the IP prefix defined above.
        :param pulumi.Input[str] ip_cidr_range: The IP address range of the subnet in CIDR format.
        :param pulumi.Input[str] name: The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
               where n ranges from 1 to 5.
               
               
               - - -
        :param pulumi.Input[str] parent: The resource name of the private cloud to create a new subnet in.
               Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
               For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        :param pulumi.Input[bool] standard_config: Whether the NSX-T configuration in the backend follows the standard configuration supported by Google Cloud.
               If false, the subnet cannot be modified through Google Cloud, only through NSX-T directly.
        :param pulumi.Input[str] state: State of the subnet.
        :param pulumi.Input[str] type: The type of the subnet.
        :param pulumi.Input[str] uid: System-generated unique identifier for the resource.
        :param pulumi.Input[str] update_time: Last updated time of this resource.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
               fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[int] vlan_id: VLAN ID of the VLAN on which the subnet is configured.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if dhcp_address_ranges is not None:
            pulumi.set(__self__, "dhcp_address_ranges", dhcp_address_ranges)
        if gateway_id is not None:
            pulumi.set(__self__, "gateway_id", gateway_id)
        if gateway_ip is not None:
            pulumi.set(__self__, "gateway_ip", gateway_ip)
        if ip_cidr_range is not None:
            pulumi.set(__self__, "ip_cidr_range", ip_cidr_range)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if standard_config is not None:
            pulumi.set(__self__, "standard_config", standard_config)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Creation time of this resource.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="dhcpAddressRanges")
    def dhcp_address_ranges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SubnetDhcpAddressRangeArgs']]]]:
        """
        DHCP address ranges.
        Structure is documented below.
        """
        return pulumi.get(self, "dhcp_address_ranges")

    @dhcp_address_ranges.setter
    def dhcp_address_ranges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SubnetDhcpAddressRangeArgs']]]]):
        pulumi.set(self, "dhcp_address_ranges", value)

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The canonical identifier of the logical router that this subnet is attached to.
        """
        return pulumi.get(self, "gateway_id")

    @gateway_id.setter
    def gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway_id", value)

    @property
    @pulumi.getter(name="gatewayIp")
    def gateway_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the gateway of this subnet. Must fall within the IP prefix defined above.
        """
        return pulumi.get(self, "gateway_ip")

    @gateway_ip.setter
    def gateway_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway_ip", value)

    @property
    @pulumi.getter(name="ipCidrRange")
    def ip_cidr_range(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address range of the subnet in CIDR format.
        """
        return pulumi.get(self, "ip_cidr_range")

    @ip_cidr_range.setter
    def ip_cidr_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_cidr_range", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
        where n ranges from 1 to 5.


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the private cloud to create a new subnet in.
        Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
        For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent", value)

    @property
    @pulumi.getter(name="standardConfig")
    def standard_config(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the NSX-T configuration in the backend follows the standard configuration supported by Google Cloud.
        If false, the subnet cannot be modified through Google Cloud, only through NSX-T directly.
        """
        return pulumi.get(self, "standard_config")

    @standard_config.setter
    def standard_config(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "standard_config", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of the subnet.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the subnet.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[str]]:
        """
        System-generated unique identifier for the resource.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uid", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        """
        Last updated time of this resource.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        """
        VLAN ID of the VLAN on which the subnet is configured.
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


class Subnet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_cidr_range: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Subnet in a private cloud. A Private Cloud contains two types of subnets: `management` subnets (such as vMotion) that
        are read-only,and `userDefined`, which can also be updated. This resource should be used to read and update `userDefined`
        subnets. To read `management` subnets, please utilize the subnet data source.

        To get more information about Subnet, see:

        * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)

        ## Example Usage
        ### Vmware Engine Subnet User Defined

        ```python
        import pulumi
        import pulumi_gcp as gcp

        subnet_nw = gcp.vmwareengine.Network("subnet-nw",
            location="global",
            type="STANDARD",
            description="PC network description.")
        subnet_pc = gcp.vmwareengine.PrivateCloud("subnet-pc",
            location="us-west1-a",
            description="Sample test PC.",
            network_config=gcp.vmwareengine.PrivateCloudNetworkConfigArgs(
                management_cidr="192.168.50.0/24",
                vmware_engine_network=subnet_nw.id,
            ),
            management_cluster=gcp.vmwareengine.PrivateCloudManagementClusterArgs(
                cluster_id="sample-mgmt-cluster",
                node_type_configs=[gcp.vmwareengine.PrivateCloudManagementClusterNodeTypeConfigArgs(
                    node_type_id="standard-72",
                    node_count=3,
                )],
            ))
        vmw_engine_subnet = gcp.vmwareengine.Subnet("vmw-engine-subnet",
            parent=subnet_pc.id,
            ip_cidr_range="192.168.100.0/26")
        ```

        ## Import

        Subnet can be imported using any of these accepted formats* `{{parent}}/subnets/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Subnet using one of the formats above. For exampletf import {

         id = "{{parent}}/subnets/{{name}}"

         to = google_vmwareengine_subnet.default }

        ```sh
         $ pulumi import gcp:vmwareengine/subnet:Subnet When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Subnet can be imported using one of the formats above. For example
        ```

        ```sh
         $ pulumi import gcp:vmwareengine/subnet:Subnet default {{parent}}/subnets/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip_cidr_range: The IP address range of the subnet in CIDR format.
        :param pulumi.Input[str] name: The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
               where n ranges from 1 to 5.
               
               
               - - -
        :param pulumi.Input[str] parent: The resource name of the private cloud to create a new subnet in.
               Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
               For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubnetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Subnet in a private cloud. A Private Cloud contains two types of subnets: `management` subnets (such as vMotion) that
        are read-only,and `userDefined`, which can also be updated. This resource should be used to read and update `userDefined`
        subnets. To read `management` subnets, please utilize the subnet data source.

        To get more information about Subnet, see:

        * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)

        ## Example Usage
        ### Vmware Engine Subnet User Defined

        ```python
        import pulumi
        import pulumi_gcp as gcp

        subnet_nw = gcp.vmwareengine.Network("subnet-nw",
            location="global",
            type="STANDARD",
            description="PC network description.")
        subnet_pc = gcp.vmwareengine.PrivateCloud("subnet-pc",
            location="us-west1-a",
            description="Sample test PC.",
            network_config=gcp.vmwareengine.PrivateCloudNetworkConfigArgs(
                management_cidr="192.168.50.0/24",
                vmware_engine_network=subnet_nw.id,
            ),
            management_cluster=gcp.vmwareengine.PrivateCloudManagementClusterArgs(
                cluster_id="sample-mgmt-cluster",
                node_type_configs=[gcp.vmwareengine.PrivateCloudManagementClusterNodeTypeConfigArgs(
                    node_type_id="standard-72",
                    node_count=3,
                )],
            ))
        vmw_engine_subnet = gcp.vmwareengine.Subnet("vmw-engine-subnet",
            parent=subnet_pc.id,
            ip_cidr_range="192.168.100.0/26")
        ```

        ## Import

        Subnet can be imported using any of these accepted formats* `{{parent}}/subnets/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Subnet using one of the formats above. For exampletf import {

         id = "{{parent}}/subnets/{{name}}"

         to = google_vmwareengine_subnet.default }

        ```sh
         $ pulumi import gcp:vmwareengine/subnet:Subnet When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Subnet can be imported using one of the formats above. For example
        ```

        ```sh
         $ pulumi import gcp:vmwareengine/subnet:Subnet default {{parent}}/subnets/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param SubnetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubnetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_cidr_range: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubnetArgs.__new__(SubnetArgs)

            if ip_cidr_range is None and not opts.urn:
                raise TypeError("Missing required property 'ip_cidr_range'")
            __props__.__dict__["ip_cidr_range"] = ip_cidr_range
            __props__.__dict__["name"] = name
            if parent is None and not opts.urn:
                raise TypeError("Missing required property 'parent'")
            __props__.__dict__["parent"] = parent
            __props__.__dict__["create_time"] = None
            __props__.__dict__["dhcp_address_ranges"] = None
            __props__.__dict__["gateway_id"] = None
            __props__.__dict__["gateway_ip"] = None
            __props__.__dict__["standard_config"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["type"] = None
            __props__.__dict__["uid"] = None
            __props__.__dict__["update_time"] = None
            __props__.__dict__["vlan_id"] = None
        super(Subnet, __self__).__init__(
            'gcp:vmwareengine/subnet:Subnet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            dhcp_address_ranges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SubnetDhcpAddressRangeArgs']]]]] = None,
            gateway_id: Optional[pulumi.Input[str]] = None,
            gateway_ip: Optional[pulumi.Input[str]] = None,
            ip_cidr_range: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent: Optional[pulumi.Input[str]] = None,
            standard_config: Optional[pulumi.Input[bool]] = None,
            state: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uid: Optional[pulumi.Input[str]] = None,
            update_time: Optional[pulumi.Input[str]] = None,
            vlan_id: Optional[pulumi.Input[int]] = None) -> 'Subnet':
        """
        Get an existing Subnet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: Creation time of this resource.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
               up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SubnetDhcpAddressRangeArgs']]]] dhcp_address_ranges: DHCP address ranges.
               Structure is documented below.
        :param pulumi.Input[str] gateway_id: The canonical identifier of the logical router that this subnet is attached to.
        :param pulumi.Input[str] gateway_ip: The IP address of the gateway of this subnet. Must fall within the IP prefix defined above.
        :param pulumi.Input[str] ip_cidr_range: The IP address range of the subnet in CIDR format.
        :param pulumi.Input[str] name: The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
               where n ranges from 1 to 5.
               
               
               - - -
        :param pulumi.Input[str] parent: The resource name of the private cloud to create a new subnet in.
               Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
               For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        :param pulumi.Input[bool] standard_config: Whether the NSX-T configuration in the backend follows the standard configuration supported by Google Cloud.
               If false, the subnet cannot be modified through Google Cloud, only through NSX-T directly.
        :param pulumi.Input[str] state: State of the subnet.
        :param pulumi.Input[str] type: The type of the subnet.
        :param pulumi.Input[str] uid: System-generated unique identifier for the resource.
        :param pulumi.Input[str] update_time: Last updated time of this resource.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
               fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[int] vlan_id: VLAN ID of the VLAN on which the subnet is configured.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubnetState.__new__(_SubnetState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["dhcp_address_ranges"] = dhcp_address_ranges
        __props__.__dict__["gateway_id"] = gateway_id
        __props__.__dict__["gateway_ip"] = gateway_ip
        __props__.__dict__["ip_cidr_range"] = ip_cidr_range
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        __props__.__dict__["standard_config"] = standard_config
        __props__.__dict__["state"] = state
        __props__.__dict__["type"] = type
        __props__.__dict__["uid"] = uid
        __props__.__dict__["update_time"] = update_time
        __props__.__dict__["vlan_id"] = vlan_id
        return Subnet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Creation time of this resource.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dhcpAddressRanges")
    def dhcp_address_ranges(self) -> pulumi.Output[Sequence['outputs.SubnetDhcpAddressRange']]:
        """
        DHCP address ranges.
        Structure is documented below.
        """
        return pulumi.get(self, "dhcp_address_ranges")

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> pulumi.Output[str]:
        """
        The canonical identifier of the logical router that this subnet is attached to.
        """
        return pulumi.get(self, "gateway_id")

    @property
    @pulumi.getter(name="gatewayIp")
    def gateway_ip(self) -> pulumi.Output[str]:
        """
        The IP address of the gateway of this subnet. Must fall within the IP prefix defined above.
        """
        return pulumi.get(self, "gateway_ip")

    @property
    @pulumi.getter(name="ipCidrRange")
    def ip_cidr_range(self) -> pulumi.Output[str]:
        """
        The IP address range of the subnet in CIDR format.
        """
        return pulumi.get(self, "ip_cidr_range")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The ID of the subnet. For userDefined subnets, this name should be in the format of "service-n",
        where n ranges from 1 to 5.


        - - -
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parent(self) -> pulumi.Output[str]:
        """
        The resource name of the private cloud to create a new subnet in.
        Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
        For example: projects/my-project/locations/us-west1-a/privateClouds/my-cloud
        """
        return pulumi.get(self, "parent")

    @property
    @pulumi.getter(name="standardConfig")
    def standard_config(self) -> pulumi.Output[bool]:
        """
        Whether the NSX-T configuration in the backend follows the standard configuration supported by Google Cloud.
        If false, the subnet cannot be modified through Google Cloud, only through NSX-T directly.
        """
        return pulumi.get(self, "standard_config")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of the subnet.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the subnet.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Output[str]:
        """
        System-generated unique identifier for the resource.
        """
        return pulumi.get(self, "uid")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        Last updated time of this resource.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Output[int]:
        """
        VLAN ID of the VLAN on which the subnet is configured.
        """
        return pulumi.get(self, "vlan_id")
