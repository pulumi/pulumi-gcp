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
    'GetIamPolicyResult',
    'AwaitableGetIamPolicyResult',
    'get_iam_policy',
    'get_iam_policy_output',
]

@pulumi.output_type
class GetIamPolicyResult:
    """
    A collection of values returned by getIamPolicy.
    """
    def __init__(__self__, etag=None, id=None, policy_data=None, service_account_id=None):
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if service_account_id and not isinstance(service_account_id, str):
            raise TypeError("Expected argument 'service_account_id' to be a str")
        pulumi.set(__self__, "service_account_id", service_account_id)

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
        (Computed) The policy data
        """
        return pulumi.get(self, "policy_data")

    @property
    @pulumi.getter(name="serviceAccountId")
    def service_account_id(self) -> str:
        return pulumi.get(self, "service_account_id")


class AwaitableGetIamPolicyResult(GetIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIamPolicyResult(
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data,
            service_account_id=self.service_account_id)


def get_iam_policy(service_account_id: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIamPolicyResult:
    """
    Retrieves the current IAM policy data for a service account.

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    foo = gcp.serviceAccount.get_iam_policy(service_account_id=google_service_account["test_account"]["name"])
    ```


    :param str service_account_id: The fully-qualified name of the service account to apply policy to.
    """
    __args__ = dict()
    __args__['serviceAccountId'] = service_account_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:serviceAccount/getIamPolicy:getIamPolicy', __args__, opts=opts, typ=GetIamPolicyResult).value

    return AwaitableGetIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        service_account_id=pulumi.get(__ret__, 'service_account_id'))


@_utilities.lift_output_func(get_iam_policy)
def get_iam_policy_output(service_account_id: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIamPolicyResult]:
    """
    Retrieves the current IAM policy data for a service account.

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    foo = gcp.serviceAccount.get_iam_policy(service_account_id=google_service_account["test_account"]["name"])
    ```


    :param str service_account_id: The fully-qualified name of the service account to apply policy to.
    """
    ...