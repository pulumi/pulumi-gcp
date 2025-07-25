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
    'BackupScheduleDailyRecurrence',
    'BackupScheduleWeeklyRecurrence',
    'DatabaseCmekConfig',
    'FieldIndexConfig',
    'FieldIndexConfigIndex',
    'FieldTtlConfig',
    'IndexField',
    'IndexFieldVectorConfig',
    'IndexFieldVectorConfigFlat',
]

@pulumi.output_type
class BackupScheduleDailyRecurrence(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class BackupScheduleWeeklyRecurrence(dict):
    def __init__(__self__, *,
                 day: Optional[_builtins.str] = None):
        """
        :param _builtins.str day: The day of week to run.
               Possible values are: `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        """
        if day is not None:
            pulumi.set(__self__, "day", day)

    @_builtins.property
    @pulumi.getter
    def day(self) -> Optional[_builtins.str]:
        """
        The day of week to run.
        Possible values are: `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        """
        return pulumi.get(self, "day")


@pulumi.output_type
class DatabaseCmekConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "kmsKeyName":
            suggest = "kms_key_name"
        elif key == "activeKeyVersions":
            suggest = "active_key_versions"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DatabaseCmekConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DatabaseCmekConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DatabaseCmekConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 kms_key_name: _builtins.str,
                 active_key_versions: Optional[Sequence[_builtins.str]] = None):
        """
        :param _builtins.str kms_key_name: The resource ID of a Cloud KMS key. If set, the database created will
               be a Customer-managed Encryption Key (CMEK) database encrypted with
               this key. This feature is allowlist only in initial launch.
               Only keys in the same location as this database are allowed to be used
               for encryption. For Firestore's nam5 multi-region, this corresponds to Cloud KMS
               multi-region us. For Firestore's eur3 multi-region, this corresponds to
               Cloud KMS multi-region europe. See https://cloud.google.com/kms/docs/locations.
               This value should be the KMS key resource ID in the format of
               `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
               How to retrieve this resource ID is listed at
               https://cloud.google.com/kms/docs/getting-resource-ids#getting_the_id_for_a_key_and_version.
        :param Sequence[_builtins.str] active_key_versions: (Output)
               Currently in-use KMS key versions (https://cloud.google.com/kms/docs/resource-hierarchy#key_versions).
               During key rotation (https://cloud.google.com/kms/docs/key-rotation), there can be
               multiple in-use key versions.
               The expected format is
               `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{key_version}`.
        """
        pulumi.set(__self__, "kms_key_name", kms_key_name)
        if active_key_versions is not None:
            pulumi.set(__self__, "active_key_versions", active_key_versions)

    @_builtins.property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> _builtins.str:
        """
        The resource ID of a Cloud KMS key. If set, the database created will
        be a Customer-managed Encryption Key (CMEK) database encrypted with
        this key. This feature is allowlist only in initial launch.
        Only keys in the same location as this database are allowed to be used
        for encryption. For Firestore's nam5 multi-region, this corresponds to Cloud KMS
        multi-region us. For Firestore's eur3 multi-region, this corresponds to
        Cloud KMS multi-region europe. See https://cloud.google.com/kms/docs/locations.
        This value should be the KMS key resource ID in the format of
        `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
        How to retrieve this resource ID is listed at
        https://cloud.google.com/kms/docs/getting-resource-ids#getting_the_id_for_a_key_and_version.
        """
        return pulumi.get(self, "kms_key_name")

    @_builtins.property
    @pulumi.getter(name="activeKeyVersions")
    def active_key_versions(self) -> Optional[Sequence[_builtins.str]]:
        """
        (Output)
        Currently in-use KMS key versions (https://cloud.google.com/kms/docs/resource-hierarchy#key_versions).
        During key rotation (https://cloud.google.com/kms/docs/key-rotation), there can be
        multiple in-use key versions.
        The expected format is
        `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{key_version}`.
        """
        return pulumi.get(self, "active_key_versions")


@pulumi.output_type
class FieldIndexConfig(dict):
    def __init__(__self__, *,
                 indexes: Optional[Sequence['outputs.FieldIndexConfigIndex']] = None):
        """
        :param Sequence['FieldIndexConfigIndexArgs'] indexes: The indexes to configure on the field. Order or array contains must be specified.
               Structure is documented below.
        """
        if indexes is not None:
            pulumi.set(__self__, "indexes", indexes)

    @_builtins.property
    @pulumi.getter
    def indexes(self) -> Optional[Sequence['outputs.FieldIndexConfigIndex']]:
        """
        The indexes to configure on the field. Order or array contains must be specified.
        Structure is documented below.
        """
        return pulumi.get(self, "indexes")


