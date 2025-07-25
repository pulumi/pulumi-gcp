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

__all__ = ['TopicArgs', 'Topic']

@pulumi.input_type
class TopicArgs:
    def __init__(__self__, *,
                 cluster: pulumi.Input[_builtins.str],
                 location: pulumi.Input[_builtins.str],
                 replication_factor: pulumi.Input[_builtins.int],
                 topic_id: pulumi.Input[_builtins.str],
                 configs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 partition_count: Optional[pulumi.Input[_builtins.int]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Topic resource.
        :param pulumi.Input[_builtins.str] cluster: The cluster name.
        :param pulumi.Input[_builtins.str] location: ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        :param pulumi.Input[_builtins.int] replication_factor: The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        :param pulumi.Input[_builtins.str] topic_id: The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] configs: Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        :param pulumi.Input[_builtins.int] partition_count: The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "cluster", cluster)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "replication_factor", replication_factor)
        pulumi.set(__self__, "topic_id", topic_id)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if partition_count is not None:
            pulumi.set(__self__, "partition_count", partition_count)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def cluster(self) -> pulumi.Input[_builtins.str]:
        """
        The cluster name.
        """
        return pulumi.get(self, "cluster")

    @cluster.setter
    def cluster(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cluster", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> pulumi.Input[_builtins.int]:
        """
        The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        """
        return pulumi.get(self, "replication_factor")

    @replication_factor.setter
    def replication_factor(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "replication_factor", value)

    @_builtins.property
    @pulumi.getter(name="topicId")
    def topic_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        """
        return pulumi.get(self, "topic_id")

    @topic_id.setter
    def topic_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "topic_id", value)

    @_builtins.property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "configs", value)

    @_builtins.property
    @pulumi.getter(name="partitionCount")
    def partition_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        """
        return pulumi.get(self, "partition_count")

    @partition_count.setter
    def partition_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "partition_count", value)

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


