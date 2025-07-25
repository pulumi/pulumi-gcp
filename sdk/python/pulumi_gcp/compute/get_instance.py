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
    'GetInstanceResult',
    'AwaitableGetInstanceResult',
    'get_instance',
    'get_instance_output',
]

@pulumi.output_type
class GetInstanceResult:
    """
    A collection of values returned by getInstance.
    """
    def __init__(__self__, advanced_machine_features=None, allow_stopping_for_update=None, attached_disks=None, boot_disks=None, can_ip_forward=None, confidential_instance_configs=None, cpu_platform=None, creation_timestamp=None, current_status=None, deletion_protection=None, description=None, desired_status=None, effective_labels=None, enable_display=None, guest_accelerators=None, hostname=None, id=None, instance_encryption_keys=None, instance_id=None, key_revocation_action_type=None, label_fingerprint=None, labels=None, machine_type=None, metadata=None, metadata_fingerprint=None, metadata_startup_script=None, min_cpu_platform=None, name=None, network_interfaces=None, network_performance_configs=None, params=None, partner_metadata=None, project=None, pulumi_labels=None, reservation_affinities=None, resource_policies=None, schedulings=None, scratch_disks=None, self_link=None, service_accounts=None, shielded_instance_configs=None, tags=None, tags_fingerprint=None, zone=None):
        if advanced_machine_features and not isinstance(advanced_machine_features, list):
            raise TypeError("Expected argument 'advanced_machine_features' to be a list")
        pulumi.set(__self__, "advanced_machine_features", advanced_machine_features)
        if allow_stopping_for_update and not isinstance(allow_stopping_for_update, bool):
            raise TypeError("Expected argument 'allow_stopping_for_update' to be a bool")
        pulumi.set(__self__, "allow_stopping_for_update", allow_stopping_for_update)
        if attached_disks and not isinstance(attached_disks, list):
            raise TypeError("Expected argument 'attached_disks' to be a list")
        pulumi.set(__self__, "attached_disks", attached_disks)
        if boot_disks and not isinstance(boot_disks, list):
            raise TypeError("Expected argument 'boot_disks' to be a list")
        pulumi.set(__self__, "boot_disks", boot_disks)
        if can_ip_forward and not isinstance(can_ip_forward, bool):
            raise TypeError("Expected argument 'can_ip_forward' to be a bool")
        pulumi.set(__self__, "can_ip_forward", can_ip_forward)
        if confidential_instance_configs and not isinstance(confidential_instance_configs, list):
            raise TypeError("Expected argument 'confidential_instance_configs' to be a list")
        pulumi.set(__self__, "confidential_instance_configs", confidential_instance_configs)
        if cpu_platform and not isinstance(cpu_platform, str):
            raise TypeError("Expected argument 'cpu_platform' to be a str")
        pulumi.set(__self__, "cpu_platform", cpu_platform)
        if creation_timestamp and not isinstance(creation_timestamp, str):
            raise TypeError("Expected argument 'creation_timestamp' to be a str")
        pulumi.set(__self__, "creation_timestamp", creation_timestamp)
        if current_status and not isinstance(current_status, str):
            raise TypeError("Expected argument 'current_status' to be a str")
        pulumi.set(__self__, "current_status", current_status)
        if deletion_protection and not isinstance(deletion_protection, bool):
            raise TypeError("Expected argument 'deletion_protection' to be a bool")
        pulumi.set(__self__, "deletion_protection", deletion_protection)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if desired_status and not isinstance(desired_status, str):
            raise TypeError("Expected argument 'desired_status' to be a str")
        pulumi.set(__self__, "desired_status", desired_status)
        if effective_labels and not isinstance(effective_labels, dict):
            raise TypeError("Expected argument 'effective_labels' to be a dict")
        pulumi.set(__self__, "effective_labels", effective_labels)
        if enable_display and not isinstance(enable_display, bool):
            raise TypeError("Expected argument 'enable_display' to be a bool")
        pulumi.set(__self__, "enable_display", enable_display)
        if guest_accelerators and not isinstance(guest_accelerators, list):
            raise TypeError("Expected argument 'guest_accelerators' to be a list")
        pulumi.set(__self__, "guest_accelerators", guest_accelerators)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_encryption_keys and not isinstance(instance_encryption_keys, list):
            raise TypeError("Expected argument 'instance_encryption_keys' to be a list")
        pulumi.set(__self__, "instance_encryption_keys", instance_encryption_keys)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if key_revocation_action_type and not isinstance(key_revocation_action_type, str):
            raise TypeError("Expected argument 'key_revocation_action_type' to be a str")
        pulumi.set(__self__, "key_revocation_action_type", key_revocation_action_type)
        if label_fingerprint and not isinstance(label_fingerprint, str):
            raise TypeError("Expected argument 'label_fingerprint' to be a str")
        pulumi.set(__self__, "label_fingerprint", label_fingerprint)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if machine_type and not isinstance(machine_type, str):
            raise TypeError("Expected argument 'machine_type' to be a str")
        pulumi.set(__self__, "machine_type", machine_type)
        if metadata and not isinstance(metadata, dict):
            raise TypeError("Expected argument 'metadata' to be a dict")
        pulumi.set(__self__, "metadata", metadata)
        if metadata_fingerprint and not isinstance(metadata_fingerprint, str):
            raise TypeError("Expected argument 'metadata_fingerprint' to be a str")
        pulumi.set(__self__, "metadata_fingerprint", metadata_fingerprint)
        if metadata_startup_script and not isinstance(metadata_startup_script, str):
            raise TypeError("Expected argument 'metadata_startup_script' to be a str")
        pulumi.set(__self__, "metadata_startup_script", metadata_startup_script)
        if min_cpu_platform and not isinstance(min_cpu_platform, str):
            raise TypeError("Expected argument 'min_cpu_platform' to be a str")
        pulumi.set(__self__, "min_cpu_platform", min_cpu_platform)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_interfaces and not isinstance(network_interfaces, list):
            raise TypeError("Expected argument 'network_interfaces' to be a list")
        pulumi.set(__self__, "network_interfaces", network_interfaces)
        if network_performance_configs and not isinstance(network_performance_configs, list):
            raise TypeError("Expected argument 'network_performance_configs' to be a list")
        pulumi.set(__self__, "network_performance_configs", network_performance_configs)
        if params and not isinstance(params, list):
            raise TypeError("Expected argument 'params' to be a list")
        pulumi.set(__self__, "params", params)
        if partner_metadata and not isinstance(partner_metadata, dict):
            raise TypeError("Expected argument 'partner_metadata' to be a dict")
        pulumi.set(__self__, "partner_metadata", partner_metadata)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if pulumi_labels and not isinstance(pulumi_labels, dict):
            raise TypeError("Expected argument 'pulumi_labels' to be a dict")
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if reservation_affinities and not isinstance(reservation_affinities, list):
            raise TypeError("Expected argument 'reservation_affinities' to be a list")
        pulumi.set(__self__, "reservation_affinities", reservation_affinities)
        if resource_policies and not isinstance(resource_policies, list):
            raise TypeError("Expected argument 'resource_policies' to be a list")
        pulumi.set(__self__, "resource_policies", resource_policies)
        if schedulings and not isinstance(schedulings, list):
            raise TypeError("Expected argument 'schedulings' to be a list")
        pulumi.set(__self__, "schedulings", schedulings)
        if scratch_disks and not isinstance(scratch_disks, list):
            raise TypeError("Expected argument 'scratch_disks' to be a list")
        pulumi.set(__self__, "scratch_disks", scratch_disks)
        if self_link and not isinstance(self_link, str):
            raise TypeError("Expected argument 'self_link' to be a str")
        pulumi.set(__self__, "self_link", self_link)
        if service_accounts and not isinstance(service_accounts, list):
            raise TypeError("Expected argument 'service_accounts' to be a list")
        pulumi.set(__self__, "service_accounts", service_accounts)
        if shielded_instance_configs and not isinstance(shielded_instance_configs, list):
            raise TypeError("Expected argument 'shielded_instance_configs' to be a list")
        pulumi.set(__self__, "shielded_instance_configs", shielded_instance_configs)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tags_fingerprint and not isinstance(tags_fingerprint, str):
            raise TypeError("Expected argument 'tags_fingerprint' to be a str")
        pulumi.set(__self__, "tags_fingerprint", tags_fingerprint)
        if zone and not isinstance(zone, str):
            raise TypeError("Expected argument 'zone' to be a str")
        pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter(name="advancedMachineFeatures")
    def advanced_machine_features(self) -> Sequence['outputs.GetInstanceAdvancedMachineFeatureResult']:
        return pulumi.get(self, "advanced_machine_features")

    @_builtins.property
    @pulumi.getter(name="allowStoppingForUpdate")
    def allow_stopping_for_update(self) -> _builtins.bool:
        return pulumi.get(self, "allow_stopping_for_update")

    @_builtins.property
    @pulumi.getter(name="attachedDisks")
    def attached_disks(self) -> Sequence['outputs.GetInstanceAttachedDiskResult']:
        """
        List of disks attached to the instance. Structure is documented below.
        """
        return pulumi.get(self, "attached_disks")

    @_builtins.property
    @pulumi.getter(name="bootDisks")
    def boot_disks(self) -> Sequence['outputs.GetInstanceBootDiskResult']:
        """
        The boot disk for the instance. Structure is documented below.
        """
        return pulumi.get(self, "boot_disks")

    @_builtins.property
    @pulumi.getter(name="canIpForward")
    def can_ip_forward(self) -> _builtins.bool:
        """
        Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
        """
        return pulumi.get(self, "can_ip_forward")

    @_builtins.property
    @pulumi.getter(name="confidentialInstanceConfigs")
    def confidential_instance_configs(self) -> Sequence['outputs.GetInstanceConfidentialInstanceConfigResult']:
        return pulumi.get(self, "confidential_instance_configs")

    @_builtins.property
    @pulumi.getter(name="cpuPlatform")
    def cpu_platform(self) -> _builtins.str:
        """
        The CPU platform used by this instance.
        """
        return pulumi.get(self, "cpu_platform")

    @_builtins.property
    @pulumi.getter(name="creationTimestamp")
    def creation_timestamp(self) -> _builtins.str:
        """
        Creation timestamp in RFC3339 text format.
        """
        return pulumi.get(self, "creation_timestamp")

    @_builtins.property
    @pulumi.getter(name="currentStatus")
    def current_status(self) -> _builtins.str:
        """
        The current status of the instance. This could be one of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see [Instance life cycle](https://cloud.google.com/compute/docs/instances/instance-life-cycle).
        """
        return pulumi.get(self, "current_status")

    @_builtins.property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> _builtins.bool:
        """
        Whether deletion protection is enabled on this instance.
        """
        return pulumi.get(self, "deletion_protection")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        A brief description of the resource.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="desiredStatus")
    def desired_status(self) -> _builtins.str:
        return pulumi.get(self, "desired_status")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter(name="enableDisplay")
    def enable_display(self) -> _builtins.bool:
        """
        Whether the instance has virtual displays enabled.
        """
        return pulumi.get(self, "enable_display")

    @_builtins.property
    @pulumi.getter(name="guestAccelerators")
    def guest_accelerators(self) -> Sequence['outputs.GetInstanceGuestAcceleratorResult']:
        """
        List of the type and count of accelerator cards attached to the instance. Structure is documented below.
        """
        return pulumi.get(self, "guest_accelerators")

    @_builtins.property
    @pulumi.getter
    def hostname(self) -> _builtins.str:
        return pulumi.get(self, "hostname")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="instanceEncryptionKeys")
    def instance_encryption_keys(self) -> Sequence['outputs.GetInstanceInstanceEncryptionKeyResult']:
        return pulumi.get(self, "instance_encryption_keys")

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> _builtins.str:
        """
        The server-assigned unique identifier of this instance.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="keyRevocationActionType")
    def key_revocation_action_type(self) -> _builtins.str:
        """
        Action to be taken when a customer's encryption key is revoked.
        """
        return pulumi.get(self, "key_revocation_action_type")

    @_builtins.property
    @pulumi.getter(name="labelFingerprint")
    def label_fingerprint(self) -> _builtins.str:
        """
        The unique fingerprint of the labels.
        """
        return pulumi.get(self, "label_fingerprint")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        """
        A set of key/value label pairs assigned to the disk.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter(name="machineType")
    def machine_type(self) -> _builtins.str:
        """
        The machine type to create.
        """
        return pulumi.get(self, "machine_type")

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Mapping[str, _builtins.str]:
        """
        Metadata key/value pairs made available within the instance.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter(name="metadataFingerprint")
    def metadata_fingerprint(self) -> _builtins.str:
        """
        The unique fingerprint of the metadata.
        """
        return pulumi.get(self, "metadata_fingerprint")

    @_builtins.property
    @pulumi.getter(name="metadataStartupScript")
    def metadata_startup_script(self) -> _builtins.str:
        return pulumi.get(self, "metadata_startup_script")

    @_builtins.property
    @pulumi.getter(name="minCpuPlatform")
    def min_cpu_platform(self) -> _builtins.str:
        """
        The minimum CPU platform specified for the VM instance. Set to "AUTOMATIC" to remove a previously-set value.
        """
        return pulumi.get(self, "min_cpu_platform")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkInterfaces")
    def network_interfaces(self) -> Sequence['outputs.GetInstanceNetworkInterfaceResult']:
        """
        The networks attached to the instance. Structure is documented below.
        """
        return pulumi.get(self, "network_interfaces")

    @_builtins.property
    @pulumi.getter(name="networkPerformanceConfigs")
    def network_performance_configs(self) -> Sequence['outputs.GetInstanceNetworkPerformanceConfigResult']:
        """
        The network performance configuration setting for the instance, if set. Structure is documented below.
        """
        return pulumi.get(self, "network_performance_configs")

    @_builtins.property
    @pulumi.getter
    def params(self) -> Sequence['outputs.GetInstanceParamResult']:
        return pulumi.get(self, "params")

    @_builtins.property
    @pulumi.getter(name="partnerMetadata")
    def partner_metadata(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "partner_metadata")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter(name="reservationAffinities")
    def reservation_affinities(self) -> Sequence['outputs.GetInstanceReservationAffinityResult']:
        return pulumi.get(self, "reservation_affinities")

    @_builtins.property
    @pulumi.getter(name="resourcePolicies")
    def resource_policies(self) -> Sequence[_builtins.str]:
        """
        A list of self_links to resource policies attached to the selected `boot_disk`
        """
        return pulumi.get(self, "resource_policies")

    @_builtins.property
    @pulumi.getter
    def schedulings(self) -> Sequence['outputs.GetInstanceSchedulingResult']:
        """
        The scheduling strategy being used by the instance. Structure is documented below
        """
        return pulumi.get(self, "schedulings")

    @_builtins.property
    @pulumi.getter(name="scratchDisks")
    def scratch_disks(self) -> Sequence['outputs.GetInstanceScratchDiskResult']:
        """
        The scratch disks attached to the instance. Structure is documented below.
        """
        return pulumi.get(self, "scratch_disks")

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> Optional[_builtins.str]:
        """
        The URI of the created resource.
        """
        return pulumi.get(self, "self_link")

    @_builtins.property
    @pulumi.getter(name="serviceAccounts")
    def service_accounts(self) -> Sequence['outputs.GetInstanceServiceAccountResult']:
        """
        The service account to attach to the instance. Structure is documented below.
        """
        return pulumi.get(self, "service_accounts")

    @_builtins.property
    @pulumi.getter(name="shieldedInstanceConfigs")
    def shielded_instance_configs(self) -> Sequence['outputs.GetInstanceShieldedInstanceConfigResult']:
        """
        The shielded vm config being used by the instance. Structure is documented below.
        """
        return pulumi.get(self, "shielded_instance_configs")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Sequence[_builtins.str]:
        """
        The list of tags attached to the instance.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="tagsFingerprint")
    def tags_fingerprint(self) -> _builtins.str:
        """
        The unique fingerprint of the tags.
        """
        return pulumi.get(self, "tags_fingerprint")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "zone")


