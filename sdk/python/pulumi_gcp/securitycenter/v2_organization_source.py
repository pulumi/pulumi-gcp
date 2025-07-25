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

__all__ = ['V2OrganizationSourceArgs', 'V2OrganizationSource']

@pulumi.input_type
class V2OrganizationSourceArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[_builtins.str],
                 organization: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a V2OrganizationSource resource.
        :param pulumi.Input[_builtins.str] display_name: The source’s display name. A source’s display name must be unique
               amongst its siblings, for example, two sources with the same parent
               can't share the same display name. The display name must start and end
               with a letter or digit, may contain letters, digits, spaces, hyphens,
               and underscores, and can be no longer than 32 characters.
        :param pulumi.Input[_builtins.str] organization: The organization whose Cloud Security Command Center the Source
               lives in.
        :param pulumi.Input[_builtins.str] description: The description of the source (max of 1024 characters).
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "organization", organization)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        The source’s display name. A source’s display name must be unique
        amongst its siblings, for example, two sources with the same parent
        can't share the same display name. The display name must start and end
        with a letter or digit, may contain letters, digits, spaces, hyphens,
        and underscores, and can be no longer than 32 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def organization(self) -> pulumi.Input[_builtins.str]:
        """
        The organization whose Cloud Security Command Center the Source
        lives in.
        """
        return pulumi.get(self, "organization")

    @organization.setter
    def organization(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "organization", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the source (max of 1024 characters).
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _V2OrganizationSourceState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 organization: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering V2OrganizationSource resources.
        :param pulumi.Input[_builtins.str] description: The description of the source (max of 1024 characters).
        :param pulumi.Input[_builtins.str] display_name: The source’s display name. A source’s display name must be unique
               amongst its siblings, for example, two sources with the same parent
               can't share the same display name. The display name must start and end
               with a letter or digit, may contain letters, digits, spaces, hyphens,
               and underscores, and can be no longer than 32 characters.
        :param pulumi.Input[_builtins.str] name: The resource name of this source, in the format
               `organizations/{{organization}}/sources/{{source}}`.
        :param pulumi.Input[_builtins.str] organization: The organization whose Cloud Security Command Center the Source
               lives in.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization is not None:
            pulumi.set(__self__, "organization", organization)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the source (max of 1024 characters).
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The source’s display name. A source’s display name must be unique
        amongst its siblings, for example, two sources with the same parent
        can't share the same display name. The display name must start and end
        with a letter or digit, may contain letters, digits, spaces, hyphens,
        and underscores, and can be no longer than 32 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name of this source, in the format
        `organizations/{{organization}}/sources/{{source}}`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def organization(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The organization whose Cloud Security Command Center the Source
        lives in.
        """
        return pulumi.get(self, "organization")

    @organization.setter
    def organization(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "organization", value)


@pulumi.type_token("gcp:securitycenter/v2OrganizationSource:V2OrganizationSource")
class V2OrganizationSource(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 organization: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A Cloud Security Command Center's (Cloud SCC) finding source. A finding
        source is an entity or a mechanism that can produce a finding. A source is
        like a container of findings that come from the same scanner, logger,
        monitor, etc.

        To get more information about OrganizationSource, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.sources)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/security-command-center/docs)

        ## Example Usage

        ### Scc Source Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        custom_source = gcp.securitycenter.Source("custom_source",
            display_name="My Source",
            organization="123456789",
            description="My custom Cloud Security Command Center Finding Source")
        ```

        ## Import

        OrganizationSource can be imported using any of these accepted formats:

        * `organizations/{{organization}}/sources/{{name}}`

        * `{{organization}}/{{name}}`

        When using the `pulumi import` command, OrganizationSource can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securitycenter/v2OrganizationSource:V2OrganizationSource default organizations/{{organization}}/sources/{{name}}
        ```

        ```sh
        $ pulumi import gcp:securitycenter/v2OrganizationSource:V2OrganizationSource default {{organization}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the source (max of 1024 characters).
        :param pulumi.Input[_builtins.str] display_name: The source’s display name. A source’s display name must be unique
               amongst its siblings, for example, two sources with the same parent
               can't share the same display name. The display name must start and end
               with a letter or digit, may contain letters, digits, spaces, hyphens,
               and underscores, and can be no longer than 32 characters.
        :param pulumi.Input[_builtins.str] organization: The organization whose Cloud Security Command Center the Source
               lives in.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: V2OrganizationSourceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Cloud Security Command Center's (Cloud SCC) finding source. A finding
        source is an entity or a mechanism that can produce a finding. A source is
        like a container of findings that come from the same scanner, logger,
        monitor, etc.

        To get more information about OrganizationSource, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.sources)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/security-command-center/docs)

        ## Example Usage

        ### Scc Source Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        custom_source = gcp.securitycenter.Source("custom_source",
            display_name="My Source",
            organization="123456789",
            description="My custom Cloud Security Command Center Finding Source")
        ```

        ## Import

        OrganizationSource can be imported using any of these accepted formats:

        * `organizations/{{organization}}/sources/{{name}}`

        * `{{organization}}/{{name}}`

        When using the `pulumi import` command, OrganizationSource can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securitycenter/v2OrganizationSource:V2OrganizationSource default organizations/{{organization}}/sources/{{name}}
        ```

        ```sh
        $ pulumi import gcp:securitycenter/v2OrganizationSource:V2OrganizationSource default {{organization}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param V2OrganizationSourceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(V2OrganizationSourceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 organization: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = V2OrganizationSourceArgs.__new__(V2OrganizationSourceArgs)

            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if organization is None and not opts.urn:
                raise TypeError("Missing required property 'organization'")
            __props__.__dict__["organization"] = organization
            __props__.__dict__["name"] = None
        super(V2OrganizationSource, __self__).__init__(
            'gcp:securitycenter/v2OrganizationSource:V2OrganizationSource',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            organization: Optional[pulumi.Input[_builtins.str]] = None) -> 'V2OrganizationSource':
        """
        Get an existing V2OrganizationSource resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the source (max of 1024 characters).
        :param pulumi.Input[_builtins.str] display_name: The source’s display name. A source’s display name must be unique
               amongst its siblings, for example, two sources with the same parent
               can't share the same display name. The display name must start and end
               with a letter or digit, may contain letters, digits, spaces, hyphens,
               and underscores, and can be no longer than 32 characters.
        :param pulumi.Input[_builtins.str] name: The resource name of this source, in the format
               `organizations/{{organization}}/sources/{{source}}`.
        :param pulumi.Input[_builtins.str] organization: The organization whose Cloud Security Command Center the Source
               lives in.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _V2OrganizationSourceState.__new__(_V2OrganizationSourceState)

        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["name"] = name
        __props__.__dict__["organization"] = organization
        return V2OrganizationSource(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the source (max of 1024 characters).
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The source’s display name. A source’s display name must be unique
        amongst its siblings, for example, two sources with the same parent
        can't share the same display name. The display name must start and end
        with a letter or digit, may contain letters, digits, spaces, hyphens,
        and underscores, and can be no longer than 32 characters.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The resource name of this source, in the format
        `organizations/{{organization}}/sources/{{source}}`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def organization(self) -> pulumi.Output[_builtins.str]:
        """
        The organization whose Cloud Security Command Center the Source
        lives in.
        """
        return pulumi.get(self, "organization")

