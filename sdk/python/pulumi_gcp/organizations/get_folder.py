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

__all__ = [
    'GetFolderResult',
    'AwaitableGetFolderResult',
    'get_folder',
    'get_folder_output',
]

@pulumi.output_type
class GetFolderResult:
    """
    A collection of values returned by getFolder.
    """
    def __init__(__self__, create_time=None, deletion_protection=None, display_name=None, folder=None, folder_id=None, id=None, lifecycle_state=None, lookup_organization=None, name=None, organization=None, parent=None):
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if deletion_protection and not isinstance(deletion_protection, bool):
            raise TypeError("Expected argument 'deletion_protection' to be a bool")
        pulumi.set(__self__, "deletion_protection", deletion_protection)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if folder_id and not isinstance(folder_id, str):
            raise TypeError("Expected argument 'folder_id' to be a str")
        pulumi.set(__self__, "folder_id", folder_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lifecycle_state and not isinstance(lifecycle_state, str):
            raise TypeError("Expected argument 'lifecycle_state' to be a str")
        pulumi.set(__self__, "lifecycle_state", lifecycle_state)
        if lookup_organization and not isinstance(lookup_organization, bool):
            raise TypeError("Expected argument 'lookup_organization' to be a bool")
        pulumi.set(__self__, "lookup_organization", lookup_organization)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization and not isinstance(organization, str):
            raise TypeError("Expected argument 'organization' to be a str")
        pulumi.set(__self__, "organization", organization)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        Timestamp when the Organization was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> _builtins.bool:
        return pulumi.get(self, "deletion_protection")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        """
        The folder's display name.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def folder(self) -> _builtins.str:
        return pulumi.get(self, "folder")

    @_builtins.property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> _builtins.str:
        return pulumi.get(self, "folder_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="lifecycleState")
    def lifecycle_state(self) -> _builtins.str:
        """
        The Folder's current lifecycle state.
        """
        return pulumi.get(self, "lifecycle_state")

    @_builtins.property
    @pulumi.getter(name="lookupOrganization")
    def lookup_organization(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "lookup_organization")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The resource name of the Folder in the form `folders/{folder_id}`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def organization(self) -> _builtins.str:
        """
        If `lookup_organization` is enable, the resource name of the Organization that the folder belongs.
        """
        return pulumi.get(self, "organization")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> _builtins.str:
        """
        The resource name of the parent Folder or Organization.
        """
        return pulumi.get(self, "parent")


class AwaitableGetFolderResult(GetFolderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFolderResult(
            create_time=self.create_time,
            deletion_protection=self.deletion_protection,
            display_name=self.display_name,
            folder=self.folder,
            folder_id=self.folder_id,
            id=self.id,
            lifecycle_state=self.lifecycle_state,
            lookup_organization=self.lookup_organization,
            name=self.name,
            organization=self.organization,
            parent=self.parent)


def get_folder(folder: Optional[_builtins.str] = None,
               lookup_organization: Optional[_builtins.bool] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFolderResult:
    """
    Use this data source to get information about a Google Cloud Folder.

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_folder1 = gcp.organizations.get_folder(folder="folders/12345",
        lookup_organization=True)
    my_folder2 = gcp.organizations.get_folder(folder="folders/23456")
    pulumi.export("myFolder1Organization", my_folder1.organization)
    pulumi.export("myFolder2Parent", my_folder2.parent)
    ```


    :param _builtins.str folder: The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
    :param _builtins.bool lookup_organization: `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['lookupOrganization'] = lookup_organization
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:organizations/getFolder:getFolder', __args__, opts=opts, typ=GetFolderResult).value

    return AwaitableGetFolderResult(
        create_time=pulumi.get(__ret__, 'create_time'),
        deletion_protection=pulumi.get(__ret__, 'deletion_protection'),
        display_name=pulumi.get(__ret__, 'display_name'),
        folder=pulumi.get(__ret__, 'folder'),
        folder_id=pulumi.get(__ret__, 'folder_id'),
        id=pulumi.get(__ret__, 'id'),
        lifecycle_state=pulumi.get(__ret__, 'lifecycle_state'),
        lookup_organization=pulumi.get(__ret__, 'lookup_organization'),
        name=pulumi.get(__ret__, 'name'),
        organization=pulumi.get(__ret__, 'organization'),
        parent=pulumi.get(__ret__, 'parent'))
def get_folder_output(folder: Optional[pulumi.Input[_builtins.str]] = None,
                      lookup_organization: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFolderResult]:
    """
    Use this data source to get information about a Google Cloud Folder.

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_folder1 = gcp.organizations.get_folder(folder="folders/12345",
        lookup_organization=True)
    my_folder2 = gcp.organizations.get_folder(folder="folders/23456")
    pulumi.export("myFolder1Organization", my_folder1.organization)
    pulumi.export("myFolder2Parent", my_folder2.parent)
    ```


    :param _builtins.str folder: The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
    :param _builtins.bool lookup_organization: `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['lookupOrganization'] = lookup_organization
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:organizations/getFolder:getFolder', __args__, opts=opts, typ=GetFolderResult)
    return __ret__.apply(lambda __response__: GetFolderResult(
        create_time=pulumi.get(__response__, 'create_time'),
        deletion_protection=pulumi.get(__response__, 'deletion_protection'),
        display_name=pulumi.get(__response__, 'display_name'),
        folder=pulumi.get(__response__, 'folder'),
        folder_id=pulumi.get(__response__, 'folder_id'),
        id=pulumi.get(__response__, 'id'),
        lifecycle_state=pulumi.get(__response__, 'lifecycle_state'),
        lookup_organization=pulumi.get(__response__, 'lookup_organization'),
        name=pulumi.get(__response__, 'name'),
        organization=pulumi.get(__response__, 'organization'),
        parent=pulumi.get(__response__, 'parent')))
