# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HostingReleaseArgs', 'HostingRelease']

@pulumi.input_type
class HostingReleaseArgs:
    def __init__(__self__, *,
                 site_id: pulumi.Input[str],
                 channel_id: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HostingRelease resource.
        :param pulumi.Input[str] site_id: Required. The ID of the site to which the release belongs.
        :param pulumi.Input[str] channel_id: The ID of the channel to which the release belongs. If not provided, the release will
               belong to the default "live" channel
        :param pulumi.Input[str] message: The deploy description when the release was created. The value can be up to 512 characters.
        :param pulumi.Input[str] type: The type of the release; indicates what happened to the content of the site. There is no need to specify
               `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
               DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
               ROLLBACK: The release points back to a previously deployed version. Output only.
               SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
               Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        :param pulumi.Input[str] version_name: The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
               The content of the version specified will be actively displayed on the appropriate URL.
               The Version must belong to the same site as in the `site_id`.
               This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        pulumi.set(__self__, "site_id", site_id)
        if channel_id is not None:
            pulumi.set(__self__, "channel_id", channel_id)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version_name is not None:
            pulumi.set(__self__, "version_name", version_name)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Input[str]:
        """
        Required. The ID of the site to which the release belongs.
        """
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "site_id", value)

    @property
    @pulumi.getter(name="channelId")
    def channel_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the channel to which the release belongs. If not provided, the release will
        belong to the default "live" channel
        """
        return pulumi.get(self, "channel_id")

    @channel_id.setter
    def channel_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_id", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        The deploy description when the release was created. The value can be up to 512 characters.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the release; indicates what happened to the content of the site. There is no need to specify
        `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
        DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
        ROLLBACK: The release points back to a previously deployed version. Output only.
        SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
        Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
        The content of the version specified will be actively displayed on the appropriate URL.
        The Version must belong to the same site as in the `site_id`.
        This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        return pulumi.get(self, "version_name")

    @version_name.setter
    def version_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_name", value)


@pulumi.input_type
class _HostingReleaseState:
    def __init__(__self__, *,
                 channel_id: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 release_id: Optional[pulumi.Input[str]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HostingRelease resources.
        :param pulumi.Input[str] channel_id: The ID of the channel to which the release belongs. If not provided, the release will
               belong to the default "live" channel
        :param pulumi.Input[str] message: The deploy description when the release was created. The value can be up to 512 characters.
        :param pulumi.Input[str] name: The unique identifier for the release, in either of the following formats:
               sites/SITE_ID/releases/RELEASE_ID
               sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
        :param pulumi.Input[str] release_id: The unique identifier for the Release.
        :param pulumi.Input[str] site_id: Required. The ID of the site to which the release belongs.
        :param pulumi.Input[str] type: The type of the release; indicates what happened to the content of the site. There is no need to specify
               `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
               DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
               ROLLBACK: The release points back to a previously deployed version. Output only.
               SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
               Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        :param pulumi.Input[str] version_name: The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
               The content of the version specified will be actively displayed on the appropriate URL.
               The Version must belong to the same site as in the `site_id`.
               This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        if channel_id is not None:
            pulumi.set(__self__, "channel_id", channel_id)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if release_id is not None:
            pulumi.set(__self__, "release_id", release_id)
        if site_id is not None:
            pulumi.set(__self__, "site_id", site_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version_name is not None:
            pulumi.set(__self__, "version_name", version_name)

    @property
    @pulumi.getter(name="channelId")
    def channel_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the channel to which the release belongs. If not provided, the release will
        belong to the default "live" channel
        """
        return pulumi.get(self, "channel_id")

    @channel_id.setter
    def channel_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_id", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        The deploy description when the release was created. The value can be up to 512 characters.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the release, in either of the following formats:
        sites/SITE_ID/releases/RELEASE_ID
        sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="releaseId")
    def release_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the Release.
        """
        return pulumi.get(self, "release_id")

    @release_id.setter
    def release_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "release_id", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[pulumi.Input[str]]:
        """
        Required. The ID of the site to which the release belongs.
        """
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "site_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the release; indicates what happened to the content of the site. There is no need to specify
        `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
        DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
        ROLLBACK: The release points back to a previously deployed version. Output only.
        SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
        Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
        The content of the version specified will be actively displayed on the appropriate URL.
        The Version must belong to the same site as in the `site_id`.
        This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        return pulumi.get(self, "version_name")

    @version_name.setter
    def version_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_name", value)


class HostingRelease(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 channel_id: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Firebasehosting Release In Site

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_hosting_site = gcp.firebase.HostingSite("defaultHostingSite",
            project="my-project-name",
            site_id="site-id",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_version = gcp.firebase.HostingVersion("defaultHostingVersion",
            site_id=default_hosting_site.site_id,
            config=gcp.firebase.HostingVersionConfigArgs(
                redirects=[gcp.firebase.HostingVersionConfigRedirectArgs(
                    glob="/google/**",
                    status_code=302,
                    location="https://www.google.com",
                )],
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_release = gcp.firebase.HostingRelease("defaultHostingRelease",
            site_id=default_hosting_site.site_id,
            version_name=default_hosting_version.name,
            message="Test release",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```
        ### Firebasehosting Release In Channel

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_hosting_site = gcp.firebase.HostingSite("defaultHostingSite",
            project="my-project-name",
            site_id="site-with-channel",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_version = gcp.firebase.HostingVersion("defaultHostingVersion",
            site_id=default_hosting_site.site_id,
            config=gcp.firebase.HostingVersionConfigArgs(
                redirects=[gcp.firebase.HostingVersionConfigRedirectArgs(
                    glob="/google/**",
                    status_code=302,
                    location="https://www.google.com",
                )],
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_channel = gcp.firebase.HostingChannel("defaultHostingChannel",
            site_id=default_hosting_site.site_id,
            channel_id="channel-id",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_release = gcp.firebase.HostingRelease("defaultHostingRelease",
            site_id=default_hosting_site.site_id,
            channel_id=default_hosting_channel.channel_id,
            version_name=default_hosting_version.name,
            message="Test release in channel",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```
        ### Firebasehosting Release Disable

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_hosting_site = gcp.firebase.HostingSite("defaultHostingSite",
            project="my-project-name",
            site_id="site-id",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_release = gcp.firebase.HostingRelease("defaultHostingRelease",
            site_id=default_hosting_site.site_id,
            type="SITE_DISABLE",
            message="Take down site",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        Release can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default sites/{{site_id}}/channels/{{channel_id}}/releases/{{release_id}}
        ```

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default sites/{{site_id}}/releases/{{release_id}}
        ```

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default {{site_id}}/{{channel_id}}/{{release_id}}
        ```

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default {{site_id}}/{{release_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] channel_id: The ID of the channel to which the release belongs. If not provided, the release will
               belong to the default "live" channel
        :param pulumi.Input[str] message: The deploy description when the release was created. The value can be up to 512 characters.
        :param pulumi.Input[str] site_id: Required. The ID of the site to which the release belongs.
        :param pulumi.Input[str] type: The type of the release; indicates what happened to the content of the site. There is no need to specify
               `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
               DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
               ROLLBACK: The release points back to a previously deployed version. Output only.
               SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
               Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        :param pulumi.Input[str] version_name: The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
               The content of the version specified will be actively displayed on the appropriate URL.
               The Version must belong to the same site as in the `site_id`.
               This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HostingReleaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Firebasehosting Release In Site

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_hosting_site = gcp.firebase.HostingSite("defaultHostingSite",
            project="my-project-name",
            site_id="site-id",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_version = gcp.firebase.HostingVersion("defaultHostingVersion",
            site_id=default_hosting_site.site_id,
            config=gcp.firebase.HostingVersionConfigArgs(
                redirects=[gcp.firebase.HostingVersionConfigRedirectArgs(
                    glob="/google/**",
                    status_code=302,
                    location="https://www.google.com",
                )],
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_release = gcp.firebase.HostingRelease("defaultHostingRelease",
            site_id=default_hosting_site.site_id,
            version_name=default_hosting_version.name,
            message="Test release",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```
        ### Firebasehosting Release In Channel

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_hosting_site = gcp.firebase.HostingSite("defaultHostingSite",
            project="my-project-name",
            site_id="site-with-channel",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_version = gcp.firebase.HostingVersion("defaultHostingVersion",
            site_id=default_hosting_site.site_id,
            config=gcp.firebase.HostingVersionConfigArgs(
                redirects=[gcp.firebase.HostingVersionConfigRedirectArgs(
                    glob="/google/**",
                    status_code=302,
                    location="https://www.google.com",
                )],
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_channel = gcp.firebase.HostingChannel("defaultHostingChannel",
            site_id=default_hosting_site.site_id,
            channel_id="channel-id",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_release = gcp.firebase.HostingRelease("defaultHostingRelease",
            site_id=default_hosting_site.site_id,
            channel_id=default_hosting_channel.channel_id,
            version_name=default_hosting_version.name,
            message="Test release in channel",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```
        ### Firebasehosting Release Disable

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default_hosting_site = gcp.firebase.HostingSite("defaultHostingSite",
            project="my-project-name",
            site_id="site-id",
            opts=pulumi.ResourceOptions(provider=google_beta))
        default_hosting_release = gcp.firebase.HostingRelease("defaultHostingRelease",
            site_id=default_hosting_site.site_id,
            type="SITE_DISABLE",
            message="Take down site",
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        Release can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default sites/{{site_id}}/channels/{{channel_id}}/releases/{{release_id}}
        ```

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default sites/{{site_id}}/releases/{{release_id}}
        ```

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default {{site_id}}/{{channel_id}}/{{release_id}}
        ```

        ```sh
         $ pulumi import gcp:firebase/hostingRelease:HostingRelease default {{site_id}}/{{release_id}}
        ```

        :param str resource_name: The name of the resource.
        :param HostingReleaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HostingReleaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 channel_id: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HostingReleaseArgs.__new__(HostingReleaseArgs)

            __props__.__dict__["channel_id"] = channel_id
            __props__.__dict__["message"] = message
            if site_id is None and not opts.urn:
                raise TypeError("Missing required property 'site_id'")
            __props__.__dict__["site_id"] = site_id
            __props__.__dict__["type"] = type
            __props__.__dict__["version_name"] = version_name
            __props__.__dict__["name"] = None
            __props__.__dict__["release_id"] = None
        super(HostingRelease, __self__).__init__(
            'gcp:firebase/hostingRelease:HostingRelease',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            channel_id: Optional[pulumi.Input[str]] = None,
            message: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            release_id: Optional[pulumi.Input[str]] = None,
            site_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            version_name: Optional[pulumi.Input[str]] = None) -> 'HostingRelease':
        """
        Get an existing HostingRelease resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] channel_id: The ID of the channel to which the release belongs. If not provided, the release will
               belong to the default "live" channel
        :param pulumi.Input[str] message: The deploy description when the release was created. The value can be up to 512 characters.
        :param pulumi.Input[str] name: The unique identifier for the release, in either of the following formats:
               sites/SITE_ID/releases/RELEASE_ID
               sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
        :param pulumi.Input[str] release_id: The unique identifier for the Release.
        :param pulumi.Input[str] site_id: Required. The ID of the site to which the release belongs.
        :param pulumi.Input[str] type: The type of the release; indicates what happened to the content of the site. There is no need to specify
               `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
               DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
               ROLLBACK: The release points back to a previously deployed version. Output only.
               SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
               Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        :param pulumi.Input[str] version_name: The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
               The content of the version specified will be actively displayed on the appropriate URL.
               The Version must belong to the same site as in the `site_id`.
               This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HostingReleaseState.__new__(_HostingReleaseState)

        __props__.__dict__["channel_id"] = channel_id
        __props__.__dict__["message"] = message
        __props__.__dict__["name"] = name
        __props__.__dict__["release_id"] = release_id
        __props__.__dict__["site_id"] = site_id
        __props__.__dict__["type"] = type
        __props__.__dict__["version_name"] = version_name
        return HostingRelease(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="channelId")
    def channel_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the channel to which the release belongs. If not provided, the release will
        belong to the default "live" channel
        """
        return pulumi.get(self, "channel_id")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[Optional[str]]:
        """
        The deploy description when the release was created. The value can be up to 512 characters.
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The unique identifier for the release, in either of the following formats:
        sites/SITE_ID/releases/RELEASE_ID
        sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="releaseId")
    def release_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the Release.
        """
        return pulumi.get(self, "release_id")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Output[str]:
        """
        Required. The ID of the site to which the release belongs.
        """
        return pulumi.get(self, "site_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the release; indicates what happened to the content of the site. There is no need to specify
        `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
        DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
        ROLLBACK: The release points back to a previously deployed version. Output only.
        SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
        Possible values are `DEPLOY`, `ROLLBACK`, and `SITE_DISABLE`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> pulumi.Output[Optional[str]]:
        """
        The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
        The content of the version specified will be actively displayed on the appropriate URL.
        The Version must belong to the same site as in the `site_id`.
        This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
        """
        return pulumi.get(self, "version_name")
