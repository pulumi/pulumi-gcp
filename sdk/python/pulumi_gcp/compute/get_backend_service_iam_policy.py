# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetBackendServiceIamPolicyResult',
    'AwaitableGetBackendServiceIamPolicyResult',
    'get_backend_service_iam_policy',
    'get_backend_service_iam_policy_output',
]

@pulumi.output_type
class GetBackendServiceIamPolicyResult:
    """
    A collection of values returned by getBackendServiceIamPolicy.
    """
    def __init__(__self__, etag=None, id=None, name=None, policy_data=None, project=None):
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def etag(self) -> str:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> str:
        """
        (Required only by `compute.BackendServiceIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")


class AwaitableGetBackendServiceIamPolicyResult(GetBackendServiceIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBackendServiceIamPolicyResult(
            etag=self.etag,
            id=self.id,
            name=self.name,
            policy_data=self.policy_data,
            project=self.project)


def get_backend_service_iam_policy(name: Optional[str] = None,
                                   project: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBackendServiceIamPolicyResult:
    """
    Use this data source to access information about an existing resource.

    :param str name: Used to find the parent resource to bind the IAM policy to
    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getBackendServiceIamPolicy:getBackendServiceIamPolicy', __args__, opts=opts, typ=GetBackendServiceIamPolicyResult).value

    return AwaitableGetBackendServiceIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'))


@_utilities.lift_output_func(get_backend_service_iam_policy)
def get_backend_service_iam_policy_output(name: Optional[pulumi.Input[str]] = None,
                                          project: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBackendServiceIamPolicyResult]:
    """
    Use this data source to access information about an existing resource.

    :param str name: Used to find the parent resource to bind the IAM policy to
    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    ...