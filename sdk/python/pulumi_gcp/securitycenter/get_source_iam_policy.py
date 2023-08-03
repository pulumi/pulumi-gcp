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
    'GetSourceIamPolicyResult',
    'AwaitableGetSourceIamPolicyResult',
    'get_source_iam_policy',
    'get_source_iam_policy_output',
]

@pulumi.output_type
class GetSourceIamPolicyResult:
    """
    A collection of values returned by getSourceIamPolicy.
    """
    def __init__(__self__, etag=None, id=None, organization=None, policy_data=None, source=None):
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if organization and not isinstance(organization, str):
            raise TypeError("Expected argument 'organization' to be a str")
        pulumi.set(__self__, "organization", organization)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)

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
    def organization(self) -> str:
        return pulumi.get(self, "organization")

    @property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> str:
        """
        (Required only by `securitycenter.SourceIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @property
    @pulumi.getter
    def source(self) -> str:
        return pulumi.get(self, "source")


class AwaitableGetSourceIamPolicyResult(GetSourceIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSourceIamPolicyResult(
            etag=self.etag,
            id=self.id,
            organization=self.organization,
            policy_data=self.policy_data,
            source=self.source)


def get_source_iam_policy(organization: Optional[str] = None,
                          source: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSourceIamPolicyResult:
    """
    Retrieves the current IAM policy data for source

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.securitycenter.get_source_iam_policy(source=google_scc_source["custom_source"]["name"])
    ```


    :param str source: Used to find the parent resource to bind the IAM policy to
    """
    __args__ = dict()
    __args__['organization'] = organization
    __args__['source'] = source
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:securitycenter/getSourceIamPolicy:getSourceIamPolicy', __args__, opts=opts, typ=GetSourceIamPolicyResult).value

    return AwaitableGetSourceIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        organization=pulumi.get(__ret__, 'organization'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        source=pulumi.get(__ret__, 'source'))


@_utilities.lift_output_func(get_source_iam_policy)
def get_source_iam_policy_output(organization: Optional[pulumi.Input[str]] = None,
                                 source: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSourceIamPolicyResult]:
    """
    Retrieves the current IAM policy data for source

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.securitycenter.get_source_iam_policy(source=google_scc_source["custom_source"]["name"])
    ```


    :param str source: Used to find the parent resource to bind the IAM policy to
    """
    ...