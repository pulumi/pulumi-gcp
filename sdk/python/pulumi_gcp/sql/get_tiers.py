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
    'GetTiersResult',
    'AwaitableGetTiersResult',
    'get_tiers',
    'get_tiers_output',
]

@pulumi.output_type
class GetTiersResult:
    """
    A collection of values returned by getTiers.
    """
    def __init__(__self__, id=None, project=None, tiers=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if tiers and not isinstance(tiers, list):
            raise TypeError("Expected argument 'tiers' to be a list")
        pulumi.set(__self__, "tiers", tiers)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def tiers(self) -> Sequence['outputs.GetTiersTierResult']:
        """
        A list of all available machine types (tiers) for project. Each contains:
        """
        return pulumi.get(self, "tiers")


class AwaitableGetTiersResult(GetTiersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTiersResult(
            id=self.id,
            project=self.project,
            tiers=self.tiers)


def get_tiers(project: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTiersResult:
    """
    Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
    [official documentation](https://cloud.google.com/sql/)
    and
    [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    tiers = gcp.sql.get_tiers(project="sample-project")
    all_available_tiers = [v.tier for v in tiers.tiers]
    pulumi.export("avaialbleTiers", all_available_tiers)
    ```


    :param _builtins.str project: The Project ID for which to list tiers. If `project` is not provided, the project defined within the default provider configuration is used.
    """
    __args__ = dict()
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:sql/getTiers:getTiers', __args__, opts=opts, typ=GetTiersResult).value

    return AwaitableGetTiersResult(
        id=pulumi.get(__ret__, 'id'),
        project=pulumi.get(__ret__, 'project'),
        tiers=pulumi.get(__ret__, 'tiers'))
def get_tiers_output(project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTiersResult]:
    """
    Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
    [official documentation](https://cloud.google.com/sql/)
    and
    [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    tiers = gcp.sql.get_tiers(project="sample-project")
    all_available_tiers = [v.tier for v in tiers.tiers]
    pulumi.export("avaialbleTiers", all_available_tiers)
    ```


    :param _builtins.str project: The Project ID for which to list tiers. If `project` is not provided, the project defined within the default provider configuration is used.
    """
    __args__ = dict()
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:sql/getTiers:getTiers', __args__, opts=opts, typ=GetTiersResult)
    return __ret__.apply(lambda __response__: GetTiersResult(
        id=pulumi.get(__response__, 'id'),
        project=pulumi.get(__response__, 'project'),
        tiers=pulumi.get(__response__, 'tiers')))
