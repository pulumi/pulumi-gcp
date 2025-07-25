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
    'GetAppConnectorResult',
    'AwaitableGetAppConnectorResult',
    'get_app_connector',
    'get_app_connector_output',
]

@pulumi.output_type
class GetAppConnectorResult:
    """
    A collection of values returned by getAppConnector.
    """
    def __init__(__self__, display_name=None, effective_labels=None, id=None, labels=None, name=None, principal_infos=None, project=None, pulumi_labels=None, region=None, state=None):
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if effective_labels and not isinstance(effective_labels, dict):
            raise TypeError("Expected argument 'effective_labels' to be a dict")
        pulumi.set(__self__, "effective_labels", effective_labels)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if principal_infos and not isinstance(principal_infos, list):
            raise TypeError("Expected argument 'principal_infos' to be a list")
        pulumi.set(__self__, "principal_infos", principal_infos)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if pulumi_labels and not isinstance(pulumi_labels, dict):
            raise TypeError("Expected argument 'pulumi_labels' to be a dict")
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="principalInfos")
    def principal_infos(self) -> Sequence['outputs.GetAppConnectorPrincipalInfoResult']:
        return pulumi.get(self, "principal_infos")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter
    def state(self) -> _builtins.str:
        return pulumi.get(self, "state")


class AwaitableGetAppConnectorResult(GetAppConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppConnectorResult(
            display_name=self.display_name,
            effective_labels=self.effective_labels,
            id=self.id,
            labels=self.labels,
            name=self.name,
            principal_infos=self.principal_infos,
            project=self.project,
            pulumi_labels=self.pulumi_labels,
            region=self.region,
            state=self.state)


def get_app_connector(name: Optional[_builtins.str] = None,
                      project: Optional[_builtins.str] = None,
                      region: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppConnectorResult:
    """
    Get information about a Google BeyondCorp App Connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_beyondcorp_app_connector = gcp.beyondcorp.get_app_connector(name="my-beyondcorp-app-connector")
    ```


    :param _builtins.str name: The name of the App Connector.
           
           - - -
    :param _builtins.str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param _builtins.str region: The region in which the resource belongs. If it
           is not provided, the provider region is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:beyondcorp/getAppConnector:getAppConnector', __args__, opts=opts, typ=GetAppConnectorResult).value

    return AwaitableGetAppConnectorResult(
        display_name=pulumi.get(__ret__, 'display_name'),
        effective_labels=pulumi.get(__ret__, 'effective_labels'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        principal_infos=pulumi.get(__ret__, 'principal_infos'),
        project=pulumi.get(__ret__, 'project'),
        pulumi_labels=pulumi.get(__ret__, 'pulumi_labels'),
        region=pulumi.get(__ret__, 'region'),
        state=pulumi.get(__ret__, 'state'))
def get_app_connector_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                             project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             region: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppConnectorResult]:
    """
    Get information about a Google BeyondCorp App Connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_beyondcorp_app_connector = gcp.beyondcorp.get_app_connector(name="my-beyondcorp-app-connector")
    ```


    :param _builtins.str name: The name of the App Connector.
           
           - - -
    :param _builtins.str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param _builtins.str region: The region in which the resource belongs. If it
           is not provided, the provider region is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:beyondcorp/getAppConnector:getAppConnector', __args__, opts=opts, typ=GetAppConnectorResult)
    return __ret__.apply(lambda __response__: GetAppConnectorResult(
        display_name=pulumi.get(__response__, 'display_name'),
        effective_labels=pulumi.get(__response__, 'effective_labels'),
        id=pulumi.get(__response__, 'id'),
        labels=pulumi.get(__response__, 'labels'),
        name=pulumi.get(__response__, 'name'),
        principal_infos=pulumi.get(__response__, 'principal_infos'),
        project=pulumi.get(__response__, 'project'),
        pulumi_labels=pulumi.get(__response__, 'pulumi_labels'),
        region=pulumi.get(__response__, 'region'),
        state=pulumi.get(__response__, 'state')))
