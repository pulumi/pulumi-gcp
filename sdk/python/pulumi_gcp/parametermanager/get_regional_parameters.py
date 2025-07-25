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
    'GetRegionalParametersResult',
    'AwaitableGetRegionalParametersResult',
    'get_regional_parameters',
    'get_regional_parameters_output',
]

@pulumi.output_type
class GetRegionalParametersResult:
    """
    A collection of values returned by getRegionalParameters.
    """
    def __init__(__self__, filter=None, id=None, location=None, parameters=None, project=None):
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if parameters and not isinstance(parameters, list):
            raise TypeError("Expected argument 'parameters' to be a list")
        pulumi.set(__self__, "parameters", parameters)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def parameters(self) -> Sequence['outputs.GetRegionalParametersParameterResult']:
        """
        A list of regional parameters matching the filter. Structure is defined below.
        """
        return pulumi.get(self, "parameters")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        """
        The ID of the project in which the resource belongs.
        """
        return pulumi.get(self, "project")


class AwaitableGetRegionalParametersResult(GetRegionalParametersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionalParametersResult(
            filter=self.filter,
            id=self.id,
            location=self.location,
            parameters=self.parameters,
            project=self.project)


def get_regional_parameters(filter: Optional[_builtins.str] = None,
                            location: Optional[_builtins.str] = None,
                            project: Optional[_builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegionalParametersResult:
    """
    Use this data source to list the Parameter Manager Regional Parameters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    regional_parameters = gcp.parametermanager.get_regional_parameters(location="us-central1")
    ```


    :param _builtins.str filter: Filter string, adhering to the rules in List-operation filtering. List only parameters matching the filter. If filter is empty, all regional parameters are listed.
    :param _builtins.str location: The location of regional parameter.
    :param _builtins.str project: The ID of the project.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['location'] = location
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:parametermanager/getRegionalParameters:getRegionalParameters', __args__, opts=opts, typ=GetRegionalParametersResult).value

    return AwaitableGetRegionalParametersResult(
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        parameters=pulumi.get(__ret__, 'parameters'),
        project=pulumi.get(__ret__, 'project'))
def get_regional_parameters_output(filter: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                   location: Optional[pulumi.Input[_builtins.str]] = None,
                                   project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRegionalParametersResult]:
    """
    Use this data source to list the Parameter Manager Regional Parameters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    regional_parameters = gcp.parametermanager.get_regional_parameters(location="us-central1")
    ```


    :param _builtins.str filter: Filter string, adhering to the rules in List-operation filtering. List only parameters matching the filter. If filter is empty, all regional parameters are listed.
    :param _builtins.str location: The location of regional parameter.
    :param _builtins.str project: The ID of the project.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['location'] = location
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:parametermanager/getRegionalParameters:getRegionalParameters', __args__, opts=opts, typ=GetRegionalParametersResult)
    return __ret__.apply(lambda __response__: GetRegionalParametersResult(
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        parameters=pulumi.get(__response__, 'parameters'),
        project=pulumi.get(__response__, 'project')))
