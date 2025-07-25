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

__all__ = ['AccountArgs', 'Account']

@pulumi.input_type
class AccountArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_ignore_already_exists: Optional[pulumi.Input[_builtins.bool]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Account resource.
        :param pulumi.Input[_builtins.str] account_id: The account id that is used to generate the service
               account email address and a stable unique id. It is unique within a project,
               must be 6-30 characters long, and match the regular expression `a-z`
               to comply with RFC1035. Changing this forces a new service account to be created.
        :param pulumi.Input[_builtins.bool] create_ignore_already_exists: If set to true, skip service account creation if a service account with the same email already exists.
        :param pulumi.Input[_builtins.str] description: A text description of the service account.
               Must be less than or equal to 256 UTF-8 bytes.
        :param pulumi.Input[_builtins.bool] disabled: Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
               Must be set after creation to disable a service account.
        :param pulumi.Input[_builtins.str] display_name: The display name for the service account.
               Can be updated without creating a new resource.
        :param pulumi.Input[_builtins.str] project: The ID of the project that the service account will be created in.
               Defaults to the provider project configuration.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if create_ignore_already_exists is not None:
            pulumi.set(__self__, "create_ignore_already_exists", create_ignore_already_exists)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The account id that is used to generate the service
        account email address and a stable unique id. It is unique within a project,
        must be 6-30 characters long, and match the regular expression `a-z`
        to comply with RFC1035. Changing this forces a new service account to be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="createIgnoreAlreadyExists")
    def create_ignore_already_exists(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If set to true, skip service account creation if a service account with the same email already exists.
        """
        return pulumi.get(self, "create_ignore_already_exists")

    @create_ignore_already_exists.setter
    def create_ignore_already_exists(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "create_ignore_already_exists", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A text description of the service account.
        Must be less than or equal to 256 UTF-8 bytes.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
        Must be set after creation to disable a service account.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disabled", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The display name for the service account.
        Can be updated without creating a new resource.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project that the service account will be created in.
        Defaults to the provider project configuration.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _AccountState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_ignore_already_exists: Optional[pulumi.Input[_builtins.bool]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 email: Optional[pulumi.Input[_builtins.str]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 unique_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Account resources.
        :param pulumi.Input[_builtins.str] account_id: The account id that is used to generate the service
               account email address and a stable unique id. It is unique within a project,
               must be 6-30 characters long, and match the regular expression `a-z`
               to comply with RFC1035. Changing this forces a new service account to be created.
        :param pulumi.Input[_builtins.bool] create_ignore_already_exists: If set to true, skip service account creation if a service account with the same email already exists.
        :param pulumi.Input[_builtins.str] description: A text description of the service account.
               Must be less than or equal to 256 UTF-8 bytes.
        :param pulumi.Input[_builtins.bool] disabled: Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
               Must be set after creation to disable a service account.
        :param pulumi.Input[_builtins.str] display_name: The display name for the service account.
               Can be updated without creating a new resource.
        :param pulumi.Input[_builtins.str] email: The e-mail address of the service account. This value
               should be referenced from any `organizations_get_iam_policy` data sources
               that would grant the service account privileges.
        :param pulumi.Input[_builtins.str] member: The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        :param pulumi.Input[_builtins.str] name: The fully-qualified name of the service account.
        :param pulumi.Input[_builtins.str] project: The ID of the project that the service account will be created in.
               Defaults to the provider project configuration.
        :param pulumi.Input[_builtins.str] unique_id: The unique id of the service account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if create_ignore_already_exists is not None:
            pulumi.set(__self__, "create_ignore_already_exists", create_ignore_already_exists)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if member is not None:
            pulumi.set(__self__, "member", member)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if unique_id is not None:
            pulumi.set(__self__, "unique_id", unique_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The account id that is used to generate the service
        account email address and a stable unique id. It is unique within a project,
        must be 6-30 characters long, and match the regular expression `a-z`
        to comply with RFC1035. Changing this forces a new service account to be created.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="createIgnoreAlreadyExists")
    def create_ignore_already_exists(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If set to true, skip service account creation if a service account with the same email already exists.
        """
        return pulumi.get(self, "create_ignore_already_exists")

    @create_ignore_already_exists.setter
    def create_ignore_already_exists(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "create_ignore_already_exists", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A text description of the service account.
        Must be less than or equal to 256 UTF-8 bytes.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
        Must be set after creation to disable a service account.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disabled", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The display name for the service account.
        Can be updated without creating a new resource.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The e-mail address of the service account. This value
        should be referenced from any `organizations_get_iam_policy` data sources
        that would grant the service account privileges.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email", value)

    @_builtins.property
    @pulumi.getter
    def member(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The fully-qualified name of the service account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project that the service account will be created in.
        Defaults to the provider project configuration.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="uniqueId")
    def unique_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique id of the service account.
        """
        return pulumi.get(self, "unique_id")

    @unique_id.setter
    def unique_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "unique_id", value)


@pulumi.type_token("gcp:serviceaccount/account:Account")
class Account(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_ignore_already_exists: Optional[pulumi.Input[_builtins.bool]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Allows management of a Google Cloud service account.

        * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/compute/docs/access/service-accounts)

        > **Warning:**  If you delete and recreate a service account, you must reapply any IAM roles that it had before.

        > Creation of service accounts is eventually consistent, and that can lead to
        errors when you try to apply ACLs to service accounts immediately after
        creation.

        ## Example Usage

        This snippet creates a service account in a project.

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.serviceaccount.Account("service_account",
            account_id="service-account-id",
            display_name="Service Account")
        ```

        ## Import

        Service accounts can be imported using their URI, e.g.

        * `projects/{{project_id}}/serviceAccounts/{{email}}`

        When using the `pulumi import` command, service accounts can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:serviceaccount/account:Account default projects/{{project_id}}/serviceAccounts/{{email}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The account id that is used to generate the service
               account email address and a stable unique id. It is unique within a project,
               must be 6-30 characters long, and match the regular expression `a-z`
               to comply with RFC1035. Changing this forces a new service account to be created.
        :param pulumi.Input[_builtins.bool] create_ignore_already_exists: If set to true, skip service account creation if a service account with the same email already exists.
        :param pulumi.Input[_builtins.str] description: A text description of the service account.
               Must be less than or equal to 256 UTF-8 bytes.
        :param pulumi.Input[_builtins.bool] disabled: Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
               Must be set after creation to disable a service account.
        :param pulumi.Input[_builtins.str] display_name: The display name for the service account.
               Can be updated without creating a new resource.
        :param pulumi.Input[_builtins.str] project: The ID of the project that the service account will be created in.
               Defaults to the provider project configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccountArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows management of a Google Cloud service account.

        * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/compute/docs/access/service-accounts)

        > **Warning:**  If you delete and recreate a service account, you must reapply any IAM roles that it had before.

        > Creation of service accounts is eventually consistent, and that can lead to
        errors when you try to apply ACLs to service accounts immediately after
        creation.

        ## Example Usage

        This snippet creates a service account in a project.

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.serviceaccount.Account("service_account",
            account_id="service-account-id",
            display_name="Service Account")
        ```

        ## Import

        Service accounts can be imported using their URI, e.g.

        * `projects/{{project_id}}/serviceAccounts/{{email}}`

        When using the `pulumi import` command, service accounts can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:serviceaccount/account:Account default projects/{{project_id}}/serviceAccounts/{{email}}
        ```

        :param str resource_name: The name of the resource.
        :param AccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_ignore_already_exists: Optional[pulumi.Input[_builtins.bool]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountArgs.__new__(AccountArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["create_ignore_already_exists"] = create_ignore_already_exists
            __props__.__dict__["description"] = description
            __props__.__dict__["disabled"] = disabled
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["project"] = project
            __props__.__dict__["email"] = None
            __props__.__dict__["member"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["unique_id"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="gcp:serviceAccount/account:Account")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(Account, __self__).__init__(
            'gcp:serviceaccount/account:Account',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            create_ignore_already_exists: Optional[pulumi.Input[_builtins.bool]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            disabled: Optional[pulumi.Input[_builtins.bool]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            email: Optional[pulumi.Input[_builtins.str]] = None,
            member: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            unique_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'Account':
        """
        Get an existing Account resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The account id that is used to generate the service
               account email address and a stable unique id. It is unique within a project,
               must be 6-30 characters long, and match the regular expression `a-z`
               to comply with RFC1035. Changing this forces a new service account to be created.
        :param pulumi.Input[_builtins.bool] create_ignore_already_exists: If set to true, skip service account creation if a service account with the same email already exists.
        :param pulumi.Input[_builtins.str] description: A text description of the service account.
               Must be less than or equal to 256 UTF-8 bytes.
        :param pulumi.Input[_builtins.bool] disabled: Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
               Must be set after creation to disable a service account.
        :param pulumi.Input[_builtins.str] display_name: The display name for the service account.
               Can be updated without creating a new resource.
        :param pulumi.Input[_builtins.str] email: The e-mail address of the service account. This value
               should be referenced from any `organizations_get_iam_policy` data sources
               that would grant the service account privileges.
        :param pulumi.Input[_builtins.str] member: The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        :param pulumi.Input[_builtins.str] name: The fully-qualified name of the service account.
        :param pulumi.Input[_builtins.str] project: The ID of the project that the service account will be created in.
               Defaults to the provider project configuration.
        :param pulumi.Input[_builtins.str] unique_id: The unique id of the service account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountState.__new__(_AccountState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["create_ignore_already_exists"] = create_ignore_already_exists
        __props__.__dict__["description"] = description
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["email"] = email
        __props__.__dict__["member"] = member
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["unique_id"] = unique_id
        return Account(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The account id that is used to generate the service
        account email address and a stable unique id. It is unique within a project,
        must be 6-30 characters long, and match the regular expression `a-z`
        to comply with RFC1035. Changing this forces a new service account to be created.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="createIgnoreAlreadyExists")
    def create_ignore_already_exists(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        If set to true, skip service account creation if a service account with the same email already exists.
        """
        return pulumi.get(self, "create_ignore_already_exists")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A text description of the service account.
        Must be less than or equal to 256 UTF-8 bytes.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
        Must be set after creation to disable a service account.
        """
        return pulumi.get(self, "disabled")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The display name for the service account.
        Can be updated without creating a new resource.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def email(self) -> pulumi.Output[_builtins.str]:
        """
        The e-mail address of the service account. This value
        should be referenced from any `organizations_get_iam_policy` data sources
        that would grant the service account privileges.
        """
        return pulumi.get(self, "email")

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Output[_builtins.str]:
        """
        The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        """
        return pulumi.get(self, "member")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The fully-qualified name of the service account.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project that the service account will be created in.
        Defaults to the provider project configuration.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="uniqueId")
    def unique_id(self) -> pulumi.Output[_builtins.str]:
        """
        The unique id of the service account.
        """
        return pulumi.get(self, "unique_id")

