# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'DeliveryPipelineCondition',
    'DeliveryPipelineConditionPipelineReadyCondition',
    'DeliveryPipelineConditionTargetsPresentCondition',
    'DeliveryPipelineSerialPipeline',
    'DeliveryPipelineSerialPipelineStage',
    'TargetAnthosCluster',
    'TargetExecutionConfig',
    'TargetGke',
]

@pulumi.output_type
class DeliveryPipelineCondition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "pipelineReadyConditions":
            suggest = "pipeline_ready_conditions"
        elif key == "targetsPresentConditions":
            suggest = "targets_present_conditions"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeliveryPipelineCondition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeliveryPipelineCondition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeliveryPipelineCondition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 pipeline_ready_conditions: Optional[Sequence['outputs.DeliveryPipelineConditionPipelineReadyCondition']] = None,
                 targets_present_conditions: Optional[Sequence['outputs.DeliveryPipelineConditionTargetsPresentCondition']] = None):
        if pipeline_ready_conditions is not None:
            pulumi.set(__self__, "pipeline_ready_conditions", pipeline_ready_conditions)
        if targets_present_conditions is not None:
            pulumi.set(__self__, "targets_present_conditions", targets_present_conditions)

    @property
    @pulumi.getter(name="pipelineReadyConditions")
    def pipeline_ready_conditions(self) -> Optional[Sequence['outputs.DeliveryPipelineConditionPipelineReadyCondition']]:
        return pulumi.get(self, "pipeline_ready_conditions")

    @property
    @pulumi.getter(name="targetsPresentConditions")
    def targets_present_conditions(self) -> Optional[Sequence['outputs.DeliveryPipelineConditionTargetsPresentCondition']]:
        return pulumi.get(self, "targets_present_conditions")


@pulumi.output_type
class DeliveryPipelineConditionPipelineReadyCondition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "updateTime":
            suggest = "update_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeliveryPipelineConditionPipelineReadyCondition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeliveryPipelineConditionPipelineReadyCondition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeliveryPipelineConditionPipelineReadyCondition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 status: Optional[bool] = None,
                 update_time: Optional[str] = None):
        if status is not None:
            pulumi.set(__self__, "status", status)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def status(self) -> Optional[bool]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[str]:
        return pulumi.get(self, "update_time")


@pulumi.output_type
class DeliveryPipelineConditionTargetsPresentCondition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "missingTargets":
            suggest = "missing_targets"
        elif key == "updateTime":
            suggest = "update_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeliveryPipelineConditionTargetsPresentCondition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeliveryPipelineConditionTargetsPresentCondition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeliveryPipelineConditionTargetsPresentCondition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 missing_targets: Optional[Sequence[str]] = None,
                 status: Optional[bool] = None,
                 update_time: Optional[str] = None):
        if missing_targets is not None:
            pulumi.set(__self__, "missing_targets", missing_targets)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="missingTargets")
    def missing_targets(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "missing_targets")

    @property
    @pulumi.getter
    def status(self) -> Optional[bool]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[str]:
        return pulumi.get(self, "update_time")


@pulumi.output_type
class DeliveryPipelineSerialPipeline(dict):
    def __init__(__self__, *,
                 stages: Optional[Sequence['outputs.DeliveryPipelineSerialPipelineStage']] = None):
        """
        :param Sequence['DeliveryPipelineSerialPipelineStageArgs'] stages: Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
        """
        if stages is not None:
            pulumi.set(__self__, "stages", stages)

    @property
    @pulumi.getter
    def stages(self) -> Optional[Sequence['outputs.DeliveryPipelineSerialPipelineStage']]:
        """
        Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
        """
        return pulumi.get(self, "stages")


