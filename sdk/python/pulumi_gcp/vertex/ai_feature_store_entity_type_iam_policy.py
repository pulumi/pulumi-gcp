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

__all__ = ['AiFeatureStoreEntityTypeIamPolicyArgs', 'AiFeatureStoreEntityTypeIamPolicy']

@pulumi.input_type
class AiFeatureStoreEntityTypeIamPolicyArgs:
    def __init__(__self__, *,
                 entitytype: pulumi.Input[_builtins.str],
                 featurestore: pulumi.Input[_builtins.str],
                 policy_data: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a AiFeatureStoreEntityTypeIamPolicy resource.
        :param pulumi.Input[_builtins.str] entitytype: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] featurestore: The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        """
        pulumi.set(__self__, "entitytype", entitytype)
        pulumi.set(__self__, "featurestore", featurestore)
        pulumi.set(__self__, "policy_data", policy_data)

    @_builtins.property
    @pulumi.getter
    def entitytype(self) -> pulumi.Input[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "entitytype")

    @entitytype.setter
    def entitytype(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "entitytype", value)

    @_builtins.property
    @pulumi.getter
    def featurestore(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "featurestore")

    @featurestore.setter
    def featurestore(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "featurestore", value)

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> pulumi.Input[_builtins.str]:
        """
        The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @policy_data.setter
    def policy_data(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy_data", value)


@pulumi.input_type
class _AiFeatureStoreEntityTypeIamPolicyState:
    def __init__(__self__, *,
                 entitytype: Optional[pulumi.Input[_builtins.str]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 featurestore: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AiFeatureStoreEntityTypeIamPolicy resources.
        :param pulumi.Input[_builtins.str] entitytype: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] featurestore: The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        """
        if entitytype is not None:
            pulumi.set(__self__, "entitytype", entitytype)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if featurestore is not None:
            pulumi.set(__self__, "featurestore", featurestore)
        if policy_data is not None:
            pulumi.set(__self__, "policy_data", policy_data)

    @_builtins.property
    @pulumi.getter
    def entitytype(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "entitytype")

    @entitytype.setter
    def entitytype(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "entitytype", value)

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
    @pulumi.getter
    def featurestore(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "featurestore")

    @featurestore.setter
    def featurestore(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "featurestore", value)

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @policy_data.setter
    def policy_data(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_data", value)


@pulumi.type_token("gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy")
class AiFeatureStoreEntityTypeIamPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 entitytype: Optional[pulumi.Input[_builtins.str]] = None,
                 featurestore: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * {{featurestore}}/entityTypes/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor "{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor "{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] entitytype: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] featurestore: The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AiFeatureStoreEntityTypeIamPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        For all import syntaxes, the "resource in question" can take any of the following forms:

        * {{featurestore}}/entityTypes/{{name}}

        * {{name}}

        Any variables not passed in the import command will be taken from the provider configuration.

        Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.

        IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor "{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane@example.com"
        ```

        IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor "{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer"
        ```

        IAM policy imports use the identifier of the resource in question, e.g.

        ```sh
        $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
        ```

        -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the

         full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.

        :param str resource_name: The name of the resource.
        :param AiFeatureStoreEntityTypeIamPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AiFeatureStoreEntityTypeIamPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 entitytype: Optional[pulumi.Input[_builtins.str]] = None,
                 featurestore: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_data: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AiFeatureStoreEntityTypeIamPolicyArgs.__new__(AiFeatureStoreEntityTypeIamPolicyArgs)

            if entitytype is None and not opts.urn:
                raise TypeError("Missing required property 'entitytype'")
            __props__.__dict__["entitytype"] = entitytype
            if featurestore is None and not opts.urn:
                raise TypeError("Missing required property 'featurestore'")
            __props__.__dict__["featurestore"] = featurestore
            if policy_data is None and not opts.urn:
                raise TypeError("Missing required property 'policy_data'")
            __props__.__dict__["policy_data"] = policy_data
            __props__.__dict__["etag"] = None
        super(AiFeatureStoreEntityTypeIamPolicy, __self__).__init__(
            'gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            entitytype: Optional[pulumi.Input[_builtins.str]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            featurestore: Optional[pulumi.Input[_builtins.str]] = None,
            policy_data: Optional[pulumi.Input[_builtins.str]] = None) -> 'AiFeatureStoreEntityTypeIamPolicy':
        """
        Get an existing AiFeatureStoreEntityTypeIamPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] entitytype: Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] etag: (Computed) The etag of the IAM policy.
        :param pulumi.Input[_builtins.str] featurestore: The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        :param pulumi.Input[_builtins.str] policy_data: The policy data generated by
               a `organizations_get_iam_policy` data source.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AiFeatureStoreEntityTypeIamPolicyState.__new__(_AiFeatureStoreEntityTypeIamPolicyState)

        __props__.__dict__["entitytype"] = entitytype
        __props__.__dict__["etag"] = etag
        __props__.__dict__["featurestore"] = featurestore
        __props__.__dict__["policy_data"] = policy_data
        return AiFeatureStoreEntityTypeIamPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def entitytype(self) -> pulumi.Output[_builtins.str]:
        """
        Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "entitytype")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def featurestore(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
        """
        return pulumi.get(self, "featurestore")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> pulumi.Output[_builtins.str]:
        """
        The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

