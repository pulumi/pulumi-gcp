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

__all__ = [
    'GetRouterNatResult',
    'AwaitableGetRouterNatResult',
    'get_router_nat',
    'get_router_nat_output',
]

@pulumi.output_type
class GetRouterNatResult:
    """
    A collection of values returned by getRouterNat.
    """
    def __init__(__self__, drain_nat_ips=None, enable_dynamic_port_allocation=None, enable_endpoint_independent_mapping=None, icmp_idle_timeout_sec=None, id=None, log_configs=None, max_ports_per_vm=None, min_ports_per_vm=None, name=None, nat_ip_allocate_option=None, nat_ips=None, project=None, region=None, router=None, rules=None, source_subnetwork_ip_ranges_to_nat=None, subnetworks=None, tcp_established_idle_timeout_sec=None, tcp_transitory_idle_timeout_sec=None, udp_idle_timeout_sec=None):
        if drain_nat_ips and not isinstance(drain_nat_ips, list):
            raise TypeError("Expected argument 'drain_nat_ips' to be a list")
        pulumi.set(__self__, "drain_nat_ips", drain_nat_ips)
        if enable_dynamic_port_allocation and not isinstance(enable_dynamic_port_allocation, bool):
            raise TypeError("Expected argument 'enable_dynamic_port_allocation' to be a bool")
        pulumi.set(__self__, "enable_dynamic_port_allocation", enable_dynamic_port_allocation)
        if enable_endpoint_independent_mapping and not isinstance(enable_endpoint_independent_mapping, bool):
            raise TypeError("Expected argument 'enable_endpoint_independent_mapping' to be a bool")
        pulumi.set(__self__, "enable_endpoint_independent_mapping", enable_endpoint_independent_mapping)
        if icmp_idle_timeout_sec and not isinstance(icmp_idle_timeout_sec, int):
            raise TypeError("Expected argument 'icmp_idle_timeout_sec' to be a int")
        pulumi.set(__self__, "icmp_idle_timeout_sec", icmp_idle_timeout_sec)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if log_configs and not isinstance(log_configs, list):
            raise TypeError("Expected argument 'log_configs' to be a list")
        pulumi.set(__self__, "log_configs", log_configs)
        if max_ports_per_vm and not isinstance(max_ports_per_vm, int):
            raise TypeError("Expected argument 'max_ports_per_vm' to be a int")
        pulumi.set(__self__, "max_ports_per_vm", max_ports_per_vm)
        if min_ports_per_vm and not isinstance(min_ports_per_vm, int):
            raise TypeError("Expected argument 'min_ports_per_vm' to be a int")
        pulumi.set(__self__, "min_ports_per_vm", min_ports_per_vm)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nat_ip_allocate_option and not isinstance(nat_ip_allocate_option, str):
            raise TypeError("Expected argument 'nat_ip_allocate_option' to be a str")
        pulumi.set(__self__, "nat_ip_allocate_option", nat_ip_allocate_option)
        if nat_ips and not isinstance(nat_ips, list):
            raise TypeError("Expected argument 'nat_ips' to be a list")
        pulumi.set(__self__, "nat_ips", nat_ips)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if router and not isinstance(router, str):
            raise TypeError("Expected argument 'router' to be a str")
        pulumi.set(__self__, "router", router)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if source_subnetwork_ip_ranges_to_nat and not isinstance(source_subnetwork_ip_ranges_to_nat, str):
            raise TypeError("Expected argument 'source_subnetwork_ip_ranges_to_nat' to be a str")
        pulumi.set(__self__, "source_subnetwork_ip_ranges_to_nat", source_subnetwork_ip_ranges_to_nat)
        if subnetworks and not isinstance(subnetworks, list):
            raise TypeError("Expected argument 'subnetworks' to be a list")
        pulumi.set(__self__, "subnetworks", subnetworks)
        if tcp_established_idle_timeout_sec and not isinstance(tcp_established_idle_timeout_sec, int):
            raise TypeError("Expected argument 'tcp_established_idle_timeout_sec' to be a int")
        pulumi.set(__self__, "tcp_established_idle_timeout_sec", tcp_established_idle_timeout_sec)
        if tcp_transitory_idle_timeout_sec and not isinstance(tcp_transitory_idle_timeout_sec, int):
            raise TypeError("Expected argument 'tcp_transitory_idle_timeout_sec' to be a int")
        pulumi.set(__self__, "tcp_transitory_idle_timeout_sec", tcp_transitory_idle_timeout_sec)
        if udp_idle_timeout_sec and not isinstance(udp_idle_timeout_sec, int):
            raise TypeError("Expected argument 'udp_idle_timeout_sec' to be a int")
        pulumi.set(__self__, "udp_idle_timeout_sec", udp_idle_timeout_sec)

    @property
    @pulumi.getter(name="drainNatIps")
    def drain_nat_ips(self) -> Sequence[str]:
        return pulumi.get(self, "drain_nat_ips")

    @property
    @pulumi.getter(name="enableDynamicPortAllocation")
    def enable_dynamic_port_allocation(self) -> bool:
        return pulumi.get(self, "enable_dynamic_port_allocation")

    @property
    @pulumi.getter(name="enableEndpointIndependentMapping")
    def enable_endpoint_independent_mapping(self) -> bool:
        return pulumi.get(self, "enable_endpoint_independent_mapping")

    @property
    @pulumi.getter(name="icmpIdleTimeoutSec")
    def icmp_idle_timeout_sec(self) -> int:
        return pulumi.get(self, "icmp_idle_timeout_sec")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="logConfigs")
    def log_configs(self) -> Sequence['outputs.GetRouterNatLogConfigResult']:
        return pulumi.get(self, "log_configs")

    @property
    @pulumi.getter(name="maxPortsPerVm")
    def max_ports_per_vm(self) -> int:
        return pulumi.get(self, "max_ports_per_vm")

    @property
    @pulumi.getter(name="minPortsPerVm")
    def min_ports_per_vm(self) -> int:
        return pulumi.get(self, "min_ports_per_vm")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="natIpAllocateOption")
    def nat_ip_allocate_option(self) -> str:
        return pulumi.get(self, "nat_ip_allocate_option")

    @property
    @pulumi.getter(name="natIps")
    def nat_ips(self) -> Sequence[str]:
        return pulumi.get(self, "nat_ips")

    @property
    @pulumi.getter
    def project(self) -> Optional[str]:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def router(self) -> str:
        return pulumi.get(self, "router")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetRouterNatRuleResult']:
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="sourceSubnetworkIpRangesToNat")
    def source_subnetwork_ip_ranges_to_nat(self) -> str:
        return pulumi.get(self, "source_subnetwork_ip_ranges_to_nat")

    @property
    @pulumi.getter
    def subnetworks(self) -> Sequence['outputs.GetRouterNatSubnetworkResult']:
        return pulumi.get(self, "subnetworks")

    @property
    @pulumi.getter(name="tcpEstablishedIdleTimeoutSec")
    def tcp_established_idle_timeout_sec(self) -> int:
        return pulumi.get(self, "tcp_established_idle_timeout_sec")

    @property
    @pulumi.getter(name="tcpTransitoryIdleTimeoutSec")
    def tcp_transitory_idle_timeout_sec(self) -> int:
        return pulumi.get(self, "tcp_transitory_idle_timeout_sec")

    @property
    @pulumi.getter(name="udpIdleTimeoutSec")
    def udp_idle_timeout_sec(self) -> int:
        return pulumi.get(self, "udp_idle_timeout_sec")


