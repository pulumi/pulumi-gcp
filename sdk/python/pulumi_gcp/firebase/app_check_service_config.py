# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['AppCheckServiceConfigArgs', 'AppCheckServiceConfig']

@pulumi.input_type
class AppCheckServiceConfigArgs:
    def __init__(__self__, *,
                 service_id: pulumi.Input[builtins.str],
                 enforcement_mode: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a AppCheckServiceConfig resource.
        :param pulumi.Input[builtins.str] service_id: The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
               firebasestorage.googleapis.com (Cloud Storage for Firebase)
               firebasedatabase.googleapis.com (Firebase Realtime Database)
               firestore.googleapis.com (Cloud Firestore)
               identitytoolkit.googleapis.com (Authentication)
        :param pulumi.Input[builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        pulumi.set(__self__, "service_id", service_id)
        if enforcement_mode is not None:
            pulumi.set(__self__, "enforcement_mode", enforcement_mode)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[builtins.str]:
        """
        The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
        firebasestorage.googleapis.com (Cloud Storage for Firebase)
        firebasedatabase.googleapis.com (Firebase Realtime Database)
        firestore.googleapis.com (Cloud Firestore)
        identitytoolkit.googleapis.com (Authentication)
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="enforcementMode")
    def enforcement_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "enforcement_mode")

    @enforcement_mode.setter
    def enforcement_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "enforcement_mode", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _AppCheckServiceConfigState:
    def __init__(__self__, *,
                 enforcement_mode: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppCheckServiceConfig resources.
        :param pulumi.Input[builtins.str] name: The fully-qualified resource name of the service enforcement configuration.
        :param pulumi.Input[builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[builtins.str] service_id: The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
               firebasestorage.googleapis.com (Cloud Storage for Firebase)
               firebasedatabase.googleapis.com (Firebase Realtime Database)
               firestore.googleapis.com (Cloud Firestore)
               identitytoolkit.googleapis.com (Authentication)
        """
        if enforcement_mode is not None:
            pulumi.set(__self__, "enforcement_mode", enforcement_mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter(name="enforcementMode")
    def enforcement_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "enforcement_mode")

    @enforcement_mode.setter
    def enforcement_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "enforcement_mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully-qualified resource name of the service enforcement configuration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
        firebasestorage.googleapis.com (Cloud Storage for Firebase)
        firebasedatabase.googleapis.com (Firebase Realtime Database)
        firestore.googleapis.com (Cloud Firestore)
        identitytoolkit.googleapis.com (Authentication)
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "service_id", value)


@pulumi.type_token("gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig")
class AppCheckServiceConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enforcement_mode: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        The enforcement configuration for a service supported by App Check.

        To get more information about ServiceConfig, see:

        * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.services)
        * How-to Guides
            * [Official Documentation](https://firebase.google.com/docs/app-check)

        ## Example Usage

        ### Firebase App Check Service Config Off

        ```python
        import pulumi
        import pulumi_gcp as gcp

        appcheck = gcp.projects.Service("appcheck",
            project="my-project-name",
            service="firebaseappcheck.googleapis.com",
            disable_on_destroy=False)
        default = gcp.firebase.AppCheckServiceConfig("default",
            project="my-project-name",
            service_id="firestore.googleapis.com",
            opts = pulumi.ResourceOptions(depends_on=[appcheck]))
        ```
        ### Firebase App Check Service Config Enforced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        appcheck = gcp.projects.Service("appcheck",
            project="my-project-name",
            service="firebaseappcheck.googleapis.com",
            disable_on_destroy=False)
        default = gcp.firebase.AppCheckServiceConfig("default",
            project="my-project-name",
            service_id="firebasestorage.googleapis.com",
            enforcement_mode="ENFORCED",
            opts = pulumi.ResourceOptions(depends_on=[appcheck]))
        ```
        ### Firebase App Check Service Config Unenforced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        appcheck = gcp.projects.Service("appcheck",
            project="my-project-name",
            service="firebaseappcheck.googleapis.com",
            disable_on_destroy=False)
        default = gcp.firebase.AppCheckServiceConfig("default",
            project="my-project-name",
            service_id="identitytoolkit.googleapis.com",
            enforcement_mode="UNENFORCED",
            opts = pulumi.ResourceOptions(depends_on=[appcheck]))
        ```

        ## Import

        ServiceConfig can be imported using any of these accepted formats:

        * `projects/{{project}}/services/{{service_id}}`

        * `{{project}}/{{service_id}}`

        * `{{service_id}}`

        When using the `pulumi import` command, ServiceConfig can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig default projects/{{project}}/services/{{service_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig default {{project}}/{{service_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig default {{service_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[builtins.str] service_id: The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
               firebasestorage.googleapis.com (Cloud Storage for Firebase)
               firebasedatabase.googleapis.com (Firebase Realtime Database)
               firestore.googleapis.com (Cloud Firestore)
               identitytoolkit.googleapis.com (Authentication)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppCheckServiceConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The enforcement configuration for a service supported by App Check.

        To get more information about ServiceConfig, see:

        * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.services)
        * How-to Guides
            * [Official Documentation](https://firebase.google.com/docs/app-check)

        ## Example Usage

        ### Firebase App Check Service Config Off

        ```python
        import pulumi
        import pulumi_gcp as gcp

        appcheck = gcp.projects.Service("appcheck",
            project="my-project-name",
            service="firebaseappcheck.googleapis.com",
            disable_on_destroy=False)
        default = gcp.firebase.AppCheckServiceConfig("default",
            project="my-project-name",
            service_id="firestore.googleapis.com",
            opts = pulumi.ResourceOptions(depends_on=[appcheck]))
        ```
        ### Firebase App Check Service Config Enforced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        appcheck = gcp.projects.Service("appcheck",
            project="my-project-name",
            service="firebaseappcheck.googleapis.com",
            disable_on_destroy=False)
        default = gcp.firebase.AppCheckServiceConfig("default",
            project="my-project-name",
            service_id="firebasestorage.googleapis.com",
            enforcement_mode="ENFORCED",
            opts = pulumi.ResourceOptions(depends_on=[appcheck]))
        ```
        ### Firebase App Check Service Config Unenforced

        ```python
        import pulumi
        import pulumi_gcp as gcp

        appcheck = gcp.projects.Service("appcheck",
            project="my-project-name",
            service="firebaseappcheck.googleapis.com",
            disable_on_destroy=False)
        default = gcp.firebase.AppCheckServiceConfig("default",
            project="my-project-name",
            service_id="identitytoolkit.googleapis.com",
            enforcement_mode="UNENFORCED",
            opts = pulumi.ResourceOptions(depends_on=[appcheck]))
        ```

        ## Import

        ServiceConfig can be imported using any of these accepted formats:

        * `projects/{{project}}/services/{{service_id}}`

        * `{{project}}/{{service_id}}`

        * `{{service_id}}`

        When using the `pulumi import` command, ServiceConfig can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig default projects/{{project}}/services/{{service_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig default {{project}}/{{service_id}}
        ```

        ```sh
        $ pulumi import gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig default {{service_id}}
        ```

        :param str resource_name: The name of the resource.
        :param AppCheckServiceConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppCheckServiceConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enforcement_mode: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppCheckServiceConfigArgs.__new__(AppCheckServiceConfigArgs)

            __props__.__dict__["enforcement_mode"] = enforcement_mode
            __props__.__dict__["project"] = project
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            __props__.__dict__["name"] = None
        super(AppCheckServiceConfig, __self__).__init__(
            'gcp:firebase/appCheckServiceConfig:AppCheckServiceConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enforcement_mode: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            project: Optional[pulumi.Input[builtins.str]] = None,
            service_id: Optional[pulumi.Input[builtins.str]] = None) -> 'AppCheckServiceConfig':
        """
        Get an existing AppCheckServiceConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] name: The fully-qualified resource name of the service enforcement configuration.
        :param pulumi.Input[builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[builtins.str] service_id: The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
               firebasestorage.googleapis.com (Cloud Storage for Firebase)
               firebasedatabase.googleapis.com (Firebase Realtime Database)
               firestore.googleapis.com (Cloud Firestore)
               identitytoolkit.googleapis.com (Authentication)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppCheckServiceConfigState.__new__(_AppCheckServiceConfigState)

        __props__.__dict__["enforcement_mode"] = enforcement_mode
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["service_id"] = service_id
        return AppCheckServiceConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="enforcementMode")
    def enforcement_mode(self) -> pulumi.Output[Optional[builtins.str]]:
        return pulumi.get(self, "enforcement_mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The fully-qualified resource name of the service enforcement configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[builtins.str]:
        """
        The identifier of the service to configure enforcement. Currently, the following service IDs are supported:
        firebasestorage.googleapis.com (Cloud Storage for Firebase)
        firebasedatabase.googleapis.com (Firebase Realtime Database)
        firestore.googleapis.com (Cloud Firestore)
        identitytoolkit.googleapis.com (Authentication)
        """
        return pulumi.get(self, "service_id")

