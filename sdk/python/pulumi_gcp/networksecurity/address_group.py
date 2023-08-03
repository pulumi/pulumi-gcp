# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AddressGroupArgs', 'AddressGroup']

@pulumi.input_type
class AddressGroupArgs:
    def __init__(__self__, *,
                 capacity: pulumi.Input[int],
                 location: pulumi.Input[str],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 items: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AddressGroup resource.
        :param pulumi.Input[int] capacity: Capacity of the Address Group.
        :param pulumi.Input[str] location: The location of the gateway security policy.
               The default value is `global`.
               
               
               - - -
        :param pulumi.Input[str] type: The type of the Address Group. Possible values are "IPV4" or "IPV6".
               Possible values are: `IPV4`, `IPV6`.
        :param pulumi.Input[str] description: Free-text description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] items: List of items.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the AddressGroup resource.
               An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        :param pulumi.Input[str] name: Name of the AddressGroup resource.
        :param pulumi.Input[str] parent: The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        """
        pulumi.set(__self__, "capacity", capacity)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if items is not None:
            pulumi.set(__self__, "items", items)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)

    @property
    @pulumi.getter
    def capacity(self) -> pulumi.Input[int]:
        """
        Capacity of the Address Group.
        """
        return pulumi.get(self, "capacity")

    @capacity.setter
    def capacity(self, value: pulumi.Input[int]):
        pulumi.set(self, "capacity", value)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The location of the gateway security policy.
        The default value is `global`.


        - - -
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the Address Group. Possible values are "IPV4" or "IPV6".
        Possible values are: `IPV4`, `IPV6`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Free-text description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def items(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of items.
        """
        return pulumi.get(self, "items")

    @items.setter
    def items(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "items", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of label tags associated with the AddressGroup resource.
        An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the AddressGroup resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent", value)


@pulumi.input_type
class _AddressGroupState:
    def __init__(__self__, *,
                 capacity: Optional[pulumi.Input[int]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 items: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AddressGroup resources.
        :param pulumi.Input[int] capacity: Capacity of the Address Group.
        :param pulumi.Input[str] create_time: The timestamp when the resource was created.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        :param pulumi.Input[str] description: Free-text description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] items: List of items.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the AddressGroup resource.
               An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        :param pulumi.Input[str] location: The location of the gateway security policy.
               The default value is `global`.
               
               
               - - -
        :param pulumi.Input[str] name: Name of the AddressGroup resource.
        :param pulumi.Input[str] parent: The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        :param pulumi.Input[str] type: The type of the Address Group. Possible values are "IPV4" or "IPV6".
               Possible values are: `IPV4`, `IPV6`.
        :param pulumi.Input[str] update_time: The timestamp when the resource was updated.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        if capacity is not None:
            pulumi.set(__self__, "capacity", capacity)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if items is not None:
            pulumi.set(__self__, "items", items)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def capacity(self) -> Optional[pulumi.Input[int]]:
        """
        Capacity of the Address Group.
        """
        return pulumi.get(self, "capacity")

    @capacity.setter
    def capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "capacity", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp when the resource was created.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Free-text description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def items(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of items.
        """
        return pulumi.get(self, "items")

    @items.setter
    def items(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "items", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of label tags associated with the AddressGroup resource.
        An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location of the gateway security policy.
        The default value is `global`.


        - - -
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the AddressGroup resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Address Group. Possible values are "IPV4" or "IPV6".
        Possible values are: `IPV4`, `IPV6`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp when the resource was updated.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


class AddressGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 items: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        AddressGroup is a resource that specifies how a collection of IP/DNS used in Firewall Policy.

        To get more information about AddressGroup, see:

        * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/organizations.locations.addressGroups)
        * How-to Guides
            * [Use AddressGroups](https://cloud.google.com/vpc/docs/use-address-groups-firewall-policies)

        ## Example Usage
        ### Network Security Address Groups Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.AddressGroup("default",
            capacity=100,
            items=["208.80.154.224/32"],
            location="us-central1",
            parent="projects/my-project-name",
            type="IPV4")
        ```
        ### Network Security Address Groups Organization Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.AddressGroup("default",
            capacity=100,
            items=["208.80.154.224/32"],
            location="us-central1",
            parent="organizations/123456789",
            type="IPV4")
        ```
        ### Network Security Address Groups Advanced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.AddressGroup("default",
            capacity=100,
            description="my description",
            items=["208.80.154.224/32"],
            location="us-central1",
            parent="projects/my-project-name",
            type="IPV4")
        ```

        ## Import

        AddressGroup can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:networksecurity/addressGroup:AddressGroup default {{parent}}/locations/{{location}}/addressGroups/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] capacity: Capacity of the Address Group.
        :param pulumi.Input[str] description: Free-text description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] items: List of items.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the AddressGroup resource.
               An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        :param pulumi.Input[str] location: The location of the gateway security policy.
               The default value is `global`.
               
               
               - - -
        :param pulumi.Input[str] name: Name of the AddressGroup resource.
        :param pulumi.Input[str] parent: The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        :param pulumi.Input[str] type: The type of the Address Group. Possible values are "IPV4" or "IPV6".
               Possible values are: `IPV4`, `IPV6`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AddressGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        AddressGroup is a resource that specifies how a collection of IP/DNS used in Firewall Policy.

        To get more information about AddressGroup, see:

        * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/organizations.locations.addressGroups)
        * How-to Guides
            * [Use AddressGroups](https://cloud.google.com/vpc/docs/use-address-groups-firewall-policies)

        ## Example Usage
        ### Network Security Address Groups Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.AddressGroup("default",
            capacity=100,
            items=["208.80.154.224/32"],
            location="us-central1",
            parent="projects/my-project-name",
            type="IPV4")
        ```
        ### Network Security Address Groups Organization Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.AddressGroup("default",
            capacity=100,
            items=["208.80.154.224/32"],
            location="us-central1",
            parent="organizations/123456789",
            type="IPV4")
        ```
        ### Network Security Address Groups Advanced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.AddressGroup("default",
            capacity=100,
            description="my description",
            items=["208.80.154.224/32"],
            location="us-central1",
            parent="projects/my-project-name",
            type="IPV4")
        ```

        ## Import

        AddressGroup can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:networksecurity/addressGroup:AddressGroup default {{parent}}/locations/{{location}}/addressGroups/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param AddressGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AddressGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 items: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AddressGroupArgs.__new__(AddressGroupArgs)

            if capacity is None and not opts.urn:
                raise TypeError("Missing required property 'capacity'")
            __props__.__dict__["capacity"] = capacity
            __props__.__dict__["description"] = description
            __props__.__dict__["items"] = items
            __props__.__dict__["labels"] = labels
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["parent"] = parent
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["create_time"] = None
            __props__.__dict__["update_time"] = None
        super(AddressGroup, __self__).__init__(
            'gcp:networksecurity/addressGroup:AddressGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            capacity: Optional[pulumi.Input[int]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            items: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            update_time: Optional[pulumi.Input[str]] = None) -> 'AddressGroup':
        """
        Get an existing AddressGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] capacity: Capacity of the Address Group.
        :param pulumi.Input[str] create_time: The timestamp when the resource was created.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        :param pulumi.Input[str] description: Free-text description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] items: List of items.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of label tags associated with the AddressGroup resource.
               An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        :param pulumi.Input[str] location: The location of the gateway security policy.
               The default value is `global`.
               
               
               - - -
        :param pulumi.Input[str] name: Name of the AddressGroup resource.
        :param pulumi.Input[str] parent: The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        :param pulumi.Input[str] type: The type of the Address Group. Possible values are "IPV4" or "IPV6".
               Possible values are: `IPV4`, `IPV6`.
        :param pulumi.Input[str] update_time: The timestamp when the resource was updated.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AddressGroupState.__new__(_AddressGroupState)

        __props__.__dict__["capacity"] = capacity
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["items"] = items
        __props__.__dict__["labels"] = labels
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        __props__.__dict__["type"] = type
        __props__.__dict__["update_time"] = update_time
        return AddressGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def capacity(self) -> pulumi.Output[int]:
        """
        Capacity of the Address Group.
        """
        return pulumi.get(self, "capacity")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The timestamp when the resource was created.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Free-text description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def items(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of items.
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Set of label tags associated with the AddressGroup resource.
        An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location of the gateway security policy.
        The default value is `global`.


        - - -
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the AddressGroup resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parent(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
        """
        return pulumi.get(self, "parent")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the Address Group. Possible values are "IPV4" or "IPV6".
        Possible values are: `IPV4`, `IPV6`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        The timestamp when the resource was updated.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")
