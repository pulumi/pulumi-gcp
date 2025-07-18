# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['ManagementOrganizationEventThreatDetectionCustomModuleArgs', 'ManagementOrganizationEventThreatDetectionCustomModule']

@pulumi.input_type
class ManagementOrganizationEventThreatDetectionCustomModuleArgs:
    def __init__(__self__, *,
                 organization: pulumi.Input[builtins.str],
                 config: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 enablement_state: Optional[pulumi.Input[builtins.str]] = None,
                 location: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a ManagementOrganizationEventThreatDetectionCustomModule resource.
        :param pulumi.Input[builtins.str] organization: Numerical ID of the parent organization.
        :param pulumi.Input[builtins.str] config: Config for the module. For the resident module, its config value is defined at this level.
               For the inherited module, its config value is inherited from the ancestor module.
        :param pulumi.Input[builtins.str] display_name: The human readable name to be displayed for the module.
        :param pulumi.Input[builtins.str] enablement_state: The state of enablement for the module at the given level of the hierarchy.
               Possible values are: `ENABLED`, `DISABLED`.
        :param pulumi.Input[builtins.str] location: Location ID of the parent organization. Only global is supported at the moment.
        :param pulumi.Input[builtins.str] type: Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        """
        pulumi.set(__self__, "organization", organization)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if enablement_state is not None:
            pulumi.set(__self__, "enablement_state", enablement_state)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def organization(self) -> pulumi.Input[builtins.str]:
        """
        Numerical ID of the parent organization.
        """
        return pulumi.get(self, "organization")

    @organization.setter
    def organization(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "organization", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Config for the module. For the resident module, its config value is defined at this level.
        For the inherited module, its config value is inherited from the ancestor module.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The human readable name to be displayed for the module.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="enablementState")
    def enablement_state(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The state of enablement for the module at the given level of the hierarchy.
        Possible values are: `ENABLED`, `DISABLED`.
        """
        return pulumi.get(self, "enablement_state")

    @enablement_state.setter
    def enablement_state(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "enablement_state", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Location ID of the parent organization. Only global is supported at the moment.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _ManagementOrganizationEventThreatDetectionCustomModuleState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 enablement_state: Optional[pulumi.Input[builtins.str]] = None,
                 last_editor: Optional[pulumi.Input[builtins.str]] = None,
                 location: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 organization: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 update_time: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ManagementOrganizationEventThreatDetectionCustomModule resources.
        :param pulumi.Input[builtins.str] config: Config for the module. For the resident module, its config value is defined at this level.
               For the inherited module, its config value is inherited from the ancestor module.
        :param pulumi.Input[builtins.str] display_name: The human readable name to be displayed for the module.
        :param pulumi.Input[builtins.str] enablement_state: The state of enablement for the module at the given level of the hierarchy.
               Possible values are: `ENABLED`, `DISABLED`.
        :param pulumi.Input[builtins.str] last_editor: The editor that last updated the custom module
        :param pulumi.Input[builtins.str] location: Location ID of the parent organization. Only global is supported at the moment.
        :param pulumi.Input[builtins.str] name: The resource name of the Event Threat Detection custom module.
               Its format is "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{eventThreatDetectionCustomModule}".
        :param pulumi.Input[builtins.str] organization: Numerical ID of the parent organization.
        :param pulumi.Input[builtins.str] type: Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        :param pulumi.Input[builtins.str] update_time: The time at which the custom module was last updated.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
               up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if enablement_state is not None:
            pulumi.set(__self__, "enablement_state", enablement_state)
        if last_editor is not None:
            pulumi.set(__self__, "last_editor", last_editor)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization is not None:
            pulumi.set(__self__, "organization", organization)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Config for the module. For the resident module, its config value is defined at this level.
        For the inherited module, its config value is inherited from the ancestor module.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The human readable name to be displayed for the module.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="enablementState")
    def enablement_state(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The state of enablement for the module at the given level of the hierarchy.
        Possible values are: `ENABLED`, `DISABLED`.
        """
        return pulumi.get(self, "enablement_state")

    @enablement_state.setter
    def enablement_state(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "enablement_state", value)

    @property
    @pulumi.getter(name="lastEditor")
    def last_editor(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The editor that last updated the custom module
        """
        return pulumi.get(self, "last_editor")

    @last_editor.setter
    def last_editor(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "last_editor", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Location ID of the parent organization. Only global is supported at the moment.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The resource name of the Event Threat Detection custom module.
        Its format is "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{eventThreatDetectionCustomModule}".
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def organization(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Numerical ID of the parent organization.
        """
        return pulumi.get(self, "organization")

    @organization.setter
    def organization(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "organization", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The time at which the custom module was last updated.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:securitycenter/managementOrganizationEventThreatDetectionCustomModule:ManagementOrganizationEventThreatDetectionCustomModule")
class ManagementOrganizationEventThreatDetectionCustomModule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 enablement_state: Optional[pulumi.Input[builtins.str]] = None,
                 location: Optional[pulumi.Input[builtins.str]] = None,
                 organization: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Represents an instance of an Event Threat Detection custom module, including
        its full module name, display name, enablement state, and last updated time.
        You can create a custom module at the organization level only.

        To get more information about OrganizationEventThreatDetectionCustomModule, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/organizations.locations.eventThreatDetectionCustomModules)
        * How-to Guides
            * [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)

        ## Example Usage

        ## Import

        OrganizationEventThreatDetectionCustomModule can be imported using any of these accepted formats:

        * `organizations/{{organization}}/locations/{{location}}/eventThreatDetectionCustomModules/{{name}}`

        * `{{organization}}/{{location}}/{{name}}`

        When using the `pulumi import` command, OrganizationEventThreatDetectionCustomModule can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securitycenter/managementOrganizationEventThreatDetectionCustomModule:ManagementOrganizationEventThreatDetectionCustomModule default organizations/{{organization}}/locations/{{location}}/eventThreatDetectionCustomModules/{{name}}
        ```

        ```sh
        $ pulumi import gcp:securitycenter/managementOrganizationEventThreatDetectionCustomModule:ManagementOrganizationEventThreatDetectionCustomModule default {{organization}}/{{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] config: Config for the module. For the resident module, its config value is defined at this level.
               For the inherited module, its config value is inherited from the ancestor module.
        :param pulumi.Input[builtins.str] display_name: The human readable name to be displayed for the module.
        :param pulumi.Input[builtins.str] enablement_state: The state of enablement for the module at the given level of the hierarchy.
               Possible values are: `ENABLED`, `DISABLED`.
        :param pulumi.Input[builtins.str] location: Location ID of the parent organization. Only global is supported at the moment.
        :param pulumi.Input[builtins.str] organization: Numerical ID of the parent organization.
        :param pulumi.Input[builtins.str] type: Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagementOrganizationEventThreatDetectionCustomModuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Represents an instance of an Event Threat Detection custom module, including
        its full module name, display name, enablement state, and last updated time.
        You can create a custom module at the organization level only.

        To get more information about OrganizationEventThreatDetectionCustomModule, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/organizations.locations.eventThreatDetectionCustomModules)
        * How-to Guides
            * [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)

        ## Example Usage

        ## Import

        OrganizationEventThreatDetectionCustomModule can be imported using any of these accepted formats:

        * `organizations/{{organization}}/locations/{{location}}/eventThreatDetectionCustomModules/{{name}}`

        * `{{organization}}/{{location}}/{{name}}`

        When using the `pulumi import` command, OrganizationEventThreatDetectionCustomModule can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securitycenter/managementOrganizationEventThreatDetectionCustomModule:ManagementOrganizationEventThreatDetectionCustomModule default organizations/{{organization}}/locations/{{location}}/eventThreatDetectionCustomModules/{{name}}
        ```

        ```sh
        $ pulumi import gcp:securitycenter/managementOrganizationEventThreatDetectionCustomModule:ManagementOrganizationEventThreatDetectionCustomModule default {{organization}}/{{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param ManagementOrganizationEventThreatDetectionCustomModuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagementOrganizationEventThreatDetectionCustomModuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 enablement_state: Optional[pulumi.Input[builtins.str]] = None,
                 location: Optional[pulumi.Input[builtins.str]] = None,
                 organization: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagementOrganizationEventThreatDetectionCustomModuleArgs.__new__(ManagementOrganizationEventThreatDetectionCustomModuleArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["enablement_state"] = enablement_state
            __props__.__dict__["location"] = location
            if organization is None and not opts.urn:
                raise TypeError("Missing required property 'organization'")
            __props__.__dict__["organization"] = organization
            __props__.__dict__["type"] = type
            __props__.__dict__["last_editor"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["update_time"] = None
        super(ManagementOrganizationEventThreatDetectionCustomModule, __self__).__init__(
            'gcp:securitycenter/managementOrganizationEventThreatDetectionCustomModule:ManagementOrganizationEventThreatDetectionCustomModule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[builtins.str]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            enablement_state: Optional[pulumi.Input[builtins.str]] = None,
            last_editor: Optional[pulumi.Input[builtins.str]] = None,
            location: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            organization: Optional[pulumi.Input[builtins.str]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None,
            update_time: Optional[pulumi.Input[builtins.str]] = None) -> 'ManagementOrganizationEventThreatDetectionCustomModule':
        """
        Get an existing ManagementOrganizationEventThreatDetectionCustomModule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] config: Config for the module. For the resident module, its config value is defined at this level.
               For the inherited module, its config value is inherited from the ancestor module.
        :param pulumi.Input[builtins.str] display_name: The human readable name to be displayed for the module.
        :param pulumi.Input[builtins.str] enablement_state: The state of enablement for the module at the given level of the hierarchy.
               Possible values are: `ENABLED`, `DISABLED`.
        :param pulumi.Input[builtins.str] last_editor: The editor that last updated the custom module
        :param pulumi.Input[builtins.str] location: Location ID of the parent organization. Only global is supported at the moment.
        :param pulumi.Input[builtins.str] name: The resource name of the Event Threat Detection custom module.
               Its format is "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{eventThreatDetectionCustomModule}".
        :param pulumi.Input[builtins.str] organization: Numerical ID of the parent organization.
        :param pulumi.Input[builtins.str] type: Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        :param pulumi.Input[builtins.str] update_time: The time at which the custom module was last updated.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
               up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagementOrganizationEventThreatDetectionCustomModuleState.__new__(_ManagementOrganizationEventThreatDetectionCustomModuleState)

        __props__.__dict__["config"] = config
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["enablement_state"] = enablement_state
        __props__.__dict__["last_editor"] = last_editor
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["organization"] = organization
        __props__.__dict__["type"] = type
        __props__.__dict__["update_time"] = update_time
        return ManagementOrganizationEventThreatDetectionCustomModule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Config for the module. For the resident module, its config value is defined at this level.
        For the inherited module, its config value is inherited from the ancestor module.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The human readable name to be displayed for the module.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="enablementState")
    def enablement_state(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The state of enablement for the module at the given level of the hierarchy.
        Possible values are: `ENABLED`, `DISABLED`.
        """
        return pulumi.get(self, "enablement_state")

    @property
    @pulumi.getter(name="lastEditor")
    def last_editor(self) -> pulumi.Output[builtins.str]:
        """
        The editor that last updated the custom module
        """
        return pulumi.get(self, "last_editor")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Location ID of the parent organization. Only global is supported at the moment.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The resource name of the Event Threat Detection custom module.
        Its format is "organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{eventThreatDetectionCustomModule}".
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def organization(self) -> pulumi.Output[builtins.str]:
        """
        Numerical ID of the parent organization.
        """
        return pulumi.get(self, "organization")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[builtins.str]:
        """
        The time at which the custom module was last updated.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

