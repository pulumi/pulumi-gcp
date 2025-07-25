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

__all__ = ['LiteTopicArgs', 'LiteTopic']

@pulumi.input_type
class LiteTopicArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_config: Optional[pulumi.Input['LiteTopicPartitionConfigArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 reservation_config: Optional[pulumi.Input['LiteTopicReservationConfigArgs']] = None,
                 retention_config: Optional[pulumi.Input['LiteTopicRetentionConfigArgs']] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a LiteTopic resource.
        :param pulumi.Input[_builtins.str] name: Name of the topic.
        :param pulumi.Input['LiteTopicPartitionConfigArgs'] partition_config: The settings for this topic's partitions.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input['LiteTopicReservationConfigArgs'] reservation_config: The settings for this topic's Reservation usage.
               Structure is documented below.
        :param pulumi.Input['LiteTopicRetentionConfigArgs'] retention_config: The settings for a topic's message retention.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if partition_config is not None:
            pulumi.set(__self__, "partition_config", partition_config)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if reservation_config is not None:
            pulumi.set(__self__, "reservation_config", reservation_config)
        if retention_config is not None:
            pulumi.set(__self__, "retention_config", retention_config)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the topic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="partitionConfig")
    def partition_config(self) -> Optional[pulumi.Input['LiteTopicPartitionConfigArgs']]:
        """
        The settings for this topic's partitions.
        Structure is documented below.
        """
        return pulumi.get(self, "partition_config")

    @partition_config.setter
    def partition_config(self, value: Optional[pulumi.Input['LiteTopicPartitionConfigArgs']]):
        pulumi.set(self, "partition_config", value)

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

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region of the pubsub lite topic.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter(name="reservationConfig")
    def reservation_config(self) -> Optional[pulumi.Input['LiteTopicReservationConfigArgs']]:
        """
        The settings for this topic's Reservation usage.
        Structure is documented below.
        """
        return pulumi.get(self, "reservation_config")

    @reservation_config.setter
    def reservation_config(self, value: Optional[pulumi.Input['LiteTopicReservationConfigArgs']]):
        pulumi.set(self, "reservation_config", value)

    @_builtins.property
    @pulumi.getter(name="retentionConfig")
    def retention_config(self) -> Optional[pulumi.Input['LiteTopicRetentionConfigArgs']]:
        """
        The settings for a topic's message retention.
        Structure is documented below.
        """
        return pulumi.get(self, "retention_config")

    @retention_config.setter
    def retention_config(self, value: Optional[pulumi.Input['LiteTopicRetentionConfigArgs']]):
        pulumi.set(self, "retention_config", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The zone of the pubsub lite topic.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _LiteTopicState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_config: Optional[pulumi.Input['LiteTopicPartitionConfigArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 reservation_config: Optional[pulumi.Input['LiteTopicReservationConfigArgs']] = None,
                 retention_config: Optional[pulumi.Input['LiteTopicRetentionConfigArgs']] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LiteTopic resources.
        :param pulumi.Input[_builtins.str] name: Name of the topic.
        :param pulumi.Input['LiteTopicPartitionConfigArgs'] partition_config: The settings for this topic's partitions.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input['LiteTopicReservationConfigArgs'] reservation_config: The settings for this topic's Reservation usage.
               Structure is documented below.
        :param pulumi.Input['LiteTopicRetentionConfigArgs'] retention_config: The settings for a topic's message retention.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if partition_config is not None:
            pulumi.set(__self__, "partition_config", partition_config)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if reservation_config is not None:
            pulumi.set(__self__, "reservation_config", reservation_config)
        if retention_config is not None:
            pulumi.set(__self__, "retention_config", retention_config)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the topic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="partitionConfig")
    def partition_config(self) -> Optional[pulumi.Input['LiteTopicPartitionConfigArgs']]:
        """
        The settings for this topic's partitions.
        Structure is documented below.
        """
        return pulumi.get(self, "partition_config")

    @partition_config.setter
    def partition_config(self, value: Optional[pulumi.Input['LiteTopicPartitionConfigArgs']]):
        pulumi.set(self, "partition_config", value)

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

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region of the pubsub lite topic.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter(name="reservationConfig")
    def reservation_config(self) -> Optional[pulumi.Input['LiteTopicReservationConfigArgs']]:
        """
        The settings for this topic's Reservation usage.
        Structure is documented below.
        """
        return pulumi.get(self, "reservation_config")

    @reservation_config.setter
    def reservation_config(self, value: Optional[pulumi.Input['LiteTopicReservationConfigArgs']]):
        pulumi.set(self, "reservation_config", value)

    @_builtins.property
    @pulumi.getter(name="retentionConfig")
    def retention_config(self) -> Optional[pulumi.Input['LiteTopicRetentionConfigArgs']]:
        """
        The settings for a topic's message retention.
        Structure is documented below.
        """
        return pulumi.get(self, "retention_config")

    @retention_config.setter
    def retention_config(self, value: Optional[pulumi.Input['LiteTopicRetentionConfigArgs']]):
        pulumi.set(self, "retention_config", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The zone of the pubsub lite topic.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.type_token("gcp:pubsub/liteTopic:LiteTopic")
class LiteTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_config: Optional[pulumi.Input[Union['LiteTopicPartitionConfigArgs', 'LiteTopicPartitionConfigArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 reservation_config: Optional[pulumi.Input[Union['LiteTopicReservationConfigArgs', 'LiteTopicReservationConfigArgsDict']]] = None,
                 retention_config: Optional[pulumi.Input[Union['LiteTopicRetentionConfigArgs', 'LiteTopicRetentionConfigArgsDict']]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A named resource to which messages are sent by publishers.

        To get more information about Topic, see:

        * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.topics)
        * How-to Guides
            * [Managing Topics](https://cloud.google.com/pubsub/lite/docs/topics)

        ## Example Usage

        ### Pubsub Lite Topic Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.pubsub.LiteReservation("example",
            name="example-reservation",
            project=project.number,
            throughput_capacity=2)
        example_lite_topic = gcp.pubsub.LiteTopic("example",
            name="example-topic",
            project=project.number,
            partition_config={
                "count": 1,
                "capacity": {
                    "publish_mib_per_sec": 4,
                    "subscribe_mib_per_sec": 8,
                },
            },
            retention_config={
                "per_partition_bytes": "32212254720",
            },
            reservation_config={
                "throughput_reservation": example.name,
            })
        ```

        ## Import

        Topic can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{zone}}/topics/{{name}}`

        * `{{project}}/{{zone}}/{{name}}`

        * `{{zone}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Topic can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default projects/{{project}}/locations/{{zone}}/topics/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{project}}/{{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Name of the topic.
        :param pulumi.Input[Union['LiteTopicPartitionConfigArgs', 'LiteTopicPartitionConfigArgsDict']] partition_config: The settings for this topic's partitions.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input[Union['LiteTopicReservationConfigArgs', 'LiteTopicReservationConfigArgsDict']] reservation_config: The settings for this topic's Reservation usage.
               Structure is documented below.
        :param pulumi.Input[Union['LiteTopicRetentionConfigArgs', 'LiteTopicRetentionConfigArgsDict']] retention_config: The settings for a topic's message retention.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[LiteTopicArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A named resource to which messages are sent by publishers.

        To get more information about Topic, see:

        * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.topics)
        * How-to Guides
            * [Managing Topics](https://cloud.google.com/pubsub/lite/docs/topics)

        ## Example Usage

        ### Pubsub Lite Topic Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.pubsub.LiteReservation("example",
            name="example-reservation",
            project=project.number,
            throughput_capacity=2)
        example_lite_topic = gcp.pubsub.LiteTopic("example",
            name="example-topic",
            project=project.number,
            partition_config={
                "count": 1,
                "capacity": {
                    "publish_mib_per_sec": 4,
                    "subscribe_mib_per_sec": 8,
                },
            },
            retention_config={
                "per_partition_bytes": "32212254720",
            },
            reservation_config={
                "throughput_reservation": example.name,
            })
        ```

        ## Import

        Topic can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{zone}}/topics/{{name}}`

        * `{{project}}/{{zone}}/{{name}}`

        * `{{zone}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Topic can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default projects/{{project}}/locations/{{zone}}/topics/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{project}}/{{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param LiteTopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LiteTopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_config: Optional[pulumi.Input[Union['LiteTopicPartitionConfigArgs', 'LiteTopicPartitionConfigArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 reservation_config: Optional[pulumi.Input[Union['LiteTopicReservationConfigArgs', 'LiteTopicReservationConfigArgsDict']]] = None,
                 retention_config: Optional[pulumi.Input[Union['LiteTopicRetentionConfigArgs', 'LiteTopicRetentionConfigArgsDict']]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LiteTopicArgs.__new__(LiteTopicArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["partition_config"] = partition_config
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["reservation_config"] = reservation_config
            __props__.__dict__["retention_config"] = retention_config
            __props__.__dict__["zone"] = zone
        super(LiteTopic, __self__).__init__(
            'gcp:pubsub/liteTopic:LiteTopic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            partition_config: Optional[pulumi.Input[Union['LiteTopicPartitionConfigArgs', 'LiteTopicPartitionConfigArgsDict']]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None,
            reservation_config: Optional[pulumi.Input[Union['LiteTopicReservationConfigArgs', 'LiteTopicReservationConfigArgsDict']]] = None,
            retention_config: Optional[pulumi.Input[Union['LiteTopicRetentionConfigArgs', 'LiteTopicRetentionConfigArgsDict']]] = None,
            zone: Optional[pulumi.Input[_builtins.str]] = None) -> 'LiteTopic':
        """
        Get an existing LiteTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Name of the topic.
        :param pulumi.Input[Union['LiteTopicPartitionConfigArgs', 'LiteTopicPartitionConfigArgsDict']] partition_config: The settings for this topic's partitions.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input[Union['LiteTopicReservationConfigArgs', 'LiteTopicReservationConfigArgsDict']] reservation_config: The settings for this topic's Reservation usage.
               Structure is documented below.
        :param pulumi.Input[Union['LiteTopicRetentionConfigArgs', 'LiteTopicRetentionConfigArgsDict']] retention_config: The settings for a topic's message retention.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LiteTopicState.__new__(_LiteTopicState)

        __props__.__dict__["name"] = name
        __props__.__dict__["partition_config"] = partition_config
        __props__.__dict__["project"] = project
        __props__.__dict__["region"] = region
        __props__.__dict__["reservation_config"] = reservation_config
        __props__.__dict__["retention_config"] = retention_config
        __props__.__dict__["zone"] = zone
        return LiteTopic(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the topic.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="partitionConfig")
    def partition_config(self) -> pulumi.Output[Optional['outputs.LiteTopicPartitionConfig']]:
        """
        The settings for this topic's partitions.
        Structure is documented below.
        """
        return pulumi.get(self, "partition_config")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The region of the pubsub lite topic.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter(name="reservationConfig")
    def reservation_config(self) -> pulumi.Output[Optional['outputs.LiteTopicReservationConfig']]:
        """
        The settings for this topic's Reservation usage.
        Structure is documented below.
        """
        return pulumi.get(self, "reservation_config")

    @_builtins.property
    @pulumi.getter(name="retentionConfig")
    def retention_config(self) -> pulumi.Output[Optional['outputs.LiteTopicRetentionConfig']]:
        """
        The settings for a topic's message retention.
        Structure is documented below.
        """
        return pulumi.get(self, "retention_config")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The zone of the pubsub lite topic.
        """
        return pulumi.get(self, "zone")

