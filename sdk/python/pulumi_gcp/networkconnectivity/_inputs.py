# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'HubRoutingVpcArgs',
    'SpokeLinkedInterconnectAttachmentsArgs',
    'SpokeLinkedRouterApplianceInstancesArgs',
    'SpokeLinkedRouterApplianceInstancesInstanceArgs',
    'SpokeLinkedVpnTunnelsArgs',
]

@pulumi.input_type
class HubRoutingVpcArgs:
    def __init__(__self__, *,
                 uri: Optional[pulumi.Input[str]] = None):
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


@pulumi.input_type
class SpokeLinkedInterconnectAttachmentsArgs:
    def __init__(__self__, *,
                 site_to_site_data_transfer: pulumi.Input[bool],
                 uris: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[bool] site_to_site_data_transfer: A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] uris: The URIs of linked VPN tunnel resources.
        """
        pulumi.set(__self__, "site_to_site_data_transfer", site_to_site_data_transfer)
        pulumi.set(__self__, "uris", uris)

    @property
    @pulumi.getter(name="siteToSiteDataTransfer")
    def site_to_site_data_transfer(self) -> pulumi.Input[bool]:
        """
        A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        return pulumi.get(self, "site_to_site_data_transfer")

    @site_to_site_data_transfer.setter
    def site_to_site_data_transfer(self, value: pulumi.Input[bool]):
        pulumi.set(self, "site_to_site_data_transfer", value)

    @property
    @pulumi.getter
    def uris(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The URIs of linked VPN tunnel resources.
        """
        return pulumi.get(self, "uris")

    @uris.setter
    def uris(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "uris", value)


@pulumi.input_type
class SpokeLinkedRouterApplianceInstancesArgs:
    def __init__(__self__, *,
                 instances: pulumi.Input[Sequence[pulumi.Input['SpokeLinkedRouterApplianceInstancesInstanceArgs']]],
                 site_to_site_data_transfer: pulumi.Input[bool]):
        """
        :param pulumi.Input[Sequence[pulumi.Input['SpokeLinkedRouterApplianceInstancesInstanceArgs']]] instances: The list of router appliance instances
        :param pulumi.Input[bool] site_to_site_data_transfer: A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        pulumi.set(__self__, "instances", instances)
        pulumi.set(__self__, "site_to_site_data_transfer", site_to_site_data_transfer)

    @property
    @pulumi.getter
    def instances(self) -> pulumi.Input[Sequence[pulumi.Input['SpokeLinkedRouterApplianceInstancesInstanceArgs']]]:
        """
        The list of router appliance instances
        """
        return pulumi.get(self, "instances")

    @instances.setter
    def instances(self, value: pulumi.Input[Sequence[pulumi.Input['SpokeLinkedRouterApplianceInstancesInstanceArgs']]]):
        pulumi.set(self, "instances", value)

    @property
    @pulumi.getter(name="siteToSiteDataTransfer")
    def site_to_site_data_transfer(self) -> pulumi.Input[bool]:
        """
        A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        return pulumi.get(self, "site_to_site_data_transfer")

    @site_to_site_data_transfer.setter
    def site_to_site_data_transfer(self, value: pulumi.Input[bool]):
        pulumi.set(self, "site_to_site_data_transfer", value)


@pulumi.input_type
class SpokeLinkedRouterApplianceInstancesInstanceArgs:
    def __init__(__self__, *,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 virtual_machine: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] ip_address: The IP address on the VM to use for peering.
        :param pulumi.Input[str] virtual_machine: The URI of the virtual machine resource
        """
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if virtual_machine is not None:
            pulumi.set(__self__, "virtual_machine", virtual_machine)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address on the VM to use for peering.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="virtualMachine")
    def virtual_machine(self) -> Optional[pulumi.Input[str]]:
        """
        The URI of the virtual machine resource
        """
        return pulumi.get(self, "virtual_machine")

    @virtual_machine.setter
    def virtual_machine(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_machine", value)


@pulumi.input_type
class SpokeLinkedVpnTunnelsArgs:
    def __init__(__self__, *,
                 site_to_site_data_transfer: pulumi.Input[bool],
                 uris: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[bool] site_to_site_data_transfer: A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] uris: The URIs of linked VPN tunnel resources.
        """
        pulumi.set(__self__, "site_to_site_data_transfer", site_to_site_data_transfer)
        pulumi.set(__self__, "uris", uris)

    @property
    @pulumi.getter(name="siteToSiteDataTransfer")
    def site_to_site_data_transfer(self) -> pulumi.Input[bool]:
        """
        A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        return pulumi.get(self, "site_to_site_data_transfer")

    @site_to_site_data_transfer.setter
    def site_to_site_data_transfer(self, value: pulumi.Input[bool]):
        pulumi.set(self, "site_to_site_data_transfer", value)

    @property
    @pulumi.getter
    def uris(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The URIs of linked VPN tunnel resources.
        """
        return pulumi.get(self, "uris")

    @uris.setter
    def uris(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "uris", value)

