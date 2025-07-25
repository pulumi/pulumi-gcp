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
    'GetDbServersResult',
    'AwaitableGetDbServersResult',
    'get_db_servers',
    'get_db_servers_output',
]

@pulumi.output_type
class GetDbServersResult:
    """
    A collection of values returned by getDbServers.
    """
    def __init__(__self__, cloud_exadata_infrastructure=None, db_servers=None, id=None, location=None, project=None):
        if cloud_exadata_infrastructure and not isinstance(cloud_exadata_infrastructure, str):
            raise TypeError("Expected argument 'cloud_exadata_infrastructure' to be a str")
        pulumi.set(__self__, "cloud_exadata_infrastructure", cloud_exadata_infrastructure)
        if db_servers and not isinstance(db_servers, list):
            raise TypeError("Expected argument 'db_servers' to be a list")
        pulumi.set(__self__, "db_servers", db_servers)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="cloudExadataInfrastructure")
    def cloud_exadata_infrastructure(self) -> _builtins.str:
        return pulumi.get(self, "cloud_exadata_infrastructure")

    @_builtins.property
    @pulumi.getter(name="dbServers")
    def db_servers(self) -> Sequence['outputs.GetDbServersDbServerResult']:
        return pulumi.get(self, "db_servers")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")


class AwaitableGetDbServersResult(GetDbServersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDbServersResult(
            cloud_exadata_infrastructure=self.cloud_exadata_infrastructure,
            db_servers=self.db_servers,
            id=self.id,
            location=self.location,
            project=self.project)


def get_db_servers(cloud_exadata_infrastructure: Optional[_builtins.str] = None,
                   location: Optional[_builtins.str] = None,
                   project: Optional[_builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDbServersResult:
    """
    List all DbServers of a Cloud Exdata Infrastructure.

    For more information see the
    [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_db_servers = gcp.oracledatabase.get_db_servers(location="us-east4",
        cloud_exadata_infrastructure="exadata-id")
    ```

    ## Attributes reference

    The following attributes are exported:

    * `db_servers` - List of dbServers. Structure is documented below.

    <a name="nested_dbservers"></a> The `db_servers` block supports:

    * `display_name` - User friendly name for the resource.

    * `properties` - Various properties of the databse server. Structure is documented below.

    <a name="nested_properties"></a> The `properties` block supports:

    * `ocid` - The OCID of database server.

    * `ocpu_count` - The OCPU count per database.

    * `max_ocpu_count` - The total number of CPU cores available.

    * `memory_size_gb` - The allocated memory in gigabytes on the database server.

    * `max_memory_size_gb` - The total memory available in gigabytes.

    * `db_node_storage_size_gb` - The local storage per VM.

    * `max_db_node_storage_size_gb` - The total local node storage available in GBs.

    * `vm_count` - The VM count per database.

    * `state` - The current state of the database server.
    <a name="nested_states"></a>Allowed values for `state` are:<br>
    `CREATING` - Indicates that the resource is being created.<br>
    `AVAILABLE` - Indicates that the resource is available.<br>
    `UNAVAILABLE` - Indicates that the resource is unavailable.<br>
    `DELETING` - Indicates that the resource is being deleted.<br>
    `DELETED` - Indicates that the resource has been deleted.<br>

    * `db_node_ids` - The OCID of database nodes associated with the database server.


    :param _builtins.str cloud_exadata_infrastructure: The Exadata Infrastructure id.
    :param _builtins.str location: The location of resource.
    :param _builtins.str project: The project to which the resource belongs. If it
           is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['cloudExadataInfrastructure'] = cloud_exadata_infrastructure
    __args__['location'] = location
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:oracledatabase/getDbServers:getDbServers', __args__, opts=opts, typ=GetDbServersResult).value

    return AwaitableGetDbServersResult(
        cloud_exadata_infrastructure=pulumi.get(__ret__, 'cloud_exadata_infrastructure'),
        db_servers=pulumi.get(__ret__, 'db_servers'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        project=pulumi.get(__ret__, 'project'))
def get_db_servers_output(cloud_exadata_infrastructure: Optional[pulumi.Input[_builtins.str]] = None,
                          location: Optional[pulumi.Input[_builtins.str]] = None,
                          project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDbServersResult]:
    """
    List all DbServers of a Cloud Exdata Infrastructure.

    For more information see the
    [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_db_servers = gcp.oracledatabase.get_db_servers(location="us-east4",
        cloud_exadata_infrastructure="exadata-id")
    ```

    ## Attributes reference

    The following attributes are exported:

    * `db_servers` - List of dbServers. Structure is documented below.

    <a name="nested_dbservers"></a> The `db_servers` block supports:

    * `display_name` - User friendly name for the resource.

    * `properties` - Various properties of the databse server. Structure is documented below.

    <a name="nested_properties"></a> The `properties` block supports:

    * `ocid` - The OCID of database server.

    * `ocpu_count` - The OCPU count per database.

    * `max_ocpu_count` - The total number of CPU cores available.

    * `memory_size_gb` - The allocated memory in gigabytes on the database server.

    * `max_memory_size_gb` - The total memory available in gigabytes.

    * `db_node_storage_size_gb` - The local storage per VM.

    * `max_db_node_storage_size_gb` - The total local node storage available in GBs.

    * `vm_count` - The VM count per database.

    * `state` - The current state of the database server.
    <a name="nested_states"></a>Allowed values for `state` are:<br>
    `CREATING` - Indicates that the resource is being created.<br>
    `AVAILABLE` - Indicates that the resource is available.<br>
    `UNAVAILABLE` - Indicates that the resource is unavailable.<br>
    `DELETING` - Indicates that the resource is being deleted.<br>
    `DELETED` - Indicates that the resource has been deleted.<br>

    * `db_node_ids` - The OCID of database nodes associated with the database server.


    :param _builtins.str cloud_exadata_infrastructure: The Exadata Infrastructure id.
    :param _builtins.str location: The location of resource.
    :param _builtins.str project: The project to which the resource belongs. If it
           is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['cloudExadataInfrastructure'] = cloud_exadata_infrastructure
    __args__['location'] = location
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:oracledatabase/getDbServers:getDbServers', __args__, opts=opts, typ=GetDbServersResult)
    return __ret__.apply(lambda __response__: GetDbServersResult(
        cloud_exadata_infrastructure=pulumi.get(__response__, 'cloud_exadata_infrastructure'),
        db_servers=pulumi.get(__response__, 'db_servers'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        project=pulumi.get(__response__, 'project')))
