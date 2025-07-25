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

__all__ = ['LogViewArgs', 'LogView']

@pulumi.input_type
class LogViewArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a LogView resource.
        :param pulumi.Input[_builtins.str] bucket: The bucket of the resource
        :param pulumi.Input[_builtins.str] description: Describes this view.
        :param pulumi.Input[_builtins.str] filter: Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        :param pulumi.Input[_builtins.str] location: The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        :param pulumi.Input[_builtins.str] name: The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        :param pulumi.Input[_builtins.str] parent: The parent of the resource.
        """
        pulumi.set(__self__, "bucket", bucket)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[_builtins.str]:
        """
        The bucket of the resource
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Describes this view.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "filter", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The parent of the resource.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent", value)


@pulumi.input_type
class _LogViewState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LogView resources.
        :param pulumi.Input[_builtins.str] bucket: The bucket of the resource
        :param pulumi.Input[_builtins.str] create_time: Output only. The creation timestamp of the view.
        :param pulumi.Input[_builtins.str] description: Describes this view.
        :param pulumi.Input[_builtins.str] filter: Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        :param pulumi.Input[_builtins.str] location: The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        :param pulumi.Input[_builtins.str] name: The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        :param pulumi.Input[_builtins.str] parent: The parent of the resource.
        :param pulumi.Input[_builtins.str] update_time: Output only. The last update timestamp of the view.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The bucket of the resource
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. The creation timestamp of the view.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Describes this view.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "filter", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The parent of the resource.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. The last update timestamp of the view.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("gcp:logging/logView:LogView")
class LogView(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Describes a view over log entries in a bucket.

        To get more information about LogView, see:

        * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/logging/docs/apis)

        ## Example Usage

        ### Logging Log View Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        logging_log_view = gcp.logging.ProjectBucketConfig("logging_log_view",
            project="my-project-name",
            location="global",
            retention_days=30,
            bucket_id="_Default")
        logging_log_view_log_view = gcp.logging.LogView("logging_log_view",
            name="my-view",
            bucket=logging_log_view.id,
            description="A logging view configured with Terraform",
            filter="SOURCE(\\"projects/myproject\\") AND resource.type = \\"gce_instance\\" AND LOG_ID(\\"stdout\\")")
        ```

        ## Import

        LogView can be imported using any of these accepted formats:

        * `{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}`

        When using the `pulumi import` command, LogView can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:logging/logView:LogView default {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The bucket of the resource
        :param pulumi.Input[_builtins.str] description: Describes this view.
        :param pulumi.Input[_builtins.str] filter: Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        :param pulumi.Input[_builtins.str] location: The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        :param pulumi.Input[_builtins.str] name: The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        :param pulumi.Input[_builtins.str] parent: The parent of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogViewArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Describes a view over log entries in a bucket.

        To get more information about LogView, see:

        * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/logging/docs/apis)

        ## Example Usage

        ### Logging Log View Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        logging_log_view = gcp.logging.ProjectBucketConfig("logging_log_view",
            project="my-project-name",
            location="global",
            retention_days=30,
            bucket_id="_Default")
        logging_log_view_log_view = gcp.logging.LogView("logging_log_view",
            name="my-view",
            bucket=logging_log_view.id,
            description="A logging view configured with Terraform",
            filter="SOURCE(\\"projects/myproject\\") AND resource.type = \\"gce_instance\\" AND LOG_ID(\\"stdout\\")")
        ```

        ## Import

        LogView can be imported using any of these accepted formats:

        * `{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}`

        When using the `pulumi import` command, LogView can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:logging/logView:LogView default {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param LogViewArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogViewArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogViewArgs.__new__(LogViewArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["description"] = description
            __props__.__dict__["filter"] = filter
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["parent"] = parent
            __props__.__dict__["create_time"] = None
            __props__.__dict__["update_time"] = None
        super(LogView, __self__).__init__(
            'gcp:logging/logView:LogView',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[_builtins.str]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            filter: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            parent: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'LogView':
        """
        Get an existing LogView resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bucket: The bucket of the resource
        :param pulumi.Input[_builtins.str] create_time: Output only. The creation timestamp of the view.
        :param pulumi.Input[_builtins.str] description: Describes this view.
        :param pulumi.Input[_builtins.str] filter: Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        :param pulumi.Input[_builtins.str] location: The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        :param pulumi.Input[_builtins.str] name: The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        :param pulumi.Input[_builtins.str] parent: The parent of the resource.
        :param pulumi.Input[_builtins.str] update_time: Output only. The last update timestamp of the view.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogViewState.__new__(_LogViewState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["filter"] = filter
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        __props__.__dict__["update_time"] = update_time
        return LogView(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[_builtins.str]:
        """
        The bucket of the resource
        """
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. The creation timestamp of the view.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Describes this view.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: - originating project/folder/organization/billing account. - resource type - log id For example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
        """
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The resource name of the view. For example: \\`projects/my-project/locations/global/buckets/my-bucket/views/my-view\\`
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Output[_builtins.str]:
        """
        The parent of the resource.
        """
        return pulumi.get(self, "parent")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. The last update timestamp of the view.
        """
        return pulumi.get(self, "update_time")

