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
    'GetScopeIamPolicyResult',
    'AwaitableGetScopeIamPolicyResult',
    'get_scope_iam_policy',
    'get_scope_iam_policy_output',
]

@pulumi.output_type
class GetScopeIamPolicyResult:
    """
    A collection of values returned by getScopeIamPolicy.
    """
    def __init__(__self__, etag=None, id=None, policy_data=None, project=None, scope_id=None):
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if scope_id and not isinstance(scope_id, str):
            raise TypeError("Expected argument 'scope_id' to be a str")
        pulumi.set(__self__, "scope_id", scope_id)

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
    @pulumi.getter(name="policyData")
    def policy_data(self) -> str:
        """
        (Required only by `gkehub.ScopeIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="scopeId")
    def scope_id(self) -> str:
        return pulumi.get(self, "scope_id")


class AwaitableGetScopeIamPolicyResult(GetScopeIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetScopeIamPolicyResult(
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data,
            project=self.project,
            scope_id=self.scope_id)


def get_scope_iam_policy(project: Optional[str] = None,
                         scope_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetScopeIamPolicyResult:
    """
    Retrieves the current IAM policy data for scope

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.gkehub.get_scope_iam_policy(project=google_gke_hub_scope["scope"]["project"],
        scope_id=google_gke_hub_scope["scope"]["scope_id"])
    ```


    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    __args__ = dict()
    __args__['project'] = project
    __args__['scopeId'] = scope_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:gkehub/getScopeIamPolicy:getScopeIamPolicy', __args__, opts=opts, typ=GetScopeIamPolicyResult).value

    return AwaitableGetScopeIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'),
        scope_id=pulumi.get(__ret__, 'scope_id'))


@_utilities.lift_output_func(get_scope_iam_policy)
def get_scope_iam_policy_output(project: Optional[pulumi.Input[Optional[str]]] = None,
                                scope_id: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetScopeIamPolicyResult]:
    """
    Retrieves the current IAM policy data for scope

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.gkehub.get_scope_iam_policy(project=google_gke_hub_scope["scope"]["project"],
        scope_id=google_gke_hub_scope["scope"]["scope_id"])
    ```


    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    ...