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
    'GetBucketResult',
    'AwaitableGetBucketResult',
    'get_bucket',
    'get_bucket_output',
]

@pulumi.output_type
class GetBucketResult:
    """
    A collection of values returned by getBucket.
    """
    def __init__(__self__, autoclasses=None, cors=None, custom_placement_configs=None, default_event_based_hold=None, effective_labels=None, enable_object_retention=None, encryptions=None, force_destroy=None, hierarchical_namespaces=None, id=None, ip_filters=None, labels=None, lifecycle_rules=None, location=None, loggings=None, name=None, project=None, project_number=None, public_access_prevention=None, pulumi_labels=None, requester_pays=None, retention_policies=None, rpo=None, self_link=None, soft_delete_policies=None, storage_class=None, time_created=None, uniform_bucket_level_access=None, updated=None, url=None, versionings=None, websites=None):
        if autoclasses and not isinstance(autoclasses, list):
            raise TypeError("Expected argument 'autoclasses' to be a list")
        pulumi.set(__self__, "autoclasses", autoclasses)
        if cors and not isinstance(cors, list):
            raise TypeError("Expected argument 'cors' to be a list")
        pulumi.set(__self__, "cors", cors)
        if custom_placement_configs and not isinstance(custom_placement_configs, list):
            raise TypeError("Expected argument 'custom_placement_configs' to be a list")
        pulumi.set(__self__, "custom_placement_configs", custom_placement_configs)
        if default_event_based_hold and not isinstance(default_event_based_hold, bool):
            raise TypeError("Expected argument 'default_event_based_hold' to be a bool")
        pulumi.set(__self__, "default_event_based_hold", default_event_based_hold)
        if effective_labels and not isinstance(effective_labels, dict):
            raise TypeError("Expected argument 'effective_labels' to be a dict")
        pulumi.set(__self__, "effective_labels", effective_labels)
        if enable_object_retention and not isinstance(enable_object_retention, bool):
            raise TypeError("Expected argument 'enable_object_retention' to be a bool")
        pulumi.set(__self__, "enable_object_retention", enable_object_retention)
        if encryptions and not isinstance(encryptions, list):
            raise TypeError("Expected argument 'encryptions' to be a list")
        pulumi.set(__self__, "encryptions", encryptions)
        if force_destroy and not isinstance(force_destroy, bool):
            raise TypeError("Expected argument 'force_destroy' to be a bool")
        pulumi.set(__self__, "force_destroy", force_destroy)
        if hierarchical_namespaces and not isinstance(hierarchical_namespaces, list):
            raise TypeError("Expected argument 'hierarchical_namespaces' to be a list")
        pulumi.set(__self__, "hierarchical_namespaces", hierarchical_namespaces)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_filters and not isinstance(ip_filters, list):
            raise TypeError("Expected argument 'ip_filters' to be a list")
        pulumi.set(__self__, "ip_filters", ip_filters)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if lifecycle_rules and not isinstance(lifecycle_rules, list):
            raise TypeError("Expected argument 'lifecycle_rules' to be a list")
        pulumi.set(__self__, "lifecycle_rules", lifecycle_rules)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if loggings and not isinstance(loggings, list):
            raise TypeError("Expected argument 'loggings' to be a list")
        pulumi.set(__self__, "loggings", loggings)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if project_number and not isinstance(project_number, int):
            raise TypeError("Expected argument 'project_number' to be a int")
        pulumi.set(__self__, "project_number", project_number)
        if public_access_prevention and not isinstance(public_access_prevention, str):
            raise TypeError("Expected argument 'public_access_prevention' to be a str")
        pulumi.set(__self__, "public_access_prevention", public_access_prevention)
        if pulumi_labels and not isinstance(pulumi_labels, dict):
            raise TypeError("Expected argument 'pulumi_labels' to be a dict")
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if requester_pays and not isinstance(requester_pays, bool):
            raise TypeError("Expected argument 'requester_pays' to be a bool")
        pulumi.set(__self__, "requester_pays", requester_pays)
        if retention_policies and not isinstance(retention_policies, list):
            raise TypeError("Expected argument 'retention_policies' to be a list")
        pulumi.set(__self__, "retention_policies", retention_policies)
        if rpo and not isinstance(rpo, str):
            raise TypeError("Expected argument 'rpo' to be a str")
        pulumi.set(__self__, "rpo", rpo)
        if self_link and not isinstance(self_link, str):
            raise TypeError("Expected argument 'self_link' to be a str")
        pulumi.set(__self__, "self_link", self_link)
        if soft_delete_policies and not isinstance(soft_delete_policies, list):
            raise TypeError("Expected argument 'soft_delete_policies' to be a list")
        pulumi.set(__self__, "soft_delete_policies", soft_delete_policies)
        if storage_class and not isinstance(storage_class, str):
            raise TypeError("Expected argument 'storage_class' to be a str")
        pulumi.set(__self__, "storage_class", storage_class)
        if time_created and not isinstance(time_created, str):
            raise TypeError("Expected argument 'time_created' to be a str")
        pulumi.set(__self__, "time_created", time_created)
        if uniform_bucket_level_access and not isinstance(uniform_bucket_level_access, bool):
            raise TypeError("Expected argument 'uniform_bucket_level_access' to be a bool")
        pulumi.set(__self__, "uniform_bucket_level_access", uniform_bucket_level_access)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if versionings and not isinstance(versionings, list):
            raise TypeError("Expected argument 'versionings' to be a list")
        pulumi.set(__self__, "versionings", versionings)
        if websites and not isinstance(websites, list):
            raise TypeError("Expected argument 'websites' to be a list")
        pulumi.set(__self__, "websites", websites)

    @_builtins.property
    @pulumi.getter
    def autoclasses(self) -> Sequence['outputs.GetBucketAutoclassResult']:
        return pulumi.get(self, "autoclasses")

    @_builtins.property
    @pulumi.getter
    def cors(self) -> Sequence['outputs.GetBucketCorResult']:
        return pulumi.get(self, "cors")

    @_builtins.property
    @pulumi.getter(name="customPlacementConfigs")
    def custom_placement_configs(self) -> Sequence['outputs.GetBucketCustomPlacementConfigResult']:
        return pulumi.get(self, "custom_placement_configs")

    @_builtins.property
    @pulumi.getter(name="defaultEventBasedHold")
    def default_event_based_hold(self) -> _builtins.bool:
        return pulumi.get(self, "default_event_based_hold")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter(name="enableObjectRetention")
    def enable_object_retention(self) -> _builtins.bool:
        return pulumi.get(self, "enable_object_retention")

    @_builtins.property
    @pulumi.getter
    def encryptions(self) -> Sequence['outputs.GetBucketEncryptionResult']:
        return pulumi.get(self, "encryptions")

    @_builtins.property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> _builtins.bool:
        return pulumi.get(self, "force_destroy")

    @_builtins.property
    @pulumi.getter(name="hierarchicalNamespaces")
    def hierarchical_namespaces(self) -> Sequence['outputs.GetBucketHierarchicalNamespaceResult']:
        return pulumi.get(self, "hierarchical_namespaces")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="ipFilters")
    def ip_filters(self) -> Sequence['outputs.GetBucketIpFilterResult']:
        return pulumi.get(self, "ip_filters")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> Sequence['outputs.GetBucketLifecycleRuleResult']:
        return pulumi.get(self, "lifecycle_rules")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def loggings(self) -> Sequence['outputs.GetBucketLoggingResult']:
        return pulumi.get(self, "loggings")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="projectNumber")
    def project_number(self) -> _builtins.int:
        return pulumi.get(self, "project_number")

    @_builtins.property
    @pulumi.getter(name="publicAccessPrevention")
    def public_access_prevention(self) -> _builtins.str:
        return pulumi.get(self, "public_access_prevention")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter(name="requesterPays")
    def requester_pays(self) -> _builtins.bool:
        return pulumi.get(self, "requester_pays")

    @_builtins.property
    @pulumi.getter(name="retentionPolicies")
    def retention_policies(self) -> Sequence['outputs.GetBucketRetentionPolicyResult']:
        return pulumi.get(self, "retention_policies")

    @_builtins.property
    @pulumi.getter
    def rpo(self) -> _builtins.str:
        return pulumi.get(self, "rpo")

    @_builtins.property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> _builtins.str:
        return pulumi.get(self, "self_link")

    @_builtins.property
    @pulumi.getter(name="softDeletePolicies")
    def soft_delete_policies(self) -> Sequence['outputs.GetBucketSoftDeletePolicyResult']:
        return pulumi.get(self, "soft_delete_policies")

    @_builtins.property
    @pulumi.getter(name="storageClass")
    def storage_class(self) -> _builtins.str:
        return pulumi.get(self, "storage_class")

    @_builtins.property
    @pulumi.getter(name="timeCreated")
    def time_created(self) -> _builtins.str:
        return pulumi.get(self, "time_created")

    @_builtins.property
    @pulumi.getter(name="uniformBucketLevelAccess")
    def uniform_bucket_level_access(self) -> _builtins.bool:
        return pulumi.get(self, "uniform_bucket_level_access")

    @_builtins.property
    @pulumi.getter
    def updated(self) -> _builtins.str:
        return pulumi.get(self, "updated")

    @_builtins.property
    @pulumi.getter
    def url(self) -> _builtins.str:
        return pulumi.get(self, "url")

    @_builtins.property
    @pulumi.getter
    def versionings(self) -> Sequence['outputs.GetBucketVersioningResult']:
        return pulumi.get(self, "versionings")

    @_builtins.property
    @pulumi.getter
    def websites(self) -> Sequence['outputs.GetBucketWebsiteResult']:
        return pulumi.get(self, "websites")


