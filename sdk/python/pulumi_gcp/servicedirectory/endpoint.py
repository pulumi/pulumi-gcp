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

__all__ = ['EndpointArgs', 'Endpoint']

@pulumi.input_type
class EndpointArgs:
    def __init__(__self__, *,
                 endpoint_id: pulumi.Input[_builtins.str],
                 service: pulumi.Input[_builtins.str],
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a Endpoint resource.
        :param pulumi.Input[_builtins.str] endpoint_id: The Resource ID must be 1-63 characters long, including digits,
               lowercase letters or the hyphen character.
        :param pulumi.Input[_builtins.str] service: The resource name of the service that this endpoint provides.
        :param pulumi.Input[_builtins.str] address: IPv4 or IPv6 address of the endpoint.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata for the endpoint. This data can be consumed
               by service clients. The entire metadata dictionary may contain
               up to 512 characters, spread across all key-value pairs.
               Metadata that goes beyond any these limits will be rejected.
        :param pulumi.Input[_builtins.str] network: The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        :param pulumi.Input[_builtins.int] port: Port that the endpoint is running on, must be in the
               range of [0, 65535]. If unspecified, the default is 0.
        """
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        pulumi.set(__self__, "service", service)
        if address is not None:
            pulumi.set(__self__, "address", address)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @_builtins.property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Resource ID must be 1-63 characters long, including digits,
        lowercase letters or the hyphen character.
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "endpoint_id", value)

    @_builtins.property
    @pulumi.getter
    def service(self) -> pulumi.Input[_builtins.str]:
        """
        The resource name of the service that this endpoint provides.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "service", value)

    @_builtins.property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        IPv4 or IPv6 address of the endpoint.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "address", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Metadata for the endpoint. This data can be consumed
        by service clients. The entire metadata dictionary may contain
        up to 512 characters, spread across all key-value pairs.
        Metadata that goes beyond any these limits will be rejected.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network", value)

    @_builtins.property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Port that the endpoint is running on, must be in the
        range of [0, 65535]. If unspecified, the default is 0.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "port", value)


@pulumi.input_type
class _EndpointState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None,
                 service: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Endpoint resources.
        :param pulumi.Input[_builtins.str] address: IPv4 or IPv6 address of the endpoint.
        :param pulumi.Input[_builtins.str] endpoint_id: The Resource ID must be 1-63 characters long, including digits,
               lowercase letters or the hyphen character.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata for the endpoint. This data can be consumed
               by service clients. The entire metadata dictionary may contain
               up to 512 characters, spread across all key-value pairs.
               Metadata that goes beyond any these limits will be rejected.
        :param pulumi.Input[_builtins.str] name: The resource name for the endpoint in the format
               `projects/*/locations/*/namespaces/*/services/*/endpoints/*`.
        :param pulumi.Input[_builtins.str] network: The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        :param pulumi.Input[_builtins.int] port: Port that the endpoint is running on, must be in the
               range of [0, 65535]. If unspecified, the default is 0.
        :param pulumi.Input[_builtins.str] service: The resource name of the service that this endpoint provides.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if endpoint_id is not None:
            pulumi.set(__self__, "endpoint_id", endpoint_id)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if service is not None:
            pulumi.set(__self__, "service", service)

    @_builtins.property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        IPv4 or IPv6 address of the endpoint.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "address", value)

    @_builtins.property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Resource ID must be 1-63 characters long, including digits,
        lowercase letters or the hyphen character.
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "endpoint_id", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Metadata for the endpoint. This data can be consumed
        by service clients. The entire metadata dictionary may contain
        up to 512 characters, spread across all key-value pairs.
        Metadata that goes beyond any these limits will be rejected.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name for the endpoint in the format
        `projects/*/locations/*/namespaces/*/services/*/endpoints/*`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network", value)

    @_builtins.property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Port that the endpoint is running on, must be in the
        range of [0, 65535]. If unspecified, the default is 0.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "port", value)

    @_builtins.property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name of the service that this endpoint provides.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service", value)


