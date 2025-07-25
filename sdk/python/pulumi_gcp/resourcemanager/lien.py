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

__all__ = ['LienArgs', 'Lien']

@pulumi.input_type
class LienArgs:
    def __init__(__self__, *,
                 origin: pulumi.Input[_builtins.str],
                 parent: pulumi.Input[_builtins.str],
                 reason: pulumi.Input[_builtins.str],
                 restrictions: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        """
        The set of arguments for constructing a Lien resource.
        :param pulumi.Input[_builtins.str] origin: A stable, user-visible/meaningful string identifying the origin
               of the Lien, intended to be inspected programmatically. Maximum length of
               200 characters.
        :param pulumi.Input[_builtins.str] parent: A reference to the resource this Lien is attached to.
               The server will validate the parent against those for which Liens are supported.
               Since a variety of objects can have Liens against them, you must provide the type
               prefix (e.g. "projects/my-project-name").
        :param pulumi.Input[_builtins.str] reason: Concise user-visible strings indicating why an action cannot be performed
               on a resource. Maximum length of 200 characters.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] restrictions: The types of operations which should be blocked as a result of this Lien.
               Each value should correspond to an IAM permission. The server will validate
               the permissions against those for which Liens are supported.  An empty
               list is meaningless and will be rejected.
               e.g. ['resourcemanager.projects.delete']
        """
        pulumi.set(__self__, "origin", origin)
        pulumi.set(__self__, "parent", parent)
        pulumi.set(__self__, "reason", reason)
        pulumi.set(__self__, "restrictions", restrictions)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Input[_builtins.str]:
        """
        A stable, user-visible/meaningful string identifying the origin
        of the Lien, intended to be inspected programmatically. Maximum length of
        200 characters.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Input[_builtins.str]:
        """
        A reference to the resource this Lien is attached to.
        The server will validate the parent against those for which Liens are supported.
        Since a variety of objects can have Liens against them, you must provide the type
        prefix (e.g. "projects/my-project-name").
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter
    def reason(self) -> pulumi.Input[_builtins.str]:
        """
        Concise user-visible strings indicating why an action cannot be performed
        on a resource. Maximum length of 200 characters.
        """
        return pulumi.get(self, "reason")

    @reason.setter
    def reason(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "reason", value)

    @_builtins.property
    @pulumi.getter
    def restrictions(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        The types of operations which should be blocked as a result of this Lien.
        Each value should correspond to an IAM permission. The server will validate
        the permissions against those for which Liens are supported.  An empty
        list is meaningless and will be rejected.
        e.g. ['resourcemanager.projects.delete']
        """
        return pulumi.get(self, "restrictions")

    @restrictions.setter
    def restrictions(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "restrictions", value)


@pulumi.input_type
class _LienState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 reason: Optional[pulumi.Input[_builtins.str]] = None,
                 restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Lien resources.
        :param pulumi.Input[_builtins.str] create_time: Time of creation
        :param pulumi.Input[_builtins.str] name: A system-generated unique identifier for this Lien.
        :param pulumi.Input[_builtins.str] origin: A stable, user-visible/meaningful string identifying the origin
               of the Lien, intended to be inspected programmatically. Maximum length of
               200 characters.
        :param pulumi.Input[_builtins.str] parent: A reference to the resource this Lien is attached to.
               The server will validate the parent against those for which Liens are supported.
               Since a variety of objects can have Liens against them, you must provide the type
               prefix (e.g. "projects/my-project-name").
        :param pulumi.Input[_builtins.str] reason: Concise user-visible strings indicating why an action cannot be performed
               on a resource. Maximum length of 200 characters.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] restrictions: The types of operations which should be blocked as a result of this Lien.
               Each value should correspond to an IAM permission. The server will validate
               the permissions against those for which Liens are supported.  An empty
               list is meaningless and will be rejected.
               e.g. ['resourcemanager.projects.delete']
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if reason is not None:
            pulumi.set(__self__, "reason", reason)
        if restrictions is not None:
            pulumi.set(__self__, "restrictions", restrictions)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time of creation
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A system-generated unique identifier for this Lien.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A stable, user-visible/meaningful string identifying the origin
        of the Lien, intended to be inspected programmatically. Maximum length of
        200 characters.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A reference to the resource this Lien is attached to.
        The server will validate the parent against those for which Liens are supported.
        Since a variety of objects can have Liens against them, you must provide the type
        prefix (e.g. "projects/my-project-name").
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter
    def reason(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Concise user-visible strings indicating why an action cannot be performed
        on a resource. Maximum length of 200 characters.
        """
        return pulumi.get(self, "reason")

    @reason.setter
    def reason(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "reason", value)

    @_builtins.property
    @pulumi.getter
    def restrictions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The types of operations which should be blocked as a result of this Lien.
        Each value should correspond to an IAM permission. The server will validate
        the permissions against those for which Liens are supported.  An empty
        list is meaningless and will be rejected.
        e.g. ['resourcemanager.projects.delete']
        """
        return pulumi.get(self, "restrictions")

    @restrictions.setter
    def restrictions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "restrictions", value)


@pulumi.type_token("gcp:resourcemanager/lien:Lien")
class Lien(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 reason: Optional[pulumi.Input[_builtins.str]] = None,
                 restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        A Lien represents an encumbrance on the actions that can be performed on a resource.

        To get more information about Lien, see:

        * [API documentation](https://cloud.google.com/resource-manager/reference/rest)
        * How-to Guides
            * [Create a Lien](https://cloud.google.com/resource-manager/docs/project-liens)

        ## Example Usage

        ### Resource Manager Lien

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.Project("project",
            project_id="staging-project",
            name="A very important project!",
            deletion_policy="DELETE")
        lien = gcp.resourcemanager.Lien("lien",
            parent=project.number.apply(lambda number: f"projects/{number}"),
            restrictions=["resourcemanager.projects.delete"],
            origin="machine-readable-explanation",
            reason="This project is an important environment")
        ```

        ## Import

        Lien can be imported using any of these accepted formats:

        * `{{parent}}/{{name}}`

        When using the `pulumi import` command, Lien can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:resourcemanager/lien:Lien default {{parent}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] origin: A stable, user-visible/meaningful string identifying the origin
               of the Lien, intended to be inspected programmatically. Maximum length of
               200 characters.
        :param pulumi.Input[_builtins.str] parent: A reference to the resource this Lien is attached to.
               The server will validate the parent against those for which Liens are supported.
               Since a variety of objects can have Liens against them, you must provide the type
               prefix (e.g. "projects/my-project-name").
        :param pulumi.Input[_builtins.str] reason: Concise user-visible strings indicating why an action cannot be performed
               on a resource. Maximum length of 200 characters.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] restrictions: The types of operations which should be blocked as a result of this Lien.
               Each value should correspond to an IAM permission. The server will validate
               the permissions against those for which Liens are supported.  An empty
               list is meaningless and will be rejected.
               e.g. ['resourcemanager.projects.delete']
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LienArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Lien represents an encumbrance on the actions that can be performed on a resource.

        To get more information about Lien, see:

        * [API documentation](https://cloud.google.com/resource-manager/reference/rest)
        * How-to Guides
            * [Create a Lien](https://cloud.google.com/resource-manager/docs/project-liens)

        ## Example Usage

        ### Resource Manager Lien

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.Project("project",
            project_id="staging-project",
            name="A very important project!",
            deletion_policy="DELETE")
        lien = gcp.resourcemanager.Lien("lien",
            parent=project.number.apply(lambda number: f"projects/{number}"),
            restrictions=["resourcemanager.projects.delete"],
            origin="machine-readable-explanation",
            reason="This project is an important environment")
        ```

        ## Import

        Lien can be imported using any of these accepted formats:

        * `{{parent}}/{{name}}`

        When using the `pulumi import` command, Lien can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:resourcemanager/lien:Lien default {{parent}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param LienArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LienArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 reason: Optional[pulumi.Input[_builtins.str]] = None,
                 restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LienArgs.__new__(LienArgs)

            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            if parent is None and not opts.urn:
                raise TypeError("Missing required property 'parent'")
            __props__.__dict__["parent"] = parent
            if reason is None and not opts.urn:
                raise TypeError("Missing required property 'reason'")
            __props__.__dict__["reason"] = reason
            if restrictions is None and not opts.urn:
                raise TypeError("Missing required property 'restrictions'")
            __props__.__dict__["restrictions"] = restrictions
            __props__.__dict__["create_time"] = None
            __props__.__dict__["name"] = None
        super(Lien, __self__).__init__(
            'gcp:resourcemanager/lien:Lien',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            origin: Optional[pulumi.Input[_builtins.str]] = None,
            parent: Optional[pulumi.Input[_builtins.str]] = None,
            reason: Optional[pulumi.Input[_builtins.str]] = None,
            restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'Lien':
        """
        Get an existing Lien resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: Time of creation
        :param pulumi.Input[_builtins.str] name: A system-generated unique identifier for this Lien.
        :param pulumi.Input[_builtins.str] origin: A stable, user-visible/meaningful string identifying the origin
               of the Lien, intended to be inspected programmatically. Maximum length of
               200 characters.
        :param pulumi.Input[_builtins.str] parent: A reference to the resource this Lien is attached to.
               The server will validate the parent against those for which Liens are supported.
               Since a variety of objects can have Liens against them, you must provide the type
               prefix (e.g. "projects/my-project-name").
        :param pulumi.Input[_builtins.str] reason: Concise user-visible strings indicating why an action cannot be performed
               on a resource. Maximum length of 200 characters.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] restrictions: The types of operations which should be blocked as a result of this Lien.
               Each value should correspond to an IAM permission. The server will validate
               the permissions against those for which Liens are supported.  An empty
               list is meaningless and will be rejected.
               e.g. ['resourcemanager.projects.delete']
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LienState.__new__(_LienState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["name"] = name
        __props__.__dict__["origin"] = origin
        __props__.__dict__["parent"] = parent
        __props__.__dict__["reason"] = reason
        __props__.__dict__["restrictions"] = restrictions
        return Lien(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Time of creation
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        A system-generated unique identifier for this Lien.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Output[_builtins.str]:
        """
        A stable, user-visible/meaningful string identifying the origin
        of the Lien, intended to be inspected programmatically. Maximum length of
        200 characters.
        """
        return pulumi.get(self, "origin")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Output[_builtins.str]:
        """
        A reference to the resource this Lien is attached to.
        The server will validate the parent against those for which Liens are supported.
        Since a variety of objects can have Liens against them, you must provide the type
        prefix (e.g. "projects/my-project-name").
        """
        return pulumi.get(self, "parent")

    @_builtins.property
    @pulumi.getter
    def reason(self) -> pulumi.Output[_builtins.str]:
        """
        Concise user-visible strings indicating why an action cannot be performed
        on a resource. Maximum length of 200 characters.
        """
        return pulumi.get(self, "reason")

    @_builtins.property
    @pulumi.getter
    def restrictions(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The types of operations which should be blocked as a result of this Lien.
        Each value should correspond to an IAM permission. The server will validate
        the permissions against those for which Liens are supported.  An empty
        list is meaningless and will be rejected.
        e.g. ['resourcemanager.projects.delete']
        """
        return pulumi.get(self, "restrictions")