@pulumi.output_type
class DeliveryPipelineSerialPipelineStage(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "targetId":
            suggest = "target_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DeliveryPipelineSerialPipelineStage. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DeliveryPipelineSerialPipelineStage.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DeliveryPipelineSerialPipelineStage.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 profiles: Optional[Sequence[str]] = None,
                 target_id: Optional[str] = None):
        """
        :param Sequence[str] profiles: Skaffold profiles to use when rendering the manifest for this stage's `Target`.
        :param str target_id: The target_id to which this stage points. This field refers exclusively to the last segment of a target name. For example, this field would just be `my-target` (rather than `projects/project/locations/location/targets/my-target`). The location of the `Target` is inferred to be the same as the location of the `DeliveryPipeline` that contains this `Stage`.
        """
        if profiles is not None:
            pulumi.set(__self__, "profiles", profiles)
        if target_id is not None:
            pulumi.set(__self__, "target_id", target_id)

    @property
    @pulumi.getter
    def profiles(self) -> Optional[Sequence[str]]:
        """
        Skaffold profiles to use when rendering the manifest for this stage's `Target`.
        """
        return pulumi.get(self, "profiles")

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> Optional[str]:
        """
        The target_id to which this stage points. This field refers exclusively to the last segment of a target name. For example, this field would just be `my-target` (rather than `projects/project/locations/location/targets/my-target`). The location of the `Target` is inferred to be the same as the location of the `DeliveryPipeline` that contains this `Stage`.
        """
        return pulumi.get(self, "target_id")


@pulumi.output_type
class TargetAnthosCluster(dict):
    def __init__(__self__, *,
                 membership: Optional[str] = None):
        """
        :param str membership: Membership of the GKE Hub-registered cluster to which to apply the Skaffold configuration. Format is `projects/{project}/locations/{location}/memberships/{membership_name}`.
        """
        if membership is not None:
            pulumi.set(__self__, "membership", membership)

    @property
    @pulumi.getter
    def membership(self) -> Optional[str]:
        """
        Membership of the GKE Hub-registered cluster to which to apply the Skaffold configuration. Format is `projects/{project}/locations/{location}/memberships/{membership_name}`.
        """
        return pulumi.get(self, "membership")


@pulumi.output_type
class TargetExecutionConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "artifactStorage":
            suggest = "artifact_storage"
        elif key == "serviceAccount":
            suggest = "service_account"
        elif key == "workerPool":
            suggest = "worker_pool"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TargetExecutionConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TargetExecutionConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TargetExecutionConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 usages: Sequence[str],
                 artifact_storage: Optional[str] = None,
                 service_account: Optional[str] = None,
                 worker_pool: Optional[str] = None):
        """
        :param Sequence[str] usages: Required. Usages when this configuration should be applied.
        :param str artifact_storage: Optional. Cloud Storage location in which to store execution outputs. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
        :param str service_account: Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) is used.
        :param str worker_pool: Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
        """
        pulumi.set(__self__, "usages", usages)
        if artifact_storage is not None:
            pulumi.set(__self__, "artifact_storage", artifact_storage)
        if service_account is not None:
            pulumi.set(__self__, "service_account", service_account)
        if worker_pool is not None:
            pulumi.set(__self__, "worker_pool", worker_pool)

    @property
    @pulumi.getter
    def usages(self) -> Sequence[str]:
        """
        Required. Usages when this configuration should be applied.
        """
        return pulumi.get(self, "usages")

    @property
    @pulumi.getter(name="artifactStorage")
    def artifact_storage(self) -> Optional[str]:
        """
        Optional. Cloud Storage location in which to store execution outputs. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
        """
        return pulumi.get(self, "artifact_storage")

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> Optional[str]:
        """
        Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) is used.
        """
        return pulumi.get(self, "service_account")

    @property
    @pulumi.getter(name="workerPool")
    def worker_pool(self) -> Optional[str]:
        """
        Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
        """
        return pulumi.get(self, "worker_pool")


@pulumi.output_type
class TargetGke(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "internalIp":
            suggest = "internal_ip"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TargetGke. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TargetGke.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TargetGke.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cluster: Optional[str] = None,
                 internal_ip: Optional[bool] = None):
        """
        :param str cluster: Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
        :param bool internal_ip: Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
        """
        if cluster is not None:
            pulumi.set(__self__, "cluster", cluster)
        if internal_ip is not None:
            pulumi.set(__self__, "internal_ip", internal_ip)

    @property
    @pulumi.getter
    def cluster(self) -> Optional[str]:
        """
        Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
        """
        return pulumi.get(self, "cluster")

    @property
    @pulumi.getter(name="internalIp")
    def internal_ip(self) -> Optional[bool]:
        """
        Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
        """
        return pulumi.get(self, "internal_ip")

