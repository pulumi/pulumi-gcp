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

__all__ = ['TagValueIamMemberArgs', 'TagValueIamMember']

@pulumi.input_type
class TagValueIamMemberArgs:
    def __init__(__self__, *,
                 member: pulumi.Input[_builtins.str],
                 role: pulumi.Input[_builtins.str],
                 tag_value: pulumi.Input[_builtins.str],
                 condition: Optional[pulumi.Input['TagValueIamMemberConditionArgs']] = None):
        """
        The set of arguments for constructing a TagValueIamMember resource.
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        :param pulumi.Input[_builtins.str] tag_value: Used to find the parent resource to bind the IAM policy to
        """
        pulumi.set(__self__, "member", member)
        pulumi.set(__self__, "role", role)
        pulumi.set(__self__, "tag_value", tag_value)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Input[_builtins.str]:
        """
        Identities that will be granted the privilege in `role`.
        Each entry can have one of the following values:
        * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Input[_builtins.str]:
        """
        The role that should be applied. Only one
        `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
        `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role", value)

    @_builtins.property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> pulumi.Input[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "tag_value")

    @tag_value.setter
    def tag_value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "tag_value", value)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['TagValueIamMemberConditionArgs']]:
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['TagValueIamMemberConditionArgs']]):
        pulumi.set(self, "condition", value)


