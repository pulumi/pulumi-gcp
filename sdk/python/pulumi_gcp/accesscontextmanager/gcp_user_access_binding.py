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

__all__ = ['GcpUserAccessBindingArgs', 'GcpUserAccessBinding']

@pulumi.input_type
class GcpUserAccessBindingArgs:
    def __init__(__self__, *,
                 group_key: pulumi.Input[_builtins.str],
                 organization_id: pulumi.Input[_builtins.str],
                 access_levels: Optional[pulumi.Input[_builtins.str]] = None,
                 scoped_access_settings: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]]] = None,
                 session_settings: Optional[pulumi.Input['GcpUserAccessBindingSessionSettingsArgs']] = None):
        """
        The set of arguments for constructing a GcpUserAccessBinding resource.
        :param pulumi.Input[_builtins.str] group_key: Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        :param pulumi.Input[_builtins.str] organization_id: Required. ID of the parent organization.
        :param pulumi.Input[_builtins.str] access_levels: Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        :param pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]] scoped_access_settings: Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
               Structure is documented below.
        :param pulumi.Input['GcpUserAccessBindingSessionSettingsArgs'] session_settings: Optional. The Google Cloud session length (GCSL) policy for the group key.
               Structure is documented below.
        """
        pulumi.set(__self__, "group_key", group_key)
        pulumi.set(__self__, "organization_id", organization_id)
        if access_levels is not None:
            pulumi.set(__self__, "access_levels", access_levels)
        if scoped_access_settings is not None:
            pulumi.set(__self__, "scoped_access_settings", scoped_access_settings)
        if session_settings is not None:
            pulumi.set(__self__, "session_settings", session_settings)

    @_builtins.property
    @pulumi.getter(name="groupKey")
    def group_key(self) -> pulumi.Input[_builtins.str]:
        """
        Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        """
        return pulumi.get(self, "group_key")

    @group_key.setter
    def group_key(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "group_key", value)

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[_builtins.str]:
        """
        Required. ID of the parent organization.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "organization_id", value)

    @_builtins.property
    @pulumi.getter(name="accessLevels")
    def access_levels(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        """
        return pulumi.get(self, "access_levels")

    @access_levels.setter
    def access_levels(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "access_levels", value)

    @_builtins.property
    @pulumi.getter(name="scopedAccessSettings")
    def scoped_access_settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]]]:
        """
        Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
        Structure is documented below.
        """
        return pulumi.get(self, "scoped_access_settings")

    @scoped_access_settings.setter
    def scoped_access_settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]]]):
        pulumi.set(self, "scoped_access_settings", value)

    @_builtins.property
    @pulumi.getter(name="sessionSettings")
    def session_settings(self) -> Optional[pulumi.Input['GcpUserAccessBindingSessionSettingsArgs']]:
        """
        Optional. The Google Cloud session length (GCSL) policy for the group key.
        Structure is documented below.
        """
        return pulumi.get(self, "session_settings")

    @session_settings.setter
    def session_settings(self, value: Optional[pulumi.Input['GcpUserAccessBindingSessionSettingsArgs']]):
        pulumi.set(self, "session_settings", value)


