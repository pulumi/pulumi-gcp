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
    'GetNetworkPolicyResult',
    'AwaitableGetNetworkPolicyResult',
    'get_network_policy',
    'get_network_policy_output',
]

@pulumi.output_type
class GetNetworkPolicyResult:
    """
    A collection of values returned by getNetworkPolicy.
    """
    def __init__(__self__, create_time=None, description=None, edge_services_cidr=None, external_ips=None, id=None, internet_accesses=None, location=None, name=None, project=None, uid=None, update_time=None, vmware_engine_network=None, vmware_engine_network_canonical=None):
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if edge_services_cidr and not isinstance(edge_services_cidr, str):
            raise TypeError("Expected argument 'edge_services_cidr' to be a str")
        pulumi.set(__self__, "edge_services_cidr", edge_services_cidr)
        if external_ips and not isinstance(external_ips, list):
            raise TypeError("Expected argument 'external_ips' to be a list")
        pulumi.set(__self__, "external_ips", external_ips)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if internet_accesses and not isinstance(internet_accesses, list):
            raise TypeError("Expected argument 'internet_accesses' to be a list")
        pulumi.set(__self__, "internet_accesses", internet_accesses)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if uid and not isinstance(uid, str):
            raise TypeError("Expected argument 'uid' to be a str")
        pulumi.set(__self__, "uid", uid)
        if update_time and not isinstance(update_time, str):
            raise TypeError("Expected argument 'update_time' to be a str")
        pulumi.set(__self__, "update_time", update_time)
        if vmware_engine_network and not isinstance(vmware_engine_network, str):
            raise TypeError("Expected argument 'vmware_engine_network' to be a str")
        pulumi.set(__self__, "vmware_engine_network", vmware_engine_network)
        if vmware_engine_network_canonical and not isinstance(vmware_engine_network_canonical, str):
            raise TypeError("Expected argument 'vmware_engine_network_canonical' to be a str")
        pulumi.set(__self__, "vmware_engine_network_canonical", vmware_engine_network_canonical)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="edgeServicesCidr")
    def edge_services_cidr(self) -> _builtins.str:
        return pulumi.get(self, "edge_services_cidr")

    @_builtins.property
    @pulumi.getter(name="externalIps")
    def external_ips(self) -> Sequence['outputs.GetNetworkPolicyExternalIpResult']:
        return pulumi.get(self, "external_ips")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="internetAccesses")
    def internet_accesses(self) -> Sequence['outputs.GetNetworkPolicyInternetAccessResult']:
        return pulumi.get(self, "internet_accesses")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> _builtins.str:
        return pulumi.get(self, "uid")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> _builtins.str:
        return pulumi.get(self, "update_time")

    @_builtins.property
    @pulumi.getter(name="vmwareEngineNetwork")
    def vmware_engine_network(self) -> _builtins.str:
        return pulumi.get(self, "vmware_engine_network")

    @_builtins.property
    @pulumi.getter(name="vmwareEngineNetworkCanonical")
    def vmware_engine_network_canonical(self) -> _builtins.str:
        return pulumi.get(self, "vmware_engine_network_canonical")


class AwaitableGetNetworkPolicyResult(GetNetworkPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkPolicyResult(
            create_time=self.create_time,
            description=self.description,
            edge_services_cidr=self.edge_services_cidr,
            external_ips=self.external_ips,
            id=self.id,
            internet_accesses=self.internet_accesses,
            location=self.location,
            name=self.name,
            project=self.project,
            uid=self.uid,
            update_time=self.update_time,
            vmware_engine_network=self.vmware_engine_network,
            vmware_engine_network_canonical=self.vmware_engine_network_canonical)


def get_network_policy(location: Optional[_builtins.str] = None,
                       name: Optional[_builtins.str] = None,
                       project: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkPolicyResult:
    """
    Use this data source to get details about a network policy resource.

    To get more information about network policy, see:
    * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_network_policy = gcp.vmwareengine.get_network_policy(name="my-network-policy",
        location="us-central1")
    ```


    :param _builtins.str location: Location of the resource.
    :param _builtins.str name: Name of the resource.
    """
    __args__ = dict()
    __args__['location'] = location
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:vmwareengine/getNetworkPolicy:getNetworkPolicy', __args__, opts=opts, typ=GetNetworkPolicyResult).value

    return AwaitableGetNetworkPolicyResult(
        create_time=pulumi.get(__ret__, 'create_time'),
        description=pulumi.get(__ret__, 'description'),
        edge_services_cidr=pulumi.get(__ret__, 'edge_services_cidr'),
        external_ips=pulumi.get(__ret__, 'external_ips'),
        id=pulumi.get(__ret__, 'id'),
        internet_accesses=pulumi.get(__ret__, 'internet_accesses'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        uid=pulumi.get(__ret__, 'uid'),
        update_time=pulumi.get(__ret__, 'update_time'),
        vmware_engine_network=pulumi.get(__ret__, 'vmware_engine_network'),
        vmware_engine_network_canonical=pulumi.get(__ret__, 'vmware_engine_network_canonical'))
def get_network_policy_output(location: Optional[pulumi.Input[_builtins.str]] = None,
                              name: Optional[pulumi.Input[_builtins.str]] = None,
                              project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworkPolicyResult]:
    """
    Use this data source to get details about a network policy resource.

    To get more information about network policy, see:
    * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_network_policy = gcp.vmwareengine.get_network_policy(name="my-network-policy",
        location="us-central1")
    ```


    :param _builtins.str location: Location of the resource.
    :param _builtins.str name: Name of the resource.
    """
    __args__ = dict()
    __args__['location'] = location
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:vmwareengine/getNetworkPolicy:getNetworkPolicy', __args__, opts=opts, typ=GetNetworkPolicyResult)
    return __ret__.apply(lambda __response__: GetNetworkPolicyResult(
        create_time=pulumi.get(__response__, 'create_time'),
        description=pulumi.get(__response__, 'description'),
        edge_services_cidr=pulumi.get(__response__, 'edge_services_cidr'),
        external_ips=pulumi.get(__response__, 'external_ips'),
        id=pulumi.get(__response__, 'id'),
        internet_accesses=pulumi.get(__response__, 'internet_accesses'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        uid=pulumi.get(__response__, 'uid'),
        update_time=pulumi.get(__response__, 'update_time'),
        vmware_engine_network=pulumi.get(__response__, 'vmware_engine_network'),
        vmware_engine_network_canonical=pulumi.get(__response__, 'vmware_engine_network_canonical')))
