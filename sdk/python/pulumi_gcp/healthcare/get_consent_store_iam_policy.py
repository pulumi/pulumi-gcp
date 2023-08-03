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
    'GetConsentStoreIamPolicyResult',
    'AwaitableGetConsentStoreIamPolicyResult',
    'get_consent_store_iam_policy',
    'get_consent_store_iam_policy_output',
]

@pulumi.output_type
class GetConsentStoreIamPolicyResult:
    """
    A collection of values returned by getConsentStoreIamPolicy.
    """
    def __init__(__self__, consent_store_id=None, dataset=None, etag=None, id=None, policy_data=None):
        if consent_store_id and not isinstance(consent_store_id, str):
            raise TypeError("Expected argument 'consent_store_id' to be a str")
        pulumi.set(__self__, "consent_store_id", consent_store_id)
        if dataset and not isinstance(dataset, str):
            raise TypeError("Expected argument 'dataset' to be a str")
        pulumi.set(__self__, "dataset", dataset)
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)

    @property
    @pulumi.getter(name="consentStoreId")
    def consent_store_id(self) -> str:
        return pulumi.get(self, "consent_store_id")

    @property
    @pulumi.getter
    def dataset(self) -> str:
        return pulumi.get(self, "dataset")

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
        (Required only by `healthcare.ConsentStoreIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")


class AwaitableGetConsentStoreIamPolicyResult(GetConsentStoreIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConsentStoreIamPolicyResult(
            consent_store_id=self.consent_store_id,
            dataset=self.dataset,
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data)


def get_consent_store_iam_policy(consent_store_id: Optional[str] = None,
                                 dataset: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConsentStoreIamPolicyResult:
    """
    Retrieves the current IAM policy data for consentstore

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.healthcare.get_consent_store_iam_policy(dataset=google_healthcare_consent_store["my-consent"]["dataset"],
        consent_store_id=google_healthcare_consent_store["my-consent"]["name"])
    ```


    :param str consent_store_id: Used to find the parent resource to bind the IAM policy to
    :param str dataset: Identifies the dataset addressed by this request. Must be in the format
           'projects/{project}/locations/{location}/datasets/{dataset}'
           Used to find the parent resource to bind the IAM policy to
    """
    __args__ = dict()
    __args__['consentStoreId'] = consent_store_id
    __args__['dataset'] = dataset
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:healthcare/getConsentStoreIamPolicy:getConsentStoreIamPolicy', __args__, opts=opts, typ=GetConsentStoreIamPolicyResult).value

    return AwaitableGetConsentStoreIamPolicyResult(
        consent_store_id=pulumi.get(__ret__, 'consent_store_id'),
        dataset=pulumi.get(__ret__, 'dataset'),
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'))


@_utilities.lift_output_func(get_consent_store_iam_policy)
def get_consent_store_iam_policy_output(consent_store_id: Optional[pulumi.Input[str]] = None,
                                        dataset: Optional[pulumi.Input[str]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConsentStoreIamPolicyResult]:
    """
    Retrieves the current IAM policy data for consentstore

    ## example

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.healthcare.get_consent_store_iam_policy(dataset=google_healthcare_consent_store["my-consent"]["dataset"],
        consent_store_id=google_healthcare_consent_store["my-consent"]["name"])
    ```


    :param str consent_store_id: Used to find the parent resource to bind the IAM policy to
    :param str dataset: Identifies the dataset addressed by this request. Must be in the format
           'projects/{project}/locations/{location}/datasets/{dataset}'
           Used to find the parent resource to bind the IAM policy to
    """
    ...