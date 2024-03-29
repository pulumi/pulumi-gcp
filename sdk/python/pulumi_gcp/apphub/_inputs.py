# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ApplicationAttributesArgs',
    'ApplicationAttributesBusinessOwnerArgs',
    'ApplicationAttributesCriticalityArgs',
    'ApplicationAttributesDeveloperOwnerArgs',
    'ApplicationAttributesEnvironmentArgs',
    'ApplicationAttributesOperatorOwnerArgs',
    'ApplicationScopeArgs',
    'ServiceAttributesArgs',
    'ServiceAttributesBusinessOwnerArgs',
    'ServiceAttributesCriticalityArgs',
    'ServiceAttributesDeveloperOwnerArgs',
    'ServiceAttributesEnvironmentArgs',
    'ServiceAttributesOperatorOwnerArgs',
    'ServiceServicePropertyArgs',
    'ServiceServiceReferenceArgs',
    'WorkloadAttributesArgs',
    'WorkloadAttributesBusinessOwnerArgs',
    'WorkloadAttributesCriticalityArgs',
    'WorkloadAttributesDeveloperOwnerArgs',
    'WorkloadAttributesEnvironmentArgs',
    'WorkloadAttributesOperatorOwnerArgs',
    'WorkloadWorkloadPropertyArgs',
    'WorkloadWorkloadReferenceArgs',
]

