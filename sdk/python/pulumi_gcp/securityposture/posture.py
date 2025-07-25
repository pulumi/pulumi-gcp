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

__all__ = ['PostureArgs', 'Posture']

@pulumi.input_type
class PostureArgs:
    def __init__(__self__, *,
                 location: pulumi.Input[_builtins.str],
                 parent: pulumi.Input[_builtins.str],
                 policy_sets: pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]],
                 posture_id: pulumi.Input[_builtins.str],
                 state: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Posture resource.
        :param pulumi.Input[_builtins.str] location: Location of the resource, eg: global.
        :param pulumi.Input[_builtins.str] parent: The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        :param pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]] policy_sets: List of policy sets for the posture.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] posture_id: Id of the posture. It is an immutable field.
        :param pulumi.Input[_builtins.str] state: State of the posture. Update to state field should not be triggered along with
               with other field updates.
               Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        :param pulumi.Input[_builtins.str] description: Description of the posture.
        """
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "parent", parent)
        pulumi.set(__self__, "policy_sets", policy_sets)
        pulumi.set(__self__, "posture_id", posture_id)
        pulumi.set(__self__, "state", state)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        Location of the resource, eg: global.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Input[_builtins.str]:
        """
        The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter(name="policySets")
    def policy_sets(self) -> pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]]:
        """
        List of policy sets for the posture.
        Structure is documented below.
        """
        return pulumi.get(self, "policy_sets")

    @policy_sets.setter
    def policy_sets(self, value: pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]]):
        pulumi.set(self, "policy_sets", value)

    @_builtins.property
    @pulumi.getter(name="postureId")
    def posture_id(self) -> pulumi.Input[_builtins.str]:
        """
        Id of the posture. It is an immutable field.
        """
        return pulumi.get(self, "posture_id")

    @posture_id.setter
    def posture_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "posture_id", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Input[_builtins.str]:
        """
        State of the posture. Update to state field should not be triggered along with
        with other field updates.
        Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the posture.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _PostureState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_sets: Optional[pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]]] = None,
                 posture_id: Optional[pulumi.Input[_builtins.str]] = None,
                 reconciling: Optional[pulumi.Input[_builtins.bool]] = None,
                 revision_id: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Posture resources.
        :param pulumi.Input[_builtins.str] create_time: Time the Posture was created in UTC.
        :param pulumi.Input[_builtins.str] description: Description of the posture.
        :param pulumi.Input[_builtins.str] etag: For Resource freshness validation (https://google.aip.dev/154)
        :param pulumi.Input[_builtins.str] location: Location of the resource, eg: global.
        :param pulumi.Input[_builtins.str] name: Name of the posture.
        :param pulumi.Input[_builtins.str] parent: The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        :param pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]] policy_sets: List of policy sets for the posture.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] posture_id: Id of the posture. It is an immutable field.
        :param pulumi.Input[_builtins.bool] reconciling: If set, there are currently changes in flight to the posture.
        :param pulumi.Input[_builtins.str] revision_id: Revision_id of the posture.
        :param pulumi.Input[_builtins.str] state: State of the posture. Update to state field should not be triggered along with
               with other field updates.
               Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        :param pulumi.Input[_builtins.str] update_time: Time the Posture was updated in UTC.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if policy_sets is not None:
            pulumi.set(__self__, "policy_sets", policy_sets)
        if posture_id is not None:
            pulumi.set(__self__, "posture_id", posture_id)
        if reconciling is not None:
            pulumi.set(__self__, "reconciling", reconciling)
        if revision_id is not None:
            pulumi.set(__self__, "revision_id", revision_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time the Posture was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the posture.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        For Resource freshness validation (https://google.aip.dev/154)
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Location of the resource, eg: global.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the posture.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter(name="policySets")
    def policy_sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]]]:
        """
        List of policy sets for the posture.
        Structure is documented below.
        """
        return pulumi.get(self, "policy_sets")

    @policy_sets.setter
    def policy_sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PosturePolicySetArgs']]]]):
        pulumi.set(self, "policy_sets", value)

    @_builtins.property
    @pulumi.getter(name="postureId")
    def posture_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Id of the posture. It is an immutable field.
        """
        return pulumi.get(self, "posture_id")

    @posture_id.setter
    def posture_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "posture_id", value)

    @_builtins.property
    @pulumi.getter
    def reconciling(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If set, there are currently changes in flight to the posture.
        """
        return pulumi.get(self, "reconciling")

    @reconciling.setter
    def reconciling(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "reconciling", value)

    @_builtins.property
    @pulumi.getter(name="revisionId")
    def revision_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Revision_id of the posture.
        """
        return pulumi.get(self, "revision_id")

    @revision_id.setter
    def revision_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "revision_id", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        State of the posture. Update to state field should not be triggered along with
        with other field updates.
        Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Time the Posture was updated in UTC.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:securityposture/posture:Posture")
class Posture(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PosturePolicySetArgs', 'PosturePolicySetArgsDict']]]]] = None,
                 posture_id: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A Posture represents a collection of policy set including its name, state, description
        and policy sets. A policy set includes set of policies along with their definition.
        A posture can be created at the organization level.
        Every update to a deployed posture creates a new posture revision with an updated revision_id.

        To get more information about Posture, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/securityposture/rest/v1/Posture)
        * How-to Guides
            * [Create and deploy a posture](https://cloud.google.com/security-command-center/docs/how-to-use-security-posture)

        ## Example Usage

        ### Securityposture Posture Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        posture1 = gcp.securityposture.Posture("posture1",
            posture_id="posture_example",
            parent="organizations/123456789",
            location="global",
            state="ACTIVE",
            description="a new posture",
            policy_sets=[
                {
                    "policy_set_id": "org_policy_set",
                    "description": "set of org policies",
                    "policies": [
                        {
                            "policy_id": "canned_org_policy",
                            "constraint": {
                                "org_policy_constraint": {
                                    "canned_constraint_id": "storage.uniformBucketLevelAccess",
                                    "policy_rules": [{
                                        "enforce": True,
                                        "condition": {
                                            "description": "condition description",
                                            "expression": "resource.matchTag('org_id/tag_key_short_name,'tag_value_short_name')",
                                            "title": "a CEL condition",
                                        },
                                    }],
                                },
                            },
                        },
                        {
                            "policy_id": "custom_org_policy",
                            "constraint": {
                                "org_policy_constraint_custom": {
                                    "custom_constraint": {
                                        "name": "organizations/123456789/customConstraints/custom.disableGkeAutoUpgrade",
                                        "display_name": "Disable GKE auto upgrade",
                                        "description": "Only allow GKE NodePool resource to be created or updated if AutoUpgrade is not enabled where this custom constraint is enforced.",
                                        "action_type": "ALLOW",
                                        "condition": "resource.management.autoUpgrade == false",
                                        "method_types": [
                                            "CREATE",
                                            "UPDATE",
                                        ],
                                        "resource_types": ["container.googleapis.com/NodePool"],
                                    },
                                    "policy_rules": [{
                                        "enforce": True,
                                        "condition": {
                                            "description": "condition description",
                                            "expression": "resource.matchTagId('tagKeys/key_id','tagValues/value_id')",
                                            "title": "a CEL condition",
                                        },
                                    }],
                                },
                            },
                        },
                    ],
                },
                {
                    "policy_set_id": "sha_policy_set",
                    "description": "set of sha policies",
                    "policies": [
                        {
                            "policy_id": "sha_builtin_module",
                            "constraint": {
                                "security_health_analytics_module": {
                                    "module_name": "BIGQUERY_TABLE_CMEK_DISABLED",
                                    "module_enablement_state": "ENABLED",
                                },
                            },
                            "description": "enable BIGQUERY_TABLE_CMEK_DISABLED",
                        },
                        {
                            "policy_id": "sha_custom_module",
                            "constraint": {
                                "security_health_analytics_custom_module": {
                                    "display_name": "custom_SHA_policy",
                                    "config": {
                                        "predicate": {
                                            "expression": "resource.rotationPeriod > duration('2592000s')",
                                        },
                                        "custom_output": {
                                            "properties": [{
                                                "name": "duration",
                                                "value_expression": {
                                                    "expression": "resource.rotationPeriod",
                                                },
                                            }],
                                        },
                                        "resource_selector": {
                                            "resource_types": ["cloudkms.googleapis.com/CryptoKey"],
                                        },
                                        "severity": "LOW",
                                        "description": "Custom Module",
                                        "recommendation": "Testing custom modules",
                                    },
                                    "module_enablement_state": "ENABLED",
                                },
                            },
                        },
                    ],
                },
            ])
        ```

        ## Import

        Posture can be imported using any of these accepted formats:

        * `{{parent}}/locations/{{location}}/postures/{{posture_id}}`

        When using the `pulumi import` command, Posture can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securityposture/posture:Posture default {{parent}}/locations/{{location}}/postures/{{posture_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Description of the posture.
        :param pulumi.Input[_builtins.str] location: Location of the resource, eg: global.
        :param pulumi.Input[_builtins.str] parent: The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PosturePolicySetArgs', 'PosturePolicySetArgsDict']]]] policy_sets: List of policy sets for the posture.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] posture_id: Id of the posture. It is an immutable field.
        :param pulumi.Input[_builtins.str] state: State of the posture. Update to state field should not be triggered along with
               with other field updates.
               Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PostureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Posture represents a collection of policy set including its name, state, description
        and policy sets. A policy set includes set of policies along with their definition.
        A posture can be created at the organization level.
        Every update to a deployed posture creates a new posture revision with an updated revision_id.

        To get more information about Posture, see:

        * [API documentation](https://cloud.google.com/security-command-center/docs/reference/securityposture/rest/v1/Posture)
        * How-to Guides
            * [Create and deploy a posture](https://cloud.google.com/security-command-center/docs/how-to-use-security-posture)

        ## Example Usage

        ### Securityposture Posture Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        posture1 = gcp.securityposture.Posture("posture1",
            posture_id="posture_example",
            parent="organizations/123456789",
            location="global",
            state="ACTIVE",
            description="a new posture",
            policy_sets=[
                {
                    "policy_set_id": "org_policy_set",
                    "description": "set of org policies",
                    "policies": [
                        {
                            "policy_id": "canned_org_policy",
                            "constraint": {
                                "org_policy_constraint": {
                                    "canned_constraint_id": "storage.uniformBucketLevelAccess",
                                    "policy_rules": [{
                                        "enforce": True,
                                        "condition": {
                                            "description": "condition description",
                                            "expression": "resource.matchTag('org_id/tag_key_short_name,'tag_value_short_name')",
                                            "title": "a CEL condition",
                                        },
                                    }],
                                },
                            },
                        },
                        {
                            "policy_id": "custom_org_policy",
                            "constraint": {
                                "org_policy_constraint_custom": {
                                    "custom_constraint": {
                                        "name": "organizations/123456789/customConstraints/custom.disableGkeAutoUpgrade",
                                        "display_name": "Disable GKE auto upgrade",
                                        "description": "Only allow GKE NodePool resource to be created or updated if AutoUpgrade is not enabled where this custom constraint is enforced.",
                                        "action_type": "ALLOW",
                                        "condition": "resource.management.autoUpgrade == false",
                                        "method_types": [
                                            "CREATE",
                                            "UPDATE",
                                        ],
                                        "resource_types": ["container.googleapis.com/NodePool"],
                                    },
                                    "policy_rules": [{
                                        "enforce": True,
                                        "condition": {
                                            "description": "condition description",
                                            "expression": "resource.matchTagId('tagKeys/key_id','tagValues/value_id')",
                                            "title": "a CEL condition",
                                        },
                                    }],
                                },
                            },
                        },
                    ],
                },
                {
                    "policy_set_id": "sha_policy_set",
                    "description": "set of sha policies",
                    "policies": [
                        {
                            "policy_id": "sha_builtin_module",
                            "constraint": {
                                "security_health_analytics_module": {
                                    "module_name": "BIGQUERY_TABLE_CMEK_DISABLED",
                                    "module_enablement_state": "ENABLED",
                                },
                            },
                            "description": "enable BIGQUERY_TABLE_CMEK_DISABLED",
                        },
                        {
                            "policy_id": "sha_custom_module",
                            "constraint": {
                                "security_health_analytics_custom_module": {
                                    "display_name": "custom_SHA_policy",
                                    "config": {
                                        "predicate": {
                                            "expression": "resource.rotationPeriod > duration('2592000s')",
                                        },
                                        "custom_output": {
                                            "properties": [{
                                                "name": "duration",
                                                "value_expression": {
                                                    "expression": "resource.rotationPeriod",
                                                },
                                            }],
                                        },
                                        "resource_selector": {
                                            "resource_types": ["cloudkms.googleapis.com/CryptoKey"],
                                        },
                                        "severity": "LOW",
                                        "description": "Custom Module",
                                        "recommendation": "Testing custom modules",
                                    },
                                    "module_enablement_state": "ENABLED",
                                },
                            },
                        },
                    ],
                },
            ])
        ```

        ## Import

        Posture can be imported using any of these accepted formats:

        * `{{parent}}/locations/{{location}}/postures/{{posture_id}}`

        When using the `pulumi import` command, Posture can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:securityposture/posture:Posture default {{parent}}/locations/{{location}}/postures/{{posture_id}}
        ```

        :param str resource_name: The name of the resource.
        :param PostureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PostureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PosturePolicySetArgs', 'PosturePolicySetArgsDict']]]]] = None,
                 posture_id: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PostureArgs.__new__(PostureArgs)

            __props__.__dict__["description"] = description
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            if parent is None and not opts.urn:
                raise TypeError("Missing required property 'parent'")
            __props__.__dict__["parent"] = parent
            if policy_sets is None and not opts.urn:
                raise TypeError("Missing required property 'policy_sets'")
            __props__.__dict__["policy_sets"] = policy_sets
            if posture_id is None and not opts.urn:
                raise TypeError("Missing required property 'posture_id'")
            __props__.__dict__["posture_id"] = posture_id
            if state is None and not opts.urn:
                raise TypeError("Missing required property 'state'")
            __props__.__dict__["state"] = state
            __props__.__dict__["create_time"] = None
            __props__.__dict__["etag"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["reconciling"] = None
            __props__.__dict__["revision_id"] = None
            __props__.__dict__["update_time"] = None
        super(Posture, __self__).__init__(
            'gcp:securityposture/posture:Posture',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            parent: Optional[pulumi.Input[_builtins.str]] = None,
            policy_sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PosturePolicySetArgs', 'PosturePolicySetArgsDict']]]]] = None,
            posture_id: Optional[pulumi.Input[_builtins.str]] = None,
            reconciling: Optional[pulumi.Input[_builtins.bool]] = None,
            revision_id: Optional[pulumi.Input[_builtins.str]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'Posture':
        """
        Get an existing Posture resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: Time the Posture was created in UTC.
        :param pulumi.Input[_builtins.str] description: Description of the posture.
        :param pulumi.Input[_builtins.str] etag: For Resource freshness validation (https://google.aip.dev/154)
        :param pulumi.Input[_builtins.str] location: Location of the resource, eg: global.
        :param pulumi.Input[_builtins.str] name: Name of the posture.
        :param pulumi.Input[_builtins.str] parent: The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PosturePolicySetArgs', 'PosturePolicySetArgsDict']]]] policy_sets: List of policy sets for the posture.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] posture_id: Id of the posture. It is an immutable field.
        :param pulumi.Input[_builtins.bool] reconciling: If set, there are currently changes in flight to the posture.
        :param pulumi.Input[_builtins.str] revision_id: Revision_id of the posture.
        :param pulumi.Input[_builtins.str] state: State of the posture. Update to state field should not be triggered along with
               with other field updates.
               Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        :param pulumi.Input[_builtins.str] update_time: Time the Posture was updated in UTC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PostureState.__new__(_PostureState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["etag"] = etag
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        __props__.__dict__["policy_sets"] = policy_sets
        __props__.__dict__["posture_id"] = posture_id
        __props__.__dict__["reconciling"] = reconciling
        __props__.__dict__["revision_id"] = revision_id
        __props__.__dict__["state"] = state
        __props__.__dict__["update_time"] = update_time
        return Posture(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Time the Posture was created in UTC.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of the posture.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        """
        For Resource freshness validation (https://google.aip.dev/154)
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Location of the resource, eg: global.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the posture.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Output[_builtins.str]:
        """
        The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        """
        return pulumi.get(self, "parent")

    @_builtins.property
    @pulumi.getter(name="policySets")
    def policy_sets(self) -> pulumi.Output[Sequence['outputs.PosturePolicySet']]:
        """
        List of policy sets for the posture.
        Structure is documented below.
        """
        return pulumi.get(self, "policy_sets")

    @_builtins.property
    @pulumi.getter(name="postureId")
    def posture_id(self) -> pulumi.Output[_builtins.str]:
        """
        Id of the posture. It is an immutable field.
        """
        return pulumi.get(self, "posture_id")

    @_builtins.property
    @pulumi.getter
    def reconciling(self) -> pulumi.Output[_builtins.bool]:
        """
        If set, there are currently changes in flight to the posture.
        """
        return pulumi.get(self, "reconciling")

    @_builtins.property
    @pulumi.getter(name="revisionId")
    def revision_id(self) -> pulumi.Output[_builtins.str]:
        """
        Revision_id of the posture.
        """
        return pulumi.get(self, "revision_id")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        State of the posture. Update to state field should not be triggered along with
        with other field updates.
        Possible values are: `DEPRECATED`, `DRAFT`, `ACTIVE`.
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Time the Posture was updated in UTC.
        """
        return pulumi.get(self, "update_time")

