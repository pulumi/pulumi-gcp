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
from ._inputs import *

__all__ = ['LakeArgs', 'Lake']

@pulumi.input_type
class LakeArgs:
    def __init__(__self__, *,
                 location: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 metastore: Optional[pulumi.Input['LakeMetastoreArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Lake resource.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[_builtins.str] description: Optional. Description of the lake.
        :param pulumi.Input[_builtins.str] display_name: Optional. User friendly display name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Optional. User-defined labels for the lake.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input['LakeMetastoreArgs'] metastore: Optional. Settings to manage lake and Dataproc Metastore service instance association.
        :param pulumi.Input[_builtins.str] name: The name of the lake.
               
               
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project for the resource
        """
        pulumi.set(__self__, "location", location)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if metastore is not None:
            pulumi.set(__self__, "metastore", metastore)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        The location for the resource
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. Description of the lake.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. User friendly display name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Optional. User-defined labels for the lake.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def metastore(self) -> Optional[pulumi.Input['LakeMetastoreArgs']]:
        """
        Optional. Settings to manage lake and Dataproc Metastore service instance association.
        """
        return pulumi.get(self, "metastore")

    @metastore.setter
    def metastore(self, value: Optional[pulumi.Input['LakeMetastoreArgs']]):
        pulumi.set(self, "metastore", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the lake.



        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project for the resource
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _LakeState:
    def __init__(__self__, *,
                 asset_statuses: Optional[pulumi.Input[Sequence[pulumi.Input['LakeAssetStatusArgs']]]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 metastore: Optional[pulumi.Input['LakeMetastoreArgs']] = None,
                 metastore_statuses: Optional[pulumi.Input[Sequence[pulumi.Input['LakeMetastoreStatusArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 service_account: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 uid: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Lake resources.
        :param pulumi.Input[Sequence[pulumi.Input['LakeAssetStatusArgs']]] asset_statuses: Output only. Aggregated status of the underlying assets of the lake.
        :param pulumi.Input[_builtins.str] create_time: Output only. The time when the lake was created.
        :param pulumi.Input[_builtins.str] description: Optional. Description of the lake.
        :param pulumi.Input[_builtins.str] display_name: Optional. User friendly display name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Optional. User-defined labels for the lake.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input['LakeMetastoreArgs'] metastore: Optional. Settings to manage lake and Dataproc Metastore service instance association.
        :param pulumi.Input[Sequence[pulumi.Input['LakeMetastoreStatusArgs']]] metastore_statuses: Output only. Metastore status of the lake.
        :param pulumi.Input[_builtins.str] name: The name of the lake.
               
               
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project for the resource
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] service_account: Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
        :param pulumi.Input[_builtins.str] state: Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
        :param pulumi.Input[_builtins.str] uid: Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
        :param pulumi.Input[_builtins.str] update_time: Output only. The time when the lake was last updated.
        """
        if asset_statuses is not None:
            pulumi.set(__self__, "asset_statuses", asset_statuses)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if effective_labels is not None:
            pulumi.set(__self__, "effective_labels", effective_labels)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if metastore is not None:
            pulumi.set(__self__, "metastore", metastore)
        if metastore_statuses is not None:
            pulumi.set(__self__, "metastore_statuses", metastore_statuses)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if pulumi_labels is not None:
            pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if service_account is not None:
            pulumi.set(__self__, "service_account", service_account)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="assetStatuses")
    def asset_statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LakeAssetStatusArgs']]]]:
        """
        Output only. Aggregated status of the underlying assets of the lake.
        """
        return pulumi.get(self, "asset_statuses")

    @asset_statuses.setter
    def asset_statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LakeAssetStatusArgs']]]]):
        pulumi.set(self, "asset_statuses", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. The time when the lake was created.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. Description of the lake.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. User friendly display name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

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
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Optional. User-defined labels for the lake.

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
        The location for the resource
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def metastore(self) -> Optional[pulumi.Input['LakeMetastoreArgs']]:
        """
        Optional. Settings to manage lake and Dataproc Metastore service instance association.
        """
        return pulumi.get(self, "metastore")

    @metastore.setter
    def metastore(self, value: Optional[pulumi.Input['LakeMetastoreArgs']]):
        pulumi.set(self, "metastore", value)

    @_builtins.property
    @pulumi.getter(name="metastoreStatuses")
    def metastore_statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LakeMetastoreStatusArgs']]]]:
        """
        Output only. Metastore status of the lake.
        """
        return pulumi.get(self, "metastore_statuses")

    @metastore_statuses.setter
    def metastore_statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LakeMetastoreStatusArgs']]]]):
        pulumi.set(self, "metastore_statuses", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the lake.



        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project for the resource
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The combination of labels configured directly on the resource and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @pulumi_labels.setter
    def pulumi_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "pulumi_labels", value)

    @_builtins.property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
        """
        return pulumi.get(self, "service_account")

    @service_account.setter
    def service_account(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_account", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "uid", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. The time when the lake was last updated.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:dataplex/lake:Lake")
class Lake(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 metastore: Optional[pulumi.Input[Union['LakeMetastoreArgs', 'LakeMetastoreArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        The Dataplex Lake resource

        ## Example Usage

        ### Basic_lake
        A basic example of a dataplex lake
        ```python
        import pulumi
        import pulumi_gcp as gcp

        primary = gcp.dataplex.Lake("primary",
            location="us-west1",
            name="lake",
            description="Lake for DCL",
            display_name="Lake for DCL",
            project="my-project-name",
            labels={
                "my-lake": "exists",
            })
        ```

        ## Import

        Lake can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/lakes/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, Lake can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:dataplex/lake:Lake default projects/{{project}}/locations/{{location}}/lakes/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dataplex/lake:Lake default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dataplex/lake:Lake default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Optional. Description of the lake.
        :param pulumi.Input[_builtins.str] display_name: Optional. User friendly display name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Optional. User-defined labels for the lake.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[Union['LakeMetastoreArgs', 'LakeMetastoreArgsDict']] metastore: Optional. Settings to manage lake and Dataproc Metastore service instance association.
        :param pulumi.Input[_builtins.str] name: The name of the lake.
               
               
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project for the resource
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LakeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The Dataplex Lake resource

        ## Example Usage

        ### Basic_lake
        A basic example of a dataplex lake
        ```python
        import pulumi
        import pulumi_gcp as gcp

        primary = gcp.dataplex.Lake("primary",
            location="us-west1",
            name="lake",
            description="Lake for DCL",
            display_name="Lake for DCL",
            project="my-project-name",
            labels={
                "my-lake": "exists",
            })
        ```

        ## Import

        Lake can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/lakes/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, Lake can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:dataplex/lake:Lake default projects/{{project}}/locations/{{location}}/lakes/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dataplex/lake:Lake default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dataplex/lake:Lake default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param LakeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LakeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 metastore: Optional[pulumi.Input[Union['LakeMetastoreArgs', 'LakeMetastoreArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LakeArgs.__new__(LakeArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["labels"] = labels
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["metastore"] = metastore
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["asset_statuses"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["effective_labels"] = None
            __props__.__dict__["metastore_statuses"] = None
            __props__.__dict__["pulumi_labels"] = None
            __props__.__dict__["service_account"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uid"] = None
            __props__.__dict__["update_time"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["effectiveLabels", "pulumiLabels"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Lake, __self__).__init__(
            'gcp:dataplex/lake:Lake',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            asset_statuses: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LakeAssetStatusArgs', 'LakeAssetStatusArgsDict']]]]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            metastore: Optional[pulumi.Input[Union['LakeMetastoreArgs', 'LakeMetastoreArgsDict']]] = None,
            metastore_statuses: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LakeMetastoreStatusArgs', 'LakeMetastoreStatusArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            service_account: Optional[pulumi.Input[_builtins.str]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None,
            uid: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'Lake':
        """
        Get an existing Lake resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['LakeAssetStatusArgs', 'LakeAssetStatusArgsDict']]]] asset_statuses: Output only. Aggregated status of the underlying assets of the lake.
        :param pulumi.Input[_builtins.str] create_time: Output only. The time when the lake was created.
        :param pulumi.Input[_builtins.str] description: Optional. Description of the lake.
        :param pulumi.Input[_builtins.str] display_name: Optional. User friendly display name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Optional. User-defined labels for the lake.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[Union['LakeMetastoreArgs', 'LakeMetastoreArgsDict']] metastore: Optional. Settings to manage lake and Dataproc Metastore service instance association.
        :param pulumi.Input[Sequence[pulumi.Input[Union['LakeMetastoreStatusArgs', 'LakeMetastoreStatusArgsDict']]]] metastore_statuses: Output only. Metastore status of the lake.
        :param pulumi.Input[_builtins.str] name: The name of the lake.
               
               
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project for the resource
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] service_account: Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
        :param pulumi.Input[_builtins.str] state: Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
        :param pulumi.Input[_builtins.str] uid: Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
        :param pulumi.Input[_builtins.str] update_time: Output only. The time when the lake was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LakeState.__new__(_LakeState)

        __props__.__dict__["asset_statuses"] = asset_statuses
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["effective_labels"] = effective_labels
        __props__.__dict__["labels"] = labels
        __props__.__dict__["location"] = location
        __props__.__dict__["metastore"] = metastore
        __props__.__dict__["metastore_statuses"] = metastore_statuses
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["pulumi_labels"] = pulumi_labels
        __props__.__dict__["service_account"] = service_account
        __props__.__dict__["state"] = state
        __props__.__dict__["uid"] = uid
        __props__.__dict__["update_time"] = update_time
        return Lake(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="assetStatuses")
    def asset_statuses(self) -> pulumi.Output[Sequence['outputs.LakeAssetStatus']]:
        """
        Output only. Aggregated status of the underlying assets of the lake.
        """
        return pulumi.get(self, "asset_statuses")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. The time when the lake was created.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional. Description of the lake.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional. User friendly display name.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Optional. User-defined labels for the lake.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location for the resource
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def metastore(self) -> pulumi.Output[Optional['outputs.LakeMetastore']]:
        """
        Optional. Settings to manage lake and Dataproc Metastore service instance association.
        """
        return pulumi.get(self, "metastore")

    @_builtins.property
    @pulumi.getter(name="metastoreStatuses")
    def metastore_statuses(self) -> pulumi.Output[Sequence['outputs.LakeMetastoreStatus']]:
        """
        Output only. Metastore status of the lake.
        """
        return pulumi.get(self, "metastore_statuses")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the lake.



        - - -
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The project for the resource
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        The combination of labels configured directly on the resource and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Service account associated with this lake. This service account must be authorized to access or operate on resources managed by the lake.
        """
        return pulumi.get(self, "service_account")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Current state of the lake. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. System generated globally unique ID for the lake. This ID will be different if the lake is deleted and re-created with the same name.
        """
        return pulumi.get(self, "uid")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. The time when the lake was last updated.
        """
        return pulumi.get(self, "update_time")

