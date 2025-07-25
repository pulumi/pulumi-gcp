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

__all__ = ['InstanceGroupArgs', 'InstanceGroup']

@pulumi.input_type
class InstanceGroupArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 named_ports: Optional[pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a InstanceGroup resource.
        :param pulumi.Input[_builtins.str] description: An optional textual description of the instance
               group.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instances: The list of instances in the group, in `self_link` format.
               When adding instances they must all be in the same network and zone as the instance group.
        :param pulumi.Input[_builtins.str] name: The name of the instance group. Must be 1-63
               characters long and comply with
               [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
               include lowercase letters, numbers, and hyphens.
        :param pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]] named_ports: The named port configuration. See the section below
               for details on configuration. Structure is documented below.
        :param pulumi.Input[_builtins.str] network: The URL of the network the instance group is in. If
               this is different from the network where the instances are in, the creation
               fails. Defaults to the network where the instances are in (if neither
               `network` nor `instances` is specified, this field will be blank).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it
               is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] zone: The zone that this instance group should be created in.
               
               - - -
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instances is not None:
            pulumi.set(__self__, "instances", instances)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if named_ports is not None:
            pulumi.set(__self__, "named_ports", named_ports)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional textual description of the instance
        group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def instances(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of instances in the group, in `self_link` format.
        When adding instances they must all be in the same network and zone as the instance group.
        """
        return pulumi.get(self, "instances")

    @instances.setter
    def instances(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "instances", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the instance group. Must be 1-63
        characters long and comply with
        [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
        include lowercase letters, numbers, and hyphens.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="namedPorts")
    def named_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]]]:
        """
        The named port configuration. See the section below
        for details on configuration. Structure is documented below.
        """
        return pulumi.get(self, "named_ports")

    @named_ports.setter
    def named_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]]]):
        pulumi.set(self, "named_ports", value)

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of the network the instance group is in. If
        this is different from the network where the instances are in, the creation
        fails. Defaults to the network where the instances are in (if neither
        `network` nor `instances` is specified, this field will be blank).
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs. If it
        is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The zone that this instance group should be created in.

        - - -
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _InstanceGroupState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 named_ports: Optional[pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 self_link: Optional[pulumi.Input[_builtins.str]] = None,
                 size: Optional[pulumi.Input[_builtins.int]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering InstanceGroup resources.
        :param pulumi.Input[_builtins.str] description: An optional textual description of the instance
               group.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instances: The list of instances in the group, in `self_link` format.
               When adding instances they must all be in the same network and zone as the instance group.
        :param pulumi.Input[_builtins.str] name: The name of the instance group. Must be 1-63
               characters long and comply with
               [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
               include lowercase letters, numbers, and hyphens.
        :param pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]] named_ports: The named port configuration. See the section below
               for details on configuration. Structure is documented below.
        :param pulumi.Input[_builtins.str] network: The URL of the network the instance group is in. If
               this is different from the network where the instances are in, the creation
               fails. Defaults to the network where the instances are in (if neither
               `network` nor `instances` is specified, this field will be blank).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it
               is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] self_link: The URI of the created resource.
        :param pulumi.Input[_builtins.int] size: The number of instances in the group.
        :param pulumi.Input[_builtins.str] zone: The zone that this instance group should be created in.
               
               - - -
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instances is not None:
            pulumi.set(__self__, "instances", instances)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if named_ports is not None:
            pulumi.set(__self__, "named_ports", named_ports)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if self_link is not None:
            pulumi.set(__self__, "self_link", self_link)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional textual description of the instance
        group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def instances(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of instances in the group, in `self_link` format.
        When adding instances they must all be in the same network and zone as the instance group.
        """
        return pulumi.get(self, "instances")

    @instances.setter
    def instances(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "instances", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the instance group. Must be 1-63
        characters long and comply with
        [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
        include lowercase letters, numbers, and hyphens.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="namedPorts")
    def named_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]]]:
        """
        The named port configuration. See the section below
        for details on configuration. Structure is documented below.
        """
        return pulumi.get(self, "named_ports")

    @named_ports.setter
    def named_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['InstanceGroupNamedPortArgs']]]]):
        pulumi.set(self, "named_ports", value)

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of the network the instance group is in. If
        this is different from the network where the instances are in, the creation
        fails. Defaults to the network where the instances are in (if neither
        `network` nor `instances` is specified, this field will be blank).
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs. If it
        is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URI of the created resource.
        """
        return pulumi.get(self, "self_link")

    @self_link.setter
    def self_link(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "self_link", value)

    @_builtins.property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of instances in the group.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "size", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The zone that this instance group should be created in.

        - - -
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.type_token("gcp:compute/instanceGroup:InstanceGroup")
class InstanceGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 named_ports: Optional[pulumi.Input[Sequence[pulumi.Input[Union['InstanceGroupNamedPortArgs', 'InstanceGroupNamedPortArgsDict']]]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Creates a group of dissimilar Compute Engine virtual machine instances.
        For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/#unmanaged_instance_groups)
        and [API](https://cloud.google.com/compute/docs/reference/latest/instanceGroups)

        ## Example Usage

        ### Empty Instance Group

        ```python
        import pulumi
        import pulumi_gcp as gcp

        test = gcp.compute.InstanceGroup("test",
            name="test",
            description="Test instance group",
            zone="us-central1-a",
            network=default["id"])
        ```

        ### Example Usage - With instances and named ports

        ```python
        import pulumi
        import pulumi_gcp as gcp

        webservers = gcp.compute.InstanceGroup("webservers",
            name="webservers",
            description="Test instance group",
            instances=[
                test["id"],
                test2["id"],
            ],
            named_ports=[
                {
                    "name": "http",
                    "port": 8080,
                },
                {
                    "name": "https",
                    "port": 8443,
                },
            ],
            zone="us-central1-a")
        ```

        ## Import

        Instance groups can be imported using the `zone` and `name` with an optional `project`, e.g.

        * `projects/{{project_id}}/zones/{{zone}}/instanceGroups/{{instance_group_id}}`

        * `{{project_id}}/{{zone}}/{{instance_group_id}}`

        * `{{zone}}/{{instance_group_id}}`

        When using the `pulumi import` command, instance groups can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:compute/instanceGroup:InstanceGroup default {{zone}}/{{instance_group_id}}
        ```

        ```sh
        $ pulumi import gcp:compute/instanceGroup:InstanceGroup default {{project_id}}/{{zone}}/{{instance_group_id}}
        ```

        ```sh
        $ pulumi import gcp:compute/instanceGroup:InstanceGroup default projects/{{project_id}}/zones/{{zone}}/instanceGroups/{{instance_group_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: An optional textual description of the instance
               group.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instances: The list of instances in the group, in `self_link` format.
               When adding instances they must all be in the same network and zone as the instance group.
        :param pulumi.Input[_builtins.str] name: The name of the instance group. Must be 1-63
               characters long and comply with
               [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
               include lowercase letters, numbers, and hyphens.
        :param pulumi.Input[Sequence[pulumi.Input[Union['InstanceGroupNamedPortArgs', 'InstanceGroupNamedPortArgsDict']]]] named_ports: The named port configuration. See the section below
               for details on configuration. Structure is documented below.
        :param pulumi.Input[_builtins.str] network: The URL of the network the instance group is in. If
               this is different from the network where the instances are in, the creation
               fails. Defaults to the network where the instances are in (if neither
               `network` nor `instances` is specified, this field will be blank).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it
               is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] zone: The zone that this instance group should be created in.
               
               - - -
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[InstanceGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a group of dissimilar Compute Engine virtual machine instances.
        For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/#unmanaged_instance_groups)
        and [API](https://cloud.google.com/compute/docs/reference/latest/instanceGroups)

        ## Example Usage

        ### Empty Instance Group

        ```python
        import pulumi
        import pulumi_gcp as gcp

        test = gcp.compute.InstanceGroup("test",
            name="test",
            description="Test instance group",
            zone="us-central1-a",
            network=default["id"])
        ```

        ### Example Usage - With instances and named ports

        ```python
        import pulumi
        import pulumi_gcp as gcp

        webservers = gcp.compute.InstanceGroup("webservers",
            name="webservers",
            description="Test instance group",
            instances=[
                test["id"],
                test2["id"],
            ],
            named_ports=[
                {
                    "name": "http",
                    "port": 8080,
                },
                {
                    "name": "https",
                    "port": 8443,
                },
            ],
            zone="us-central1-a")
        ```

        ## Import

        Instance groups can be imported using the `zone` and `name` with an optional `project`, e.g.

        * `projects/{{project_id}}/zones/{{zone}}/instanceGroups/{{instance_group_id}}`

        * `{{project_id}}/{{zone}}/{{instance_group_id}}`

        * `{{zone}}/{{instance_group_id}}`

        When using the `pulumi import` command, instance groups can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:compute/instanceGroup:InstanceGroup default {{zone}}/{{instance_group_id}}
        ```

        ```sh
        $ pulumi import gcp:compute/instanceGroup:InstanceGroup default {{project_id}}/{{zone}}/{{instance_group_id}}
        ```

        ```sh
        $ pulumi import gcp:compute/instanceGroup:InstanceGroup default projects/{{project_id}}/zones/{{zone}}/instanceGroups/{{instance_group_id}}
        ```

        :param str resource_name: The name of the resource.
        :param InstanceGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 named_ports: Optional[pulumi.Input[Sequence[pulumi.Input[Union['InstanceGroupNamedPortArgs', 'InstanceGroupNamedPortArgsDict']]]]] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceGroupArgs.__new__(InstanceGroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["instances"] = instances
            __props__.__dict__["name"] = name
            __props__.__dict__["named_ports"] = named_ports
            __props__.__dict__["network"] = network
            __props__.__dict__["project"] = project
            __props__.__dict__["zone"] = zone
            __props__.__dict__["self_link"] = None
            __props__.__dict__["size"] = None
        super(InstanceGroup, __self__).__init__(
            'gcp:compute/instanceGroup:InstanceGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            instances: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            named_ports: Optional[pulumi.Input[Sequence[pulumi.Input[Union['InstanceGroupNamedPortArgs', 'InstanceGroupNamedPortArgsDict']]]]] = None,
            network: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            self_link: Optional[pulumi.Input[_builtins.str]] = None,
            size: Optional[pulumi.Input[_builtins.int]] = None,
            zone: Optional[pulumi.Input[_builtins.str]] = None) -> 'InstanceGroup':
        """
        Get an existing InstanceGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: An optional textual description of the instance
               group.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instances: The list of instances in the group, in `self_link` format.
               When adding instances they must all be in the same network and zone as the instance group.
        :param pulumi.Input[_builtins.str] name: The name of the instance group. Must be 1-63
               characters long and comply with
               [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
               include lowercase letters, numbers, and hyphens.
        :param pulumi.Input[Sequence[pulumi.Input[Union['InstanceGroupNamedPortArgs', 'InstanceGroupNamedPortArgsDict']]]] named_ports: The named port configuration. See the section below
               for details on configuration. Structure is documented below.
        :param pulumi.Input[_builtins.str] network: The URL of the network the instance group is in. If
               this is different from the network where the instances are in, the creation
               fails. Defaults to the network where the instances are in (if neither
               `network` nor `instances` is specified, this field will be blank).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it
               is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] self_link: The URI of the created resource.
        :param pulumi.Input[_builtins.int] size: The number of instances in the group.
        :param pulumi.Input[_builtins.str] zone: The zone that this instance group should be created in.
               
               - - -
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceGroupState.__new__(_InstanceGroupState)

        __props__.__dict__["description"] = description
        __props__.__dict__["instances"] = instances
        __props__.__dict__["name"] = name
        __props__.__dict__["named_ports"] = named_ports
        __props__.__dict__["network"] = network
        __props__.__dict__["project"] = project
        __props__.__dict__["self_link"] = self_link
        __props__.__dict__["size"] = size
        __props__.__dict__["zone"] = zone
        return InstanceGroup(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An optional textual description of the instance
        group.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def instances(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of instances in the group, in `self_link` format.
        When adding instances they must all be in the same network and zone as the instance group.
        """
        return pulumi.get(self, "instances")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the instance group. Must be 1-63
        characters long and comply with
        [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
        include lowercase letters, numbers, and hyphens.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="namedPorts")
    def named_ports(self) -> pulumi.Output[Optional[Sequence['outputs.InstanceGroupNamedPort']]]:
        """
        The named port configuration. See the section below
        for details on configuration. Structure is documented below.
        """
        return pulumi.get(self, "named_ports")

    @_builtins.property
    @pulumi.getter
    def network(self) -> pulumi.Output[_builtins.str]:
        """
        The URL of the network the instance group is in. If
        this is different from the network where the instances are in, the creation
        fails. Defaults to the network where the instances are in (if neither
        `network` nor `instances` is specified, this field will be blank).
        """
        return pulumi.get(self, "network")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs. If it
        is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> pulumi.Output[_builtins.str]:
        """
        The URI of the created resource.
        """
        return pulumi.get(self, "self_link")

    @_builtins.property
    @pulumi.getter
    def size(self) -> pulumi.Output[_builtins.int]:
        """
        The number of instances in the group.
        """
        return pulumi.get(self, "size")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> pulumi.Output[_builtins.str]:
        """
        The zone that this instance group should be created in.

        - - -
        """
        return pulumi.get(self, "zone")