class AwaitableGetInstanceResult(GetInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceResult(
            advanced_machine_features=self.advanced_machine_features,
            allow_stopping_for_update=self.allow_stopping_for_update,
            attached_disks=self.attached_disks,
            boot_disks=self.boot_disks,
            can_ip_forward=self.can_ip_forward,
            confidential_instance_configs=self.confidential_instance_configs,
            cpu_platform=self.cpu_platform,
            creation_timestamp=self.creation_timestamp,
            current_status=self.current_status,
            deletion_protection=self.deletion_protection,
            description=self.description,
            desired_status=self.desired_status,
            effective_labels=self.effective_labels,
            enable_display=self.enable_display,
            guest_accelerators=self.guest_accelerators,
            hostname=self.hostname,
            id=self.id,
            instance_encryption_keys=self.instance_encryption_keys,
            instance_id=self.instance_id,
            key_revocation_action_type=self.key_revocation_action_type,
            label_fingerprint=self.label_fingerprint,
            labels=self.labels,
            machine_type=self.machine_type,
            metadata=self.metadata,
            metadata_fingerprint=self.metadata_fingerprint,
            metadata_startup_script=self.metadata_startup_script,
            min_cpu_platform=self.min_cpu_platform,
            name=self.name,
            network_interfaces=self.network_interfaces,
            network_performance_configs=self.network_performance_configs,
            params=self.params,
            partner_metadata=self.partner_metadata,
            project=self.project,
            pulumi_labels=self.pulumi_labels,
            reservation_affinities=self.reservation_affinities,
            resource_policies=self.resource_policies,
            schedulings=self.schedulings,
            scratch_disks=self.scratch_disks,
            self_link=self.self_link,
            service_accounts=self.service_accounts,
            shielded_instance_configs=self.shielded_instance_configs,
            tags=self.tags,
            tags_fingerprint=self.tags_fingerprint,
            zone=self.zone)


def get_instance(name: Optional[_builtins.str] = None,
                 project: Optional[_builtins.str] = None,
                 self_link: Optional[_builtins.str] = None,
                 zone: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceResult:
    """
    Get information about a VM instance resource within GCE. For more information see
    [the official documentation](https://cloud.google.com/compute/docs/instances)
    and
    [API](https://cloud.google.com/compute/docs/reference/latest/instances).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    appserver = gcp.compute.get_instance(name="primary-application-server",
        zone="us-central1-a")
    ```


    :param _builtins.str name: The name of the instance. One of `name` or `self_link` must be provided.
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If `self_link` is provided, this value is ignored.  If neither `self_link`
           nor `project` are provided, the provider project is used.
    :param _builtins.str self_link: The self link of the instance. One of `name` or `self_link` must be provided.
    :param _builtins.str zone: The zone of the instance. If `self_link` is provided, this
           value is ignored.  If neither `self_link` nor `zone` are provided, the
           provider zone is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['selfLink'] = self_link
    __args__['zone'] = zone
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getInstance:getInstance', __args__, opts=opts, typ=GetInstanceResult).value

    return AwaitableGetInstanceResult(
        advanced_machine_features=pulumi.get(__ret__, 'advanced_machine_features'),
        allow_stopping_for_update=pulumi.get(__ret__, 'allow_stopping_for_update'),
        attached_disks=pulumi.get(__ret__, 'attached_disks'),
        boot_disks=pulumi.get(__ret__, 'boot_disks'),
        can_ip_forward=pulumi.get(__ret__, 'can_ip_forward'),
        confidential_instance_configs=pulumi.get(__ret__, 'confidential_instance_configs'),
        cpu_platform=pulumi.get(__ret__, 'cpu_platform'),
        creation_timestamp=pulumi.get(__ret__, 'creation_timestamp'),
        current_status=pulumi.get(__ret__, 'current_status'),
        deletion_protection=pulumi.get(__ret__, 'deletion_protection'),
        description=pulumi.get(__ret__, 'description'),
        desired_status=pulumi.get(__ret__, 'desired_status'),
        effective_labels=pulumi.get(__ret__, 'effective_labels'),
        enable_display=pulumi.get(__ret__, 'enable_display'),
        guest_accelerators=pulumi.get(__ret__, 'guest_accelerators'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        instance_encryption_keys=pulumi.get(__ret__, 'instance_encryption_keys'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        key_revocation_action_type=pulumi.get(__ret__, 'key_revocation_action_type'),
        label_fingerprint=pulumi.get(__ret__, 'label_fingerprint'),
        labels=pulumi.get(__ret__, 'labels'),
        machine_type=pulumi.get(__ret__, 'machine_type'),
        metadata=pulumi.get(__ret__, 'metadata'),
        metadata_fingerprint=pulumi.get(__ret__, 'metadata_fingerprint'),
        metadata_startup_script=pulumi.get(__ret__, 'metadata_startup_script'),
        min_cpu_platform=pulumi.get(__ret__, 'min_cpu_platform'),
        name=pulumi.get(__ret__, 'name'),
        network_interfaces=pulumi.get(__ret__, 'network_interfaces'),
        network_performance_configs=pulumi.get(__ret__, 'network_performance_configs'),
        params=pulumi.get(__ret__, 'params'),
        partner_metadata=pulumi.get(__ret__, 'partner_metadata'),
        project=pulumi.get(__ret__, 'project'),
        pulumi_labels=pulumi.get(__ret__, 'pulumi_labels'),
        reservation_affinities=pulumi.get(__ret__, 'reservation_affinities'),
        resource_policies=pulumi.get(__ret__, 'resource_policies'),
        schedulings=pulumi.get(__ret__, 'schedulings'),
        scratch_disks=pulumi.get(__ret__, 'scratch_disks'),
        self_link=pulumi.get(__ret__, 'self_link'),
        service_accounts=pulumi.get(__ret__, 'service_accounts'),
        shielded_instance_configs=pulumi.get(__ret__, 'shielded_instance_configs'),
        tags=pulumi.get(__ret__, 'tags'),
        tags_fingerprint=pulumi.get(__ret__, 'tags_fingerprint'),
        zone=pulumi.get(__ret__, 'zone'))
def get_instance_output(name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        self_link: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        zone: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInstanceResult]:
    """
    Get information about a VM instance resource within GCE. For more information see
    [the official documentation](https://cloud.google.com/compute/docs/instances)
    and
    [API](https://cloud.google.com/compute/docs/reference/latest/instances).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    appserver = gcp.compute.get_instance(name="primary-application-server",
        zone="us-central1-a")
    ```


    :param _builtins.str name: The name of the instance. One of `name` or `self_link` must be provided.
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If `self_link` is provided, this value is ignored.  If neither `self_link`
           nor `project` are provided, the provider project is used.
    :param _builtins.str self_link: The self link of the instance. One of `name` or `self_link` must be provided.
    :param _builtins.str zone: The zone of the instance. If `self_link` is provided, this
           value is ignored.  If neither `self_link` nor `zone` are provided, the
           provider zone is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['selfLink'] = self_link
    __args__['zone'] = zone
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:compute/getInstance:getInstance', __args__, opts=opts, typ=GetInstanceResult)
    return __ret__.apply(lambda __response__: GetInstanceResult(
        advanced_machine_features=pulumi.get(__response__, 'advanced_machine_features'),
        allow_stopping_for_update=pulumi.get(__response__, 'allow_stopping_for_update'),
        attached_disks=pulumi.get(__response__, 'attached_disks'),
        boot_disks=pulumi.get(__response__, 'boot_disks'),
        can_ip_forward=pulumi.get(__response__, 'can_ip_forward'),
        confidential_instance_configs=pulumi.get(__response__, 'confidential_instance_configs'),
        cpu_platform=pulumi.get(__response__, 'cpu_platform'),
        creation_timestamp=pulumi.get(__response__, 'creation_timestamp'),
        current_status=pulumi.get(__response__, 'current_status'),
        deletion_protection=pulumi.get(__response__, 'deletion_protection'),
        description=pulumi.get(__response__, 'description'),
        desired_status=pulumi.get(__response__, 'desired_status'),
        effective_labels=pulumi.get(__response__, 'effective_labels'),
        enable_display=pulumi.get(__response__, 'enable_display'),
        guest_accelerators=pulumi.get(__response__, 'guest_accelerators'),
        hostname=pulumi.get(__response__, 'hostname'),
        id=pulumi.get(__response__, 'id'),
        instance_encryption_keys=pulumi.get(__response__, 'instance_encryption_keys'),
        instance_id=pulumi.get(__response__, 'instance_id'),
        key_revocation_action_type=pulumi.get(__response__, 'key_revocation_action_type'),
        label_fingerprint=pulumi.get(__response__, 'label_fingerprint'),
        labels=pulumi.get(__response__, 'labels'),
        machine_type=pulumi.get(__response__, 'machine_type'),
        metadata=pulumi.get(__response__, 'metadata'),
        metadata_fingerprint=pulumi.get(__response__, 'metadata_fingerprint'),
        metadata_startup_script=pulumi.get(__response__, 'metadata_startup_script'),
        min_cpu_platform=pulumi.get(__response__, 'min_cpu_platform'),
        name=pulumi.get(__response__, 'name'),
        network_interfaces=pulumi.get(__response__, 'network_interfaces'),
        network_performance_configs=pulumi.get(__response__, 'network_performance_configs'),
        params=pulumi.get(__response__, 'params'),
        partner_metadata=pulumi.get(__response__, 'partner_metadata'),
        project=pulumi.get(__response__, 'project'),
        pulumi_labels=pulumi.get(__response__, 'pulumi_labels'),
        reservation_affinities=pulumi.get(__response__, 'reservation_affinities'),
        resource_policies=pulumi.get(__response__, 'resource_policies'),
        schedulings=pulumi.get(__response__, 'schedulings'),
        scratch_disks=pulumi.get(__response__, 'scratch_disks'),
        self_link=pulumi.get(__response__, 'self_link'),
        service_accounts=pulumi.get(__response__, 'service_accounts'),
        shielded_instance_configs=pulumi.get(__response__, 'shielded_instance_configs'),
        tags=pulumi.get(__response__, 'tags'),
        tags_fingerprint=pulumi.get(__response__, 'tags_fingerprint'),
        zone=pulumi.get(__response__, 'zone')))
