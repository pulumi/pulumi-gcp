# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetPeeredDnsDomainResult',
    'AwaitableGetPeeredDnsDomainResult',
    'get_peered_dns_domain',
    'get_peered_dns_domain_output',
]

@pulumi.output_type
class GetPeeredDnsDomainResult:
    """
    A collection of values returned by getPeeredDnsDomain.
    """
    def __init__(__self__, dns_suffix=None, id=None, name=None, network=None, parent=None, project=None, service=None):
        if dns_suffix and not isinstance(dns_suffix, str):
            raise TypeError("Expected argument 'dns_suffix' to be a str")
        pulumi.set(__self__, "dns_suffix", dns_suffix)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network and not isinstance(network, str):
            raise TypeError("Expected argument 'network' to be a str")
        pulumi.set(__self__, "network", network)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if service and not isinstance(service, str):
            raise TypeError("Expected argument 'service' to be a str")
        pulumi.set(__self__, "service", service)

    @property
    @pulumi.getter(name="dnsSuffix")
    def dns_suffix(self) -> str:
        return pulumi.get(self, "dns_suffix")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> str:
        return pulumi.get(self, "network")

    @property
    @pulumi.getter
    def parent(self) -> str:
        return pulumi.get(self, "parent")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def service(self) -> str:
        return pulumi.get(self, "service")


class AwaitableGetPeeredDnsDomainResult(GetPeeredDnsDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPeeredDnsDomainResult(
            dns_suffix=self.dns_suffix,
            id=self.id,
            name=self.name,
            network=self.network,
            parent=self.parent,
            project=self.project,
            service=self.service)


def get_peered_dns_domain(name: Optional[str] = None,
                          network: Optional[str] = None,
                          project: Optional[str] = None,
                          service: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPeeredDnsDomainResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['network'] = network
    __args__['project'] = project
    __args__['service'] = service
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('gcp:servicenetworking/getPeeredDnsDomain:getPeeredDnsDomain', __args__, opts=opts, typ=GetPeeredDnsDomainResult).value

    return AwaitableGetPeeredDnsDomainResult(
        dns_suffix=__ret__.dns_suffix,
        id=__ret__.id,
        name=__ret__.name,
        network=__ret__.network,
        parent=__ret__.parent,
        project=__ret__.project,
        service=__ret__.service)


@_utilities.lift_output_func(get_peered_dns_domain)
def get_peered_dns_domain_output(name: Optional[pulumi.Input[str]] = None,
                                 network: Optional[pulumi.Input[str]] = None,
                                 project: Optional[pulumi.Input[str]] = None,
                                 service: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPeeredDnsDomainResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...