@pulumi.input_type
class _TopicState:
    def __init__(__self__, *,
                 cluster: Optional[pulumi.Input[_builtins.str]] = None,
                 configs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_count: Optional[pulumi.Input[_builtins.int]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_factor: Optional[pulumi.Input[_builtins.int]] = None,
                 topic_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Topic resources.
        :param pulumi.Input[_builtins.str] cluster: The cluster name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] configs: Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        :param pulumi.Input[_builtins.str] location: ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        :param pulumi.Input[_builtins.str] name: The name of the topic. The `topic` segment is used when connecting directly to the cluster. Must be in the format `projects/PROJECT_ID/locations/LOCATION/clusters/CLUSTER_ID/topics/TOPIC_ID`.
        :param pulumi.Input[_builtins.int] partition_count: The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.int] replication_factor: The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        :param pulumi.Input[_builtins.str] topic_id: The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        """
        if cluster is not None:
            pulumi.set(__self__, "cluster", cluster)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if partition_count is not None:
            pulumi.set(__self__, "partition_count", partition_count)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if replication_factor is not None:
            pulumi.set(__self__, "replication_factor", replication_factor)
        if topic_id is not None:
            pulumi.set(__self__, "topic_id", topic_id)

    @_builtins.property
    @pulumi.getter
    def cluster(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The cluster name.
        """
        return pulumi.get(self, "cluster")

    @cluster.setter
    def cluster(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cluster", value)

    @_builtins.property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "configs", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the topic. The `topic` segment is used when connecting directly to the cluster. Must be in the format `projects/PROJECT_ID/locations/LOCATION/clusters/CLUSTER_ID/topics/TOPIC_ID`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="partitionCount")
    def partition_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        """
        return pulumi.get(self, "partition_count")

    @partition_count.setter
    def partition_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "partition_count", value)

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
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        """
        return pulumi.get(self, "replication_factor")

    @replication_factor.setter
    def replication_factor(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "replication_factor", value)

    @_builtins.property
    @pulumi.getter(name="topicId")
    def topic_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        """
        return pulumi.get(self, "topic_id")

    @topic_id.setter
    def topic_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "topic_id", value)


@pulumi.type_token("gcp:managedkafka/topic:Topic")
class Topic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster: Optional[pulumi.Input[_builtins.str]] = None,
                 configs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_count: Optional[pulumi.Input[_builtins.int]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_factor: Optional[pulumi.Input[_builtins.int]] = None,
                 topic_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A Managed Service for Apache Kafka topic. Apache Kafka is a trademark owned by the Apache Software Foundation.

        ## Example Usage

        ### Managedkafka Topic Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        cluster = gcp.managedkafka.Cluster("cluster",
            cluster_id="my-cluster",
            location="us-central1",
            capacity_config={
                "vcpu_count": "3",
                "memory_bytes": "3221225472",
            },
            gcp_config={
                "access_config": {
                    "network_configs": [{
                        "subnet": f"projects/{project.number}/regions/us-central1/subnetworks/default",
                    }],
                },
            })
        example = gcp.managedkafka.Topic("example",
            topic_id="my-topic",
            cluster=cluster.cluster_id,
            location="us-central1",
            partition_count=2,
            replication_factor=3,
            configs={
                "cleanup.policy": "compact",
            })
        ```

        ## Import

        Topic can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/topics/{{topic_id}}`

        * `{{project}}/{{location}}/{{cluster}}/{{topic_id}}`

        * `{{location}}/{{cluster}}/{{topic_id}}`

        When using the `pulumi import` command, Topic can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:managedkafka/topic:Topic default projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/topics/{{topic_id}}
        ```

        ```sh
        $ pulumi import gcp:managedkafka/topic:Topic default {{project}}/{{location}}/{{cluster}}/{{topic_id}}
        ```

        ```sh
        $ pulumi import gcp:managedkafka/topic:Topic default {{location}}/{{cluster}}/{{topic_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cluster: The cluster name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] configs: Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        :param pulumi.Input[_builtins.str] location: ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        :param pulumi.Input[_builtins.int] partition_count: The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.int] replication_factor: The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        :param pulumi.Input[_builtins.str] topic_id: The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Managed Service for Apache Kafka topic. Apache Kafka is a trademark owned by the Apache Software Foundation.

        ## Example Usage

        ### Managedkafka Topic Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        cluster = gcp.managedkafka.Cluster("cluster",
            cluster_id="my-cluster",
            location="us-central1",
            capacity_config={
                "vcpu_count": "3",
                "memory_bytes": "3221225472",
            },
            gcp_config={
                "access_config": {
                    "network_configs": [{
                        "subnet": f"projects/{project.number}/regions/us-central1/subnetworks/default",
                    }],
                },
            })
        example = gcp.managedkafka.Topic("example",
            topic_id="my-topic",
            cluster=cluster.cluster_id,
            location="us-central1",
            partition_count=2,
            replication_factor=3,
            configs={
                "cleanup.policy": "compact",
            })
        ```

        ## Import

        Topic can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/topics/{{topic_id}}`

        * `{{project}}/{{location}}/{{cluster}}/{{topic_id}}`

        * `{{location}}/{{cluster}}/{{topic_id}}`

        When using the `pulumi import` command, Topic can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:managedkafka/topic:Topic default projects/{{project}}/locations/{{location}}/clusters/{{cluster}}/topics/{{topic_id}}
        ```

        ```sh
        $ pulumi import gcp:managedkafka/topic:Topic default {{project}}/{{location}}/{{cluster}}/{{topic_id}}
        ```

        ```sh
        $ pulumi import gcp:managedkafka/topic:Topic default {{location}}/{{cluster}}/{{topic_id}}
        ```

        :param str resource_name: The name of the resource.
        :param TopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster: Optional[pulumi.Input[_builtins.str]] = None,
                 configs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_count: Optional[pulumi.Input[_builtins.int]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_factor: Optional[pulumi.Input[_builtins.int]] = None,
                 topic_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TopicArgs.__new__(TopicArgs)

            if cluster is None and not opts.urn:
                raise TypeError("Missing required property 'cluster'")
            __props__.__dict__["cluster"] = cluster
            __props__.__dict__["configs"] = configs
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["partition_count"] = partition_count
            __props__.__dict__["project"] = project
            if replication_factor is None and not opts.urn:
                raise TypeError("Missing required property 'replication_factor'")
            __props__.__dict__["replication_factor"] = replication_factor
            if topic_id is None and not opts.urn:
                raise TypeError("Missing required property 'topic_id'")
            __props__.__dict__["topic_id"] = topic_id
            __props__.__dict__["name"] = None
        super(Topic, __self__).__init__(
            'gcp:managedkafka/topic:Topic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster: Optional[pulumi.Input[_builtins.str]] = None,
            configs: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            partition_count: Optional[pulumi.Input[_builtins.int]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            replication_factor: Optional[pulumi.Input[_builtins.int]] = None,
            topic_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'Topic':
        """
        Get an existing Topic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cluster: The cluster name.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] configs: Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        :param pulumi.Input[_builtins.str] location: ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        :param pulumi.Input[_builtins.str] name: The name of the topic. The `topic` segment is used when connecting directly to the cluster. Must be in the format `projects/PROJECT_ID/locations/LOCATION/clusters/CLUSTER_ID/topics/TOPIC_ID`.
        :param pulumi.Input[_builtins.int] partition_count: The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.int] replication_factor: The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        :param pulumi.Input[_builtins.str] topic_id: The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TopicState.__new__(_TopicState)

        __props__.__dict__["cluster"] = cluster
        __props__.__dict__["configs"] = configs
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["partition_count"] = partition_count
        __props__.__dict__["project"] = project
        __props__.__dict__["replication_factor"] = replication_factor
        __props__.__dict__["topic_id"] = topic_id
        return Topic(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def cluster(self) -> pulumi.Output[_builtins.str]:
        """
        The cluster name.
        """
        return pulumi.get(self, "cluster")

    @_builtins.property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Configuration for the topic that are overridden from the cluster defaults. The key of the map is a Kafka topic property name, for example: `cleanup.policy=compact`, `compression.type=producer`.
        """
        return pulumi.get(self, "configs")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the topic. The `topic` segment is used when connecting directly to the cluster. Must be in the format `projects/PROJECT_ID/locations/LOCATION/clusters/CLUSTER_ID/topics/TOPIC_ID`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="partitionCount")
    def partition_count(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The number of partitions in a topic. You can increase the partition count for a topic, but you cannot decrease it. Increasing partitions for a topic that uses a key might change how messages are distributed.
        """
        return pulumi.get(self, "partition_count")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> pulumi.Output[_builtins.int]:
        """
        The number of replicas of each partition. A replication factor of 3 is recommended for high availability.
        """
        return pulumi.get(self, "replication_factor")

    @_builtins.property
    @pulumi.getter(name="topicId")
    def topic_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
        """
        return pulumi.get(self, "topic_id")

