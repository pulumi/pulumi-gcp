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

__all__ = ['AppCheckDebugTokenArgs', 'AppCheckDebugToken']

@pulumi.input_type
class AppCheckDebugTokenArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[_builtins.str],
                 display_name: pulumi.Input[_builtins.str],
                 token: pulumi.Input[_builtins.str],
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a AppCheckDebugToken resource.
        :param pulumi.Input[_builtins.str] app_id: The ID of a
               [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
               [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
               or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        :param pulumi.Input[_builtins.str] display_name: A human readable display name used to identify this debug token.
        :param pulumi.Input[_builtins.str] token: The secret token itself. Must be provided during creation, and must be a UUID4,
               case insensitive. You may use a method of your choice such as random/random_uuid
               to generate the token.
               This field is immutable once set, and cannot be updated. You can, however, delete
               this debug token to revoke it.
               For security reasons, this field will never be populated in any response.
               **Note**: This property is sensitive and will not be displayed in the plan.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "app_id", app_id)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "token", token)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of a
        [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
        [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
        or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "app_id", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        A human readable display name used to identify this debug token.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Input[_builtins.str]:
        """
        The secret token itself. Must be provided during creation, and must be a UUID4,
        case insensitive. You may use a method of your choice such as random/random_uuid
        to generate the token.
        This field is immutable once set, and cannot be updated. You can, however, delete
        this debug token to revoke it.
        For security reasons, this field will never be populated in any response.
        **Note**: This property is sensitive and will not be displayed in the plan.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "token", value)

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
class _AppCheckDebugTokenState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 debug_token_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppCheckDebugToken resources.
        :param pulumi.Input[_builtins.str] app_id: The ID of a
               [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
               [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
               or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        :param pulumi.Input[_builtins.str] debug_token_id: The last segment of the resource name of the debug token.
        :param pulumi.Input[_builtins.str] display_name: A human readable display name used to identify this debug token.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] token: The secret token itself. Must be provided during creation, and must be a UUID4,
               case insensitive. You may use a method of your choice such as random/random_uuid
               to generate the token.
               This field is immutable once set, and cannot be updated. You can, however, delete
               this debug token to revoke it.
               For security reasons, this field will never be populated in any response.
               **Note**: This property is sensitive and will not be displayed in the plan.
        """
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if debug_token_id is not None:
            pulumi.set(__self__, "debug_token_id", debug_token_id)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if token is not None:
            pulumi.set(__self__, "token", token)

    @_builtins.property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of a
        [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
        [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
        or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "app_id", value)

    @_builtins.property
    @pulumi.getter(name="debugTokenId")
    def debug_token_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The last segment of the resource name of the debug token.
        """
        return pulumi.get(self, "debug_token_id")

    @debug_token_id.setter
    def debug_token_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "debug_token_id", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A human readable display name used to identify this debug token.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

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
    def token(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secret token itself. Must be provided during creation, and must be a UUID4,
        case insensitive. You may use a method of your choice such as random/random_uuid
        to generate the token.
        This field is immutable once set, and cannot be updated. You can, however, delete
        this debug token to revoke it.
        For security reasons, this field will never be populated in any response.
        **Note**: This property is sensitive and will not be displayed in the plan.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "token", value)


@pulumi.type_token("gcp:firebase/appCheckDebugToken:AppCheckDebugToken")
class AppCheckDebugToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A debug token is a secret used during the development or integration testing of
        an app. It essentially allows the development or integration testing to bypass
        app attestation while still allowing App Check to enforce protection on supported
        production Firebase services.

        To get more information about DebugToken, see:

        * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.debugTokens)
        * How-to Guides
            * [Official Documentation](https://firebase.google.com/docs/app-check)

        ## Example Usage

        ### Firebase App Check Debug Token Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_time as time

        default = gcp.firebase.WebApp("default",
            project="my-project-name",
            display_name="Web App for debug token")
        # It takes a while for App Check to recognize the new app
        # If your app already exists, you don't have to wait 30 seconds.
        wait30s = time.index.Sleep("wait_30s", create_duration=30s,
        opts = pulumi.ResourceOptions(depends_on=[default]))
        default_app_check_debug_token = gcp.firebase.AppCheckDebugToken("default",
            project="my-project-name",
            app_id=default.app_id,
            display_name="Debug Token",
            token="00000000-AAAA-BBBB-CCCC-000000000000",
            opts = pulumi.ResourceOptions(depends_on=[wait30s]))
        ```

        ## Import

        DebugToken can be imported using any of these accepted formats:

        * `projects/{{project}}/apps/{{app_id}}/debugTokens/{{debug_token_id}}`

        * `{{project}}/{{app_id}}/{{debug_token_id}}`

        * `{{app_id}}/{{debug_token_id}}`

        When using the `pulumi import` command, DebugToken can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:firebase/appCheckDebugToken:AppCheckDebugToken default projects/{{project}}/apps/{{app_id}}/debugTokens/{{debug_token_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckDebugToken:AppCheckDebugToken default {{project}}/{{app_id}}/{{debug_token_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckDebugToken:AppCheckDebugToken default {{app_id}}/{{debug_token_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] app_id: The ID of a
               [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
               [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
               or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        :param pulumi.Input[_builtins.str] display_name: A human readable display name used to identify this debug token.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] token: The secret token itself. Must be provided during creation, and must be a UUID4,
               case insensitive. You may use a method of your choice such as random/random_uuid
               to generate the token.
               This field is immutable once set, and cannot be updated. You can, however, delete
               this debug token to revoke it.
               For security reasons, this field will never be populated in any response.
               **Note**: This property is sensitive and will not be displayed in the plan.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppCheckDebugTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A debug token is a secret used during the development or integration testing of
        an app. It essentially allows the development or integration testing to bypass
        app attestation while still allowing App Check to enforce protection on supported
        production Firebase services.

        To get more information about DebugToken, see:

        * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.debugTokens)
        * How-to Guides
            * [Official Documentation](https://firebase.google.com/docs/app-check)

        ## Example Usage

        ### Firebase App Check Debug Token Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_time as time

        default = gcp.firebase.WebApp("default",
            project="my-project-name",
            display_name="Web App for debug token")
        # It takes a while for App Check to recognize the new app
        # If your app already exists, you don't have to wait 30 seconds.
        wait30s = time.index.Sleep("wait_30s", create_duration=30s,
        opts = pulumi.ResourceOptions(depends_on=[default]))
        default_app_check_debug_token = gcp.firebase.AppCheckDebugToken("default",
            project="my-project-name",
            app_id=default.app_id,
            display_name="Debug Token",
            token="00000000-AAAA-BBBB-CCCC-000000000000",
            opts = pulumi.ResourceOptions(depends_on=[wait30s]))
        ```

        ## Import

        DebugToken can be imported using any of these accepted formats:

        * `projects/{{project}}/apps/{{app_id}}/debugTokens/{{debug_token_id}}`

        * `{{project}}/{{app_id}}/{{debug_token_id}}`

        * `{{app_id}}/{{debug_token_id}}`

        When using the `pulumi import` command, DebugToken can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:firebase/appCheckDebugToken:AppCheckDebugToken default projects/{{project}}/apps/{{app_id}}/debugTokens/{{debug_token_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckDebugToken:AppCheckDebugToken default {{project}}/{{app_id}}/{{debug_token_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckDebugToken:AppCheckDebugToken default {{app_id}}/{{debug_token_id}}
        ```

        :param str resource_name: The name of the resource.
        :param AppCheckDebugTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppCheckDebugTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppCheckDebugTokenArgs.__new__(AppCheckDebugTokenArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["project"] = project
            if token is None and not opts.urn:
                raise TypeError("Missing required property 'token'")
            __props__.__dict__["token"] = None if token is None else pulumi.Output.secret(token)
            __props__.__dict__["debug_token_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AppCheckDebugToken, __self__).__init__(
            'gcp:firebase/appCheckDebugToken:AppCheckDebugToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[_builtins.str]] = None,
            debug_token_id: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            token: Optional[pulumi.Input[_builtins.str]] = None) -> 'AppCheckDebugToken':
        """
        Get an existing AppCheckDebugToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] app_id: The ID of a
               [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
               [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
               or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        :param pulumi.Input[_builtins.str] debug_token_id: The last segment of the resource name of the debug token.
        :param pulumi.Input[_builtins.str] display_name: A human readable display name used to identify this debug token.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] token: The secret token itself. Must be provided during creation, and must be a UUID4,
               case insensitive. You may use a method of your choice such as random/random_uuid
               to generate the token.
               This field is immutable once set, and cannot be updated. You can, however, delete
               this debug token to revoke it.
               For security reasons, this field will never be populated in any response.
               **Note**: This property is sensitive and will not be displayed in the plan.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppCheckDebugTokenState.__new__(_AppCheckDebugTokenState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["debug_token_id"] = debug_token_id
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["project"] = project
        __props__.__dict__["token"] = token
        return AppCheckDebugToken(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of a
        [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
        [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
        or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
        """
        return pulumi.get(self, "app_id")

    @_builtins.property
    @pulumi.getter(name="debugTokenId")
    def debug_token_id(self) -> pulumi.Output[_builtins.str]:
        """
        The last segment of the resource name of the debug token.
        """
        return pulumi.get(self, "debug_token_id")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        A human readable display name used to identify this debug token.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Output[_builtins.str]:
        """
        The secret token itself. Must be provided during creation, and must be a UUID4,
        case insensitive. You may use a method of your choice such as random/random_uuid
        to generate the token.
        This field is immutable once set, and cannot be updated. You can, however, delete
        this debug token to revoke it.
        For security reasons, this field will never be populated in any response.
        **Note**: This property is sensitive and will not be displayed in the plan.
        """
        return pulumi.get(self, "token")

