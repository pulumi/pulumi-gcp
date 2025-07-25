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

__all__ = ['IamMemberRemoveArgs', 'IamMemberRemove']

@pulumi.input_type
class IamMemberRemoveArgs:
    def __init__(__self__, *,
                 member: pulumi.Input[_builtins.str],
                 project: pulumi.Input[_builtins.str],
                 role: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a IamMemberRemove resource.
        :param pulumi.Input[_builtins.str] member: The IAM principal that should not have the target role.
               Each entry can have one of the following values:
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        :param pulumi.Input[_builtins.str] project: The project id of the target project.
        :param pulumi.Input[_builtins.str] role: The target role that should be removed.
        """
        pulumi.set(__self__, "member", member)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "role", role)

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Input[_builtins.str]:
        """
        The IAM principal that should not have the target role.
        Each entry can have one of the following values:
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Input[_builtins.str]:
        """
        The project id of the target project.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Input[_builtins.str]:
        """
        The target role that should be removed.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role", value)


@pulumi.input_type
class _IamMemberRemoveState:
    def __init__(__self__, *,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering IamMemberRemove resources.
        :param pulumi.Input[_builtins.str] member: The IAM principal that should not have the target role.
               Each entry can have one of the following values:
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        :param pulumi.Input[_builtins.str] project: The project id of the target project.
        :param pulumi.Input[_builtins.str] role: The target role that should be removed.
        """
        if member is not None:
            pulumi.set(__self__, "member", member)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @_builtins.property
    @pulumi.getter
    def member(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The IAM principal that should not have the target role.
        Each entry can have one of the following values:
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project id of the target project.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The target role that should be removed.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role", value)


@pulumi.type_token("gcp:projects/iamMemberRemove:IamMemberRemove")
class IamMemberRemove(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Ensures that a member:role pairing does not exist in a project's IAM policy.

        On create, this resource will modify the policy to remove the `member` from the
        `role`. If the membership is ever re-added, the next refresh will clear this
        resource from state, proposing re-adding it to correct the membership. Import is
        not supported- this resource will acquire the current policy and modify it as
        part of creating the resource.

        This resource will conflict with `projects.IAMPolicy` and
        `projects.IAMBinding` resources that share a role, as well as
        `projects.IAMMember` resources that target the same membership. When
        multiple resources conflict the final state is not guaranteed to include or omit
        the membership. Subsequent `pulumi up` calls will always show a diff
        until the configuration is corrected.

        For more information see
        [the official documentation](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
        and
        [API reference](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gcp as gcp

        target_project = gcp.organizations.get_project()
        foo = gcp.projects.IamMemberRemove("foo",
            role="roles/editor",
            project=target_project_google_project["projectId"],
            member=f"serviceAccount:{target_project_google_project['number']}-compute@developer.gserviceaccount.com")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] member: The IAM principal that should not have the target role.
               Each entry can have one of the following values:
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        :param pulumi.Input[_builtins.str] project: The project id of the target project.
        :param pulumi.Input[_builtins.str] role: The target role that should be removed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IamMemberRemoveArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Ensures that a member:role pairing does not exist in a project's IAM policy.

        On create, this resource will modify the policy to remove the `member` from the
        `role`. If the membership is ever re-added, the next refresh will clear this
        resource from state, proposing re-adding it to correct the membership. Import is
        not supported- this resource will acquire the current policy and modify it as
        part of creating the resource.

        This resource will conflict with `projects.IAMPolicy` and
        `projects.IAMBinding` resources that share a role, as well as
        `projects.IAMMember` resources that target the same membership. When
        multiple resources conflict the final state is not guaranteed to include or omit
        the membership. Subsequent `pulumi up` calls will always show a diff
        until the configuration is corrected.

        For more information see
        [the official documentation](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
        and
        [API reference](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gcp as gcp

        target_project = gcp.organizations.get_project()
        foo = gcp.projects.IamMemberRemove("foo",
            role="roles/editor",
            project=target_project_google_project["projectId"],
            member=f"serviceAccount:{target_project_google_project['number']}-compute@developer.gserviceaccount.com")
        ```

        :param str resource_name: The name of the resource.
        :param IamMemberRemoveArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IamMemberRemoveArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IamMemberRemoveArgs.__new__(IamMemberRemoveArgs)

            if member is None and not opts.urn:
                raise TypeError("Missing required property 'member'")
            __props__.__dict__["member"] = member
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
        super(IamMemberRemove, __self__).__init__(
            'gcp:projects/iamMemberRemove:IamMemberRemove',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            member: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            role: Optional[pulumi.Input[_builtins.str]] = None) -> 'IamMemberRemove':
        """
        Get an existing IamMemberRemove resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] member: The IAM principal that should not have the target role.
               Each entry can have one of the following values:
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        :param pulumi.Input[_builtins.str] project: The project id of the target project.
        :param pulumi.Input[_builtins.str] role: The target role that should be removed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IamMemberRemoveState.__new__(_IamMemberRemoveState)

        __props__.__dict__["member"] = member
        __props__.__dict__["project"] = project
        __props__.__dict__["role"] = role
        return IamMemberRemove(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Output[_builtins.str]:
        """
        The IAM principal that should not have the target role.
        Each entry can have one of the following values:
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        """
        return pulumi.get(self, "member")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The project id of the target project.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Output[_builtins.str]:
        """
        The target role that should be removed.
        """
        return pulumi.get(self, "role")

