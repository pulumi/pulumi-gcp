# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'AppConnectorPrincipalInfoArgs',
    'AppConnectorPrincipalInfoServiceAccountArgs',
    'AppGatewayAllocatedConnectionArgs',
]

@pulumi.input_type
class AppConnectorPrincipalInfoArgs:
    def __init__(__self__, *,
                 service_account: pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs']):
        """
        :param pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs'] service_account: ServiceAccount represents a GCP service account.
               Structure is documented below.
        """
        pulumi.set(__self__, "service_account", service_account)

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs']:
        """
        ServiceAccount represents a GCP service account.
        Structure is documented below.
        """
        return pulumi.get(self, "service_account")

    @service_account.setter
    def service_account(self, value: pulumi.Input['AppConnectorPrincipalInfoServiceAccountArgs']):
        pulumi.set(self, "service_account", value)


@pulumi.input_type
class AppConnectorPrincipalInfoServiceAccountArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str]):
        """
        :param pulumi.Input[str] email: Email address of the service account.
        """
        pulumi.set(__self__, "email", email)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Email address of the service account.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)


@pulumi.input_type
class AppGatewayAllocatedConnectionArgs:
    def __init__(__self__, *,
                 ingress_port: Optional[pulumi.Input[int]] = None,
                 psc_uri: Optional[pulumi.Input[str]] = None):
        if ingress_port is not None:
            pulumi.set(__self__, "ingress_port", ingress_port)
        if psc_uri is not None:
            pulumi.set(__self__, "psc_uri", psc_uri)

    @property
    @pulumi.getter(name="ingressPort")
    def ingress_port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "ingress_port")

    @ingress_port.setter
    def ingress_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ingress_port", value)

    @property
    @pulumi.getter(name="pscUri")
    def psc_uri(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "psc_uri")

    @psc_uri.setter
    def psc_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "psc_uri", value)