class AwaitableGetBucketResult(GetBucketResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBucketResult(
            autoclasses=self.autoclasses,
            cors=self.cors,
            custom_placement_configs=self.custom_placement_configs,
            default_event_based_hold=self.default_event_based_hold,
            effective_labels=self.effective_labels,
            enable_object_retention=self.enable_object_retention,
            encryptions=self.encryptions,
            force_destroy=self.force_destroy,
            hierarchical_namespaces=self.hierarchical_namespaces,
            id=self.id,
            ip_filters=self.ip_filters,
            labels=self.labels,
            lifecycle_rules=self.lifecycle_rules,
            location=self.location,
            loggings=self.loggings,
            name=self.name,
            project=self.project,
            project_number=self.project_number,
            public_access_prevention=self.public_access_prevention,
            pulumi_labels=self.pulumi_labels,
            requester_pays=self.requester_pays,
            retention_policies=self.retention_policies,
            rpo=self.rpo,
            self_link=self.self_link,
            soft_delete_policies=self.soft_delete_policies,
            storage_class=self.storage_class,
            time_created=self.time_created,
            uniform_bucket_level_access=self.uniform_bucket_level_access,
            updated=self.updated,
            url=self.url,
            versionings=self.versionings,
            websites=self.websites)


def get_bucket(name: Optional[_builtins.str] = None,
               project: Optional[_builtins.str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBucketResult:
    """
    Gets an existing bucket in Google Cloud Storage service (GCS).
    See [the official documentation](https://cloud.google.com/storage/docs/key-terms#buckets)
    and
    [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_bucket = gcp.storage.get_bucket(name="my-bucket")
    ```


    :param _builtins.str name: The name of the bucket.
    :param _builtins.str project: The ID of the project in which the resource belongs. If it is not provided then the data source will use the Compute API to find the project id that corresponds to the project number returned from the Storage API, and if no Compute API permissions are available or if the Compute API is disabled it defaults to the provider value. Supplying a value for `project` doesn't influence retrieving data about the bucket but it can be used to prevent use of the Compute API. If you do provide a `project` value ensure that it is the correct value for that bucket; the data source will not check that the project id and project number match.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:storage/getBucket:getBucket', __args__, opts=opts, typ=GetBucketResult).value

    return AwaitableGetBucketResult(
        autoclasses=pulumi.get(__ret__, 'autoclasses'),
        cors=pulumi.get(__ret__, 'cors'),
        custom_placement_configs=pulumi.get(__ret__, 'custom_placement_configs'),
        default_event_based_hold=pulumi.get(__ret__, 'default_event_based_hold'),
        effective_labels=pulumi.get(__ret__, 'effective_labels'),
        enable_object_retention=pulumi.get(__ret__, 'enable_object_retention'),
        encryptions=pulumi.get(__ret__, 'encryptions'),
        force_destroy=pulumi.get(__ret__, 'force_destroy'),
        hierarchical_namespaces=pulumi.get(__ret__, 'hierarchical_namespaces'),
        id=pulumi.get(__ret__, 'id'),
        ip_filters=pulumi.get(__ret__, 'ip_filters'),
        labels=pulumi.get(__ret__, 'labels'),
        lifecycle_rules=pulumi.get(__ret__, 'lifecycle_rules'),
        location=pulumi.get(__ret__, 'location'),
        loggings=pulumi.get(__ret__, 'loggings'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        project_number=pulumi.get(__ret__, 'project_number'),
        public_access_prevention=pulumi.get(__ret__, 'public_access_prevention'),
        pulumi_labels=pulumi.get(__ret__, 'pulumi_labels'),
        requester_pays=pulumi.get(__ret__, 'requester_pays'),
        retention_policies=pulumi.get(__ret__, 'retention_policies'),
        rpo=pulumi.get(__ret__, 'rpo'),
        self_link=pulumi.get(__ret__, 'self_link'),
        soft_delete_policies=pulumi.get(__ret__, 'soft_delete_policies'),
        storage_class=pulumi.get(__ret__, 'storage_class'),
        time_created=pulumi.get(__ret__, 'time_created'),
        uniform_bucket_level_access=pulumi.get(__ret__, 'uniform_bucket_level_access'),
        updated=pulumi.get(__ret__, 'updated'),
        url=pulumi.get(__ret__, 'url'),
        versionings=pulumi.get(__ret__, 'versionings'),
        websites=pulumi.get(__ret__, 'websites'))
def get_bucket_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                      project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBucketResult]:
    """
    Gets an existing bucket in Google Cloud Storage service (GCS).
    See [the official documentation](https://cloud.google.com/storage/docs/key-terms#buckets)
    and
    [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_bucket = gcp.storage.get_bucket(name="my-bucket")
    ```


    :param _builtins.str name: The name of the bucket.
    :param _builtins.str project: The ID of the project in which the resource belongs. If it is not provided then the data source will use the Compute API to find the project id that corresponds to the project number returned from the Storage API, and if no Compute API permissions are available or if the Compute API is disabled it defaults to the provider value. Supplying a value for `project` doesn't influence retrieving data about the bucket but it can be used to prevent use of the Compute API. If you do provide a `project` value ensure that it is the correct value for that bucket; the data source will not check that the project id and project number match.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:storage/getBucket:getBucket', __args__, opts=opts, typ=GetBucketResult)
    return __ret__.apply(lambda __response__: GetBucketResult(
        autoclasses=pulumi.get(__response__, 'autoclasses'),
        cors=pulumi.get(__response__, 'cors'),
        custom_placement_configs=pulumi.get(__response__, 'custom_placement_configs'),
        default_event_based_hold=pulumi.get(__response__, 'default_event_based_hold'),
        effective_labels=pulumi.get(__response__, 'effective_labels'),
        enable_object_retention=pulumi.get(__response__, 'enable_object_retention'),
        encryptions=pulumi.get(__response__, 'encryptions'),
        force_destroy=pulumi.get(__response__, 'force_destroy'),
        hierarchical_namespaces=pulumi.get(__response__, 'hierarchical_namespaces'),
        id=pulumi.get(__response__, 'id'),
        ip_filters=pulumi.get(__response__, 'ip_filters'),
        labels=pulumi.get(__response__, 'labels'),
        lifecycle_rules=pulumi.get(__response__, 'lifecycle_rules'),
        location=pulumi.get(__response__, 'location'),
        loggings=pulumi.get(__response__, 'loggings'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        project_number=pulumi.get(__response__, 'project_number'),
        public_access_prevention=pulumi.get(__response__, 'public_access_prevention'),
        pulumi_labels=pulumi.get(__response__, 'pulumi_labels'),
        requester_pays=pulumi.get(__response__, 'requester_pays'),
        retention_policies=pulumi.get(__response__, 'retention_policies'),
        rpo=pulumi.get(__response__, 'rpo'),
        self_link=pulumi.get(__response__, 'self_link'),
        soft_delete_policies=pulumi.get(__response__, 'soft_delete_policies'),
        storage_class=pulumi.get(__response__, 'storage_class'),
        time_created=pulumi.get(__response__, 'time_created'),
        uniform_bucket_level_access=pulumi.get(__response__, 'uniform_bucket_level_access'),
        updated=pulumi.get(__response__, 'updated'),
        url=pulumi.get(__response__, 'url'),
        versionings=pulumi.get(__response__, 'versionings'),
        websites=pulumi.get(__response__, 'websites')))
