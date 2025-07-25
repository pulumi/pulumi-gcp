# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs

__all__ = [
    'GetSubnetResult',
    'AwaitableGetSubnetResult',
    'get_subnet',
    'get_subnet_output',
]

@pulumi.output_type
class GetSubnetResult:
    """
    A collection of values returned by getSubnet.
    """
    def __init__(__self__, create_time=None, dhcp_address_ranges=None, gateway_id=None, gateway_ip=None, id=None, ip_cidr_range=None, name=None, parent=None, standard_config=None, state=None, type=None, uid=None, update_time=None, vlan_id=None):
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if dhcp_address_ranges and not isinstance(dhcp_address_ranges, list):
            raise TypeError("Expected argument 'dhcp_address_ranges' to be a list")
        pulumi.set(__self__, "dhcp_address_ranges", dhcp_address_ranges)
        if gateway_id and not isinstance(gateway_id, str):
            raise TypeError("Expected argument 'gateway_id' to be a str")
        pulumi.set(__self__, "gateway_id", gateway_id)
        if gateway_ip and not isinstance(gateway_ip, str):
            raise TypeError("Expected argument 'gateway_ip' to be a str")
        pulumi.set(__self__, "gateway_ip", gateway_ip)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_cidr_range and not isinstance(ip_cidr_range, str):
            raise TypeError("Expected argument 'ip_cidr_range' to be a str")
        pulumi.set(__self__, "ip_cidr_range", ip_cidr_range)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)
        if standard_config and not isinstance(standard_config, bool):
            raise TypeError("Expected argument 'standard_config' to be a bool")
        pulumi.set(__self__, "standard_config", standard_config)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if uid and not isinstance(uid, str):
            raise TypeError("Expected argument 'uid' to be a str")
        pulumi.set(__self__, "uid", uid)
        if update_time and not isinstance(update_time, str):
            raise TypeError("Expected argument 'update_time' to be a str")
        pulumi.set(__self__, "update_time", update_time)
        if vlan_id and not isinstance(vlan_id, int):
            raise TypeError("Expected argument 'vlan_id' to be a int")
        pulumi.set(__self__, "vlan_id", vlan_id)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="dhcpAddressRanges")
    def dhcp_address_ranges(self) -> Sequence['outputs.GetSubnetDhcpAddressRangeResult']:
        return pulumi.get(self, "dhcp_address_ranges")

    @_builtins.property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> _builtins.str:
        return pulumi.get(self, "gateway_id")

    @_builtins.property
    @pulumi.getter(name="gatewayIp")
    def gateway_ip(self) -> _builtins.str:
        return pulumi.get(self, "gateway_ip")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="ipCidrRange")
    def ip_cidr_range(self) -> _builtins.str:
        return pulumi.get(self, "ip_cidr_range")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> _builtins.str:
        return pulumi.get(self, "parent")

    @_builtins.property
    @pulumi.getter(name="standardConfig")
    def standard_config(self) -> _builtins.bool:
        return pulumi.get(self, "standard_config")

    @_builtins.property
    @pulumi.getter
    def state(self) -> _builtins.str:
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> _builtins.str:
        return pulumi.get(self, "uid")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> _builtins.str:
        return pulumi.get(self, "update_time")

    @_builtins.property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> _builtins.int:
        return pulumi.get(self, "vlan_id")


class AwaitableGetSubnetResult(GetSubnetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubnetResult(
            create_time=self.create_time,
            dhcp_address_ranges=self.dhcp_address_ranges,
            gateway_id=self.gateway_id,
            gateway_ip=self.gateway_ip,
            id=self.id,
            ip_cidr_range=self.ip_cidr_range,
            name=self.name,
            parent=self.parent,
            standard_config=self.standard_config,
            state=self.state,
            type=self.type,
            uid=self.uid,
            update_time=self.update_time,
            vlan_id=self.vlan_id)


def get_subnet(name: Optional[_builtins.str] = None,
               parent: Optional[_builtins.str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubnetResult:
    """
    Use this data source to get details about a subnet. Management subnets support only read operations and should be configured through this data source. User defined subnets can be configured using the resource as well as the datasource.

    To get more information about private cloud subnet, see:
    * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_subnet = gcp.vmwareengine.get_subnet(name="service-1",
        parent="project/my-project/locations/us-west1-a/privateClouds/my-cloud")
    ```


    :param _builtins.str name: Name of the resource. 
           UserDefined subnets are named in the format of "service-n", where n ranges from 1 to 5.
           Management subnets have arbitary names including "vmotion", "vsan", "system-management" etc. More details about subnet names can be found on the cloud console.
    :param _builtins.str parent: The resource name of the private cloud that this subnet belongs.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['parent'] = parent
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:vmwareengine/getSubnet:getSubnet', __args__, opts=opts, typ=GetSubnetResult).value

    return AwaitableGetSubnetResult(
        create_time=pulumi.get(__ret__, 'create_time'),
        dhcp_address_ranges=pulumi.get(__ret__, 'dhcp_address_ranges'),
        gateway_id=pulumi.get(__ret__, 'gateway_id'),
        gateway_ip=pulumi.get(__ret__, 'gateway_ip'),
        id=pulumi.get(__ret__, 'id'),
        ip_cidr_range=pulumi.get(__ret__, 'ip_cidr_range'),
        name=pulumi.get(__ret__, 'name'),
        parent=pulumi.get(__ret__, 'parent'),
        standard_config=pulumi.get(__ret__, 'standard_config'),
        state=pulumi.get(__ret__, 'state'),
        type=pulumi.get(__ret__, 'type'),
        uid=pulumi.get(__ret__, 'uid'),
        update_time=pulumi.get(__ret__, 'update_time'),
        vlan_id=pulumi.get(__ret__, 'vlan_id'))
def get_subnet_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                      parent: Optional[pulumi.Input[_builtins.str]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSubnetResult]:
    """
    Use this data source to get details about a subnet. Management subnets support only read operations and should be configured through this data source. User defined subnets can be configured using the resource as well as the datasource.

    To get more information about private cloud subnet, see:
    * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_subnet = gcp.vmwareengine.get_subnet(name="service-1",
        parent="project/my-project/locations/us-west1-a/privateClouds/my-cloud")
    ```


    :param _builtins.str name: Name of the resource. 
           UserDefined subnets are named in the format of "service-n", where n ranges from 1 to 5.
           Management subnets have arbitary names including "vmotion", "vsan", "system-management" etc. More details about subnet names can be found on the cloud console.
    :param _builtins.str parent: The resource name of the private cloud that this subnet belongs.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['parent'] = parent
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:vmwareengine/getSubnet:getSubnet', __args__, opts=opts, typ=GetSubnetResult)
    return __ret__.apply(lambda __response__: GetSubnetResult(
        create_time=pulumi.get(__response__, 'create_time'),
        dhcp_address_ranges=pulumi.get(__response__, 'dhcp_address_ranges'),
        gateway_id=pulumi.get(__response__, 'gateway_id'),
        gateway_ip=pulumi.get(__response__, 'gateway_ip'),
        id=pulumi.get(__response__, 'id'),
        ip_cidr_range=pulumi.get(__response__, 'ip_cidr_range'),
        name=pulumi.get(__response__, 'name'),
        parent=pulumi.get(__response__, 'parent'),
        standard_config=pulumi.get(__response__, 'standard_config'),
        state=pulumi.get(__response__, 'state'),
        type=pulumi.get(__response__, 'type'),
        uid=pulumi.get(__response__, 'uid'),
        update_time=pulumi.get(__response__, 'update_time'),
        vlan_id=pulumi.get(__response__, 'vlan_id')))
