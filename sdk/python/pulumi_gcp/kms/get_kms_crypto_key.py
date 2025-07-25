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
    'GetKMSCryptoKeyResult',
    'AwaitableGetKMSCryptoKeyResult',
    'get_kms_crypto_key',
    'get_kms_crypto_key_output',
]

@pulumi.output_type
class GetKMSCryptoKeyResult:
    """
    A collection of values returned by getKMSCryptoKey.
    """
    def __init__(__self__, crypto_key_backend=None, destroy_scheduled_duration=None, effective_labels=None, id=None, import_only=None, key_access_justifications_policies=None, key_ring=None, labels=None, name=None, primaries=None, pulumi_labels=None, purpose=None, rotation_period=None, skip_initial_version_creation=None, version_templates=None):
        if crypto_key_backend and not isinstance(crypto_key_backend, str):
            raise TypeError("Expected argument 'crypto_key_backend' to be a str")
        pulumi.set(__self__, "crypto_key_backend", crypto_key_backend)
        if destroy_scheduled_duration and not isinstance(destroy_scheduled_duration, str):
            raise TypeError("Expected argument 'destroy_scheduled_duration' to be a str")
        pulumi.set(__self__, "destroy_scheduled_duration", destroy_scheduled_duration)
        if effective_labels and not isinstance(effective_labels, dict):
            raise TypeError("Expected argument 'effective_labels' to be a dict")
        pulumi.set(__self__, "effective_labels", effective_labels)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if import_only and not isinstance(import_only, bool):
            raise TypeError("Expected argument 'import_only' to be a bool")
        pulumi.set(__self__, "import_only", import_only)
        if key_access_justifications_policies and not isinstance(key_access_justifications_policies, list):
            raise TypeError("Expected argument 'key_access_justifications_policies' to be a list")
        pulumi.set(__self__, "key_access_justifications_policies", key_access_justifications_policies)
        if key_ring and not isinstance(key_ring, str):
            raise TypeError("Expected argument 'key_ring' to be a str")
        pulumi.set(__self__, "key_ring", key_ring)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if primaries and not isinstance(primaries, list):
            raise TypeError("Expected argument 'primaries' to be a list")
        pulumi.set(__self__, "primaries", primaries)
        if pulumi_labels and not isinstance(pulumi_labels, dict):
            raise TypeError("Expected argument 'pulumi_labels' to be a dict")
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if purpose and not isinstance(purpose, str):
            raise TypeError("Expected argument 'purpose' to be a str")
        pulumi.set(__self__, "purpose", purpose)
        if rotation_period and not isinstance(rotation_period, str):
            raise TypeError("Expected argument 'rotation_period' to be a str")
        pulumi.set(__self__, "rotation_period", rotation_period)
        if skip_initial_version_creation and not isinstance(skip_initial_version_creation, bool):
            raise TypeError("Expected argument 'skip_initial_version_creation' to be a bool")
        pulumi.set(__self__, "skip_initial_version_creation", skip_initial_version_creation)
        if version_templates and not isinstance(version_templates, list):
            raise TypeError("Expected argument 'version_templates' to be a list")
        pulumi.set(__self__, "version_templates", version_templates)

    @_builtins.property
    @pulumi.getter(name="cryptoKeyBackend")
    def crypto_key_backend(self) -> _builtins.str:
        return pulumi.get(self, "crypto_key_backend")

    @_builtins.property
    @pulumi.getter(name="destroyScheduledDuration")
    def destroy_scheduled_duration(self) -> _builtins.str:
        return pulumi.get(self, "destroy_scheduled_duration")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="importOnly")
    def import_only(self) -> _builtins.bool:
        return pulumi.get(self, "import_only")

    @_builtins.property
    @pulumi.getter(name="keyAccessJustificationsPolicies")
    def key_access_justifications_policies(self) -> Sequence['outputs.GetKMSCryptoKeyKeyAccessJustificationsPolicyResult']:
        return pulumi.get(self, "key_access_justifications_policies")

    @_builtins.property
    @pulumi.getter(name="keyRing")
    def key_ring(self) -> _builtins.str:
        return pulumi.get(self, "key_ring")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def primaries(self) -> Sequence['outputs.GetKMSCryptoKeyPrimaryResult']:
        return pulumi.get(self, "primaries")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter
    def purpose(self) -> _builtins.str:
        """
        Defines the cryptographic capabilities of the key.
        """
        return pulumi.get(self, "purpose")

    @_builtins.property
    @pulumi.getter(name="rotationPeriod")
    def rotation_period(self) -> _builtins.str:
        """
        Every time this period passes, generate a new CryptoKeyVersion and set it as
        the primary. The first rotation will take place after the specified period. The rotation period has the format
        of a decimal number with up to 9 fractional digits, followed by the letter s (seconds).
        """
        return pulumi.get(self, "rotation_period")

    @_builtins.property
    @pulumi.getter(name="skipInitialVersionCreation")
    def skip_initial_version_creation(self) -> _builtins.bool:
        return pulumi.get(self, "skip_initial_version_creation")

    @_builtins.property
    @pulumi.getter(name="versionTemplates")
    def version_templates(self) -> Sequence['outputs.GetKMSCryptoKeyVersionTemplateResult']:
        return pulumi.get(self, "version_templates")


