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
    'GetConnectorResult',
    'AwaitableGetConnectorResult',
    'get_connector',
    'get_connector_output',
]

@pulumi.output_type
class GetConnectorResult:
    """
    A collection of values returned by getConnector.
    """
    def __init__(__self__, id=None, ip_cidr_range=None, machine_type=None, max_instances=None, max_throughput=None, min_instances=None, min_throughput=None, name=None, network=None, project=None, region=None, self_link=None, state=None, subnets=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_cidr_range and not isinstance(ip_cidr_range, str):
            raise TypeError("Expected argument 'ip_cidr_range' to be a str")
        pulumi.set(__self__, "ip_cidr_range", ip_cidr_range)
        if machine_type and not isinstance(machine_type, str):
            raise TypeError("Expected argument 'machine_type' to be a str")
        pulumi.set(__self__, "machine_type", machine_type)
        if max_instances and not isinstance(max_instances, int):
            raise TypeError("Expected argument 'max_instances' to be a int")
        pulumi.set(__self__, "max_instances", max_instances)
        if max_throughput and not isinstance(max_throughput, int):
            raise TypeError("Expected argument 'max_throughput' to be a int")
        pulumi.set(__self__, "max_throughput", max_throughput)
        if min_instances and not isinstance(min_instances, int):
            raise TypeError("Expected argument 'min_instances' to be a int")
        pulumi.set(__self__, "min_instances", min_instances)
        if min_throughput and not isinstance(min_throughput, int):
            raise TypeError("Expected argument 'min_throughput' to be a int")
        pulumi.set(__self__, "min_throughput", min_throughput)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network and not isinstance(network, str):
            raise TypeError("Expected argument 'network' to be a str")
        pulumi.set(__self__, "network", network)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if self_link and not isinstance(self_link, str):
            raise TypeError("Expected argument 'self_link' to be a str")
        pulumi.set(__self__, "self_link", self_link)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if subnets and not isinstance(subnets, list):
            raise TypeError("Expected argument 'subnets' to be a list")
        pulumi.set(__self__, "subnets", subnets)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipCidrRange")
    def ip_cidr_range(self) -> str:
        return pulumi.get(self, "ip_cidr_range")

    @property
    @pulumi.getter(name="machineType")
    def machine_type(self) -> str:
        return pulumi.get(self, "machine_type")

    @property
    @pulumi.getter(name="maxInstances")
    def max_instances(self) -> int:
        return pulumi.get(self, "max_instances")

    @property
    @pulumi.getter(name="maxThroughput")
    def max_throughput(self) -> int:
        return pulumi.get(self, "max_throughput")

    @property
    @pulumi.getter(name="minInstances")
    def min_instances(self) -> int:
        return pulumi.get(self, "min_instances")

    @property
    @pulumi.getter(name="minThroughput")
    def min_throughput(self) -> int:
        return pulumi.get(self, "min_throughput")

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
    def project(self) -> Optional[str]:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> str:
        return pulumi.get(self, "self_link")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def subnets(self) -> Sequence['outputs.GetConnectorSubnetResult']:
        return pulumi.get(self, "subnets")


class AwaitableGetConnectorResult(GetConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectorResult(
            id=self.id,
            ip_cidr_range=self.ip_cidr_range,
            machine_type=self.machine_type,
            max_instances=self.max_instances,
            max_throughput=self.max_throughput,
            min_instances=self.min_instances,
            min_throughput=self.min_throughput,
            name=self.name,
            network=self.network,
            project=self.project,
            region=self.region,
            self_link=self.self_link,
            state=self.state,
            subnets=self.subnets)


def get_connector(name: Optional[str] = None,
                  project: Optional[str] = None,
                  region: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectorResult:
    """
    Get a Serverless VPC Access connector.

    To get more information about Connector, see:

    * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
    * How-to Guides
        * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    sample = gcp.vpcaccess.get_connector(name="vpc-con")
    connector = gcp.vpcaccess.Connector("connector",
        ip_cidr_range="10.8.0.0/28",
        network="default",
        region="us-central1")
    ```


    :param str name: Name of the resource.
    :param str project: The ID of the project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param str region: The region in which the resource belongs. If it
           is not provided, the provider region is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:vpcaccess/getConnector:getConnector', __args__, opts=opts, typ=GetConnectorResult).value

    return AwaitableGetConnectorResult(
        id=__ret__.id,
        ip_cidr_range=__ret__.ip_cidr_range,
        machine_type=__ret__.machine_type,
        max_instances=__ret__.max_instances,
        max_throughput=__ret__.max_throughput,
        min_instances=__ret__.min_instances,
        min_throughput=__ret__.min_throughput,
        name=__ret__.name,
        network=__ret__.network,
        project=__ret__.project,
        region=__ret__.region,
        self_link=__ret__.self_link,
        state=__ret__.state,
        subnets=__ret__.subnets)


@_utilities.lift_output_func(get_connector)
def get_connector_output(name: Optional[pulumi.Input[str]] = None,
                         project: Optional[pulumi.Input[Optional[str]]] = None,
                         region: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectorResult]:
    """
    Get a Serverless VPC Access connector.

    To get more information about Connector, see:

    * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
    * How-to Guides
        * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    sample = gcp.vpcaccess.get_connector(name="vpc-con")
    connector = gcp.vpcaccess.Connector("connector",
        ip_cidr_range="10.8.0.0/28",
        network="default",
        region="us-central1")
    ```


    :param str name: Name of the resource.
    :param str project: The ID of the project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param str region: The region in which the resource belongs. If it
           is not provided, the provider region is used.
    """
    ...