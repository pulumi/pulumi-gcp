# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RegionSecurityPolicyArgs', 'RegionSecurityPolicy']

@pulumi.input_type
class RegionSecurityPolicyArgs:
    def __init__(__self__, *,
                 ddos_protection_config: Optional[pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RegionSecurityPolicy resource.
        :param pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs'] ddos_protection_config: Configuration for Google Cloud Armor DDOS Proctection Config.
               Structure is documented below.
        :param pulumi.Input[str] description: An optional description of this resource. Provide this property when you create the resource.
        :param pulumi.Input[str] name: Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               
               
               - - -
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The Region in which the created Region Security Policy should reside.
               If it is not provided, the provider region is used.
        :param pulumi.Input[str] type: The type indicates the intended use of the security policy.
               - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
               - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
               - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
               This field can be set only at resource creation time.
               Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        if ddos_protection_config is not None:
            pulumi.set(__self__, "ddos_protection_config", ddos_protection_config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="ddosProtectionConfig")
    def ddos_protection_config(self) -> Optional[pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs']]:
        """
        Configuration for Google Cloud Armor DDOS Proctection Config.
        Structure is documented below.
        """
        return pulumi.get(self, "ddos_protection_config")

    @ddos_protection_config.setter
    def ddos_protection_config(self, value: Optional[pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs']]):
        pulumi.set(self, "ddos_protection_config", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of this resource. Provide this property when you create the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
        Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The Region in which the created Region Security Policy should reside.
        If it is not provided, the provider region is used.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type indicates the intended use of the security policy.
        - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
        - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
        - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
        This field can be set only at resource creation time.
        Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _RegionSecurityPolicyState:
    def __init__(__self__, *,
                 ddos_protection_config: Optional[pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 fingerprint: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 self_link: Optional[pulumi.Input[str]] = None,
                 self_link_with_policy_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RegionSecurityPolicy resources.
        :param pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs'] ddos_protection_config: Configuration for Google Cloud Armor DDOS Proctection Config.
               Structure is documented below.
        :param pulumi.Input[str] description: An optional description of this resource. Provide this property when you create the resource.
        :param pulumi.Input[str] fingerprint: Fingerprint of this resource. This field is used internally during
               updates of this resource.
        :param pulumi.Input[str] name: Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               
               
               - - -
        :param pulumi.Input[str] policy_id: The unique identifier for the resource. This identifier is defined by the server.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The Region in which the created Region Security Policy should reside.
               If it is not provided, the provider region is used.
        :param pulumi.Input[str] self_link: Server-defined URL for the resource.
        :param pulumi.Input[str] self_link_with_policy_id: Server-defined URL for this resource with the resource id.
        :param pulumi.Input[str] type: The type indicates the intended use of the security policy.
               - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
               - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
               - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
               This field can be set only at resource creation time.
               Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        if ddos_protection_config is not None:
            pulumi.set(__self__, "ddos_protection_config", ddos_protection_config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if fingerprint is not None:
            pulumi.set(__self__, "fingerprint", fingerprint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if self_link is not None:
            pulumi.set(__self__, "self_link", self_link)
        if self_link_with_policy_id is not None:
            pulumi.set(__self__, "self_link_with_policy_id", self_link_with_policy_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="ddosProtectionConfig")
    def ddos_protection_config(self) -> Optional[pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs']]:
        """
        Configuration for Google Cloud Armor DDOS Proctection Config.
        Structure is documented below.
        """
        return pulumi.get(self, "ddos_protection_config")

    @ddos_protection_config.setter
    def ddos_protection_config(self, value: Optional[pulumi.Input['RegionSecurityPolicyDdosProtectionConfigArgs']]):
        pulumi.set(self, "ddos_protection_config", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of this resource. Provide this property when you create the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def fingerprint(self) -> Optional[pulumi.Input[str]]:
        """
        Fingerprint of this resource. This field is used internally during
        updates of this resource.
        """
        return pulumi.get(self, "fingerprint")

    @fingerprint.setter
    def fingerprint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fingerprint", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
        Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the resource. This identifier is defined by the server.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The Region in which the created Region Security Policy should reside.
        If it is not provided, the provider region is used.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> Optional[pulumi.Input[str]]:
        """
        Server-defined URL for the resource.
        """
        return pulumi.get(self, "self_link")

    @self_link.setter
    def self_link(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "self_link", value)

    @property
    @pulumi.getter(name="selfLinkWithPolicyId")
    def self_link_with_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        Server-defined URL for this resource with the resource id.
        """
        return pulumi.get(self, "self_link_with_policy_id")

    @self_link_with_policy_id.setter
    def self_link_with_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "self_link_with_policy_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type indicates the intended use of the security policy.
        - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
        - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
        - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
        This field can be set only at resource creation time.
        Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class RegionSecurityPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ddos_protection_config: Optional[pulumi.Input[pulumi.InputType['RegionSecurityPolicyDdosProtectionConfigArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Region Security Policy Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        region_sec_policy_basic = gcp.compute.RegionSecurityPolicy("region-sec-policy-basic",
            description="basic region security policy",
            type="CLOUD_ARMOR",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```
        ### Region Security Policy With Ddos Protection Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        region_sec_policy_ddos_protection = gcp.compute.RegionSecurityPolicy("region-sec-policy-ddos-protection",
            description="with ddos protection config",
            type="CLOUD_ARMOR_NETWORK",
            ddos_protection_config=gcp.compute.RegionSecurityPolicyDdosProtectionConfigArgs(
                ddos_protection="ADVANCED_PREVIEW",
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        RegionSecurityPolicy can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default projects/{{project}}/regions/{{region}}/securityPolicies/{{name}}
        ```

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{project}}/{{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RegionSecurityPolicyDdosProtectionConfigArgs']] ddos_protection_config: Configuration for Google Cloud Armor DDOS Proctection Config.
               Structure is documented below.
        :param pulumi.Input[str] description: An optional description of this resource. Provide this property when you create the resource.
        :param pulumi.Input[str] name: Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               
               
               - - -
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The Region in which the created Region Security Policy should reside.
               If it is not provided, the provider region is used.
        :param pulumi.Input[str] type: The type indicates the intended use of the security policy.
               - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
               - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
               - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
               This field can be set only at resource creation time.
               Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RegionSecurityPolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Region Security Policy Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        region_sec_policy_basic = gcp.compute.RegionSecurityPolicy("region-sec-policy-basic",
            description="basic region security policy",
            type="CLOUD_ARMOR",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```
        ### Region Security Policy With Ddos Protection Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        region_sec_policy_ddos_protection = gcp.compute.RegionSecurityPolicy("region-sec-policy-ddos-protection",
            description="with ddos protection config",
            type="CLOUD_ARMOR_NETWORK",
            ddos_protection_config=gcp.compute.RegionSecurityPolicyDdosProtectionConfigArgs(
                ddos_protection="ADVANCED_PREVIEW",
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        RegionSecurityPolicy can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default projects/{{project}}/regions/{{region}}/securityPolicies/{{name}}
        ```

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{project}}/{{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{region}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param RegionSecurityPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RegionSecurityPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ddos_protection_config: Optional[pulumi.Input[pulumi.InputType['RegionSecurityPolicyDdosProtectionConfigArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RegionSecurityPolicyArgs.__new__(RegionSecurityPolicyArgs)

            __props__.__dict__["ddos_protection_config"] = ddos_protection_config
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["type"] = type
            __props__.__dict__["fingerprint"] = None
            __props__.__dict__["policy_id"] = None
            __props__.__dict__["self_link"] = None
            __props__.__dict__["self_link_with_policy_id"] = None
        super(RegionSecurityPolicy, __self__).__init__(
            'gcp:compute/regionSecurityPolicy:RegionSecurityPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ddos_protection_config: Optional[pulumi.Input[pulumi.InputType['RegionSecurityPolicyDdosProtectionConfigArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            fingerprint: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            self_link: Optional[pulumi.Input[str]] = None,
            self_link_with_policy_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'RegionSecurityPolicy':
        """
        Get an existing RegionSecurityPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RegionSecurityPolicyDdosProtectionConfigArgs']] ddos_protection_config: Configuration for Google Cloud Armor DDOS Proctection Config.
               Structure is documented below.
        :param pulumi.Input[str] description: An optional description of this resource. Provide this property when you create the resource.
        :param pulumi.Input[str] fingerprint: Fingerprint of this resource. This field is used internally during
               updates of this resource.
        :param pulumi.Input[str] name: Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               
               
               - - -
        :param pulumi.Input[str] policy_id: The unique identifier for the resource. This identifier is defined by the server.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: The Region in which the created Region Security Policy should reside.
               If it is not provided, the provider region is used.
        :param pulumi.Input[str] self_link: Server-defined URL for the resource.
        :param pulumi.Input[str] self_link_with_policy_id: Server-defined URL for this resource with the resource id.
        :param pulumi.Input[str] type: The type indicates the intended use of the security policy.
               - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
               - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
               - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
               This field can be set only at resource creation time.
               Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RegionSecurityPolicyState.__new__(_RegionSecurityPolicyState)

        __props__.__dict__["ddos_protection_config"] = ddos_protection_config
        __props__.__dict__["description"] = description
        __props__.__dict__["fingerprint"] = fingerprint
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["project"] = project
        __props__.__dict__["region"] = region
        __props__.__dict__["self_link"] = self_link
        __props__.__dict__["self_link_with_policy_id"] = self_link_with_policy_id
        __props__.__dict__["type"] = type
        return RegionSecurityPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="ddosProtectionConfig")
    def ddos_protection_config(self) -> pulumi.Output[Optional['outputs.RegionSecurityPolicyDdosProtectionConfig']]:
        """
        Configuration for Google Cloud Armor DDOS Proctection Config.
        Structure is documented below.
        """
        return pulumi.get(self, "ddos_protection_config")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        An optional description of this resource. Provide this property when you create the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def fingerprint(self) -> pulumi.Output[str]:
        """
        Fingerprint of this resource. This field is used internally during
        updates of this resource.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
        Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.


        - - -
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the resource. This identifier is defined by the server.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The Region in which the created Region Security Policy should reside.
        If it is not provided, the provider region is used.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> pulumi.Output[str]:
        """
        Server-defined URL for the resource.
        """
        return pulumi.get(self, "self_link")

    @property
    @pulumi.getter(name="selfLinkWithPolicyId")
    def self_link_with_policy_id(self) -> pulumi.Output[str]:
        """
        Server-defined URL for this resource with the resource id.
        """
        return pulumi.get(self, "self_link_with_policy_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type indicates the intended use of the security policy.
        - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
        - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
        - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
        This field can be set only at resource creation time.
        Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        """
        return pulumi.get(self, "type")
