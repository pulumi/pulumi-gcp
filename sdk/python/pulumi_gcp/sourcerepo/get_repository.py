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
    'GetRepositoryResult',
    'AwaitableGetRepositoryResult',
    'get_repository',
    'get_repository_output',
]

@pulumi.output_type
class GetRepositoryResult:
    """
    A collection of values returned by getRepository.
    """
    def __init__(__self__, create_ignore_already_exists=None, id=None, name=None, project=None, pubsub_configs=None, size=None, url=None):
        if create_ignore_already_exists and not isinstance(create_ignore_already_exists, bool):
            raise TypeError("Expected argument 'create_ignore_already_exists' to be a bool")
        pulumi.set(__self__, "create_ignore_already_exists", create_ignore_already_exists)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if pubsub_configs and not isinstance(pubsub_configs, list):
            raise TypeError("Expected argument 'pubsub_configs' to be a list")
        pulumi.set(__self__, "pubsub_configs", pubsub_configs)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)

    @_builtins.property
    @pulumi.getter(name="createIgnoreAlreadyExists")
    def create_ignore_already_exists(self) -> _builtins.bool:
        return pulumi.get(self, "create_ignore_already_exists")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pubsubConfigs")
    def pubsub_configs(self) -> Sequence['outputs.GetRepositoryPubsubConfigResult']:
        return pulumi.get(self, "pubsub_configs")

    @_builtins.property
    @pulumi.getter
    def size(self) -> _builtins.int:
        return pulumi.get(self, "size")

    @_builtins.property
    @pulumi.getter
    def url(self) -> _builtins.str:
        return pulumi.get(self, "url")


class AwaitableGetRepositoryResult(GetRepositoryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoryResult(
            create_ignore_already_exists=self.create_ignore_already_exists,
            id=self.id,
            name=self.name,
            project=self.project,
            pubsub_configs=self.pubsub_configs,
            size=self.size,
            url=self.url)


def get_repository(name: Optional[_builtins.str] = None,
                   project: Optional[_builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoryResult:
    """
    Get infomation about an existing Google Cloud Source Repository.
    For more information see [the official documentation](https://cloud.google.com/source-repositories)
    and
    [API](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_repo = gcp.sourcerepo.get_repository(name="my-repository")
    ```


    :param _builtins.str name: Resource name of the repository. The repo name may contain slashes. eg, `name/with/slash`
    :param _builtins.str project: The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:sourcerepo/getRepository:getRepository', __args__, opts=opts, typ=GetRepositoryResult).value

    return AwaitableGetRepositoryResult(
        create_ignore_already_exists=pulumi.get(__ret__, 'create_ignore_already_exists'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        pubsub_configs=pulumi.get(__ret__, 'pubsub_configs'),
        size=pulumi.get(__ret__, 'size'),
        url=pulumi.get(__ret__, 'url'))
def get_repository_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                          project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRepositoryResult]:
    """
    Get infomation about an existing Google Cloud Source Repository.
    For more information see [the official documentation](https://cloud.google.com/source-repositories)
    and
    [API](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_repo = gcp.sourcerepo.get_repository(name="my-repository")
    ```


    :param _builtins.str name: Resource name of the repository. The repo name may contain slashes. eg, `name/with/slash`
    :param _builtins.str project: The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:sourcerepo/getRepository:getRepository', __args__, opts=opts, typ=GetRepositoryResult)
    return __ret__.apply(lambda __response__: GetRepositoryResult(
        create_ignore_already_exists=pulumi.get(__response__, 'create_ignore_already_exists'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        pubsub_configs=pulumi.get(__response__, 'pubsub_configs'),
        size=pulumi.get(__response__, 'size'),
        url=pulumi.get(__response__, 'url')))