@pulumi.output_type
class FieldIndexConfigIndex(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "arrayConfig":
            suggest = "array_config"
        elif key == "queryScope":
            suggest = "query_scope"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FieldIndexConfigIndex. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FieldIndexConfigIndex.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FieldIndexConfigIndex.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 array_config: Optional[_builtins.str] = None,
                 order: Optional[_builtins.str] = None,
                 query_scope: Optional[_builtins.str] = None):
        """
        :param _builtins.str array_config: Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
               be specified.
               Possible values are: `CONTAINS`.
        :param _builtins.str order: Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=, !=.
               Only one of `order` and `arrayConfig` can be specified.
               Possible values are: `ASCENDING`, `DESCENDING`.
        :param _builtins.str query_scope: The scope at which a query is run. Collection scoped queries require you specify
               the collection at query time. Collection group scope allows queries across all
               collections with the same id.
               Default value is `COLLECTION`.
               Possible values are: `COLLECTION`, `COLLECTION_GROUP`.
        """
        if array_config is not None:
            pulumi.set(__self__, "array_config", array_config)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if query_scope is not None:
            pulumi.set(__self__, "query_scope", query_scope)

    @_builtins.property
    @pulumi.getter(name="arrayConfig")
    def array_config(self) -> Optional[_builtins.str]:
        """
        Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
        be specified.
        Possible values are: `CONTAINS`.
        """
        return pulumi.get(self, "array_config")

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[_builtins.str]:
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=, !=.
        Only one of `order` and `arrayConfig` can be specified.
        Possible values are: `ASCENDING`, `DESCENDING`.
        """
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter(name="queryScope")
    def query_scope(self) -> Optional[_builtins.str]:
        """
        The scope at which a query is run. Collection scoped queries require you specify
        the collection at query time. Collection group scope allows queries across all
        collections with the same id.
        Default value is `COLLECTION`.
        Possible values are: `COLLECTION`, `COLLECTION_GROUP`.
        """
        return pulumi.get(self, "query_scope")


@pulumi.output_type
class FieldTtlConfig(dict):
    def __init__(__self__, *,
                 state: Optional[_builtins.str] = None):
        """
        :param _builtins.str state: (Output)
               The state of TTL (time-to-live) configuration for documents that have this Field set.
        """
        if state is not None:
            pulumi.set(__self__, "state", state)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[_builtins.str]:
        """
        (Output)
        The state of TTL (time-to-live) configuration for documents that have this Field set.
        """
        return pulumi.get(self, "state")


@pulumi.output_type
class IndexField(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "arrayConfig":
            suggest = "array_config"
        elif key == "fieldPath":
            suggest = "field_path"
        elif key == "vectorConfig":
            suggest = "vector_config"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in IndexField. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        IndexField.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        IndexField.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 array_config: Optional[_builtins.str] = None,
                 field_path: Optional[_builtins.str] = None,
                 order: Optional[_builtins.str] = None,
                 vector_config: Optional['outputs.IndexFieldVectorConfig'] = None):
        """
        :param _builtins.str array_config: Indicates that this field supports operations on arrayValues. Only one of `order`, `arrayConfig`, and
               `vectorConfig` can be specified.
               Possible values are: `CONTAINS`.
        :param _builtins.str field_path: Name of the field.
        :param _builtins.str order: Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
               Only one of `order`, `arrayConfig`, and `vectorConfig` can be specified.
               Possible values are: `ASCENDING`, `DESCENDING`.
        :param 'IndexFieldVectorConfigArgs' vector_config: Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, and
               `vectorConfig` can be specified. Vector Fields should come after the field path `__name__`.
               Structure is documented below.
        """
        if array_config is not None:
            pulumi.set(__self__, "array_config", array_config)
        if field_path is not None:
            pulumi.set(__self__, "field_path", field_path)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if vector_config is not None:
            pulumi.set(__self__, "vector_config", vector_config)

    @_builtins.property
    @pulumi.getter(name="arrayConfig")
    def array_config(self) -> Optional[_builtins.str]:
        """
        Indicates that this field supports operations on arrayValues. Only one of `order`, `arrayConfig`, and
        `vectorConfig` can be specified.
        Possible values are: `CONTAINS`.
        """
        return pulumi.get(self, "array_config")

    @_builtins.property
    @pulumi.getter(name="fieldPath")
    def field_path(self) -> Optional[_builtins.str]:
        """
        Name of the field.
        """
        return pulumi.get(self, "field_path")

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[_builtins.str]:
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
        Only one of `order`, `arrayConfig`, and `vectorConfig` can be specified.
        Possible values are: `ASCENDING`, `DESCENDING`.
        """
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter(name="vectorConfig")
    def vector_config(self) -> Optional['outputs.IndexFieldVectorConfig']:
        """
        Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, and
        `vectorConfig` can be specified. Vector Fields should come after the field path `__name__`.
        Structure is documented below.
        """
        return pulumi.get(self, "vector_config")


@pulumi.output_type
class IndexFieldVectorConfig(dict):
    def __init__(__self__, *,
                 dimension: Optional[_builtins.int] = None,
                 flat: Optional['outputs.IndexFieldVectorConfigFlat'] = None):
        """
        :param _builtins.int dimension: The resulting index will only include vectors of this dimension, and can be used for vector search
               with the same dimension.
        :param 'IndexFieldVectorConfigFlatArgs' flat: Indicates the vector index is a flat index.
        """
        if dimension is not None:
            pulumi.set(__self__, "dimension", dimension)
        if flat is not None:
            pulumi.set(__self__, "flat", flat)

    @_builtins.property
    @pulumi.getter
    def dimension(self) -> Optional[_builtins.int]:
        """
        The resulting index will only include vectors of this dimension, and can be used for vector search
        with the same dimension.
        """
        return pulumi.get(self, "dimension")

    @_builtins.property
    @pulumi.getter
    def flat(self) -> Optional['outputs.IndexFieldVectorConfigFlat']:
        """
        Indicates the vector index is a flat index.
        """
        return pulumi.get(self, "flat")


@pulumi.output_type
class IndexFieldVectorConfigFlat(dict):
    def __init__(__self__):
        pass


