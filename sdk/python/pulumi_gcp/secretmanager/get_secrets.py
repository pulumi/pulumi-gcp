# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetSecretsResult',
    'AwaitableGetSecretsResult',
    'get_secrets',
    'get_secrets_output',
]

@pulumi.output_type
class GetSecretsResult:
    """
    A collection of values returned by getSecrets.
    """
    def __init__(__self__, filter=None, id=None, project=None, secrets=None):
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if secrets and not isinstance(secrets, list):
            raise TypeError("Expected argument 'secrets' to be a list")
        pulumi.set(__self__, "secrets", secrets)

    @property
    @pulumi.getter
    def filter(self) -> Optional[str]:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The ID of the project in which the resource belongs.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def secrets(self) -> Sequence['outputs.GetSecretsSecretResult']:
        """
        A list of secrets matching the filter. Structure is defined below.
        """
        return pulumi.get(self, "secrets")


class AwaitableGetSecretsResult(GetSecretsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretsResult(
            filter=self.filter,
            id=self.id,
            project=self.project,
            secrets=self.secrets)


def get_secrets(filter: Optional[str] = None,
                project: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretsResult:
    """
    Use this data source to list the Secret Manager Secrets

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    secrets = gcp.secretmanager.get_secrets()
    ```


    :param str filter: Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all secrets are listed.
    :param str project: The ID of the project.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:secretmanager/getSecrets:getSecrets', __args__, opts=opts, typ=GetSecretsResult).value

    return AwaitableGetSecretsResult(
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        project=pulumi.get(__ret__, 'project'),
        secrets=pulumi.get(__ret__, 'secrets'))


@_utilities.lift_output_func(get_secrets)
def get_secrets_output(filter: Optional[pulumi.Input[Optional[str]]] = None,
                       project: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretsResult]:
    """
    Use this data source to list the Secret Manager Secrets

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    secrets = gcp.secretmanager.get_secrets()
    ```


    :param str filter: Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all secrets are listed.
    :param str project: The ID of the project.
    """
    ...