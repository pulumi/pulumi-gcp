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

__all__ = ['ServiceIamPolicyArgs', 'ServiceIamPolicy']

@pulumi.input_type
class ServiceIamPolicyArgs:
    def __init__(__self__, *,
                 policy_data: pulumi.Input[_builtins.str],
                 service_name: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ServiceIamPolicy resource.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] service_name: Used to find the parent resource to bind the IAM policy to
        """
        pulumi.set(__self__, "policy_data", policy_data)
        pulumi.set(__self__, "service_name", service_name)

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
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "service_name", value)


@pulumi.input_type
class _ServiceIamPolicyState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 service_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ServiceIamPolicy resources.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] service_name: Used to find the parent resource to bind the IAM policy to
        """
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if policy_data is not None:
            pulumi.set(__self__, "policy_data", policy_data)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)

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
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_name", value)


@pulumi.type_token("gcp:endpoints/serviceIamPolicy:ServiceIamPolicy")
class ServiceIamPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 service_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:

        * `endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
        * `endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
        * `endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service

        > **Note:** `endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `endpoints.ServiceIamBinding` and `endpoints.ServiceIamMember` or they will fight over what your policy should be.

        > **Note:** `endpoints.ServiceIamBinding` resources **can be** used in conjunction with `endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.

        ## endpoints.ServiceIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.endpoints.ServiceIamPolicy("policy",
            service_name=endpoints_service["serviceName"],
            policy_data=admin.policy_data)
        ```

        ## endpoints.ServiceIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.endpoints.ServiceIamBinding("binding",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## endpoints.ServiceIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.endpoints.ServiceIamMember("member",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

        full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
        ---

        # IAM policy for Cloud Endpoints Service
        Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:

        * `endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
        * `endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
        * `endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service

        > **Note:** `endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `endpoints.ServiceIamBinding` and `endpoints.ServiceIamMember` or they will fight over what your policy should be.

        > **Note:** `endpoints.ServiceIamBinding` resources **can be** used in conjunction with `endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.

        ## endpoints.ServiceIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.endpoints.ServiceIamPolicy("policy",
            service_name=endpoints_service["serviceName"],
            policy_data=admin.policy_data)
        ```

        ## endpoints.ServiceIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.endpoints.ServiceIamBinding("binding",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## endpoints.ServiceIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.endpoints.ServiceIamMember("member",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * services/{{service_name}}

        * {{service_name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Cloud Endpoints service IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor "services/{{service_name}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor "services/{{service_name}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor services/{{service_name}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] service_name: Used to find the parent resource to bind the IAM policy to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceIamPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:

        * `endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
        * `endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
        * `endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service

        > **Note:** `endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `endpoints.ServiceIamBinding` and `endpoints.ServiceIamMember` or they will fight over what your policy should be.

        > **Note:** `endpoints.ServiceIamBinding` resources **can be** used in conjunction with `endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.

        ## endpoints.ServiceIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.endpoints.ServiceIamPolicy("policy",
            service_name=endpoints_service["serviceName"],
            policy_data=admin.policy_data)
        ```

        ## endpoints.ServiceIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.endpoints.ServiceIamBinding("binding",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## endpoints.ServiceIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.endpoints.ServiceIamMember("member",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

        full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
        ---

        # IAM policy for Cloud Endpoints Service
        Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:

        * `endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
        * `endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
        * `endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.

        A data source can be used to retrieve policy data in advent you do not need creation

        * `endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service

        > **Note:** `endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `endpoints.ServiceIamBinding` and `endpoints.ServiceIamMember` or they will fight over what your policy should be.

        > **Note:** `endpoints.ServiceIamBinding` resources **can be** used in conjunction with `endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.

        ## endpoints.ServiceIamPolicy

        ```python
        import pulumi
        import pulumi_gcp as gcp

        admin = gcp.organizations.get_iam_policy(bindings=[{
            "role": "roles/viewer",
            "members": ["user:jane@example.com"],
        }])
        policy = gcp.endpoints.ServiceIamPolicy("policy",
            service_name=endpoints_service["serviceName"],
            policy_data=admin.policy_data)
        ```

        ## endpoints.ServiceIamBinding

        ```python
        import pulumi
        import pulumi_gcp as gcp

        binding = gcp.endpoints.ServiceIamBinding("binding",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            members=["user:jane@example.com"])
        ```

        ## endpoints.ServiceIamMember

        ```python
        import pulumi
        import pulumi_gcp as gcp

        member = gcp.endpoints.ServiceIamMember("member",
            service_name=endpoints_service["serviceName"],
            role="roles/viewer",
            member="user:jane@example.com")
        ```

        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * services/{{service_name}}

        * {{service_name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Cloud Endpoints service IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor "services/{{service_name}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor "services/{{service_name}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor services/{{service_name}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param ServiceIamPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceIamPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 service_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceIamPolicyArgs.__new__(ServiceIamPolicyArgs)

            if policy_data is None and not opts.urn:
                raise TypeError("Missing required property 'policy_data'")
            __props__.__dict__["policy_data"] = policy_data
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["etag"] = None
        super(ServiceIamPolicy, __self__).__init__(
            'gcp:endpoints/serviceIamPolicy:ServiceIamPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            policy_data: Optional[pulumi.Input[_builtins.str]] = None,
            service_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'ServiceIamPolicy':
        """
        Get an existing ServiceIamPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        :param pulumi.Input[_builtins.str] service_name: Used to find the parent resource to bind the IAM policy to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceIamPolicyState.__new__(_ServiceIamPolicyState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["policy_data"] = policy_data
        __props__.__dict__["service_name"] = service_name
        return ServiceIamPolicy(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "service_name")

