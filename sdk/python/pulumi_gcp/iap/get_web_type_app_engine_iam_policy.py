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
    'GetWebTypeAppEngineIamPolicyResult',
    'AwaitableGetWebTypeAppEngineIamPolicyResult',
    'get_web_type_app_engine_iam_policy',
    'get_web_type_app_engine_iam_policy_output',
]

@pulumi.output_type
class GetWebTypeAppEngineIamPolicyResult:
    """
    A collection of values returned by getWebTypeAppEngineIamPolicy.
    """
    def __init__(__self__, app_id=None, etag=None, id=None, policy_data=None, project=None):
        if app_id and not isinstance(app_id, str):
            raise TypeError("Expected argument 'app_id' to be a str")
        pulumi.set(__self__, "app_id", app_id)
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

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> str:
        return pulumi.get(self, "app_id")

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
        (Required only by `iap.WebTypeAppEngingIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")


class AwaitableGetWebTypeAppEngineIamPolicyResult(GetWebTypeAppEngineIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWebTypeAppEngineIamPolicyResult(
            app_id=self.app_id,
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data,
            project=self.project)


def get_web_type_app_engine_iam_policy(app_id: Optional[str] = None,
                                       project: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWebTypeAppEngineIamPolicyResult:
    """
    Retrieves the current IAM policy data for webtypeappengine

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.iap.get_web_type_app_engine_iam_policy(project=google_app_engine_application["app"]["project"],
        app_id=google_app_engine_application["app"]["app_id"])
    ```


    :param str app_id: Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    __args__ = dict()
    __args__['appId'] = app_id
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:iap/getWebTypeAppEngineIamPolicy:getWebTypeAppEngineIamPolicy', __args__, opts=opts, typ=GetWebTypeAppEngineIamPolicyResult).value

    return AwaitableGetWebTypeAppEngineIamPolicyResult(
        app_id=pulumi.get(__ret__, 'app_id'),
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'))


@_utilities.lift_output_func(get_web_type_app_engine_iam_policy)
def get_web_type_app_engine_iam_policy_output(app_id: Optional[pulumi.Input[str]] = None,
                                              project: Optional[pulumi.Input[Optional[str]]] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWebTypeAppEngineIamPolicyResult]:
    """
    Retrieves the current IAM policy data for webtypeappengine

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.iap.get_web_type_app_engine_iam_policy(project=google_app_engine_application["app"]["project"],
        app_id=google_app_engine_application["app"]["app_id"])
    ```


    :param str app_id: Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
    :param str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    """
    ...