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
    'BackupScheduleDailyRecurrenceArgs',
    'BackupScheduleDailyRecurrenceArgsDict',
    'BackupScheduleWeeklyRecurrenceArgs',
    'BackupScheduleWeeklyRecurrenceArgsDict',
    'DatabaseCmekConfigArgs',
    'DatabaseCmekConfigArgsDict',
    'FieldIndexConfigArgs',
    'FieldIndexConfigArgsDict',
    'FieldIndexConfigIndexArgs',
    'FieldIndexConfigIndexArgsDict',
    'FieldTtlConfigArgs',
    'FieldTtlConfigArgsDict',
    'IndexFieldArgs',
    'IndexFieldArgsDict',
    'IndexFieldVectorConfigArgs',
    'IndexFieldVectorConfigArgsDict',
    'IndexFieldVectorConfigFlatArgs',
    'IndexFieldVectorConfigFlatArgsDict',
]

MYPY = False

if not MYPY:
    class BackupScheduleDailyRecurrenceArgsDict(TypedDict):
        pass
elif False:
    BackupScheduleDailyRecurrenceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BackupScheduleDailyRecurrenceArgs:
    def __init__(__self__):
        pass


if not MYPY:
    class BackupScheduleWeeklyRecurrenceArgsDict(TypedDict):
        day: NotRequired[pulumi.Input[_builtins.str]]
        """
        The day of week to run.
        Possible values are: `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        """
elif False:
    BackupScheduleWeeklyRecurrenceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BackupScheduleWeeklyRecurrenceArgs:
    def __init__(__self__, *,
                 day: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] day: The day of week to run.
               Possible values are: `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        """
        if day is not None:
            pulumi.set(__self__, "day", day)

    @_builtins.property
    @pulumi.getter
    def day(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The day of week to run.
        Possible values are: `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
        """
        return pulumi.get(self, "day")

    @day.setter
    def day(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "day", value)


if not MYPY:
    class DatabaseCmekConfigArgsDict(TypedDict):
        kms_key_name: pulumi.Input[_builtins.str]
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
        active_key_versions: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        (Output)
        Currently in-use KMS key versions (https://cloud.google.com/kms/docs/resource-hierarchy#key_versions).
        During key rotation (https://cloud.google.com/kms/docs/key-rotation), there can be
        multiple in-use key versions.
        The expected format is
        `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{key_version}`.
        """
