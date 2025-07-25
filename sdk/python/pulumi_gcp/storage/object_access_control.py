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

__all__ = ['ObjectAccessControlArgs', 'ObjectAccessControl']

@pulumi.input_type
class ObjectAccessControlArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[_builtins.str],
                 entity: pulumi.Input[_builtins.str],
                 object: pulumi.Input[_builtins.str],
                 role: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ObjectAccessControl resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] entity: The entity holding the permission, in one of the following forms:
               * user-{{userId}}
               * user-{{email}} (such as "user-liz@example.com")
               * group-{{groupId}}
               * group-{{email}} (such as "group-example@googlegroups.com")
               * domain-{{domain}} (such as "domain-example.com")
               * project-team-{{projectId}}
               * allUsers
               * allAuthenticatedUsers
        :param pulumi.Input[_builtins.str] object: The name of the object to apply the access control to.
        :param pulumi.Input[_builtins.str] role: The access permission for the entity.
               Possible values are: `OWNER`, `READER`.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "entity", entity)
        pulumi.set(__self__, "object", object)
        pulumi.set(__self__, "role", role)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def entity(self) -> pulumi.Input[_builtins.str]:
        """
        The entity holding the permission, in one of the following forms:
        * user-{{userId}}
        * user-{{email}} (such as "user-liz@example.com")
        * group-{{groupId}}
        * group-{{email}} (such as "group-example@googlegroups.com")
        * domain-{{domain}} (such as "domain-example.com")
        * project-team-{{projectId}}
        * allUsers
        * allAuthenticatedUsers
        """
        return pulumi.get(self, "entity")

    @entity.setter
    def entity(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "entity", value)

    @_builtins.property
    @pulumi.getter
    def object(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the object to apply the access control to.
        """
        return pulumi.get(self, "object")

    @object.setter
    def object(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "object", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Input[_builtins.str]:
        """
        The access permission for the entity.
        Possible values are: `OWNER`, `READER`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role", value)


@pulumi.input_type
class _ObjectAccessControlState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 domain: Optional[pulumi.Input[_builtins.str]] = None,
                 email: Optional[pulumi.Input[_builtins.str]] = None,
                 entity: Optional[pulumi.Input[_builtins.str]] = None,
                 entity_id: Optional[pulumi.Input[_builtins.str]] = None,
                 generation: Optional[pulumi.Input[_builtins.int]] = None,
                 object: Optional[pulumi.Input[_builtins.str]] = None,
                 project_teams: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectAccessControlProjectTeamArgs']]]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ObjectAccessControl resources.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] domain: The domain associated with the entity.
        :param pulumi.Input[_builtins.str] email: The email address associated with the entity.
        :param pulumi.Input[_builtins.str] entity: The entity holding the permission, in one of the following forms:
               * user-{{userId}}
               * user-{{email}} (such as "user-liz@example.com")
               * group-{{groupId}}
               * group-{{email}} (such as "group-example@googlegroups.com")
               * domain-{{domain}} (such as "domain-example.com")
               * project-team-{{projectId}}
               * allUsers
               * allAuthenticatedUsers
        :param pulumi.Input[_builtins.str] entity_id: The ID for the entity
        :param pulumi.Input[_builtins.int] generation: The content generation of the object, if applied to an object.
        :param pulumi.Input[_builtins.str] object: The name of the object to apply the access control to.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectAccessControlProjectTeamArgs']]] project_teams: The project team associated with the entity
               Structure is documented below.
        :param pulumi.Input[_builtins.str] role: The access permission for the entity.
               Possible values are: `OWNER`, `READER`.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if entity is not None:
            pulumi.set(__self__, "entity", entity)
        if entity_id is not None:
            pulumi.set(__self__, "entity_id", entity_id)
        if generation is not None:
            pulumi.set(__self__, "generation", generation)
        if object is not None:
            pulumi.set(__self__, "object", object)
        if project_teams is not None:
            pulumi.set(__self__, "project_teams", project_teams)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The domain associated with the entity.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "domain", value)

    @_builtins.property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The email address associated with the entity.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email", value)

    @_builtins.property
    @pulumi.getter
    def entity(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The entity holding the permission, in one of the following forms:
        * user-{{userId}}
        * user-{{email}} (such as "user-liz@example.com")
        * group-{{groupId}}
        * group-{{email}} (such as "group-example@googlegroups.com")
        * domain-{{domain}} (such as "domain-example.com")
        * project-team-{{projectId}}
        * allUsers
        * allAuthenticatedUsers
        """
        return pulumi.get(self, "entity")

    @entity.setter
    def entity(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entity", value)

    @_builtins.property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID for the entity
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entity_id", value)

    @_builtins.property
    @pulumi.getter
    def generation(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The content generation of the object, if applied to an object.
        """
        return pulumi.get(self, "generation")

    @generation.setter
    def generation(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "generation", value)

    @_builtins.property
    @pulumi.getter
    def object(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the object to apply the access control to.
        """
        return pulumi.get(self, "object")

    @object.setter
    def object(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "object", value)

    @_builtins.property
    @pulumi.getter(name="projectTeams")
    def project_teams(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectAccessControlProjectTeamArgs']]]]:
        """
        The project team associated with the entity
        Structure is documented below.
        """
        return pulumi.get(self, "project_teams")

    @project_teams.setter
    def project_teams(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectAccessControlProjectTeamArgs']]]]):
        pulumi.set(self, "project_teams", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The access permission for the entity.
        Possible values are: `OWNER`, `READER`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role", value)


@pulumi.type_token("gcp:storage/objectAccessControl:ObjectAccessControl")
class ObjectAccessControl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 entity: Optional[pulumi.Input[_builtins.str]] = None,
                 object: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        The ObjectAccessControls resources represent the Access Control Lists
        (ACLs) for objects within Google Cloud Storage. ACLs let you specify
        who has access to your data and to what extent.

        There are two roles that can be assigned to an entity:

        READERs can get an object, though the acl property will not be revealed.
        OWNERs are READERs, and they can get the acl property, update an object,
        and call all objectAccessControls methods on the object. The owner of an
        object is always an OWNER.
        For more information, see Access Control, with the caveat that this API
        uses READER and OWNER instead of READ and FULL_CONTROL.

        To get more information about ObjectAccessControl, see:

        * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)

        ## Example Usage

        ### Storage Object Access Control Public Object

        ```python
        import pulumi
        import pulumi_gcp as gcp

        bucket = gcp.storage.Bucket("bucket",
            name="static-content-bucket",
            location="US")
        object = gcp.storage.BucketObject("object",
            name="public-object",
            bucket=bucket.name,
            source=pulumi.FileAsset("../static/img/header-logo.png"))
        public_rule = gcp.storage.ObjectAccessControl("public_rule",
            object=object.output_name,
            bucket=bucket.name,
            role="READER",
            entity="allUsers")
        ```

        ## Import

        ObjectAccessControl can be imported using any of these accepted formats:

        * `{{bucket}}/{{object}}/{{entity}}`

        When using the `pulumi import` command, ObjectAccessControl can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:storage/objectAccessControl:ObjectAccessControl default {{bucket}}/{{object}}/{{entity}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] entity: The entity holding the permission, in one of the following forms:
               * user-{{userId}}
               * user-{{email}} (such as "user-liz@example.com")
               * group-{{groupId}}
               * group-{{email}} (such as "group-example@googlegroups.com")
               * domain-{{domain}} (such as "domain-example.com")
               * project-team-{{projectId}}
               * allUsers
               * allAuthenticatedUsers
        :param pulumi.Input[_builtins.str] object: The name of the object to apply the access control to.
        :param pulumi.Input[_builtins.str] role: The access permission for the entity.
               Possible values are: `OWNER`, `READER`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ObjectAccessControlArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The ObjectAccessControls resources represent the Access Control Lists
        (ACLs) for objects within Google Cloud Storage. ACLs let you specify
        who has access to your data and to what extent.

        There are two roles that can be assigned to an entity:

        READERs can get an object, though the acl property will not be revealed.
        OWNERs are READERs, and they can get the acl property, update an object,
        and call all objectAccessControls methods on the object. The owner of an
        object is always an OWNER.
        For more information, see Access Control, with the caveat that this API
        uses READER and OWNER instead of READ and FULL_CONTROL.

        To get more information about ObjectAccessControl, see:

        * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)

        ## Example Usage

        ### Storage Object Access Control Public Object

        ```python
        import pulumi
        import pulumi_gcp as gcp

        bucket = gcp.storage.Bucket("bucket",
            name="static-content-bucket",
            location="US")
        object = gcp.storage.BucketObject("object",
            name="public-object",
            bucket=bucket.name,
            source=pulumi.FileAsset("../static/img/header-logo.png"))
        public_rule = gcp.storage.ObjectAccessControl("public_rule",
            object=object.output_name,
            bucket=bucket.name,
            role="READER",
            entity="allUsers")
        ```

        ## Import

        ObjectAccessControl can be imported using any of these accepted formats:

        * `{{bucket}}/{{object}}/{{entity}}`

        When using the `pulumi import` command, ObjectAccessControl can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:storage/objectAccessControl:ObjectAccessControl default {{bucket}}/{{object}}/{{entity}}
        ```

        :param str resource_name: The name of the resource.
        :param ObjectAccessControlArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ObjectAccessControlArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 entity: Optional[pulumi.Input[_builtins.str]] = None,
                 object: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ObjectAccessControlArgs.__new__(ObjectAccessControlArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            if entity is None and not opts.urn:
                raise TypeError("Missing required property 'entity'")
            __props__.__dict__["entity"] = entity
            if object is None and not opts.urn:
                raise TypeError("Missing required property 'object'")
            __props__.__dict__["object"] = object
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            __props__.__dict__["domain"] = None
            __props__.__dict__["email"] = None
            __props__.__dict__["entity_id"] = None
            __props__.__dict__["generation"] = None
            __props__.__dict__["project_teams"] = None
        super(ObjectAccessControl, __self__).__init__(
            'gcp:storage/objectAccessControl:ObjectAccessControl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[_builtins.str]] = None,
            domain: Optional[pulumi.Input[_builtins.str]] = None,
            email: Optional[pulumi.Input[_builtins.str]] = None,
            entity: Optional[pulumi.Input[_builtins.str]] = None,
            entity_id: Optional[pulumi.Input[_builtins.str]] = None,
            generation: Optional[pulumi.Input[_builtins.int]] = None,
            object: Optional[pulumi.Input[_builtins.str]] = None,
            project_teams: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ObjectAccessControlProjectTeamArgs', 'ObjectAccessControlProjectTeamArgsDict']]]]] = None,
            role: Optional[pulumi.Input[_builtins.str]] = None) -> 'ObjectAccessControl':
        """
        Get an existing ObjectAccessControl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The name of the bucket.
        :param pulumi.Input[_builtins.str] domain: The domain associated with the entity.
        :param pulumi.Input[_builtins.str] email: The email address associated with the entity.
        :param pulumi.Input[_builtins.str] entity: The entity holding the permission, in one of the following forms:
               * user-{{userId}}
               * user-{{email}} (such as "user-liz@example.com")
               * group-{{groupId}}
               * group-{{email}} (such as "group-example@googlegroups.com")
               * domain-{{domain}} (such as "domain-example.com")
               * project-team-{{projectId}}
               * allUsers
               * allAuthenticatedUsers
        :param pulumi.Input[_builtins.str] entity_id: The ID for the entity
        :param pulumi.Input[_builtins.int] generation: The content generation of the object, if applied to an object.
        :param pulumi.Input[_builtins.str] object: The name of the object to apply the access control to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ObjectAccessControlProjectTeamArgs', 'ObjectAccessControlProjectTeamArgsDict']]]] project_teams: The project team associated with the entity
               Structure is documented below.
        :param pulumi.Input[_builtins.str] role: The access permission for the entity.
               Possible values are: `OWNER`, `READER`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ObjectAccessControlState.__new__(_ObjectAccessControlState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["domain"] = domain
        __props__.__dict__["email"] = email
        __props__.__dict__["entity"] = entity
        __props__.__dict__["entity_id"] = entity_id
        __props__.__dict__["generation"] = generation
        __props__.__dict__["object"] = object
        __props__.__dict__["project_teams"] = project_teams
        __props__.__dict__["role"] = role
        return ObjectAccessControl(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter
    def domain(self) -> pulumi.Output[_builtins.str]:
        """
        The domain associated with the entity.
        """
        return pulumi.get(self, "domain")

    @_builtins.property
    @pulumi.getter
    def email(self) -> pulumi.Output[_builtins.str]:
        """
        The email address associated with the entity.
        """
        return pulumi.get(self, "email")

    @_builtins.property
    @pulumi.getter
    def entity(self) -> pulumi.Output[_builtins.str]:
        """
        The entity holding the permission, in one of the following forms:
        * user-{{userId}}
        * user-{{email}} (such as "user-liz@example.com")
        * group-{{groupId}}
        * group-{{email}} (such as "group-example@googlegroups.com")
        * domain-{{domain}} (such as "domain-example.com")
        * project-team-{{projectId}}
        * allUsers
        * allAuthenticatedUsers
        """
        return pulumi.get(self, "entity")

    @_builtins.property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID for the entity
        """
        return pulumi.get(self, "entity_id")

    @_builtins.property
    @pulumi.getter
    def generation(self) -> pulumi.Output[_builtins.int]:
        """
        The content generation of the object, if applied to an object.
        """
        return pulumi.get(self, "generation")

    @_builtins.property
    @pulumi.getter
    def object(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the object to apply the access control to.
        """
        return pulumi.get(self, "object")

    @_builtins.property
    @pulumi.getter(name="projectTeams")
    def project_teams(self) -> pulumi.Output[Sequence['outputs.ObjectAccessControlProjectTeam']]:
        """
        The project team associated with the entity
        Structure is documented below.
        """
        return pulumi.get(self, "project_teams")

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Output[_builtins.str]:
        """
        The access permission for the entity.
        Possible values are: `OWNER`, `READER`.
        """
        return pulumi.get(self, "role")