@pulumi.input_type
class ApplicationAttributesArgs:
    def __init__(__self__, *,
                 business_owners: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesBusinessOwnerArgs']]]] = None,
                 criticality: Optional[pulumi.Input['ApplicationAttributesCriticalityArgs']] = None,
                 developer_owners: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesDeveloperOwnerArgs']]]] = None,
                 environment: Optional[pulumi.Input['ApplicationAttributesEnvironmentArgs']] = None,
                 operator_owners: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesOperatorOwnerArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesBusinessOwnerArgs']]] business_owners: Optional. Business team that ensures user needs are met and value is delivered
               Structure is documented below.
        :param pulumi.Input['ApplicationAttributesCriticalityArgs'] criticality: Criticality of the Application, Service, or Workload
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesDeveloperOwnerArgs']]] developer_owners: Optional. Developer team that owns development and coding.
               Structure is documented below.
        :param pulumi.Input['ApplicationAttributesEnvironmentArgs'] environment: Environment of the Application, Service, or Workload
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesOperatorOwnerArgs']]] operator_owners: Optional. Operator team that ensures runtime and operations.
               Structure is documented below.
        """
        if business_owners is not None:
            pulumi.set(__self__, "business_owners", business_owners)
        if criticality is not None:
            pulumi.set(__self__, "criticality", criticality)
        if developer_owners is not None:
            pulumi.set(__self__, "developer_owners", developer_owners)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if operator_owners is not None:
            pulumi.set(__self__, "operator_owners", operator_owners)

    @property
    @pulumi.getter(name="businessOwners")
    def business_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesBusinessOwnerArgs']]]]:
        """
        Optional. Business team that ensures user needs are met and value is delivered
        Structure is documented below.
        """
        return pulumi.get(self, "business_owners")

    @business_owners.setter
    def business_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesBusinessOwnerArgs']]]]):
        pulumi.set(self, "business_owners", value)

    @property
    @pulumi.getter
    def criticality(self) -> Optional[pulumi.Input['ApplicationAttributesCriticalityArgs']]:
        """
        Criticality of the Application, Service, or Workload
        Structure is documented below.
        """
        return pulumi.get(self, "criticality")

    @criticality.setter
    def criticality(self, value: Optional[pulumi.Input['ApplicationAttributesCriticalityArgs']]):
        pulumi.set(self, "criticality", value)

    @property
    @pulumi.getter(name="developerOwners")
    def developer_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesDeveloperOwnerArgs']]]]:
        """
        Optional. Developer team that owns development and coding.
        Structure is documented below.
        """
        return pulumi.get(self, "developer_owners")

    @developer_owners.setter
    def developer_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesDeveloperOwnerArgs']]]]):
        pulumi.set(self, "developer_owners", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['ApplicationAttributesEnvironmentArgs']]:
        """
        Environment of the Application, Service, or Workload
        Structure is documented below.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['ApplicationAttributesEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="operatorOwners")
    def operator_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesOperatorOwnerArgs']]]]:
        """
        Optional. Operator team that ensures runtime and operations.
        Structure is documented below.
        """
        return pulumi.get(self, "operator_owners")

    @operator_owners.setter
    def operator_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationAttributesOperatorOwnerArgs']]]]):
        pulumi.set(self, "operator_owners", value)


@pulumi.input_type
class ApplicationAttributesBusinessOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Required. Email address of the contacts.
        :param pulumi.Input[str] display_name: Optional. Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Required. Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class ApplicationAttributesCriticalityArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Criticality type.
               Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Criticality type.
        Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ApplicationAttributesDeveloperOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Required. Email address of the contacts.
        :param pulumi.Input[str] display_name: Optional. Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Required. Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class ApplicationAttributesEnvironmentArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Environment type.
               Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Environment type.
        Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ApplicationAttributesOperatorOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Required. Email address of the contacts.
        :param pulumi.Input[str] display_name: Optional. Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Required. Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class ApplicationScopeArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Required. Scope Type.
               Possible values:
               REGIONAL
               Possible values are: `REGIONAL`.
               
               - - -
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Required. Scope Type.
        Possible values:
        REGIONAL
        Possible values are: `REGIONAL`.

        - - -
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ServiceAttributesArgs:
    def __init__(__self__, *,
                 business_owners: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesBusinessOwnerArgs']]]] = None,
                 criticality: Optional[pulumi.Input['ServiceAttributesCriticalityArgs']] = None,
                 developer_owners: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesDeveloperOwnerArgs']]]] = None,
                 environment: Optional[pulumi.Input['ServiceAttributesEnvironmentArgs']] = None,
                 operator_owners: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesOperatorOwnerArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['ServiceAttributesBusinessOwnerArgs']]] business_owners: Business team that ensures user needs are met and value is delivered
               Structure is documented below.
        :param pulumi.Input['ServiceAttributesCriticalityArgs'] criticality: Criticality of the Application, Service, or Workload
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceAttributesDeveloperOwnerArgs']]] developer_owners: Developer team that owns development and coding.
               Structure is documented below.
        :param pulumi.Input['ServiceAttributesEnvironmentArgs'] environment: Environment of the Application, Service, or Workload
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceAttributesOperatorOwnerArgs']]] operator_owners: Operator team that ensures runtime and operations.
               Structure is documented below.
        """
        if business_owners is not None:
            pulumi.set(__self__, "business_owners", business_owners)
        if criticality is not None:
            pulumi.set(__self__, "criticality", criticality)
        if developer_owners is not None:
            pulumi.set(__self__, "developer_owners", developer_owners)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if operator_owners is not None:
            pulumi.set(__self__, "operator_owners", operator_owners)

    @property
    @pulumi.getter(name="businessOwners")
    def business_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesBusinessOwnerArgs']]]]:
        """
        Business team that ensures user needs are met and value is delivered
        Structure is documented below.
        """
        return pulumi.get(self, "business_owners")

    @business_owners.setter
    def business_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesBusinessOwnerArgs']]]]):
        pulumi.set(self, "business_owners", value)

    @property
    @pulumi.getter
    def criticality(self) -> Optional[pulumi.Input['ServiceAttributesCriticalityArgs']]:
        """
        Criticality of the Application, Service, or Workload
        Structure is documented below.
        """
        return pulumi.get(self, "criticality")

    @criticality.setter
    def criticality(self, value: Optional[pulumi.Input['ServiceAttributesCriticalityArgs']]):
        pulumi.set(self, "criticality", value)

    @property
    @pulumi.getter(name="developerOwners")
    def developer_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesDeveloperOwnerArgs']]]]:
        """
        Developer team that owns development and coding.
        Structure is documented below.
        """
        return pulumi.get(self, "developer_owners")

    @developer_owners.setter
    def developer_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesDeveloperOwnerArgs']]]]):
        pulumi.set(self, "developer_owners", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['ServiceAttributesEnvironmentArgs']]:
        """
        Environment of the Application, Service, or Workload
        Structure is documented below.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['ServiceAttributesEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="operatorOwners")
    def operator_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesOperatorOwnerArgs']]]]:
        """
        Operator team that ensures runtime and operations.
        Structure is documented below.
        """
        return pulumi.get(self, "operator_owners")

    @operator_owners.setter
    def operator_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceAttributesOperatorOwnerArgs']]]]):
        pulumi.set(self, "operator_owners", value)


@pulumi.input_type
class ServiceAttributesBusinessOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Required. Email address of the contacts.
        :param pulumi.Input[str] display_name: Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Required. Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class ServiceAttributesCriticalityArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Criticality type.
               Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Criticality type.
        Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ServiceAttributesDeveloperOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Required. Email address of the contacts.
        :param pulumi.Input[str] display_name: Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Required. Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class ServiceAttributesEnvironmentArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Environment type.
               Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Environment type.
        Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ServiceAttributesOperatorOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Required. Email address of the contacts.
        :param pulumi.Input[str] display_name: Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Required. Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class ServiceServicePropertyArgs:
    def __init__(__self__, *,
                 gcp_project: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] gcp_project: (Output)
               Output only. The service project identifier that the underlying cloud resource resides in.
        :param pulumi.Input[str] location: Part of `parent`.  Full resource name of a parent Application. Example: projects/{HOST_PROJECT_ID}/locations/{LOCATION}/applications/{APPLICATION_ID}
        :param pulumi.Input[str] zone: (Output)
               Output only. The location that the underlying resource resides in if it is zonal, for example, us-west1-a).
        """
        if gcp_project is not None:
            pulumi.set(__self__, "gcp_project", gcp_project)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="gcpProject")
    def gcp_project(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Output only. The service project identifier that the underlying cloud resource resides in.
        """
        return pulumi.get(self, "gcp_project")

    @gcp_project.setter
    def gcp_project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gcp_project", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        Part of `parent`.  Full resource name of a parent Application. Example: projects/{HOST_PROJECT_ID}/locations/{LOCATION}/applications/{APPLICATION_ID}
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Output only. The location that the underlying resource resides in if it is zonal, for example, us-west1-a).
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class ServiceServiceReferenceArgs:
    def __init__(__self__, *,
                 uri: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] uri: (Output)
               Output only. The underlying resource URI (For example, URI of Forwarding Rule, URL Map,
               and Backend Service).
        """
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Output only. The underlying resource URI (For example, URI of Forwarding Rule, URL Map,
        and Backend Service).
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


@pulumi.input_type
class WorkloadAttributesArgs:
    def __init__(__self__, *,
                 business_owners: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesBusinessOwnerArgs']]]] = None,
                 criticality: Optional[pulumi.Input['WorkloadAttributesCriticalityArgs']] = None,
                 developer_owners: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesDeveloperOwnerArgs']]]] = None,
                 environment: Optional[pulumi.Input['WorkloadAttributesEnvironmentArgs']] = None,
                 operator_owners: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesOperatorOwnerArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesBusinessOwnerArgs']]] business_owners: Business team that ensures user needs are met and value is delivered
               Structure is documented below.
        :param pulumi.Input['WorkloadAttributesCriticalityArgs'] criticality: Criticality of the Application, Service, or Workload
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesDeveloperOwnerArgs']]] developer_owners: Developer team that owns development and coding.
               Structure is documented below.
        :param pulumi.Input['WorkloadAttributesEnvironmentArgs'] environment: Environment of the Application, Service, or Workload
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesOperatorOwnerArgs']]] operator_owners: Operator team that ensures runtime and operations.
               Structure is documented below.
        """
        if business_owners is not None:
            pulumi.set(__self__, "business_owners", business_owners)
        if criticality is not None:
            pulumi.set(__self__, "criticality", criticality)
        if developer_owners is not None:
            pulumi.set(__self__, "developer_owners", developer_owners)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if operator_owners is not None:
            pulumi.set(__self__, "operator_owners", operator_owners)

    @property
    @pulumi.getter(name="businessOwners")
    def business_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesBusinessOwnerArgs']]]]:
        """
        Business team that ensures user needs are met and value is delivered
        Structure is documented below.
        """
        return pulumi.get(self, "business_owners")

    @business_owners.setter
    def business_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesBusinessOwnerArgs']]]]):
        pulumi.set(self, "business_owners", value)

    @property
    @pulumi.getter
    def criticality(self) -> Optional[pulumi.Input['WorkloadAttributesCriticalityArgs']]:
        """
        Criticality of the Application, Service, or Workload
        Structure is documented below.
        """
        return pulumi.get(self, "criticality")

    @criticality.setter
    def criticality(self, value: Optional[pulumi.Input['WorkloadAttributesCriticalityArgs']]):
        pulumi.set(self, "criticality", value)

    @property
    @pulumi.getter(name="developerOwners")
    def developer_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesDeveloperOwnerArgs']]]]:
        """
        Developer team that owns development and coding.
        Structure is documented below.
        """
        return pulumi.get(self, "developer_owners")

    @developer_owners.setter
    def developer_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesDeveloperOwnerArgs']]]]):
        pulumi.set(self, "developer_owners", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['WorkloadAttributesEnvironmentArgs']]:
        """
        Environment of the Application, Service, or Workload
        Structure is documented below.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['WorkloadAttributesEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="operatorOwners")
    def operator_owners(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesOperatorOwnerArgs']]]]:
        """
        Operator team that ensures runtime and operations.
        Structure is documented below.
        """
        return pulumi.get(self, "operator_owners")

    @operator_owners.setter
    def operator_owners(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadAttributesOperatorOwnerArgs']]]]):
        pulumi.set(self, "operator_owners", value)


@pulumi.input_type
class WorkloadAttributesBusinessOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Email address of the contacts.
        :param pulumi.Input[str] display_name: Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class WorkloadAttributesCriticalityArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Criticality type.
               Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Criticality type.
        Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class WorkloadAttributesDeveloperOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Email address of the contacts.
        :param pulumi.Input[str] display_name: Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class WorkloadAttributesEnvironmentArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] type: Environment type.
               Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Environment type.
        Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class WorkloadAttributesOperatorOwnerArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] email: Email address of the contacts.
        :param pulumi.Input[str] display_name: Contact's name.
        """
        pulumi.set(__self__, "email", email)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Email address of the contacts.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Contact's name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class WorkloadWorkloadPropertyArgs:
    def __init__(__self__, *,
                 gcp_project: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] gcp_project: (Output)
               Output only. The service project identifier that the underlying cloud resource resides in. Empty for non cloud resources.
        :param pulumi.Input[str] location: Part of `parent`.  Full resource name of a parent Application. Example: projects/{HOST_PROJECT_ID}/locations/{LOCATION}/applications/{APPLICATION_ID}
        :param pulumi.Input[str] zone: (Output)
               Output only. The location that the underlying compute resource resides in if it is zonal (e.g us-west1-a).
        """
        if gcp_project is not None:
            pulumi.set(__self__, "gcp_project", gcp_project)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="gcpProject")
    def gcp_project(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Output only. The service project identifier that the underlying cloud resource resides in. Empty for non cloud resources.
        """
        return pulumi.get(self, "gcp_project")

    @gcp_project.setter
    def gcp_project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gcp_project", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        Part of `parent`.  Full resource name of a parent Application. Example: projects/{HOST_PROJECT_ID}/locations/{LOCATION}/applications/{APPLICATION_ID}
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Output only. The location that the underlying compute resource resides in if it is zonal (e.g us-west1-a).
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class WorkloadWorkloadReferenceArgs:
    def __init__(__self__, *,
                 uri: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] uri: (Output)
               Output only. The underlying compute resource uri.
        """
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        Output only. The underlying compute resource uri.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


