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
    'ParameterPolicyMember',
    'RegionalParameterPolicyMember',
    'GetParameterPolicyMemberResult',
    'GetParametersParameterResult',
    'GetParametersParameterPolicyMemberResult',
    'GetRegionalParameterPolicyMemberResult',
    'GetRegionalParametersParameterResult',
    'GetRegionalParametersParameterPolicyMemberResult',
]

@pulumi.output_type
class ParameterPolicyMember(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "iamPolicyNamePrincipal":
            suggest = "iam_policy_name_principal"
        elif key == "iamPolicyUidPrincipal":
            suggest = "iam_policy_uid_principal"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ParameterPolicyMember. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ParameterPolicyMember.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ParameterPolicyMember.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 iam_policy_name_principal: Optional[_builtins.str] = None,
                 iam_policy_uid_principal: Optional[_builtins.str] = None):
        """
        :param _builtins.str iam_policy_name_principal: (Output)
               IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a
               resource is deleted and recreated with the same name, the binding will be applicable to the
               new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/global/parameters/{{parameter_id}}`
        :param _builtins.str iam_policy_uid_principal: (Output)
               IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
               If a resource is deleted and recreated with the same name, the binding will not be applicable to the
               new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/global/parameters/{{uid}}`
        """
        if iam_policy_name_principal is not None:
            pulumi.set(__self__, "iam_policy_name_principal", iam_policy_name_principal)
        if iam_policy_uid_principal is not None:
            pulumi.set(__self__, "iam_policy_uid_principal", iam_policy_uid_principal)

    @_builtins.property
    @pulumi.getter(name="iamPolicyNamePrincipal")
    def iam_policy_name_principal(self) -> Optional[_builtins.str]:
        """
        (Output)
        IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a
        resource is deleted and recreated with the same name, the binding will be applicable to the
        new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/global/parameters/{{parameter_id}}`
        """
        return pulumi.get(self, "iam_policy_name_principal")

    @_builtins.property
    @pulumi.getter(name="iamPolicyUidPrincipal")
    def iam_policy_uid_principal(self) -> Optional[_builtins.str]:
        """
        (Output)
        IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
        If a resource is deleted and recreated with the same name, the binding will not be applicable to the
        new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/global/parameters/{{uid}}`
        """
        return pulumi.get(self, "iam_policy_uid_principal")


@pulumi.output_type
class RegionalParameterPolicyMember(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "iamPolicyNamePrincipal":
            suggest = "iam_policy_name_principal"
        elif key == "iamPolicyUidPrincipal":
            suggest = "iam_policy_uid_principal"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RegionalParameterPolicyMember. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RegionalParameterPolicyMember.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RegionalParameterPolicyMember.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 iam_policy_name_principal: Optional[_builtins.str] = None,
                 iam_policy_uid_principal: Optional[_builtins.str] = None):
        """
        :param _builtins.str iam_policy_name_principal: (Output)
               IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is
               deleted and recreated with the same name, the binding will be applicable to the new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/{{location}}/parameters/{{parameter_id}}`
        :param _builtins.str iam_policy_uid_principal: (Output)
               IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier. If
               a resource is deleted and recreated with the same name, the binding will not be applicable to the new
               resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/{{location}}/parameters/{{uid}}`
        """
        if iam_policy_name_principal is not None:
            pulumi.set(__self__, "iam_policy_name_principal", iam_policy_name_principal)
        if iam_policy_uid_principal is not None:
            pulumi.set(__self__, "iam_policy_uid_principal", iam_policy_uid_principal)

    @_builtins.property
    @pulumi.getter(name="iamPolicyNamePrincipal")
    def iam_policy_name_principal(self) -> Optional[_builtins.str]:
        """
        (Output)
        IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is
        deleted and recreated with the same name, the binding will be applicable to the new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/{{location}}/parameters/{{parameter_id}}`
        """
        return pulumi.get(self, "iam_policy_name_principal")

    @_builtins.property
    @pulumi.getter(name="iamPolicyUidPrincipal")
    def iam_policy_uid_principal(self) -> Optional[_builtins.str]:
        """
        (Output)
        IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier. If
        a resource is deleted and recreated with the same name, the binding will not be applicable to the new
        resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/{{location}}/parameters/{{uid}}`
        """
        return pulumi.get(self, "iam_policy_uid_principal")


