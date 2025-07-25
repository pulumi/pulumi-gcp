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

__all__ = ['WorkerPoolArgs', 'WorkerPool']

@pulumi.input_type
class WorkerPoolArgs:
    def __init__(__self__, *,
                 location: pulumi.Input[_builtins.str],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_config: Optional[pulumi.Input['WorkerPoolNetworkConfigArgs']] = None,
                 private_service_connect: Optional[pulumi.Input['WorkerPoolPrivateServiceConnectArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 worker_config: Optional[pulumi.Input['WorkerPoolWorkerConfigArgs']] = None):
        """
        The set of arguments for constructing a WorkerPool resource.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
               limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
               configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        :param pulumi.Input[_builtins.str] display_name: A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        :param pulumi.Input[_builtins.str] name: User-defined name of the `WorkerPool`.
               
               
               - - -
        :param pulumi.Input['WorkerPoolNetworkConfigArgs'] network_config: Network configuration for the `WorkerPool`. Structure is documented below.
        :param pulumi.Input['WorkerPoolPrivateServiceConnectArgs'] private_service_connect: Private Service Connect configuration for the pool.
        :param pulumi.Input[_builtins.str] project: The project for the resource
        :param pulumi.Input['WorkerPoolWorkerConfigArgs'] worker_config: Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        pulumi.set(__self__, "location", location)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_config is not None:
            pulumi.set(__self__, "network_config", network_config)
        if private_service_connect is not None:
            pulumi.set(__self__, "private_service_connect", private_service_connect)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if worker_config is not None:
            pulumi.set(__self__, "worker_config", worker_config)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        The location for the resource
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
        limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
        configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User-defined name of the `WorkerPool`.


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkConfig")
    def network_config(self) -> Optional[pulumi.Input['WorkerPoolNetworkConfigArgs']]:
        """
        Network configuration for the `WorkerPool`. Structure is documented below.
        """
        return pulumi.get(self, "network_config")

    @network_config.setter
    def network_config(self, value: Optional[pulumi.Input['WorkerPoolNetworkConfigArgs']]):
        pulumi.set(self, "network_config", value)

    @_builtins.property
    @pulumi.getter(name="privateServiceConnect")
    def private_service_connect(self) -> Optional[pulumi.Input['WorkerPoolPrivateServiceConnectArgs']]:
        """
        Private Service Connect configuration for the pool.
        """
        return pulumi.get(self, "private_service_connect")

    @private_service_connect.setter
    def private_service_connect(self, value: Optional[pulumi.Input['WorkerPoolPrivateServiceConnectArgs']]):
        pulumi.set(self, "private_service_connect", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project for the resource
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="workerConfig")
    def worker_config(self) -> Optional[pulumi.Input['WorkerPoolWorkerConfigArgs']]:
        """
        Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        return pulumi.get(self, "worker_config")

    @worker_config.setter
    def worker_config(self, value: Optional[pulumi.Input['WorkerPoolWorkerConfigArgs']]):
        pulumi.set(self, "worker_config", value)


@pulumi.input_type
class _WorkerPoolState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 delete_time: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_config: Optional[pulumi.Input['WorkerPoolNetworkConfigArgs']] = None,
                 private_service_connect: Optional[pulumi.Input['WorkerPoolPrivateServiceConnectArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 uid: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None,
                 worker_config: Optional[pulumi.Input['WorkerPoolWorkerConfigArgs']] = None):
        """
        Input properties used for looking up and filtering WorkerPool resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
               limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
               configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        :param pulumi.Input[_builtins.str] create_time: Output only. Time at which the request to create the `WorkerPool` was received.
        :param pulumi.Input[_builtins.str] delete_time: Output only. Time at which the request to delete the `WorkerPool` was received.
        :param pulumi.Input[_builtins.str] display_name: A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[_builtins.str] name: User-defined name of the `WorkerPool`.
               
               
               - - -
        :param pulumi.Input['WorkerPoolNetworkConfigArgs'] network_config: Network configuration for the `WorkerPool`. Structure is documented below.
        :param pulumi.Input['WorkerPoolPrivateServiceConnectArgs'] private_service_connect: Private Service Connect configuration for the pool.
        :param pulumi.Input[_builtins.str] project: The project for the resource
        :param pulumi.Input[_builtins.str] state: Output only. WorkerPool state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
        :param pulumi.Input[_builtins.str] uid: Output only. A unique identifier for the `WorkerPool`.
        :param pulumi.Input[_builtins.str] update_time: Output only. Time at which the request to update the `WorkerPool` was received.
        :param pulumi.Input['WorkerPoolWorkerConfigArgs'] worker_config: Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if delete_time is not None:
            pulumi.set(__self__, "delete_time", delete_time)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if effective_annotations is not None:
            pulumi.set(__self__, "effective_annotations", effective_annotations)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_config is not None:
            pulumi.set(__self__, "network_config", network_config)
        if private_service_connect is not None:
            pulumi.set(__self__, "private_service_connect", private_service_connect)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)
        if worker_config is not None:
            pulumi.set(__self__, "worker_config", worker_config)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
        limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
        configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Time at which the request to create the `WorkerPool` was received.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Time at which the request to delete the `WorkerPool` was received.
        """
        return pulumi.get(self, "delete_time")

    @delete_time.setter
    def delete_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "delete_time", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="effectiveAnnotations")
    def effective_annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        return pulumi.get(self, "effective_annotations")

    @effective_annotations.setter
    def effective_annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "effective_annotations", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location for the resource
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User-defined name of the `WorkerPool`.


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkConfig")
    def network_config(self) -> Optional[pulumi.Input['WorkerPoolNetworkConfigArgs']]:
        """
        Network configuration for the `WorkerPool`. Structure is documented below.
        """
        return pulumi.get(self, "network_config")

    @network_config.setter
    def network_config(self, value: Optional[pulumi.Input['WorkerPoolNetworkConfigArgs']]):
        pulumi.set(self, "network_config", value)

    @_builtins.property
    @pulumi.getter(name="privateServiceConnect")
    def private_service_connect(self) -> Optional[pulumi.Input['WorkerPoolPrivateServiceConnectArgs']]:
        """
        Private Service Connect configuration for the pool.
        """
        return pulumi.get(self, "private_service_connect")

    @private_service_connect.setter
    def private_service_connect(self, value: Optional[pulumi.Input['WorkerPoolPrivateServiceConnectArgs']]):
        pulumi.set(self, "private_service_connect", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project for the resource
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. WorkerPool state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. A unique identifier for the `WorkerPool`.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "uid", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Time at which the request to update the `WorkerPool` was received.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)

    @_builtins.property
    @pulumi.getter(name="workerConfig")
    def worker_config(self) -> Optional[pulumi.Input['WorkerPoolWorkerConfigArgs']]:
        """
        Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        return pulumi.get(self, "worker_config")

    @worker_config.setter
    def worker_config(self, value: Optional[pulumi.Input['WorkerPoolWorkerConfigArgs']]):
        pulumi.set(self, "worker_config", value)


@pulumi.type_token("gcp:cloudbuild/workerPool:WorkerPool")
class WorkerPool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_config: Optional[pulumi.Input[Union['WorkerPoolNetworkConfigArgs', 'WorkerPoolNetworkConfigArgsDict']]] = None,
                 private_service_connect: Optional[pulumi.Input[Union['WorkerPoolPrivateServiceConnectArgs', 'WorkerPoolPrivateServiceConnectArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 worker_config: Optional[pulumi.Input[Union['WorkerPoolWorkerConfigArgs', 'WorkerPoolWorkerConfigArgsDict']]] = None,
                 __props__=None):
        """
        Definition of custom Cloud Build WorkerPools for running jobs with custom configuration and custom networking.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gcp as gcp

        pool = gcp.cloudbuild.WorkerPool("pool",
            name="my-pool",
            location="europe-west1",
            worker_config={
                "disk_size_gb": 100,
                "machine_type": "e2-standard-4",
                "no_external_ip": False,
            })
        ```

        ### Network Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        servicenetworking = gcp.projects.Service("servicenetworking",
            service="servicenetworking.googleapis.com",
            disable_on_destroy=False)
        network = gcp.compute.Network("network",
            name="my-network",
            auto_create_subnetworks=False,
            opts = pulumi.ResourceOptions(depends_on=[servicenetworking]))
        worker_range = gcp.compute.GlobalAddress("worker_range",
            name="worker-pool-range",
            purpose="VPC_PEERING",
            address_type="INTERNAL",
            prefix_length=16,
            network=network.id)
        worker_pool_conn = gcp.servicenetworking.Connection("worker_pool_conn",
            network=network.id,
            service="servicenetworking.googleapis.com",
            reserved_peering_ranges=[worker_range.name],
            opts = pulumi.ResourceOptions(depends_on=[servicenetworking]))
        pool = gcp.cloudbuild.WorkerPool("pool",
            name="my-pool",
            location="europe-west1",
            worker_config={
                "disk_size_gb": 100,
                "machine_type": "e2-standard-4",
                "no_external_ip": False,
            },
            network_config={
                "peered_network": network.id,
                "peered_network_ip_range": "/29",
            },
            opts = pulumi.ResourceOptions(depends_on=[worker_pool_conn]))
        ```

        ## Import

        WorkerPool can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/workerPools/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, WorkerPool can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default projects/{{project}}/locations/{{location}}/workerPools/{{name}}
        ```

        ```sh
        $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
               limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
               configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        :param pulumi.Input[_builtins.str] display_name: A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[_builtins.str] name: User-defined name of the `WorkerPool`.
               
               
               - - -
        :param pulumi.Input[Union['WorkerPoolNetworkConfigArgs', 'WorkerPoolNetworkConfigArgsDict']] network_config: Network configuration for the `WorkerPool`. Structure is documented below.
        :param pulumi.Input[Union['WorkerPoolPrivateServiceConnectArgs', 'WorkerPoolPrivateServiceConnectArgsDict']] private_service_connect: Private Service Connect configuration for the pool.
        :param pulumi.Input[_builtins.str] project: The project for the resource
        :param pulumi.Input[Union['WorkerPoolWorkerConfigArgs', 'WorkerPoolWorkerConfigArgsDict']] worker_config: Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkerPoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Definition of custom Cloud Build WorkerPools for running jobs with custom configuration and custom networking.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gcp as gcp

        pool = gcp.cloudbuild.WorkerPool("pool",
            name="my-pool",
            location="europe-west1",
            worker_config={
                "disk_size_gb": 100,
                "machine_type": "e2-standard-4",
                "no_external_ip": False,
            })
        ```

        ### Network Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        servicenetworking = gcp.projects.Service("servicenetworking",
            service="servicenetworking.googleapis.com",
            disable_on_destroy=False)
        network = gcp.compute.Network("network",
            name="my-network",
            auto_create_subnetworks=False,
            opts = pulumi.ResourceOptions(depends_on=[servicenetworking]))
        worker_range = gcp.compute.GlobalAddress("worker_range",
            name="worker-pool-range",
            purpose="VPC_PEERING",
            address_type="INTERNAL",
            prefix_length=16,
            network=network.id)
        worker_pool_conn = gcp.servicenetworking.Connection("worker_pool_conn",
            network=network.id,
            service="servicenetworking.googleapis.com",
            reserved_peering_ranges=[worker_range.name],
            opts = pulumi.ResourceOptions(depends_on=[servicenetworking]))
        pool = gcp.cloudbuild.WorkerPool("pool",
            name="my-pool",
            location="europe-west1",
            worker_config={
                "disk_size_gb": 100,
                "machine_type": "e2-standard-4",
                "no_external_ip": False,
            },
            network_config={
                "peered_network": network.id,
                "peered_network_ip_range": "/29",
            },
            opts = pulumi.ResourceOptions(depends_on=[worker_pool_conn]))
        ```

        ## Import

        WorkerPool can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/workerPools/{{name}}`

        * `{{project}}/{{location}}/{{name}}`

        * `{{location}}/{{name}}`

        When using the `pulumi import` command, WorkerPool can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default projects/{{project}}/locations/{{location}}/workerPools/{{name}}
        ```

        ```sh
        $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default {{project}}/{{location}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default {{location}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param WorkerPoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkerPoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_config: Optional[pulumi.Input[Union['WorkerPoolNetworkConfigArgs', 'WorkerPoolNetworkConfigArgsDict']]] = None,
                 private_service_connect: Optional[pulumi.Input[Union['WorkerPoolPrivateServiceConnectArgs', 'WorkerPoolPrivateServiceConnectArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 worker_config: Optional[pulumi.Input[Union['WorkerPoolWorkerConfigArgs', 'WorkerPoolWorkerConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkerPoolArgs.__new__(WorkerPoolArgs)

            __props__.__dict__["annotations"] = annotations
            __props__.__dict__["display_name"] = display_name
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["network_config"] = network_config
            __props__.__dict__["private_service_connect"] = private_service_connect
            __props__.__dict__["project"] = project
            __props__.__dict__["worker_config"] = worker_config
            __props__.__dict__["create_time"] = None
            __props__.__dict__["delete_time"] = None
            __props__.__dict__["effective_annotations"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uid"] = None
            __props__.__dict__["update_time"] = None
        super(WorkerPool, __self__).__init__(
            'gcp:cloudbuild/workerPool:WorkerPool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            delete_time: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            effective_annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network_config: Optional[pulumi.Input[Union['WorkerPoolNetworkConfigArgs', 'WorkerPoolNetworkConfigArgsDict']]] = None,
            private_service_connect: Optional[pulumi.Input[Union['WorkerPoolPrivateServiceConnectArgs', 'WorkerPoolPrivateServiceConnectArgsDict']]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None,
            uid: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None,
            worker_config: Optional[pulumi.Input[Union['WorkerPoolWorkerConfigArgs', 'WorkerPoolWorkerConfigArgsDict']]] = None) -> 'WorkerPool':
        """
        Get an existing WorkerPool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] annotations: User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
               limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
               configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        :param pulumi.Input[_builtins.str] create_time: Output only. Time at which the request to create the `WorkerPool` was received.
        :param pulumi.Input[_builtins.str] delete_time: Output only. Time at which the request to delete the `WorkerPool` was received.
        :param pulumi.Input[_builtins.str] display_name: A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        :param pulumi.Input[_builtins.str] location: The location for the resource
        :param pulumi.Input[_builtins.str] name: User-defined name of the `WorkerPool`.
               
               
               - - -
        :param pulumi.Input[Union['WorkerPoolNetworkConfigArgs', 'WorkerPoolNetworkConfigArgsDict']] network_config: Network configuration for the `WorkerPool`. Structure is documented below.
        :param pulumi.Input[Union['WorkerPoolPrivateServiceConnectArgs', 'WorkerPoolPrivateServiceConnectArgsDict']] private_service_connect: Private Service Connect configuration for the pool.
        :param pulumi.Input[_builtins.str] project: The project for the resource
        :param pulumi.Input[_builtins.str] state: Output only. WorkerPool state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
        :param pulumi.Input[_builtins.str] uid: Output only. A unique identifier for the `WorkerPool`.
        :param pulumi.Input[_builtins.str] update_time: Output only. Time at which the request to update the `WorkerPool` was received.
        :param pulumi.Input[Union['WorkerPoolWorkerConfigArgs', 'WorkerPoolWorkerConfigArgsDict']] worker_config: Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkerPoolState.__new__(_WorkerPoolState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["delete_time"] = delete_time
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["effective_annotations"] = effective_annotations
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["network_config"] = network_config
        __props__.__dict__["private_service_connect"] = private_service_connect
        __props__.__dict__["project"] = project
        __props__.__dict__["state"] = state
        __props__.__dict__["uid"] = uid
        __props__.__dict__["update_time"] = update_time
        __props__.__dict__["worker_config"] = worker_config
        return WorkerPool(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
        limitations. **Note**: This field is non-authoritative, and will only manage the annotations present in your
        configuration. Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Time at which the request to create the `WorkerPool` was received.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Time at which the request to delete the `WorkerPool` was received.
        """
        return pulumi.get(self, "delete_time")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="effectiveAnnotations")
    def effective_annotations(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "effective_annotations")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location for the resource
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        User-defined name of the `WorkerPool`.


        - - -
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkConfig")
    def network_config(self) -> pulumi.Output[Optional['outputs.WorkerPoolNetworkConfig']]:
        """
        Network configuration for the `WorkerPool`. Structure is documented below.
        """
        return pulumi.get(self, "network_config")

    @_builtins.property
    @pulumi.getter(name="privateServiceConnect")
    def private_service_connect(self) -> pulumi.Output[Optional['outputs.WorkerPoolPrivateServiceConnect']]:
        """
        Private Service Connect configuration for the pool.
        """
        return pulumi.get(self, "private_service_connect")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The project for the resource
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. WorkerPool state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. A unique identifier for the `WorkerPool`.
        """
        return pulumi.get(self, "uid")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Time at which the request to update the `WorkerPool` was received.
        """
        return pulumi.get(self, "update_time")

    @_builtins.property
    @pulumi.getter(name="workerConfig")
    def worker_config(self) -> pulumi.Output['outputs.WorkerPoolWorkerConfig']:
        """
        Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
        """
        return pulumi.get(self, "worker_config")