@pulumi.type_token("gcp:servicedirectory/endpoint:Endpoint")
class Endpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None,
                 service: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        An individual endpoint that provides a service.

        To get more information about Endpoint, see:

        * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1beta1/projects.locations.namespaces.services.endpoints)
        * How-to Guides
            * [Configuring an endpoint](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_an_endpoint)

        ## Example Usage

        ### Service Directory Endpoint Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        example = gcp.servicedirectory.Namespace("example",
            namespace_id="example-namespace",
            location="us-central1")
        example_service = gcp.servicedirectory.Service("example",
            service_id="example-service",
            namespace=example.id)
        example_endpoint = gcp.servicedirectory.Endpoint("example",
            endpoint_id="example-endpoint",
            service=example_service.id,
            metadata={
                "stage": "prod",
                "region": "us-central1",
            },
            address="1.2.3.4",
            port=5353)
        ```
        ### Service Directory Endpoint With Network

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.compute.Network("example", name="example-network")
        example_namespace = gcp.servicedirectory.Namespace("example",
            namespace_id="example-namespace",
            location="us-central1")
        example_service = gcp.servicedirectory.Service("example",
            service_id="example-service",
            namespace=example_namespace.id)
        example_endpoint = gcp.servicedirectory.Endpoint("example",
            endpoint_id="example-endpoint",
            service=example_service.id,
            metadata={
                "stage": "prod",
                "region": "us-central1",
            },
            network=example.name.apply(lambda name: f"projects/{project.number}/locations/global/networks/{name}"),
            address="1.2.3.4",
            port=5353)
        ```

        ## Import

        Endpoint can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}/endpoints/{{endpoint_id}}`

        * `{{project}}/{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}`

        * `{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}`

        When using the `pulumi import` command, Endpoint can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:servicedirectory/endpoint:Endpoint default projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}/endpoints/{{endpoint_id}}
        ```

        ```sh
        $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{project}}/{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
        ```

        ```sh
        $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] address: IPv4 or IPv6 address of the endpoint.
        :param pulumi.Input[_builtins.str] endpoint_id: The Resource ID must be 1-63 characters long, including digits,
               lowercase letters or the hyphen character.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata for the endpoint. This data can be consumed
               by service clients. The entire metadata dictionary may contain
               up to 512 characters, spread across all key-value pairs.
               Metadata that goes beyond any these limits will be rejected.
        :param pulumi.Input[_builtins.str] network: The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        :param pulumi.Input[_builtins.int] port: Port that the endpoint is running on, must be in the
               range of [0, 65535]. If unspecified, the default is 0.
        :param pulumi.Input[_builtins.str] service: The resource name of the service that this endpoint provides.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An individual endpoint that provides a service.

        To get more information about Endpoint, see:

        * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1beta1/projects.locations.namespaces.services.endpoints)
        * How-to Guides
            * [Configuring an endpoint](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_an_endpoint)

        ## Example Usage

        ### Service Directory Endpoint Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        example = gcp.servicedirectory.Namespace("example",
            namespace_id="example-namespace",
            location="us-central1")
        example_service = gcp.servicedirectory.Service("example",
            service_id="example-service",
            namespace=example.id)
        example_endpoint = gcp.servicedirectory.Endpoint("example",
            endpoint_id="example-endpoint",
            service=example_service.id,
            metadata={
                "stage": "prod",
                "region": "us-central1",
            },
            address="1.2.3.4",
            port=5353)
        ```
        ### Service Directory Endpoint With Network

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.compute.Network("example", name="example-network")
        example_namespace = gcp.servicedirectory.Namespace("example",
            namespace_id="example-namespace",
            location="us-central1")
        example_service = gcp.servicedirectory.Service("example",
            service_id="example-service",
            namespace=example_namespace.id)
        example_endpoint = gcp.servicedirectory.Endpoint("example",
            endpoint_id="example-endpoint",
            service=example_service.id,
            metadata={
                "stage": "prod",
                "region": "us-central1",
            },
            network=example.name.apply(lambda name: f"projects/{project.number}/locations/global/networks/{name}"),
            address="1.2.3.4",
            port=5353)
        ```

        ## Import

        Endpoint can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}/endpoints/{{endpoint_id}}`

        * `{{project}}/{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}`

        * `{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}`

        When using the `pulumi import` command, Endpoint can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:servicedirectory/endpoint:Endpoint default projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}/endpoints/{{endpoint_id}}
        ```

        ```sh
        $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{project}}/{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
        ```

        ```sh
        $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
        ```

        :param str resource_name: The name of the resource.
        :param EndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_id: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 port: Optional[pulumi.Input[_builtins.int]] = None,
                 service: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EndpointArgs.__new__(EndpointArgs)

            __props__.__dict__["address"] = address
            if endpoint_id is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_id'")
            __props__.__dict__["endpoint_id"] = endpoint_id
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["network"] = network
            __props__.__dict__["port"] = port
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            __props__.__dict__["name"] = None
        super(Endpoint, __self__).__init__(
            'gcp:servicedirectory/endpoint:Endpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[_builtins.str]] = None,
            endpoint_id: Optional[pulumi.Input[_builtins.str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network: Optional[pulumi.Input[_builtins.str]] = None,
            port: Optional[pulumi.Input[_builtins.int]] = None,
            service: Optional[pulumi.Input[_builtins.str]] = None) -> 'Endpoint':
        """
        Get an existing Endpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] address: IPv4 or IPv6 address of the endpoint.
        :param pulumi.Input[_builtins.str] endpoint_id: The Resource ID must be 1-63 characters long, including digits,
               lowercase letters or the hyphen character.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: Metadata for the endpoint. This data can be consumed
               by service clients. The entire metadata dictionary may contain
               up to 512 characters, spread across all key-value pairs.
               Metadata that goes beyond any these limits will be rejected.
        :param pulumi.Input[_builtins.str] name: The resource name for the endpoint in the format
               `projects/*/locations/*/namespaces/*/services/*/endpoints/*`.
        :param pulumi.Input[_builtins.str] network: The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        :param pulumi.Input[_builtins.int] port: Port that the endpoint is running on, must be in the
               range of [0, 65535]. If unspecified, the default is 0.
        :param pulumi.Input[_builtins.str] service: The resource name of the service that this endpoint provides.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointState.__new__(_EndpointState)

        __props__.__dict__["address"] = address
        __props__.__dict__["endpoint_id"] = endpoint_id
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["network"] = network
        __props__.__dict__["port"] = port
        __props__.__dict__["service"] = service
        return Endpoint(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def address(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        IPv4 or IPv6 address of the endpoint.
        """
        return pulumi.get(self, "address")

    @_builtins.property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Resource ID must be 1-63 characters long, including digits,
        lowercase letters or the hyphen character.
        """
        return pulumi.get(self, "endpoint_id")

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Metadata for the endpoint. This data can be consumed
        by service clients. The entire metadata dictionary may contain
        up to 512 characters, spread across all key-value pairs.
        Metadata that goes beyond any these limits will be rejected.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The resource name for the endpoint in the format
        `projects/*/locations/*/namespaces/*/services/*/endpoints/*`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def network(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
        """
        return pulumi.get(self, "network")

    @_builtins.property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Port that the endpoint is running on, must be in the
        range of [0, 65535]. If unspecified, the default is 0.
        """
        return pulumi.get(self, "port")

    @_builtins.property
    @pulumi.getter
    def service(self) -> pulumi.Output[_builtins.str]:
        """
        The resource name of the service that this endpoint provides.
        """
        return pulumi.get(self, "service")

