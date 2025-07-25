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
    'GetCaPoolIamPolicyResult',
    'AwaitableGetCaPoolIamPolicyResult',
    'get_ca_pool_iam_policy',
    'get_ca_pool_iam_policy_output',
]

@pulumi.output_type
class GetCaPoolIamPolicyResult:
    """
    A collection of values returned by getCaPoolIamPolicy.
    """
    def __init__(__self__, ca_pool=None, etag=None, id=None, location=None, policy_data=None, project=None):
        if ca_pool and not isinstance(ca_pool, str):
            raise TypeError("Expected argument 'ca_pool' to be a str")
        pulumi.set(__self__, "ca_pool", ca_pool)
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="caPool")
    def ca_pool(self) -> _builtins.str:
        return pulumi.get(self, "ca_pool")

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
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> _builtins.str:
        """
        (Required only by `certificateauthority.CaPoolIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        return pulumi.get(self, "project")


class AwaitableGetCaPoolIamPolicyResult(GetCaPoolIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCaPoolIamPolicyResult(
            ca_pool=self.ca_pool,
            etag=self.etag,
            id=self.id,
            location=self.location,
            policy_data=self.policy_data,
            project=self.project)


def get_ca_pool_iam_policy(ca_pool: Optional[_builtins.str] = None,
                           location: Optional[_builtins.str] = None,
                           project: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCaPoolIamPolicyResult:
    """
    Retrieves the current IAM policy data for capool

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.certificateauthority.get_ca_pool_iam_policy(ca_pool=default["id"])
    ```


    :param _builtins.str ca_pool: Used to find the parent resource to bind the IAM policy to
    :param _builtins.str location: Location of the CaPool. A full list of valid locations can be found by
           running `gcloud privateca locations list`.
           Used to find the parent resource to bind the IAM policy to. If not specified,
           the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
           location is specified, it is taken from the provider configuration.
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    __args__ = dict()
    __args__['caPool'] = ca_pool
    __args__['location'] = location
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:certificateauthority/getCaPoolIamPolicy:getCaPoolIamPolicy', __args__, opts=opts, typ=GetCaPoolIamPolicyResult).value

    return AwaitableGetCaPoolIamPolicyResult(
        ca_pool=pulumi.get(__ret__, 'ca_pool'),
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'))
def get_ca_pool_iam_policy_output(ca_pool: Optional[pulumi.Input[_builtins.str]] = None,
                                  location: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCaPoolIamPolicyResult]:
    """
    Retrieves the current IAM policy data for capool

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.certificateauthority.get_ca_pool_iam_policy(ca_pool=default["id"])
    ```


    :param _builtins.str ca_pool: Used to find the parent resource to bind the IAM policy to
    :param _builtins.str location: Location of the CaPool. A full list of valid locations can be found by
           running `gcloud privateca locations list`.
           Used to find the parent resource to bind the IAM policy to. If not specified,
           the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
           location is specified, it is taken from the provider configuration.
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    __args__ = dict()
    __args__['caPool'] = ca_pool
    __args__['location'] = location
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:certificateauthority/getCaPoolIamPolicy:getCaPoolIamPolicy', __args__, opts=opts, typ=GetCaPoolIamPolicyResult)
    return __ret__.apply(lambda __response__: GetCaPoolIamPolicyResult(
        ca_pool=pulumi.get(__response__, 'ca_pool'),
        etag=pulumi.get(__response__, 'etag'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        policy_data=pulumi.get(__response__, 'policy_data'),
        project=pulumi.get(__response__, 'project')))