@pulumi.output_type
class GetParameterPolicyMemberResult(dict):
    def __init__(__self__, *,
                 iam_policy_name_principal: _builtins.str,
                 iam_policy_uid_principal: _builtins.str):
        """
        :param _builtins.str iam_policy_name_principal: IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a
               resource is deleted and recreated with the same name, the binding will be applicable to the
               new resource. Format:
               'principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/global/parameters/{{parameter_id}}'
        :param _builtins.str iam_policy_uid_principal: IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
               If a resource is deleted and recreated with the same name, the binding will not be applicable to the
               new resource. Format:
               'principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/global/parameters/{{uid}}'
        """
        pulumi.set(__self__, "iam_policy_name_principal", iam_policy_name_principal)
        pulumi.set(__self__, "iam_policy_uid_principal", iam_policy_uid_principal)

    @_builtins.property
    @pulumi.getter(name="iamPolicyNamePrincipal")
    def iam_policy_name_principal(self) -> _builtins.str:
        """
        IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a
        resource is deleted and recreated with the same name, the binding will be applicable to the
        new resource. Format:
        'principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/global/parameters/{{parameter_id}}'
        """
        return pulumi.get(self, "iam_policy_name_principal")

    @_builtins.property
    @pulumi.getter(name="iamPolicyUidPrincipal")
    def iam_policy_uid_principal(self) -> _builtins.str:
        """
        IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
        If a resource is deleted and recreated with the same name, the binding will not be applicable to the
        new resource. Format:
        'principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/global/parameters/{{uid}}'
        """
        return pulumi.get(self, "iam_policy_uid_principal")


