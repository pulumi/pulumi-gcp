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

__all__ = ['ScopeArgs', 'Scope']

@pulumi.input_type
class ScopeArgs:
    def __init__(__self__, *,
                 scope_id: pulumi.Input[_builtins.str],
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 namespace_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Scope resource.
        :param pulumi.Input[_builtins.str] scope_id: The client-provided identifier of the scope.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for this Scope.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] namespace_labels: Scope-level cluster namespace labels. For the member clusters bound
               to the Scope, these labels are applied to each namespace under the
               Scope. Scope-level labels take precedence over Namespace-level
               labels (`namespace_labels` in the Fleet Namespace resource) if they
               share a key. Keys and values must be Kubernetes-conformant.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "scope_id", scope_id)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if namespace_labels is not None:
            pulumi.set(__self__, "namespace_labels", namespace_labels)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="scopeId")
    def scope_id(self) -> pulumi.Input[_builtins.str]:
        """
        The client-provided identifier of the scope.
        """
        return pulumi.get(self, "scope_id")

    @scope_id.setter
    def scope_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "scope_id", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Labels for this Scope.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter(name="namespaceLabels")
    def namespace_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Scope-level cluster namespace labels. For the member clusters bound
        to the Scope, these labels are applied to each namespace under the
        Scope. Scope-level labels take precedence over Namespace-level
        labels (`namespace_labels` in the Fleet Namespace resource) if they
        share a key. Keys and values must be Kubernetes-conformant.
        """
        return pulumi.get(self, "namespace_labels")

    @namespace_labels.setter
    def namespace_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "namespace_labels", value)

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
class _ScopeState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 delete_time: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 scope_id: Optional[pulumi.Input[_builtins.str]] = None,
                 states: Optional[pulumi.Input[Sequence[pulumi.Input['ScopeStateArgs']]]] = None,
                 uid: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Scope resources.
        :param pulumi.Input[_builtins.str] create_time: Time the Scope was created in UTC.
        :param pulumi.Input[_builtins.str] delete_time: Time the Scope was deleted in UTC.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for this Scope.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: The unique identifier of the scope
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] namespace_labels: Scope-level cluster namespace labels. For the member clusters bound
               to the Scope, these labels are applied to each namespace under the
               Scope. Scope-level labels take precedence over Namespace-level
               labels (`namespace_labels` in the Fleet Namespace resource) if they
               share a key. Keys and values must be Kubernetes-conformant.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] scope_id: The client-provided identifier of the scope.
        :param pulumi.Input[Sequence[pulumi.Input['ScopeStateArgs']]] states: State of the scope resource.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] uid: Google-generated UUID for this resource.
        :param pulumi.Input[_builtins.str] update_time: Time the Scope was updated in UTC.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if delete_time is not None:
            pulumi.set(__self__, "delete_time", delete_time)
        if effective_labels is not None:
            pulumi.set(__self__, "effective_labels", effective_labels)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_labels is not None:
            pulumi.set(__self__, "namespace_labels", namespace_labels)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if pulumi_labels is not None:
            pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if scope_id is not None:
            pulumi.set(__self__, "scope_id", scope_id)
        if states is not None:
            pulumi.set(__self__, "states", states)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time the Scope was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time the Scope was deleted in UTC.
        """
        return pulumi.get(self, "delete_time")

    @delete_time.setter
    def delete_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "delete_time", value)

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
        Labels for this Scope.

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
        The unique identifier of the scope
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="namespaceLabels")
    def namespace_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Scope-level cluster namespace labels. For the member clusters bound
        to the Scope, these labels are applied to each namespace under the
        Scope. Scope-level labels take precedence over Namespace-level
        labels (`namespace_labels` in the Fleet Namespace resource) if they
        share a key. Keys and values must be Kubernetes-conformant.
        """
        return pulumi.get(self, "namespace_labels")

    @namespace_labels.setter
    def namespace_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "namespace_labels", value)

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
    @pulumi.getter(name="scopeId")
    def scope_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The client-provided identifier of the scope.
        """
        return pulumi.get(self, "scope_id")

    @scope_id.setter
    def scope_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scope_id", value)

    @_builtins.property
    @pulumi.getter
    def states(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScopeStateArgs']]]]:
        """
        State of the scope resource.
        Structure is documented below.
        """
        return pulumi.get(self, "states")

    @states.setter
    def states(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScopeStateArgs']]]]):
        pulumi.set(self, "states", value)

    @_builtins.property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Google-generated UUID for this resource.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "uid", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time the Scope was updated in UTC.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:gkehub/scope:Scope")
class Scope(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 namespace_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 scope_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Scope represents a Scope in a Fleet.

        To get more information about Scope, see:

        * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes)
        * How-to Guides
            * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)

        ## Example Usage

        ### Gkehub Scope Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        scope = gcp.gkehub.Scope("scope",
            scope_id="my-scope",
            namespace_labels={
                "keyb": "valueb",
                "keya": "valuea",
                "keyc": "valuec",
            },
            labels={
                "keyb": "valueb",
                "keya": "valuea",
                "keyc": "valuec",
            })
        ```

        ## Import

        Scope can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/global/scopes/{{scope_id}}`

        * `{{project}}/{{scope_id}}`

        * `{{scope_id}}`

        When using the `pulumi import` command, Scope can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:gkehub/scope:Scope default projects/{{project}}/locations/global/scopes/{{scope_id}}
        ```

        ```sh
        $ pulumi import gcp:gkehub/scope:Scope default {{project}}/{{scope_id}}
        ```

        ```sh
        $ pulumi import gcp:gkehub/scope:Scope default {{scope_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for this Scope.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] namespace_labels: Scope-level cluster namespace labels. For the member clusters bound
               to the Scope, these labels are applied to each namespace under the
               Scope. Scope-level labels take precedence over Namespace-level
               labels (`namespace_labels` in the Fleet Namespace resource) if they
               share a key. Keys and values must be Kubernetes-conformant.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] scope_id: The client-provided identifier of the scope.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScopeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Scope represents a Scope in a Fleet.

        To get more information about Scope, see:

        * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes)
        * How-to Guides
            * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)

        ## Example Usage

        ### Gkehub Scope Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        scope = gcp.gkehub.Scope("scope",
            scope_id="my-scope",
            namespace_labels={
                "keyb": "valueb",
                "keya": "valuea",
                "keyc": "valuec",
            },
            labels={
                "keyb": "valueb",
                "keya": "valuea",
                "keyc": "valuec",
            })
        ```

        ## Import

        Scope can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/global/scopes/{{scope_id}}`

        * `{{project}}/{{scope_id}}`

        * `{{scope_id}}`

        When using the `pulumi import` command, Scope can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:gkehub/scope:Scope default projects/{{project}}/locations/global/scopes/{{scope_id}}
        ```

        ```sh
        $ pulumi import gcp:gkehub/scope:Scope default {{project}}/{{scope_id}}
        ```

        ```sh
        $ pulumi import gcp:gkehub/scope:Scope default {{scope_id}}
        ```

        :param str resource_name: The name of the resource.
        :param ScopeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScopeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 namespace_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 scope_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScopeArgs.__new__(ScopeArgs)

            __props__.__dict__["labels"] = labels
            __props__.__dict__["namespace_labels"] = namespace_labels
            __props__.__dict__["project"] = project
            if scope_id is None and not opts.urn:
                raise TypeError("Missing required property 'scope_id'")
            __props__.__dict__["scope_id"] = scope_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["delete_time"] = None
            __props__.__dict__["effective_labels"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["pulumi_labels"] = None
            __props__.__dict__["states"] = None
            __props__.__dict__["uid"] = None
            __props__.__dict__["update_time"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["effectiveLabels", "pulumiLabels"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Scope, __self__).__init__(
            'gcp:gkehub/scope:Scope',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            delete_time: Optional[pulumi.Input[_builtins.str]] = None,
            effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            namespace_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            scope_id: Optional[pulumi.Input[_builtins.str]] = None,
            states: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ScopeStateArgs', 'ScopeStateArgsDict']]]]] = None,
            uid: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'Scope':
        """
        Get an existing Scope resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: Time the Scope was created in UTC.
        :param pulumi.Input[_builtins.str] delete_time: Time the Scope was deleted in UTC.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Labels for this Scope.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: The unique identifier of the scope
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] namespace_labels: Scope-level cluster namespace labels. For the member clusters bound
               to the Scope, these labels are applied to each namespace under the
               Scope. Scope-level labels take precedence over Namespace-level
               labels (`namespace_labels` in the Fleet Namespace resource) if they
               share a key. Keys and values must be Kubernetes-conformant.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] scope_id: The client-provided identifier of the scope.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ScopeStateArgs', 'ScopeStateArgsDict']]]] states: State of the scope resource.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] uid: Google-generated UUID for this resource.
        :param pulumi.Input[_builtins.str] update_time: Time the Scope was updated in UTC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScopeState.__new__(_ScopeState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["delete_time"] = delete_time
        __props__.__dict__["effective_labels"] = effective_labels
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace_labels"] = namespace_labels
        __props__.__dict__["project"] = project
        __props__.__dict__["pulumi_labels"] = pulumi_labels
        __props__.__dict__["scope_id"] = scope_id
        __props__.__dict__["states"] = states
        __props__.__dict__["uid"] = uid
        __props__.__dict__["update_time"] = update_time
        return Scope(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Time the Scope was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> pulumi.Output[_builtins.str]:
        """
        Time the Scope was deleted in UTC.
        """
        return pulumi.get(self, "delete_time")

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
        Labels for this Scope.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The unique identifier of the scope
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="namespaceLabels")
    def namespace_labels(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Scope-level cluster namespace labels. For the member clusters bound
        to the Scope, these labels are applied to each namespace under the
        Scope. Scope-level labels take precedence over Namespace-level
        labels (`namespace_labels` in the Fleet Namespace resource) if they
        share a key. Keys and values must be Kubernetes-conformant.
        """
        return pulumi.get(self, "namespace_labels")

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
    @pulumi.getter(name="scopeId")
    def scope_id(self) -> pulumi.Output[_builtins.str]:
        """
        The client-provided identifier of the scope.
        """
        return pulumi.get(self, "scope_id")

    @_builtins.property
    @pulumi.getter
    def states(self) -> pulumi.Output[Sequence['outputs.ScopeState']]:
        """
        State of the scope resource.
        Structure is documented below.
        """
        return pulumi.get(self, "states")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> pulumi.Output[_builtins.str]:
        """
        Google-generated UUID for this resource.
        """
        return pulumi.get(self, "uid")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Time the Scope was updated in UTC.
        """
        return pulumi.get(self, "update_time")