class AwaitableGetRouterNatResult(GetRouterNatResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRouterNatResult(
            drain_nat_ips=self.drain_nat_ips,
            enable_dynamic_port_allocation=self.enable_dynamic_port_allocation,
            enable_endpoint_independent_mapping=self.enable_endpoint_independent_mapping,
            icmp_idle_timeout_sec=self.icmp_idle_timeout_sec,
            id=self.id,
            log_configs=self.log_configs,
            max_ports_per_vm=self.max_ports_per_vm,
            min_ports_per_vm=self.min_ports_per_vm,
            name=self.name,
            nat_ip_allocate_option=self.nat_ip_allocate_option,
            nat_ips=self.nat_ips,
            project=self.project,
            region=self.region,
            router=self.router,
            rules=self.rules,
            source_subnetwork_ip_ranges_to_nat=self.source_subnetwork_ip_ranges_to_nat,
            subnetworks=self.subnetworks,
            tcp_established_idle_timeout_sec=self.tcp_established_idle_timeout_sec,
            tcp_transitory_idle_timeout_sec=self.tcp_transitory_idle_timeout_sec,
            udp_idle_timeout_sec=self.udp_idle_timeout_sec)


def get_router_nat(name: Optional[str] = None,
                   project: Optional[str] = None,
                   region: Optional[str] = None,
                   router: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRouterNatResult:
    """
    To get more information about Snapshot, see:

    * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
    * How-to Guides
        * [Official Documentation](https://cloud.google.com/router/docs/)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    foo = gcp.compute.get_router_nat(name="my-nat",
        router="my-router")
    ```


    :param str name: Name of the NAT service. The name must be 1-63 characters long and
           comply with RFC1035.
    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the provider project is used.
    :param str region: Region where the router and NAT reside.
    :param str router: The name of the Cloud Router in which this NAT will be configured.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    __args__['router'] = router
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getRouterNat:getRouterNat', __args__, opts=opts, typ=GetRouterNatResult).value

    return AwaitableGetRouterNatResult(
        drain_nat_ips=__ret__.drain_nat_ips,
        enable_dynamic_port_allocation=__ret__.enable_dynamic_port_allocation,
        enable_endpoint_independent_mapping=__ret__.enable_endpoint_independent_mapping,
        icmp_idle_timeout_sec=__ret__.icmp_idle_timeout_sec,
        id=__ret__.id,
        log_configs=__ret__.log_configs,
        max_ports_per_vm=__ret__.max_ports_per_vm,
        min_ports_per_vm=__ret__.min_ports_per_vm,
        name=__ret__.name,
        nat_ip_allocate_option=__ret__.nat_ip_allocate_option,
        nat_ips=__ret__.nat_ips,
        project=__ret__.project,
        region=__ret__.region,
        router=__ret__.router,
        rules=__ret__.rules,
        source_subnetwork_ip_ranges_to_nat=__ret__.source_subnetwork_ip_ranges_to_nat,
        subnetworks=__ret__.subnetworks,
        tcp_established_idle_timeout_sec=__ret__.tcp_established_idle_timeout_sec,
        tcp_transitory_idle_timeout_sec=__ret__.tcp_transitory_idle_timeout_sec,
        udp_idle_timeout_sec=__ret__.udp_idle_timeout_sec)


@_utilities.lift_output_func(get_router_nat)
def get_router_nat_output(name: Optional[pulumi.Input[str]] = None,
                          project: Optional[pulumi.Input[Optional[str]]] = None,
                          region: Optional[pulumi.Input[Optional[str]]] = None,
                          router: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRouterNatResult]:
    """
    To get more information about Snapshot, see:

    * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
    * How-to Guides
        * [Official Documentation](https://cloud.google.com/router/docs/)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    foo = gcp.compute.get_router_nat(name="my-nat",
        router="my-router")
    ```


    :param str name: Name of the NAT service. The name must be 1-63 characters long and
           comply with RFC1035.
    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the provider project is used.
    :param str region: Region where the router and NAT reside.
    :param str router: The name of the Cloud Router in which this NAT will be configured.
    """
    ...