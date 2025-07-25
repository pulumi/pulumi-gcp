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

__all__ = ['AiFeatureOnlineStoreFeatureviewIamMemberArgs', 'AiFeatureOnlineStoreFeatureviewIamMember']

@pulumi.input_type
class AiFeatureOnlineStoreFeatureviewIamMemberArgs:
    def __init__(__self__, *,
                 feature_online_store: pulumi.Input[_builtins.str],
                 feature_view: pulumi.Input[_builtins.str],
                 member: pulumi.Input[_builtins.str],
                 role: pulumi.Input[_builtins.str],
                 condition: Optional[pulumi.Input['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a AiFeatureOnlineStoreFeatureviewIamMember resource.
        :param pulumi.Input[_builtins.str] feature_online_store: The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] feature_view: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        """
        pulumi.set(__self__, "feature_online_store", feature_online_store)
        pulumi.set(__self__, "feature_view", feature_view)
        pulumi.set(__self__, "member", member)
        pulumi.set(__self__, "role", role)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter(name="featureOnlineStore")
    def feature_online_store(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "feature_online_store")

    @feature_online_store.setter
    def feature_online_store(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "feature_online_store", value)

    @_builtins.property
    @pulumi.getter(name="featureView")
    def feature_view(self) -> pulumi.Input[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "feature_view")

    @feature_view.setter
    def feature_view(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "feature_view", value)

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Input[_builtins.str]:
        """
        Identities that will be granted the privilege in `role`.
        Each entry can have one of the following values:
        * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Input[_builtins.str]:
        """
        The role that should be applied. Only one
        `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
        `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role", value)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs']]:
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs']]):
        pulumi.set(self, "condition", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
        the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        region is specified, it is taken from the provider configuration.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _AiFeatureOnlineStoreFeatureviewIamMemberState:
    def __init__(__self__, *,
                 condition: Optional[pulumi.Input['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs']] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_online_store: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_view: Optional[pulumi.Input[_builtins.str]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AiFeatureOnlineStoreFeatureviewIamMember resources.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] feature_online_store: The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] feature_view: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if feature_online_store is not None:
            pulumi.set(__self__, "feature_online_store", feature_online_store)
        if feature_view is not None:
            pulumi.set(__self__, "feature_view", feature_view)
        if member is not None:
            pulumi.set(__self__, "member", member)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs']]:
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs']]):
        pulumi.set(self, "condition", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter(name="featureOnlineStore")
    def feature_online_store(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "feature_online_store")

    @feature_online_store.setter
    def feature_online_store(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "feature_online_store", value)

    @_builtins.property
    @pulumi.getter(name="featureView")
    def feature_view(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "feature_view")

    @feature_view.setter
    def feature_view(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "feature_view", value)

    @_builtins.property
    @pulumi.getter
    def member(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identities that will be granted the privilege in `role`.
        Each entry can have one of the following values:
        * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        """
        return pulumi.get(self, "member")

    @member.setter
    def member(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "member", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
        the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        region is specified, it is taken from the provider configuration.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The role that should be applied. Only one
        `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
        `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role", value)


@pulumi.type_token("gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember")
class AiFeatureOnlineStoreFeatureviewIamMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[Union['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs', 'AiFeatureOnlineStoreFeatureviewIamMemberConditionArgsDict']]] = None,
                 feature_online_store: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_view: Optional[pulumi.Input[_builtins.str]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * {{feature_online_store}}/featureViews/{{name}}

        * {{feature_online_store}}/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor "{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor "{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] feature_online_store: The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] feature_view: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AiFeatureOnlineStoreFeatureviewIamMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * {{feature_online_store}}/featureViews/{{name}}

        * {{feature_online_store}}/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor "{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor "{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param AiFeatureOnlineStoreFeatureviewIamMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AiFeatureOnlineStoreFeatureviewIamMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[Union['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs', 'AiFeatureOnlineStoreFeatureviewIamMemberConditionArgsDict']]] = None,
                 feature_online_store: Optional[pulumi.Input[_builtins.str]] = None,
                 feature_view: Optional[pulumi.Input[_builtins.str]] = None,
                 member: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 role: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AiFeatureOnlineStoreFeatureviewIamMemberArgs.__new__(AiFeatureOnlineStoreFeatureviewIamMemberArgs)

            __props__.__dict__["condition"] = condition
            if feature_online_store is None and not opts.urn:
                raise TypeError("Missing required property 'feature_online_store'")
            __props__.__dict__["feature_online_store"] = feature_online_store
            if feature_view is None and not opts.urn:
                raise TypeError("Missing required property 'feature_view'")
            __props__.__dict__["feature_view"] = feature_view
            if member is None and not opts.urn:
                raise TypeError("Missing required property 'member'")
            __props__.__dict__["member"] = member
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            __props__.__dict__["etag"] = None
        super(AiFeatureOnlineStoreFeatureviewIamMember, __self__).__init__(
            'gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            condition: Optional[pulumi.Input[Union['AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs', 'AiFeatureOnlineStoreFeatureviewIamMemberConditionArgsDict']]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            feature_online_store: Optional[pulumi.Input[_builtins.str]] = None,
            feature_view: Optional[pulumi.Input[_builtins.str]] = None,
            member: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None,
            role: Optional[pulumi.Input[_builtins.str]] = None) -> 'AiFeatureOnlineStoreFeatureviewIamMember':
        """
        Get an existing AiFeatureOnlineStoreFeatureviewIamMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] feature_online_store: The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] feature_view: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] member: Identities that will be granted the privilege in `role`.
               Each entry can have one of the following values:
               * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
               * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
               * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
               * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
               * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
               * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
               * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
               * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
               * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
               the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
               region is specified, it is taken from the provider configuration.
        :param pulumi.Input[_builtins.str] role: The role that should be applied. Only one
               `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
               `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AiFeatureOnlineStoreFeatureviewIamMemberState.__new__(_AiFeatureOnlineStoreFeatureviewIamMemberState)

        __props__.__dict__["condition"] = condition
        __props__.__dict__["etag"] = etag
        __props__.__dict__["feature_online_store"] = feature_online_store
        __props__.__dict__["feature_view"] = feature_view
        __props__.__dict__["member"] = member
        __props__.__dict__["project"] = project
        __props__.__dict__["region"] = region
        __props__.__dict__["role"] = role
        return AiFeatureOnlineStoreFeatureviewIamMember(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def condition(self) -> pulumi.Output[Optional['outputs.AiFeatureOnlineStoreFeatureviewIamMemberCondition']]:
        return pulumi.get(self, "condition")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter(name="featureOnlineStore")
    def feature_online_store(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the FeatureOnlineStore to use for the featureview. Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "feature_online_store")

    @_builtins.property
    @pulumi.getter(name="featureView")
    def feature_view(self) -> pulumi.Output[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "feature_view")

    @_builtins.property
    @pulumi.getter
    def member(self) -> pulumi.Output[_builtins.str]:
        """
        Identities that will be granted the privilege in `role`.
        Each entry can have one of the following values:
        * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        """
        return pulumi.get(self, "member")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[_builtins.str]:
        """
        The region for the resource. It should be the same as the featureonlinestore region. Used to find the parent resource to bind the IAM policy to. If not specified,
        the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        region is specified, it is taken from the provider configuration.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter
    def role(self) -> pulumi.Output[_builtins.str]:
        """
        The role that should be applied. Only one
        `vertex.AiFeatureOnlineStoreFeatureviewIamBinding` can be used per role. Note that custom roles must be of the format
        `[projects|organizations]/{parent-name}/roles/{role-name}`.
        """
        return pulumi.get(self, "role")