elif False:
    DatabaseCmekConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class DatabaseCmekConfigArgs:
    def __init__(__self__, *,
                 kms_key_name: pulumi.Input[_builtins.str],
                 active_key_versions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        :param pulumi.Input[_builtins.str] kms_key_name: The resource ID of a Cloud KMS key. If set, the database created will
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
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] active_key_versions: (Output)
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
    def kms_key_name(self) -> pulumi.Input[_builtins.str]:
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

    @kms_key_name.setter
    def kms_key_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "kms_key_name", value)

    @_builtins.property
    @pulumi.getter(name="activeKeyVersions")
    def active_key_versions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        (Output)
        Currently in-use KMS key versions (https://cloud.google.com/kms/docs/resource-hierarchy#key_versions).
        During key rotation (https://cloud.google.com/kms/docs/key-rotation), there can be
        multiple in-use key versions.
        The expected format is
        `projects/{project_id}/locations/{kms_location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{key_version}`.
        """
        return pulumi.get(self, "active_key_versions")

    @active_key_versions.setter
    def active_key_versions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "active_key_versions", value)


if not MYPY:
    class FieldIndexConfigArgsDict(TypedDict):
        indexes: NotRequired[pulumi.Input[Sequence[pulumi.Input['FieldIndexConfigIndexArgsDict']]]]
        """
        The indexes to configure on the field. Order or array contains must be specified.
        Structure is documented below.
        """
elif False:
    FieldIndexConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FieldIndexConfigArgs:
    def __init__(__self__, *,
                 indexes: Optional[pulumi.Input[Sequence[pulumi.Input['FieldIndexConfigIndexArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['FieldIndexConfigIndexArgs']]] indexes: The indexes to configure on the field. Order or array contains must be specified.
               Structure is documented below.
        """
        if indexes is not None:
            pulumi.set(__self__, "indexes", indexes)

    @_builtins.property
    @pulumi.getter
    def indexes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FieldIndexConfigIndexArgs']]]]:
        """
        The indexes to configure on the field. Order or array contains must be specified.
        Structure is documented below.
        """
        return pulumi.get(self, "indexes")

    @indexes.setter
    def indexes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FieldIndexConfigIndexArgs']]]]):
        pulumi.set(self, "indexes", value)


if not MYPY:
    class FieldIndexConfigIndexArgsDict(TypedDict):
        array_config: NotRequired[pulumi.Input[_builtins.str]]
        """
        Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
        be specified.
        Possible values are: `CONTAINS`.
        """
        order: NotRequired[pulumi.Input[_builtins.str]]
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=, !=.
        Only one of `order` and `arrayConfig` can be specified.
        Possible values are: `ASCENDING`, `DESCENDING`.
        """
        query_scope: NotRequired[pulumi.Input[_builtins.str]]
        """
        The scope at which a query is run. Collection scoped queries require you specify
        the collection at query time. Collection group scope allows queries across all
        collections with the same id.
        Default value is `COLLECTION`.
        Possible values are: `COLLECTION`, `COLLECTION_GROUP`.
        """
elif False:
    FieldIndexConfigIndexArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FieldIndexConfigIndexArgs:
    def __init__(__self__, *,
                 array_config: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.str]] = None,
                 query_scope: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] array_config: Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
               be specified.
               Possible values are: `CONTAINS`.
        :param pulumi.Input[_builtins.str] order: Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=, !=.
               Only one of `order` and `arrayConfig` can be specified.
               Possible values are: `ASCENDING`, `DESCENDING`.
        :param pulumi.Input[_builtins.str] query_scope: The scope at which a query is run. Collection scoped queries require you specify
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
    def array_config(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
        be specified.
        Possible values are: `CONTAINS`.
        """
        return pulumi.get(self, "array_config")

    @array_config.setter
    def array_config(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "array_config", value)

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=, !=.
        Only one of `order` and `arrayConfig` can be specified.
        Possible values are: `ASCENDING`, `DESCENDING`.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "order", value)

    @_builtins.property
    @pulumi.getter(name="queryScope")
    def query_scope(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The scope at which a query is run. Collection scoped queries require you specify
        the collection at query time. Collection group scope allows queries across all
        collections with the same id.
        Default value is `COLLECTION`.
        Possible values are: `COLLECTION`, `COLLECTION_GROUP`.
        """
        return pulumi.get(self, "query_scope")

    @query_scope.setter
    def query_scope(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "query_scope", value)


if not MYPY:
    class FieldTtlConfigArgsDict(TypedDict):
        state: NotRequired[pulumi.Input[_builtins.str]]
        """
        (Output)
        The state of TTL (time-to-live) configuration for documents that have this Field set.
        """
elif False:
    FieldTtlConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FieldTtlConfigArgs:
    def __init__(__self__, *,
                 state: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] state: (Output)
               The state of TTL (time-to-live) configuration for documents that have this Field set.
        """
        if state is not None:
            pulumi.set(__self__, "state", state)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Output)
        The state of TTL (time-to-live) configuration for documents that have this Field set.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)


