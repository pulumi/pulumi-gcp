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
    'FolderFeedCondition',
    'FolderFeedFeedOutputConfig',
    'FolderFeedFeedOutputConfigPubsubDestination',
    'OrganizationFeedCondition',
    'OrganizationFeedFeedOutputConfig',
    'OrganizationFeedFeedOutputConfigPubsubDestination',
    'ProjectFeedCondition',
    'ProjectFeedFeedOutputConfig',
    'ProjectFeedFeedOutputConfigPubsubDestination',
    'GetResourcesSearchAllResultResult',
    'GetSearchAllResourcesResultResult',
]

@pulumi.output_type
class FolderFeedCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 description: Optional[_builtins.str] = None,
                 location: Optional[_builtins.str] = None,
                 title: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str description: Description of the expression. This is a longer text which describes the expression,
               e.g. when hovered over it in a UI.
        :param _builtins.str location: String indicating the location of the expression for error reporting, e.g. a file
               name and a position in the file.
        :param _builtins.str title: Title for the expression, i.e. a short string describing its purpose.
               This can be used e.g. in UIs which allow to enter the expression.
        """
        pulumi.set(__self__, "expression", expression)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        Description of the expression. This is a longer text which describes the expression,
        e.g. when hovered over it in a UI.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[_builtins.str]:
        """
        String indicating the location of the expression for error reporting, e.g. a file
        name and a position in the file.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def title(self) -> Optional[_builtins.str]:
        """
        Title for the expression, i.e. a short string describing its purpose.
        This can be used e.g. in UIs which allow to enter the expression.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class FolderFeedFeedOutputConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pubsubDestination":
            suggest = "pubsub_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FolderFeedFeedOutputConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FolderFeedFeedOutputConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FolderFeedFeedOutputConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pubsub_destination: 'outputs.FolderFeedFeedOutputConfigPubsubDestination'):
        """
        :param 'FolderFeedFeedOutputConfigPubsubDestinationArgs' pubsub_destination: Destination on Cloud Pubsub.
               Structure is documented below.
        """
        pulumi.set(__self__, "pubsub_destination", pubsub_destination)

    @_builtins.property
    @pulumi.getter(name="pubsubDestination")
    def pubsub_destination(self) -> 'outputs.FolderFeedFeedOutputConfigPubsubDestination':
        """
        Destination on Cloud Pubsub.
        Structure is documented below.
        """
        return pulumi.get(self, "pubsub_destination")


@pulumi.output_type
class FolderFeedFeedOutputConfigPubsubDestination(dict):
    def __init__(__self__, *,
                 topic: _builtins.str):
        """
        :param _builtins.str topic: Destination on Cloud Pubsub topic.
        """
        pulumi.set(__self__, "topic", topic)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> _builtins.str:
        """
        Destination on Cloud Pubsub topic.
        """
        return pulumi.get(self, "topic")


@pulumi.output_type
class OrganizationFeedCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 description: Optional[_builtins.str] = None,
                 location: Optional[_builtins.str] = None,
                 title: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str description: Description of the expression. This is a longer text which describes the expression,
               e.g. when hovered over it in a UI.
        :param _builtins.str location: String indicating the location of the expression for error reporting, e.g. a file
               name and a position in the file.
        :param _builtins.str title: Title for the expression, i.e. a short string describing its purpose.
               This can be used e.g. in UIs which allow to enter the expression.
        """
        pulumi.set(__self__, "expression", expression)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        Description of the expression. This is a longer text which describes the expression,
        e.g. when hovered over it in a UI.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[_builtins.str]:
        """
        String indicating the location of the expression for error reporting, e.g. a file
        name and a position in the file.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def title(self) -> Optional[_builtins.str]:
        """
        Title for the expression, i.e. a short string describing its purpose.
        This can be used e.g. in UIs which allow to enter the expression.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class OrganizationFeedFeedOutputConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pubsubDestination":
            suggest = "pubsub_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OrganizationFeedFeedOutputConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OrganizationFeedFeedOutputConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OrganizationFeedFeedOutputConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pubsub_destination: 'outputs.OrganizationFeedFeedOutputConfigPubsubDestination'):
        """
        :param 'OrganizationFeedFeedOutputConfigPubsubDestinationArgs' pubsub_destination: Destination on Cloud Pubsub.
               Structure is documented below.
        """
        pulumi.set(__self__, "pubsub_destination", pubsub_destination)

    @_builtins.property
    @pulumi.getter(name="pubsubDestination")
    def pubsub_destination(self) -> 'outputs.OrganizationFeedFeedOutputConfigPubsubDestination':
        """
        Destination on Cloud Pubsub.
        Structure is documented below.
        """
        return pulumi.get(self, "pubsub_destination")