@pulumi.input_type
class _TagValueIamMemberState:
    def __init__(__self__, *,
                 condition: Optional[pulumi.Input['TagValueIamMemberConditionArgs']] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 tag_value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TagValueIamMember resources.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        :param pulumi.Input[_builtins.str] tag_value: Used to find the parent resource to bind the IAM policy to
        """
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if member is not None:
            pulumi.set(__self__, "member", member)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if tag_value is not None:
            pulumi.set(__self__, "tag_value", tag_value)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['TagValueIamMemberConditionArgs']]:
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['TagValueIamMemberConditionArgs']]):
        pulumi.set(self, "condition", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter
    def member(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identities that will be granted the privilege in `role`.
        Each entry can have one of the following values:
        * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The role that should be applied. Only one
        `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
        `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role", value)

    @_builtins.property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "tag_value")

    @tag_value.setter
    def tag_value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tag_value", value)


@pulumi.type_token("gcp:tags/tagValueIamMember:TagValueIamMember")
class TagValueIamMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[Union['TagValueIamMemberConditionArgs', 'TagValueIamMemberConditionArgsDict']]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 tag_value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Three different resources help you manage your IAM policy for Tags TagValue. Each of these resources serves a different use case:

        * `tags.TagValueIamPolicy`: Authoritative. Sets the IAM policy for the tagvalue and replaces any existing policy already attached.
        * `tags.TagValueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagvalue are preserved.
        * `tags.TagValueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagvalue are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `tags.TagValueIamPolicy`: Retrieves the IAM policy for the tagvalue

        > **Note:** `tags.TagValueIamPolicy` **cannot** be used in conjunction with `tags.TagValueIamBinding` and `tags.TagValueIamMember` or they will fight over what your policy should be.

        > **Note:** `tags.TagValueIamBinding` resources **can be** used in conjunction with `tags.TagValueIamMember` resources **only if** they do not grant privilege to the same role.

        ## tags.TagValueIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.tags.TagValueIamPolicy("policy",
            tag_value=value["name"],
            policy_data=admin.policy_data)
        ```

        ## tags.TagValueIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.tags.TagValueIamBinding("binding",
            tag_value=value["name"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## tags.TagValueIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.tags.TagValueIamMember("member",
            tag_value=value["name"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

        full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
        ---

        # IAM policy for Tags TagValue
        Three different resources help you manage your IAM policy for Tags TagValue. Each of these resources serves a different use case:

        * `tags.TagValueIamPolicy`: Authoritative. Sets the IAM policy for the tagvalue and replaces any existing policy already attached.
        * `tags.TagValueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagvalue are preserved.
        * `tags.TagValueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagvalue are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `tags.TagValueIamPolicy`: Retrieves the IAM policy for the tagvalue

        > **Note:** `tags.TagValueIamPolicy` **cannot** be used in conjunction with `tags.TagValueIamBinding` and `tags.TagValueIamMember` or they will fight over what your policy should be.

        > **Note:** `tags.TagValueIamBinding` resources **can be** used in conjunction with `tags.TagValueIamMember` resources **only if** they do not grant privilege to the same role.

        ## tags.TagValueIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.tags.TagValueIamPolicy("policy",
            tag_value=value["name"],
            policy_data=admin.policy_data)
        ```

        ## tags.TagValueIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.tags.TagValueIamBinding("binding",
            tag_value=value["name"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## tags.TagValueIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.tags.TagValueIamMember("member",
            tag_value=value["name"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * tagValues/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Tags tagvalue IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor "tagValues/{{tag_value}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor "tagValues/{{tag_value}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor tagValues/{{tag_value}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        :param pulumi.Input[_builtins.str] tag_value: Used to find the parent resource to bind the IAM policy to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TagValueIamMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Three different resources help you manage your IAM policy for Tags TagValue. Each of these resources serves a different use case:

        * `tags.TagValueIamPolicy`: Authoritative. Sets the IAM policy for the tagvalue and replaces any existing policy already attached.
        * `tags.TagValueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagvalue are preserved.
        * `tags.TagValueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagvalue are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `tags.TagValueIamPolicy`: Retrieves the IAM policy for the tagvalue

        > **Note:** `tags.TagValueIamPolicy` **cannot** be used in conjunction with `tags.TagValueIamBinding` and `tags.TagValueIamMember` or they will fight over what your policy should be.

        > **Note:** `tags.TagValueIamBinding` resources **can be** used in conjunction with `tags.TagValueIamMember` resources **only if** they do not grant privilege to the same role.

        ## tags.TagValueIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.tags.TagValueIamPolicy("policy",
            tag_value=value["name"],
            policy_data=admin.policy_data)
        ```

        ## tags.TagValueIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.tags.TagValueIamBinding("binding",
            tag_value=value["name"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## tags.TagValueIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.tags.TagValueIamMember("member",
            tag_value=value["name"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

        full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
        ---

        # IAM policy for Tags TagValue
        Three different resources help you manage your IAM policy for Tags TagValue. Each of these resources serves a different use case:

        * `tags.TagValueIamPolicy`: Authoritative. Sets the IAM policy for the tagvalue and replaces any existing policy already attached.
        * `tags.TagValueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagvalue are preserved.
        * `tags.TagValueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagvalue are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `tags.TagValueIamPolicy`: Retrieves the IAM policy for the tagvalue

        > **Note:** `tags.TagValueIamPolicy` **cannot** be used in conjunction with `tags.TagValueIamBinding` and `tags.TagValueIamMember` or they will fight over what your policy should be.

        > **Note:** `tags.TagValueIamBinding` resources **can be** used in conjunction with `tags.TagValueIamMember` resources **only if** they do not grant privilege to the same role.

        ## tags.TagValueIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.tags.TagValueIamPolicy("policy",
            tag_value=value["name"],
            policy_data=admin.policy_data)
        ```

        ## tags.TagValueIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.tags.TagValueIamBinding("binding",
            tag_value=value["name"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## tags.TagValueIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.tags.TagValueIamMember("member",
            tag_value=value["name"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * tagValues/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Tags tagvalue IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor "tagValues/{{tag_value}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor "tagValues/{{tag_value}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor tagValues/{{tag_value}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param TagValueIamMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagValueIamMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[Union['TagValueIamMemberConditionArgs', 'TagValueIamMemberConditionArgsDict']]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 tag_value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagValueIamMemberArgs.__new__(TagValueIamMemberArgs)

            __props__.__dict__["condition"] = condition
            if member is None and not opts.urn:
                raise TypeError("Missing required property 'member'")
            __props__.__dict__["member"] = member
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            if tag_value is None and not opts.urn:
                raise TypeError("Missing required property 'tag_value'")
            __props__.__dict__["tag_value"] = tag_value
            __props__.__dict__["etag"] = None
        super(TagValueIamMember, __self__).__init__(
            'gcp:tags/tagValueIamMember:TagValueIamMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            condition: Optional[pulumi.Input[Union['TagValueIamMemberConditionArgs', 'TagValueIamMemberConditionArgsDict']]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            member: Optional[pulumi.Input[_builtins.str]] = None,
            role: Optional[pulumi.Input[_builtins.str]] = None,
            tag_value: Optional[pulumi.Input[_builtins.str]] = None) -> 'TagValueIamMember':
        """
        Get an existing TagValueIamMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        :param pulumi.Input[_builtins.str] tag_value: Used to find the parent resource to bind the IAM policy to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagValueIamMemberState.__new__(_TagValueIamMemberState)

        __props__.__dict__["condition"] = condition
        __props__.__dict__["etag"] = etag
        __props__.__dict__["member"] = member
        __props__.__dict__["role"] = role
        __props__.__dict__["tag_value"] = tag_value
        return TagValueIamMember(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> pulumi.Output[Optional['outputs.TagValueIamMemberCondition']]:
        return pulumi.get(self, "condition")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Output[_builtins.str]:
        """
        Identities that will be granted the privilege in `role`.
        Each entry can have one of the following values:
        * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        """
        return pulumi.get(self, "member")

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Output[_builtins.str]:
        """
        The role that should be applied. Only one
        `tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
        `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        return pulumi.get(self, "role")

    @_builtins.property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> pulumi.Output[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "tag_value")

