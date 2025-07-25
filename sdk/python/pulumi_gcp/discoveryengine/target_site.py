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

__all__ = ['TargetSiteArgs', 'TargetSite']

@pulumi.input_type
class TargetSiteArgs:
    def __init__(__self__, *,
                 data_store_id: pulumi.Input[_builtins.str],
                 location: pulumi.Input[_builtins.str],
                 provided_uri_pattern: pulumi.Input[_builtins.str],
                 exact_match: Optional[pulumi.Input[_builtins.bool]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TargetSite resource.
        :param pulumi.Input[_builtins.str] data_store_id: The unique id of the data store.
        :param pulumi.Input[_builtins.str] location: The geographic location where the data store should reside. The value can
               only be one of "global", "us" and "eu".
        :param pulumi.Input[_builtins.str] provided_uri_pattern: The user provided URI pattern from which the `generated_uri_pattern` is
               generated.
        :param pulumi.Input[_builtins.bool] exact_match: If set to false, a uri_pattern is generated to include all pages whose
               address contains the provided_uri_pattern. If set to true, an uri_pattern
               is generated to try to be an exact match of the provided_uri_pattern or
               just the specific page if the provided_uri_pattern is a specific one.
               provided_uri_pattern is always normalized to generate the URI pattern to
               be used by the search engine.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] type: The possible target site types.
               Possible values are: `INCLUDE`, `EXCLUDE`.
        """
        pulumi.set(__self__, "data_store_id", data_store_id)
        pulumi.set(__self__, "location", location)
        pulumi.set(__self__, "provided_uri_pattern", provided_uri_pattern)
        if exact_match is not None:
            pulumi.set(__self__, "exact_match", exact_match)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="dataStoreId")
    def data_store_id(self) -> pulumi.Input[_builtins.str]:
        """
        The unique id of the data store.
        """
        return pulumi.get(self, "data_store_id")

    @data_store_id.setter
    def data_store_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_store_id", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Input[_builtins.str]:
        """
        The geographic location where the data store should reside. The value can
        only be one of "global", "us" and "eu".
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="providedUriPattern")
    def provided_uri_pattern(self) -> pulumi.Input[_builtins.str]:
        """
        The user provided URI pattern from which the `generated_uri_pattern` is
        generated.
        """
        return pulumi.get(self, "provided_uri_pattern")

    @provided_uri_pattern.setter
    def provided_uri_pattern(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "provided_uri_pattern", value)

    @_builtins.property
    @pulumi.getter(name="exactMatch")
    def exact_match(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If set to false, a uri_pattern is generated to include all pages whose
        address contains the provided_uri_pattern. If set to true, an uri_pattern
        is generated to try to be an exact match of the provided_uri_pattern or
        just the specific page if the provided_uri_pattern is a specific one.
        provided_uri_pattern is always normalized to generate the URI pattern to
        be used by the search engine.
        """
        return pulumi.get(self, "exact_match")

    @exact_match.setter
    def exact_match(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "exact_match", value)

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
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The possible target site types.
        Possible values are: `INCLUDE`, `EXCLUDE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _TargetSiteState:
    def __init__(__self__, *,
                 data_store_id: Optional[pulumi.Input[_builtins.str]] = None,
                 exact_match: Optional[pulumi.Input[_builtins.bool]] = None,
                 failure_reasons: Optional[pulumi.Input[Sequence[pulumi.Input['TargetSiteFailureReasonArgs']]]] = None,
                 generated_uri_pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 indexing_status: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 provided_uri_pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 root_domain_uri: Optional[pulumi.Input[_builtins.str]] = None,
                 site_verification_infos: Optional[pulumi.Input[Sequence[pulumi.Input['TargetSiteSiteVerificationInfoArgs']]]] = None,
                 target_site_id: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TargetSite resources.
        :param pulumi.Input[_builtins.str] data_store_id: The unique id of the data store.
        :param pulumi.Input[_builtins.bool] exact_match: If set to false, a uri_pattern is generated to include all pages whose
               address contains the provided_uri_pattern. If set to true, an uri_pattern
               is generated to try to be an exact match of the provided_uri_pattern or
               just the specific page if the provided_uri_pattern is a specific one.
               provided_uri_pattern is always normalized to generate the URI pattern to
               be used by the search engine.
        :param pulumi.Input[Sequence[pulumi.Input['TargetSiteFailureReasonArgs']]] failure_reasons: Site search indexing failure reasons.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] generated_uri_pattern: This is system-generated based on the `provided_uri_pattern`.
        :param pulumi.Input[_builtins.str] indexing_status: The indexing status.
        :param pulumi.Input[_builtins.str] location: The geographic location where the data store should reside. The value can
               only be one of "global", "us" and "eu".
        :param pulumi.Input[_builtins.str] name: The unique full resource name of the target site. Values are of the format
               `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/siteSearchEngine/targetSites/{target_site_id}`.
               This field must be a UTF-8 encoded string with a length limit of 1024
               characters.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] provided_uri_pattern: The user provided URI pattern from which the `generated_uri_pattern` is
               generated.
        :param pulumi.Input[_builtins.str] root_domain_uri: Root domain of the `provided_uri_pattern`.
        :param pulumi.Input[Sequence[pulumi.Input['TargetSiteSiteVerificationInfoArgs']]] site_verification_infos: Site ownership and validity verification status.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] target_site_id: The unique id of the target site.
        :param pulumi.Input[_builtins.str] type: The possible target site types.
               Possible values are: `INCLUDE`, `EXCLUDE`.
        :param pulumi.Input[_builtins.str] update_time: The target site's last updated time.
        """
        if data_store_id is not None:
            pulumi.set(__self__, "data_store_id", data_store_id)
        if exact_match is not None:
            pulumi.set(__self__, "exact_match", exact_match)
        if failure_reasons is not None:
            pulumi.set(__self__, "failure_reasons", failure_reasons)
        if generated_uri_pattern is not None:
            pulumi.set(__self__, "generated_uri_pattern", generated_uri_pattern)
        if indexing_status is not None:
            pulumi.set(__self__, "indexing_status", indexing_status)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if provided_uri_pattern is not None:
            pulumi.set(__self__, "provided_uri_pattern", provided_uri_pattern)
        if root_domain_uri is not None:
            pulumi.set(__self__, "root_domain_uri", root_domain_uri)
        if site_verification_infos is not None:
            pulumi.set(__self__, "site_verification_infos", site_verification_infos)
        if target_site_id is not None:
            pulumi.set(__self__, "target_site_id", target_site_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="dataStoreId")
    def data_store_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique id of the data store.
        """
        return pulumi.get(self, "data_store_id")

    @data_store_id.setter
    def data_store_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_store_id", value)

    @_builtins.property
    @pulumi.getter(name="exactMatch")
    def exact_match(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If set to false, a uri_pattern is generated to include all pages whose
        address contains the provided_uri_pattern. If set to true, an uri_pattern
        is generated to try to be an exact match of the provided_uri_pattern or
        just the specific page if the provided_uri_pattern is a specific one.
        provided_uri_pattern is always normalized to generate the URI pattern to
        be used by the search engine.
        """
        return pulumi.get(self, "exact_match")

    @exact_match.setter
    def exact_match(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "exact_match", value)

    @_builtins.property
    @pulumi.getter(name="failureReasons")
    def failure_reasons(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TargetSiteFailureReasonArgs']]]]:
        """
        Site search indexing failure reasons.
        Structure is documented below.
        """
        return pulumi.get(self, "failure_reasons")

    @failure_reasons.setter
    def failure_reasons(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TargetSiteFailureReasonArgs']]]]):
        pulumi.set(self, "failure_reasons", value)

    @_builtins.property
    @pulumi.getter(name="generatedUriPattern")
    def generated_uri_pattern(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is system-generated based on the `provided_uri_pattern`.
        """
        return pulumi.get(self, "generated_uri_pattern")

    @generated_uri_pattern.setter
    def generated_uri_pattern(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "generated_uri_pattern", value)

    @_builtins.property
    @pulumi.getter(name="indexingStatus")
    def indexing_status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The indexing status.
        """
        return pulumi.get(self, "indexing_status")

    @indexing_status.setter
    def indexing_status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "indexing_status", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The geographic location where the data store should reside. The value can
        only be one of "global", "us" and "eu".
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique full resource name of the target site. Values are of the format
        `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/siteSearchEngine/targetSites/{target_site_id}`.
        This field must be a UTF-8 encoded string with a length limit of 1024
        characters.
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
    @pulumi.getter(name="providedUriPattern")
    def provided_uri_pattern(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The user provided URI pattern from which the `generated_uri_pattern` is
        generated.
        """
        return pulumi.get(self, "provided_uri_pattern")

    @provided_uri_pattern.setter
    def provided_uri_pattern(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "provided_uri_pattern", value)

    @_builtins.property
    @pulumi.getter(name="rootDomainUri")
    def root_domain_uri(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Root domain of the `provided_uri_pattern`.
        """
        return pulumi.get(self, "root_domain_uri")

    @root_domain_uri.setter
    def root_domain_uri(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "root_domain_uri", value)

    @_builtins.property
    @pulumi.getter(name="siteVerificationInfos")
    def site_verification_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TargetSiteSiteVerificationInfoArgs']]]]:
        """
        Site ownership and validity verification status.
        Structure is documented below.
        """
        return pulumi.get(self, "site_verification_infos")

    @site_verification_infos.setter
    def site_verification_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TargetSiteSiteVerificationInfoArgs']]]]):
        pulumi.set(self, "site_verification_infos", value)

    @_builtins.property
    @pulumi.getter(name="targetSiteId")
    def target_site_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique id of the target site.
        """
        return pulumi.get(self, "target_site_id")

    @target_site_id.setter
    def target_site_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_site_id", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The possible target site types.
        Possible values are: `INCLUDE`, `EXCLUDE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The target site's last updated time.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:discoveryengine/targetSite:TargetSite")
class TargetSite(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_store_id: Optional[pulumi.Input[_builtins.str]] = None,
                 exact_match: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 provided_uri_pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        TargetSite represents a URI pattern that the users want to confine their
        search.

        To get more information about TargetSite, see:

        * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.siteSearchEngine.targetSites)

        ## Example Usage

        ### Discoveryengine Targetsite Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        basic_data_store = gcp.discoveryengine.DataStore("basic",
            location="global",
            data_store_id="data-store-id",
            display_name="tf-test-basic-site-search-datastore",
            industry_vertical="GENERIC",
            content_config="PUBLIC_WEBSITE",
            solution_types=["SOLUTION_TYPE_SEARCH"],
            create_advanced_site_search=False,
            skip_default_schema_creation=False)
        basic = gcp.discoveryengine.TargetSite("basic",
            location=basic_data_store.location,
            data_store_id=basic_data_store.data_store_id,
            provided_uri_pattern="cloud.google.com/docs/*",
            type="INCLUDE",
            exact_match=False)
        ```
        ### Discoveryengine Targetsite Advanced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        advanced_data_store = gcp.discoveryengine.DataStore("advanced",
            location="global",
            data_store_id="data-store-id",
            display_name="tf-test-advanced-site-search-datastore",
            industry_vertical="GENERIC",
            content_config="PUBLIC_WEBSITE",
            solution_types=["SOLUTION_TYPE_SEARCH"],
            create_advanced_site_search=True,
            skip_default_schema_creation=False)
        advanced = gcp.discoveryengine.TargetSite("advanced",
            location=advanced_data_store.location,
            data_store_id=advanced_data_store.data_store_id,
            provided_uri_pattern="cloud.google.com/docs/*",
            type="INCLUDE",
            exact_match=False)
        ```

        ## Import

        TargetSite can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/collections/default_collection/dataStores/{{data_store_id}}/siteSearchEngine/targetSites/{{target_site_id}}`

        * `{{project}}/{{location}}/{{data_store_id}}/{{target_site_id}}`

        * `{{location}}/{{data_store_id}}/{{target_site_id}}`

        When using the `pulumi import` command, TargetSite can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:discoveryengine/targetSite:TargetSite default projects/{{project}}/locations/{{location}}/collections/default_collection/dataStores/{{data_store_id}}/siteSearchEngine/targetSites/{{target_site_id}}
        ```

        ```sh
        $ pulumi import gcp:discoveryengine/targetSite:TargetSite default {{project}}/{{location}}/{{data_store_id}}/{{target_site_id}}
        ```

        ```sh
        $ pulumi import gcp:discoveryengine/targetSite:TargetSite default {{location}}/{{data_store_id}}/{{target_site_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] data_store_id: The unique id of the data store.
        :param pulumi.Input[_builtins.bool] exact_match: If set to false, a uri_pattern is generated to include all pages whose
               address contains the provided_uri_pattern. If set to true, an uri_pattern
               is generated to try to be an exact match of the provided_uri_pattern or
               just the specific page if the provided_uri_pattern is a specific one.
               provided_uri_pattern is always normalized to generate the URI pattern to
               be used by the search engine.
        :param pulumi.Input[_builtins.str] location: The geographic location where the data store should reside. The value can
               only be one of "global", "us" and "eu".
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] provided_uri_pattern: The user provided URI pattern from which the `generated_uri_pattern` is
               generated.
        :param pulumi.Input[_builtins.str] type: The possible target site types.
               Possible values are: `INCLUDE`, `EXCLUDE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TargetSiteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        TargetSite represents a URI pattern that the users want to confine their
        search.

        To get more information about TargetSite, see:

        * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.siteSearchEngine.targetSites)

        ## Example Usage

        ### Discoveryengine Targetsite Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        basic_data_store = gcp.discoveryengine.DataStore("basic",
            location="global",
            data_store_id="data-store-id",
            display_name="tf-test-basic-site-search-datastore",
            industry_vertical="GENERIC",
            content_config="PUBLIC_WEBSITE",
            solution_types=["SOLUTION_TYPE_SEARCH"],
            create_advanced_site_search=False,
            skip_default_schema_creation=False)
        basic = gcp.discoveryengine.TargetSite("basic",
            location=basic_data_store.location,
            data_store_id=basic_data_store.data_store_id,
            provided_uri_pattern="cloud.google.com/docs/*",
            type="INCLUDE",
            exact_match=False)
        ```
        ### Discoveryengine Targetsite Advanced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        advanced_data_store = gcp.discoveryengine.DataStore("advanced",
            location="global",
            data_store_id="data-store-id",
            display_name="tf-test-advanced-site-search-datastore",
            industry_vertical="GENERIC",
            content_config="PUBLIC_WEBSITE",
            solution_types=["SOLUTION_TYPE_SEARCH"],
            create_advanced_site_search=True,
            skip_default_schema_creation=False)
        advanced = gcp.discoveryengine.TargetSite("advanced",
            location=advanced_data_store.location,
            data_store_id=advanced_data_store.data_store_id,
            provided_uri_pattern="cloud.google.com/docs/*",
            type="INCLUDE",
            exact_match=False)
        ```

        ## Import

        TargetSite can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{location}}/collections/default_collection/dataStores/{{data_store_id}}/siteSearchEngine/targetSites/{{target_site_id}}`

        * `{{project}}/{{location}}/{{data_store_id}}/{{target_site_id}}`

        * `{{location}}/{{data_store_id}}/{{target_site_id}}`

        When using the `pulumi import` command, TargetSite can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:discoveryengine/targetSite:TargetSite default projects/{{project}}/locations/{{location}}/collections/default_collection/dataStores/{{data_store_id}}/siteSearchEngine/targetSites/{{target_site_id}}
        ```

        ```sh
        $ pulumi import gcp:discoveryengine/targetSite:TargetSite default {{project}}/{{location}}/{{data_store_id}}/{{target_site_id}}
        ```

        ```sh
        $ pulumi import gcp:discoveryengine/targetSite:TargetSite default {{location}}/{{data_store_id}}/{{target_site_id}}
        ```

        :param str resource_name: The name of the resource.
        :param TargetSiteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TargetSiteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_store_id: Optional[pulumi.Input[_builtins.str]] = None,
                 exact_match: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 provided_uri_pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TargetSiteArgs.__new__(TargetSiteArgs)

            if data_store_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_store_id'")
            __props__.__dict__["data_store_id"] = data_store_id
            __props__.__dict__["exact_match"] = exact_match
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["project"] = project
            if provided_uri_pattern is None and not opts.urn:
                raise TypeError("Missing required property 'provided_uri_pattern'")
            __props__.__dict__["provided_uri_pattern"] = provided_uri_pattern
            __props__.__dict__["type"] = type
            __props__.__dict__["failure_reasons"] = None
            __props__.__dict__["generated_uri_pattern"] = None
            __props__.__dict__["indexing_status"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["root_domain_uri"] = None
            __props__.__dict__["site_verification_infos"] = None
            __props__.__dict__["target_site_id"] = None
            __props__.__dict__["update_time"] = None
        super(TargetSite, __self__).__init__(
            'gcp:discoveryengine/targetSite:TargetSite',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_store_id: Optional[pulumi.Input[_builtins.str]] = None,
            exact_match: Optional[pulumi.Input[_builtins.bool]] = None,
            failure_reasons: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TargetSiteFailureReasonArgs', 'TargetSiteFailureReasonArgsDict']]]]] = None,
            generated_uri_pattern: Optional[pulumi.Input[_builtins.str]] = None,
            indexing_status: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            provided_uri_pattern: Optional[pulumi.Input[_builtins.str]] = None,
            root_domain_uri: Optional[pulumi.Input[_builtins.str]] = None,
            site_verification_infos: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TargetSiteSiteVerificationInfoArgs', 'TargetSiteSiteVerificationInfoArgsDict']]]]] = None,
            target_site_id: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'TargetSite':
        """
        Get an existing TargetSite resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] data_store_id: The unique id of the data store.
        :param pulumi.Input[_builtins.bool] exact_match: If set to false, a uri_pattern is generated to include all pages whose
               address contains the provided_uri_pattern. If set to true, an uri_pattern
               is generated to try to be an exact match of the provided_uri_pattern or
               just the specific page if the provided_uri_pattern is a specific one.
               provided_uri_pattern is always normalized to generate the URI pattern to
               be used by the search engine.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TargetSiteFailureReasonArgs', 'TargetSiteFailureReasonArgsDict']]]] failure_reasons: Site search indexing failure reasons.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] generated_uri_pattern: This is system-generated based on the `provided_uri_pattern`.
        :param pulumi.Input[_builtins.str] indexing_status: The indexing status.
        :param pulumi.Input[_builtins.str] location: The geographic location where the data store should reside. The value can
               only be one of "global", "us" and "eu".
        :param pulumi.Input[_builtins.str] name: The unique full resource name of the target site. Values are of the format
               `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/siteSearchEngine/targetSites/{target_site_id}`.
               This field must be a UTF-8 encoded string with a length limit of 1024
               characters.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] provided_uri_pattern: The user provided URI pattern from which the `generated_uri_pattern` is
               generated.
        :param pulumi.Input[_builtins.str] root_domain_uri: Root domain of the `provided_uri_pattern`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TargetSiteSiteVerificationInfoArgs', 'TargetSiteSiteVerificationInfoArgsDict']]]] site_verification_infos: Site ownership and validity verification status.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] target_site_id: The unique id of the target site.
        :param pulumi.Input[_builtins.str] type: The possible target site types.
               Possible values are: `INCLUDE`, `EXCLUDE`.
        :param pulumi.Input[_builtins.str] update_time: The target site's last updated time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TargetSiteState.__new__(_TargetSiteState)

        __props__.__dict__["data_store_id"] = data_store_id
        __props__.__dict__["exact_match"] = exact_match
        __props__.__dict__["failure_reasons"] = failure_reasons
        __props__.__dict__["generated_uri_pattern"] = generated_uri_pattern
        __props__.__dict__["indexing_status"] = indexing_status
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["provided_uri_pattern"] = provided_uri_pattern
        __props__.__dict__["root_domain_uri"] = root_domain_uri
        __props__.__dict__["site_verification_infos"] = site_verification_infos
        __props__.__dict__["target_site_id"] = target_site_id
        __props__.__dict__["type"] = type
        __props__.__dict__["update_time"] = update_time
        return TargetSite(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dataStoreId")
    def data_store_id(self) -> pulumi.Output[_builtins.str]:
        """
        The unique id of the data store.
        """
        return pulumi.get(self, "data_store_id")

    @_builtins.property
    @pulumi.getter(name="exactMatch")
    def exact_match(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        If set to false, a uri_pattern is generated to include all pages whose
        address contains the provided_uri_pattern. If set to true, an uri_pattern
        is generated to try to be an exact match of the provided_uri_pattern or
        just the specific page if the provided_uri_pattern is a specific one.
        provided_uri_pattern is always normalized to generate the URI pattern to
        be used by the search engine.
        """
        return pulumi.get(self, "exact_match")

    @_builtins.property
    @pulumi.getter(name="failureReasons")
    def failure_reasons(self) -> pulumi.Output[Sequence['outputs.TargetSiteFailureReason']]:
        """
        Site search indexing failure reasons.
        Structure is documented below.
        """
        return pulumi.get(self, "failure_reasons")

    @_builtins.property
    @pulumi.getter(name="generatedUriPattern")
    def generated_uri_pattern(self) -> pulumi.Output[_builtins.str]:
        """
        This is system-generated based on the `provided_uri_pattern`.
        """
        return pulumi.get(self, "generated_uri_pattern")

    @_builtins.property
    @pulumi.getter(name="indexingStatus")
    def indexing_status(self) -> pulumi.Output[_builtins.str]:
        """
        The indexing status.
        """
        return pulumi.get(self, "indexing_status")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The geographic location where the data store should reside. The value can
        only be one of "global", "us" and "eu".
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The unique full resource name of the target site. Values are of the format
        `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/siteSearchEngine/targetSites/{target_site_id}`.
        This field must be a UTF-8 encoded string with a length limit of 1024
        characters.
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
    @pulumi.getter(name="providedUriPattern")
    def provided_uri_pattern(self) -> pulumi.Output[_builtins.str]:
        """
        The user provided URI pattern from which the `generated_uri_pattern` is
        generated.
        """
        return pulumi.get(self, "provided_uri_pattern")

    @_builtins.property
    @pulumi.getter(name="rootDomainUri")
    def root_domain_uri(self) -> pulumi.Output[_builtins.str]:
        """
        Root domain of the `provided_uri_pattern`.
        """
        return pulumi.get(self, "root_domain_uri")

    @_builtins.property
    @pulumi.getter(name="siteVerificationInfos")
    def site_verification_infos(self) -> pulumi.Output[Sequence['outputs.TargetSiteSiteVerificationInfo']]:
        """
        Site ownership and validity verification status.
        Structure is documented below.
        """
        return pulumi.get(self, "site_verification_infos")

    @_builtins.property
    @pulumi.getter(name="targetSiteId")
    def target_site_id(self) -> pulumi.Output[_builtins.str]:
        """
        The unique id of the target site.
        """
        return pulumi.get(self, "target_site_id")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The possible target site types.
        Possible values are: `INCLUDE`, `EXCLUDE`.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        The target site's last updated time.
        """
        return pulumi.get(self, "update_time")

