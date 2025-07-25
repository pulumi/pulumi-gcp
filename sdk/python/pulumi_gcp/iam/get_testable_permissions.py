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
    'GetTestablePermissionsResult',
    'AwaitableGetTestablePermissionsResult',
    'get_testable_permissions',
    'get_testable_permissions_output',
]

@pulumi.output_type
class GetTestablePermissionsResult:
    """
    A collection of values returned by getTestablePermissions.
    """
    def __init__(__self__, custom_support_level=None, full_resource_name=None, id=None, permissions=None, stages=None):
        if custom_support_level and not isinstance(custom_support_level, str):
            raise TypeError("Expected argument 'custom_support_level' to be a str")
        pulumi.set(__self__, "custom_support_level", custom_support_level)
        if full_resource_name and not isinstance(full_resource_name, str):
            raise TypeError("Expected argument 'full_resource_name' to be a str")
        pulumi.set(__self__, "full_resource_name", full_resource_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if permissions and not isinstance(permissions, list):
            raise TypeError("Expected argument 'permissions' to be a list")
        pulumi.set(__self__, "permissions", permissions)
        if stages and not isinstance(stages, list):
            raise TypeError("Expected argument 'stages' to be a list")
        pulumi.set(__self__, "stages", stages)

    @_builtins.property
    @pulumi.getter(name="customSupportLevel")
    def custom_support_level(self) -> Optional[_builtins.str]:
        """
        The the support level of this permission for custom roles.
        """
        return pulumi.get(self, "custom_support_level")

    @_builtins.property
    @pulumi.getter(name="fullResourceName")
    def full_resource_name(self) -> _builtins.str:
        return pulumi.get(self, "full_resource_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def permissions(self) -> Sequence['outputs.GetTestablePermissionsPermissionResult']:
        """
        A list of permissions matching the provided input. Structure is defined below.
        """
        return pulumi.get(self, "permissions")

    @_builtins.property
    @pulumi.getter
    def stages(self) -> Optional[Sequence[_builtins.str]]:
        return pulumi.get(self, "stages")


class AwaitableGetTestablePermissionsResult(GetTestablePermissionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTestablePermissionsResult(
            custom_support_level=self.custom_support_level,
            full_resource_name=self.full_resource_name,
            id=self.id,
            permissions=self.permissions,
            stages=self.stages)


def get_testable_permissions(custom_support_level: Optional[_builtins.str] = None,
                             full_resource_name: Optional[_builtins.str] = None,
                             stages: Optional[Sequence[_builtins.str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTestablePermissionsResult:
    """
    Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI.

    ## Example Usage

    Retrieve all the supported permissions able to be set on `my-project` that are in either GA or BETA. This is useful for dynamically constructing custom roles.

    ```python
    import pulumi
    import pulumi_gcp as gcp

    perms = gcp.iam.get_testable_permissions(full_resource_name="//cloudresourcemanager.googleapis.com/projects/my-project",
        stages=[
            "GA",
            "BETA",
        ])
    ```


    :param _builtins.str custom_support_level: The level of support for custom roles. Can be one of `"NOT_SUPPORTED"`, `"SUPPORTED"`, `"TESTING"`. Default is `"SUPPORTED"`
    :param _builtins.str full_resource_name: See [full resource name documentation](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more detail.
    :param Sequence[_builtins.str] stages: The acceptable release stages of the permission in the output. Note that `BETA` does not include permissions in `GA`, but you can specify both with `["GA", "BETA"]` for example. Can be a list of `"ALPHA"`, `"BETA"`, `"GA"`, `"DEPRECATED"`. Default is `["GA"]`.
    """
    __args__ = dict()
    __args__['customSupportLevel'] = custom_support_level
    __args__['fullResourceName'] = full_resource_name
    __args__['stages'] = stages
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:iam/getTestablePermissions:getTestablePermissions', __args__, opts=opts, typ=GetTestablePermissionsResult).value

    return AwaitableGetTestablePermissionsResult(
        custom_support_level=pulumi.get(__ret__, 'custom_support_level'),
        full_resource_name=pulumi.get(__ret__, 'full_resource_name'),
        id=pulumi.get(__ret__, 'id'),
        permissions=pulumi.get(__ret__, 'permissions'),
        stages=pulumi.get(__ret__, 'stages'))
def get_testable_permissions_output(custom_support_level: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                    full_resource_name: Optional[pulumi.Input[_builtins.str]] = None,
                                    stages: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTestablePermissionsResult]:
    """
    Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI.

    ## Example Usage

    Retrieve all the supported permissions able to be set on `my-project` that are in either GA or BETA. This is useful for dynamically constructing custom roles.

    ```python
    import pulumi
    import pulumi_gcp as gcp

    perms = gcp.iam.get_testable_permissions(full_resource_name="//cloudresourcemanager.googleapis.com/projects/my-project",
        stages=[
            "GA",
            "BETA",
        ])
    ```


    :param _builtins.str custom_support_level: The level of support for custom roles. Can be one of `"NOT_SUPPORTED"`, `"SUPPORTED"`, `"TESTING"`. Default is `"SUPPORTED"`
    :param _builtins.str full_resource_name: See [full resource name documentation](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more detail.
    :param Sequence[_builtins.str] stages: The acceptable release stages of the permission in the output. Note that `BETA` does not include permissions in `GA`, but you can specify both with `["GA", "BETA"]` for example. Can be a list of `"ALPHA"`, `"BETA"`, `"GA"`, `"DEPRECATED"`. Default is `["GA"]`.
    """
    __args__ = dict()
    __args__['customSupportLevel'] = custom_support_level
    __args__['fullResourceName'] = full_resource_name
    __args__['stages'] = stages
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:iam/getTestablePermissions:getTestablePermissions', __args__, opts=opts, typ=GetTestablePermissionsResult)
    return __ret__.apply(lambda __response__: GetTestablePermissionsResult(
        custom_support_level=pulumi.get(__response__, 'custom_support_level'),
        full_resource_name=pulumi.get(__response__, 'full_resource_name'),
        id=pulumi.get(__response__, 'id'),
        permissions=pulumi.get(__response__, 'permissions'),
        stages=pulumi.get(__response__, 'stages')))
