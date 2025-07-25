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

__all__ = [
    'AppConnectionApplicationEndpoint',
    'AppConnectionGateway',
    'AppConnectorPrincipalInfo',
    'AppConnectorPrincipalInfoServiceAccount',
    'AppGatewayAllocatedConnection',
    'ApplicationEndpointMatcher',
    'ApplicationIamBindingCondition',
    'ApplicationIamMemberCondition',
    'ApplicationUpstream',
    'ApplicationUpstreamEgressPolicy',
    'ApplicationUpstreamNetwork',
    'SecurityGatewayApplicationEndpointMatcher',
    'SecurityGatewayApplicationIamBindingCondition',
    'SecurityGatewayApplicationIamMemberCondition',
    'SecurityGatewayApplicationUpstream',
    'SecurityGatewayApplicationUpstreamEgressPolicy',
    'SecurityGatewayApplicationUpstreamNetwork',
    'SecurityGatewayHub',
    'SecurityGatewayHubInternetGateway',
    'SecurityGatewayIamBindingCondition',
    'SecurityGatewayIamMemberCondition',
    'GetAppConnectionApplicationEndpointResult',
    'GetAppConnectionGatewayResult',
    'GetAppConnectorPrincipalInfoResult',
    'GetAppConnectorPrincipalInfoServiceAccountResult',
    'GetAppGatewayAllocatedConnectionResult',
    'GetSecurityGatewayHubResult',
    'GetSecurityGatewayHubInternetGatewayResult',
]

@pulumi.output_type
class AppConnectionApplicationEndpoint(dict):
    def __init__(__self__, *,
                 host: _builtins.str,
                 port: _builtins.int):
        """
        :param _builtins.str host: Hostname or IP address of the remote application endpoint.
        :param _builtins.int port: Port of the remote application endpoint.
        """
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "port", port)

    @_builtins.property
    @pulumi.getter
    def host(self) -> _builtins.str:
        """
        Hostname or IP address of the remote application endpoint.
        """
        return pulumi.get(self, "host")

    @_builtins.property
    @pulumi.getter
    def port(self) -> _builtins.int:
        """
        Port of the remote application endpoint.
        """
        return pulumi.get(self, "port")


