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
    'GetProjectCmekSettingsResult',
    'AwaitableGetProjectCmekSettingsResult',
    'get_project_cmek_settings',
    'get_project_cmek_settings_output',
]

@pulumi.output_type
class GetProjectCmekSettingsResult:
    """
    A collection of values returned by getProjectCmekSettings.
    """
    def __init__(__self__, id=None, kms_key_name=None, kms_key_version_name=None, name=None, project=None, service_account_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kms_key_name and not isinstance(kms_key_name, str):
            raise TypeError("Expected argument 'kms_key_name' to be a str")
        pulumi.set(__self__, "kms_key_name", kms_key_name)
        if kms_key_version_name and not isinstance(kms_key_version_name, str):
            raise TypeError("Expected argument 'kms_key_version_name' to be a str")
        pulumi.set(__self__, "kms_key_version_name", kms_key_version_name)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if service_account_id and not isinstance(service_account_id, str):
            raise TypeError("Expected argument 'service_account_id' to be a str")
        pulumi.set(__self__, "service_account_id", service_account_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> Optional[_builtins.str]:
        """
        The resource name for the configured Cloud KMS key.
        KMS key name format:
        `'projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]'`
        To enable CMEK for the bucket, set this field to a valid kmsKeyName for which the associated service account has the required cloudkms.cryptoKeyEncrypterDecrypter roles assigned for the key.
        The Cloud KMS key used by the bucket can be updated by changing the kmsKeyName to a new valid key name. Encryption operations that are in progress will be completed with the key that was in use when they started. Decryption operations will be completed using the key that was used at the time of encryption unless access to that key has been revoked.
        See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
        """
        return pulumi.get(self, "kms_key_name")

    @_builtins.property
    @pulumi.getter(name="kmsKeyVersionName")
    def kms_key_version_name(self) -> _builtins.str:
        """
        The CryptoKeyVersion resource name for the configured Cloud KMS key.
        KMS key name format:
        `'projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]/cryptoKeyVersions/[VERSION]'`
        For example:
        "projects/my-project/locations/us-central1/keyRings/my-ring/cryptoKeys/my-key/cryptoKeyVersions/1"
        This is a read-only field used to convey the specific configured CryptoKeyVersion of kms_key that has been configured. It will be populated in cases where the CMEK settings are bound to a single key version.
        """
        return pulumi.get(self, "kms_key_version_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The resource name of the CMEK settings.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="serviceAccountId")
    def service_account_id(self) -> _builtins.str:
        """
        The service account associated with a project for which CMEK will apply.
        Before enabling CMEK for a logging bucket, you must first assign the cloudkms.cryptoKeyEncrypterDecrypter role to the service account associated with the project for which CMEK will apply. Use [v2.getCmekSettings](https://cloud.google.com/logging/docs/reference/v2/rest/v2/TopLevel/getCmekSettings#google.logging.v2.ConfigServiceV2.GetCmekSettings) to obtain the service account ID.
        See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
        """
        return pulumi.get(self, "service_account_id")


class AwaitableGetProjectCmekSettingsResult(GetProjectCmekSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectCmekSettingsResult(
            id=self.id,
            kms_key_name=self.kms_key_name,
            kms_key_version_name=self.kms_key_version_name,
            name=self.name,
            project=self.project,
            service_account_id=self.service_account_id)


def get_project_cmek_settings(kms_key_name: Optional[_builtins.str] = None,
                              project: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectCmekSettingsResult:
    """
    Describes the customer-managed encryption key (CMEK) settings associated with a project.

    To get more information about Service, see:

    * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
    * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).

    ## Example Usage

    ### Logging Project Cmek Settings Basic

    ```python
    import pulumi
    import pulumi_gcp as gcp

    cmek_settings = gcp.logging.get_project_cmek_settings(project="my-project-name")
    ```


    :param _builtins.str kms_key_name: The resource name for the configured Cloud KMS key.
           KMS key name format:
           `'projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]'`
           To enable CMEK for the bucket, set this field to a valid kmsKeyName for which the associated service account has the required cloudkms.cryptoKeyEncrypterDecrypter roles assigned for the key.
           The Cloud KMS key used by the bucket can be updated by changing the kmsKeyName to a new valid key name. Encryption operations that are in progress will be completed with the key that was in use when they started. Decryption operations will be completed using the key that was used at the time of encryption unless access to that key has been revoked.
           See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
    :param _builtins.str project: The ID of the project.
    """
    __args__ = dict()
    __args__['kmsKeyName'] = kms_key_name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:logging/getProjectCmekSettings:getProjectCmekSettings', __args__, opts=opts, typ=GetProjectCmekSettingsResult).value

    return AwaitableGetProjectCmekSettingsResult(
        id=pulumi.get(__ret__, 'id'),
        kms_key_name=pulumi.get(__ret__, 'kms_key_name'),
        kms_key_version_name=pulumi.get(__ret__, 'kms_key_version_name'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        service_account_id=pulumi.get(__ret__, 'service_account_id'))
def get_project_cmek_settings_output(kms_key_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     project: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetProjectCmekSettingsResult]:
    """
    Describes the customer-managed encryption key (CMEK) settings associated with a project.

    To get more information about Service, see:

    * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
    * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).

    ## Example Usage

    ### Logging Project Cmek Settings Basic

    ```python
    import pulumi
    import pulumi_gcp as gcp

    cmek_settings = gcp.logging.get_project_cmek_settings(project="my-project-name")
    ```


    :param _builtins.str kms_key_name: The resource name for the configured Cloud KMS key.
           KMS key name format:
           `'projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]'`
           To enable CMEK for the bucket, set this field to a valid kmsKeyName for which the associated service account has the required cloudkms.cryptoKeyEncrypterDecrypter roles assigned for the key.
           The Cloud KMS key used by the bucket can be updated by changing the kmsKeyName to a new valid key name. Encryption operations that are in progress will be completed with the key that was in use when they started. Decryption operations will be completed using the key that was used at the time of encryption unless access to that key has been revoked.
           See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
    :param _builtins.str project: The ID of the project.
    """
    __args__ = dict()
    __args__['kmsKeyName'] = kms_key_name
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:logging/getProjectCmekSettings:getProjectCmekSettings', __args__, opts=opts, typ=GetProjectCmekSettingsResult)
    return __ret__.apply(lambda __response__: GetProjectCmekSettingsResult(
        id=pulumi.get(__response__, 'id'),
        kms_key_name=pulumi.get(__response__, 'kms_key_name'),
        kms_key_version_name=pulumi.get(__response__, 'kms_key_version_name'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        service_account_id=pulumi.get(__response__, 'service_account_id')))
