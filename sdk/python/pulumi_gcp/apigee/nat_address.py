# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NatAddressArgs', 'NatAddress']

@pulumi.input_type
class NatAddressArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NatAddress resource.
        :param pulumi.Input[str] instance_id: The Apigee instance associated with the Apigee environment,
               in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        :param pulumi.Input[str] name: Resource ID of the NAT address.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The Apigee instance associated with the Apigee environment,
        in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Resource ID of the NAT address.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _NatAddressState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NatAddress resources.
        :param pulumi.Input[str] instance_id: The Apigee instance associated with the Apigee environment,
               in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        :param pulumi.Input[str] ip_address: The allocated NAT IP address.
        :param pulumi.Input[str] name: Resource ID of the NAT address.
        :param pulumi.Input[str] state: State of the NAT IP address.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Apigee instance associated with the Apigee environment,
        in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The allocated NAT IP address.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Resource ID of the NAT address.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of the NAT IP address.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class NatAddress(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Apigee NAT (network address translation) address. A NAT address is a static external IP address used for Internet egress traffic. This is not avaible for Apigee hybrid.
        Apigee NAT addresses are not automatically activated because they might require explicit allow entries on the target systems first. See https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses/activate

        To get more information about NatAddress, see:

        * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses)
        * How-to Guides
            * [Provisioning NAT IPs](https://cloud.google.com/apigee/docs/api-platform/security/nat-provisioning)

        ## Example Usage

        ## Import

        NatAddress can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:apigee/natAddress:NatAddress default {{instance_id}}/natAddresses/{{name}}
        ```

        ```sh
         $ pulumi import gcp:apigee/natAddress:NatAddress default {{instance_id}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The Apigee instance associated with the Apigee environment,
               in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        :param pulumi.Input[str] name: Resource ID of the NAT address.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NatAddressArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Apigee NAT (network address translation) address. A NAT address is a static external IP address used for Internet egress traffic. This is not avaible for Apigee hybrid.
        Apigee NAT addresses are not automatically activated because they might require explicit allow entries on the target systems first. See https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses/activate

        To get more information about NatAddress, see:

        * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses)
        * How-to Guides
            * [Provisioning NAT IPs](https://cloud.google.com/apigee/docs/api-platform/security/nat-provisioning)

        ## Example Usage

        ## Import

        NatAddress can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:apigee/natAddress:NatAddress default {{instance_id}}/natAddresses/{{name}}
        ```

        ```sh
         $ pulumi import gcp:apigee/natAddress:NatAddress default {{instance_id}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param NatAddressArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NatAddressArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NatAddressArgs.__new__(NatAddressArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["name"] = name
            __props__.__dict__["ip_address"] = None
            __props__.__dict__["state"] = None
        super(NatAddress, __self__).__init__(
            'gcp:apigee/natAddress:NatAddress',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'NatAddress':
        """
        Get an existing NatAddress resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The Apigee instance associated with the Apigee environment,
               in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        :param pulumi.Input[str] ip_address: The allocated NAT IP address.
        :param pulumi.Input[str] name: Resource ID of the NAT address.
        :param pulumi.Input[str] state: State of the NAT IP address.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NatAddressState.__new__(_NatAddressState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["name"] = name
        __props__.__dict__["state"] = state
        return NatAddress(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The Apigee instance associated with the Apigee environment,
        in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The allocated NAT IP address.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Resource ID of the NAT address.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of the NAT IP address.
        """
        return pulumi.get(self, "state")