@pulumi.output_type
class OrganizationFeedFeedOutputConfigPubsubDestination(dict):
    def __init__(__self__, *,
                 topic: _builtins.str):
        """
        :param _builtins.str topic: Destination on Cloud Pubsub topic.
        """
        pulumi.set(__self__, "topic", topic)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> _builtins.str:
        """
        Destination on Cloud Pubsub topic.
        """
        return pulumi.get(self, "topic")


@pulumi.output_type
class ProjectFeedCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 description: Optional[_builtins.str] = None,
                 location: Optional[_builtins.str] = None,
                 title: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str description: Description of the expression. This is a longer text which describes the expression,
               e.g. when hovered over it in a UI.
        :param _builtins.str location: String indicating the location of the expression for error reporting, e.g. a file
               name and a position in the file.
        :param _builtins.str title: Title for the expression, i.e. a short string describing its purpose.
               This can be used e.g. in UIs which allow to enter the expression.
        """
        pulumi.set(__self__, "expression", expression)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        Description of the expression. This is a longer text which describes the expression,
        e.g. when hovered over it in a UI.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[_builtins.str]:
        """
        String indicating the location of the expression for error reporting, e.g. a file
        name and a position in the file.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def title(self) -> Optional[_builtins.str]:
        """
        Title for the expression, i.e. a short string describing its purpose.
        This can be used e.g. in UIs which allow to enter the expression.
        """
        return pulumi.get(self, "title")


@pulumi.output_type
class ProjectFeedFeedOutputConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pubsubDestination":
            suggest = "pubsub_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProjectFeedFeedOutputConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProjectFeedFeedOutputConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProjectFeedFeedOutputConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pubsub_destination: 'outputs.ProjectFeedFeedOutputConfigPubsubDestination'):
        """
        :param 'ProjectFeedFeedOutputConfigPubsubDestinationArgs' pubsub_destination: Destination on Cloud Pubsub.
               Structure is documented below.
        """
        pulumi.set(__self__, "pubsub_destination", pubsub_destination)

    @_builtins.property
    @pulumi.getter(name="pubsubDestination")
    def pubsub_destination(self) -> 'outputs.ProjectFeedFeedOutputConfigPubsubDestination':
        """
        Destination on Cloud Pubsub.
        Structure is documented below.
        """
        return pulumi.get(self, "pubsub_destination")


@pulumi.output_type
class ProjectFeedFeedOutputConfigPubsubDestination(dict):
    def __init__(__self__, *,
                 topic: _builtins.str):
        """
        :param _builtins.str topic: Destination on Cloud Pubsub topic.
        """
        pulumi.set(__self__, "topic", topic)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> _builtins.str:
        """
        Destination on Cloud Pubsub topic.
        """
        return pulumi.get(self, "topic")


@pulumi.output_type
class GetResourcesSearchAllResultResult(dict):
    def __init__(__self__, *,
                 additional_attributes: Sequence[_builtins.str],
                 asset_type: _builtins.str,
                 description: _builtins.str,
                 display_name: _builtins.str,
                 labels: Mapping[str, _builtins.str],
                 location: _builtins.str,
                 name: _builtins.str,
                 network_tags: Sequence[_builtins.str],
                 project: _builtins.str):
        """
        :param Sequence[_builtins.str] additional_attributes: Additional searchable attributes of this resource. Informational only. The exact set of attributes is subject to change. For example: project id, DNS name etc.
        :param _builtins.str asset_type: The type of this resource.
        :param _builtins.str description: One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        :param _builtins.str display_name: The display name of this resource.
        :param Mapping[str, _builtins.str] labels: Labels associated with this resource.
        :param _builtins.str location: Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        :param _builtins.str name: The full resource name. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        :param Sequence[_builtins.str] network_tags: Network tags associated with this resource.
        :param _builtins.str project: The project that this resource belongs to, in the form of `projects/{project_number}`.
        """
        pulumi.set(__self__, "additional_attributes", additional_attributes)
        pulumi.set(__self__, "asset_type", asset_type)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "network_tags", network_tags)
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="additionalAttributes")
    def additional_attributes(self) -> Sequence[_builtins.str]:
        """
        Additional searchable attributes of this resource. Informational only. The exact set of attributes is subject to change. For example: project id, DNS name etc.
        """
        return pulumi.get(self, "additional_attributes")

    @_builtins.property
    @pulumi.getter(name="assetType")
    def asset_type(self) -> _builtins.str:
        """
        The type of this resource.
        """
        return pulumi.get(self, "asset_type")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        """
        The display name of this resource.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        """
        Labels associated with this resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The full resource name. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkTags")
    def network_tags(self) -> Sequence[_builtins.str]:
        """
        Network tags associated with this resource.
        """
        return pulumi.get(self, "network_tags")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        """
        The project that this resource belongs to, in the form of `projects/{project_number}`.
        """
        return pulumi.get(self, "project")


