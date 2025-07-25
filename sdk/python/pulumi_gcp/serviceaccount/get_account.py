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
    'GetAccountResult',
    'AwaitableGetAccountResult',
    'get_account',
    'get_account_output',
]

@pulumi.output_type
class GetAccountResult:
    """
    A collection of values returned by getAccount.
    """
    def __init__(__self__, account_id=None, disabled=None, display_name=None, email=None, id=None, member=None, name=None, project=None, unique_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if disabled and not isinstance(disabled, bool):
            raise TypeError("Expected argument 'disabled' to be a bool")
        pulumi.set(__self__, "disabled", disabled)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if member and not isinstance(member, str):
            raise TypeError("Expected argument 'member' to be a str")
        pulumi.set(__self__, "member", member)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if unique_id and not isinstance(unique_id, str):
            raise TypeError("Expected argument 'unique_id' to be a str")
        pulumi.set(__self__, "unique_id", unique_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> _builtins.bool:
        """
        Whether a service account is disabled or not.
        """
        return pulumi.get(self, "disabled")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        """
        The display name for the service account.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def email(self) -> _builtins.str:
        """
        The e-mail address of the service account. This value
        should be referenced from any `organizations_get_iam_policy` data sources
        that would grant the service account privileges.
        """
        return pulumi.get(self, "email")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def member(self) -> _builtins.str:
        """
        The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        """
        return pulumi.get(self, "member")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The fully-qualified name of the service account.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="uniqueId")
    def unique_id(self) -> _builtins.str:
        """
        The unique id of the service account.
        """
        return pulumi.get(self, "unique_id")


class AwaitableGetAccountResult(GetAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountResult(
            account_id=self.account_id,
            disabled=self.disabled,
            display_name=self.display_name,
            email=self.email,
            id=self.id,
            member=self.member,
            name=self.name,
            project=self.project,
            unique_id=self.unique_id)


def get_account(account_id: Optional[_builtins.str] = None,
                project: Optional[_builtins.str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountResult:
    """
    Get the service account from a project. For more information see
    the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    object_viewer = gcp.serviceaccount.get_account(account_id="object-viewer")
    ```

    ### Save Key In Kubernetes Secret
    ```python
    import pulumi
    import pulumi_gcp as gcp
    import pulumi_kubernetes as kubernetes
    import pulumi_std as std

    myaccount = gcp.serviceaccount.get_account(account_id="myaccount-id")
    mykey = gcp.serviceaccount.Key("mykey", service_account_id=myaccount.name)
    google_application_credentials = kubernetes.core.v1.Secret("google-application-credentials",
        metadata={
            "name": "google-application-credentials",
        },
        data={
            "json": std.base64decode_output(input=mykey.private_key).apply(lambda invoke: invoke.result),
        })
    ```


    :param _builtins.str account_id: The Google service account ID. This be one of:
           
           * The name of the service account within the project (e.g. `my-service`)
           
           * The fully-qualified path to a service account resource (e.g.
           `projects/my-project/serviceAccounts/...`)
           
           * The email address of the service account (e.g.
           `my-service@my-project.iam.gserviceaccount.com`)
    :param _builtins.str project: The ID of the project that the service account is present in.
           Defaults to the provider project configuration.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:serviceaccount/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult).value

    return AwaitableGetAccountResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        disabled=pulumi.get(__ret__, 'disabled'),
        display_name=pulumi.get(__ret__, 'display_name'),
        email=pulumi.get(__ret__, 'email'),
        id=pulumi.get(__ret__, 'id'),
        member=pulumi.get(__ret__, 'member'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        unique_id=pulumi.get(__ret__, 'unique_id'))
def get_account_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                       project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountResult]:
    """
    Get the service account from a project. For more information see
    the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    object_viewer = gcp.serviceaccount.get_account(account_id="object-viewer")
    ```

    ### Save Key In Kubernetes Secret
    ```python
    import pulumi
    import pulumi_gcp as gcp
    import pulumi_kubernetes as kubernetes
    import pulumi_std as std

    myaccount = gcp.serviceaccount.get_account(account_id="myaccount-id")
    mykey = gcp.serviceaccount.Key("mykey", service_account_id=myaccount.name)
    google_application_credentials = kubernetes.core.v1.Secret("google-application-credentials",
        metadata={
            "name": "google-application-credentials",
        },
        data={
            "json": std.base64decode_output(input=mykey.private_key).apply(lambda invoke: invoke.result),
        })
    ```


    :param _builtins.str account_id: The Google service account ID. This be one of:
           
           * The name of the service account within the project (e.g. `my-service`)
           
           * The fully-qualified path to a service account resource (e.g.
           `projects/my-project/serviceAccounts/...`)
           
           * The email address of the service account (e.g.
           `my-service@my-project.iam.gserviceaccount.com`)
    :param _builtins.str project: The ID of the project that the service account is present in.
           Defaults to the provider project configuration.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:serviceaccount/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult)
    return __ret__.apply(lambda __response__: GetAccountResult(
        account_id=pulumi.get(__response__, 'account_id'),
        disabled=pulumi.get(__response__, 'disabled'),
        display_name=pulumi.get(__response__, 'display_name'),
        email=pulumi.get(__response__, 'email'),
        id=pulumi.get(__response__, 'id'),
        member=pulumi.get(__response__, 'member'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        unique_id=pulumi.get(__response__, 'unique_id')))
