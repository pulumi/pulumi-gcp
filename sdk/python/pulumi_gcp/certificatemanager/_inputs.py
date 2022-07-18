# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'CertificateManagedArgs',
    'CertificateSelfManagedArgs',
    'DnsAuthorizationDnsResourceRecordArgs',
]

@pulumi.input_type
class CertificateManagedArgs:
    def __init__(__self__, *,
                 dns_authorizations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] dns_authorizations: Authorizations that will be used for performing domain authorization
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: The domains for which a managed SSL certificate will be generated.
               Wildcard domains are only supported with DNS challenge resolution
        :param pulumi.Input[str] state: -
               State of the managed certificate resource.
        """
        if dns_authorizations is not None:
            pulumi.set(__self__, "dns_authorizations", dns_authorizations)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="dnsAuthorizations")
    def dns_authorizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Authorizations that will be used for performing domain authorization
        """
        return pulumi.get(self, "dns_authorizations")

    @dns_authorizations.setter
    def dns_authorizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "dns_authorizations", value)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The domains for which a managed SSL certificate will be generated.
        Wildcard domains are only supported with DNS challenge resolution
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        -
        State of the managed certificate resource.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


@pulumi.input_type
class CertificateSelfManagedArgs:
    def __init__(__self__, *,
                 certificate_pem: pulumi.Input[str],
                 private_key_pem: pulumi.Input[str]):
        """
        :param pulumi.Input[str] certificate_pem: The certificate chain in PEM-encoded form.
               Leaf certificate comes first, followed by intermediate ones if any.
               **Note**: This property is sensitive and will not be displayed in the plan.
        :param pulumi.Input[str] private_key_pem: The private key of the leaf certificate in PEM-encoded form.
               **Note**: This property is sensitive and will not be displayed in the plan.
        """
        pulumi.set(__self__, "certificate_pem", certificate_pem)
        pulumi.set(__self__, "private_key_pem", private_key_pem)

    @property
    @pulumi.getter(name="certificatePem")
    def certificate_pem(self) -> pulumi.Input[str]:
        """
        The certificate chain in PEM-encoded form.
        Leaf certificate comes first, followed by intermediate ones if any.
        **Note**: This property is sensitive and will not be displayed in the plan.
        """
        return pulumi.get(self, "certificate_pem")

    @certificate_pem.setter
    def certificate_pem(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_pem", value)

    @property
    @pulumi.getter(name="privateKeyPem")
    def private_key_pem(self) -> pulumi.Input[str]:
        """
        The private key of the leaf certificate in PEM-encoded form.
        **Note**: This property is sensitive and will not be displayed in the plan.
        """
        return pulumi.get(self, "private_key_pem")

    @private_key_pem.setter
    def private_key_pem(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key_pem", value)


@pulumi.input_type
class DnsAuthorizationDnsResourceRecordArgs:
    def __init__(__self__, *,
                 data: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] name: Name of the resource; provided by the client when the resource is created.
               The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
               and all following characters must be a dash, underscore, letter or digit.
        """
        if data is not None:
            pulumi.set(__self__, "data", data)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource; provided by the client when the resource is created.
        The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
        and all following characters must be a dash, underscore, letter or digit.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

