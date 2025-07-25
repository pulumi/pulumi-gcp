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

__all__ = ['GatewaySecurityPolicyArgs', 'GatewaySecurityPolicy']

@pulumi.input_type
class GatewaySecurityPolicyArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_inspection_policy: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a GatewaySecurityPolicy resource.
        :param pulumi.Input[_builtins.str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[_builtins.str] location: The location of the gateway security policy.
               The default value is `global`.
        :param pulumi.Input[_builtins.str] name: Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
               gatewaySecurityPolicy should match the pattern:(^a-z?$).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] tls_inspection_policy: Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if tls_inspection_policy is not None:
            pulumi.set(__self__, "tls_inspection_policy", tls_inspection_policy)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A free-text description of the resource. Max length 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the gateway security policy.
        The default value is `global`.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
        gatewaySecurityPolicy should match the pattern:(^a-z?$).
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
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="tlsInspectionPolicy")
    def tls_inspection_policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        """
        return pulumi.get(self, "tls_inspection_policy")

    @tls_inspection_policy.setter
    def tls_inspection_policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tls_inspection_policy", value)


@pulumi.input_type
class _GatewaySecurityPolicyState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 self_link: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_inspection_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering GatewaySecurityPolicy resources.
        :param pulumi.Input[_builtins.str] create_time: The timestamp when the resource was created.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        :param pulumi.Input[_builtins.str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[_builtins.str] location: The location of the gateway security policy.
               The default value is `global`.
        :param pulumi.Input[_builtins.str] name: Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
               gatewaySecurityPolicy should match the pattern:(^a-z?$).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] self_link: Server-defined URL of this resource.
        :param pulumi.Input[_builtins.str] tls_inspection_policy: Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        :param pulumi.Input[_builtins.str] update_time: The timestamp when the resource was updated.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if self_link is not None:
            pulumi.set(__self__, "self_link", self_link)
        if tls_inspection_policy is not None:
            pulumi.set(__self__, "tls_inspection_policy", tls_inspection_policy)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timestamp when the resource was created.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A free-text description of the resource. Max length 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the gateway security policy.
        The default value is `global`.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
        gatewaySecurityPolicy should match the pattern:(^a-z?$).
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
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Server-defined URL of this resource.
        """
        return pulumi.get(self, "self_link")

    @self_link.setter
    def self_link(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "self_link", value)

    @_builtins.property
    @pulumi.getter(name="tlsInspectionPolicy")
    def tls_inspection_policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        """
        return pulumi.get(self, "tls_inspection_policy")

    @tls_inspection_policy.setter
    def tls_inspection_policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tls_inspection_policy", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timestamp when the resource was updated.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy")
class GatewaySecurityPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_inspection_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        The GatewaySecurityPolicy resource contains a collection of GatewaySecurityPolicyRules and associated metadata.

        To get more information about GatewaySecurityPolicy, see:

        * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies)

        ## Example Usage

        ### Network Security Gateway Security Policy Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.GatewaySecurityPolicy("default",
            name="my-gateway-security-policy",
            location="us-central1",
            description="my description")
        ```
        ### Network Security Gateway Security Policy Tls Inspection Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.certificateauthority.CaPool("default",
            name="my-basic-ca-pool",
            location="us-central1",
            tier="DEVOPS",
            publishing_options={
                "publish_ca_cert": False,
                "publish_crl": False,
            },
            issuance_policy={
                "maximum_lifetime": "1209600s",
                "baseline_values": {
                    "ca_options": {
                        "is_ca": False,
                    },
                    "key_usage": {
                        "base_key_usage": {},
                        "extended_key_usage": {
                            "server_auth": True,
                        },
                    },
                },
            })
        default_authority = gcp.certificateauthority.Authority("default",
            pool=default.name,
            certificate_authority_id="my-basic-certificate-authority",
            location="us-central1",
            lifetime="86400s",
            type="SELF_SIGNED",
            deletion_protection=False,
            skip_grace_period=True,
            ignore_active_certificates_on_deletion=True,
            config={
                "subject_config": {
                    "subject": {
                        "organization": "Test LLC",
                        "common_name": "my-ca",
                    },
                },
                "x509_config": {
                    "ca_options": {
                        "is_ca": True,
                    },
                    "key_usage": {
                        "base_key_usage": {
                            "cert_sign": True,
                            "crl_sign": True,
                        },
                        "extended_key_usage": {
                            "server_auth": False,
                        },
                    },
                },
            },
            key_spec={
                "algorithm": "RSA_PKCS1_4096_SHA256",
            })
        project = gcp.organizations.get_project()
        tls_inspection_permission = gcp.certificateauthority.CaPoolIamMember("tls_inspection_permission",
            ca_pool=default.id,
            role="roles/privateca.certificateManager",
            member=f"serviceAccount:service-{project.number}@gcp-sa-networksecurity.iam.gserviceaccount.com")
        default_tls_inspection_policy = gcp.networksecurity.TlsInspectionPolicy("default",
            name="my-tls-inspection-policy",
            location="us-central1",
            ca_pool=default.id,
            opts = pulumi.ResourceOptions(depends_on=[
                    default,
                    default_authority,
                    tls_inspection_permission,
                ]))
        default_gateway_security_policy = gcp.networksecurity.GatewaySecurityPolicy("default",
            name="my-gateway-security-policy",
            location="us-central1",
            description="my description",
            tls_inspection_policy=default_tls_inspection_policy.id,
            opts = pulumi.ResourceOptions(depends_on=[default_tls_inspection_policy]))
        ```

        ## Import

        GatewaySecurityPolicy can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, GatewaySecurityPolicy can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy default projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{name}}
        ```

        ```sh
        $ pulumi import gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[_builtins.str] location: The location of the gateway security policy.
               The default value is `global`.
        :param pulumi.Input[_builtins.str] name: Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
               gatewaySecurityPolicy should match the pattern:(^a-z?$).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] tls_inspection_policy: Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GatewaySecurityPolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The GatewaySecurityPolicy resource contains a collection of GatewaySecurityPolicyRules and associated metadata.

        To get more information about GatewaySecurityPolicy, see:

        * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies)

        ## Example Usage

        ### Network Security Gateway Security Policy Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.networksecurity.GatewaySecurityPolicy("default",
            name="my-gateway-security-policy",
            location="us-central1",
            description="my description")
        ```
        ### Network Security Gateway Security Policy Tls Inspection Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.certificateauthority.CaPool("default",
            name="my-basic-ca-pool",
            location="us-central1",
            tier="DEVOPS",
            publishing_options={
                "publish_ca_cert": False,
                "publish_crl": False,
            },
            issuance_policy={
                "maximum_lifetime": "1209600s",
                "baseline_values": {
                    "ca_options": {
                        "is_ca": False,
                    },
                    "key_usage": {
                        "base_key_usage": {},
                        "extended_key_usage": {
                            "server_auth": True,
                        },
                    },
                },
            })
        default_authority = gcp.certificateauthority.Authority("default",
            pool=default.name,
            certificate_authority_id="my-basic-certificate-authority",
            location="us-central1",
            lifetime="86400s",
            type="SELF_SIGNED",
            deletion_protection=False,
            skip_grace_period=True,
            ignore_active_certificates_on_deletion=True,
            config={
                "subject_config": {
                    "subject": {
                        "organization": "Test LLC",
                        "common_name": "my-ca",
                    },
                },
                "x509_config": {
                    "ca_options": {
                        "is_ca": True,
                    },
                    "key_usage": {
                        "base_key_usage": {
                            "cert_sign": True,
                            "crl_sign": True,
                        },
                        "extended_key_usage": {
                            "server_auth": False,
                        },
                    },
                },
            },
            key_spec={
                "algorithm": "RSA_PKCS1_4096_SHA256",
            })
        project = gcp.organizations.get_project()
        tls_inspection_permission = gcp.certificateauthority.CaPoolIamMember("tls_inspection_permission",
            ca_pool=default.id,
            role="roles/privateca.certificateManager",
            member=f"serviceAccount:service-{project.number}@gcp-sa-networksecurity.iam.gserviceaccount.com")
        default_tls_inspection_policy = gcp.networksecurity.TlsInspectionPolicy("default",
            name="my-tls-inspection-policy",
            location="us-central1",
            ca_pool=default.id,
            opts = pulumi.ResourceOptions(depends_on=[
                    default,
                    default_authority,
                    tls_inspection_permission,
                ]))
        default_gateway_security_policy = gcp.networksecurity.GatewaySecurityPolicy("default",
            name="my-gateway-security-policy",
            location="us-central1",
            description="my description",
            tls_inspection_policy=default_tls_inspection_policy.id,
            opts = pulumi.ResourceOptions(depends_on=[default_tls_inspection_policy]))
        ```

        ## Import

        GatewaySecurityPolicy can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, GatewaySecurityPolicy can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy default projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{name}}
        ```

        ```sh
        $ pulumi import gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param GatewaySecurityPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewaySecurityPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 tls_inspection_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewaySecurityPolicyArgs.__new__(GatewaySecurityPolicyArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["tls_inspection_policy"] = tls_inspection_policy
            __props__.__dict__["create_time"] = None
            __props__.__dict__["self_link"] = None
            __props__.__dict__["update_time"] = None
        super(GatewaySecurityPolicy, __self__).__init__(
            'gcp:networksecurity/gatewaySecurityPolicy:GatewaySecurityPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            self_link: Optional[pulumi.Input[_builtins.str]] = None,
            tls_inspection_policy: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'GatewaySecurityPolicy':
        """
        Get an existing GatewaySecurityPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: The timestamp when the resource was created.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        :param pulumi.Input[_builtins.str] description: A free-text description of the resource. Max length 1024 characters.
        :param pulumi.Input[_builtins.str] location: The location of the gateway security policy.
               The default value is `global`.
        :param pulumi.Input[_builtins.str] name: Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
               gatewaySecurityPolicy should match the pattern:(^a-z?$).
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] self_link: Server-defined URL of this resource.
        :param pulumi.Input[_builtins.str] tls_inspection_policy: Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        :param pulumi.Input[_builtins.str] update_time: The timestamp when the resource was updated.
               A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
               Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewaySecurityPolicyState.__new__(_GatewaySecurityPolicyState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["self_link"] = self_link
        __props__.__dict__["tls_inspection_policy"] = tls_inspection_policy
        __props__.__dict__["update_time"] = update_time
        return GatewaySecurityPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        The timestamp when the resource was created.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A free-text description of the resource. Max length 1024 characters.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The location of the gateway security policy.
        The default value is `global`.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the resource. Name is of the form projects/{project}/locations/{location}/gatewaySecurityPolicies/{gatewaySecurityPolicy}
        gatewaySecurityPolicy should match the pattern:(^a-z?$).
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> pulumi.Output[_builtins.str]:
        """
        Server-defined URL of this resource.
        """
        return pulumi.get(self, "self_link")

    @_builtins.property
    @pulumi.getter(name="tlsInspectionPolicy")
    def tls_inspection_policy(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Name of a TlsInspectionPolicy resource that defines how TLS inspection is performed for any rule that enables it.
        """
        return pulumi.get(self, "tls_inspection_policy")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        The timestamp when the resource was updated.
        A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

