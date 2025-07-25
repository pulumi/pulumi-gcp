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

__all__ = ['ProjectCloudArmorTierArgs', 'ProjectCloudArmorTier']

@pulumi.input_type
class ProjectCloudArmorTierArgs:
    def __init__(__self__, *,
                 cloud_armor_tier: pulumi.Input[_builtins.str],
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ProjectCloudArmorTier resource.
        :param pulumi.Input[_builtins.str] cloud_armor_tier: Managed protection tier to be set.
               Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "cloud_armor_tier", cloud_armor_tier)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="cloudArmorTier")
    def cloud_armor_tier(self) -> pulumi.Input[_builtins.str]:
        """
        Managed protection tier to be set.
        Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        """
        return pulumi.get(self, "cloud_armor_tier")

    @cloud_armor_tier.setter
    def cloud_armor_tier(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cloud_armor_tier", value)

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
class _ProjectCloudArmorTierState:
    def __init__(__self__, *,
                 cloud_armor_tier: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ProjectCloudArmorTier resources.
        :param pulumi.Input[_builtins.str] cloud_armor_tier: Managed protection tier to be set.
               Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        if cloud_armor_tier is not None:
            pulumi.set(__self__, "cloud_armor_tier", cloud_armor_tier)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="cloudArmorTier")
    def cloud_armor_tier(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Managed protection tier to be set.
        Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        """
        return pulumi.get(self, "cloud_armor_tier")

    @cloud_armor_tier.setter
    def cloud_armor_tier(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cloud_armor_tier", value)

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


@pulumi.type_token("gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier")
class ProjectCloudArmorTier(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_armor_tier: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Sets the Cloud Armor tier of the project.

        To get more information about ProjectCloudArmorTier, see:

        * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/projects/setCloudArmorTier)
        * How-to Guides
            * [Subscribing to Cloud Armor Enterprise](https://cloud.google.com/armor/docs/managed-protection-overview#subscribing_to_plus)

        ## Example Usage

        ### Compute Project Cloud Armor Tier Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        cloud_armor_tier_config = gcp.compute.ProjectCloudArmorTier("cloud_armor_tier_config", cloud_armor_tier="CA_STANDARD")
        ```
        ### Compute Project Cloud Armor Tier Project Set

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.Project("project",
            project_id="your_project_id",
            name="your_project_id",
            org_id="123456789",
            billing_account="000000-0000000-0000000-000000",
            deletion_policy="DELETE")
        compute = gcp.projects.Service("compute",
            project=project.project_id,
            service="compute.googleapis.com")
        cloud_armor_tier_config = gcp.compute.ProjectCloudArmorTier("cloud_armor_tier_config",
            project=project.project_id,
            cloud_armor_tier="CA_STANDARD",
            opts = pulumi.ResourceOptions(depends_on=[compute]))
        ```

        ## Import

        ProjectCloudArmorTier can be imported using any of these accepted formats:

        * `projects/{{project}}`

        * `{{project}}`

        When using the `pulumi import` command, ProjectCloudArmorTier can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier default projects/{{project}}
        ```

        ```sh
        $ pulumi import gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier default {{project}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cloud_armor_tier: Managed protection tier to be set.
               Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectCloudArmorTierArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Sets the Cloud Armor tier of the project.

        To get more information about ProjectCloudArmorTier, see:

        * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/projects/setCloudArmorTier)
        * How-to Guides
            * [Subscribing to Cloud Armor Enterprise](https://cloud.google.com/armor/docs/managed-protection-overview#subscribing_to_plus)

        ## Example Usage

        ### Compute Project Cloud Armor Tier Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        cloud_armor_tier_config = gcp.compute.ProjectCloudArmorTier("cloud_armor_tier_config", cloud_armor_tier="CA_STANDARD")
        ```
        ### Compute Project Cloud Armor Tier Project Set

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.Project("project",
            project_id="your_project_id",
            name="your_project_id",
            org_id="123456789",
            billing_account="000000-0000000-0000000-000000",
            deletion_policy="DELETE")
        compute = gcp.projects.Service("compute",
            project=project.project_id,
            service="compute.googleapis.com")
        cloud_armor_tier_config = gcp.compute.ProjectCloudArmorTier("cloud_armor_tier_config",
            project=project.project_id,
            cloud_armor_tier="CA_STANDARD",
            opts = pulumi.ResourceOptions(depends_on=[compute]))
        ```

        ## Import

        ProjectCloudArmorTier can be imported using any of these accepted formats:

        * `projects/{{project}}`

        * `{{project}}`

        When using the `pulumi import` command, ProjectCloudArmorTier can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier default projects/{{project}}
        ```

        ```sh
        $ pulumi import gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier default {{project}}
        ```

        :param str resource_name: The name of the resource.
        :param ProjectCloudArmorTierArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectCloudArmorTierArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_armor_tier: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectCloudArmorTierArgs.__new__(ProjectCloudArmorTierArgs)

            if cloud_armor_tier is None and not opts.urn:
                raise TypeError("Missing required property 'cloud_armor_tier'")
            __props__.__dict__["cloud_armor_tier"] = cloud_armor_tier
            __props__.__dict__["project"] = project
        super(ProjectCloudArmorTier, __self__).__init__(
            'gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloud_armor_tier: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None) -> 'ProjectCloudArmorTier':
        """
        Get an existing ProjectCloudArmorTier resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cloud_armor_tier: Managed protection tier to be set.
               Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectCloudArmorTierState.__new__(_ProjectCloudArmorTierState)

        __props__.__dict__["cloud_armor_tier"] = cloud_armor_tier
        __props__.__dict__["project"] = project
        return ProjectCloudArmorTier(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="cloudArmorTier")
    def cloud_armor_tier(self) -> pulumi.Output[_builtins.str]:
        """
        Managed protection tier to be set.
        Possible values are: `CA_STANDARD`, `CA_ENTERPRISE_PAYGO`, `CA_ENTERPRISE_ANNUAL`.
        """
        return pulumi.get(self, "cloud_armor_tier")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

