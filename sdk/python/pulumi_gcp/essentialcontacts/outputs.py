# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'DocumentAiWarehouseDocumentSchemaPropertyDefinition',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptions',
    'DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptions',
]

@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dateTimeTypeOptions":
            suggest = "date_time_type_options"
        elif key == "displayName":
            suggest = "display_name"
        elif key == "enumTypeOptions":
            suggest = "enum_type_options"
        elif key == "floatTypeOptions":
            suggest = "float_type_options"
        elif key == "integerTypeOptions":
            suggest = "integer_type_options"
        elif key == "isFilterable":
            suggest = "is_filterable"
        elif key == "isMetadata":
            suggest = "is_metadata"
        elif key == "isRepeatable":
            suggest = "is_repeatable"
        elif key == "isRequired":
            suggest = "is_required"
        elif key == "isSearchable":
            suggest = "is_searchable"
        elif key == "mapTypeOptions":
            suggest = "map_type_options"
        elif key == "propertyTypeOptions":
            suggest = "property_type_options"
        elif key == "retrievalImportance":
            suggest = "retrieval_importance"
        elif key == "schemaSources":
            suggest = "schema_sources"
        elif key == "textTypeOptions":
            suggest = "text_type_options"
        elif key == "timestampTypeOptions":
            suggest = "timestamp_type_options"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 date_time_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptions'] = None,
                 display_name: Optional[str] = None,
                 enum_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions'] = None,
                 float_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptions'] = None,
                 integer_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions'] = None,
                 is_filterable: Optional[bool] = None,
                 is_metadata: Optional[bool] = None,
                 is_repeatable: Optional[bool] = None,
                 is_required: Optional[bool] = None,
                 is_searchable: Optional[bool] = None,
                 map_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptions'] = None,
                 property_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions'] = None,
                 retrieval_importance: Optional[str] = None,
                 schema_sources: Optional[Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource']] = None,
                 text_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptions'] = None,
                 timestamp_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptions'] = None):
        """
        :param str name: The name of the metadata property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptionsArgs' date_time_type_options: Date time property. Not supported by CMEK compliant deployment.
        :param str display_name: The display-name for the property, used for front-end.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs' enum_type_options: Enum/categorical property.
               Structure is documented below.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptionsArgs' float_type_options: Float property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptionsArgs' integer_type_options: Integer property.
        :param bool is_filterable: Whether the property can be filtered. If this is a sub-property, all the parent properties must be marked filterable.
        :param bool is_metadata: Whether the property is user supplied metadata.
        :param bool is_repeatable: Whether the property can have multiple values.
        :param bool is_required: Whether the property is mandatory.
        :param bool is_searchable: Indicates that the property should be included in a global search.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptionsArgs' map_type_options: Map property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs' property_type_options: Nested structured data property.
               Structure is documented below.
        :param str retrieval_importance: Stores the retrieval importance.
               Possible values are: `HIGHEST`, `HIGHER`, `HIGH`, `MEDIUM`, `LOW`, `LOWEST`.
        :param Sequence['DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs'] schema_sources: The schema source information.
               Structure is documented below.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptionsArgs' text_type_options: Text property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptionsArgs' timestamp_type_options: Timestamp property. Not supported by CMEK compliant deployment.
        """
        pulumi.set(__self__, "name", name)
        if date_time_type_options is not None:
            pulumi.set(__self__, "date_time_type_options", date_time_type_options)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if enum_type_options is not None:
            pulumi.set(__self__, "enum_type_options", enum_type_options)
        if float_type_options is not None:
            pulumi.set(__self__, "float_type_options", float_type_options)
        if integer_type_options is not None:
            pulumi.set(__self__, "integer_type_options", integer_type_options)
        if is_filterable is not None:
            pulumi.set(__self__, "is_filterable", is_filterable)
        if is_metadata is not None:
            pulumi.set(__self__, "is_metadata", is_metadata)
        if is_repeatable is not None:
            pulumi.set(__self__, "is_repeatable", is_repeatable)
        if is_required is not None:
            pulumi.set(__self__, "is_required", is_required)
        if is_searchable is not None:
            pulumi.set(__self__, "is_searchable", is_searchable)
        if map_type_options is not None:
            pulumi.set(__self__, "map_type_options", map_type_options)
        if property_type_options is not None:
            pulumi.set(__self__, "property_type_options", property_type_options)
        if retrieval_importance is not None:
            pulumi.set(__self__, "retrieval_importance", retrieval_importance)
        if schema_sources is not None:
            pulumi.set(__self__, "schema_sources", schema_sources)
        if text_type_options is not None:
            pulumi.set(__self__, "text_type_options", text_type_options)
        if timestamp_type_options is not None:
            pulumi.set(__self__, "timestamp_type_options", timestamp_type_options)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the metadata property.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="dateTimeTypeOptions")
    def date_time_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptions']:
        """
        Date time property. Not supported by CMEK compliant deployment.
        """
        return pulumi.get(self, "date_time_type_options")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[str]:
        """
        The display-name for the property, used for front-end.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="enumTypeOptions")
    def enum_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions']:
        """
        Enum/categorical property.
        Structure is documented below.
        """
        return pulumi.get(self, "enum_type_options")

    @property
    @pulumi.getter(name="floatTypeOptions")
    def float_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptions']:
        """
        Float property.
        """
        return pulumi.get(self, "float_type_options")

    @property
    @pulumi.getter(name="integerTypeOptions")
    def integer_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions']:
        """
        Integer property.
        """
        return pulumi.get(self, "integer_type_options")

    @property
    @pulumi.getter(name="isFilterable")
    def is_filterable(self) -> Optional[bool]:
        """
        Whether the property can be filtered. If this is a sub-property, all the parent properties must be marked filterable.
        """
        return pulumi.get(self, "is_filterable")

    @property
    @pulumi.getter(name="isMetadata")
    def is_metadata(self) -> Optional[bool]:
        """
        Whether the property is user supplied metadata.
        """
        return pulumi.get(self, "is_metadata")

    @property
    @pulumi.getter(name="isRepeatable")
    def is_repeatable(self) -> Optional[bool]:
        """
        Whether the property can have multiple values.
        """
        return pulumi.get(self, "is_repeatable")

    @property
    @pulumi.getter(name="isRequired")
    def is_required(self) -> Optional[bool]:
        """
        Whether the property is mandatory.
        """
        return pulumi.get(self, "is_required")

    @property
    @pulumi.getter(name="isSearchable")
    def is_searchable(self) -> Optional[bool]:
        """
        Indicates that the property should be included in a global search.
        """
        return pulumi.get(self, "is_searchable")

    @property
    @pulumi.getter(name="mapTypeOptions")
    def map_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptions']:
        """
        Map property.
        """
        return pulumi.get(self, "map_type_options")

    @property
    @pulumi.getter(name="propertyTypeOptions")
    def property_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions']:
        """
        Nested structured data property.
        Structure is documented below.
        """
        return pulumi.get(self, "property_type_options")

    @property
    @pulumi.getter(name="retrievalImportance")
    def retrieval_importance(self) -> Optional[str]:
        """
        Stores the retrieval importance.
        Possible values are: `HIGHEST`, `HIGHER`, `HIGH`, `MEDIUM`, `LOW`, `LOWEST`.
        """
        return pulumi.get(self, "retrieval_importance")

    @property
    @pulumi.getter(name="schemaSources")
    def schema_sources(self) -> Optional[Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource']]:
        """
        The schema source information.
        Structure is documented below.
        """
        return pulumi.get(self, "schema_sources")

    @property
    @pulumi.getter(name="textTypeOptions")
    def text_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptions']:
        """
        Text property.
        """
        return pulumi.get(self, "text_type_options")

    @property
    @pulumi.getter(name="timestampTypeOptions")
    def timestamp_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptions']:
        """
        Timestamp property. Not supported by CMEK compliant deployment.
        """
        return pulumi.get(self, "timestamp_type_options")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "possibleValues":
            suggest = "possible_values"
        elif key == "validationCheckDisabled":
            suggest = "validation_check_disabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptions.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 possible_values: Sequence[str],
                 validation_check_disabled: Optional[bool] = None):
        """
        :param Sequence[str] possible_values: List of possible enum values.
        :param bool validation_check_disabled: Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.
               
               - - -
        """
        pulumi.set(__self__, "possible_values", possible_values)
        if validation_check_disabled is not None:
            pulumi.set(__self__, "validation_check_disabled", validation_check_disabled)

    @property
    @pulumi.getter(name="possibleValues")
    def possible_values(self) -> Sequence[str]:
        """
        List of possible enum values.
        """
        return pulumi.get(self, "possible_values")

    @property
    @pulumi.getter(name="validationCheckDisabled")
    def validation_check_disabled(self) -> Optional[bool]:
        """
        Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.

        - - -
        """
        return pulumi.get(self, "validation_check_disabled")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "propertyDefinitions":
            suggest = "property_definitions"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptions.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 property_definitions: Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition']):
        """
        :param Sequence['DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs'] property_definitions: Defines the metadata for a schema property.
               Structure is documented below.
        """
        pulumi.set(__self__, "property_definitions", property_definitions)

    @property
    @pulumi.getter(name="propertyDefinitions")
    def property_definitions(self) -> Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition']:
        """
        Defines the metadata for a schema property.
        Structure is documented below.
        """
        return pulumi.get(self, "property_definitions")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dateTimeTypeOptions":
            suggest = "date_time_type_options"
        elif key == "displayName":
            suggest = "display_name"
        elif key == "enumTypeOptions":
            suggest = "enum_type_options"
        elif key == "floatTypeOptions":
            suggest = "float_type_options"
        elif key == "integerTypeOptions":
            suggest = "integer_type_options"
        elif key == "isFilterable":
            suggest = "is_filterable"
        elif key == "isMetadata":
            suggest = "is_metadata"
        elif key == "isRepeatable":
            suggest = "is_repeatable"
        elif key == "isRequired":
            suggest = "is_required"
        elif key == "isSearchable":
            suggest = "is_searchable"
        elif key == "mapTypeOptions":
            suggest = "map_type_options"
        elif key == "retrievalImportance":
            suggest = "retrieval_importance"
        elif key == "schemaSources":
            suggest = "schema_sources"
        elif key == "textTypeOptions":
            suggest = "text_type_options"
        elif key == "timestampTypeOptions":
            suggest = "timestamp_type_options"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 date_time_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptions'] = None,
                 display_name: Optional[str] = None,
                 enum_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions'] = None,
                 float_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptions'] = None,
                 integer_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptions'] = None,
                 is_filterable: Optional[bool] = None,
                 is_metadata: Optional[bool] = None,
                 is_repeatable: Optional[bool] = None,
                 is_required: Optional[bool] = None,
                 is_searchable: Optional[bool] = None,
                 map_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptions'] = None,
                 retrieval_importance: Optional[str] = None,
                 schema_sources: Optional[Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource']] = None,
                 text_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptions'] = None,
                 timestamp_type_options: Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptions'] = None):
        """
        :param str name: The name of the metadata property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptionsArgs' date_time_type_options: Date time property. Not supported by CMEK compliant deployment.
        :param str display_name: The display-name for the property, used for front-end.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptionsArgs' enum_type_options: Enum/categorical property.
               Structure is documented below.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptionsArgs' float_type_options: Float property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptionsArgs' integer_type_options: Integer property.
        :param bool is_filterable: Whether the property can be filtered. If this is a sub-property, all the parent properties must be marked filterable.
        :param bool is_metadata: Whether the property is user supplied metadata.
        :param bool is_repeatable: Whether the property can have multiple values.
        :param bool is_required: Whether the property is mandatory.
        :param bool is_searchable: Indicates that the property should be included in a global search.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptionsArgs' map_type_options: Map property.
        :param str retrieval_importance: Stores the retrieval importance.
               Possible values are: `HIGHEST`, `HIGHER`, `HIGH`, `MEDIUM`, `LOW`, `LOWEST`.
        :param Sequence['DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs'] schema_sources: The schema source information.
               Structure is documented below.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptionsArgs' text_type_options: Text property.
        :param 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptionsArgs' timestamp_type_options: Timestamp property. Not supported by CMEK compliant deployment.
        """
        pulumi.set(__self__, "name", name)
        if date_time_type_options is not None:
            pulumi.set(__self__, "date_time_type_options", date_time_type_options)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if enum_type_options is not None:
            pulumi.set(__self__, "enum_type_options", enum_type_options)
        if float_type_options is not None:
            pulumi.set(__self__, "float_type_options", float_type_options)
        if integer_type_options is not None:
            pulumi.set(__self__, "integer_type_options", integer_type_options)
        if is_filterable is not None:
            pulumi.set(__self__, "is_filterable", is_filterable)
        if is_metadata is not None:
            pulumi.set(__self__, "is_metadata", is_metadata)
        if is_repeatable is not None:
            pulumi.set(__self__, "is_repeatable", is_repeatable)
        if is_required is not None:
            pulumi.set(__self__, "is_required", is_required)
        if is_searchable is not None:
            pulumi.set(__self__, "is_searchable", is_searchable)
        if map_type_options is not None:
            pulumi.set(__self__, "map_type_options", map_type_options)
        if retrieval_importance is not None:
            pulumi.set(__self__, "retrieval_importance", retrieval_importance)
        if schema_sources is not None:
            pulumi.set(__self__, "schema_sources", schema_sources)
        if text_type_options is not None:
            pulumi.set(__self__, "text_type_options", text_type_options)
        if timestamp_type_options is not None:
            pulumi.set(__self__, "timestamp_type_options", timestamp_type_options)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the metadata property.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="dateTimeTypeOptions")
    def date_time_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptions']:
        """
        Date time property. Not supported by CMEK compliant deployment.
        """
        return pulumi.get(self, "date_time_type_options")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[str]:
        """
        The display-name for the property, used for front-end.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="enumTypeOptions")
    def enum_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions']:
        """
        Enum/categorical property.
        Structure is documented below.
        """
        return pulumi.get(self, "enum_type_options")

    @property
    @pulumi.getter(name="floatTypeOptions")
    def float_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptions']:
        """
        Float property.
        """
        return pulumi.get(self, "float_type_options")

    @property
    @pulumi.getter(name="integerTypeOptions")
    def integer_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptions']:
        """
        Integer property.
        """
        return pulumi.get(self, "integer_type_options")

    @property
    @pulumi.getter(name="isFilterable")
    def is_filterable(self) -> Optional[bool]:
        """
        Whether the property can be filtered. If this is a sub-property, all the parent properties must be marked filterable.
        """
        return pulumi.get(self, "is_filterable")

    @property
    @pulumi.getter(name="isMetadata")
    def is_metadata(self) -> Optional[bool]:
        """
        Whether the property is user supplied metadata.
        """
        return pulumi.get(self, "is_metadata")

    @property
    @pulumi.getter(name="isRepeatable")
    def is_repeatable(self) -> Optional[bool]:
        """
        Whether the property can have multiple values.
        """
        return pulumi.get(self, "is_repeatable")

    @property
    @pulumi.getter(name="isRequired")
    def is_required(self) -> Optional[bool]:
        """
        Whether the property is mandatory.
        """
        return pulumi.get(self, "is_required")

    @property
    @pulumi.getter(name="isSearchable")
    def is_searchable(self) -> Optional[bool]:
        """
        Indicates that the property should be included in a global search.
        """
        return pulumi.get(self, "is_searchable")

    @property
    @pulumi.getter(name="mapTypeOptions")
    def map_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptions']:
        """
        Map property.
        """
        return pulumi.get(self, "map_type_options")

    @property
    @pulumi.getter(name="retrievalImportance")
    def retrieval_importance(self) -> Optional[str]:
        """
        Stores the retrieval importance.
        Possible values are: `HIGHEST`, `HIGHER`, `HIGH`, `MEDIUM`, `LOW`, `LOWEST`.
        """
        return pulumi.get(self, "retrieval_importance")

    @property
    @pulumi.getter(name="schemaSources")
    def schema_sources(self) -> Optional[Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource']]:
        """
        The schema source information.
        Structure is documented below.
        """
        return pulumi.get(self, "schema_sources")

    @property
    @pulumi.getter(name="textTypeOptions")
    def text_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptions']:
        """
        Text property.
        """
        return pulumi.get(self, "text_type_options")

    @property
    @pulumi.getter(name="timestampTypeOptions")
    def timestamp_type_options(self) -> Optional['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptions']:
        """
        Timestamp property. Not supported by CMEK compliant deployment.
        """
        return pulumi.get(self, "timestamp_type_options")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "possibleValues":
            suggest = "possible_values"
        elif key == "validationCheckDisabled":
            suggest = "validation_check_disabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptions.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 possible_values: Sequence[str],
                 validation_check_disabled: Optional[bool] = None):
        """
        :param Sequence[str] possible_values: List of possible enum values.
        :param bool validation_check_disabled: Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.
               
               - - -
        """
        pulumi.set(__self__, "possible_values", possible_values)
        if validation_check_disabled is not None:
            pulumi.set(__self__, "validation_check_disabled", validation_check_disabled)

    @property
    @pulumi.getter(name="possibleValues")
    def possible_values(self) -> Sequence[str]:
        """
        List of possible enum values.
        """
        return pulumi.get(self, "possible_values")

    @property
    @pulumi.getter(name="validationCheckDisabled")
    def validation_check_disabled(self) -> Optional[bool]:
        """
        Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.

        - - -
        """
        return pulumi.get(self, "validation_check_disabled")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "processorType":
            suggest = "processor_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: Optional[str] = None,
                 processor_type: Optional[str] = None):
        """
        :param str name: The schema name in the source.
        :param str processor_type: The Doc AI processor type name.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if processor_type is not None:
            pulumi.set(__self__, "processor_type", processor_type)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The schema name in the source.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="processorType")
    def processor_type(self) -> Optional[str]:
        """
        The Doc AI processor type name.
        """
        return pulumi.get(self, "processor_type")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "processorType":
            suggest = "processor_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: Optional[str] = None,
                 processor_type: Optional[str] = None):
        """
        :param str name: The schema name in the source.
        :param str processor_type: The Doc AI processor type name.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if processor_type is not None:
            pulumi.set(__self__, "processor_type", processor_type)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The schema name in the source.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="processorType")
    def processor_type(self) -> Optional[str]:
        """
        The Doc AI processor type name.
        """
        return pulumi.get(self, "processor_type")


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptions(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptions(dict):
    def __init__(__self__):
        pass