class AwaitableGetKMSCryptoKeyResult(GetKMSCryptoKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKMSCryptoKeyResult(
            crypto_key_backend=self.crypto_key_backend,
            destroy_scheduled_duration=self.destroy_scheduled_duration,
            effective_labels=self.effective_labels,
            id=self.id,
            import_only=self.import_only,
            key_access_justifications_policies=self.key_access_justifications_policies,
            key_ring=self.key_ring,
            labels=self.labels,
            name=self.name,
            primaries=self.primaries,
            pulumi_labels=self.pulumi_labels,
            purpose=self.purpose,
            rotation_period=self.rotation_period,
            skip_initial_version_creation=self.skip_initial_version_creation,
            version_templates=self.version_templates)


def get_kms_crypto_key(key_ring: Optional[_builtins.str] = None,
                       name: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKMSCryptoKeyResult:
    """
    Provides access to a Google Cloud Platform KMS CryptoKey. For more information see
    [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
    and
    [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).

    A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
    Google Cloud KMS KeyRing.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_key_ring = gcp.kms.get_kms_key_ring(name="my-key-ring",
        location="us-central1")
    my_crypto_key = gcp.kms.get_kms_crypto_key(name="my-crypto-key",
        key_ring=my_key_ring.id)
    ```


    :param _builtins.str key_ring: The `id` of the Google Cloud Platform KeyRing to which the key belongs.
    :param _builtins.str name: The CryptoKey's name.
           A CryptoKey’s name belonging to the specified Google Cloud Platform KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
    """
    __args__ = dict()
    __args__['keyRing'] = key_ring
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:kms/getKMSCryptoKey:getKMSCryptoKey', __args__, opts=opts, typ=GetKMSCryptoKeyResult).value

    return AwaitableGetKMSCryptoKeyResult(
        crypto_key_backend=pulumi.get(__ret__, 'crypto_key_backend'),
        destroy_scheduled_duration=pulumi.get(__ret__, 'destroy_scheduled_duration'),
        effective_labels=pulumi.get(__ret__, 'effective_labels'),
        id=pulumi.get(__ret__, 'id'),
        import_only=pulumi.get(__ret__, 'import_only'),
        key_access_justifications_policies=pulumi.get(__ret__, 'key_access_justifications_policies'),
        key_ring=pulumi.get(__ret__, 'key_ring'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        primaries=pulumi.get(__ret__, 'primaries'),
        pulumi_labels=pulumi.get(__ret__, 'pulumi_labels'),
        purpose=pulumi.get(__ret__, 'purpose'),
        rotation_period=pulumi.get(__ret__, 'rotation_period'),
        skip_initial_version_creation=pulumi.get(__ret__, 'skip_initial_version_creation'),
        version_templates=pulumi.get(__ret__, 'version_templates'))
def get_kms_crypto_key_output(key_ring: Optional[pulumi.Input[_builtins.str]] = None,
                              name: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetKMSCryptoKeyResult]:
    """
    Provides access to a Google Cloud Platform KMS CryptoKey. For more information see
    [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
    and
    [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).

    A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
    Google Cloud KMS KeyRing.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_key_ring = gcp.kms.get_kms_key_ring(name="my-key-ring",
        location="us-central1")
    my_crypto_key = gcp.kms.get_kms_crypto_key(name="my-crypto-key",
        key_ring=my_key_ring.id)
    ```


    :param _builtins.str key_ring: The `id` of the Google Cloud Platform KeyRing to which the key belongs.
    :param _builtins.str name: The CryptoKey's name.
           A CryptoKey’s name belonging to the specified Google Cloud Platform KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
    """
    __args__ = dict()
    __args__['keyRing'] = key_ring
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:kms/getKMSCryptoKey:getKMSCryptoKey', __args__, opts=opts, typ=GetKMSCryptoKeyResult)
    return __ret__.apply(lambda __response__: GetKMSCryptoKeyResult(
        crypto_key_backend=pulumi.get(__response__, 'crypto_key_backend'),
        destroy_scheduled_duration=pulumi.get(__response__, 'destroy_scheduled_duration'),
        effective_labels=pulumi.get(__response__, 'effective_labels'),
        id=pulumi.get(__response__, 'id'),
        import_only=pulumi.get(__response__, 'import_only'),
        key_access_justifications_policies=pulumi.get(__response__, 'key_access_justifications_policies'),
        key_ring=pulumi.get(__response__, 'key_ring'),
        labels=pulumi.get(__response__, 'labels'),
        name=pulumi.get(__response__, 'name'),
        primaries=pulumi.get(__response__, 'primaries'),
        pulumi_labels=pulumi.get(__response__, 'pulumi_labels'),
        purpose=pulumi.get(__response__, 'purpose'),
        rotation_period=pulumi.get(__response__, 'rotation_period'),
        skip_initial_version_creation=pulumi.get(__response__, 'skip_initial_version_creation'),
        version_templates=pulumi.get(__response__, 'version_templates')))