@pulumi.output_type
class GetParametersParameterResult(dict):
    def __init__(__self__, *,
                 create_time: _builtins.str,
                 effective_labels: Mapping[str, _builtins.str],
                 format: _builtins.str,
                 kms_key: _builtins.str,
                 labels: Mapping[str, _builtins.str],
                 name: _builtins.str,
                 parameter_id: _builtins.str,
                 policy_members: Sequence['outputs.GetParametersParameterPolicyMemberResult'],
                 project: _builtins.str,
                 pulumi_labels: Mapping[str, _builtins.str],
                 update_time: _builtins.str):
        """
        :param _builtins.str create_time: The time at which the parameter was created.
        :param _builtins.str format: The format type of the parameter.
        :param _builtins.str kms_key: The resource name of the Cloud KMS CryptoKey used to encrypt parameter version payload. Format `projects/{{project}}/locations/global/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        :param Mapping[str, _builtins.str] labels: The labels assigned to the parameter.
        :param _builtins.str name: The resource name of the parameter. Format: `projects/{{project}}/locations/global/parameters/{{parameter_id}}`
        :param _builtins.str parameter_id: The unique name of the resource.
        :param Sequence['GetParametersParameterPolicyMemberArgs'] policy_members: An object containing a unique resource identity tied to the parameter. Structure is documented below.
        :param _builtins.str project: The ID of the project.
        :param Mapping[str, _builtins.str] pulumi_labels: The combination of labels configured directly on the resource
                and default labels configured on the provider.
        :param _builtins.str update_time: The time at which the parameter was updated.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "effective_labels", effective_labels)
        pulumi.set(__self__, "format", format)
        pulumi.set(__self__, "kms_key", kms_key)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "parameter_id", parameter_id)
        pulumi.set(__self__, "policy_members", policy_members)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        The time at which the parameter was created.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def format(self) -> _builtins.str:
        """
        The format type of the parameter.
        """
        return pulumi.get(self, "format")

    @_builtins.property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> _builtins.str:
        """
        The resource name of the Cloud KMS CryptoKey used to encrypt parameter version payload. Format `projects/{{project}}/locations/global/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        """
        return pulumi.get(self, "kms_key")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        """
        The labels assigned to the parameter.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The resource name of the parameter. Format: `projects/{{project}}/locations/global/parameters/{{parameter_id}}`
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="parameterId")
    def parameter_id(self) -> _builtins.str:
        """
        The unique name of the resource.
        """
        return pulumi.get(self, "parameter_id")

    @_builtins.property
    @pulumi.getter(name="policyMembers")
    def policy_members(self) -> Sequence['outputs.GetParametersParameterPolicyMemberResult']:
        """
        An object containing a unique resource identity tied to the parameter. Structure is documented below.
        """
        return pulumi.get(self, "policy_members")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        """
        The ID of the project.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        """
        The combination of labels configured directly on the resource
         and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> _builtins.str:
        """
        The time at which the parameter was updated.
        """
        return pulumi.get(self, "update_time")


@pulumi.output_type
class GetParametersParameterPolicyMemberResult(dict):
    def __init__(__self__, *,
                 iam_policy_name_principal: _builtins.str,
                 iam_policy_uid_principal: _builtins.str):
        """
        :param _builtins.str iam_policy_name_principal: AM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is deleted and recreated with the same name, the binding will be applicable to the
               new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/global/parameters/{{parameter_id}}`
        :param _builtins.str iam_policy_uid_principal: IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
               If a resource is deleted and recreated with the same name, the binding will not be applicable to the
               new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/global/parameters/{{uid}}`
        """
        pulumi.set(__self__, "iam_policy_name_principal", iam_policy_name_principal)
        pulumi.set(__self__, "iam_policy_uid_principal", iam_policy_uid_principal)

    @_builtins.property
    @pulumi.getter(name="iamPolicyNamePrincipal")
    def iam_policy_name_principal(self) -> _builtins.str:
        """
        AM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is deleted and recreated with the same name, the binding will be applicable to the
        new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/global/parameters/{{parameter_id}}`
        """
        return pulumi.get(self, "iam_policy_name_principal")

    @_builtins.property
    @pulumi.getter(name="iamPolicyUidPrincipal")
    def iam_policy_uid_principal(self) -> _builtins.str:
        """
        IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
        If a resource is deleted and recreated with the same name, the binding will not be applicable to the
        new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/global/parameters/{{uid}}`
        """
        return pulumi.get(self, "iam_policy_uid_principal")


@pulumi.output_type
class GetRegionalParameterPolicyMemberResult(dict):
    def __init__(__self__, *,
                 iam_policy_name_principal: _builtins.str,
                 iam_policy_uid_principal: _builtins.str):
        """
        :param _builtins.str iam_policy_name_principal: IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is
               deleted and recreated with the same name, the binding will be applicable to the new resource. Format:
               'principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/{{location}}/parameters/{{parameter_id}}'
        :param _builtins.str iam_policy_uid_principal: IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier. If
               a resource is deleted and recreated with the same name, the binding will not be applicable to the new
               resource. Format:
               'principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/{{location}}/parameters/{{uid}}'
        """
        pulumi.set(__self__, "iam_policy_name_principal", iam_policy_name_principal)
        pulumi.set(__self__, "iam_policy_uid_principal", iam_policy_uid_principal)

    @_builtins.property
    @pulumi.getter(name="iamPolicyNamePrincipal")
    def iam_policy_name_principal(self) -> _builtins.str:
        """
        IAM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is
        deleted and recreated with the same name, the binding will be applicable to the new resource. Format:
        'principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/{{location}}/parameters/{{parameter_id}}'
        """
        return pulumi.get(self, "iam_policy_name_principal")

    @_builtins.property
    @pulumi.getter(name="iamPolicyUidPrincipal")
    def iam_policy_uid_principal(self) -> _builtins.str:
        """
        IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier. If
        a resource is deleted and recreated with the same name, the binding will not be applicable to the new
        resource. Format:
        'principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/{{location}}/parameters/{{uid}}'
        """
        return pulumi.get(self, "iam_policy_uid_principal")


@pulumi.output_type
class GetRegionalParametersParameterResult(dict):
    def __init__(__self__, *,
                 create_time: _builtins.str,
                 effective_labels: Mapping[str, _builtins.str],
                 format: _builtins.str,
                 kms_key: _builtins.str,
                 labels: Mapping[str, _builtins.str],
                 location: _builtins.str,
                 name: _builtins.str,
                 parameter_id: _builtins.str,
                 policy_members: Sequence['outputs.GetRegionalParametersParameterPolicyMemberResult'],
                 project: _builtins.str,
                 pulumi_labels: Mapping[str, _builtins.str],
                 update_time: _builtins.str):
        """
        :param _builtins.str create_time: The time at which the regional parameter was created.
        :param _builtins.str format: The format type of the regional parameter.
        :param _builtins.str kms_key: The resource name of the Cloud KMS CryptoKey used to encrypt regional parameter version payload. Format `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        :param Mapping[str, _builtins.str] labels: The labels assigned to the regional parameter.
        :param _builtins.str location: The location of regional parameter.
        :param _builtins.str name: The resource name of the regional parameter. Format: `projects/{{project}}/locations/{{location}}/parameters/{{parameter_id}}`
        :param _builtins.str parameter_id: The unique name of the resource.
        :param Sequence['GetRegionalParametersParameterPolicyMemberArgs'] policy_members: An object containing a unique resource identity tied to the regional parameter. Structure is documented below.
        :param _builtins.str project: The ID of the project.
        :param Mapping[str, _builtins.str] pulumi_labels: The combination of labels configured directly on the resource
                and default labels configured on the provider.
        :param _builtins.str update_time: The time at which the regional parameter was updated.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "effective_labels", effective_labels)
        pulumi.set(__self__, "format", format)
        pulumi.set(__self__, "kms_key", kms_key)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "parameter_id", parameter_id)
        pulumi.set(__self__, "policy_members", policy_members)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.str:
        """
        The time at which the regional parameter was created.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def format(self) -> _builtins.str:
        """
        The format type of the regional parameter.
        """
        return pulumi.get(self, "format")

    @_builtins.property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> _builtins.str:
        """
        The resource name of the Cloud KMS CryptoKey used to encrypt regional parameter version payload. Format `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        """
        return pulumi.get(self, "kms_key")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        """
        The labels assigned to the regional parameter.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The location of regional parameter.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The resource name of the regional parameter. Format: `projects/{{project}}/locations/{{location}}/parameters/{{parameter_id}}`
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="parameterId")
    def parameter_id(self) -> _builtins.str:
        """
        The unique name of the resource.
        """
        return pulumi.get(self, "parameter_id")

    @_builtins.property
    @pulumi.getter(name="policyMembers")
    def policy_members(self) -> Sequence['outputs.GetRegionalParametersParameterPolicyMemberResult']:
        """
        An object containing a unique resource identity tied to the regional parameter. Structure is documented below.
        """
        return pulumi.get(self, "policy_members")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        """
        The ID of the project.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        """
        The combination of labels configured directly on the resource
         and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> _builtins.str:
        """
        The time at which the regional parameter was updated.
        """
        return pulumi.get(self, "update_time")


@pulumi.output_type
class GetRegionalParametersParameterPolicyMemberResult(dict):
    def __init__(__self__, *,
                 iam_policy_name_principal: _builtins.str,
                 iam_policy_uid_principal: _builtins.str):
        """
        :param _builtins.str iam_policy_name_principal: AM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is deleted and recreated with the same name, the binding will be applicable to the
               new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/{{location}}/parameters/{{parameter_id}}`
        :param _builtins.str iam_policy_uid_principal: IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
               If a resource is deleted and recreated with the same name, the binding will not be applicable to the
               new resource. Format:
               `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/{{location}}/parameters/{{uid}}`
        """
        pulumi.set(__self__, "iam_policy_name_principal", iam_policy_name_principal)
        pulumi.set(__self__, "iam_policy_uid_principal", iam_policy_uid_principal)

    @_builtins.property
    @pulumi.getter(name="iamPolicyNamePrincipal")
    def iam_policy_name_principal(self) -> _builtins.str:
        """
        AM policy binding member referring to a Google Cloud resource by user-assigned name. If a resource is deleted and recreated with the same name, the binding will be applicable to the
        new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/name/locations/{{location}}/parameters/{{parameter_id}}`
        """
        return pulumi.get(self, "iam_policy_name_principal")

    @_builtins.property
    @pulumi.getter(name="iamPolicyUidPrincipal")
    def iam_policy_uid_principal(self) -> _builtins.str:
        """
        IAM policy binding member referring to a Google Cloud resource by system-assigned unique identifier.
        If a resource is deleted and recreated with the same name, the binding will not be applicable to the
        new resource. Format:
        `principal://parametermanager.googleapis.com/projects/{{project}}/uid/locations/{{location}}/parameters/{{uid}}`
        """
        return pulumi.get(self, "iam_policy_uid_principal")


