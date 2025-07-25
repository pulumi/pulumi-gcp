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
    'RouterStatusResult',
    'AwaitableRouterStatusResult',
    'router_status',
    'router_status_output',
]

warnings.warn("""gcp.compute.RouterStatus has been deprecated in favor of gcp.compute.getRouterStatus""", DeprecationWarning)

@pulumi.output_type
class RouterStatusResult:
    """
    A collection of values returned by RouterStatus.
    """
    def __init__(__self__, best_routes=None, best_routes_for_routers=None, id=None, name=None, network=None, project=None, region=None):
        if best_routes and not isinstance(best_routes, list):
            raise TypeError("Expected argument 'best_routes' to be a list")
        pulumi.set(__self__, "best_routes", best_routes)
        if best_routes_for_routers and not isinstance(best_routes_for_routers, list):
            raise TypeError("Expected argument 'best_routes_for_routers' to be a list")
        pulumi.set(__self__, "best_routes_for_routers", best_routes_for_routers)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
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

    @_builtins.property
    @pulumi.getter(name="bestRoutes")
    def best_routes(self) -> Sequence['outputs.RouterStatusBestRouteResult']:
        """
        List of best `compute#routes` configurations for this router's network. See compute.Route resource for available attributes.
        """
        return pulumi.get(self, "best_routes")

    @_builtins.property
    @pulumi.getter(name="bestRoutesForRouters")
    def best_routes_for_routers(self) -> Sequence['outputs.RouterStatusBestRoutesForRouterResult']:
        """
        List of best `compute#routes` for this specific router. See compute.Route resource for available attributes.
        """
        return pulumi.get(self, "best_routes_for_routers")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def network(self) -> _builtins.str:
        """
        The network name or resource link to the parent
        network of this subnetwork.
        """
        return pulumi.get(self, "network")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def region(self) -> _builtins.str:
        return pulumi.get(self, "region")


class AwaitableRouterStatusResult(RouterStatusResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return RouterStatusResult(
            best_routes=self.best_routes,
            best_routes_for_routers=self.best_routes_for_routers,
            id=self.id,
            name=self.name,
            network=self.network,
            project=self.project,
            region=self.region)


def router_status(name: Optional[_builtins.str] = None,
                  project: Optional[_builtins.str] = None,
                  region: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableRouterStatusResult:
    """
    Get a Cloud Router's status within GCE from its name and region. This data source exposes the
    routes learned by a Cloud Router via BGP peers.

    For more information see [the official documentation](https://cloud.google.com/network-connectivity/docs/router/how-to/viewing-router-details)
    and
    [API](https://cloud.google.com/compute/docs/reference/rest/v1/routers/getRouterStatus).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_router = gcp.compute.get_router_status(name="myrouter")
    ```


    :param _builtins.str name: The name of the router.
    :param _builtins.str project: The ID of the project in which the resource
           belongs. If it is not provided, the provider project is used.
    :param _builtins.str region: The region this router has been created in. If
           unspecified, this defaults to the region configured in the provider.
    """
    pulumi.log.warn("""router_status is deprecated: gcp.compute.RouterStatus has been deprecated in favor of gcp.compute.getRouterStatus""")
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/routerStatus:RouterStatus', __args__, opts=opts, typ=RouterStatusResult).value

    return AwaitableRouterStatusResult(
        best_routes=pulumi.get(__ret__, 'best_routes'),
        best_routes_for_routers=pulumi.get(__ret__, 'best_routes_for_routers'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        network=pulumi.get(__ret__, 'network'),
        project=pulumi.get(__ret__, 'project'),
        region=pulumi.get(__ret__, 'region'))
def router_status_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                         project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         region: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[RouterStatusResult]:
    """
    Get a Cloud Router's status within GCE from its name and region. This data source exposes the
    routes learned by a Cloud Router via BGP peers.

    For more information see [the official documentation](https://cloud.google.com/network-connectivity/docs/router/how-to/viewing-router-details)
    and
    [API](https://cloud.google.com/compute/docs/reference/rest/v1/routers/getRouterStatus).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_router = gcp.compute.get_router_status(name="myrouter")
    ```


    :param _builtins.str name: The name of the router.
    :param _builtins.str project: The ID of the project in which the resource
           belongs. If it is not provided, the provider project is used.
    :param _builtins.str region: The region this router has been created in. If
           unspecified, this defaults to the region configured in the provider.
    """
    pulumi.log.warn("""router_status is deprecated: gcp.compute.RouterStatus has been deprecated in favor of gcp.compute.getRouterStatus""")
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:compute/routerStatus:RouterStatus', __args__, opts=opts, typ=RouterStatusResult)
    return __ret__.apply(lambda __response__: RouterStatusResult(
        best_routes=pulumi.get(__response__, 'best_routes'),
        best_routes_for_routers=pulumi.get(__response__, 'best_routes_for_routers'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        network=pulumi.get(__response__, 'network'),
        project=pulumi.get(__response__, 'project'),
        region=pulumi.get(__response__, 'region')))
