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
    'GetOrganizationSettingsResult',
    'AwaitableGetOrganizationSettingsResult',
    'get_organization_settings',
    'get_organization_settings_output',
]

@pulumi.output_type
class GetOrganizationSettingsResult:
    """
    A collection of values returned by getOrganizationSettings.
    """
    def __init__(__self__, disable_default_sink=None, id=None, kms_key_name=None, kms_service_account_id=None, logging_service_account_id=None, name=None, organization=None, storage_location=None):
        if disable_default_sink and not isinstance(disable_default_sink, bool):
            raise TypeError("Expected argument 'disable_default_sink' to be a bool")
        pulumi.set(__self__, "disable_default_sink", disable_default_sink)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kms_key_name and not isinstance(kms_key_name, str):
            raise TypeError("Expected argument 'kms_key_name' to be a str")
        pulumi.set(__self__, "kms_key_name", kms_key_name)
        if kms_service_account_id and not isinstance(kms_service_account_id, str):
            raise TypeError("Expected argument 'kms_service_account_id' to be a str")
        pulumi.set(__self__, "kms_service_account_id", kms_service_account_id)
        if logging_service_account_id and not isinstance(logging_service_account_id, str):
            raise TypeError("Expected argument 'logging_service_account_id' to be a str")
        pulumi.set(__self__, "logging_service_account_id", logging_service_account_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization and not isinstance(organization, str):
            raise TypeError("Expected argument 'organization' to be a str")
        pulumi.set(__self__, "organization", organization)
        if storage_location and not isinstance(storage_location, str):
            raise TypeError("Expected argument 'storage_location' to be a str")
        pulumi.set(__self__, "storage_location", storage_location)

    @_builtins.property
    @pulumi.getter(name="disableDefaultSink")
    def disable_default_sink(self) -> _builtins.bool:
        """
        If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
        """
        return pulumi.get(self, "disable_default_sink")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> _builtins.str:
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
    @pulumi.getter(name="kmsServiceAccountId")
    def kms_service_account_id(self) -> _builtins.str:
        """
        The service account associated with a project for which CMEK will apply.
        Before enabling CMEK for a logging bucket, you must first assign the cloudkms.cryptoKeyEncrypterDecrypter role to the service account associated with the project for which CMEK will apply. See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
        """
        return pulumi.get(self, "kms_service_account_id")

    @_builtins.property
    @pulumi.getter(name="loggingServiceAccountId")
    def logging_service_account_id(self) -> _builtins.str:
        """
        The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
        """
        return pulumi.get(self, "logging_service_account_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The resource name of the settings.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def organization(self) -> _builtins.str:
        return pulumi.get(self, "organization")

    @_builtins.property
    @pulumi.getter(name="storageLocation")
    def storage_location(self) -> _builtins.str:
        """
        The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
        """
        return pulumi.get(self, "storage_location")


class AwaitableGetOrganizationSettingsResult(GetOrganizationSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationSettingsResult(
            disable_default_sink=self.disable_default_sink,
            id=self.id,
            kms_key_name=self.kms_key_name,
            kms_service_account_id=self.kms_service_account_id,
            logging_service_account_id=self.logging_service_account_id,
            name=self.name,
            organization=self.organization,
            storage_location=self.storage_location)


def get_organization_settings(organization: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationSettingsResult:
    """
    Describes the settings associated with a organization.

    To get more information about LoggingOrganizationSettings, see:

    * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations/getSettings)
    * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).

    ## Example Usage

    ### Logging Organization Settings Basic

    ```python
    import pulumi
    import pulumi_gcp as gcp

    settings = gcp.logging.get_organization_settings(organization="my-organization-name")
    ```


    :param _builtins.str organization: The ID of the organization for which to retrieve settings.
    """
    __args__ = dict()
    __args__['organization'] = organization
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:logging/getOrganizationSettings:getOrganizationSettings', __args__, opts=opts, typ=GetOrganizationSettingsResult).value

    return AwaitableGetOrganizationSettingsResult(
        disable_default_sink=pulumi.get(__ret__, 'disable_default_sink'),
        id=pulumi.get(__ret__, 'id'),
        kms_key_name=pulumi.get(__ret__, 'kms_key_name'),
        kms_service_account_id=pulumi.get(__ret__, 'kms_service_account_id'),
        logging_service_account_id=pulumi.get(__ret__, 'logging_service_account_id'),
        name=pulumi.get(__ret__, 'name'),
        organization=pulumi.get(__ret__, 'organization'),
        storage_location=pulumi.get(__ret__, 'storage_location'))
def get_organization_settings_output(organization: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetOrganizationSettingsResult]:
    """
    Describes the settings associated with a organization.

    To get more information about LoggingOrganizationSettings, see:

    * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations/getSettings)
    * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).

    ## Example Usage

    ### Logging Organization Settings Basic

    ```python
    import pulumi
    import pulumi_gcp as gcp

    settings = gcp.logging.get_organization_settings(organization="my-organization-name")
    ```


    :param _builtins.str organization: The ID of the organization for which to retrieve settings.
    """
    __args__ = dict()
    __args__['organization'] = organization
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:logging/getOrganizationSettings:getOrganizationSettings', __args__, opts=opts, typ=GetOrganizationSettingsResult)
    return __ret__.apply(lambda __response__: GetOrganizationSettingsResult(
        disable_default_sink=pulumi.get(__response__, 'disable_default_sink'),
        id=pulumi.get(__response__, 'id'),
        kms_key_name=pulumi.get(__response__, 'kms_key_name'),
        kms_service_account_id=pulumi.get(__response__, 'kms_service_account_id'),
        logging_service_account_id=pulumi.get(__response__, 'logging_service_account_id'),
        name=pulumi.get(__response__, 'name'),
        organization=pulumi.get(__response__, 'organization'),
        storage_location=pulumi.get(__response__, 'storage_location')))
