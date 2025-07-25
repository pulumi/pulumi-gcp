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
from . import outputs

__all__ = [
    'GetNotificationChannelResult',
    'AwaitableGetNotificationChannelResult',
    'get_notification_channel',
    'get_notification_channel_output',
]

@pulumi.output_type
class GetNotificationChannelResult:
    """
    A collection of values returned by getNotificationChannel.
    """
    def __init__(__self__, description=None, display_name=None, enabled=None, force_delete=None, id=None, labels=None, name=None, project=None, sensitive_labels=None, type=None, user_labels=None, verification_status=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if force_delete and not isinstance(force_delete, bool):
            raise TypeError("Expected argument 'force_delete' to be a bool")
        pulumi.set(__self__, "force_delete", force_delete)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if sensitive_labels and not isinstance(sensitive_labels, list):
            raise TypeError("Expected argument 'sensitive_labels' to be a list")
        pulumi.set(__self__, "sensitive_labels", sensitive_labels)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if user_labels and not isinstance(user_labels, dict):
            raise TypeError("Expected argument 'user_labels' to be a dict")
        pulumi.set(__self__, "user_labels", user_labels)
        if verification_status and not isinstance(verification_status, str):
            raise TypeError("Expected argument 'verification_status' to be a str")
        pulumi.set(__self__, "verification_status", verification_status)

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        An optional human-readable description of this notification channel.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Whether notifications are forwarded to the described channel.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> _builtins.bool:
        return pulumi.get(self, "force_delete")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        Configuration fields that define the channel and its behavior.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The full REST resource name for this channel. The syntax is:
        `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="sensitiveLabels")
    def sensitive_labels(self) -> Sequence['outputs.GetNotificationChannelSensitiveLabelResult']:
        return pulumi.get(self, "sensitive_labels")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="userLabels")
    def user_labels(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field.
        """
        return pulumi.get(self, "user_labels")

    @_builtins.property
    @pulumi.getter(name="verificationStatus")
    def verification_status(self) -> _builtins.str:
        """
        Indicates whether this channel has been verified or not.
        """
        return pulumi.get(self, "verification_status")


class AwaitableGetNotificationChannelResult(GetNotificationChannelResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotificationChannelResult(
            description=self.description,
            display_name=self.display_name,
            enabled=self.enabled,
            force_delete=self.force_delete,
            id=self.id,
            labels=self.labels,
            name=self.name,
            project=self.project,
            sensitive_labels=self.sensitive_labels,
            type=self.type,
            user_labels=self.user_labels,
            verification_status=self.verification_status)


def get_notification_channel(display_name: Optional[_builtins.str] = None,
                             labels: Optional[Mapping[str, _builtins.str]] = None,
                             project: Optional[_builtins.str] = None,
                             type: Optional[_builtins.str] = None,
                             user_labels: Optional[Mapping[str, _builtins.str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotificationChannelResult:
    """
    A NotificationChannel is a medium through which an alert is delivered
    when a policy violation is detected. Examples of channels include email, SMS,
    and third-party messaging applications. Fields containing sensitive information
    like authentication tokens or contact info are only partially populated on retrieval.

    To get more information about NotificationChannel, see:

    * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
    * How-to Guides
        * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
        * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)

    ## Example Usage

    ### Notification Channel Basic

    ```python
    import pulumi
    import pulumi_gcp as gcp

    basic = gcp.monitoring.get_notification_channel(display_name="Test Notification Channel")
    alert_policy = gcp.monitoring.AlertPolicy("alert_policy",
        display_name="My Alert Policy",
        notification_channels=[basic.name],
        combiner="OR",
        conditions=[{
            "display_name": "test condition",
            "condition_threshold": {
                "filter": "metric.type=\\"compute.googleapis.com/instance/disk/write_bytes_count\\" AND resource.type=\\"gce_instance\\"",
                "duration": "60s",
                "comparison": "COMPARISON_GT",
                "aggregations": [{
                    "alignment_period": "60s",
                    "per_series_aligner": "ALIGN_RATE",
                }],
            },
        }])
    ```


    :param _builtins.str display_name: The display name for this notification channel.
    :param Mapping[str, _builtins.str] labels: Labels (corresponding to the
           NotificationChannelDescriptor schema) to filter the notification channels by.
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the provider project is used.
    :param _builtins.str type: The type of the notification channel.
           
           - - -
           
           Other optional fields include:
    :param Mapping[str, _builtins.str] user_labels: User-provided key-value labels to filter by.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['labels'] = labels
    __args__['project'] = project
    __args__['type'] = type
    __args__['userLabels'] = user_labels
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:monitoring/getNotificationChannel:getNotificationChannel', __args__, opts=opts, typ=GetNotificationChannelResult).value

    return AwaitableGetNotificationChannelResult(
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        enabled=pulumi.get(__ret__, 'enabled'),
        force_delete=pulumi.get(__ret__, 'force_delete'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        sensitive_labels=pulumi.get(__ret__, 'sensitive_labels'),
        type=pulumi.get(__ret__, 'type'),
        user_labels=pulumi.get(__ret__, 'user_labels'),
        verification_status=pulumi.get(__ret__, 'verification_status'))
def get_notification_channel_output(display_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                    labels: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                                    project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                    type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                    user_labels: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNotificationChannelResult]:
    """
    A NotificationChannel is a medium through which an alert is delivered
    when a policy violation is detected. Examples of channels include email, SMS,
    and third-party messaging applications. Fields containing sensitive information
    like authentication tokens or contact info are only partially populated on retrieval.

    To get more information about NotificationChannel, see:

    * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
    * How-to Guides
        * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
        * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)

    ## Example Usage

    ### Notification Channel Basic

    ```python
    import pulumi
    import pulumi_gcp as gcp

    basic = gcp.monitoring.get_notification_channel(display_name="Test Notification Channel")
    alert_policy = gcp.monitoring.AlertPolicy("alert_policy",
        display_name="My Alert Policy",
        notification_channels=[basic.name],
        combiner="OR",
        conditions=[{
            "display_name": "test condition",
            "condition_threshold": {
                "filter": "metric.type=\\"compute.googleapis.com/instance/disk/write_bytes_count\\" AND resource.type=\\"gce_instance\\"",
                "duration": "60s",
                "comparison": "COMPARISON_GT",
                "aggregations": [{
                    "alignment_period": "60s",
                    "per_series_aligner": "ALIGN_RATE",
                }],
            },
        }])
    ```


    :param _builtins.str display_name: The display name for this notification channel.
    :param Mapping[str, _builtins.str] labels: Labels (corresponding to the
           NotificationChannelDescriptor schema) to filter the notification channels by.
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the provider project is used.
    :param _builtins.str type: The type of the notification channel.
           
           - - -
           
           Other optional fields include:
    :param Mapping[str, _builtins.str] user_labels: User-provided key-value labels to filter by.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['labels'] = labels
    __args__['project'] = project
    __args__['type'] = type
    __args__['userLabels'] = user_labels
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:monitoring/getNotificationChannel:getNotificationChannel', __args__, opts=opts, typ=GetNotificationChannelResult)
    return __ret__.apply(lambda __response__: GetNotificationChannelResult(
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        enabled=pulumi.get(__response__, 'enabled'),
        force_delete=pulumi.get(__response__, 'force_delete'),
        id=pulumi.get(__response__, 'id'),
        labels=pulumi.get(__response__, 'labels'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        sensitive_labels=pulumi.get(__response__, 'sensitive_labels'),
        type=pulumi.get(__response__, 'type'),
        user_labels=pulumi.get(__response__, 'user_labels'),
        verification_status=pulumi.get(__response__, 'verification_status')))
