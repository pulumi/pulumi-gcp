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

__all__ = ['ApiConfigIamPolicyArgs', 'ApiConfigIamPolicy']

@pulumi.input_type
class ApiConfigIamPolicyArgs:
    def __init__(__self__, *,
                 api: pulumi.Input[_builtins.str],
                 api_config: pulumi.Input[_builtins.str],
                 policy_data: pulumi.Input[_builtins.str],
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ApiConfigIamPolicy resource.
        :param pulumi.Input[_builtins.str] api: The API to attach the config to.
               Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] api_config: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        pulumi.set(__self__, "api", api)
        pulumi.set(__self__, "api_config", api_config)
        pulumi.set(__self__, "policy_data", policy_data)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def api(self) -> pulumi.Input[_builtins.str]:
        """
        The API to attach the config to.
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "api")

    @api.setter
    def api(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api", value)

    @_builtins.property
    @pulumi.getter(name="apiConfig")
    def api_config(self) -> pulumi.Input[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "api_config")

    @api_config.setter
    def api_config(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_config", value)

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
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _ApiConfigIamPolicyState:
    def __init__(__self__, *,
                 api: Optional[pulumi.Input[_builtins.str]] = None,
                 api_config: Optional[pulumi.Input[_builtins.str]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ApiConfigIamPolicy resources.
        :param pulumi.Input[_builtins.str] api: The API to attach the config to.
               Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] api_config: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        if api is not None:
            pulumi.set(__self__, "api", api)
        if api_config is not None:
            pulumi.set(__self__, "api_config", api_config)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if policy_data is not None:
            pulumi.set(__self__, "policy_data", policy_data)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def api(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The API to attach the config to.
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "api")

    @api.setter
    def api(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api", value)

    @_builtins.property
    @pulumi.getter(name="apiConfig")
    def api_config(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "api_config")

    @api_config.setter
    def api_config(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_config", value)

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


@pulumi.type_token("gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy")
class ApiConfigIamPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api: Optional[pulumi.Input[_builtins.str]] = None,
                 api_config: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:

        * `apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
        * `apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
        * `apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig

        > **Note:** `apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `apigateway.ApiConfigIamBinding` and `apigateway.ApiConfigIamMember` or they will fight over what your policy should be.

        > **Note:** `apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.

        ## google\\_api\\_gateway\\_api\\_config\\_iam\\_policy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/apigateway.viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.apigateway.ApiConfigIamPolicy("policy",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            policy_data=admin.policy_data)
        ```

        ## apigateway.ApiConfigIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.apigateway.ApiConfigIamBinding("binding",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            members=["user:jane@example.com"])
        ```

        ## apigateway.ApiConfigIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.apigateway.ApiConfigIamMember("member",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            member="user:jane@example.com")
        ```

        ## This resource supports User Project Overrides.

        - 

        # IAM policy for API Gateway ApiConfig
        Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:

        * `apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
        * `apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
        * `apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig

        > **Note:** `apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `apigateway.ApiConfigIamBinding` and `apigateway.ApiConfigIamMember` or they will fight over what your policy should be.

        > **Note:** `apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.

        ## google\\_api\\_gateway\\_api\\_config\\_iam\\_policy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/apigateway.viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.apigateway.ApiConfigIamPolicy("policy",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            policy_data=admin.policy_data)
        ```

        ## apigateway.ApiConfigIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.apigateway.ApiConfigIamBinding("binding",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            members=["user:jane@example.com"])
        ```

        ## apigateway.ApiConfigIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.apigateway.ApiConfigIamMember("member",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            member="user:jane@example.com")
        ```

        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}

        * {{project}}/{{api}}/{{api_config}}

        * {{api}}/{{api_config}}

        * {{api_config}}

        Any variables not passed in the import command will be taken from the provider configuration.

        API Gateway apiconfig IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor "projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor "projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api: The API to attach the config to.
               Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] api_config: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiConfigIamPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:

        * `apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
        * `apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
        * `apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig

        > **Note:** `apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `apigateway.ApiConfigIamBinding` and `apigateway.ApiConfigIamMember` or they will fight over what your policy should be.

        > **Note:** `apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.

        ## google\\_api\\_gateway\\_api\\_config\\_iam\\_policy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/apigateway.viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.apigateway.ApiConfigIamPolicy("policy",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            policy_data=admin.policy_data)
        ```

        ## apigateway.ApiConfigIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.apigateway.ApiConfigIamBinding("binding",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            members=["user:jane@example.com"])
        ```

        ## apigateway.ApiConfigIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.apigateway.ApiConfigIamMember("member",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            member="user:jane@example.com")
        ```

        ## This resource supports User Project Overrides.

        - 

        # IAM policy for API Gateway ApiConfig
        Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:

        * `apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
        * `apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
        * `apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig

        > **Note:** `apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `apigateway.ApiConfigIamBinding` and `apigateway.ApiConfigIamMember` or they will fight over what your policy should be.

        > **Note:** `apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.

        ## google\\_api\\_gateway\\_api\\_config\\_iam\\_policy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/apigateway.viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.apigateway.ApiConfigIamPolicy("policy",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            policy_data=admin.policy_data)
        ```

        ## apigateway.ApiConfigIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.apigateway.ApiConfigIamBinding("binding",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            members=["user:jane@example.com"])
        ```

        ## apigateway.ApiConfigIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.apigateway.ApiConfigIamMember("member",
            api=api_cfg["api"],
            api_config=api_cfg["apiConfigId"],
            role="roles/apigateway.viewer",
            member="user:jane@example.com")
        ```

        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}

        * {{project}}/{{api}}/{{api_config}}

        * {{api}}/{{api_config}}

        * {{api_config}}

        Any variables not passed in the import command will be taken from the provider configuration.

        API Gateway apiconfig IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor "projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor "projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param ApiConfigIamPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiConfigIamPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api: Optional[pulumi.Input[_builtins.str]] = None,
                 api_config: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiConfigIamPolicyArgs.__new__(ApiConfigIamPolicyArgs)

            if api is None and not opts.urn:
                raise TypeError("Missing required property 'api'")
            __props__.__dict__["api"] = api
            if api_config is None and not opts.urn:
                raise TypeError("Missing required property 'api_config'")
            __props__.__dict__["api_config"] = api_config
            if policy_data is None and not opts.urn:
                raise TypeError("Missing required property 'policy_data'")
            __props__.__dict__["policy_data"] = policy_data
            __props__.__dict__["project"] = project
            __props__.__dict__["etag"] = None
        super(ApiConfigIamPolicy, __self__).__init__(
            'gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api: Optional[pulumi.Input[_builtins.str]] = None,
            api_config: Optional[pulumi.Input[_builtins.str]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            policy_data: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None) -> 'ApiConfigIamPolicy':
        """
        Get an existing ApiConfigIamPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api: The API to attach the config to.
               Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] api_config: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiConfigIamPolicyState.__new__(_ApiConfigIamPolicyState)

        __props__.__dict__["api"] = api
        __props__.__dict__["api_config"] = api_config
        __props__.__dict__["etag"] = etag
        __props__.__dict__["policy_data"] = policy_data
        __props__.__dict__["project"] = project
        return ApiConfigIamPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def api(self) -> pulumi.Output[_builtins.str]:
        """
        The API to attach the config to.
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "api")

    @_builtins.property
    @pulumi.getter(name="apiConfig")
    def api_config(self) -> pulumi.Output[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "api_config")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

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

