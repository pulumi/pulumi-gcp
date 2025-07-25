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

__all__ = ['RegionBackendServiceIamPolicyArgs', 'RegionBackendServiceIamPolicy']

@pulumi.input_type
class RegionBackendServiceIamPolicyArgs:
    def __init__(__self__, *,
                 policy_data: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a RegionBackendServiceIamPolicy resource.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] name: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The Region in which the created backend service should reside.
               If it is not provided, the provider region is used.
               Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        """
        pulumi.set(__self__, "policy_data", policy_data)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> pulumi.Input[_builtins.str]:
        """
        The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @policy_data.setter
    def policy_data(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy_data", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Region in which the created backend service should reside.
        If it is not provided, the provider region is used.
        Used to find the parent resource to bind the IAM policy to. If not specified,
        the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        region is specified, it is taken from the provider configuration.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _RegionBackendServiceIamPolicyState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering RegionBackendServiceIamPolicy resources.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] name: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The Region in which the created backend service should reside.
               If it is not provided, the provider region is used.
               Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        """
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_data is not None:
            pulumi.set(__self__, "policy_data", policy_data)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)

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
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @policy_data.setter
    def policy_data(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_data", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Region in which the created backend service should reside.
        If it is not provided, the provider region is used.
        Used to find the parent resource to bind the IAM policy to. If not specified,
        the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        region is specified, it is taken from the provider configuration.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)


@pulumi.type_token("gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy")
class RegionBackendServiceIamPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * projects/{{project}}/regions/{{region}}/backendServices/{{name}}

        * {{project}}/{{region}}/{{name}}

        * {{region}}/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Compute Engine regionbackendservice IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy editor "projects/{{project}}/regions/{{region}}/backendServices/{{region_backend_service}} roles/compute.admin user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy editor "projects/{{project}}/regions/{{region}}/backendServices/{{region_backend_service}} roles/compute.admin"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy editor projects/{{project}}/regions/{{region}}/backendServices/{{region_backend_service}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The Region in which the created backend service should reside.
               If it is not provided, the provider region is used.
               Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RegionBackendServiceIamPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * projects/{{project}}/regions/{{region}}/backendServices/{{name}}

        * {{project}}/{{region}}/{{name}}

        * {{region}}/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Compute Engine regionbackendservice IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy editor "projects/{{project}}/regions/{{region}}/backendServices/{{region_backend_service}} roles/compute.admin user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy editor "projects/{{project}}/regions/{{region}}/backendServices/{{region_backend_service}} roles/compute.admin"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy editor projects/{{project}}/regions/{{region}}/backendServices/{{region_backend_service}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param RegionBackendServiceIamPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RegionBackendServiceIamPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RegionBackendServiceIamPolicyArgs.__new__(RegionBackendServiceIamPolicyArgs)

            __props__.__dict__["name"] = name
            if policy_data is None and not opts.urn:
                raise TypeError("Missing required property 'policy_data'")
            __props__.__dict__["policy_data"] = policy_data
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["etag"] = None
        super(RegionBackendServiceIamPolicy, __self__).__init__(
            'gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            policy_data: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None) -> 'RegionBackendServiceIamPolicy':
        """
        Get an existing RegionBackendServiceIamPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] name: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The Region in which the created backend service should reside.
               If it is not provided, the provider region is used.
               Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RegionBackendServiceIamPolicyState.__new__(_RegionBackendServiceIamPolicyState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_data"] = policy_data
        __props__.__dict__["project"] = project
        __props__.__dict__["region"] = region
        return RegionBackendServiceIamPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> pulumi.Output[_builtins.str]:
        """
        The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[_builtins.str]:
        """
        The Region in which the created backend service should reside.
        If it is not provided, the provider region is used.
        Used to find the parent resource to bind the IAM policy to. If not specified,
        the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        region is specified, it is taken from the provider configuration.
        """
        return pulumi.get(self, "region")

