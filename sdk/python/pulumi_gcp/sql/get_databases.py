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
    'GetDatabasesResult',
    'AwaitableGetDatabasesResult',
    'get_databases',
    'get_databases_output',
]

@pulumi.output_type
class GetDatabasesResult:
    """
    A collection of values returned by getDatabases.
    """
    def __init__(__self__, databases=None, id=None, instance=None, project=None):
        if databases and not isinstance(databases, list):
            raise TypeError("Expected argument 'databases' to be a list")
        pulumi.set(__self__, "databases", databases)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance and not isinstance(instance, str):
            raise TypeError("Expected argument 'instance' to be a str")
        pulumi.set(__self__, "instance", instance)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def databases(self) -> Sequence['outputs.GetDatabasesDatabaseResult']:
        return pulumi.get(self, "databases")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def instance(self) -> _builtins.str:
        return pulumi.get(self, "instance")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")


class AwaitableGetDatabasesResult(GetDatabasesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabasesResult(
            databases=self.databases,
            id=self.id,
            instance=self.instance,
            project=self.project)


def get_databases(instance: Optional[_builtins.str] = None,
                  project: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabasesResult:
    """
    Use this data source to get information about a list of databases in a Cloud SQL instance.
    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    qa = gcp.sql.get_databases(instance=main["name"])
    ```


    :param _builtins.str instance: The name of the Cloud SQL database instance in which the database belongs.
    :param _builtins.str project: The ID of the project in which the instance belongs.
           
           > **Note** This datasource performs client-side sorting to provide consistent ordering of the databases.
    """
    __args__ = dict()
    __args__['instance'] = instance
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:sql/getDatabases:getDatabases', __args__, opts=opts, typ=GetDatabasesResult).value

    return AwaitableGetDatabasesResult(
        databases=pulumi.get(__ret__, 'databases'),
        id=pulumi.get(__ret__, 'id'),
        instance=pulumi.get(__ret__, 'instance'),
        project=pulumi.get(__ret__, 'project'))
def get_databases_output(instance: Optional[pulumi.Input[_builtins.str]] = None,
                         project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabasesResult]:
    """
    Use this data source to get information about a list of databases in a Cloud SQL instance.
    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    qa = gcp.sql.get_databases(instance=main["name"])
    ```


    :param _builtins.str instance: The name of the Cloud SQL database instance in which the database belongs.
    :param _builtins.str project: The ID of the project in which the instance belongs.
           
           > **Note** This datasource performs client-side sorting to provide consistent ordering of the databases.
    """
    __args__ = dict()
    __args__['instance'] = instance
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:sql/getDatabases:getDatabases', __args__, opts=opts, typ=GetDatabasesResult)
    return __ret__.apply(lambda __response__: GetDatabasesResult(
        databases=pulumi.get(__response__, 'databases'),
        id=pulumi.get(__response__, 'id'),
        instance=pulumi.get(__response__, 'instance'),
        project=pulumi.get(__response__, 'project')))
