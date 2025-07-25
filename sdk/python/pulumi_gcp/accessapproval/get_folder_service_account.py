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
    'GetFolderServiceAccountResult',
    'AwaitableGetFolderServiceAccountResult',
    'get_folder_service_account',
    'get_folder_service_account_output',
]

@pulumi.output_type
class GetFolderServiceAccountResult:
    """
    A collection of values returned by getFolderServiceAccount.
    """
    def __init__(__self__, account_email=None, folder_id=None, id=None, name=None):
        if account_email and not isinstance(account_email, str):
            raise TypeError("Expected argument 'account_email' to be a str")
        pulumi.set(__self__, "account_email", account_email)
        if folder_id and not isinstance(folder_id, str):
            raise TypeError("Expected argument 'folder_id' to be a str")
        pulumi.set(__self__, "folder_id", folder_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="accountEmail")
    def account_email(self) -> _builtins.str:
        """
        The email address of the service account. This value is
        often used to refer to the service account in order to grant IAM permissions.
        """
        return pulumi.get(self, "account_email")

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
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The Access Approval service account resource name. Format is "folders/{folder_id}/serviceAccount".
        """
        return pulumi.get(self, "name")


class AwaitableGetFolderServiceAccountResult(GetFolderServiceAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFolderServiceAccountResult(
            account_email=self.account_email,
            folder_id=self.folder_id,
            id=self.id,
            name=self.name)


def get_folder_service_account(folder_id: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFolderServiceAccountResult:
    """
    Get the email address of a folder's Access Approval service account.

    Each Google Cloud folder has a unique service account used by Access Approval.
    When using Access Approval with a
    [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
    this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
    Cloud KMS key used to sign approvals.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    service_account = gcp.accessapproval.get_folder_service_account(folder_id="my-folder")
    iam = gcp.kms.CryptoKeyIAMMember("iam",
        crypto_key_id=crypto_key["id"],
        role="roles/cloudkms.signerVerifier",
        member=f"serviceAccount:{service_account.account_email}")
    ```


    :param _builtins.str folder_id: The folder ID the service account was created for.
    """
    __args__ = dict()
    __args__['folderId'] = folder_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:accessapproval/getFolderServiceAccount:getFolderServiceAccount', __args__, opts=opts, typ=GetFolderServiceAccountResult).value

    return AwaitableGetFolderServiceAccountResult(
        account_email=pulumi.get(__ret__, 'account_email'),
        folder_id=pulumi.get(__ret__, 'folder_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))
def get_folder_service_account_output(folder_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFolderServiceAccountResult]:
    """
    Get the email address of a folder's Access Approval service account.

    Each Google Cloud folder has a unique service account used by Access Approval.
    When using Access Approval with a
    [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
    this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
    Cloud KMS key used to sign approvals.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    service_account = gcp.accessapproval.get_folder_service_account(folder_id="my-folder")
    iam = gcp.kms.CryptoKeyIAMMember("iam",
        crypto_key_id=crypto_key["id"],
        role="roles/cloudkms.signerVerifier",
        member=f"serviceAccount:{service_account.account_email}")
    ```


    :param _builtins.str folder_id: The folder ID the service account was created for.
    """
    __args__ = dict()
    __args__['folderId'] = folder_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:accessapproval/getFolderServiceAccount:getFolderServiceAccount', __args__, opts=opts, typ=GetFolderServiceAccountResult)
    return __ret__.apply(lambda __response__: GetFolderServiceAccountResult(
        account_email=pulumi.get(__response__, 'account_email'),
        folder_id=pulumi.get(__response__, 'folder_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name')))