if not MYPY:
    class IndexFieldArgsDict(TypedDict):
        array_config: NotRequired[pulumi.Input[_builtins.str]]
        """
        Indicates that this field supports operations on arrayValues. Only one of `order`, `arrayConfig`, and
        `vectorConfig` can be specified.
        Possible values are: `CONTAINS`.
        """
        field_path: NotRequired[pulumi.Input[_builtins.str]]
        """
        Name of the field.
        """
        order: NotRequired[pulumi.Input[_builtins.str]]
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
        Only one of `order`, `arrayConfig`, and `vectorConfig` can be specified.
        Possible values are: `ASCENDING`, `DESCENDING`.
        """
        vector_config: NotRequired[pulumi.Input['IndexFieldVectorConfigArgsDict']]
        """
        Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, and
        `vectorConfig` can be specified. Vector Fields should come after the field path `__name__`.
        Structure is documented below.
        """
elif False:
    IndexFieldArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class IndexFieldArgs:
    def __init__(__self__, *,
                 array_config: Optional[pulumi.Input[_builtins.str]] = None,
                 field_path: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.str]] = None,
                 vector_config: Optional[pulumi.Input['IndexFieldVectorConfigArgs']] = None):
        """
        :param pulumi.Input[_builtins.str] array_config: Indicates that this field supports operations on arrayValues. Only one of `order`, `arrayConfig`, and
               `vectorConfig` can be specified.
               Possible values are: `CONTAINS`.
        :param pulumi.Input[_builtins.str] field_path: Name of the field.
        :param pulumi.Input[_builtins.str] order: Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
               Only one of `order`, `arrayConfig`, and `vectorConfig` can be specified.
               Possible values are: `ASCENDING`, `DESCENDING`.
        :param pulumi.Input['IndexFieldVectorConfigArgs'] vector_config: Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, and
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
    def array_config(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Indicates that this field supports operations on arrayValues. Only one of `order`, `arrayConfig`, and
        `vectorConfig` can be specified.
        Possible values are: `CONTAINS`.
        """
        return pulumi.get(self, "array_config")

    @array_config.setter
    def array_config(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "array_config", value)

    @_builtins.property
    @pulumi.getter(name="fieldPath")
    def field_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the field.
        """
        return pulumi.get(self, "field_path")

    @field_path.setter
    def field_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "field_path", value)

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
        Only one of `order`, `arrayConfig`, and `vectorConfig` can be specified.
        Possible values are: `ASCENDING`, `DESCENDING`.
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "order", value)

    @_builtins.property
    @pulumi.getter(name="vectorConfig")
    def vector_config(self) -> Optional[pulumi.Input['IndexFieldVectorConfigArgs']]:
        """
        Indicates that this field supports vector search operations. Only one of `order`, `arrayConfig`, and
        `vectorConfig` can be specified. Vector Fields should come after the field path `__name__`.
        Structure is documented below.
        """
        return pulumi.get(self, "vector_config")

    @vector_config.setter
    def vector_config(self, value: Optional[pulumi.Input['IndexFieldVectorConfigArgs']]):
        pulumi.set(self, "vector_config", value)


if not MYPY:
    class IndexFieldVectorConfigArgsDict(TypedDict):
        dimension: NotRequired[pulumi.Input[_builtins.int]]
        """
        The resulting index will only include vectors of this dimension, and can be used for vector search
        with the same dimension.
        """
        flat: NotRequired[pulumi.Input['IndexFieldVectorConfigFlatArgsDict']]
        """
        Indicates the vector index is a flat index.
        """
elif False:
    IndexFieldVectorConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class IndexFieldVectorConfigArgs:
    def __init__(__self__, *,
                 dimension: Optional[pulumi.Input[_builtins.int]] = None,
                 flat: Optional[pulumi.Input['IndexFieldVectorConfigFlatArgs']] = None):
        """
        :param pulumi.Input[_builtins.int] dimension: The resulting index will only include vectors of this dimension, and can be used for vector search
               with the same dimension.
        :param pulumi.Input['IndexFieldVectorConfigFlatArgs'] flat: Indicates the vector index is a flat index.
        """
        if dimension is not None:
            pulumi.set(__self__, "dimension", dimension)
        if flat is not None:
            pulumi.set(__self__, "flat", flat)

    @_builtins.property
    @pulumi.getter
    def dimension(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The resulting index will only include vectors of this dimension, and can be used for vector search
        with the same dimension.
        """
        return pulumi.get(self, "dimension")

    @dimension.setter
    def dimension(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "dimension", value)

    @_builtins.property
    @pulumi.getter
    def flat(self) -> Optional[pulumi.Input['IndexFieldVectorConfigFlatArgs']]:
        """
        Indicates the vector index is a flat index.
        """
        return pulumi.get(self, "flat")

    @flat.setter
    def flat(self, value: Optional[pulumi.Input['IndexFieldVectorConfigFlatArgs']]):
        pulumi.set(self, "flat", value)


if not MYPY:
    class IndexFieldVectorConfigFlatArgsDict(TypedDict):
        pass
elif False:
    IndexFieldVectorConfigFlatArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class IndexFieldVectorConfigFlatArgs:
    def __init__(__self__):
        pass


