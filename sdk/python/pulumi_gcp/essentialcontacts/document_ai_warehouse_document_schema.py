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
from ._inputs import *

__all__ = ['DocumentAiWarehouseDocumentSchemaArgs', 'DocumentAiWarehouseDocumentSchema']

@pulumi.input_type
class DocumentAiWarehouseDocumentSchemaArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[_builtins.str],
                 location: pulumi.Input[_builtins.str],
                 project_number: pulumi.Input[_builtins.str],
                 property_definitions: pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]],
                 document_is_folder: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a DocumentAiWarehouseDocumentSchema resource.
        :param pulumi.Input[_builtins.str] display_name: Name of the schema given by the user.
        :param pulumi.Input[_builtins.str] location: The location of the resource.
        :param pulumi.Input[_builtins.str] project_number: The unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]] property_definitions: Defines the metadata for a schema property.
               Structure is documented below.
        :param pulumi.Input[_builtins.bool] document_is_folder: Tells whether the document is a folder or a typical document.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "project_number", project_number)
        pulumi.set(__self__, "property_definitions", property_definitions)
        if document_is_folder is not None:
            pulumi.set(__self__, "document_is_folder", document_is_folder)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        Name of the schema given by the user.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        The location of the resource.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> pulumi.Input[_builtins.str]:
        """
        The unique identifier of the project.
        """
        return pulumi.get(self, "project_number")

    @project_number.setter
    def project_number(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project_number", value)

    @_builtins.property
    @pulumi.getter(name="propertyDefinitions")
    def property_definitions(self) -> pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]]:
        """
        Defines the metadata for a schema property.
        Structure is documented below.
        """
        return pulumi.get(self, "property_definitions")

    @property_definitions.setter
    def property_definitions(self, value: pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]]):
        pulumi.set(self, "property_definitions", value)

    @_builtins.property
    @pulumi.getter(name="documentIsFolder")
    def document_is_folder(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Tells whether the document is a folder or a typical document.
        """
        return pulumi.get(self, "document_is_folder")

    @document_is_folder.setter
    def document_is_folder(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "document_is_folder", value)


@pulumi.input_type
class _DocumentAiWarehouseDocumentSchemaState:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 document_is_folder: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project_number: Optional[pulumi.Input[_builtins.str]] = None,
                 property_definitions: Optional[pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]]] = None):
        """
        Input properties used for looking up and filtering DocumentAiWarehouseDocumentSchema resources.
        :param pulumi.Input[_builtins.str] display_name: Name of the schema given by the user.
        :param pulumi.Input[_builtins.bool] document_is_folder: Tells whether the document is a folder or a typical document.
        :param pulumi.Input[_builtins.str] location: The location of the resource.
        :param pulumi.Input[_builtins.str] name: The resource name of the document schema.
        :param pulumi.Input[_builtins.str] project_number: The unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]] property_definitions: Defines the metadata for a schema property.
               Structure is documented below.
        """
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if document_is_folder is not None:
            pulumi.set(__self__, "document_is_folder", document_is_folder)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_number is not None:
            pulumi.set(__self__, "project_number", project_number)
        if property_definitions is not None:
            pulumi.set(__self__, "property_definitions", property_definitions)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the schema given by the user.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="documentIsFolder")
    def document_is_folder(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Tells whether the document is a folder or a typical document.
        """
        return pulumi.get(self, "document_is_folder")

    @document_is_folder.setter
    def document_is_folder(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "document_is_folder", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the resource.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name of the document schema.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique identifier of the project.
        """
        return pulumi.get(self, "project_number")

    @project_number.setter
    def project_number(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_number", value)

    @_builtins.property
    @pulumi.getter(name="propertyDefinitions")
    def property_definitions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]]]:
        """
        Defines the metadata for a schema property.
        Structure is documented below.
        """
        return pulumi.get(self, "property_definitions")

    @property_definitions.setter
    def property_definitions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs']]]]):
        pulumi.set(self, "property_definitions", value)


@pulumi.type_token("gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema")
class DocumentAiWarehouseDocumentSchema(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 document_is_folder: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 project_number: Optional[pulumi.Input[_builtins.str]] = None,
                 property_definitions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs', 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgsDict']]]]] = None,
                 __props__=None):
        """
        A document schema is used to define document structure.

        To get more information about DocumentSchema, see:

        * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations.documentSchemas)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/document-warehouse/docs/manage-document-schemas)

        ## Example Usage

        ### Document Ai Warehouse Document Schema Text

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example_text = gcp.essentialcontacts.DocumentAiWarehouseDocumentSchema("example_text",
            project_number=project.number,
            display_name="test-property-text",
            location="us",
            document_is_folder=False,
            property_definitions=[{
                "name": "prop3",
                "display_name": "propdisp3",
                "is_repeatable": False,
                "is_filterable": True,
                "is_searchable": True,
                "is_metadata": False,
                "is_required": False,
                "retrieval_importance": "HIGHEST",
                "schema_sources": [{
                    "name": "dummy_source",
                    "processor_type": "dummy_processor",
                }],
                "text_type_options": {},
            }])
        ```

        ## Import

        DocumentSchema can be imported using any of these accepted formats:

        * `projects/{{project_number}}/locations/{{location}}/documentSchemas/{{name}}`

        * `{{project_number}}/{{location}}/{{name}}`

        When using the `pulumi import` command, DocumentSchema can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema default projects/{{project_number}}/locations/{{location}}/documentSchemas/{{name}}
        ```

        ```sh
        $ pulumi import gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema default {{project_number}}/{{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: Name of the schema given by the user.
        :param pulumi.Input[_builtins.bool] document_is_folder: Tells whether the document is a folder or a typical document.
        :param pulumi.Input[_builtins.str] location: The location of the resource.
        :param pulumi.Input[_builtins.str] project_number: The unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs', 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgsDict']]]] property_definitions: Defines the metadata for a schema property.
               Structure is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DocumentAiWarehouseDocumentSchemaArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A document schema is used to define document structure.

        To get more information about DocumentSchema, see:

        * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations.documentSchemas)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/document-warehouse/docs/manage-document-schemas)

        ## Example Usage

        ### Document Ai Warehouse Document Schema Text

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example_text = gcp.essentialcontacts.DocumentAiWarehouseDocumentSchema("example_text",
            project_number=project.number,
            display_name="test-property-text",
            location="us",
            document_is_folder=False,
            property_definitions=[{
                "name": "prop3",
                "display_name": "propdisp3",
                "is_repeatable": False,
                "is_filterable": True,
                "is_searchable": True,
                "is_metadata": False,
                "is_required": False,
                "retrieval_importance": "HIGHEST",
                "schema_sources": [{
                    "name": "dummy_source",
                    "processor_type": "dummy_processor",
                }],
                "text_type_options": {},
            }])
        ```

        ## Import

        DocumentSchema can be imported using any of these accepted formats:

        * `projects/{{project_number}}/locations/{{location}}/documentSchemas/{{name}}`

        * `{{project_number}}/{{location}}/{{name}}`

        When using the `pulumi import` command, DocumentSchema can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema default projects/{{project_number}}/locations/{{location}}/documentSchemas/{{name}}
        ```

        ```sh
        $ pulumi import gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema default {{project_number}}/{{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param DocumentAiWarehouseDocumentSchemaArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DocumentAiWarehouseDocumentSchemaArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 document_is_folder: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 project_number: Optional[pulumi.Input[_builtins.str]] = None,
                 property_definitions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs', 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DocumentAiWarehouseDocumentSchemaArgs.__new__(DocumentAiWarehouseDocumentSchemaArgs)

            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["document_is_folder"] = document_is_folder
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            if project_number is None and not opts.urn:
                raise TypeError("Missing required property 'project_number'")
            __props__.__dict__["project_number"] = project_number
            if property_definitions is None and not opts.urn:
                raise TypeError("Missing required property 'property_definitions'")
            __props__.__dict__["property_definitions"] = property_definitions
            __props__.__dict__["name"] = None
        super(DocumentAiWarehouseDocumentSchema, __self__).__init__(
            'gcp:essentialcontacts/documentAiWarehouseDocumentSchema:DocumentAiWarehouseDocumentSchema',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            document_is_folder: Optional[pulumi.Input[_builtins.bool]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project_number: Optional[pulumi.Input[_builtins.str]] = None,
            property_definitions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs', 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgsDict']]]]] = None) -> 'DocumentAiWarehouseDocumentSchema':
        """
        Get an existing DocumentAiWarehouseDocumentSchema resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: Name of the schema given by the user.
        :param pulumi.Input[_builtins.bool] document_is_folder: Tells whether the document is a folder or a typical document.
        :param pulumi.Input[_builtins.str] location: The location of the resource.
        :param pulumi.Input[_builtins.str] name: The resource name of the document schema.
        :param pulumi.Input[_builtins.str] project_number: The unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs', 'DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgsDict']]]] property_definitions: Defines the metadata for a schema property.
               Structure is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DocumentAiWarehouseDocumentSchemaState.__new__(_DocumentAiWarehouseDocumentSchemaState)

        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["document_is_folder"] = document_is_folder
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["project_number"] = project_number
        __props__.__dict__["property_definitions"] = property_definitions
        return DocumentAiWarehouseDocumentSchema(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the schema given by the user.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="documentIsFolder")
    def document_is_folder(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Tells whether the document is a folder or a typical document.
        """
        return pulumi.get(self, "document_is_folder")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location of the resource.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The resource name of the document schema.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> pulumi.Output[_builtins.str]:
        """
        The unique identifier of the project.
        """
        return pulumi.get(self, "project_number")

    @_builtins.property
    @pulumi.getter(name="propertyDefinitions")
    def property_definitions(self) -> pulumi.Output[Sequence['outputs.DocumentAiWarehouseDocumentSchemaPropertyDefinition']]:
        """
        Defines the metadata for a schema property.
        Structure is documented below.
        """
        return pulumi.get(self, "property_definitions")

