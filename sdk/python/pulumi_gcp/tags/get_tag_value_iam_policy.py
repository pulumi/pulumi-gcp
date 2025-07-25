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

__all__ = [
    'GetTagValueIamPolicyResult',
    'AwaitableGetTagValueIamPolicyResult',
    'get_tag_value_iam_policy',
    'get_tag_value_iam_policy_output',
]

@pulumi.output_type
class GetTagValueIamPolicyResult:
    """
    A collection of values returned by getTagValueIamPolicy.
    """
    def __init__(__self__, etag=None, id=None, policy_data=None, tag_value=None):
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if tag_value and not isinstance(tag_value, str):
            raise TypeError("Expected argument 'tag_value' to be a str")
        pulumi.set(__self__, "tag_value", tag_value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> _builtins.str:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> _builtins.str:
        """
        (Required only by `tags.TagValueIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @_builtins.property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> _builtins.str:
        return pulumi.get(self, "tag_value")


class AwaitableGetTagValueIamPolicyResult(GetTagValueIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagValueIamPolicyResult(
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data,
            tag_value=self.tag_value)


def get_tag_value_iam_policy(tag_value: Optional[_builtins.str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagValueIamPolicyResult:
    """
    Retrieves the current IAM policy data for tagvalue

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.tags.get_tag_value_iam_policy(tag_value=value["name"])
    ```


    :param _builtins.str tag_value: Used to find the parent resource to bind the IAM policy to
    """
    __args__ = dict()
    __args__['tagValue'] = tag_value
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:tags/getTagValueIamPolicy:getTagValueIamPolicy', __args__, opts=opts, typ=GetTagValueIamPolicyResult).value

    return AwaitableGetTagValueIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        tag_value=pulumi.get(__ret__, 'tag_value'))
def get_tag_value_iam_policy_output(tag_value: Optional[pulumi.Input[_builtins.str]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTagValueIamPolicyResult]:
    """
    Retrieves the current IAM policy data for tagvalue

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.tags.get_tag_value_iam_policy(tag_value=value["name"])
    ```


    :param _builtins.str tag_value: Used to find the parent resource to bind the IAM policy to
    """
    __args__ = dict()
    __args__['tagValue'] = tag_value
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:tags/getTagValueIamPolicy:getTagValueIamPolicy', __args__, opts=opts, typ=GetTagValueIamPolicyResult)
    return __ret__.apply(lambda __response__: GetTagValueIamPolicyResult(
        etag=pulumi.get(__response__, 'etag'),
        id=pulumi.get(__response__, 'id'),
        policy_data=pulumi.get(__response__, 'policy_data'),
        tag_value=pulumi.get(__response__, 'tag_value')))