@pulumi.output_type
class GetSearchAllResourcesResultResult(dict):
    def __init__(__self__, *,
                 asset_type: _builtins.str,
                 create_time: _builtins.str,
                 description: _builtins.str,
                 display_name: _builtins.str,
                 folders: Sequence[_builtins.str],
                 kms_keys: Sequence[_builtins.str],
                 labels: Mapping[str, _builtins.str],
                 location: _builtins.str,
                 name: _builtins.str,
                 network_tags: Sequence[_builtins.str],
                 organization: _builtins.str,
                 parent_asset_type: _builtins.str,
                 parent_full_resource_name: _builtins.str,
                 project: _builtins.str,
                 state: _builtins.str,
                 update_time: _builtins.str):
        """
        :param _builtins.str asset_type: The type of this resource.
        :param _builtins.str create_time: The create timestamp of this resource, at which the resource was created.
        :param _builtins.str description: One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        :param _builtins.str display_name: The display name of this resource.
        :param Sequence[_builtins.str] folders: The folder(s) that this resource belongs to, in the form of `folders/{FOLDER_NUMBER}`. This field is available when the resource belongs to one or more folders.
        :param Sequence[_builtins.str] kms_keys: The Cloud KMS CryptoKey names or CryptoKeyVersion names. This field is available only when the resource's Protobuf contains it.
        :param Mapping[str, _builtins.str] labels: Labels associated with this resource.
        :param _builtins.str location: Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        :param _builtins.str name: The full resource name of this resource.. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        :param Sequence[_builtins.str] network_tags: Network tags associated with this resource.
        :param _builtins.str organization: The organization that this resource belongs to, in the form of `organizations/{ORGANIZATION_NUMBER}`. This field is available when the resource belongs to an organization.
        :param _builtins.str parent_asset_type: The type of this resource's immediate parent, if there is one.
        :param _builtins.str parent_full_resource_name: The full resource name of this resource's parent, if it has one.
        :param _builtins.str project: The project that this resource belongs to, in the form of `projects/{project_number}`.
        :param _builtins.str state: The state of this resource.
        :param _builtins.str update_time: The last update timestamp of this resource, at which the resource was last modified or deleted.
        """
        pulumi.set(__self__, "asset_type", asset_type)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "folders", folders)
        pulumi.set(__self__, "kms_keys", kms_keys)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "network_tags", network_tags)
        pulumi.set(__self__, "organization", organization)
        pulumi.set(__self__, "parent_asset_type", parent_asset_type)
        pulumi.set(__self__, "parent_full_resource_name", parent_full_resource_name)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "state", state)
        pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="assetType")
    def asset_type(self) -> _builtins.str:
        """
        The type of this resource.
        """
        return pulumi.get(self, "asset_type")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        The create timestamp of this resource, at which the resource was created.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        """
        The display name of this resource.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def folders(self) -> Sequence[_builtins.str]:
        """
        The folder(s) that this resource belongs to, in the form of `folders/{FOLDER_NUMBER}`. This field is available when the resource belongs to one or more folders.
        """
        return pulumi.get(self, "folders")

    @_builtins.property
    @pulumi.getter(name="kmsKeys")
    def kms_keys(self) -> Sequence[_builtins.str]:
        """
        The Cloud KMS CryptoKey names or CryptoKeyVersion names. This field is available only when the resource's Protobuf contains it.
        """
        return pulumi.get(self, "kms_keys")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        """
        Labels associated with this resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The full resource name of this resource.. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkTags")
    def network_tags(self) -> Sequence[_builtins.str]:
        """
        Network tags associated with this resource.
        """
        return pulumi.get(self, "network_tags")

    @_builtins.property
    @pulumi.getter
    def organization(self) -> _builtins.str:
        """
        The organization that this resource belongs to, in the form of `organizations/{ORGANIZATION_NUMBER}`. This field is available when the resource belongs to an organization.
        """
        return pulumi.get(self, "organization")

    @_builtins.property
    @pulumi.getter(name="parentAssetType")
    def parent_asset_type(self) -> _builtins.str:
        """
        The type of this resource's immediate parent, if there is one.
        """
        return pulumi.get(self, "parent_asset_type")

    @_builtins.property
    @pulumi.getter(name="parentFullResourceName")
    def parent_full_resource_name(self) -> _builtins.str:
        """
        The full resource name of this resource's parent, if it has one.
        """
        return pulumi.get(self, "parent_full_resource_name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        """
        The project that this resource belongs to, in the form of `projects/{project_number}`.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def state(self) -> _builtins.str:
        """
        The state of this resource.
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> _builtins.str:
        """
        The last update timestamp of this resource, at which the resource was last modified or deleted.
        """
        return pulumi.get(self, "update_time")


