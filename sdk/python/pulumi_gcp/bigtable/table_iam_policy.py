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

__all__ = ['TableIamPolicyArgs', 'TableIamPolicy']

@pulumi.input_type
class TableIamPolicyArgs:
    def __init__(__self__, *,
                 instance: pulumi.Input[_builtins.str],
                 policy_data: pulumi.Input[_builtins.str],
                 table: pulumi.Input[_builtins.str],
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TableIamPolicy resource.
        :param pulumi.Input[_builtins.str] instance: The name or relative resource id of the instance that owns the table.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by a `organizations_get_iam_policy` data source.
               
               - - -
        :param pulumi.Input[_builtins.str] table: The name or relative resource id of the table to manage IAM policies for.
               
               For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        :param pulumi.Input[_builtins.str] project: The project in which the table belongs. If it
               is not provided, this provider will use the provider default.
        """
        pulumi.set(__self__, "instance", instance)
        pulumi.set(__self__, "policy_data", policy_data)
        pulumi.set(__self__, "table", table)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def instance(self) -> pulumi.Input[_builtins.str]:
        """
        The name or relative resource id of the instance that owns the table.
        """
        return pulumi.get(self, "instance")

    @instance.setter
    def instance(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance", value)

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> pulumi.Input[_builtins.str]:
        """
        The policy data generated by a `organizations_get_iam_policy` data source.

        - - -
        """
        return pulumi.get(self, "policy_data")

    @policy_data.setter
    def policy_data(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy_data", value)

    @_builtins.property
    @pulumi.getter
    def table(self) -> pulumi.Input[_builtins.str]:
        """
        The name or relative resource id of the table to manage IAM policies for.

        For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "table", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project in which the table belongs. If it
        is not provided, this provider will use the provider default.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _TableIamPolicyState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 instance: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 table: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TableIamPolicy resources.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the tables's IAM policy.
        :param pulumi.Input[_builtins.str] instance: The name or relative resource id of the instance that owns the table.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by a `organizations_get_iam_policy` data source.
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project in which the table belongs. If it
               is not provided, this provider will use the provider default.
        :param pulumi.Input[_builtins.str] table: The name or relative resource id of the table to manage IAM policies for.
               
               For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        """
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if instance is not None:
            pulumi.set(__self__, "instance", instance)
        if policy_data is not None:
            pulumi.set(__self__, "policy_data", policy_data)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if table is not None:
            pulumi.set(__self__, "table", table)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Computed) The etag of the tables's IAM policy.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter
    def instance(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name or relative resource id of the instance that owns the table.
        """
        return pulumi.get(self, "instance")

    @instance.setter
    def instance(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance", value)

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy data generated by a `organizations_get_iam_policy` data source.

        - - -
        """
        return pulumi.get(self, "policy_data")

    @policy_data.setter
    def policy_data(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_data", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project in which the table belongs. If it
        is not provided, this provider will use the provider default.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def table(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name or relative resource id of the table to manage IAM policies for.

        For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "table", value)


@pulumi.type_token("gcp:bigtable/tableIamPolicy:TableIamPolicy")
class TableIamPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 table: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:

        * `bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
        * `bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
        * `bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.

        > **Note:** `bigtable.TableIamPolicy` **cannot** be used in conjunction with `bigtable.TableIamBinding` and `bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `bigtable.TableIamPolicy` replaces the entire policy.

        > **Note:** `bigtable.TableIamBinding` resources **can be** used in conjunction with `bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.

        ## bigtable.TableIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/bigtable.user",
            "members": ["user:jane@example.com"],
        }])
        editor = gcp.bigtable.TableIamPolicy("editor",
            project="your-project",
            instance="your-bigtable-instance",
            table="your-bigtable-table",
            policy_data=admin.policy_data)
        ```

        ## bigtable.TableIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamBinding("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            members=["user:jane@example.com"])
        ```

        ## bigtable.TableIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamMember("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            member="user:jane@example.com")
        ```

        ## bigtable.TableIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/bigtable.user",
            "members": ["user:jane@example.com"],
        }])
        editor = gcp.bigtable.TableIamPolicy("editor",
            project="your-project",
            instance="your-bigtable-instance",
            table="your-bigtable-table",
            policy_data=admin.policy_data)
        ```

        ## bigtable.TableIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamBinding("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            members=["user:jane@example.com"])
        ```

        ## bigtable.TableIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamMember("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            member="user:jane@example.com")
        ```

        ## Import

        ### Importing IAM policies

        IAM policy imports use the `table` identifier of the Bigtable Table resource only. For example:

        * `"projects/{project}/instances/{instance}/tables/{table}"`

        An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:

        tf

        import {

          id = "projects/{project}/instances/{instance}/tables/{table}"

          to = google_bigtable_table_iam_policy.default

        }

        The `pulumi import` command can also be used:

        ```sh
        $ pulumi import gcp:bigtable/tableIamPolicy:TableIamPolicy default projects/{project}/instances/{instance}/tables/{table}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] instance: The name or relative resource id of the instance that owns the table.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by a `organizations_get_iam_policy` data source.
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project in which the table belongs. If it
               is not provided, this provider will use the provider default.
        :param pulumi.Input[_builtins.str] table: The name or relative resource id of the table to manage IAM policies for.
               
               For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TableIamPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:

        * `bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
        * `bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
        * `bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.

        > **Note:** `bigtable.TableIamPolicy` **cannot** be used in conjunction with `bigtable.TableIamBinding` and `bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `bigtable.TableIamPolicy` replaces the entire policy.

        > **Note:** `bigtable.TableIamBinding` resources **can be** used in conjunction with `bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.

        ## bigtable.TableIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/bigtable.user",
            "members": ["user:jane@example.com"],
        }])
        editor = gcp.bigtable.TableIamPolicy("editor",
            project="your-project",
            instance="your-bigtable-instance",
            table="your-bigtable-table",
            policy_data=admin.policy_data)
        ```

        ## bigtable.TableIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamBinding("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            members=["user:jane@example.com"])
        ```

        ## bigtable.TableIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamMember("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            member="user:jane@example.com")
        ```

        ## bigtable.TableIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/bigtable.user",
            "members": ["user:jane@example.com"],
        }])
        editor = gcp.bigtable.TableIamPolicy("editor",
            project="your-project",
            instance="your-bigtable-instance",
            table="your-bigtable-table",
            policy_data=admin.policy_data)
        ```

        ## bigtable.TableIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamBinding("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            members=["user:jane@example.com"])
        ```

        ## bigtable.TableIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        editor = gcp.bigtable.TableIamMember("editor",
            table="your-bigtable-table",
            instance="your-bigtable-instance",
            role="roles/bigtable.user",
            member="user:jane@example.com")
        ```

        ## Import

        ### Importing IAM policies

        IAM policy imports use the `table` identifier of the Bigtable Table resource only. For example:

        * `"projects/{project}/instances/{instance}/tables/{table}"`

        An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:

        tf

        import {

          id = "projects/{project}/instances/{instance}/tables/{table}"

          to = google_bigtable_table_iam_policy.default

        }

        The `pulumi import` command can also be used:

        ```sh
        $ pulumi import gcp:bigtable/tableIamPolicy:TableIamPolicy default projects/{project}/instances/{instance}/tables/{table}
        ```

        :param str resource_name: The name of the resource.
        :param TableIamPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TableIamPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 table: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TableIamPolicyArgs.__new__(TableIamPolicyArgs)

            if instance is None and not opts.urn:
                raise TypeError("Missing required property 'instance'")
            __props__.__dict__["instance"] = instance
            if policy_data is None and not opts.urn:
                raise TypeError("Missing required property 'policy_data'")
            __props__.__dict__["policy_data"] = policy_data
            __props__.__dict__["project"] = project
            if table is None and not opts.urn:
                raise TypeError("Missing required property 'table'")
            __props__.__dict__["table"] = table
            __props__.__dict__["etag"] = None
        super(TableIamPolicy, __self__).__init__(
            'gcp:bigtable/tableIamPolicy:TableIamPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            instance: Optional[pulumi.Input[_builtins.str]] = None,
            policy_data: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            table: Optional[pulumi.Input[_builtins.str]] = None) -> 'TableIamPolicy':
        """
        Get an existing TableIamPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the tables's IAM policy.
        :param pulumi.Input[_builtins.str] instance: The name or relative resource id of the instance that owns the table.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by a `organizations_get_iam_policy` data source.
               
               - - -
        :param pulumi.Input[_builtins.str] project: The project in which the table belongs. If it
               is not provided, this provider will use the provider default.
        :param pulumi.Input[_builtins.str] table: The name or relative resource id of the table to manage IAM policies for.
               
               For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TableIamPolicyState.__new__(_TableIamPolicyState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["instance"] = instance
        __props__.__dict__["policy_data"] = policy_data
        __props__.__dict__["project"] = project
        __props__.__dict__["table"] = table
        return TableIamPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        (Computed) The etag of the tables's IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def instance(self) -> pulumi.Output[_builtins.str]:
        """
        The name or relative resource id of the instance that owns the table.
        """
        return pulumi.get(self, "instance")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> pulumi.Output[_builtins.str]:
        """
        The policy data generated by a `organizations_get_iam_policy` data source.

        - - -
        """
        return pulumi.get(self, "policy_data")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The project in which the table belongs. If it
        is not provided, this provider will use the provider default.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def table(self) -> pulumi.Output[_builtins.str]:
        """
        The name or relative resource id of the table to manage IAM policies for.

        For `bigtable.TableIamMember` or `bigtable.TableIamBinding`:
        """
        return pulumi.get(self, "table")

