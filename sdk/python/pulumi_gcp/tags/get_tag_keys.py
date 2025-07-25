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
    'GetTagKeysResult',
    'AwaitableGetTagKeysResult',
    'get_tag_keys',
    'get_tag_keys_output',
]

@pulumi.output_type
class GetTagKeysResult:
    """
    A collection of values returned by getTagKeys.
    """
    def __init__(__self__, id=None, keys=None, parent=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if keys and not isinstance(keys, list):
            raise TypeError("Expected argument 'keys' to be a list")
        pulumi.set(__self__, "keys", keys)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def keys(self) -> Sequence['outputs.GetTagKeysKeyResult']:
        return pulumi.get(self, "keys")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> _builtins.str:
        """
        The resource name of the TagKey's parent. A TagKey can be parented by an Orgination or a Project.
        """
        return pulumi.get(self, "parent")


class AwaitableGetTagKeysResult(GetTagKeysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagKeysResult(
            id=self.id,
            keys=self.keys,
            parent=self.parent)


def get_tag_keys(parent: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagKeysResult:
    """
    Get tag keys by org or project `parent`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    environment_tag_key = gcp.tags.get_tag_keys(parent="organizations/12345")
    ```
    ```python
    import pulumi
    import pulumi_gcp as gcp

    environment_tag_key = gcp.tags.get_tag_keys(parent="projects/abc")
    ```


    :param _builtins.str parent: The resource name of the parent organization or project. It can be in format `organizations/{org_id}` or `projects/{project_id_or_number}`.
    """
    __args__ = dict()
    __args__['parent'] = parent
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:tags/getTagKeys:getTagKeys', __args__, opts=opts, typ=GetTagKeysResult).value

    return AwaitableGetTagKeysResult(
        id=pulumi.get(__ret__, 'id'),
        keys=pulumi.get(__ret__, 'keys'),
        parent=pulumi.get(__ret__, 'parent'))
def get_tag_keys_output(parent: Optional[pulumi.Input[_builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTagKeysResult]:
    """
    Get tag keys by org or project `parent`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    environment_tag_key = gcp.tags.get_tag_keys(parent="organizations/12345")
    ```
    ```python
    import pulumi
    import pulumi_gcp as gcp

    environment_tag_key = gcp.tags.get_tag_keys(parent="projects/abc")
    ```


    :param _builtins.str parent: The resource name of the parent organization or project. It can be in format `organizations/{org_id}` or `projects/{project_id_or_number}`.
    """
    __args__ = dict()
    __args__['parent'] = parent
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:tags/getTagKeys:getTagKeys', __args__, opts=opts, typ=GetTagKeysResult)
    return __ret__.apply(lambda __response__: GetTagKeysResult(
        id=pulumi.get(__response__, 'id'),
        keys=pulumi.get(__response__, 'keys'),
        parent=pulumi.get(__response__, 'parent')))
