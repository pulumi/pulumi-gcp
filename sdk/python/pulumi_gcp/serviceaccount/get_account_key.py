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
    'GetAccountKeyResult',
    'AwaitableGetAccountKeyResult',
    'get_account_key',
    'get_account_key_output',
]

@pulumi.output_type
class GetAccountKeyResult:
    """
    A collection of values returned by getAccountKey.
    """
    def __init__(__self__, id=None, key_algorithm=None, name=None, project=None, public_key=None, public_key_type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_algorithm and not isinstance(key_algorithm, str):
            raise TypeError("Expected argument 'key_algorithm' to be a str")
        pulumi.set(__self__, "key_algorithm", key_algorithm)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if public_key and not isinstance(public_key, str):
            raise TypeError("Expected argument 'public_key' to be a str")
        pulumi.set(__self__, "public_key", public_key)
        if public_key_type and not isinstance(public_key_type, str):
            raise TypeError("Expected argument 'public_key_type' to be a str")
        pulumi.set(__self__, "public_key_type", public_key_type)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="keyAlgorithm")
    def key_algorithm(self) -> _builtins.str:
        return pulumi.get(self, "key_algorithm")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> _builtins.str:
        """
        The public key, base64 encoded
        """
        return pulumi.get(self, "public_key")

    @_builtins.property
    @pulumi.getter(name="publicKeyType")
    def public_key_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "public_key_type")


class AwaitableGetAccountKeyResult(GetAccountKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountKeyResult(
            id=self.id,
            key_algorithm=self.key_algorithm,
            name=self.name,
            project=self.project,
            public_key=self.public_key,
            public_key_type=self.public_key_type)


def get_account_key(name: Optional[_builtins.str] = None,
                    project: Optional[_builtins.str] = None,
                    public_key_type: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountKeyResult:
    """
    Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    myaccount = gcp.serviceaccount.Account("myaccount", account_id="dev-foo-account")
    mykey_key = gcp.serviceaccount.Key("mykey", service_account_id=myaccount.name)
    mykey = gcp.serviceaccount.get_account_key_output(name=mykey_key.name,
        public_key_type="TYPE_X509_PEM_FILE")
    ```


    :param _builtins.str name: The name of the service account key. This must have format
           `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{KEYID}`, where `{ACCOUNT}`
           is the email address or unique id of the service account.
    :param _builtins.str project: The ID of the project that the service account is present in.
           Defaults to the provider project configuration.
    :param _builtins.str public_key_type: The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['publicKeyType'] = public_key_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:serviceaccount/getAccountKey:getAccountKey', __args__, opts=opts, typ=GetAccountKeyResult).value

    return AwaitableGetAccountKeyResult(
        id=pulumi.get(__ret__, 'id'),
        key_algorithm=pulumi.get(__ret__, 'key_algorithm'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        public_key=pulumi.get(__ret__, 'public_key'),
        public_key_type=pulumi.get(__ret__, 'public_key_type'))
def get_account_key_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                           project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           public_key_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountKeyResult]:
    """
    Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    myaccount = gcp.serviceaccount.Account("myaccount", account_id="dev-foo-account")
    mykey_key = gcp.serviceaccount.Key("mykey", service_account_id=myaccount.name)
    mykey = gcp.serviceaccount.get_account_key_output(name=mykey_key.name,
        public_key_type="TYPE_X509_PEM_FILE")
    ```


    :param _builtins.str name: The name of the service account key. This must have format
           `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{KEYID}`, where `{ACCOUNT}`
           is the email address or unique id of the service account.
    :param _builtins.str project: The ID of the project that the service account is present in.
           Defaults to the provider project configuration.
    :param _builtins.str public_key_type: The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['publicKeyType'] = public_key_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:serviceaccount/getAccountKey:getAccountKey', __args__, opts=opts, typ=GetAccountKeyResult)
    return __ret__.apply(lambda __response__: GetAccountKeyResult(
        id=pulumi.get(__response__, 'id'),
        key_algorithm=pulumi.get(__response__, 'key_algorithm'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        public_key=pulumi.get(__response__, 'public_key'),
        public_key_type=pulumi.get(__response__, 'public_key_type')))
