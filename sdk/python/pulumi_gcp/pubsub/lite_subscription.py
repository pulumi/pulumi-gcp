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

__all__ = ['LiteSubscriptionArgs', 'LiteSubscription']

@pulumi.input_type
class LiteSubscriptionArgs:
    def __init__(__self__, *,
                 topic: pulumi.Input[_builtins.str],
                 delivery_config: Optional[pulumi.Input['LiteSubscriptionDeliveryConfigArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a LiteSubscription resource.
        :param pulumi.Input[_builtins.str] topic: A reference to a Topic resource.
        :param pulumi.Input['LiteSubscriptionDeliveryConfigArgs'] delivery_config: The settings for this subscription's message delivery.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: Name of the subscription.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        pulumi.set(__self__, "topic", topic)
        if delivery_config is not None:
            pulumi.set(__self__, "delivery_config", delivery_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> pulumi.Input[_builtins.str]:
        """
        A reference to a Topic resource.
        """
        return pulumi.get(self, "topic")

    @topic.setter
    def topic(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "topic", value)

    @_builtins.property
    @pulumi.getter(name="deliveryConfig")
    def delivery_config(self) -> Optional[pulumi.Input['LiteSubscriptionDeliveryConfigArgs']]:
        """
        The settings for this subscription's message delivery.
        Structure is documented below.
        """
        return pulumi.get(self, "delivery_config")

    @delivery_config.setter
    def delivery_config(self, value: Optional[pulumi.Input['LiteSubscriptionDeliveryConfigArgs']]):
        pulumi.set(self, "delivery_config", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the subscription.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

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
class _LiteSubscriptionState:
    def __init__(__self__, *,
                 delivery_config: Optional[pulumi.Input['LiteSubscriptionDeliveryConfigArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 topic: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LiteSubscription resources.
        :param pulumi.Input['LiteSubscriptionDeliveryConfigArgs'] delivery_config: The settings for this subscription's message delivery.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: Name of the subscription.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input[_builtins.str] topic: A reference to a Topic resource.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        if delivery_config is not None:
            pulumi.set(__self__, "delivery_config", delivery_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if topic is not None:
            pulumi.set(__self__, "topic", topic)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter(name="deliveryConfig")
    def delivery_config(self) -> Optional[pulumi.Input['LiteSubscriptionDeliveryConfigArgs']]:
        """
        The settings for this subscription's message delivery.
        Structure is documented below.
        """
        return pulumi.get(self, "delivery_config")

    @delivery_config.setter
    def delivery_config(self, value: Optional[pulumi.Input['LiteSubscriptionDeliveryConfigArgs']]):
        pulumi.set(self, "delivery_config", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the subscription.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter
    def topic(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A reference to a Topic resource.
        """
        return pulumi.get(self, "topic")

    @topic.setter
    def topic(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "topic", value)

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


@pulumi.type_token("gcp:pubsub/liteSubscription:LiteSubscription")
class LiteSubscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delivery_config: Optional[pulumi.Input[Union['LiteSubscriptionDeliveryConfigArgs', 'LiteSubscriptionDeliveryConfigArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 topic: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A named resource representing the stream of messages from a single,
        specific topic, to be delivered to the subscribing application.

        To get more information about Subscription, see:

        * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.subscriptions)
        * How-to Guides
            * [Managing Subscriptions](https://cloud.google.com/pubsub/lite/docs/subscriptions)

        ## Example Usage

        ### Pubsub Lite Subscription Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.pubsub.LiteTopic("example",
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
            })
        example_lite_subscription = gcp.pubsub.LiteSubscription("example",
            name="example-subscription",
            topic=example.name,
            delivery_config={
                "delivery_requirement": "DELIVER_AFTER_STORED",
            })
        ```

        ## Import

        Subscription can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{zone}}/subscriptions/{{name}}`

        * `{{project}}/{{zone}}/{{name}}`

        * `{{zone}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Subscription can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default projects/{{project}}/locations/{{zone}}/subscriptions/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{project}}/{{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['LiteSubscriptionDeliveryConfigArgs', 'LiteSubscriptionDeliveryConfigArgsDict']] delivery_config: The settings for this subscription's message delivery.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: Name of the subscription.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input[_builtins.str] topic: A reference to a Topic resource.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LiteSubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A named resource representing the stream of messages from a single,
        specific topic, to be delivered to the subscribing application.

        To get more information about Subscription, see:

        * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.subscriptions)
        * How-to Guides
            * [Managing Subscriptions](https://cloud.google.com/pubsub/lite/docs/subscriptions)

        ## Example Usage

        ### Pubsub Lite Subscription Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        example = gcp.pubsub.LiteTopic("example",
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
            })
        example_lite_subscription = gcp.pubsub.LiteSubscription("example",
            name="example-subscription",
            topic=example.name,
            delivery_config={
                "delivery_requirement": "DELIVER_AFTER_STORED",
            })
        ```

        ## Import

        Subscription can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{zone}}/subscriptions/{{name}}`

        * `{{project}}/{{zone}}/{{name}}`

        * `{{zone}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Subscription can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default projects/{{project}}/locations/{{zone}}/subscriptions/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{project}}/{{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{zone}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:pubsub/liteSubscription:LiteSubscription default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param LiteSubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LiteSubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delivery_config: Optional[pulumi.Input[Union['LiteSubscriptionDeliveryConfigArgs', 'LiteSubscriptionDeliveryConfigArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 topic: Optional[pulumi.Input[_builtins.str]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LiteSubscriptionArgs.__new__(LiteSubscriptionArgs)

            __props__.__dict__["delivery_config"] = delivery_config
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            if topic is None and not opts.urn:
                raise TypeError("Missing required property 'topic'")
            __props__.__dict__["topic"] = topic
            __props__.__dict__["zone"] = zone
        super(LiteSubscription, __self__).__init__(
            'gcp:pubsub/liteSubscription:LiteSubscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delivery_config: Optional[pulumi.Input[Union['LiteSubscriptionDeliveryConfigArgs', 'LiteSubscriptionDeliveryConfigArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None,
            topic: Optional[pulumi.Input[_builtins.str]] = None,
            zone: Optional[pulumi.Input[_builtins.str]] = None) -> 'LiteSubscription':
        """
        Get an existing LiteSubscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['LiteSubscriptionDeliveryConfigArgs', 'LiteSubscriptionDeliveryConfigArgsDict']] delivery_config: The settings for this subscription's message delivery.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: Name of the subscription.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the pubsub lite topic.
        :param pulumi.Input[_builtins.str] topic: A reference to a Topic resource.
        :param pulumi.Input[_builtins.str] zone: The zone of the pubsub lite topic.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LiteSubscriptionState.__new__(_LiteSubscriptionState)

        __props__.__dict__["delivery_config"] = delivery_config
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["region"] = region
        __props__.__dict__["topic"] = topic
        __props__.__dict__["zone"] = zone
        return LiteSubscription(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="deliveryConfig")
    def delivery_config(self) -> pulumi.Output[Optional['outputs.LiteSubscriptionDeliveryConfig']]:
        """
        The settings for this subscription's message delivery.
        Structure is documented below.
        """
        return pulumi.get(self, "delivery_config")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the subscription.
        """
        return pulumi.get(self, "name")

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
    @pulumi.getter
    def topic(self) -> pulumi.Output[_builtins.str]:
        """
        A reference to a Topic resource.
        """
        return pulumi.get(self, "topic")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The zone of the pubsub lite topic.
        """
        return pulumi.get(self, "zone")

