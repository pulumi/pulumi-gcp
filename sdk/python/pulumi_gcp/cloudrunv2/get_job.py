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

__all__ = [
    'GetJobResult',
    'AwaitableGetJobResult',
    'get_job',
    'get_job_output',
]

@pulumi.output_type
class GetJobResult:
    """
    A collection of values returned by getJob.
    """
    def __init__(__self__, annotations=None, binary_authorizations=None, client=None, client_version=None, conditions=None, create_time=None, creator=None, delete_time=None, effective_annotations=None, effective_labels=None, etag=None, execution_count=None, expire_time=None, generation=None, id=None, labels=None, last_modifier=None, latest_created_executions=None, launch_stage=None, location=None, name=None, observed_generation=None, project=None, pulumi_labels=None, reconciling=None, templates=None, terminal_conditions=None, uid=None, update_time=None):
        if annotations and not isinstance(annotations, dict):
            raise TypeError("Expected argument 'annotations' to be a dict")
        pulumi.set(__self__, "annotations", annotations)
        if binary_authorizations and not isinstance(binary_authorizations, list):
            raise TypeError("Expected argument 'binary_authorizations' to be a list")
        pulumi.set(__self__, "binary_authorizations", binary_authorizations)
        if client and not isinstance(client, str):
            raise TypeError("Expected argument 'client' to be a str")
        pulumi.set(__self__, "client", client)
        if client_version and not isinstance(client_version, str):
            raise TypeError("Expected argument 'client_version' to be a str")
        pulumi.set(__self__, "client_version", client_version)
        if conditions and not isinstance(conditions, list):
            raise TypeError("Expected argument 'conditions' to be a list")
        pulumi.set(__self__, "conditions", conditions)
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if creator and not isinstance(creator, str):
            raise TypeError("Expected argument 'creator' to be a str")
        pulumi.set(__self__, "creator", creator)
        if delete_time and not isinstance(delete_time, str):
            raise TypeError("Expected argument 'delete_time' to be a str")
        pulumi.set(__self__, "delete_time", delete_time)
        if effective_annotations and not isinstance(effective_annotations, dict):
            raise TypeError("Expected argument 'effective_annotations' to be a dict")
        pulumi.set(__self__, "effective_annotations", effective_annotations)
        if effective_labels and not isinstance(effective_labels, dict):
            raise TypeError("Expected argument 'effective_labels' to be a dict")
        pulumi.set(__self__, "effective_labels", effective_labels)
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if execution_count and not isinstance(execution_count, int):
            raise TypeError("Expected argument 'execution_count' to be a int")
        pulumi.set(__self__, "execution_count", execution_count)
        if expire_time and not isinstance(expire_time, str):
            raise TypeError("Expected argument 'expire_time' to be a str")
        pulumi.set(__self__, "expire_time", expire_time)
        if generation and not isinstance(generation, str):
            raise TypeError("Expected argument 'generation' to be a str")
        pulumi.set(__self__, "generation", generation)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if last_modifier and not isinstance(last_modifier, str):
            raise TypeError("Expected argument 'last_modifier' to be a str")
        pulumi.set(__self__, "last_modifier", last_modifier)
        if latest_created_executions and not isinstance(latest_created_executions, list):
            raise TypeError("Expected argument 'latest_created_executions' to be a list")
        pulumi.set(__self__, "latest_created_executions", latest_created_executions)
        if launch_stage and not isinstance(launch_stage, str):
            raise TypeError("Expected argument 'launch_stage' to be a str")
        pulumi.set(__self__, "launch_stage", launch_stage)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if observed_generation and not isinstance(observed_generation, str):
            raise TypeError("Expected argument 'observed_generation' to be a str")
        pulumi.set(__self__, "observed_generation", observed_generation)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if pulumi_labels and not isinstance(pulumi_labels, dict):
            raise TypeError("Expected argument 'pulumi_labels' to be a dict")
        pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if reconciling and not isinstance(reconciling, bool):
            raise TypeError("Expected argument 'reconciling' to be a bool")
        pulumi.set(__self__, "reconciling", reconciling)
        if templates and not isinstance(templates, list):
            raise TypeError("Expected argument 'templates' to be a list")
        pulumi.set(__self__, "templates", templates)
        if terminal_conditions and not isinstance(terminal_conditions, list):
            raise TypeError("Expected argument 'terminal_conditions' to be a list")
        pulumi.set(__self__, "terminal_conditions", terminal_conditions)
        if uid and not isinstance(uid, str):
            raise TypeError("Expected argument 'uid' to be a str")
        pulumi.set(__self__, "uid", uid)
        if update_time and not isinstance(update_time, str):
            raise TypeError("Expected argument 'update_time' to be a str")
        pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def annotations(self) -> Mapping[str, str]:
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="binaryAuthorizations")
    def binary_authorizations(self) -> Sequence['outputs.GetJobBinaryAuthorizationResult']:
        return pulumi.get(self, "binary_authorizations")

    @property
    @pulumi.getter
    def client(self) -> str:
        return pulumi.get(self, "client")

    @property
    @pulumi.getter(name="clientVersion")
    def client_version(self) -> str:
        return pulumi.get(self, "client_version")

    @property
    @pulumi.getter
    def conditions(self) -> Sequence['outputs.GetJobConditionResult']:
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def creator(self) -> str:
        return pulumi.get(self, "creator")

    @property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> str:
        return pulumi.get(self, "delete_time")

    @property
    @pulumi.getter(name="effectiveAnnotations")
    def effective_annotations(self) -> Mapping[str, str]:
        return pulumi.get(self, "effective_annotations")

    @property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Mapping[str, str]:
        return pulumi.get(self, "effective_labels")

    @property
    @pulumi.getter
    def etag(self) -> str:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter(name="executionCount")
    def execution_count(self) -> int:
        return pulumi.get(self, "execution_count")

    @property
    @pulumi.getter(name="expireTime")
    def expire_time(self) -> str:
        return pulumi.get(self, "expire_time")

    @property
    @pulumi.getter
    def generation(self) -> str:
        return pulumi.get(self, "generation")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, str]:
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="lastModifier")
    def last_modifier(self) -> str:
        return pulumi.get(self, "last_modifier")

    @property
    @pulumi.getter(name="latestCreatedExecutions")
    def latest_created_executions(self) -> Sequence['outputs.GetJobLatestCreatedExecutionResult']:
        return pulumi.get(self, "latest_created_executions")

    @property
    @pulumi.getter(name="launchStage")
    def launch_stage(self) -> str:
        return pulumi.get(self, "launch_stage")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="observedGeneration")
    def observed_generation(self) -> str:
        return pulumi.get(self, "observed_generation")

    @property
    @pulumi.getter
    def project(self) -> Optional[str]:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Mapping[str, str]:
        return pulumi.get(self, "pulumi_labels")

    @property
    @pulumi.getter
    def reconciling(self) -> bool:
        return pulumi.get(self, "reconciling")

    @property
    @pulumi.getter
    def templates(self) -> Sequence['outputs.GetJobTemplateResult']:
        return pulumi.get(self, "templates")

    @property
    @pulumi.getter(name="terminalConditions")
    def terminal_conditions(self) -> Sequence['outputs.GetJobTerminalConditionResult']:
        return pulumi.get(self, "terminal_conditions")

    @property
    @pulumi.getter
    def uid(self) -> str:
        return pulumi.get(self, "uid")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> str:
        return pulumi.get(self, "update_time")


