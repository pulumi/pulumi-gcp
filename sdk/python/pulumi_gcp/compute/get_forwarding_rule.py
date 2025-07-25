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
    'GetForwardingRuleResult',
    'AwaitableGetForwardingRuleResult',
    'get_forwarding_rule',
    'get_forwarding_rule_output',
]

@pulumi.output_type
class GetForwardingRuleResult:
    """
    A collection of values returned by getForwardingRule.
    """
    def __init__(__self__, all_ports=None, allow_global_access=None, allow_psc_global_access=None, backend_service=None, base_forwarding_rule=None, creation_timestamp=None, description=None, effective_labels=None, forwarding_rule_id=None, id=None, ip_address=None, ip_collection=None, ip_protocol=None, ip_version=None, is_mirroring_collector=None, label_fingerprint=None, labels=None, load_balancing_scheme=None, name=None, network=None, network_tier=None, no_automate_dns_zone=None, port_range=None, ports=None, project=None, psc_connection_id=None, psc_connection_status=None, pulumi_labels=None, recreate_closed_psc=None, region=None, self_link=None, service_directory_registrations=None, service_label=None, service_name=None, source_ip_ranges=None, subnetwork=None, target=None):
        if all_ports and not isinstance(all_ports, bool):
            raise TypeError("Expected argument 'all_ports' to be a bool")
        pulumi.set(__self__, "all_ports", all_ports)
        if allow_global_access and not isinstance(allow_global_access, bool):
            raise TypeError("Expected argument 'allow_global_access' to be a bool")
        pulumi.set(__self__, "allow_global_access", allow_global_access)
        if allow_psc_global_access and not isinstance(allow_psc_global_access, bool):
            raise TypeError("Expected argument 'allow_psc_global_access' to be a bool")
        pulumi.set(__self__, "allow_psc_global_access", allow_psc_global_access)
        if backend_service and not isinstance(backend_service, str):
            raise TypeError("Expected argument 'backend_service' to be a str")
        pulumi.set(__self__, "backend_service", backend_service)
        if base_forwarding_rule and not isinstance(base_forwarding_rule, str):
            raise TypeError("Expected argument 'base_forwarding_rule' to be a str")
        pulumi.set(__self__, "base_forwarding_rule", base_forwarding_rule)
        if creation_timestamp and not isinstance(creation_timestamp, str):
            raise TypeError("Expected argument 'creation_timestamp' to be a str")
        pulumi.set(__self__, "creation_timestamp", creation_timestamp)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if effective_labels and not isinstance(effective_labels, dict):
            raise TypeError("Expected argument 'effective_labels' to be a dict")
        pulumi.set(__self__, "effective_labels", effective_labels)
        if forwarding_rule_id and not isinstance(forwarding_rule_id, int):
            raise TypeError("Expected argument 'forwarding_rule_id' to be a int")
        pulumi.set(__self__, "forwarding_rule_id", forwarding_rule_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if ip_collection and not isinstance(ip_collection, str):
            raise TypeError("Expected argument 'ip_collection' to be a str")
        pulumi.set(__self__, "ip_collection", ip_collection)
        if ip_protocol and not isinstance(ip_protocol, str):
            raise TypeError("Expected argument 'ip_protocol' to be a str")
        pulumi.set(__self__, "ip_protocol", ip_protocol)
        if ip_version and not isinstance(ip_version, str):
            raise TypeError("Expected argument 'ip_version' to be a str")
        pulumi.set(__self__, "ip_version", ip_version)
        if is_mirroring_collector and not isinstance(is_mirroring_collector, bool):
            raise TypeError("Expected argument 'is_mirroring_collector' to be a bool")
        pulumi.set(__self__, "is_mirroring_collector", is_mirroring_collector)
        if label_fingerprint and not isinstance(label_fingerprint, str):
            raise TypeError("Expected argument 'label_fingerprint' to be a str")
        pulumi.set(__self__, "label_fingerprint", label_fingerprint)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if load_balancing_scheme and not isinstance(load_balancing_scheme, str):
            raise TypeError("Expected argument 'load_balancing_scheme' to be a str")
        pulumi.set(__self__, "load_balancing_scheme", load_balancing_scheme)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network and not isinstance(network, str):
            raise TypeError("Expected argument 'network' to be a str")
        pulumi.set(__self__, "network", network)
        if network_tier and not isinstance(network_tier, str):
            raise TypeError("Expected argument 'network_tier' to be a str")
        pulumi.set(__self__, "network_tier", network_tier)
        if no_automate_dns_zone and not isinstance(no_automate_dns_zone, bool):
            raise TypeError("Expected argument 'no_automate_dns_zone' to be a bool")
        pulumi.set(__self__, "no_automate_dns_zone", no_automate_dns_zone)
        if port_range and not isinstance(port_range, str):
            raise TypeError("Expected argument 'port_range' to be a str")
        pulumi.set(__self__, "port_range", port_range)
        if ports and not isinstance(ports, list):
            raise TypeError("Expected argument 'ports' to be a list")
        pulumi.set(__self__, "ports", ports)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if psc_connection_id and not isinstance(psc_connection_id, str):
            raise TypeError("Expected argument 'psc_connection_id' to be a str")
        pulumi.set(__self__, "psc_connection_id", psc_connection_id)
        if psc_connection_status and not isinstance(psc_connection_status, str):
            raise TypeError("Expected argument 'psc_connection_status' to be a str")
        pulumi.set(__self__, "psc_connection_status", psc_connection_status)
        if pulumi_labels and not isinstance(pulumi_labels, dict):
            raise TypeError("Expected argument 'pulumi_labels' to be a dict")
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if recreate_closed_psc and not isinstance(recreate_closed_psc, bool):
            raise TypeError("Expected argument 'recreate_closed_psc' to be a bool")
        pulumi.set(__self__, "recreate_closed_psc", recreate_closed_psc)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if self_link and not isinstance(self_link, str):
            raise TypeError("Expected argument 'self_link' to be a str")
        pulumi.set(__self__, "self_link", self_link)
        if service_directory_registrations and not isinstance(service_directory_registrations, list):
            raise TypeError("Expected argument 'service_directory_registrations' to be a list")
        pulumi.set(__self__, "service_directory_registrations", service_directory_registrations)
        if service_label and not isinstance(service_label, str):
            raise TypeError("Expected argument 'service_label' to be a str")
        pulumi.set(__self__, "service_label", service_label)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if source_ip_ranges and not isinstance(source_ip_ranges, list):
            raise TypeError("Expected argument 'source_ip_ranges' to be a list")
        pulumi.set(__self__, "source_ip_ranges", source_ip_ranges)
        if subnetwork and not isinstance(subnetwork, str):
            raise TypeError("Expected argument 'subnetwork' to be a str")
        pulumi.set(__self__, "subnetwork", subnetwork)
        if target and not isinstance(target, str):
            raise TypeError("Expected argument 'target' to be a str")
        pulumi.set(__self__, "target", target)

    @_builtins.property
    @pulumi.getter(name="allPorts")
    def all_ports(self) -> _builtins.bool:
        return pulumi.get(self, "all_ports")

    @_builtins.property
    @pulumi.getter(name="allowGlobalAccess")
    def allow_global_access(self) -> _builtins.bool:
        return pulumi.get(self, "allow_global_access")

    @_builtins.property
    @pulumi.getter(name="allowPscGlobalAccess")
    def allow_psc_global_access(self) -> _builtins.bool:
        return pulumi.get(self, "allow_psc_global_access")

    @_builtins.property
    @pulumi.getter(name="backendService")
    def backend_service(self) -> _builtins.str:
        return pulumi.get(self, "backend_service")

    @_builtins.property
    @pulumi.getter(name="baseForwardingRule")
    def base_forwarding_rule(self) -> _builtins.str:
        return pulumi.get(self, "base_forwarding_rule")

    @_builtins.property
    @pulumi.getter(name="creationTimestamp")
    def creation_timestamp(self) -> _builtins.str:
        return pulumi.get(self, "creation_timestamp")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter(name="forwardingRuleId")
    def forwarding_rule_id(self) -> _builtins.int:
        return pulumi.get(self, "forwarding_rule_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> _builtins.str:
        return pulumi.get(self, "ip_address")

    @_builtins.property
    @pulumi.getter(name="ipCollection")
    def ip_collection(self) -> _builtins.str:
        return pulumi.get(self, "ip_collection")

    @_builtins.property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> _builtins.str:
        return pulumi.get(self, "ip_protocol")

    @_builtins.property
    @pulumi.getter(name="ipVersion")
    def ip_version(self) -> _builtins.str:
        return pulumi.get(self, "ip_version")

    @_builtins.property
    @pulumi.getter(name="isMirroringCollector")
    def is_mirroring_collector(self) -> _builtins.bool:
        return pulumi.get(self, "is_mirroring_collector")

    @_builtins.property
    @pulumi.getter(name="labelFingerprint")
    def label_fingerprint(self) -> _builtins.str:
        return pulumi.get(self, "label_fingerprint")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter(name="loadBalancingScheme")
    def load_balancing_scheme(self) -> _builtins.str:
        return pulumi.get(self, "load_balancing_scheme")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def network(self) -> _builtins.str:
        return pulumi.get(self, "network")

    @_builtins.property
    @pulumi.getter(name="networkTier")
    def network_tier(self) -> _builtins.str:
        return pulumi.get(self, "network_tier")

    @_builtins.property
    @pulumi.getter(name="noAutomateDnsZone")
    def no_automate_dns_zone(self) -> _builtins.bool:
        return pulumi.get(self, "no_automate_dns_zone")

    @_builtins.property
    @pulumi.getter(name="portRange")
    def port_range(self) -> _builtins.str:
        return pulumi.get(self, "port_range")

    @_builtins.property
    @pulumi.getter
    def ports(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "ports")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pscConnectionId")
    def psc_connection_id(self) -> _builtins.str:
        return pulumi.get(self, "psc_connection_id")

    @_builtins.property
    @pulumi.getter(name="pscConnectionStatus")
    def psc_connection_status(self) -> _builtins.str:
        return pulumi.get(self, "psc_connection_status")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter(name="recreateClosedPsc")
    def recreate_closed_psc(self) -> _builtins.bool:
        return pulumi.get(self, "recreate_closed_psc")

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> _builtins.str:
        return pulumi.get(self, "self_link")

    @_builtins.property
    @pulumi.getter(name="serviceDirectoryRegistrations")
    def service_directory_registrations(self) -> Sequence['outputs.GetForwardingRuleServiceDirectoryRegistrationResult']:
        return pulumi.get(self, "service_directory_registrations")

    @_builtins.property
    @pulumi.getter(name="serviceLabel")
    def service_label(self) -> _builtins.str:
        return pulumi.get(self, "service_label")

    @_builtins.property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> _builtins.str:
        return pulumi.get(self, "service_name")

    @_builtins.property
    @pulumi.getter(name="sourceIpRanges")
    def source_ip_ranges(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "source_ip_ranges")

    @_builtins.property
    @pulumi.getter
    def subnetwork(self) -> _builtins.str:
        return pulumi.get(self, "subnetwork")

    @_builtins.property
    @pulumi.getter
    def target(self) -> _builtins.str:
        return pulumi.get(self, "target")


class AwaitableGetForwardingRuleResult(GetForwardingRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetForwardingRuleResult(
            all_ports=self.all_ports,
            allow_global_access=self.allow_global_access,
            allow_psc_global_access=self.allow_psc_global_access,
            backend_service=self.backend_service,
            base_forwarding_rule=self.base_forwarding_rule,
            creation_timestamp=self.creation_timestamp,
            description=self.description,
            effective_labels=self.effective_labels,
            forwarding_rule_id=self.forwarding_rule_id,
            id=self.id,
            ip_address=self.ip_address,
            ip_collection=self.ip_collection,
            ip_protocol=self.ip_protocol,
            ip_version=self.ip_version,
            is_mirroring_collector=self.is_mirroring_collector,
            label_fingerprint=self.label_fingerprint,
            labels=self.labels,
            load_balancing_scheme=self.load_balancing_scheme,
            name=self.name,
            network=self.network,
            network_tier=self.network_tier,
            no_automate_dns_zone=self.no_automate_dns_zone,
            port_range=self.port_range,
            ports=self.ports,
            project=self.project,
            psc_connection_id=self.psc_connection_id,
            psc_connection_status=self.psc_connection_status,
            pulumi_labels=self.pulumi_labels,
            recreate_closed_psc=self.recreate_closed_psc,
            region=self.region,
            self_link=self.self_link,
            service_directory_registrations=self.service_directory_registrations,
            service_label=self.service_label,
            service_name=self.service_name,
            source_ip_ranges=self.source_ip_ranges,
            subnetwork=self.subnetwork,
            target=self.target)


def get_forwarding_rule(name: Optional[_builtins.str] = None,
                        project: Optional[_builtins.str] = None,
                        region: Optional[_builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetForwardingRuleResult:
    """
    Get a forwarding rule within GCE from its name.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_forwarding_rule = gcp.compute.get_forwarding_rule(name="forwarding-rule-us-east1")
    ```


    :param _builtins.str name: The name of the forwarding rule.
           
           
           - - -
    :param _builtins.str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param _builtins.str region: The region in which the resource belongs. If it
           is not provided, the project region is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getForwardingRule:getForwardingRule', __args__, opts=opts, typ=GetForwardingRuleResult).value

    return AwaitableGetForwardingRuleResult(
        all_ports=pulumi.get(__ret__, 'all_ports'),
        allow_global_access=pulumi.get(__ret__, 'allow_global_access'),
        allow_psc_global_access=pulumi.get(__ret__, 'allow_psc_global_access'),
        backend_service=pulumi.get(__ret__, 'backend_service'),
        base_forwarding_rule=pulumi.get(__ret__, 'base_forwarding_rule'),
        creation_timestamp=pulumi.get(__ret__, 'creation_timestamp'),
        description=pulumi.get(__ret__, 'description'),
        effective_labels=pulumi.get(__ret__, 'effective_labels'),
        forwarding_rule_id=pulumi.get(__ret__, 'forwarding_rule_id'),
        id=pulumi.get(__ret__, 'id'),
        ip_address=pulumi.get(__ret__, 'ip_address'),
        ip_collection=pulumi.get(__ret__, 'ip_collection'),
        ip_protocol=pulumi.get(__ret__, 'ip_protocol'),
        ip_version=pulumi.get(__ret__, 'ip_version'),
        is_mirroring_collector=pulumi.get(__ret__, 'is_mirroring_collector'),
        label_fingerprint=pulumi.get(__ret__, 'label_fingerprint'),
        labels=pulumi.get(__ret__, 'labels'),
        load_balancing_scheme=pulumi.get(__ret__, 'load_balancing_scheme'),
        name=pulumi.get(__ret__, 'name'),
        network=pulumi.get(__ret__, 'network'),
        network_tier=pulumi.get(__ret__, 'network_tier'),
        no_automate_dns_zone=pulumi.get(__ret__, 'no_automate_dns_zone'),
        port_range=pulumi.get(__ret__, 'port_range'),
        ports=pulumi.get(__ret__, 'ports'),
        project=pulumi.get(__ret__, 'project'),
        psc_connection_id=pulumi.get(__ret__, 'psc_connection_id'),
        psc_connection_status=pulumi.get(__ret__, 'psc_connection_status'),
        pulumi_labels=pulumi.get(__ret__, 'pulumi_labels'),
        recreate_closed_psc=pulumi.get(__ret__, 'recreate_closed_psc'),
        region=pulumi.get(__ret__, 'region'),
        self_link=pulumi.get(__ret__, 'self_link'),
        service_directory_registrations=pulumi.get(__ret__, 'service_directory_registrations'),
        service_label=pulumi.get(__ret__, 'service_label'),
        service_name=pulumi.get(__ret__, 'service_name'),
        source_ip_ranges=pulumi.get(__ret__, 'source_ip_ranges'),
        subnetwork=pulumi.get(__ret__, 'subnetwork'),
        target=pulumi.get(__ret__, 'target'))
def get_forwarding_rule_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                               project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               region: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetForwardingRuleResult]:
    """
    Get a forwarding rule within GCE from its name.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_forwarding_rule = gcp.compute.get_forwarding_rule(name="forwarding-rule-us-east1")
    ```


    :param _builtins.str name: The name of the forwarding rule.
           
           
           - - -
    :param _builtins.str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    :param _builtins.str region: The region in which the resource belongs. If it
           is not provided, the project region is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:compute/getForwardingRule:getForwardingRule', __args__, opts=opts, typ=GetForwardingRuleResult)
    return __ret__.apply(lambda __response__: GetForwardingRuleResult(
        all_ports=pulumi.get(__response__, 'all_ports'),
        allow_global_access=pulumi.get(__response__, 'allow_global_access'),
        allow_psc_global_access=pulumi.get(__response__, 'allow_psc_global_access'),
        backend_service=pulumi.get(__response__, 'backend_service'),
        base_forwarding_rule=pulumi.get(__response__, 'base_forwarding_rule'),
        creation_timestamp=pulumi.get(__response__, 'creation_timestamp'),
        description=pulumi.get(__response__, 'description'),
        effective_labels=pulumi.get(__response__, 'effective_labels'),
        forwarding_rule_id=pulumi.get(__response__, 'forwarding_rule_id'),
        id=pulumi.get(__response__, 'id'),
        ip_address=pulumi.get(__response__, 'ip_address'),
        ip_collection=pulumi.get(__response__, 'ip_collection'),
        ip_protocol=pulumi.get(__response__, 'ip_protocol'),
        ip_version=pulumi.get(__response__, 'ip_version'),
        is_mirroring_collector=pulumi.get(__response__, 'is_mirroring_collector'),
        label_fingerprint=pulumi.get(__response__, 'label_fingerprint'),
        labels=pulumi.get(__response__, 'labels'),
        load_balancing_scheme=pulumi.get(__response__, 'load_balancing_scheme'),
        name=pulumi.get(__response__, 'name'),
        network=pulumi.get(__response__, 'network'),
        network_tier=pulumi.get(__response__, 'network_tier'),
        no_automate_dns_zone=pulumi.get(__response__, 'no_automate_dns_zone'),
        port_range=pulumi.get(__response__, 'port_range'),
        ports=pulumi.get(__response__, 'ports'),
        project=pulumi.get(__response__, 'project'),
        psc_connection_id=pulumi.get(__response__, 'psc_connection_id'),
        psc_connection_status=pulumi.get(__response__, 'psc_connection_status'),
        pulumi_labels=pulumi.get(__response__, 'pulumi_labels'),
        recreate_closed_psc=pulumi.get(__response__, 'recreate_closed_psc'),
        region=pulumi.get(__response__, 'region'),
        self_link=pulumi.get(__response__, 'self_link'),
        service_directory_registrations=pulumi.get(__response__, 'service_directory_registrations'),
        service_label=pulumi.get(__response__, 'service_label'),
        service_name=pulumi.get(__response__, 'service_name'),
        source_ip_ranges=pulumi.get(__response__, 'source_ip_ranges'),
        subnetwork=pulumi.get(__response__, 'subnetwork'),
        target=pulumi.get(__response__, 'target')))
