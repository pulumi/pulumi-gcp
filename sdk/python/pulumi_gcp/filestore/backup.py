# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BackupArgs', 'Backup']

@pulumi.input_type
class BackupArgs:
    def __init__(__self__, *,
                 location: pulumi.Input[str],
                 source_file_share: pulumi.Input[str],
                 source_instance: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Backup resource.
        :param pulumi.Input[str] location: The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        :param pulumi.Input[str] source_file_share: Name of the file share in the source Cloud Filestore instance that the backup is created from.
        :param pulumi.Input[str] source_instance: The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        :param pulumi.Input[str] description: A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user-provided metadata.
        :param pulumi.Input[str] name: The resource name of the backup. The name must be unique within the specified instance.
               The name must be 1-63 characters long, and comply with
               RFC1035. Specifically, the name must be 1-63 characters long and match
               the regular expression `a-z?` which means the
               first character must be a lowercase letter, and all following
               characters must be a dash, lowercase letter, or digit, except the last
               character, which cannot be a dash.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "source_file_share", source_file_share)
        pulumi.set(__self__, "source_instance", source_instance)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="sourceFileShare")
    def source_file_share(self) -> pulumi.Input[str]:
        """
        Name of the file share in the source Cloud Filestore instance that the backup is created from.
        """
        return pulumi.get(self, "source_file_share")

    @source_file_share.setter
    def source_file_share(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_file_share", value)

    @property
    @pulumi.getter(name="sourceInstance")
    def source_instance(self) -> pulumi.Input[str]:
        """
        The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        """
        return pulumi.get(self, "source_instance")

    @source_instance.setter
    def source_instance(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_instance", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Resource labels to represent user-provided metadata.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the backup. The name must be unique within the specified instance.
        The name must be 1-63 characters long, and comply with
        RFC1035. Specifically, the name must be 1-63 characters long and match
        the regular expression `a-z?` which means the
        first character must be a lowercase letter, and all following
        characters must be a dash, lowercase letter, or digit, except the last
        character, which cannot be a dash.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _BackupState:
    def __init__(__self__, *,
                 capacity_gb: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 download_bytes: Optional[pulumi.Input[str]] = None,
                 kms_key_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 source_file_share: Optional[pulumi.Input[str]] = None,
                 source_instance: Optional[pulumi.Input[str]] = None,
                 source_instance_tier: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 storage_bytes: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Backup resources.
        :param pulumi.Input[str] capacity_gb: The amount of bytes needed to allocate a full copy of the snapshot content.
        :param pulumi.Input[str] create_time: The time when the snapshot was created in RFC3339 text format.
        :param pulumi.Input[str] description: A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        :param pulumi.Input[str] download_bytes: Amount of bytes that will be downloaded if the backup is restored.
        :param pulumi.Input[str] kms_key_name: KMS key name used for data encryption.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user-provided metadata.
        :param pulumi.Input[str] location: The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        :param pulumi.Input[str] name: The resource name of the backup. The name must be unique within the specified instance.
               The name must be 1-63 characters long, and comply with
               RFC1035. Specifically, the name must be 1-63 characters long and match
               the regular expression `a-z?` which means the
               first character must be a lowercase letter, and all following
               characters must be a dash, lowercase letter, or digit, except the last
               character, which cannot be a dash.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] source_file_share: Name of the file share in the source Cloud Filestore instance that the backup is created from.
        :param pulumi.Input[str] source_instance: The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        :param pulumi.Input[str] source_instance_tier: The service tier of the source Cloud Filestore instance that this backup is created from.
        :param pulumi.Input[str] state: The backup state.
        :param pulumi.Input[str] storage_bytes: The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
        """
        if capacity_gb is not None:
            pulumi.set(__self__, "capacity_gb", capacity_gb)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if download_bytes is not None:
            pulumi.set(__self__, "download_bytes", download_bytes)
        if kms_key_name is not None:
            pulumi.set(__self__, "kms_key_name", kms_key_name)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if source_file_share is not None:
            pulumi.set(__self__, "source_file_share", source_file_share)
        if source_instance is not None:
            pulumi.set(__self__, "source_instance", source_instance)
        if source_instance_tier is not None:
            pulumi.set(__self__, "source_instance_tier", source_instance_tier)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if storage_bytes is not None:
            pulumi.set(__self__, "storage_bytes", storage_bytes)

    @property
    @pulumi.getter(name="capacityGb")
    def capacity_gb(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of bytes needed to allocate a full copy of the snapshot content.
        """
        return pulumi.get(self, "capacity_gb")

    @capacity_gb.setter
    def capacity_gb(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "capacity_gb", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when the snapshot was created in RFC3339 text format.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="downloadBytes")
    def download_bytes(self) -> Optional[pulumi.Input[str]]:
        """
        Amount of bytes that will be downloaded if the backup is restored.
        """
        return pulumi.get(self, "download_bytes")

    @download_bytes.setter
    def download_bytes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "download_bytes", value)

    @property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> Optional[pulumi.Input[str]]:
        """
        KMS key name used for data encryption.
        """
        return pulumi.get(self, "kms_key_name")

    @kms_key_name.setter
    def kms_key_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_name", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Resource labels to represent user-provided metadata.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the backup. The name must be unique within the specified instance.
        The name must be 1-63 characters long, and comply with
        RFC1035. Specifically, the name must be 1-63 characters long and match
        the regular expression `a-z?` which means the
        first character must be a lowercase letter, and all following
        characters must be a dash, lowercase letter, or digit, except the last
        character, which cannot be a dash.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="sourceFileShare")
    def source_file_share(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the file share in the source Cloud Filestore instance that the backup is created from.
        """
        return pulumi.get(self, "source_file_share")

    @source_file_share.setter
    def source_file_share(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_file_share", value)

    @property
    @pulumi.getter(name="sourceInstance")
    def source_instance(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        """
        return pulumi.get(self, "source_instance")

    @source_instance.setter
    def source_instance(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_instance", value)

    @property
    @pulumi.getter(name="sourceInstanceTier")
    def source_instance_tier(self) -> Optional[pulumi.Input[str]]:
        """
        The service tier of the source Cloud Filestore instance that this backup is created from.
        """
        return pulumi.get(self, "source_instance_tier")

    @source_instance_tier.setter
    def source_instance_tier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_instance_tier", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The backup state.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="storageBytes")
    def storage_bytes(self) -> Optional[pulumi.Input[str]]:
        """
        The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
        """
        return pulumi.get(self, "storage_bytes")

    @storage_bytes.setter
    def storage_bytes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_bytes", value)


class Backup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 source_file_share: Optional[pulumi.Input[str]] = None,
                 source_instance: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A Google Cloud Filestore backup.

        To get more information about Backup, see:

        * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.instances.backups)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/filestore/docs/backups)
            * [Creating Backups](https://cloud.google.com/filestore/docs/create-backups)

        ## Example Usage
        ### Filestore Backup Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        instance = gcp.filestore.Instance("instance",
            location="us-central1-b",
            tier="BASIC_SSD",
            file_shares=gcp.filestore.InstanceFileSharesArgs(
                capacity_gb=2560,
                name="share1",
            ),
            networks=[gcp.filestore.InstanceNetworkArgs(
                network="default",
                modes=["MODE_IPV4"],
                connect_mode="DIRECT_PEERING",
            )])
        backup = gcp.filestore.Backup("backup",
            location="us-central1",
            source_instance=instance.id,
            source_file_share="share1",
            description="This is a filestore backup for the test instance",
            labels={
                "files": "label1",
                "other-label": "label2",
            })
        ```

        ## Import

        Backup can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:filestore/backup:Backup default projects/{{project}}/locations/{{location}}/backups/{{name}}
        ```

        ```sh
         $ pulumi import gcp:filestore/backup:Backup default {{project}}/{{location}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:filestore/backup:Backup default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user-provided metadata.
        :param pulumi.Input[str] location: The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        :param pulumi.Input[str] name: The resource name of the backup. The name must be unique within the specified instance.
               The name must be 1-63 characters long, and comply with
               RFC1035. Specifically, the name must be 1-63 characters long and match
               the regular expression `a-z?` which means the
               first character must be a lowercase letter, and all following
               characters must be a dash, lowercase letter, or digit, except the last
               character, which cannot be a dash.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] source_file_share: Name of the file share in the source Cloud Filestore instance that the backup is created from.
        :param pulumi.Input[str] source_instance: The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Google Cloud Filestore backup.

        To get more information about Backup, see:

        * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.instances.backups)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/filestore/docs/backups)
            * [Creating Backups](https://cloud.google.com/filestore/docs/create-backups)

        ## Example Usage
        ### Filestore Backup Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        instance = gcp.filestore.Instance("instance",
            location="us-central1-b",
            tier="BASIC_SSD",
            file_shares=gcp.filestore.InstanceFileSharesArgs(
                capacity_gb=2560,
                name="share1",
            ),
            networks=[gcp.filestore.InstanceNetworkArgs(
                network="default",
                modes=["MODE_IPV4"],
                connect_mode="DIRECT_PEERING",
            )])
        backup = gcp.filestore.Backup("backup",
            location="us-central1",
            source_instance=instance.id,
            source_file_share="share1",
            description="This is a filestore backup for the test instance",
            labels={
                "files": "label1",
                "other-label": "label2",
            })
        ```

        ## Import

        Backup can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:filestore/backup:Backup default projects/{{project}}/locations/{{location}}/backups/{{name}}
        ```

        ```sh
         $ pulumi import gcp:filestore/backup:Backup default {{project}}/{{location}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:filestore/backup:Backup default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param BackupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 source_file_share: Optional[pulumi.Input[str]] = None,
                 source_instance: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupArgs.__new__(BackupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            if source_file_share is None and not opts.urn:
                raise TypeError("Missing required property 'source_file_share'")
            __props__.__dict__["source_file_share"] = source_file_share
            if source_instance is None and not opts.urn:
                raise TypeError("Missing required property 'source_instance'")
            __props__.__dict__["source_instance"] = source_instance
            __props__.__dict__["capacity_gb"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["download_bytes"] = None
            __props__.__dict__["kms_key_name"] = None
            __props__.__dict__["source_instance_tier"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["storage_bytes"] = None
        super(Backup, __self__).__init__(
            'gcp:filestore/backup:Backup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            capacity_gb: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            download_bytes: Optional[pulumi.Input[str]] = None,
            kms_key_name: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            source_file_share: Optional[pulumi.Input[str]] = None,
            source_instance: Optional[pulumi.Input[str]] = None,
            source_instance_tier: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            storage_bytes: Optional[pulumi.Input[str]] = None) -> 'Backup':
        """
        Get an existing Backup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] capacity_gb: The amount of bytes needed to allocate a full copy of the snapshot content.
        :param pulumi.Input[str] create_time: The time when the snapshot was created in RFC3339 text format.
        :param pulumi.Input[str] description: A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        :param pulumi.Input[str] download_bytes: Amount of bytes that will be downloaded if the backup is restored.
        :param pulumi.Input[str] kms_key_name: KMS key name used for data encryption.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user-provided metadata.
        :param pulumi.Input[str] location: The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        :param pulumi.Input[str] name: The resource name of the backup. The name must be unique within the specified instance.
               The name must be 1-63 characters long, and comply with
               RFC1035. Specifically, the name must be 1-63 characters long and match
               the regular expression `a-z?` which means the
               first character must be a lowercase letter, and all following
               characters must be a dash, lowercase letter, or digit, except the last
               character, which cannot be a dash.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] source_file_share: Name of the file share in the source Cloud Filestore instance that the backup is created from.
        :param pulumi.Input[str] source_instance: The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        :param pulumi.Input[str] source_instance_tier: The service tier of the source Cloud Filestore instance that this backup is created from.
        :param pulumi.Input[str] state: The backup state.
        :param pulumi.Input[str] storage_bytes: The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupState.__new__(_BackupState)

        __props__.__dict__["capacity_gb"] = capacity_gb
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["download_bytes"] = download_bytes
        __props__.__dict__["kms_key_name"] = kms_key_name
        __props__.__dict__["labels"] = labels
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["source_file_share"] = source_file_share
        __props__.__dict__["source_instance"] = source_instance
        __props__.__dict__["source_instance_tier"] = source_instance_tier
        __props__.__dict__["state"] = state
        __props__.__dict__["storage_bytes"] = storage_bytes
        return Backup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="capacityGb")
    def capacity_gb(self) -> pulumi.Output[str]:
        """
        The amount of bytes needed to allocate a full copy of the snapshot content.
        """
        return pulumi.get(self, "capacity_gb")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The time when the snapshot was created in RFC3339 text format.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="downloadBytes")
    def download_bytes(self) -> pulumi.Output[str]:
        """
        Amount of bytes that will be downloaded if the backup is restored.
        """
        return pulumi.get(self, "download_bytes")

    @property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> pulumi.Output[str]:
        """
        KMS key name used for data encryption.
        """
        return pulumi.get(self, "kms_key_name")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Resource labels to represent user-provided metadata.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The resource name of the backup. The name must be unique within the specified instance.
        The name must be 1-63 characters long, and comply with
        RFC1035. Specifically, the name must be 1-63 characters long and match
        the regular expression `a-z?` which means the
        first character must be a lowercase letter, and all following
        characters must be a dash, lowercase letter, or digit, except the last
        character, which cannot be a dash.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="sourceFileShare")
    def source_file_share(self) -> pulumi.Output[str]:
        """
        Name of the file share in the source Cloud Filestore instance that the backup is created from.
        """
        return pulumi.get(self, "source_file_share")

    @property
    @pulumi.getter(name="sourceInstance")
    def source_instance(self) -> pulumi.Output[str]:
        """
        The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
        """
        return pulumi.get(self, "source_instance")

    @property
    @pulumi.getter(name="sourceInstanceTier")
    def source_instance_tier(self) -> pulumi.Output[str]:
        """
        The service tier of the source Cloud Filestore instance that this backup is created from.
        """
        return pulumi.get(self, "source_instance_tier")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The backup state.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="storageBytes")
    def storage_bytes(self) -> pulumi.Output[str]:
        """
        The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
        """
        return pulumi.get(self, "storage_bytes")
