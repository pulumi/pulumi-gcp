# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'FunctionEventTrigger',
    'FunctionEventTriggerFailurePolicy',
    'FunctionIamBindingCondition',
    'FunctionIamMemberCondition',
    'FunctionSourceRepository',
    'GetFunctionEventTriggerResult',
    'GetFunctionEventTriggerFailurePolicyResult',
    'GetFunctionSourceRepositoryResult',
]

@pulumi.output_type
class FunctionEventTrigger(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "eventType":
            suggest = "event_type"
        elif key == "failurePolicy":
            suggest = "failure_policy"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FunctionEventTrigger. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FunctionEventTrigger.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FunctionEventTrigger.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 event_type: str,
                 resource: str,
                 failure_policy: Optional['outputs.FunctionEventTriggerFailurePolicy'] = None):
        """
        :param str event_type: The type of event to observe. For example: `"google.storage.object.finalize"`.
               See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
               full reference of accepted triggers.
        :param str resource: Required. The name or partial URI of the resource from
               which to observe events. For example, `"myBucket"` or `"projects/my-project/topics/my-topic"`
        :param 'FunctionEventTriggerFailurePolicyArgs' failure_policy: Specifies policy for failed executions. Structure is documented below.
        """
        pulumi.set(__self__, "event_type", event_type)
        pulumi.set(__self__, "resource", resource)
        if failure_policy is not None:
            pulumi.set(__self__, "failure_policy", failure_policy)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> str:
        """
        The type of event to observe. For example: `"google.storage.object.finalize"`.
        See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
        full reference of accepted triggers.
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter
    def resource(self) -> str:
        """
        Required. The name or partial URI of the resource from
        which to observe events. For example, `"myBucket"` or `"projects/my-project/topics/my-topic"`
        """
        return pulumi.get(self, "resource")

    @property
    @pulumi.getter(name="failurePolicy")
    def failure_policy(self) -> Optional['outputs.FunctionEventTriggerFailurePolicy']:
        """
        Specifies policy for failed executions. Structure is documented below.
        """
        return pulumi.get(self, "failure_policy")


@pulumi.output_type
class FunctionEventTriggerFailurePolicy(dict):
    def __init__(__self__, *,
                 retry: bool):
        """
        :param bool retry: Whether the function should be retried on failure. Defaults to `false`.
        """
        pulumi.set(__self__, "retry", retry)

    @property
    @pulumi.getter
    def retry(self) -> bool:
        """
        Whether the function should be retried on failure. Defaults to `false`.
        """
        return pulumi.get(self, "retry")


@pulumi.output_type
class FunctionIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class FunctionIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class FunctionSourceRepository(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "deployedUrl":
            suggest = "deployed_url"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FunctionSourceRepository. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FunctionSourceRepository.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FunctionSourceRepository.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 url: str,
                 deployed_url: Optional[str] = None):
        """
        :param str url: The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
        """
        pulumi.set(__self__, "url", url)
        if deployed_url is not None:
            pulumi.set(__self__, "deployed_url", deployed_url)

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="deployedUrl")
    def deployed_url(self) -> Optional[str]:
        return pulumi.get(self, "deployed_url")


@pulumi.output_type
class GetFunctionEventTriggerResult(dict):
    def __init__(__self__, *,
                 event_type: str,
                 failure_policies: Sequence['outputs.GetFunctionEventTriggerFailurePolicyResult'],
                 resource: str):
        """
        :param str event_type: The type of event to observe. For example: `"google.storage.object.finalize"`.
               See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/)
               for a full reference of accepted triggers.
        :param Sequence['GetFunctionEventTriggerFailurePolicyArgs'] failure_policies: Policy for failed executions. Structure is documented below.
        :param str resource: The name of the resource whose events are being observed, for example, `"myBucket"`
        """
        pulumi.set(__self__, "event_type", event_type)
        pulumi.set(__self__, "failure_policies", failure_policies)
        pulumi.set(__self__, "resource", resource)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> str:
        """
        The type of event to observe. For example: `"google.storage.object.finalize"`.
        See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/)
        for a full reference of accepted triggers.
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter(name="failurePolicies")
    def failure_policies(self) -> Sequence['outputs.GetFunctionEventTriggerFailurePolicyResult']:
        """
        Policy for failed executions. Structure is documented below.
        """
        return pulumi.get(self, "failure_policies")

    @property
    @pulumi.getter
    def resource(self) -> str:
        """
        The name of the resource whose events are being observed, for example, `"myBucket"`
        """
        return pulumi.get(self, "resource")


@pulumi.output_type
class GetFunctionEventTriggerFailurePolicyResult(dict):
    def __init__(__self__, *,
                 retry: bool):
        """
        :param bool retry: Whether the function should be retried on failure.
        """
        pulumi.set(__self__, "retry", retry)

    @property
    @pulumi.getter
    def retry(self) -> bool:
        """
        Whether the function should be retried on failure.
        """
        return pulumi.get(self, "retry")


@pulumi.output_type
class GetFunctionSourceRepositoryResult(dict):
    def __init__(__self__, *,
                 deployed_url: str,
                 url: str):
        """
        :param str url: The URL pointing to the hosted repository where the function is defined.
        """
        pulumi.set(__self__, "deployed_url", deployed_url)
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="deployedUrl")
    def deployed_url(self) -> str:
        return pulumi.get(self, "deployed_url")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        The URL pointing to the hosted repository where the function is defined.
        """
        return pulumi.get(self, "url")


