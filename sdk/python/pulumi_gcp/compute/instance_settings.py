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

__all__ = ['InstanceSettingsArgs', 'InstanceSettings']

@pulumi.input_type
class InstanceSettingsArgs:
    def __init__(__self__, *,
                 zone: pulumi.Input[_builtins.str],
                 metadata: Optional[pulumi.Input['InstanceSettingsMetadataArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a InstanceSettings resource.
        :param pulumi.Input[_builtins.str] zone: A reference to the zone where the machine resides.
        :param pulumi.Input['InstanceSettingsMetadataArgs'] metadata: The metadata key/value pairs assigned to all the instances in the corresponding scope.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "zone", zone)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> pulumi.Input[_builtins.str]:
        """
        A reference to the zone where the machine resides.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['InstanceSettingsMetadataArgs']]:
        """
        The metadata key/value pairs assigned to all the instances in the corresponding scope.
        Structure is documented below.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['InstanceSettingsMetadataArgs']]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _InstanceSettingsState:
    def __init__(__self__, *,
                 fingerprint: Optional[pulumi.Input[_builtins.str]] = None,
                 metadata: Optional[pulumi.Input['InstanceSettingsMetadataArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering InstanceSettings resources.
        :param pulumi.Input[_builtins.str] fingerprint: The fingerprint used for optimistic locking of this resource.  Used
               internally during updates.
        :param pulumi.Input['InstanceSettingsMetadataArgs'] metadata: The metadata key/value pairs assigned to all the instances in the corresponding scope.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] zone: A reference to the zone where the machine resides.
        """
        if fingerprint is not None:
            pulumi.set(__self__, "fingerprint", fingerprint)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter
    def fingerprint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The fingerprint used for optimistic locking of this resource.  Used
        internally during updates.
        """
        return pulumi.get(self, "fingerprint")

    @fingerprint.setter
    def fingerprint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "fingerprint", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['InstanceSettingsMetadataArgs']]:
        """
        The metadata key/value pairs assigned to all the instances in the corresponding scope.
        Structure is documented below.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['InstanceSettingsMetadataArgs']]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A reference to the zone where the machine resides.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.type_token("gcp:compute/instanceSettings:InstanceSettings")
class InstanceSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 metadata: Optional[pulumi.Input[Union['InstanceSettingsMetadataArgs', 'InstanceSettingsMetadataArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Represents an Instance Settings resource. Instance settings are centralized configuration parameters that allow users to configure the default values for specific VM parameters that are normally set using GCE instance API methods.

        To get more information about InstanceSettings, see:

        * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/instanceSettings)
        * How-to Guides
            * [Update Instance Settings](https://cloud.google.com/compute/docs/metadata/setting-custom-metadata#set-custom-project-zonal-metadata)

        ## Example Usage

        ### Instance Settings Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        gce_instance_settings = gcp.compute.InstanceSettings("gce_instance_settings",
            zone="us-east7-b",
            metadata={
                "items": {
                    "foo": "baz",
                },
            })
        ```

        ## Import

        InstanceSettings can be imported using any of these accepted formats:

        * `projects/{{project}}/zones/{{zone}}/instanceSettings`

        * `{{project}}/{{zone}}`

        * `{{zone}}`

        When using the `pulumi import` command, InstanceSettings can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:compute/instanceSettings:InstanceSettings default projects/{{project}}/zones/{{zone}}/instanceSettings
        ```

        ```sh
        $ pulumi import gcp:compute/instanceSettings:InstanceSettings default {{project}}/{{zone}}
        ```

        ```sh
        $ pulumi import gcp:compute/instanceSettings:InstanceSettings default {{zone}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['InstanceSettingsMetadataArgs', 'InstanceSettingsMetadataArgsDict']] metadata: The metadata key/value pairs assigned to all the instances in the corresponding scope.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] zone: A reference to the zone where the machine resides.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Represents an Instance Settings resource. Instance settings are centralized configuration parameters that allow users to configure the default values for specific VM parameters that are normally set using GCE instance API methods.

        To get more information about InstanceSettings, see:

        * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/instanceSettings)
        * How-to Guides
            * [Update Instance Settings](https://cloud.google.com/compute/docs/metadata/setting-custom-metadata#set-custom-project-zonal-metadata)

        ## Example Usage

        ### Instance Settings Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        gce_instance_settings = gcp.compute.InstanceSettings("gce_instance_settings",
            zone="us-east7-b",
            metadata={
                "items": {
                    "foo": "baz",
                },
            })
        ```

        ## Import

        InstanceSettings can be imported using any of these accepted formats:

        * `projects/{{project}}/zones/{{zone}}/instanceSettings`

        * `{{project}}/{{zone}}`

        * `{{zone}}`

        When using the `pulumi import` command, InstanceSettings can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:compute/instanceSettings:InstanceSettings default projects/{{project}}/zones/{{zone}}/instanceSettings
        ```

        ```sh
        $ pulumi import gcp:compute/instanceSettings:InstanceSettings default {{project}}/{{zone}}
        ```

        ```sh
        $ pulumi import gcp:compute/instanceSettings:InstanceSettings default {{zone}}
        ```

        :param str resource_name: The name of the resource.
        :param InstanceSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 metadata: Optional[pulumi.Input[Union['InstanceSettingsMetadataArgs', 'InstanceSettingsMetadataArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceSettingsArgs.__new__(InstanceSettingsArgs)

            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["project"] = project
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__.__dict__["zone"] = zone
            __props__.__dict__["fingerprint"] = None
        super(InstanceSettings, __self__).__init__(
            'gcp:compute/instanceSettings:InstanceSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            fingerprint: Optional[pulumi.Input[_builtins.str]] = None,
            metadata: Optional[pulumi.Input[Union['InstanceSettingsMetadataArgs', 'InstanceSettingsMetadataArgsDict']]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            zone: Optional[pulumi.Input[_builtins.str]] = None) -> 'InstanceSettings':
        """
        Get an existing InstanceSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] fingerprint: The fingerprint used for optimistic locking of this resource.  Used
               internally during updates.
        :param pulumi.Input[Union['InstanceSettingsMetadataArgs', 'InstanceSettingsMetadataArgsDict']] metadata: The metadata key/value pairs assigned to all the instances in the corresponding scope.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] zone: A reference to the zone where the machine resides.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceSettingsState.__new__(_InstanceSettingsState)

        __props__.__dict__["fingerprint"] = fingerprint
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["project"] = project
        __props__.__dict__["zone"] = zone
        return InstanceSettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def fingerprint(self) -> pulumi.Output[_builtins.str]:
        """
        The fingerprint used for optimistic locking of this resource.  Used
        internally during updates.
        """
        return pulumi.get(self, "fingerprint")

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional['outputs.InstanceSettingsMetadata']]:
        """
        The metadata key/value pairs assigned to all the instances in the corresponding scope.
        Structure is documented below.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> pulumi.Output[_builtins.str]:
        """
        A reference to the zone where the machine resides.
        """
        return pulumi.get(self, "zone")

