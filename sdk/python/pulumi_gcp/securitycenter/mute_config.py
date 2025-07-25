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

__all__ = ['MuteConfigArgs', 'MuteConfig']

@pulumi.input_type
class MuteConfigArgs:
    def __init__(__self__, *,
                 filter: pulumi.Input[_builtins.str],
                 mute_config_id: pulumi.Input[_builtins.str],
                 parent: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expiry_time: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a MuteConfig resource.
        :param pulumi.Input[_builtins.str] filter: An expression that defines the filter to apply across create/update
               events of findings. While creating a filter string, be mindful of
               the scope in which the mute configuration is being created. E.g.,
               If a filter contains project = X but is created under the
               project = Y scope, it might not match any findings.
        :param pulumi.Input[_builtins.str] mute_config_id: Unique identifier provided by the client within the parent scope.
        :param pulumi.Input[_builtins.str] parent: Resource name of the new mute configs's parent. Its format is
               "organizations/[organization_id]", "folders/[folder_id]", or
               "projects/[project_id]".
        :param pulumi.Input[_builtins.str] description: A description of the mute config.
        :param pulumi.Input[_builtins.str] expiry_time: Optional. The expiry of the mute config. Only applicable for dynamic configs.
               If the expiry is set, when the config expires, it is removed from all findings.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
               nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[_builtins.str] type: The type of the mute config, which determines what type of mute state the config affects.
               Default value is `DYNAMIC`.
               Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        """
        pulumi.set(__self__, "filter", filter)
        pulumi.set(__self__, "mute_config_id", mute_config_id)
        pulumi.set(__self__, "parent", parent)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expiry_time is not None:
            pulumi.set(__self__, "expiry_time", expiry_time)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> pulumi.Input[_builtins.str]:
        """
        An expression that defines the filter to apply across create/update
        events of findings. While creating a filter string, be mindful of
        the scope in which the mute configuration is being created. E.g.,
        If a filter contains project = X but is created under the
        project = Y scope, it might not match any findings.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "filter", value)

    @_builtins.property
    @pulumi.getter(name="muteConfigId")
    def mute_config_id(self) -> pulumi.Input[_builtins.str]:
        """
        Unique identifier provided by the client within the parent scope.
        """
        return pulumi.get(self, "mute_config_id")

    @mute_config_id.setter
    def mute_config_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "mute_config_id", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Input[_builtins.str]:
        """
        Resource name of the new mute configs's parent. Its format is
        "organizations/[organization_id]", "folders/[folder_id]", or
        "projects/[project_id]".
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the mute config.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="expiryTime")
    def expiry_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. The expiry of the mute config. Only applicable for dynamic configs.
        If the expiry is set, when the config expires, it is removed from all findings.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
        nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "expiry_time")

    @expiry_time.setter
    def expiry_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "expiry_time", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the mute config, which determines what type of mute state the config affects.
        Default value is `DYNAMIC`.
        Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _MuteConfigState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expiry_time: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 most_recent_editor: Optional[pulumi.Input[_builtins.str]] = None,
                 mute_config_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering MuteConfig resources.
        :param pulumi.Input[_builtins.str] create_time: The time at which the mute config was created. This field is set by
               the server and will be ignored if provided on config creation.
        :param pulumi.Input[_builtins.str] description: A description of the mute config.
        :param pulumi.Input[_builtins.str] expiry_time: Optional. The expiry of the mute config. Only applicable for dynamic configs.
               If the expiry is set, when the config expires, it is removed from all findings.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
               nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[_builtins.str] filter: An expression that defines the filter to apply across create/update
               events of findings. While creating a filter string, be mindful of
               the scope in which the mute configuration is being created. E.g.,
               If a filter contains project = X but is created under the
               project = Y scope, it might not match any findings.
        :param pulumi.Input[_builtins.str] most_recent_editor: Email address of the user who last edited the mute config. This
               field is set by the server and will be ignored if provided on
               config creation or update.
        :param pulumi.Input[_builtins.str] mute_config_id: Unique identifier provided by the client within the parent scope.
        :param pulumi.Input[_builtins.str] name: Name of the mute config. Its format is
               organizations/{organization}/muteConfigs/{configId},
               folders/{folder}/muteConfigs/{configId},
               or projects/{project}/muteConfigs/{configId}
        :param pulumi.Input[_builtins.str] parent: Resource name of the new mute configs's parent. Its format is
               "organizations/[organization_id]", "folders/[folder_id]", or
               "projects/[project_id]".
        :param pulumi.Input[_builtins.str] type: The type of the mute config, which determines what type of mute state the config affects.
               Default value is `DYNAMIC`.
               Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        :param pulumi.Input[_builtins.str] update_time: Output only. The most recent time at which the mute config was
               updated. This field is set by the server and will be ignored if
               provided on config creation or update.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expiry_time is not None:
            pulumi.set(__self__, "expiry_time", expiry_time)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if most_recent_editor is not None:
            pulumi.set(__self__, "most_recent_editor", most_recent_editor)
        if mute_config_id is not None:
            pulumi.set(__self__, "mute_config_id", mute_config_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The time at which the mute config was created. This field is set by
        the server and will be ignored if provided on config creation.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the mute config.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="expiryTime")
    def expiry_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. The expiry of the mute config. Only applicable for dynamic configs.
        If the expiry is set, when the config expires, it is removed from all findings.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
        nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "expiry_time")

    @expiry_time.setter
    def expiry_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "expiry_time", value)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An expression that defines the filter to apply across create/update
        events of findings. While creating a filter string, be mindful of
        the scope in which the mute configuration is being created. E.g.,
        If a filter contains project = X but is created under the
        project = Y scope, it might not match any findings.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "filter", value)

    @_builtins.property
    @pulumi.getter(name="mostRecentEditor")
    def most_recent_editor(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Email address of the user who last edited the mute config. This
        field is set by the server and will be ignored if provided on
        config creation or update.
        """
        return pulumi.get(self, "most_recent_editor")

    @most_recent_editor.setter
    def most_recent_editor(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "most_recent_editor", value)

    @_builtins.property
    @pulumi.getter(name="muteConfigId")
    def mute_config_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Unique identifier provided by the client within the parent scope.
        """
        return pulumi.get(self, "mute_config_id")

    @mute_config_id.setter
    def mute_config_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mute_config_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the mute config. Its format is
        organizations/{organization}/muteConfigs/{configId},
        folders/{folder}/muteConfigs/{configId},
        or projects/{project}/muteConfigs/{configId}
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Resource name of the new mute configs's parent. Its format is
        "organizations/[organization_id]", "folders/[folder_id]", or
        "projects/[project_id]".
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the mute config, which determines what type of mute state the config affects.
        Default value is `DYNAMIC`.
        Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. The most recent time at which the mute config was
        updated. This field is set by the server and will be ignored if
        provided on config creation or update.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:securitycenter/muteConfig:MuteConfig")
class MuteConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expiry_time: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 mute_config_id: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Mute Findings is a volume management feature in Security Command Center
        that lets you manually or programmatically hide irrelevant findings,
        and create filters to automatically silence existing and future
        findings based on criteria you specify.

        To get more information about MuteConfig, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.muteConfigs)

        ## Example Usage

        ### Scc Mute Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.securitycenter.MuteConfig("default",
            mute_config_id="my-config",
            parent="organizations/123456789",
            filter="category: \\"OS_VULNERABILITY\\"",
            description="My Mute Config",
            type="DYNAMIC",
            expiry_time="2215-02-03T15:01:23Z")
        ```

        ## Import

        MuteConfig can be imported using any of these accepted formats:

        * `{{name}}`

        When using the `pulumi import` command, MuteConfig can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securitycenter/muteConfig:MuteConfig default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description of the mute config.
        :param pulumi.Input[_builtins.str] expiry_time: Optional. The expiry of the mute config. Only applicable for dynamic configs.
               If the expiry is set, when the config expires, it is removed from all findings.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
               nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[_builtins.str] filter: An expression that defines the filter to apply across create/update
               events of findings. While creating a filter string, be mindful of
               the scope in which the mute configuration is being created. E.g.,
               If a filter contains project = X but is created under the
               project = Y scope, it might not match any findings.
        :param pulumi.Input[_builtins.str] mute_config_id: Unique identifier provided by the client within the parent scope.
        :param pulumi.Input[_builtins.str] parent: Resource name of the new mute configs's parent. Its format is
               "organizations/[organization_id]", "folders/[folder_id]", or
               "projects/[project_id]".
        :param pulumi.Input[_builtins.str] type: The type of the mute config, which determines what type of mute state the config affects.
               Default value is `DYNAMIC`.
               Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MuteConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Mute Findings is a volume management feature in Security Command Center
        that lets you manually or programmatically hide irrelevant findings,
        and create filters to automatically silence existing and future
        findings based on criteria you specify.

        To get more information about MuteConfig, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.muteConfigs)

        ## Example Usage

        ### Scc Mute Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.securitycenter.MuteConfig("default",
            mute_config_id="my-config",
            parent="organizations/123456789",
            filter="category: \\"OS_VULNERABILITY\\"",
            description="My Mute Config",
            type="DYNAMIC",
            expiry_time="2215-02-03T15:01:23Z")
        ```

        ## Import

        MuteConfig can be imported using any of these accepted formats:

        * `{{name}}`

        When using the `pulumi import` command, MuteConfig can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securitycenter/muteConfig:MuteConfig default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param MuteConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MuteConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expiry_time: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 mute_config_id: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MuteConfigArgs.__new__(MuteConfigArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["expiry_time"] = expiry_time
            if filter is None and not opts.urn:
                raise TypeError("Missing required property 'filter'")
            __props__.__dict__["filter"] = filter
            if mute_config_id is None and not opts.urn:
                raise TypeError("Missing required property 'mute_config_id'")
            __props__.__dict__["mute_config_id"] = mute_config_id
            if parent is None and not opts.urn:
                raise TypeError("Missing required property 'parent'")
            __props__.__dict__["parent"] = parent
            __props__.__dict__["type"] = type
            __props__.__dict__["create_time"] = None
            __props__.__dict__["most_recent_editor"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["update_time"] = None
        super(MuteConfig, __self__).__init__(
            'gcp:securitycenter/muteConfig:MuteConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            expiry_time: Optional[pulumi.Input[_builtins.str]] = None,
            filter: Optional[pulumi.Input[_builtins.str]] = None,
            most_recent_editor: Optional[pulumi.Input[_builtins.str]] = None,
            mute_config_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            parent: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'MuteConfig':
        """
        Get an existing MuteConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: The time at which the mute config was created. This field is set by
               the server and will be ignored if provided on config creation.
        :param pulumi.Input[_builtins.str] description: A description of the mute config.
        :param pulumi.Input[_builtins.str] expiry_time: Optional. The expiry of the mute config. Only applicable for dynamic configs.
               If the expiry is set, when the config expires, it is removed from all findings.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
               nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[_builtins.str] filter: An expression that defines the filter to apply across create/update
               events of findings. While creating a filter string, be mindful of
               the scope in which the mute configuration is being created. E.g.,
               If a filter contains project = X but is created under the
               project = Y scope, it might not match any findings.
        :param pulumi.Input[_builtins.str] most_recent_editor: Email address of the user who last edited the mute config. This
               field is set by the server and will be ignored if provided on
               config creation or update.
        :param pulumi.Input[_builtins.str] mute_config_id: Unique identifier provided by the client within the parent scope.
        :param pulumi.Input[_builtins.str] name: Name of the mute config. Its format is
               organizations/{organization}/muteConfigs/{configId},
               folders/{folder}/muteConfigs/{configId},
               or projects/{project}/muteConfigs/{configId}
        :param pulumi.Input[_builtins.str] parent: Resource name of the new mute configs's parent. Its format is
               "organizations/[organization_id]", "folders/[folder_id]", or
               "projects/[project_id]".
        :param pulumi.Input[_builtins.str] type: The type of the mute config, which determines what type of mute state the config affects.
               Default value is `DYNAMIC`.
               Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        :param pulumi.Input[_builtins.str] update_time: Output only. The most recent time at which the mute config was
               updated. This field is set by the server and will be ignored if
               provided on config creation or update.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MuteConfigState.__new__(_MuteConfigState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["expiry_time"] = expiry_time
        __props__.__dict__["filter"] = filter
        __props__.__dict__["most_recent_editor"] = most_recent_editor
        __props__.__dict__["mute_config_id"] = mute_config_id
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        __props__.__dict__["type"] = type
        __props__.__dict__["update_time"] = update_time
        return MuteConfig(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        The time at which the mute config was created. This field is set by
        the server and will be ignored if provided on config creation.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description of the mute config.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="expiryTime")
    def expiry_time(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional. The expiry of the mute config. Only applicable for dynamic configs.
        If the expiry is set, when the config expires, it is removed from all findings.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
        nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "expiry_time")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> pulumi.Output[_builtins.str]:
        """
        An expression that defines the filter to apply across create/update
        events of findings. While creating a filter string, be mindful of
        the scope in which the mute configuration is being created. E.g.,
        If a filter contains project = X but is created under the
        project = Y scope, it might not match any findings.
        """
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter(name="mostRecentEditor")
    def most_recent_editor(self) -> pulumi.Output[_builtins.str]:
        """
        Email address of the user who last edited the mute config. This
        field is set by the server and will be ignored if provided on
        config creation or update.
        """
        return pulumi.get(self, "most_recent_editor")

    @_builtins.property
    @pulumi.getter(name="muteConfigId")
    def mute_config_id(self) -> pulumi.Output[_builtins.str]:
        """
        Unique identifier provided by the client within the parent scope.
        """
        return pulumi.get(self, "mute_config_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the mute config. Its format is
        organizations/{organization}/muteConfigs/{configId},
        folders/{folder}/muteConfigs/{configId},
        or projects/{project}/muteConfigs/{configId}
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Output[_builtins.str]:
        """
        Resource name of the new mute configs's parent. Its format is
        "organizations/[organization_id]", "folders/[folder_id]", or
        "projects/[project_id]".
        """
        return pulumi.get(self, "parent")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The type of the mute config, which determines what type of mute state the config affects.
        Default value is `DYNAMIC`.
        Possible values are: `MUTE_CONFIG_TYPE_UNSPECIFIED`, `STATIC`, `DYNAMIC`.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. The most recent time at which the mute config was
        updated. This field is set by the server and will be ignored if
        provided on config creation or update.
        """
        return pulumi.get(self, "update_time")