@pulumi.output_type
class AppConnectionGateway(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "appGateway":
            suggest = "app_gateway"
        elif key == "ingressPort":
            suggest = "ingress_port"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AppConnectionGateway. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AppConnectionGateway.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AppConnectionGateway.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 app_gateway: _builtins.str,
                 ingress_port: Optional[_builtins.int] = None,
                 type: Optional[_builtins.str] = None,
                 uri: Optional[_builtins.str] = None):
        """
        :param _builtins.str app_gateway: AppGateway name in following format: projects/{project_id}/locations/{locationId}/appgateways/{gateway_id}.
        :param _builtins.int ingress_port: (Output)
               Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
        :param _builtins.str type: The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        :param _builtins.str uri: (Output)
               Server-defined URI for this resource.
        """
        pulumi.set(__self__, "app_gateway", app_gateway)
        if ingress_port is not None:
            pulumi.set(__self__, "ingress_port", ingress_port)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @_builtins.property
    @pulumi.getter(name="appGateway")
    def app_gateway(self) -> _builtins.str:
        """
        AppGateway name in following format: projects/{project_id}/locations/{locationId}/appgateways/{gateway_id}.
        """
        return pulumi.get(self, "app_gateway")

    @_builtins.property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> Optional[_builtins.int]:
        """
        (Output)
        Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
        """
        return pulumi.get(self, "ingress_port")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        """
        The type of hosting used by the gateway. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
        for a list of possible values.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def uri(self) -> Optional[_builtins.str]:
        """
        (Output)
        Server-defined URI for this resource.
        """
        return pulumi.get(self, "uri")


@pulumi.output_type
class AppConnectorPrincipalInfo(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "serviceAccount":
            suggest = "service_account"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AppConnectorPrincipalInfo. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AppConnectorPrincipalInfo.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AppConnectorPrincipalInfo.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 service_account: 'outputs.AppConnectorPrincipalInfoServiceAccount'):
        """
        :param 'AppConnectorPrincipalInfoServiceAccountArgs' service_account: ServiceAccount represents a GCP service account.
               Structure is documented below.
        """
        pulumi.set(__self__, "service_account", service_account)

    @_builtins.property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> 'outputs.AppConnectorPrincipalInfoServiceAccount':
        """
        ServiceAccount represents a GCP service account.
        Structure is documented below.
        """
        return pulumi.get(self, "service_account")


@pulumi.output_type
class AppConnectorPrincipalInfoServiceAccount(dict):
    def __init__(__self__, *,
                 email: _builtins.str):
        """
        :param _builtins.str email: Email address of the service account.
        """
        pulumi.set(__self__, "email", email)

    @_builtins.property
    @pulumi.getter
    def email(self) -> _builtins.str:
        """
        Email address of the service account.
        """
        return pulumi.get(self, "email")


@pulumi.output_type
class AppGatewayAllocatedConnection(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ingressPort":
            suggest = "ingress_port"
        elif key == "pscUri":
            suggest = "psc_uri"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AppGatewayAllocatedConnection. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AppGatewayAllocatedConnection.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AppGatewayAllocatedConnection.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ingress_port: Optional[_builtins.int] = None,
                 psc_uri: Optional[_builtins.str] = None):
        """
        :param _builtins.int ingress_port: The ingress port of an allocated connection.
        :param _builtins.str psc_uri: The PSC uri of an allocated connection.
        """
        if ingress_port is not None:
            pulumi.set(__self__, "ingress_port", ingress_port)
        if psc_uri is not None:
            pulumi.set(__self__, "psc_uri", psc_uri)

    @_builtins.property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> Optional[_builtins.int]:
        """
        The ingress port of an allocated connection.
        """
        return pulumi.get(self, "ingress_port")

    @_builtins.property
    @pulumi.getter(name="pscUri")
    def psc_uri(self) -> Optional[_builtins.str]:
        """
        The PSC uri of an allocated connection.
        """
        return pulumi.get(self, "psc_uri")


@pulumi.output_type
class ApplicationEndpointMatcher(dict):
    def __init__(__self__, *,
                 hostname: _builtins.str,
                 ports: Optional[Sequence[_builtins.int]] = None):
        """
        :param _builtins.str hostname: Required. Hostname of the application.
        :param Sequence[_builtins.int] ports: Optional. Ports of the application.
        """
        pulumi.set(__self__, "hostname", hostname)
        if ports is not None:
            pulumi.set(__self__, "ports", ports)

    @_builtins.property
    @pulumi.getter
    def hostname(self) -> _builtins.str:
        """
        Required. Hostname of the application.
        """
        return pulumi.get(self, "hostname")

    @_builtins.property
    @pulumi.getter
    def ports(self) -> Optional[Sequence[_builtins.int]]:
        """
        Optional. Ports of the application.
        """
        return pulumi.get(self, "ports")


@pulumi.output_type
class ApplicationIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class ApplicationIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class ApplicationUpstream(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "egressPolicy":
            suggest = "egress_policy"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ApplicationUpstream. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ApplicationUpstream.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ApplicationUpstream.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 egress_policy: Optional['outputs.ApplicationUpstreamEgressPolicy'] = None,
                 network: Optional['outputs.ApplicationUpstreamNetwork'] = None):
        """
        :param 'ApplicationUpstreamEgressPolicyArgs' egress_policy: Optional. Routing policy information.
               Structure is documented below.
        :param 'ApplicationUpstreamNetworkArgs' network: Network to forward traffic to.
               Structure is documented below.
        """
        if egress_policy is not None:
            pulumi.set(__self__, "egress_policy", egress_policy)
        if network is not None:
            pulumi.set(__self__, "network", network)

    @_builtins.property
    @pulumi.getter(name="egressPolicy")
    def egress_policy(self) -> Optional['outputs.ApplicationUpstreamEgressPolicy']:
        """
        Optional. Routing policy information.
        Structure is documented below.
        """
        return pulumi.get(self, "egress_policy")

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional['outputs.ApplicationUpstreamNetwork']:
        """
        Network to forward traffic to.
        Structure is documented below.
        """
        return pulumi.get(self, "network")


@pulumi.output_type
class ApplicationUpstreamEgressPolicy(dict):
    def __init__(__self__, *,
                 regions: Sequence[_builtins.str]):
        """
        :param Sequence[_builtins.str] regions: Required. List of regions where the application sends traffic to.
        """
        pulumi.set(__self__, "regions", regions)

    @_builtins.property
    @pulumi.getter
    def regions(self) -> Sequence[_builtins.str]:
        """
        Required. List of regions where the application sends traffic to.
        """
        return pulumi.get(self, "regions")


@pulumi.output_type
class ApplicationUpstreamNetwork(dict):
    def __init__(__self__, *,
                 name: _builtins.str):
        """
        :param _builtins.str name: Required. Network name is of the format:
               `projects/{project}/global/networks/{network}`
        """
        pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Required. Network name is of the format:
        `projects/{project}/global/networks/{network}`
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class SecurityGatewayApplicationEndpointMatcher(dict):
    def __init__(__self__, *,
                 hostname: _builtins.str,
                 ports: Optional[Sequence[_builtins.int]] = None):
        """
        :param _builtins.str hostname: Required. Hostname of the application.
        :param Sequence[_builtins.int] ports: Optional. Ports of the application.
        """
        pulumi.set(__self__, "hostname", hostname)
        if ports is not None:
            pulumi.set(__self__, "ports", ports)

    @_builtins.property
    @pulumi.getter
    def hostname(self) -> _builtins.str:
        """
        Required. Hostname of the application.
        """
        return pulumi.get(self, "hostname")

    @_builtins.property
    @pulumi.getter
    def ports(self) -> Optional[Sequence[_builtins.int]]:
        """
        Optional. Ports of the application.
        """
        return pulumi.get(self, "ports")


@pulumi.output_type
class SecurityGatewayApplicationIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class SecurityGatewayApplicationIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class SecurityGatewayApplicationUpstream(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "egressPolicy":
            suggest = "egress_policy"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SecurityGatewayApplicationUpstream. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SecurityGatewayApplicationUpstream.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SecurityGatewayApplicationUpstream.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 egress_policy: Optional['outputs.SecurityGatewayApplicationUpstreamEgressPolicy'] = None,
                 network: Optional['outputs.SecurityGatewayApplicationUpstreamNetwork'] = None):
        """
        :param 'SecurityGatewayApplicationUpstreamEgressPolicyArgs' egress_policy: Optional. Routing policy information.
               Structure is documented below.
        :param 'SecurityGatewayApplicationUpstreamNetworkArgs' network: Network to forward traffic to.
               Structure is documented below.
        """
        if egress_policy is not None:
            pulumi.set(__self__, "egress_policy", egress_policy)
        if network is not None:
            pulumi.set(__self__, "network", network)

    @_builtins.property
    @pulumi.getter(name="egressPolicy")
    def egress_policy(self) -> Optional['outputs.SecurityGatewayApplicationUpstreamEgressPolicy']:
        """
        Optional. Routing policy information.
        Structure is documented below.
        """
        return pulumi.get(self, "egress_policy")

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional['outputs.SecurityGatewayApplicationUpstreamNetwork']:
        """
        Network to forward traffic to.
        Structure is documented below.
        """
        return pulumi.get(self, "network")


@pulumi.output_type
class SecurityGatewayApplicationUpstreamEgressPolicy(dict):
    def __init__(__self__, *,
                 regions: Sequence[_builtins.str]):
        """
        :param Sequence[_builtins.str] regions: Required. List of regions where the application sends traffic to.
        """
        pulumi.set(__self__, "regions", regions)

    @_builtins.property
    @pulumi.getter
    def regions(self) -> Sequence[_builtins.str]:
        """
        Required. List of regions where the application sends traffic to.
        """
        return pulumi.get(self, "regions")


@pulumi.output_type
class SecurityGatewayApplicationUpstreamNetwork(dict):
    def __init__(__self__, *,
                 name: _builtins.str):
        """
        :param _builtins.str name: Required. Network name is of the format:
               `projects/{project}/global/networks/{network}`
        """
        pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Required. Network name is of the format:
        `projects/{project}/global/networks/{network}`
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class SecurityGatewayHub(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "internetGateway":
            suggest = "internet_gateway"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SecurityGatewayHub. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SecurityGatewayHub.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SecurityGatewayHub.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 region: _builtins.str,
                 internet_gateway: Optional['outputs.SecurityGatewayHubInternetGateway'] = None):
        """
        :param _builtins.str region: The identifier for this object. Format specified above.
        :param 'SecurityGatewayHubInternetGatewayArgs' internet_gateway: Internet Gateway configuration.
               Structure is documented below.
        """
        pulumi.set(__self__, "region", region)
        if internet_gateway is not None:
            pulumi.set(__self__, "internet_gateway", internet_gateway)

    @_builtins.property
    @pulumi.getter
    def region(self) -> _builtins.str:
        """
        The identifier for this object. Format specified above.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter(name="internetGateway")
    def internet_gateway(self) -> Optional['outputs.SecurityGatewayHubInternetGateway']:
        """
        Internet Gateway configuration.
        Structure is documented below.
        """
        return pulumi.get(self, "internet_gateway")


