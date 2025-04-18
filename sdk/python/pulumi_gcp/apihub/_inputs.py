# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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
    'ApiHubInstanceConfigArgs',
    'ApiHubInstanceConfigArgsDict',
]

MYPY = False

if not MYPY:
    class ApiHubInstanceConfigArgsDict(TypedDict):
        cmek_key_name: NotRequired[pulumi.Input[builtins.str]]
        """
        Optional. The Customer Managed Encryption Key (CMEK) used for data encryption.
        The CMEK name should follow the format of
        `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`,
        where the location must match the instance location.
        If the CMEK is not provided, a GMEK will be created for the instance.
        """
        disable_search: NotRequired[pulumi.Input[builtins.bool]]
        """
        Optional. If true, the search will be disabled for the instance. The default value
        is false.
        """
        encryption_type: NotRequired[pulumi.Input[builtins.str]]
        """
        Optional. Encryption type for the region. If the encryption type is CMEK, the
        cmek_key_name must be provided. If no encryption type is provided,
        GMEK will be used.
        Possible values:
        ENCRYPTION_TYPE_UNSPECIFIED
        GMEK
        CMEK
        """
        vertex_location: NotRequired[pulumi.Input[builtins.str]]
        """
        Optional. The name of the Vertex AI location where the data store is stored.

        - - -
        """
elif False:
    ApiHubInstanceConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ApiHubInstanceConfigArgs:
    def __init__(__self__, *,
                 cmek_key_name: Optional[pulumi.Input[builtins.str]] = None,
                 disable_search: Optional[pulumi.Input[builtins.bool]] = None,
                 encryption_type: Optional[pulumi.Input[builtins.str]] = None,
                 vertex_location: Optional[pulumi.Input[builtins.str]] = None):
        """
        :param pulumi.Input[builtins.str] cmek_key_name: Optional. The Customer Managed Encryption Key (CMEK) used for data encryption.
               The CMEK name should follow the format of
               `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`,
               where the location must match the instance location.
               If the CMEK is not provided, a GMEK will be created for the instance.
        :param pulumi.Input[builtins.bool] disable_search: Optional. If true, the search will be disabled for the instance. The default value
               is false.
        :param pulumi.Input[builtins.str] encryption_type: Optional. Encryption type for the region. If the encryption type is CMEK, the
               cmek_key_name must be provided. If no encryption type is provided,
               GMEK will be used.
               Possible values:
               ENCRYPTION_TYPE_UNSPECIFIED
               GMEK
               CMEK
        :param pulumi.Input[builtins.str] vertex_location: Optional. The name of the Vertex AI location where the data store is stored.
               
               - - -
        """
        if cmek_key_name is not None:
            pulumi.set(__self__, "cmek_key_name", cmek_key_name)
        if disable_search is not None:
            pulumi.set(__self__, "disable_search", disable_search)
        if encryption_type is not None:
            pulumi.set(__self__, "encryption_type", encryption_type)
        if vertex_location is not None:
            pulumi.set(__self__, "vertex_location", vertex_location)

    @property
    @pulumi.getter(name="cmekKeyName")
    def cmek_key_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Optional. The Customer Managed Encryption Key (CMEK) used for data encryption.
        The CMEK name should follow the format of
        `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`,
        where the location must match the instance location.
        If the CMEK is not provided, a GMEK will be created for the instance.
        """
        return pulumi.get(self, "cmek_key_name")

    @cmek_key_name.setter
    def cmek_key_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cmek_key_name", value)

    @property
    @pulumi.getter(name="disableSearch")
    def disable_search(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Optional. If true, the search will be disabled for the instance. The default value
        is false.
        """
        return pulumi.get(self, "disable_search")

    @disable_search.setter
    def disable_search(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "disable_search", value)

    @property
    @pulumi.getter(name="encryptionType")
    def encryption_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Optional. Encryption type for the region. If the encryption type is CMEK, the
        cmek_key_name must be provided. If no encryption type is provided,
        GMEK will be used.
        Possible values:
        ENCRYPTION_TYPE_UNSPECIFIED
        GMEK
        CMEK
        """
        return pulumi.get(self, "encryption_type")

    @encryption_type.setter
    def encryption_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "encryption_type", value)

    @property
    @pulumi.getter(name="vertexLocation")
    def vertex_location(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Optional. The name of the Vertex AI location where the data store is stored.

        - - -
        """
        return pulumi.get(self, "vertex_location")

    @vertex_location.setter
    def vertex_location(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "vertex_location", value)


