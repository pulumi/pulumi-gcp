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

__all__ = ['PolicyArgs', 'Policy']

@pulumi.input_type
class PolicyArgs:
    def __init__(__self__, *,
                 alternative_name_server_config: Optional[pulumi.Input['PolicyAlternativeNameServerConfigArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns64_config: Optional[pulumi.Input['PolicyDns64ConfigArgs']] = None,
                 enable_inbound_forwarding: Optional[pulumi.Input[_builtins.bool]] = None,
                 enable_logging: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Policy resource.
        :param pulumi.Input['PolicyAlternativeNameServerConfigArgs'] alternative_name_server_config: Sets an alternative name server for the associated networks.
               When specified, all DNS queries are forwarded to a name server that you choose.
               Names such as .internal are not available when an alternative name server is specified.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] description: A textual description field. Defaults to 'Managed by Pulumi'.
        :param pulumi.Input['PolicyDns64ConfigArgs'] dns64_config: Configurations related to DNS64 for this Policy.
               Structure is documented below.
        :param pulumi.Input[_builtins.bool] enable_inbound_forwarding: Allows networks bound to this policy to receive DNS queries sent
               by VMs or applications over VPN connections. When enabled, a
               virtual IP address will be allocated from each of the sub-networks
               that are bound to this policy.
        :param pulumi.Input[_builtins.bool] enable_logging: Controls whether logging is enabled for the networks bound to this policy.
               Defaults to no logging if not set.
        :param pulumi.Input[_builtins.str] name: User assigned name for this policy.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]] networks: List of network names specifying networks to which this policy is applied.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        if alternative_name_server_config is not None:
            pulumi.set(__self__, "alternative_name_server_config", alternative_name_server_config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns64_config is not None:
            pulumi.set(__self__, "dns64_config", dns64_config)
        if enable_inbound_forwarding is not None:
            pulumi.set(__self__, "enable_inbound_forwarding", enable_inbound_forwarding)
        if enable_logging is not None:
            pulumi.set(__self__, "enable_logging", enable_logging)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="alternativeNameServerConfig")
    def alternative_name_server_config(self) -> Optional[pulumi.Input['PolicyAlternativeNameServerConfigArgs']]:
        """
        Sets an alternative name server for the associated networks.
        When specified, all DNS queries are forwarded to a name server that you choose.
        Names such as .internal are not available when an alternative name server is specified.
        Structure is documented below.
        """
        return pulumi.get(self, "alternative_name_server_config")

    @alternative_name_server_config.setter
    def alternative_name_server_config(self, value: Optional[pulumi.Input['PolicyAlternativeNameServerConfigArgs']]):
        pulumi.set(self, "alternative_name_server_config", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A textual description field. Defaults to 'Managed by Pulumi'.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="dns64Config")
    def dns64_config(self) -> Optional[pulumi.Input['PolicyDns64ConfigArgs']]:
        """
        Configurations related to DNS64 for this Policy.
        Structure is documented below.
        """
        return pulumi.get(self, "dns64_config")

    @dns64_config.setter
    def dns64_config(self, value: Optional[pulumi.Input['PolicyDns64ConfigArgs']]):
        pulumi.set(self, "dns64_config", value)

    @_builtins.property
    @pulumi.getter(name="enableInboundForwarding")
    def enable_inbound_forwarding(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Allows networks bound to this policy to receive DNS queries sent
        by VMs or applications over VPN connections. When enabled, a
        virtual IP address will be allocated from each of the sub-networks
        that are bound to this policy.
        """
        return pulumi.get(self, "enable_inbound_forwarding")

    @enable_inbound_forwarding.setter
    def enable_inbound_forwarding(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_inbound_forwarding", value)

    @_builtins.property
    @pulumi.getter(name="enableLogging")
    def enable_logging(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Controls whether logging is enabled for the networks bound to this policy.
        Defaults to no logging if not set.
        """
        return pulumi.get(self, "enable_logging")

    @enable_logging.setter
    def enable_logging(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_logging", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User assigned name for this policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]]]:
        """
        List of network names specifying networks to which this policy is applied.
        Structure is documented below.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

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


@pulumi.input_type
class _PolicyState:
    def __init__(__self__, *,
                 alternative_name_server_config: Optional[pulumi.Input['PolicyAlternativeNameServerConfigArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns64_config: Optional[pulumi.Input['PolicyDns64ConfigArgs']] = None,
                 enable_inbound_forwarding: Optional[pulumi.Input[_builtins.bool]] = None,
                 enable_logging: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Policy resources.
        :param pulumi.Input['PolicyAlternativeNameServerConfigArgs'] alternative_name_server_config: Sets an alternative name server for the associated networks.
               When specified, all DNS queries are forwarded to a name server that you choose.
               Names such as .internal are not available when an alternative name server is specified.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] description: A textual description field. Defaults to 'Managed by Pulumi'.
        :param pulumi.Input['PolicyDns64ConfigArgs'] dns64_config: Configurations related to DNS64 for this Policy.
               Structure is documented below.
        :param pulumi.Input[_builtins.bool] enable_inbound_forwarding: Allows networks bound to this policy to receive DNS queries sent
               by VMs or applications over VPN connections. When enabled, a
               virtual IP address will be allocated from each of the sub-networks
               that are bound to this policy.
        :param pulumi.Input[_builtins.bool] enable_logging: Controls whether logging is enabled for the networks bound to this policy.
               Defaults to no logging if not set.
        :param pulumi.Input[_builtins.str] name: User assigned name for this policy.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]] networks: List of network names specifying networks to which this policy is applied.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        if alternative_name_server_config is not None:
            pulumi.set(__self__, "alternative_name_server_config", alternative_name_server_config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dns64_config is not None:
            pulumi.set(__self__, "dns64_config", dns64_config)
        if enable_inbound_forwarding is not None:
            pulumi.set(__self__, "enable_inbound_forwarding", enable_inbound_forwarding)
        if enable_logging is not None:
            pulumi.set(__self__, "enable_logging", enable_logging)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="alternativeNameServerConfig")
    def alternative_name_server_config(self) -> Optional[pulumi.Input['PolicyAlternativeNameServerConfigArgs']]:
        """
        Sets an alternative name server for the associated networks.
        When specified, all DNS queries are forwarded to a name server that you choose.
        Names such as .internal are not available when an alternative name server is specified.
        Structure is documented below.
        """
        return pulumi.get(self, "alternative_name_server_config")

    @alternative_name_server_config.setter
    def alternative_name_server_config(self, value: Optional[pulumi.Input['PolicyAlternativeNameServerConfigArgs']]):
        pulumi.set(self, "alternative_name_server_config", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A textual description field. Defaults to 'Managed by Pulumi'.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="dns64Config")
    def dns64_config(self) -> Optional[pulumi.Input['PolicyDns64ConfigArgs']]:
        """
        Configurations related to DNS64 for this Policy.
        Structure is documented below.
        """
        return pulumi.get(self, "dns64_config")

    @dns64_config.setter
    def dns64_config(self, value: Optional[pulumi.Input['PolicyDns64ConfigArgs']]):
        pulumi.set(self, "dns64_config", value)

    @_builtins.property
    @pulumi.getter(name="enableInboundForwarding")
    def enable_inbound_forwarding(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Allows networks bound to this policy to receive DNS queries sent
        by VMs or applications over VPN connections. When enabled, a
        virtual IP address will be allocated from each of the sub-networks
        that are bound to this policy.
        """
        return pulumi.get(self, "enable_inbound_forwarding")

    @enable_inbound_forwarding.setter
    def enable_inbound_forwarding(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_inbound_forwarding", value)

    @_builtins.property
    @pulumi.getter(name="enableLogging")
    def enable_logging(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Controls whether logging is enabled for the networks bound to this policy.
        Defaults to no logging if not set.
        """
        return pulumi.get(self, "enable_logging")

    @enable_logging.setter
    def enable_logging(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enable_logging", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User assigned name for this policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]]]:
        """
        List of network names specifying networks to which this policy is applied.
        Structure is documented below.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

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


@pulumi.type_token("gcp:dns/policy:Policy")
class Policy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alternative_name_server_config: Optional[pulumi.Input[Union['PolicyAlternativeNameServerConfigArgs', 'PolicyAlternativeNameServerConfigArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns64_config: Optional[pulumi.Input[Union['PolicyDns64ConfigArgs', 'PolicyDns64ConfigArgsDict']]] = None,
                 enable_inbound_forwarding: Optional[pulumi.Input[_builtins.bool]] = None,
                 enable_logging: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyNetworkArgs', 'PolicyNetworkArgsDict']]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A policy is a collection of DNS rules applied to one or more Virtual
        Private Cloud resources.

        To get more information about Policy, see:

        * [API documentation](https://cloud.google.com/dns/docs/reference/v1beta2/policies)
        * How-to Guides
            * [Using DNS server policies](https://cloud.google.com/dns/zones/#using-dns-server-policies)

        ## Example Usage

        ### Dns Policy Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        network_1 = gcp.compute.Network("network-1",
            name="network-1",
            auto_create_subnetworks=False)
        network_2 = gcp.compute.Network("network-2",
            name="network-2",
            auto_create_subnetworks=False)
        example_policy = gcp.dns.Policy("example-policy",
            name="example-policy",
            enable_inbound_forwarding=True,
            enable_logging=True,
            alternative_name_server_config={
                "target_name_servers": [
                    {
                        "ipv4_address": "172.16.1.10",
                        "forwarding_path": "private",
                    },
                    {
                        "ipv4_address": "172.16.1.20",
                    },
                ],
            },
            networks=[
                {
                    "network_url": network_1.id,
                },
                {
                    "network_url": network_2.id,
                },
            ])
        ```

        ## Import

        Policy can be imported using any of these accepted formats:

        * `projects/{{project}}/policies/{{name}}`

        * `{{project}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Policy can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:dns/policy:Policy default projects/{{project}}/policies/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dns/policy:Policy default {{project}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dns/policy:Policy default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PolicyAlternativeNameServerConfigArgs', 'PolicyAlternativeNameServerConfigArgsDict']] alternative_name_server_config: Sets an alternative name server for the associated networks.
               When specified, all DNS queries are forwarded to a name server that you choose.
               Names such as .internal are not available when an alternative name server is specified.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] description: A textual description field. Defaults to 'Managed by Pulumi'.
        :param pulumi.Input[Union['PolicyDns64ConfigArgs', 'PolicyDns64ConfigArgsDict']] dns64_config: Configurations related to DNS64 for this Policy.
               Structure is documented below.
        :param pulumi.Input[_builtins.bool] enable_inbound_forwarding: Allows networks bound to this policy to receive DNS queries sent
               by VMs or applications over VPN connections. When enabled, a
               virtual IP address will be allocated from each of the sub-networks
               that are bound to this policy.
        :param pulumi.Input[_builtins.bool] enable_logging: Controls whether logging is enabled for the networks bound to this policy.
               Defaults to no logging if not set.
        :param pulumi.Input[_builtins.str] name: User assigned name for this policy.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PolicyNetworkArgs', 'PolicyNetworkArgsDict']]]] networks: List of network names specifying networks to which this policy is applied.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A policy is a collection of DNS rules applied to one or more Virtual
        Private Cloud resources.

        To get more information about Policy, see:

        * [API documentation](https://cloud.google.com/dns/docs/reference/v1beta2/policies)
        * How-to Guides
            * [Using DNS server policies](https://cloud.google.com/dns/zones/#using-dns-server-policies)

        ## Example Usage

        ### Dns Policy Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        network_1 = gcp.compute.Network("network-1",
            name="network-1",
            auto_create_subnetworks=False)
        network_2 = gcp.compute.Network("network-2",
            name="network-2",
            auto_create_subnetworks=False)
        example_policy = gcp.dns.Policy("example-policy",
            name="example-policy",
            enable_inbound_forwarding=True,
            enable_logging=True,
            alternative_name_server_config={
                "target_name_servers": [
                    {
                        "ipv4_address": "172.16.1.10",
                        "forwarding_path": "private",
                    },
                    {
                        "ipv4_address": "172.16.1.20",
                    },
                ],
            },
            networks=[
                {
                    "network_url": network_1.id,
                },
                {
                    "network_url": network_2.id,
                },
            ])
        ```

        ## Import

        Policy can be imported using any of these accepted formats:

        * `projects/{{project}}/policies/{{name}}`

        * `{{project}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Policy can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:dns/policy:Policy default projects/{{project}}/policies/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dns/policy:Policy default {{project}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dns/policy:Policy default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param PolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alternative_name_server_config: Optional[pulumi.Input[Union['PolicyAlternativeNameServerConfigArgs', 'PolicyAlternativeNameServerConfigArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dns64_config: Optional[pulumi.Input[Union['PolicyDns64ConfigArgs', 'PolicyDns64ConfigArgsDict']]] = None,
                 enable_inbound_forwarding: Optional[pulumi.Input[_builtins.bool]] = None,
                 enable_logging: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyNetworkArgs', 'PolicyNetworkArgsDict']]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyArgs.__new__(PolicyArgs)

            __props__.__dict__["alternative_name_server_config"] = alternative_name_server_config
            __props__.__dict__["description"] = description
            __props__.__dict__["dns64_config"] = dns64_config
            __props__.__dict__["enable_inbound_forwarding"] = enable_inbound_forwarding
            __props__.__dict__["enable_logging"] = enable_logging
            __props__.__dict__["name"] = name
            __props__.__dict__["networks"] = networks
            __props__.__dict__["project"] = project
        super(Policy, __self__).__init__(
            'gcp:dns/policy:Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alternative_name_server_config: Optional[pulumi.Input[Union['PolicyAlternativeNameServerConfigArgs', 'PolicyAlternativeNameServerConfigArgsDict']]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            dns64_config: Optional[pulumi.Input[Union['PolicyDns64ConfigArgs', 'PolicyDns64ConfigArgsDict']]] = None,
            enable_inbound_forwarding: Optional[pulumi.Input[_builtins.bool]] = None,
            enable_logging: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyNetworkArgs', 'PolicyNetworkArgsDict']]]]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None) -> 'Policy':
        """
        Get an existing Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PolicyAlternativeNameServerConfigArgs', 'PolicyAlternativeNameServerConfigArgsDict']] alternative_name_server_config: Sets an alternative name server for the associated networks.
               When specified, all DNS queries are forwarded to a name server that you choose.
               Names such as .internal are not available when an alternative name server is specified.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] description: A textual description field. Defaults to 'Managed by Pulumi'.
        :param pulumi.Input[Union['PolicyDns64ConfigArgs', 'PolicyDns64ConfigArgsDict']] dns64_config: Configurations related to DNS64 for this Policy.
               Structure is documented below.
        :param pulumi.Input[_builtins.bool] enable_inbound_forwarding: Allows networks bound to this policy to receive DNS queries sent
               by VMs or applications over VPN connections. When enabled, a
               virtual IP address will be allocated from each of the sub-networks
               that are bound to this policy.
        :param pulumi.Input[_builtins.bool] enable_logging: Controls whether logging is enabled for the networks bound to this policy.
               Defaults to no logging if not set.
        :param pulumi.Input[_builtins.str] name: User assigned name for this policy.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PolicyNetworkArgs', 'PolicyNetworkArgsDict']]]] networks: List of network names specifying networks to which this policy is applied.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyState.__new__(_PolicyState)

        __props__.__dict__["alternative_name_server_config"] = alternative_name_server_config
        __props__.__dict__["description"] = description
        __props__.__dict__["dns64_config"] = dns64_config
        __props__.__dict__["enable_inbound_forwarding"] = enable_inbound_forwarding
        __props__.__dict__["enable_logging"] = enable_logging
        __props__.__dict__["name"] = name
        __props__.__dict__["networks"] = networks
        __props__.__dict__["project"] = project
        return Policy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="alternativeNameServerConfig")
    def alternative_name_server_config(self) -> pulumi.Output[Optional['outputs.PolicyAlternativeNameServerConfig']]:
        """
        Sets an alternative name server for the associated networks.
        When specified, all DNS queries are forwarded to a name server that you choose.
        Names such as .internal are not available when an alternative name server is specified.
        Structure is documented below.
        """
        return pulumi.get(self, "alternative_name_server_config")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A textual description field. Defaults to 'Managed by Pulumi'.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="dns64Config")
    def dns64_config(self) -> pulumi.Output['outputs.PolicyDns64Config']:
        """
        Configurations related to DNS64 for this Policy.
        Structure is documented below.
        """
        return pulumi.get(self, "dns64_config")

    @_builtins.property
    @pulumi.getter(name="enableInboundForwarding")
    def enable_inbound_forwarding(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Allows networks bound to this policy to receive DNS queries sent
        by VMs or applications over VPN connections. When enabled, a
        virtual IP address will be allocated from each of the sub-networks
        that are bound to this policy.
        """
        return pulumi.get(self, "enable_inbound_forwarding")

    @_builtins.property
    @pulumi.getter(name="enableLogging")
    def enable_logging(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Controls whether logging is enabled for the networks bound to this policy.
        Defaults to no logging if not set.
        """
        return pulumi.get(self, "enable_logging")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        User assigned name for this policy.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.PolicyNetwork']]]:
        """
        List of network names specifying networks to which this policy is applied.
        Structure is documented below.
        """
        return pulumi.get(self, "networks")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

