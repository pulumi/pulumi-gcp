# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DocumentAiWarehouseLocationArgs', 'DocumentAiWarehouseLocation']

@pulumi.input_type
class DocumentAiWarehouseLocationArgs:
    def __init__(__self__, *,
                 access_control_mode: pulumi.Input[str],
                 database_type: pulumi.Input[str],
                 location: pulumi.Input[str],
                 project_number: pulumi.Input[str],
                 document_creator_default_role: Optional[pulumi.Input[str]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DocumentAiWarehouseLocation resource.
        :param pulumi.Input[str] access_control_mode: The access control mode for accessing the customer data.
               Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        :param pulumi.Input[str] database_type: The type of database used to store customer data.
               Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        :param pulumi.Input[str] location: The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.
               
               
               - - -
        :param pulumi.Input[str] project_number: The unique identifier of the project.
        :param pulumi.Input[str] document_creator_default_role: The default role for the person who create a document.
               Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        :param pulumi.Input[str] kms_key: The KMS key used for CMEK encryption. It is required that
               the kms key is in the same region as the endpoint. The
               same key will be used for all provisioned resources, if
               encryption is available. If the kmsKey is left empty, no
               encryption will be enforced.
        """
        pulumi.set(__self__, "access_control_mode", access_control_mode)
        pulumi.set(__self__, "database_type", database_type)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "project_number", project_number)
        if document_creator_default_role is not None:
            pulumi.set(__self__, "document_creator_default_role", document_creator_default_role)
        if kms_key is not None:
            pulumi.set(__self__, "kms_key", kms_key)

    @property
    @pulumi.getter(name="accessControlMode")
    def access_control_mode(self) -> pulumi.Input[str]:
        """
        The access control mode for accessing the customer data.
        Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        """
        return pulumi.get(self, "access_control_mode")

    @access_control_mode.setter
    def access_control_mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_control_mode", value)

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> pulumi.Input[str]:
        """
        The type of database used to store customer data.
        Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        """
        return pulumi.get(self, "database_type")

    @database_type.setter
    def database_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_type", value)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.


        - - -
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> pulumi.Input[str]:
        """
        The unique identifier of the project.
        """
        return pulumi.get(self, "project_number")

    @project_number.setter
    def project_number(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_number", value)

    @property
    @pulumi.getter(name="documentCreatorDefaultRole")
    def document_creator_default_role(self) -> Optional[pulumi.Input[str]]:
        """
        The default role for the person who create a document.
        Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        """
        return pulumi.get(self, "document_creator_default_role")

    @document_creator_default_role.setter
    def document_creator_default_role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "document_creator_default_role", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> Optional[pulumi.Input[str]]:
        """
        The KMS key used for CMEK encryption. It is required that
        the kms key is in the same region as the endpoint. The
        same key will be used for all provisioned resources, if
        encryption is available. If the kmsKey is left empty, no
        encryption will be enforced.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key", value)


@pulumi.input_type
class _DocumentAiWarehouseLocationState:
    def __init__(__self__, *,
                 access_control_mode: Optional[pulumi.Input[str]] = None,
                 database_type: Optional[pulumi.Input[str]] = None,
                 document_creator_default_role: Optional[pulumi.Input[str]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 project_number: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DocumentAiWarehouseLocation resources.
        :param pulumi.Input[str] access_control_mode: The access control mode for accessing the customer data.
               Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        :param pulumi.Input[str] database_type: The type of database used to store customer data.
               Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        :param pulumi.Input[str] document_creator_default_role: The default role for the person who create a document.
               Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        :param pulumi.Input[str] kms_key: The KMS key used for CMEK encryption. It is required that
               the kms key is in the same region as the endpoint. The
               same key will be used for all provisioned resources, if
               encryption is available. If the kmsKey is left empty, no
               encryption will be enforced.
        :param pulumi.Input[str] location: The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.
               
               
               - - -
        :param pulumi.Input[str] project_number: The unique identifier of the project.
        """
        if access_control_mode is not None:
            pulumi.set(__self__, "access_control_mode", access_control_mode)
        if database_type is not None:
            pulumi.set(__self__, "database_type", database_type)
        if document_creator_default_role is not None:
            pulumi.set(__self__, "document_creator_default_role", document_creator_default_role)
        if kms_key is not None:
            pulumi.set(__self__, "kms_key", kms_key)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if project_number is not None:
            pulumi.set(__self__, "project_number", project_number)

    @property
    @pulumi.getter(name="accessControlMode")
    def access_control_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The access control mode for accessing the customer data.
        Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        """
        return pulumi.get(self, "access_control_mode")

    @access_control_mode.setter
    def access_control_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_control_mode", value)

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of database used to store customer data.
        Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        """
        return pulumi.get(self, "database_type")

    @database_type.setter
    def database_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database_type", value)

    @property
    @pulumi.getter(name="documentCreatorDefaultRole")
    def document_creator_default_role(self) -> Optional[pulumi.Input[str]]:
        """
        The default role for the person who create a document.
        Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        """
        return pulumi.get(self, "document_creator_default_role")

    @document_creator_default_role.setter
    def document_creator_default_role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "document_creator_default_role", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> Optional[pulumi.Input[str]]:
        """
        The KMS key used for CMEK encryption. It is required that
        the kms key is in the same region as the endpoint. The
        same key will be used for all provisioned resources, if
        encryption is available. If the kmsKey is left empty, no
        encryption will be enforced.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.


        - - -
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the project.
        """
        return pulumi.get(self, "project_number")

    @project_number.setter
    def project_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_number", value)


class DocumentAiWarehouseLocation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_control_mode: Optional[pulumi.Input[str]] = None,
                 database_type: Optional[pulumi.Input[str]] = None,
                 document_creator_default_role: Optional[pulumi.Input[str]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 project_number: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A location is used to initialize a project.

        To get more information about Location, see:

        * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/document-warehouse/docs/overview)

        ## Example Usage
        ### Document Ai Warehouse Location

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.essentialcontacts.DocumentAiWarehouseLocation("example",
            location="us",
            project_number=project.number,
            access_control_mode="ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI",
            database_type="DB_INFRA_SPANNER",
            kms_key="dummy_key",
            document_creator_default_role="DOCUMENT_ADMIN")
        ```

        ## Import

        This resource does not support import.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_control_mode: The access control mode for accessing the customer data.
               Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        :param pulumi.Input[str] database_type: The type of database used to store customer data.
               Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        :param pulumi.Input[str] document_creator_default_role: The default role for the person who create a document.
               Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        :param pulumi.Input[str] kms_key: The KMS key used for CMEK encryption. It is required that
               the kms key is in the same region as the endpoint. The
               same key will be used for all provisioned resources, if
               encryption is available. If the kmsKey is left empty, no
               encryption will be enforced.
        :param pulumi.Input[str] location: The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.
               
               
               - - -
        :param pulumi.Input[str] project_number: The unique identifier of the project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DocumentAiWarehouseLocationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A location is used to initialize a project.

        To get more information about Location, see:

        * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/document-warehouse/docs/overview)

        ## Example Usage
        ### Document Ai Warehouse Location

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.essentialcontacts.DocumentAiWarehouseLocation("example",
            location="us",
            project_number=project.number,
            access_control_mode="ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI",
            database_type="DB_INFRA_SPANNER",
            kms_key="dummy_key",
            document_creator_default_role="DOCUMENT_ADMIN")
        ```

        ## Import

        This resource does not support import.

        :param str resource_name: The name of the resource.
        :param DocumentAiWarehouseLocationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DocumentAiWarehouseLocationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_control_mode: Optional[pulumi.Input[str]] = None,
                 database_type: Optional[pulumi.Input[str]] = None,
                 document_creator_default_role: Optional[pulumi.Input[str]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 project_number: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DocumentAiWarehouseLocationArgs.__new__(DocumentAiWarehouseLocationArgs)

            if access_control_mode is None and not opts.urn:
                raise TypeError("Missing required property 'access_control_mode'")
            __props__.__dict__["access_control_mode"] = access_control_mode
            if database_type is None and not opts.urn:
                raise TypeError("Missing required property 'database_type'")
            __props__.__dict__["database_type"] = database_type
            __props__.__dict__["document_creator_default_role"] = document_creator_default_role
            __props__.__dict__["kms_key"] = kms_key
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            if project_number is None and not opts.urn:
                raise TypeError("Missing required property 'project_number'")
            __props__.__dict__["project_number"] = project_number
        super(DocumentAiWarehouseLocation, __self__).__init__(
            'gcp:essentialcontacts/documentAiWarehouseLocation:DocumentAiWarehouseLocation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_control_mode: Optional[pulumi.Input[str]] = None,
            database_type: Optional[pulumi.Input[str]] = None,
            document_creator_default_role: Optional[pulumi.Input[str]] = None,
            kms_key: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            project_number: Optional[pulumi.Input[str]] = None) -> 'DocumentAiWarehouseLocation':
        """
        Get an existing DocumentAiWarehouseLocation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_control_mode: The access control mode for accessing the customer data.
               Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        :param pulumi.Input[str] database_type: The type of database used to store customer data.
               Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        :param pulumi.Input[str] document_creator_default_role: The default role for the person who create a document.
               Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        :param pulumi.Input[str] kms_key: The KMS key used for CMEK encryption. It is required that
               the kms key is in the same region as the endpoint. The
               same key will be used for all provisioned resources, if
               encryption is available. If the kmsKey is left empty, no
               encryption will be enforced.
        :param pulumi.Input[str] location: The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.
               
               
               - - -
        :param pulumi.Input[str] project_number: The unique identifier of the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DocumentAiWarehouseLocationState.__new__(_DocumentAiWarehouseLocationState)

        __props__.__dict__["access_control_mode"] = access_control_mode
        __props__.__dict__["database_type"] = database_type
        __props__.__dict__["document_creator_default_role"] = document_creator_default_role
        __props__.__dict__["kms_key"] = kms_key
        __props__.__dict__["location"] = location
        __props__.__dict__["project_number"] = project_number
        return DocumentAiWarehouseLocation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessControlMode")
    def access_control_mode(self) -> pulumi.Output[str]:
        """
        The access control mode for accessing the customer data.
        Possible values are: `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI`, `ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID`, `ACL_MODE_UNIVERSAL_ACCESS`.
        """
        return pulumi.get(self, "access_control_mode")

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> pulumi.Output[str]:
        """
        The type of database used to store customer data.
        Possible values are: `DB_INFRA_SPANNER`, `DB_CLOUD_SQL_POSTGRES`.
        """
        return pulumi.get(self, "database_type")

    @property
    @pulumi.getter(name="documentCreatorDefaultRole")
    def document_creator_default_role(self) -> pulumi.Output[Optional[str]]:
        """
        The default role for the person who create a document.
        Possible values are: `DOCUMENT_ADMIN`, `DOCUMENT_EDITOR`, `DOCUMENT_VIEWER`.
        """
        return pulumi.get(self, "document_creator_default_role")

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> pulumi.Output[Optional[str]]:
        """
        The KMS key used for CMEK encryption. It is required that
        the kms key is in the same region as the endpoint. The
        same key will be used for all provisioned resources, if
        encryption is available. If the kmsKey is left empty, no
        encryption will be enforced.
        """
        return pulumi.get(self, "kms_key")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location in which the instance is to be provisioned. It takes the form projects/{projectNumber}/locations/{location}.


        - - -
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> pulumi.Output[str]:
        """
        The unique identifier of the project.
        """
        return pulumi.get(self, "project_number")
