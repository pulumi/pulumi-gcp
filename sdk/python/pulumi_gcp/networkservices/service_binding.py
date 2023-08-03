# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceBindingArgs', 'ServiceBinding']

@pulumi.input_type
class ServiceBindingArgs:
    def __init__(__self__, *,
                 service: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceBinding resource.
        :param pulumi.Input[str] service: The full Service Directory Service name of the format
               projects/*/locations/*/namespaces/*/services/*
        :param pulumi.Input[str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the ServiceBinding resource.
        :param pulumi.Input[str] name: Name of the ServiceBinding resource.
               
               
               - - -
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "service", service)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        The full Service Directory Service name of the format
        projects/*/locations/*/namespaces/*/services/*
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A free-text description of the resource. Max length 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of label tags associated with the ServiceBinding resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the ServiceBinding resource.


        - - -
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


@pulumi.input_type
class _ServiceBindingState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceBinding resources.
        :param pulumi.Input[str] create_time: Time the ServiceBinding was created in UTC.
        :param pulumi.Input[str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the ServiceBinding resource.
        :param pulumi.Input[str] name: Name of the ServiceBinding resource.
               
               
               - - -
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] service: The full Service Directory Service name of the format
               projects/*/locations/*/namespaces/*/services/*
        :param pulumi.Input[str] update_time: Time the ServiceBinding was updated in UTC.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Time the ServiceBinding was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A free-text description of the resource. Max length 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of label tags associated with the ServiceBinding resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the ServiceBinding resource.


        - - -
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
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        The full Service Directory Service name of the format
        projects/*/locations/*/namespaces/*/services/*
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        """
        Time the ServiceBinding was updated in UTC.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


class ServiceBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Network Services Service Binding Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_namespace = gcp.servicedirectory.Namespace("defaultNamespace",
            namespace_id="my-namespace",
            location="us-central1",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_service = gcp.servicedirectory.Service("defaultService",
            service_id="my-service",
            namespace=default_namespace.id,
            metadata={
                "stage": "prod",
                "region": "us-central1",
            },
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_service_binding = gcp.networkservices.ServiceBinding("defaultServiceBinding",
            labels={
                "foo": "bar",
            },
            description="my description",
            service=default_service.id,
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        ServiceBinding can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:networkservices/serviceBinding:ServiceBinding default projects/{{project}}/locations/global/serviceBindings/{{name}}
        ```

        ```sh
         $ pulumi import gcp:networkservices/serviceBinding:ServiceBinding default {{project}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:networkservices/serviceBinding:ServiceBinding default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the ServiceBinding resource.
        :param pulumi.Input[str] name: Name of the ServiceBinding resource.
               
               
               - - -
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] service: The full Service Directory Service name of the format
               projects/*/locations/*/namespaces/*/services/*
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Network Services Service Binding Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_namespace = gcp.servicedirectory.Namespace("defaultNamespace",
            namespace_id="my-namespace",
            location="us-central1",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_service = gcp.servicedirectory.Service("defaultService",
            service_id="my-service",
            namespace=default_namespace.id,
            metadata={
                "stage": "prod",
                "region": "us-central1",
            },
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_service_binding = gcp.networkservices.ServiceBinding("defaultServiceBinding",
            labels={
                "foo": "bar",
            },
            description="my description",
            service=default_service.id,
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        ServiceBinding can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:networkservices/serviceBinding:ServiceBinding default projects/{{project}}/locations/global/serviceBindings/{{name}}
        ```

        ```sh
         $ pulumi import gcp:networkservices/serviceBinding:ServiceBinding default {{project}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:networkservices/serviceBinding:ServiceBinding default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param ServiceBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceBindingArgs.__new__(ServiceBindingArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            __props__.__dict__["create_time"] = None
            __props__.__dict__["update_time"] = None
        super(ServiceBinding, __self__).__init__(
            'gcp:networkservices/serviceBinding:ServiceBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None,
            update_time: Optional[pulumi.Input[str]] = None) -> 'ServiceBinding':
        """
        Get an existing ServiceBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: Time the ServiceBinding was created in UTC.
        :param pulumi.Input[str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the ServiceBinding resource.
        :param pulumi.Input[str] name: Name of the ServiceBinding resource.
               
               
               - - -
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] service: The full Service Directory Service name of the format
               projects/*/locations/*/namespaces/*/services/*
        :param pulumi.Input[str] update_time: Time the ServiceBinding was updated in UTC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceBindingState.__new__(_ServiceBindingState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["service"] = service
        __props__.__dict__["update_time"] = update_time
        return ServiceBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Time the ServiceBinding was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A free-text description of the resource. Max length 1024 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Set of label tags associated with the ServiceBinding resource.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the ServiceBinding resource.


        - - -
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
    def service(self) -> pulumi.Output[str]:
        """
        The full Service Directory Service name of the format
        projects/*/locations/*/namespaces/*/services/*
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        Time the ServiceBinding was updated in UTC.
        """
        return pulumi.get(self, "update_time")
