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
    'GetDatabaseInstanceLatestRecoveryTimeResult',
    'AwaitableGetDatabaseInstanceLatestRecoveryTimeResult',
    'get_database_instance_latest_recovery_time',
    'get_database_instance_latest_recovery_time_output',
]

@pulumi.output_type
class GetDatabaseInstanceLatestRecoveryTimeResult:
    """
    A collection of values returned by getDatabaseInstanceLatestRecoveryTime.
    """
    def __init__(__self__, id=None, instance=None, latest_recovery_time=None, project=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance and not isinstance(instance, str):
            raise TypeError("Expected argument 'instance' to be a str")
        pulumi.set(__self__, "instance", instance)
        if latest_recovery_time and not isinstance(latest_recovery_time, str):
            raise TypeError("Expected argument 'latest_recovery_time' to be a str")
        pulumi.set(__self__, "latest_recovery_time", latest_recovery_time)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

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
        """
        The name of the instance.
        """
        return pulumi.get(self, "instance")

    @_builtins.property
    @pulumi.getter(name="latestRecoveryTime")
    def latest_recovery_time(self) -> _builtins.str:
        """
        Timestamp, identifies the latest recovery time of the source instance.
        """
        return pulumi.get(self, "latest_recovery_time")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        """
        The ID of the project in which the resource belongs.
        """
        return pulumi.get(self, "project")


class AwaitableGetDatabaseInstanceLatestRecoveryTimeResult(GetDatabaseInstanceLatestRecoveryTimeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseInstanceLatestRecoveryTimeResult(
            id=self.id,
            instance=self.instance,
            latest_recovery_time=self.latest_recovery_time,
            project=self.project)


def get_database_instance_latest_recovery_time(instance: Optional[_builtins.str] = None,
                                               project: Optional[_builtins.str] = None,
                                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseInstanceLatestRecoveryTimeResult:
    """
    Get Latest Recovery Time for a given instance. For more information see the
    [official documentation](https://cloud.google.com/sql/)
    and
    [API](https://cloud.google.com/sql/docs/postgres/backup-recovery/pitr#get-the-latest-recovery-time).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    default = gcp.sql.get_database_instance_latest_recovery_time(instance="sample-instance")
    pulumi.export("latestRecoveryTime", default)
    ```


    :param _builtins.str instance: The name of the instance.
    :param _builtins.str project: The ID of the project in which the resource belongs.
    """
    __args__ = dict()
    __args__['instance'] = instance
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:sql/getDatabaseInstanceLatestRecoveryTime:getDatabaseInstanceLatestRecoveryTime', __args__, opts=opts, typ=GetDatabaseInstanceLatestRecoveryTimeResult).value

    return AwaitableGetDatabaseInstanceLatestRecoveryTimeResult(
        id=pulumi.get(__ret__, 'id'),
        instance=pulumi.get(__ret__, 'instance'),
        latest_recovery_time=pulumi.get(__ret__, 'latest_recovery_time'),
        project=pulumi.get(__ret__, 'project'))
def get_database_instance_latest_recovery_time_output(instance: Optional[pulumi.Input[_builtins.str]] = None,
                                                      project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabaseInstanceLatestRecoveryTimeResult]:
    """
    Get Latest Recovery Time for a given instance. For more information see the
    [official documentation](https://cloud.google.com/sql/)
    and
    [API](https://cloud.google.com/sql/docs/postgres/backup-recovery/pitr#get-the-latest-recovery-time).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    default = gcp.sql.get_database_instance_latest_recovery_time(instance="sample-instance")
    pulumi.export("latestRecoveryTime", default)
    ```


    :param _builtins.str instance: The name of the instance.
    :param _builtins.str project: The ID of the project in which the resource belongs.
    """
    __args__ = dict()
    __args__['instance'] = instance
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:sql/getDatabaseInstanceLatestRecoveryTime:getDatabaseInstanceLatestRecoveryTime', __args__, opts=opts, typ=GetDatabaseInstanceLatestRecoveryTimeResult)
    return __ret__.apply(lambda __response__: GetDatabaseInstanceLatestRecoveryTimeResult(
        id=pulumi.get(__response__, 'id'),
        instance=pulumi.get(__response__, 'instance'),
        latest_recovery_time=pulumi.get(__response__, 'latest_recovery_time'),
        project=pulumi.get(__response__, 'project')))
