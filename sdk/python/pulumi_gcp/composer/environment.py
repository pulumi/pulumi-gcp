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

__all__ = ['EnvironmentArgs', 'Environment']

@pulumi.input_type
class EnvironmentArgs:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input['EnvironmentConfigArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_config: Optional[pulumi.Input['EnvironmentStorageConfigArgs']] = None):
        """
        The set of arguments for constructing a Environment resource.
        :param pulumi.Input['EnvironmentConfigArgs'] config: Configuration parameters for this environment.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
               are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
               must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
               conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
               and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
               present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
               resource.
        :param pulumi.Input[_builtins.str] name: Name of the environment.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The location or Compute Engine region for the environment.
        :param pulumi.Input['EnvironmentStorageConfigArgs'] storage_config: Configuration options for storage used by Composer environment.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if storage_config is not None:
            pulumi.set(__self__, "storage_config", storage_config)

    @_builtins.property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['EnvironmentConfigArgs']]:
        """
        Configuration parameters for this environment.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['EnvironmentConfigArgs']]):
        pulumi.set(self, "config", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
        are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
        must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
        conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
        and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
        present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
        resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the environment.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location or Compute Engine region for the environment.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter(name="storageConfig")
    def storage_config(self) -> Optional[pulumi.Input['EnvironmentStorageConfigArgs']]:
        """
        Configuration options for storage used by Composer environment.
        """
        return pulumi.get(self, "storage_config")

    @storage_config.setter
    def storage_config(self, value: Optional[pulumi.Input['EnvironmentStorageConfigArgs']]):
        pulumi.set(self, "storage_config", value)


@pulumi.input_type
class _EnvironmentState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input['EnvironmentConfigArgs']] = None,
                 effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_config: Optional[pulumi.Input['EnvironmentStorageConfigArgs']] = None):
        """
        Input properties used for looking up and filtering Environment resources.
        :param pulumi.Input['EnvironmentConfigArgs'] config: Configuration parameters for this environment.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
               are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
               must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
               conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
               and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
               present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
               resource.
        :param pulumi.Input[_builtins.str] name: Name of the environment.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] region: The location or Compute Engine region for the environment.
        :param pulumi.Input['EnvironmentStorageConfigArgs'] storage_config: Configuration options for storage used by Composer environment.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
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
        if region is not None:
            pulumi.set(__self__, "region", region)
        if storage_config is not None:
            pulumi.set(__self__, "storage_config", storage_config)

    @_builtins.property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['EnvironmentConfigArgs']]:
        """
        Configuration parameters for this environment.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['EnvironmentConfigArgs']]):
        pulumi.set(self, "config", value)

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        return pulumi.get(self, "effective_labels")

    @effective_labels.setter
    def effective_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "effective_labels", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
        are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
        must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
        conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
        and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
        present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
        resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the environment.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The combination of labels configured directly on the resource and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @pulumi_labels.setter
    def pulumi_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "pulumi_labels", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location or Compute Engine region for the environment.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter(name="storageConfig")
    def storage_config(self) -> Optional[pulumi.Input['EnvironmentStorageConfigArgs']]:
        """
        Configuration options for storage used by Composer environment.
        """
        return pulumi.get(self, "storage_config")

    @storage_config.setter
    def storage_config(self, value: Optional[pulumi.Input['EnvironmentStorageConfigArgs']]):
        pulumi.set(self, "storage_config", value)


@pulumi.type_token("gcp:composer/environment:Environment")
class Environment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['EnvironmentConfigArgs', 'EnvironmentConfigArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_config: Optional[pulumi.Input[Union['EnvironmentStorageConfigArgs', 'EnvironmentStorageConfigArgsDict']]] = None,
                 __props__=None):
        """
        ## Import

        Environment can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{region}}/environments/{{name}}`

        * `{{project}}/{{region}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Environment can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:composer/environment:Environment default projects/{{project}}/locations/{{region}}/environments/{{name}}
        ```

        ```sh
        $ pulumi import gcp:composer/environment:Environment default {{project}}/{{region}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:composer/environment:Environment default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EnvironmentConfigArgs', 'EnvironmentConfigArgsDict']] config: Configuration parameters for this environment.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
               are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
               must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
               conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
               and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
               present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
               resource.
        :param pulumi.Input[_builtins.str] name: Name of the environment.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The location or Compute Engine region for the environment.
        :param pulumi.Input[Union['EnvironmentStorageConfigArgs', 'EnvironmentStorageConfigArgsDict']] storage_config: Configuration options for storage used by Composer environment.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[EnvironmentArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Environment can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{region}}/environments/{{name}}`

        * `{{project}}/{{region}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, Environment can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:composer/environment:Environment default projects/{{project}}/locations/{{region}}/environments/{{name}}
        ```

        ```sh
        $ pulumi import gcp:composer/environment:Environment default {{project}}/{{region}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:composer/environment:Environment default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param EnvironmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['EnvironmentConfigArgs', 'EnvironmentConfigArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_config: Optional[pulumi.Input[Union['EnvironmentStorageConfigArgs', 'EnvironmentStorageConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentArgs.__new__(EnvironmentArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["storage_config"] = storage_config
            __props__.__dict__["effective_labels"] = None
            __props__.__dict__["pulumi_labels"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["effectiveLabels", "pulumiLabels"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Environment, __self__).__init__(
            'gcp:composer/environment:Environment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Union['EnvironmentConfigArgs', 'EnvironmentConfigArgsDict']]] = None,
            effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None,
            storage_config: Optional[pulumi.Input[Union['EnvironmentStorageConfigArgs', 'EnvironmentStorageConfigArgsDict']]] = None) -> 'Environment':
        """
        Get an existing Environment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EnvironmentConfigArgs', 'EnvironmentConfigArgsDict']] config: Configuration parameters for this environment.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
               are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
               must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
               conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
               and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
               present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
               resource.
        :param pulumi.Input[_builtins.str] name: Name of the environment.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] region: The location or Compute Engine region for the environment.
        :param pulumi.Input[Union['EnvironmentStorageConfigArgs', 'EnvironmentStorageConfigArgsDict']] storage_config: Configuration options for storage used by Composer environment.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentState.__new__(_EnvironmentState)

        __props__.__dict__["config"] = config
        __props__.__dict__["effective_labels"] = effective_labels
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["pulumi_labels"] = pulumi_labels
        __props__.__dict__["region"] = region
        __props__.__dict__["storage_config"] = storage_config
        return Environment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.EnvironmentConfig']:
        """
        Configuration parameters for this environment.
        """
        return pulumi.get(self, "config")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
        are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
        must conform to the following regular expression: a-z?. Label values must be between 0 and 63 characters long and must
        conform to the regular expression (a-z?)?. No more than 64 labels can be associated with a given environment. Both keys
        and values must be <= 128 bytes in size. **Note**: This field is non-authoritative, and will only manage the labels
        present in your configuration. Please refer to the field 'effective_labels' for all of the labels present on the
        resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the environment.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        The combination of labels configured directly on the resource and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[_builtins.str]:
        """
        The location or Compute Engine region for the environment.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter(name="storageConfig")
    def storage_config(self) -> pulumi.Output['outputs.EnvironmentStorageConfig']:
        """
        Configuration options for storage used by Composer environment.
        """
        return pulumi.get(self, "storage_config")