@pulumi.input_type
class _GcpUserAccessBindingState:
    def __init__(__self__, *,
                 access_levels: Optional[pulumi.Input[_builtins.str]] = None,
                 group_key: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scoped_access_settings: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]]] = None,
                 session_settings: Optional[pulumi.Input['GcpUserAccessBindingSessionSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering GcpUserAccessBinding resources.
        :param pulumi.Input[_builtins.str] access_levels: Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        :param pulumi.Input[_builtins.str] group_key: Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        :param pulumi.Input[_builtins.str] name: Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
        :param pulumi.Input[_builtins.str] organization_id: Required. ID of the parent organization.
        :param pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]] scoped_access_settings: Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
               Structure is documented below.
        :param pulumi.Input['GcpUserAccessBindingSessionSettingsArgs'] session_settings: Optional. The Google Cloud session length (GCSL) policy for the group key.
               Structure is documented below.
        """
        if access_levels is not None:
            pulumi.set(__self__, "access_levels", access_levels)
        if group_key is not None:
            pulumi.set(__self__, "group_key", group_key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if scoped_access_settings is not None:
            pulumi.set(__self__, "scoped_access_settings", scoped_access_settings)
        if session_settings is not None:
            pulumi.set(__self__, "session_settings", session_settings)

    @_builtins.property
    @pulumi.getter(name="accessLevels")
    def access_levels(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        """
        return pulumi.get(self, "access_levels")

    @access_levels.setter
    def access_levels(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "access_levels", value)

    @_builtins.property
    @pulumi.getter(name="groupKey")
    def group_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        """
        return pulumi.get(self, "group_key")

    @group_key.setter
    def group_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "group_key", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Required. ID of the parent organization.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "organization_id", value)

    @_builtins.property
    @pulumi.getter(name="scopedAccessSettings")
    def scoped_access_settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]]]:
        """
        Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
        Structure is documented below.
        """
        return pulumi.get(self, "scoped_access_settings")

    @scoped_access_settings.setter
    def scoped_access_settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GcpUserAccessBindingScopedAccessSettingArgs']]]]):
        pulumi.set(self, "scoped_access_settings", value)

    @_builtins.property
    @pulumi.getter(name="sessionSettings")
    def session_settings(self) -> Optional[pulumi.Input['GcpUserAccessBindingSessionSettingsArgs']]:
        """
        Optional. The Google Cloud session length (GCSL) policy for the group key.
        Structure is documented below.
        """
        return pulumi.get(self, "session_settings")

    @session_settings.setter
    def session_settings(self, value: Optional[pulumi.Input['GcpUserAccessBindingSessionSettingsArgs']]):
        pulumi.set(self, "session_settings", value)


@pulumi.type_token("gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding")
class GcpUserAccessBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_levels: Optional[pulumi.Input[_builtins.str]] = None,
                 group_key: Optional[pulumi.Input[_builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scoped_access_settings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GcpUserAccessBindingScopedAccessSettingArgs', 'GcpUserAccessBindingScopedAccessSettingArgsDict']]]]] = None,
                 session_settings: Optional[pulumi.Input[Union['GcpUserAccessBindingSessionSettingsArgs', 'GcpUserAccessBindingSessionSettingsArgsDict']]] = None,
                 __props__=None):
        """
        Restricts access to Cloud Console and Google Cloud APIs for a set of users using Context-Aware Access.

        To get more information about GcpUserAccessBinding, see:

        * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/organizations.gcpUserAccessBindings)

        ## Example Usage

        ### Access Context Manager Gcp User Access Binding Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_std as std

        group = gcp.cloudidentity.Group("group",
            display_name="my-identity-group",
            parent="customers/A01b123xz",
            group_key={
                "id": "my-identity-group@example.com",
            },
            labels={
                "cloudidentity.googleapis.com/groups.discussion_forum": "",
            })
        access_policy = gcp.accesscontextmanager.AccessPolicy("access-policy",
            parent="organizations/123456789",
            title="my policy")
        access_level_id_for_user_access_binding = gcp.accesscontextmanager.AccessLevel("access_level_id_for_user_access_binding",
            parent=access_policy.name.apply(lambda name: f"accessPolicies/{name}"),
            name=access_policy.name.apply(lambda name: f"accessPolicies/{name}/accessLevels/chromeos_no_lock"),
            title="chromeos_no_lock",
            basic={
                "conditions": [{
                    "device_policy": {
                        "require_screen_lock": True,
                        "os_constraints": [{
                            "os_type": "DESKTOP_CHROME_OS",
                        }],
                    },
                    "regions": ["US"],
                }],
            })
        gcp_user_access_binding = gcp.accesscontextmanager.GcpUserAccessBinding("gcp_user_access_binding",
            organization_id="123456789",
            group_key=std.trimprefix_output(input=group.id,
                prefix="groups/").apply(lambda invoke: invoke.result),
            access_levels=access_level_id_for_user_access_binding.name)
        ```

        ## Import

        GcpUserAccessBinding can be imported using any of these accepted formats:

        * `{{name}}`

        When using the `pulumi import` command, GcpUserAccessBinding can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] access_levels: Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        :param pulumi.Input[_builtins.str] group_key: Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        :param pulumi.Input[_builtins.str] organization_id: Required. ID of the parent organization.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GcpUserAccessBindingScopedAccessSettingArgs', 'GcpUserAccessBindingScopedAccessSettingArgsDict']]]] scoped_access_settings: Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
               Structure is documented below.
        :param pulumi.Input[Union['GcpUserAccessBindingSessionSettingsArgs', 'GcpUserAccessBindingSessionSettingsArgsDict']] session_settings: Optional. The Google Cloud session length (GCSL) policy for the group key.
               Structure is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GcpUserAccessBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Restricts access to Cloud Console and Google Cloud APIs for a set of users using Context-Aware Access.

        To get more information about GcpUserAccessBinding, see:

        * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/organizations.gcpUserAccessBindings)

        ## Example Usage

        ### Access Context Manager Gcp User Access Binding Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_std as std

        group = gcp.cloudidentity.Group("group",
            display_name="my-identity-group",
            parent="customers/A01b123xz",
            group_key={
                "id": "my-identity-group@example.com",
            },
            labels={
                "cloudidentity.googleapis.com/groups.discussion_forum": "",
            })
        access_policy = gcp.accesscontextmanager.AccessPolicy("access-policy",
            parent="organizations/123456789",
            title="my policy")
        access_level_id_for_user_access_binding = gcp.accesscontextmanager.AccessLevel("access_level_id_for_user_access_binding",
            parent=access_policy.name.apply(lambda name: f"accessPolicies/{name}"),
            name=access_policy.name.apply(lambda name: f"accessPolicies/{name}/accessLevels/chromeos_no_lock"),
            title="chromeos_no_lock",
            basic={
                "conditions": [{
                    "device_policy": {
                        "require_screen_lock": True,
                        "os_constraints": [{
                            "os_type": "DESKTOP_CHROME_OS",
                        }],
                    },
                    "regions": ["US"],
                }],
            })
        gcp_user_access_binding = gcp.accesscontextmanager.GcpUserAccessBinding("gcp_user_access_binding",
            organization_id="123456789",
            group_key=std.trimprefix_output(input=group.id,
                prefix="groups/").apply(lambda invoke: invoke.result),
            access_levels=access_level_id_for_user_access_binding.name)
        ```

        ## Import

        GcpUserAccessBinding can be imported using any of these accepted formats:

        * `{{name}}`

        When using the `pulumi import` command, GcpUserAccessBinding can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param GcpUserAccessBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GcpUserAccessBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_levels: Optional[pulumi.Input[_builtins.str]] = None,
                 group_key: Optional[pulumi.Input[_builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scoped_access_settings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GcpUserAccessBindingScopedAccessSettingArgs', 'GcpUserAccessBindingScopedAccessSettingArgsDict']]]]] = None,
                 session_settings: Optional[pulumi.Input[Union['GcpUserAccessBindingSessionSettingsArgs', 'GcpUserAccessBindingSessionSettingsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GcpUserAccessBindingArgs.__new__(GcpUserAccessBindingArgs)

            __props__.__dict__["access_levels"] = access_levels
            if group_key is None and not opts.urn:
                raise TypeError("Missing required property 'group_key'")
            __props__.__dict__["group_key"] = group_key
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["scoped_access_settings"] = scoped_access_settings
            __props__.__dict__["session_settings"] = session_settings
            __props__.__dict__["name"] = None
        super(GcpUserAccessBinding, __self__).__init__(
            'gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_levels: Optional[pulumi.Input[_builtins.str]] = None,
            group_key: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            organization_id: Optional[pulumi.Input[_builtins.str]] = None,
            scoped_access_settings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GcpUserAccessBindingScopedAccessSettingArgs', 'GcpUserAccessBindingScopedAccessSettingArgsDict']]]]] = None,
            session_settings: Optional[pulumi.Input[Union['GcpUserAccessBindingSessionSettingsArgs', 'GcpUserAccessBindingSessionSettingsArgsDict']]] = None) -> 'GcpUserAccessBinding':
        """
        Get an existing GcpUserAccessBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] access_levels: Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        :param pulumi.Input[_builtins.str] group_key: Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        :param pulumi.Input[_builtins.str] name: Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
        :param pulumi.Input[_builtins.str] organization_id: Required. ID of the parent organization.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GcpUserAccessBindingScopedAccessSettingArgs', 'GcpUserAccessBindingScopedAccessSettingArgsDict']]]] scoped_access_settings: Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
               Structure is documented below.
        :param pulumi.Input[Union['GcpUserAccessBindingSessionSettingsArgs', 'GcpUserAccessBindingSessionSettingsArgsDict']] session_settings: Optional. The Google Cloud session length (GCSL) policy for the group key.
               Structure is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GcpUserAccessBindingState.__new__(_GcpUserAccessBindingState)

        __props__.__dict__["access_levels"] = access_levels
        __props__.__dict__["group_key"] = group_key
        __props__.__dict__["name"] = name
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["scoped_access_settings"] = scoped_access_settings
        __props__.__dict__["session_settings"] = session_settings
        return GcpUserAccessBinding(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accessLevels")
    def access_levels(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
        """
        return pulumi.get(self, "access_levels")

    @_builtins.property
    @pulumi.getter(name="groupKey")
    def group_key(self) -> pulumi.Output[_builtins.str]:
        """
        Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
        """
        return pulumi.get(self, "group_key")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[_builtins.str]:
        """
        Required. ID of the parent organization.
        """
        return pulumi.get(self, "organization_id")

    @_builtins.property
    @pulumi.getter(name="scopedAccessSettings")
    def scoped_access_settings(self) -> pulumi.Output[Optional[Sequence['outputs.GcpUserAccessBindingScopedAccessSetting']]]:
        """
        Optional. A list of scoped access settings that set this binding's restrictions on a subset of applications.
        Structure is documented below.
        """
        return pulumi.get(self, "scoped_access_settings")

    @_builtins.property
    @pulumi.getter(name="sessionSettings")
    def session_settings(self) -> pulumi.Output[Optional['outputs.GcpUserAccessBindingSessionSettings']]:
        """
        Optional. The Google Cloud session length (GCSL) policy for the group key.
        Structure is documented below.
        """
        return pulumi.get(self, "session_settings")

