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
from ._inputs import *

__all__ = ['AppConnectionArgs', 'AppConnection']

@pulumi.input_type
class AppConnectionArgs:
    def __init__(__self__, *,
                 application_endpoint: pulumi.Input['AppConnectionApplicationEndpointArgs'],
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input['AppConnectionGatewayArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AppConnection resource.
        :param pulumi.Input['AppConnectionApplicationEndpointArgs'] application_endpoint: Address of the remote application endpoint for the BeyondCorp AppConnection.
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connectors: List of AppConnectors that are authorised to be associated with this AppConnection
        :param pulumi.Input[str] display_name: An arbitrary user-provided name for the AppConnection.
        :param pulumi.Input['AppConnectionGatewayArgs'] gateway: Gateway used by the AppConnection.
               Structure is documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user provided metadata.
        :param pulumi.Input[str] name: ID of the AppConnection.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The region of the AppConnection.
        :param pulumi.Input[str] type: The type of network connectivity used by the AppConnection. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
               for a list of possible values.
               (Optional)
               The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        """
        pulumi.set(__self__, "application_endpoint", application_endpoint)
        if connectors is not None:
            pulumi.set(__self__, "connectors", connectors)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="applicationEndpoint")
    def application_endpoint(self) -> pulumi.Input['AppConnectionApplicationEndpointArgs']:
        """
        Address of the remote application endpoint for the BeyondCorp AppConnection.
        Structure is documented below.
        """
        return pulumi.get(self, "application_endpoint")

    @application_endpoint.setter
    def application_endpoint(self, value: pulumi.Input['AppConnectionApplicationEndpointArgs']):
        pulumi.set(self, "application_endpoint", value)

    @property
    @pulumi.getter
    def connectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of AppConnectors that are authorised to be associated with this AppConnection
        """
        return pulumi.get(self, "connectors")

    @connectors.setter
    def connectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "connectors", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        An arbitrary user-provided name for the AppConnection.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input['AppConnectionGatewayArgs']]:
        """
        Gateway used by the AppConnection.
        Structure is documented below.
        """
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input['AppConnectionGatewayArgs']]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Resource labels to represent user provided metadata.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the AppConnection.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region of the AppConnection.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of network connectivity used by the AppConnection. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
        for a list of possible values.
        (Optional)
        The type of hosting used by the gateway. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
        for a list of possible values.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _AppConnectionState:
    def __init__(__self__, *,
                 application_endpoint: Optional[pulumi.Input['AppConnectionApplicationEndpointArgs']] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input['AppConnectionGatewayArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AppConnection resources.
        :param pulumi.Input['AppConnectionApplicationEndpointArgs'] application_endpoint: Address of the remote application endpoint for the BeyondCorp AppConnection.
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connectors: List of AppConnectors that are authorised to be associated with this AppConnection
        :param pulumi.Input[str] display_name: An arbitrary user-provided name for the AppConnection.
        :param pulumi.Input['AppConnectionGatewayArgs'] gateway: Gateway used by the AppConnection.
               Structure is documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user provided metadata.
        :param pulumi.Input[str] name: ID of the AppConnection.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The region of the AppConnection.
        :param pulumi.Input[str] type: The type of network connectivity used by the AppConnection. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
               for a list of possible values.
               (Optional)
               The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        """
        if application_endpoint is not None:
            pulumi.set(__self__, "application_endpoint", application_endpoint)
        if connectors is not None:
            pulumi.set(__self__, "connectors", connectors)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="applicationEndpoint")
    def application_endpoint(self) -> Optional[pulumi.Input['AppConnectionApplicationEndpointArgs']]:
        """
        Address of the remote application endpoint for the BeyondCorp AppConnection.
        Structure is documented below.
        """
        return pulumi.get(self, "application_endpoint")

    @application_endpoint.setter
    def application_endpoint(self, value: Optional[pulumi.Input['AppConnectionApplicationEndpointArgs']]):
        pulumi.set(self, "application_endpoint", value)

    @property
    @pulumi.getter
    def connectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of AppConnectors that are authorised to be associated with this AppConnection
        """
        return pulumi.get(self, "connectors")

    @connectors.setter
    def connectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "connectors", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        An arbitrary user-provided name for the AppConnection.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input['AppConnectionGatewayArgs']]:
        """
        Gateway used by the AppConnection.
        Structure is documented below.
        """
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input['AppConnectionGatewayArgs']]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Resource labels to represent user provided metadata.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the AppConnection.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region of the AppConnection.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of network connectivity used by the AppConnection. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
        for a list of possible values.
        (Optional)
        The type of hosting used by the gateway. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
        for a list of possible values.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AppConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_endpoint: Optional[pulumi.Input[pulumi.InputType['AppConnectionApplicationEndpointArgs']]] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[pulumi.InputType['AppConnectionGatewayArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A BeyondCorp AppConnection resource represents a BeyondCorp protected AppConnection to a remote application.
        It creates all the necessary GCP components needed for creating a BeyondCorp protected AppConnection.
        Multiple connectors can be authorised for a single AppConnection.

        To get more information about AppConnection, see:

        * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnections)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)

        ## Example Usage
        ### Beyondcorp App Connection Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.service_account.Account("serviceAccount",
            account_id="my-account",
            display_name="Test Service Account")
        app_connector = gcp.beyondcorp.AppConnector("appConnector", principal_info=gcp.beyondcorp.AppConnectorPrincipalInfoArgs(
            service_account=gcp.beyondcorp.AppConnectorPrincipalInfoServiceAccountArgs(
                email=service_account.email,
            ),
        ))
        app_connection = gcp.beyondcorp.AppConnection("appConnection",
            type="TCP_PROXY",
            application_endpoint=gcp.beyondcorp.AppConnectionApplicationEndpointArgs(
                host="foo-host",
                port=8080,
            ),
            connectors=[app_connector.id])
        ```

        ## Import

        AppConnection can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default projects/{{project}}/locations/{{region}}/appConnections/{{name}}
        ```

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{project}}/{{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AppConnectionApplicationEndpointArgs']] application_endpoint: Address of the remote application endpoint for the BeyondCorp AppConnection.
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connectors: List of AppConnectors that are authorised to be associated with this AppConnection
        :param pulumi.Input[str] display_name: An arbitrary user-provided name for the AppConnection.
        :param pulumi.Input[pulumi.InputType['AppConnectionGatewayArgs']] gateway: Gateway used by the AppConnection.
               Structure is documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user provided metadata.
        :param pulumi.Input[str] name: ID of the AppConnection.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The region of the AppConnection.
        :param pulumi.Input[str] type: The type of network connectivity used by the AppConnection. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
               for a list of possible values.
               (Optional)
               The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A BeyondCorp AppConnection resource represents a BeyondCorp protected AppConnection to a remote application.
        It creates all the necessary GCP components needed for creating a BeyondCorp protected AppConnection.
        Multiple connectors can be authorised for a single AppConnection.

        To get more information about AppConnection, see:

        * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnections)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)

        ## Example Usage
        ### Beyondcorp App Connection Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.service_account.Account("serviceAccount",
            account_id="my-account",
            display_name="Test Service Account")
        app_connector = gcp.beyondcorp.AppConnector("appConnector", principal_info=gcp.beyondcorp.AppConnectorPrincipalInfoArgs(
            service_account=gcp.beyondcorp.AppConnectorPrincipalInfoServiceAccountArgs(
                email=service_account.email,
            ),
        ))
        app_connection = gcp.beyondcorp.AppConnection("appConnection",
            type="TCP_PROXY",
            application_endpoint=gcp.beyondcorp.AppConnectionApplicationEndpointArgs(
                host="foo-host",
                port=8080,
            ),
            connectors=[app_connector.id])
        ```

        ## Import

        AppConnection can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default projects/{{project}}/locations/{{region}}/appConnections/{{name}}
        ```

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{project}}/{{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param AppConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_endpoint: Optional[pulumi.Input[pulumi.InputType['AppConnectionApplicationEndpointArgs']]] = None,
                 connectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[pulumi.InputType['AppConnectionGatewayArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppConnectionArgs.__new__(AppConnectionArgs)

            if application_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'application_endpoint'")
            __props__.__dict__["application_endpoint"] = application_endpoint
            __props__.__dict__["connectors"] = connectors
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["gateway"] = gateway
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["type"] = type
        super(AppConnection, __self__).__init__(
            'gcp:beyondcorp/appConnection:AppConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_endpoint: Optional[pulumi.Input[pulumi.InputType['AppConnectionApplicationEndpointArgs']]] = None,
            connectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            gateway: Optional[pulumi.Input[pulumi.InputType['AppConnectionGatewayArgs']]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AppConnection':
        """
        Get an existing AppConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AppConnectionApplicationEndpointArgs']] application_endpoint: Address of the remote application endpoint for the BeyondCorp AppConnection.
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connectors: List of AppConnectors that are authorised to be associated with this AppConnection
        :param pulumi.Input[str] display_name: An arbitrary user-provided name for the AppConnection.
        :param pulumi.Input[pulumi.InputType['AppConnectionGatewayArgs']] gateway: Gateway used by the AppConnection.
               Structure is documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Resource labels to represent user provided metadata.
        :param pulumi.Input[str] name: ID of the AppConnection.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The region of the AppConnection.
        :param pulumi.Input[str] type: The type of network connectivity used by the AppConnection. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
               for a list of possible values.
               (Optional)
               The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppConnectionState.__new__(_AppConnectionState)

        __props__.__dict__["application_endpoint"] = application_endpoint
        __props__.__dict__["connectors"] = connectors
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["gateway"] = gateway
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["region"] = region
        __props__.__dict__["type"] = type
        return AppConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationEndpoint")
    def application_endpoint(self) -> pulumi.Output['outputs.AppConnectionApplicationEndpoint']:
        """
        Address of the remote application endpoint for the BeyondCorp AppConnection.
        Structure is documented below.
        """
        return pulumi.get(self, "application_endpoint")

    @property
    @pulumi.getter
    def connectors(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of AppConnectors that are authorised to be associated with this AppConnection
        """
        return pulumi.get(self, "connectors")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        An arbitrary user-provided name for the AppConnection.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output['outputs.AppConnectionGateway']:
        """
        Gateway used by the AppConnection.
        Structure is documented below.
        """
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Resource labels to represent user provided metadata.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        ID of the AppConnection.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        The region of the AppConnection.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of network connectivity used by the AppConnection. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
        for a list of possible values.
        (Optional)
        The type of hosting used by the gateway. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
        for a list of possible values.
        """
        return pulumi.get(self, "type")
