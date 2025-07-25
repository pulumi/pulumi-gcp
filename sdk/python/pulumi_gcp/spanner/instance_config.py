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

__all__ = ['InstanceConfigArgs', 'InstanceConfig']

@pulumi.input_type
class InstanceConfigArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[_builtins.str],
                 replicas: pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]],
                 base_config: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a InstanceConfig resource.
        :param pulumi.Input[_builtins.str] display_name: The name of this instance configuration as it appears in UIs.
        :param pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]] replicas: The geographic placement of nodes in this instance configuration and their replication properties.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] base_config: Base configuration name, e.g. nam3, based on which this configuration is created.
               Only set for user managed configurations.
               baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: An object containing a list of "key": value pairs.
               Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: A unique identifier for the instance configuration. Values are of the
               form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "replicas", replicas)
        if base_config is not None:
            pulumi.set(__self__, "base_config", base_config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of this instance configuration as it appears in UIs.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def replicas(self) -> pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]]:
        """
        The geographic placement of nodes in this instance configuration and their replication properties.
        Structure is documented below.
        """
        return pulumi.get(self, "replicas")

    @replicas.setter
    def replicas(self, value: pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]]):
        pulumi.set(self, "replicas", value)

    @_builtins.property
    @pulumi.getter(name="baseConfig")
    def base_config(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Base configuration name, e.g. nam3, based on which this configuration is created.
        Only set for user managed configurations.
        baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        """
        return pulumi.get(self, "base_config")

    @base_config.setter
    def base_config(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "base_config", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        An object containing a list of "key": value pairs.
        Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A unique identifier for the instance configuration. Values are of the
        form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
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


@pulumi.input_type
class _InstanceConfigState:
    def __init__(__self__, *,
                 base_config: Optional[pulumi.Input[_builtins.str]] = None,
                 config_type: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 replicas: Optional[pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]]] = None):
        """
        Input properties used for looking up and filtering InstanceConfig resources.
        :param pulumi.Input[_builtins.str] base_config: Base configuration name, e.g. nam3, based on which this configuration is created.
               Only set for user managed configurations.
               baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        :param pulumi.Input[_builtins.str] config_type: Output only. Whether this instance config is a Google or User Managed Configuration.
        :param pulumi.Input[_builtins.str] display_name: The name of this instance configuration as it appears in UIs.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: An object containing a list of "key": value pairs.
               Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: A unique identifier for the instance configuration. Values are of the
               form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]] replicas: The geographic placement of nodes in this instance configuration and their replication properties.
               Structure is documented below.
        """
        if base_config is not None:
            pulumi.set(__self__, "base_config", base_config)
        if config_type is not None:
            pulumi.set(__self__, "config_type", config_type)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if effective_labels is not None:
            pulumi.set(__self__, "effective_labels", effective_labels)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if pulumi_labels is not None:
            pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if replicas is not None:
            pulumi.set(__self__, "replicas", replicas)

    @_builtins.property
    @pulumi.getter(name="baseConfig")
    def base_config(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Base configuration name, e.g. nam3, based on which this configuration is created.
        Only set for user managed configurations.
        baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        """
        return pulumi.get(self, "base_config")

    @base_config.setter
    def base_config(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "base_config", value)

    @_builtins.property
    @pulumi.getter(name="configType")
    def config_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Whether this instance config is a Google or User Managed Configuration.
        """
        return pulumi.get(self, "config_type")

    @config_type.setter
    def config_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "config_type", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of this instance configuration as it appears in UIs.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @effective_labels.setter
    def effective_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "effective_labels", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        An object containing a list of "key": value pairs.
        Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A unique identifier for the instance configuration. Values are of the
        form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
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
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The combination of labels configured directly on the resource
        and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @pulumi_labels.setter
    def pulumi_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "pulumi_labels", value)

    @_builtins.property
    @pulumi.getter
    def replicas(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]]]:
        """
        The geographic placement of nodes in this instance configuration and their replication properties.
        Structure is documented below.
        """
        return pulumi.get(self, "replicas")

    @replicas.setter
    def replicas(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['InstanceConfigReplicaArgs']]]]):
        pulumi.set(self, "replicas", value)


@pulumi.type_token("gcp:spanner/instanceConfig:InstanceConfig")
class InstanceConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_config: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 replicas: Optional[pulumi.Input[Sequence[pulumi.Input[Union['InstanceConfigReplicaArgs', 'InstanceConfigReplicaArgsDict']]]]] = None,
                 __props__=None):
        """
        A possible configuration for a Cloud Spanner instance. Configurations
        define the geographic placement of nodes and their replication.

        To get more information about InstanceConfig, see:

        * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instanceConfigs)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/spanner/)

        ## Example Usage

        ## Import

        InstanceConfig can be imported using any of these accepted formats:

        * `projects/{{project}}/instanceConfigs/{{name}}`

        * `{{project}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, InstanceConfig can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:spanner/instanceConfig:InstanceConfig default projects/{{project}}/instanceConfigs/{{name}}
        ```

        ```sh
        $ pulumi import gcp:spanner/instanceConfig:InstanceConfig default {{project}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:spanner/instanceConfig:InstanceConfig default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] base_config: Base configuration name, e.g. nam3, based on which this configuration is created.
               Only set for user managed configurations.
               baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        :param pulumi.Input[_builtins.str] display_name: The name of this instance configuration as it appears in UIs.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: An object containing a list of "key": value pairs.
               Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: A unique identifier for the instance configuration. Values are of the
               form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Sequence[pulumi.Input[Union['InstanceConfigReplicaArgs', 'InstanceConfigReplicaArgsDict']]]] replicas: The geographic placement of nodes in this instance configuration and their replication properties.
               Structure is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A possible configuration for a Cloud Spanner instance. Configurations
        define the geographic placement of nodes and their replication.

        To get more information about InstanceConfig, see:

        * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instanceConfigs)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/spanner/)

        ## Example Usage

        ## Import

        InstanceConfig can be imported using any of these accepted formats:

        * `projects/{{project}}/instanceConfigs/{{name}}`

        * `{{project}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, InstanceConfig can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:spanner/instanceConfig:InstanceConfig default projects/{{project}}/instanceConfigs/{{name}}
        ```

        ```sh
        $ pulumi import gcp:spanner/instanceConfig:InstanceConfig default {{project}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:spanner/instanceConfig:InstanceConfig default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param InstanceConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_config: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 replicas: Optional[pulumi.Input[Sequence[pulumi.Input[Union['InstanceConfigReplicaArgs', 'InstanceConfigReplicaArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceConfigArgs.__new__(InstanceConfigArgs)

            __props__.__dict__["base_config"] = base_config
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            if replicas is None and not opts.urn:
                raise TypeError("Missing required property 'replicas'")
            __props__.__dict__["replicas"] = replicas
            __props__.__dict__["config_type"] = None
            __props__.__dict__["effective_labels"] = None
            __props__.__dict__["pulumi_labels"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["effectiveLabels", "pulumiLabels"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(InstanceConfig, __self__).__init__(
            'gcp:spanner/instanceConfig:InstanceConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            base_config: Optional[pulumi.Input[_builtins.str]] = None,
            config_type: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            replicas: Optional[pulumi.Input[Sequence[pulumi.Input[Union['InstanceConfigReplicaArgs', 'InstanceConfigReplicaArgsDict']]]]] = None) -> 'InstanceConfig':
        """
        Get an existing InstanceConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] base_config: Base configuration name, e.g. nam3, based on which this configuration is created.
               Only set for user managed configurations.
               baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        :param pulumi.Input[_builtins.str] config_type: Output only. Whether this instance config is a Google or User Managed Configuration.
        :param pulumi.Input[_builtins.str] display_name: The name of this instance configuration as it appears in UIs.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: An object containing a list of "key": value pairs.
               Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: A unique identifier for the instance configuration. Values are of the
               form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[Sequence[pulumi.Input[Union['InstanceConfigReplicaArgs', 'InstanceConfigReplicaArgsDict']]]] replicas: The geographic placement of nodes in this instance configuration and their replication properties.
               Structure is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceConfigState.__new__(_InstanceConfigState)

        __props__.__dict__["base_config"] = base_config
        __props__.__dict__["config_type"] = config_type
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["effective_labels"] = effective_labels
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["pulumi_labels"] = pulumi_labels
        __props__.__dict__["replicas"] = replicas
        return InstanceConfig(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="baseConfig")
    def base_config(self) -> pulumi.Output[_builtins.str]:
        """
        Base configuration name, e.g. nam3, based on which this configuration is created.
        Only set for user managed configurations.
        baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
        """
        return pulumi.get(self, "base_config")

    @_builtins.property
    @pulumi.getter(name="configType")
    def config_type(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Whether this instance config is a Google or User Managed Configuration.
        """
        return pulumi.get(self, "config_type")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of this instance configuration as it appears in UIs.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        An object containing a list of "key": value pairs.
        Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        A unique identifier for the instance configuration. Values are of the
        form projects/<project>/instanceConfigs/[a-z][-a-z0-9]*
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
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        The combination of labels configured directly on the resource
        and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter
    def replicas(self) -> pulumi.Output[Sequence['outputs.InstanceConfigReplica']]:
        """
        The geographic placement of nodes in this instance configuration and their replication properties.
        Structure is documented below.
        """
        return pulumi.get(self, "replicas")

