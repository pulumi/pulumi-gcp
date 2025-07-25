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

__all__ = ['AiEndpointIamBindingArgs', 'AiEndpointIamBinding']

@pulumi.input_type
class AiEndpointIamBindingArgs:
    def __init__(__self__, *,
                 endpoint: pulumi.Input[_builtins.str],
                 members: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 role: pulumi.Input[_builtins.str],
                 condition: Optional[pulumi.Input['AiEndpointIamBindingConditionArgs']] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a AiEndpointIamBinding resource.
        """
        pulumi.set(__self__, "endpoint", endpoint)
        pulumi.set(__self__, "members", members)
        pulumi.set(__self__, "role", role)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "endpoint", value)

    @_builtins.property
    @pulumi.getter
    def members(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "members", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role", value)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['AiEndpointIamBindingConditionArgs']]:
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['AiEndpointIamBindingConditionArgs']]):
        pulumi.set(self, "condition", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _AiEndpointIamBindingState:
    def __init__(__self__, *,
                 condition: Optional[pulumi.Input['AiEndpointIamBindingConditionArgs']] = None,
                 endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AiEndpointIamBinding resources.
        """
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['AiEndpointIamBindingConditionArgs']]:
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['AiEndpointIamBindingConditionArgs']]):
        pulumi.set(self, "condition", value)

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "endpoint", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "members", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role", value)


@pulumi.type_token("gcp:vertex/aiEndpointIamBinding:AiEndpointIamBinding")
class AiEndpointIamBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[Union['AiEndpointIamBindingConditionArgs', 'AiEndpointIamBindingConditionArgsDict']]] = None,
                 endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Create a AiEndpointIamBinding resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AiEndpointIamBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AiEndpointIamBinding resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AiEndpointIamBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AiEndpointIamBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[Union['AiEndpointIamBindingConditionArgs', 'AiEndpointIamBindingConditionArgsDict']]] = None,
                 endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AiEndpointIamBindingArgs.__new__(AiEndpointIamBindingArgs)

            __props__.__dict__["condition"] = condition
            if endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint'")
            __props__.__dict__["endpoint"] = endpoint
            __props__.__dict__["location"] = location
            if members is None and not opts.urn:
                raise TypeError("Missing required property 'members'")
            __props__.__dict__["members"] = members
            __props__.__dict__["project"] = project
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            __props__.__dict__["etag"] = None
        super(AiEndpointIamBinding, __self__).__init__(
            'gcp:vertex/aiEndpointIamBinding:AiEndpointIamBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            condition: Optional[pulumi.Input[Union['AiEndpointIamBindingConditionArgs', 'AiEndpointIamBindingConditionArgsDict']]] = None,
            endpoint: Optional[pulumi.Input[_builtins.str]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            role: Optional[pulumi.Input[_builtins.str]] = None) -> 'AiEndpointIamBinding':
        """
        Get an existing AiEndpointIamBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AiEndpointIamBindingState.__new__(_AiEndpointIamBindingState)

        __props__.__dict__["condition"] = condition
        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["etag"] = etag
        __props__.__dict__["location"] = location
        __props__.__dict__["members"] = members
        __props__.__dict__["project"] = project
        __props__.__dict__["role"] = role
        return AiEndpointIamBinding(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> pulumi.Output[Optional['outputs.AiEndpointIamBindingCondition']]:
        return pulumi.get(self, "condition")

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "endpoint")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def members(self) -> pulumi.Output[Sequence[_builtins.str]]:
        return pulumi.get(self, "members")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "role")

