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
    'GetSubscriptionIamPolicyResult',
    'AwaitableGetSubscriptionIamPolicyResult',
    'get_subscription_iam_policy',
    'get_subscription_iam_policy_output',
]

@pulumi.output_type
class GetSubscriptionIamPolicyResult:
    """
    A collection of values returned by getSubscriptionIamPolicy.
    """
    def __init__(__self__, etag=None, id=None, policy_data=None, project=None, subscription=None):
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
        if subscription and not isinstance(subscription, str):
            raise TypeError("Expected argument 'subscription' to be a str")
        pulumi.set(__self__, "subscription", subscription)

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
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def subscription(self) -> str:
        return pulumi.get(self, "subscription")


class AwaitableGetSubscriptionIamPolicyResult(GetSubscriptionIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubscriptionIamPolicyResult(
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data,
            project=self.project,
            subscription=self.subscription)


def get_subscription_iam_policy(project: Optional[str] = None,
                                subscription: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubscriptionIamPolicyResult:
    """
    Retrieves the current IAM policy data for a Pubsub subscription.

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.pubsub.get_subscription_iam_policy(subscription=google_pubsub_subscription["subscription"]["id"])
    ```


    :param str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param str subscription: The subscription name or id to bind to attach IAM policy to.
    """
    __args__ = dict()
    __args__['project'] = project
    __args__['subscription'] = subscription
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:pubsub/getSubscriptionIamPolicy:getSubscriptionIamPolicy', __args__, opts=opts, typ=GetSubscriptionIamPolicyResult).value

    return AwaitableGetSubscriptionIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'),
        subscription=pulumi.get(__ret__, 'subscription'))


@_utilities.lift_output_func(get_subscription_iam_policy)
def get_subscription_iam_policy_output(project: Optional[pulumi.Input[Optional[str]]] = None,
                                       subscription: Optional[pulumi.Input[str]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubscriptionIamPolicyResult]:
    """
    Retrieves the current IAM policy data for a Pubsub subscription.

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.pubsub.get_subscription_iam_policy(subscription=google_pubsub_subscription["subscription"]["id"])
    ```


    :param str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param str subscription: The subscription name or id to bind to attach IAM policy to.
    """
    ...