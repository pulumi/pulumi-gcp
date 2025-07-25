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

__all__ = ['BackupPolicyArgs', 'BackupPolicy']

@pulumi.input_type
class BackupPolicyArgs:
    def __init__(__self__, *,
                 daily_backup_limit: pulumi.Input[_builtins.int],
                 location: pulumi.Input[_builtins.str],
                 monthly_backup_limit: pulumi.Input[_builtins.int],
                 weekly_backup_limit: pulumi.Input[_builtins.int],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a BackupPolicy resource.
        :param pulumi.Input[_builtins.int] daily_backup_limit: Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        :param pulumi.Input[_builtins.str] location: Name of the region for the policy to apply to.
        :param pulumi.Input[_builtins.int] monthly_backup_limit: Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        :param pulumi.Input[_builtins.int] weekly_backup_limit: Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        :param pulumi.Input[_builtins.str] description: An optional description of this resource.
        :param pulumi.Input[_builtins.bool] enabled: If enabled, make backups automatically according to the schedules.
               This will be applied to all volumes that have this policy attached and enforced on volume level.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: The name of the backup policy. Needs to be unique per location.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "daily_backup_limit", daily_backup_limit)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "monthly_backup_limit", monthly_backup_limit)
        pulumi.set(__self__, "weekly_backup_limit", weekly_backup_limit)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="dailyBackupLimit")
    def daily_backup_limit(self) -> pulumi.Input[_builtins.int]:
        """
        Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        """
        return pulumi.get(self, "daily_backup_limit")

    @daily_backup_limit.setter
    def daily_backup_limit(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "daily_backup_limit", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        Name of the region for the policy to apply to.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="monthlyBackupLimit")
    def monthly_backup_limit(self) -> pulumi.Input[_builtins.int]:
        """
        Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        return pulumi.get(self, "monthly_backup_limit")

    @monthly_backup_limit.setter
    def monthly_backup_limit(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "monthly_backup_limit", value)

    @_builtins.property
    @pulumi.getter(name="weeklyBackupLimit")
    def weekly_backup_limit(self) -> pulumi.Input[_builtins.int]:
        """
        Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        return pulumi.get(self, "weekly_backup_limit")

    @weekly_backup_limit.setter
    def weekly_backup_limit(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "weekly_backup_limit", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional description of this resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If enabled, make backups automatically according to the schedules.
        This will be applied to all volumes that have this policy attached and enforced on volume level.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the backup policy. Needs to be unique per location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _BackupPolicyState:
    def __init__(__self__, *,
                 assigned_volume_count: Optional[pulumi.Input[_builtins.int]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 daily_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 monthly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 weekly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering BackupPolicy resources.
        :param pulumi.Input[_builtins.int] assigned_volume_count: The total number of volumes assigned by this backup policy.
        :param pulumi.Input[_builtins.str] create_time: Create time of the backup policy. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
        :param pulumi.Input[_builtins.int] daily_backup_limit: Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        :param pulumi.Input[_builtins.str] description: An optional description of this resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[_builtins.bool] enabled: If enabled, make backups automatically according to the schedules.
               This will be applied to all volumes that have this policy attached and enforced on volume level.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] location: Name of the region for the policy to apply to.
        :param pulumi.Input[_builtins.int] monthly_backup_limit: Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        :param pulumi.Input[_builtins.str] name: The name of the backup policy. Needs to be unique per location.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] state: The state of the backup policy.
        :param pulumi.Input[_builtins.int] weekly_backup_limit: Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        if assigned_volume_count is not None:
            pulumi.set(__self__, "assigned_volume_count", assigned_volume_count)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if daily_backup_limit is not None:
            pulumi.set(__self__, "daily_backup_limit", daily_backup_limit)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if effective_labels is not None:
            pulumi.set(__self__, "effective_labels", effective_labels)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if monthly_backup_limit is not None:
            pulumi.set(__self__, "monthly_backup_limit", monthly_backup_limit)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if pulumi_labels is not None:
            pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if weekly_backup_limit is not None:
            pulumi.set(__self__, "weekly_backup_limit", weekly_backup_limit)

    @_builtins.property
    @pulumi.getter(name="assignedVolumeCount")
    def assigned_volume_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The total number of volumes assigned by this backup policy.
        """
        return pulumi.get(self, "assigned_volume_count")

    @assigned_volume_count.setter
    def assigned_volume_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "assigned_volume_count", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Create time of the backup policy. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="dailyBackupLimit")
    def daily_backup_limit(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        """
        return pulumi.get(self, "daily_backup_limit")

    @daily_backup_limit.setter
    def daily_backup_limit(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "daily_backup_limit", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional description of this resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @effective_labels.setter
    def effective_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "effective_labels", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If enabled, make backups automatically according to the schedules.
        This will be applied to all volumes that have this policy attached and enforced on volume level.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the region for the policy to apply to.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="monthlyBackupLimit")
    def monthly_backup_limit(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        return pulumi.get(self, "monthly_backup_limit")

    @monthly_backup_limit.setter
    def monthly_backup_limit(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "monthly_backup_limit", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the backup policy. Needs to be unique per location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The combination of labels configured directly on the resource
        and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @pulumi_labels.setter
    def pulumi_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "pulumi_labels", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The state of the backup policy.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter(name="weeklyBackupLimit")
    def weekly_backup_limit(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        return pulumi.get(self, "weekly_backup_limit")

    @weekly_backup_limit.setter
    def weekly_backup_limit(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "weekly_backup_limit", value)


@pulumi.type_token("gcp:netapp/backupPolicy:BackupPolicy")
class BackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 daily_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 monthly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 weekly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        A backup policy is used to schedule backups at regular daily, weekly, or monthly intervals.
        Backup policies allow you to attach a backup schedule to a volume.
        The policy defines how many backups to retain at daily, weekly, or monthly intervals.

        To get more information about BackupPolicy, see:

        * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.backupPolicies)
        * How-to Guides
            * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-backups#about_backup_policies)

        ## Example Usage

        ### Netapp Backup Policy Full

        ```python
        import pulumi
        import pulumi_gcp as gcp

        test_backup_policy_full = gcp.netapp.BackupPolicy("test_backup_policy_full",
            name="test-backup-policy-full",
            location="us-central1",
            daily_backup_limit=2,
            weekly_backup_limit=1,
            monthly_backup_limit=1,
            description="TF test backup schedule",
            enabled=True,
            labels={
                "foo": "bar",
            })
        ```

        ## Import

        BackupPolicy can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/backupPolicies/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, BackupPolicy can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:netapp/backupPolicy:BackupPolicy default projects/{{project}}/locations/{{location}}/backupPolicies/{{name}}
        ```

        ```sh
        $ pulumi import gcp:netapp/backupPolicy:BackupPolicy default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:netapp/backupPolicy:BackupPolicy default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] daily_backup_limit: Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        :param pulumi.Input[_builtins.str] description: An optional description of this resource.
        :param pulumi.Input[_builtins.bool] enabled: If enabled, make backups automatically according to the schedules.
               This will be applied to all volumes that have this policy attached and enforced on volume level.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] location: Name of the region for the policy to apply to.
        :param pulumi.Input[_builtins.int] monthly_backup_limit: Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        :param pulumi.Input[_builtins.str] name: The name of the backup policy. Needs to be unique per location.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.int] weekly_backup_limit: Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A backup policy is used to schedule backups at regular daily, weekly, or monthly intervals.
        Backup policies allow you to attach a backup schedule to a volume.
        The policy defines how many backups to retain at daily, weekly, or monthly intervals.

        To get more information about BackupPolicy, see:

        * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.backupPolicies)
        * How-to Guides
            * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-backups#about_backup_policies)

        ## Example Usage

        ### Netapp Backup Policy Full

        ```python
        import pulumi
        import pulumi_gcp as gcp

        test_backup_policy_full = gcp.netapp.BackupPolicy("test_backup_policy_full",
            name="test-backup-policy-full",
            location="us-central1",
            daily_backup_limit=2,
            weekly_backup_limit=1,
            monthly_backup_limit=1,
            description="TF test backup schedule",
            enabled=True,
            labels={
                "foo": "bar",
            })
        ```

        ## Import

        BackupPolicy can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/backupPolicies/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, BackupPolicy can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:netapp/backupPolicy:BackupPolicy default projects/{{project}}/locations/{{location}}/backupPolicies/{{name}}
        ```

        ```sh
        $ pulumi import gcp:netapp/backupPolicy:BackupPolicy default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:netapp/backupPolicy:BackupPolicy default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param BackupPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 daily_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 monthly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 weekly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupPolicyArgs.__new__(BackupPolicyArgs)

            if daily_backup_limit is None and not opts.urn:
                raise TypeError("Missing required property 'daily_backup_limit'")
            __props__.__dict__["daily_backup_limit"] = daily_backup_limit
            __props__.__dict__["description"] = description
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["labels"] = labels
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            if monthly_backup_limit is None and not opts.urn:
                raise TypeError("Missing required property 'monthly_backup_limit'")
            __props__.__dict__["monthly_backup_limit"] = monthly_backup_limit
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            if weekly_backup_limit is None and not opts.urn:
                raise TypeError("Missing required property 'weekly_backup_limit'")
            __props__.__dict__["weekly_backup_limit"] = weekly_backup_limit
            __props__.__dict__["assigned_volume_count"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["effective_labels"] = None
            __props__.__dict__["pulumi_labels"] = None
            __props__.__dict__["state"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["effectiveLabels", "pulumiLabels"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(BackupPolicy, __self__).__init__(
            'gcp:netapp/backupPolicy:BackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            assigned_volume_count: Optional[pulumi.Input[_builtins.int]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            daily_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            monthly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None,
            weekly_backup_limit: Optional[pulumi.Input[_builtins.int]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] assigned_volume_count: The total number of volumes assigned by this backup policy.
        :param pulumi.Input[_builtins.str] create_time: Create time of the backup policy. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
        :param pulumi.Input[_builtins.int] daily_backup_limit: Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        :param pulumi.Input[_builtins.str] description: An optional description of this resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[_builtins.bool] enabled: If enabled, make backups automatically according to the schedules.
               This will be applied to all volumes that have this policy attached and enforced on volume level.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] location: Name of the region for the policy to apply to.
        :param pulumi.Input[_builtins.int] monthly_backup_limit: Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        :param pulumi.Input[_builtins.str] name: The name of the backup policy. Needs to be unique per location.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] state: The state of the backup policy.
        :param pulumi.Input[_builtins.int] weekly_backup_limit: Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupPolicyState.__new__(_BackupPolicyState)

        __props__.__dict__["assigned_volume_count"] = assigned_volume_count
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["daily_backup_limit"] = daily_backup_limit
        __props__.__dict__["description"] = description
        __props__.__dict__["effective_labels"] = effective_labels
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["labels"] = labels
        __props__.__dict__["location"] = location
        __props__.__dict__["monthly_backup_limit"] = monthly_backup_limit
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["pulumi_labels"] = pulumi_labels
        __props__.__dict__["state"] = state
        __props__.__dict__["weekly_backup_limit"] = weekly_backup_limit
        return BackupPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="assignedVolumeCount")
    def assigned_volume_count(self) -> pulumi.Output[_builtins.int]:
        """
        The total number of volumes assigned by this backup policy.
        """
        return pulumi.get(self, "assigned_volume_count")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Create time of the backup policy. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="dailyBackupLimit")
    def daily_backup_limit(self) -> pulumi.Output[_builtins.int]:
        """
        Number of daily backups to keep. Note that the minimum daily backup limit is 2.
        """
        return pulumi.get(self, "daily_backup_limit")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An optional description of this resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        If enabled, make backups automatically according to the schedules.
        This will be applied to all volumes that have this policy attached and enforced on volume level.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the region for the policy to apply to.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="monthlyBackupLimit")
    def monthly_backup_limit(self) -> pulumi.Output[_builtins.int]:
        """
        Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        return pulumi.get(self, "monthly_backup_limit")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the backup policy. Needs to be unique per location.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        The combination of labels configured directly on the resource
        and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        The state of the backup policy.
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter(name="weeklyBackupLimit")
    def weekly_backup_limit(self) -> pulumi.Output[_builtins.int]:
        """
        Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
        """
        return pulumi.get(self, "weekly_backup_limit")