class AwaitableGetJobResult(GetJobResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetJobResult(
            annotations=self.annotations,
            binary_authorizations=self.binary_authorizations,
            client=self.client,
            client_version=self.client_version,
            conditions=self.conditions,
            create_time=self.create_time,
            creator=self.creator,
            delete_time=self.delete_time,
            effective_annotations=self.effective_annotations,
            effective_labels=self.effective_labels,
            etag=self.etag,
            execution_count=self.execution_count,
            expire_time=self.expire_time,
            generation=self.generation,
            id=self.id,
            labels=self.labels,
            last_modifier=self.last_modifier,
            latest_created_executions=self.latest_created_executions,
            launch_stage=self.launch_stage,
            location=self.location,
            name=self.name,
            observed_generation=self.observed_generation,
            project=self.project,
            pulumi_labels=self.pulumi_labels,
            reconciling=self.reconciling,
            templates=self.templates,
            terminal_conditions=self.terminal_conditions,
            uid=self.uid,
            update_time=self.update_time)


def get_job(location: Optional[str] = None,
            name: Optional[str] = None,
            project: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetJobResult:
    """
    Get information about a Google Cloud Run v2 Job. For more information see
    the [official documentation](https://cloud.google.com/run/docs/)
    and [API](https://cloud.google.com/run/docs/apis).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_job = gcp.cloudrunv2.get_job(location="us-central1",
        name="my-job")
    ```


    :param str location: The location of the instance. eg us-central1
           
           - - -
    :param str name: The name of the Cloud Run v2 Job.
    :param str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['location'] = location
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:cloudrunv2/getJob:getJob', __args__, opts=opts, typ=GetJobResult).value

    return AwaitableGetJobResult(
        annotations=pulumi.get(__ret__, 'annotations'),
        binary_authorizations=pulumi.get(__ret__, 'binary_authorizations'),
        client=pulumi.get(__ret__, 'client'),
        client_version=pulumi.get(__ret__, 'client_version'),
        conditions=pulumi.get(__ret__, 'conditions'),
        create_time=pulumi.get(__ret__, 'create_time'),
        creator=pulumi.get(__ret__, 'creator'),
        delete_time=pulumi.get(__ret__, 'delete_time'),
        effective_annotations=pulumi.get(__ret__, 'effective_annotations'),
        effective_labels=pulumi.get(__ret__, 'effective_labels'),
        etag=pulumi.get(__ret__, 'etag'),
        execution_count=pulumi.get(__ret__, 'execution_count'),
        expire_time=pulumi.get(__ret__, 'expire_time'),
        generation=pulumi.get(__ret__, 'generation'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        last_modifier=pulumi.get(__ret__, 'last_modifier'),
        latest_created_executions=pulumi.get(__ret__, 'latest_created_executions'),
        launch_stage=pulumi.get(__ret__, 'launch_stage'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        observed_generation=pulumi.get(__ret__, 'observed_generation'),
        project=pulumi.get(__ret__, 'project'),
        pulumi_labels=pulumi.get(__ret__, 'pulumi_labels'),
        reconciling=pulumi.get(__ret__, 'reconciling'),
        templates=pulumi.get(__ret__, 'templates'),
        terminal_conditions=pulumi.get(__ret__, 'terminal_conditions'),
        uid=pulumi.get(__ret__, 'uid'),
        update_time=pulumi.get(__ret__, 'update_time'))


@_utilities.lift_output_func(get_job)
def get_job_output(location: Optional[pulumi.Input[Optional[str]]] = None,
                   name: Optional[pulumi.Input[str]] = None,
                   project: Optional[pulumi.Input[Optional[str]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetJobResult]:
    """
    Get information about a Google Cloud Run v2 Job. For more information see
    the [official documentation](https://cloud.google.com/run/docs/)
    and [API](https://cloud.google.com/run/docs/apis).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_job = gcp.cloudrunv2.get_job(location="us-central1",
        name="my-job")
    ```


    :param str location: The location of the instance. eg us-central1
           
           - - -
    :param str name: The name of the Cloud Run v2 Job.
    :param str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    """
    ...