@pulumi.output_type
class SecurityGatewayHubInternetGateway(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "assignedIps":
            suggest = "assigned_ips"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SecurityGatewayHubInternetGateway. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SecurityGatewayHubInternetGateway.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SecurityGatewayHubInternetGateway.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 assigned_ips: Optional[Sequence[_builtins.str]] = None):
        """
        :param Sequence[_builtins.str] assigned_ips: (Output)
               Output only. List of IP addresses assigned to the Cloud NAT.
        """
        if assigned_ips is not None:
            pulumi.set(__self__, "assigned_ips", assigned_ips)

    @_builtins.property
    @pulumi.getter(name="assignedIps")
    def assigned_ips(self) -> Optional[Sequence[_builtins.str]]:
        """
        (Output)
        Output only. List of IP addresses assigned to the Cloud NAT.
        """
        return pulumi.get(self, "assigned_ips")


@pulumi.output_type
class SecurityGatewayIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class SecurityGatewayIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        """
        :param _builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param _builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class GetAppConnectionApplicationEndpointResult(dict):
    def __init__(__self__, *,
                 host: _builtins.str,
                 port: _builtins.int):
        """
        :param _builtins.str host: Hostname or IP address of the remote application endpoint.
        :param _builtins.int port: Port of the remote application endpoint.
        """
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "port", port)

    @_builtins.property
    @pulumi.getter
    def host(self) -> _builtins.str:
        """
        Hostname or IP address of the remote application endpoint.
        """
        return pulumi.get(self, "host")

    @_builtins.property
    @pulumi.getter
    def port(self) -> _builtins.int:
        """
        Port of the remote application endpoint.
        """
        return pulumi.get(self, "port")


@pulumi.output_type
class GetAppConnectionGatewayResult(dict):
    def __init__(__self__, *,
                 app_gateway: _builtins.str,
                 ingress_port: _builtins.int,
                 type: _builtins.str,
                 uri: _builtins.str):
        """
        :param _builtins.str app_gateway: AppGateway name in following format: projects/{project_id}/locations/{locationId}/appgateways/{gateway_id}.
        :param _builtins.int ingress_port: Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
        :param _builtins.str type: The type of hosting used by the gateway. Refer to
               https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
               for a list of possible values.
        :param _builtins.str uri: Server-defined URI for this resource.
        """
        pulumi.set(__self__, "app_gateway", app_gateway)
        pulumi.set(__self__, "ingress_port", ingress_port)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "uri", uri)

    @_builtins.property
    @pulumi.getter(name="appGateway")
    def app_gateway(self) -> _builtins.str:
        """
        AppGateway name in following format: projects/{project_id}/locations/{locationId}/appgateways/{gateway_id}.
        """
        return pulumi.get(self, "app_gateway")

    @_builtins.property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> _builtins.int:
        """
        Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
        """
        return pulumi.get(self, "ingress_port")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The type of hosting used by the gateway. Refer to
        https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
        for a list of possible values.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def uri(self) -> _builtins.str:
        """
        Server-defined URI for this resource.
        """
        return pulumi.get(self, "uri")


@pulumi.output_type
class GetAppConnectorPrincipalInfoResult(dict):
    def __init__(__self__, *,
                 service_accounts: Sequence['outputs.GetAppConnectorPrincipalInfoServiceAccountResult']):
        """
        :param Sequence['GetAppConnectorPrincipalInfoServiceAccountArgs'] service_accounts: ServiceAccount represents a GCP service account.
        """
        pulumi.set(__self__, "service_accounts", service_accounts)

    @_builtins.property
    @pulumi.getter(name="serviceAccounts")
    def service_accounts(self) -> Sequence['outputs.GetAppConnectorPrincipalInfoServiceAccountResult']:
        """
        ServiceAccount represents a GCP service account.
        """
        return pulumi.get(self, "service_accounts")


@pulumi.output_type
class GetAppConnectorPrincipalInfoServiceAccountResult(dict):
    def __init__(__self__, *,
                 email: _builtins.str):
        """
        :param _builtins.str email: Email address of the service account.
        """
        pulumi.set(__self__, "email", email)

    @_builtins.property
    @pulumi.getter
    def email(self) -> _builtins.str:
        """
        Email address of the service account.
        """
        return pulumi.get(self, "email")


@pulumi.output_type
class GetAppGatewayAllocatedConnectionResult(dict):
    def __init__(__self__, *,
                 ingress_port: _builtins.int,
                 psc_uri: _builtins.str):
        """
        :param _builtins.int ingress_port: The ingress port of an allocated connection.
        :param _builtins.str psc_uri: The PSC uri of an allocated connection.
        """
        pulumi.set(__self__, "ingress_port", ingress_port)
        pulumi.set(__self__, "psc_uri", psc_uri)

    @_builtins.property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> _builtins.int:
        """
        The ingress port of an allocated connection.
        """
        return pulumi.get(self, "ingress_port")

    @_builtins.property
    @pulumi.getter(name="pscUri")
    def psc_uri(self) -> _builtins.str:
        """
        The PSC uri of an allocated connection.
        """
        return pulumi.get(self, "psc_uri")


@pulumi.output_type
class GetSecurityGatewayHubResult(dict):
    def __init__(__self__, *,
                 internet_gateways: Sequence['outputs.GetSecurityGatewayHubInternetGatewayResult'],
                 region: _builtins.str):
        """
        :param Sequence['GetSecurityGatewayHubInternetGatewayArgs'] internet_gateways: Internet Gateway configuration.
        """
        pulumi.set(__self__, "internet_gateways", internet_gateways)
        pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter(name="internetGateways")
    def internet_gateways(self) -> Sequence['outputs.GetSecurityGatewayHubInternetGatewayResult']:
        """
        Internet Gateway configuration.
        """
        return pulumi.get(self, "internet_gateways")

    @_builtins.property
    @pulumi.getter
    def region(self) -> _builtins.str:
        return pulumi.get(self, "region")


@pulumi.output_type
class GetSecurityGatewayHubInternetGatewayResult(dict):
    def __init__(__self__, *,
                 assigned_ips: Sequence[_builtins.str]):
        """
        :param Sequence[_builtins.str] assigned_ips: Output only. List of IP addresses assigned to the Cloud NAT.
        """
        pulumi.set(__self__, "assigned_ips", assigned_ips)

    @_builtins.property
    @pulumi.getter(name="assignedIps")
    def assigned_ips(self) -> Sequence[_builtins.str]:
        """
        Output only. List of IP addresses assigned to the Cloud NAT.
        """
        return pulumi.get(self, "assigned_ips")


