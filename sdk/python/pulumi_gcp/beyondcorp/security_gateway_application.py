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

__all__ = ['SecurityGatewayApplicationArgs', 'SecurityGatewayApplication']

@pulumi.input_type
class SecurityGatewayApplicationArgs:
    def __init__(__self__, *,
                 application_id: pulumi.Input[_builtins.str],
                 endpoint_matchers: pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]],
                 security_gateway_id: pulumi.Input[_builtins.str],
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 upstreams: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]]] = None):
        """
        The set of arguments for constructing a SecurityGatewayApplication resource.
        :param pulumi.Input[_builtins.str] application_id: User-settable Application resource ID.
               * Must start with a letter.
               * Must contain between 4-63 characters from `/a-z-/`.
               * Must end with a number or letter.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]] endpoint_matchers: Required. Endpoint matchers associated with an application.
               A combination of hostname and ports as endpoint matcher is used to match
               the application.
               Match conditions for OR logic.
               An array of match conditions to allow for multiple matching criteria.
               The rule is considered a match if one the conditions are met.
               The conditions can be one of the following combination
               (Hostname), (Hostname & Ports)
               EXAMPLES:
               Hostname - ("*.abc.com"), ("xyz.abc.com")
               Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
               Structure is documented below.
        :param pulumi.Input[_builtins.str] security_gateway_id: ID of the Security Gateway resource this belongs to.
        :param pulumi.Input[_builtins.str] display_name: Optional. An arbitrary user-provided name for the Application resource.
               Cannot exceed 64 characters.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]] upstreams: Optional. List of which upstream resource(s) to forward traffic to.
               Structure is documented below.
        """
        pulumi.set(__self__, "application_id", application_id)
        pulumi.set(__self__, "endpoint_matchers", endpoint_matchers)
        pulumi.set(__self__, "security_gateway_id", security_gateway_id)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if upstreams is not None:
            pulumi.set(__self__, "upstreams", upstreams)

    @_builtins.property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Input[_builtins.str]:
        """
        User-settable Application resource ID.
        * Must start with a letter.
        * Must contain between 4-63 characters from `/a-z-/`.
        * Must end with a number or letter.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "application_id", value)

    @_builtins.property
    @pulumi.getter(name="endpointMatchers")
    def endpoint_matchers(self) -> pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]]:
        """
        Required. Endpoint matchers associated with an application.
        A combination of hostname and ports as endpoint matcher is used to match
        the application.
        Match conditions for OR logic.
        An array of match conditions to allow for multiple matching criteria.
        The rule is considered a match if one the conditions are met.
        The conditions can be one of the following combination
        (Hostname), (Hostname & Ports)
        EXAMPLES:
        Hostname - ("*.abc.com"), ("xyz.abc.com")
        Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
        Structure is documented below.
        """
        return pulumi.get(self, "endpoint_matchers")

    @endpoint_matchers.setter
    def endpoint_matchers(self, value: pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]]):
        pulumi.set(self, "endpoint_matchers", value)

    @_builtins.property
    @pulumi.getter(name="securityGatewayId")
    def security_gateway_id(self) -> pulumi.Input[_builtins.str]:
        """
        ID of the Security Gateway resource this belongs to.
        """
        return pulumi.get(self, "security_gateway_id")

    @security_gateway_id.setter
    def security_gateway_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "security_gateway_id", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. An arbitrary user-provided name for the Application resource.
        Cannot exceed 64 characters.
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
    def upstreams(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]]]:
        """
        Optional. List of which upstream resource(s) to forward traffic to.
        Structure is documented below.
        """
        return pulumi.get(self, "upstreams")

    @upstreams.setter
    def upstreams(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]]]):
        pulumi.set(self, "upstreams", value)


@pulumi.input_type
class _SecurityGatewayApplicationState:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_matchers: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 security_gateway_id: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None,
                 upstreams: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]]] = None):
        """
        Input properties used for looking up and filtering SecurityGatewayApplication resources.
        :param pulumi.Input[_builtins.str] application_id: User-settable Application resource ID.
               * Must start with a letter.
               * Must contain between 4-63 characters from `/a-z-/`.
               * Must end with a number or letter.
        :param pulumi.Input[_builtins.str] create_time: Output only. Timestamp when the resource was created.
        :param pulumi.Input[_builtins.str] display_name: Optional. An arbitrary user-provided name for the Application resource.
               Cannot exceed 64 characters.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]] endpoint_matchers: Required. Endpoint matchers associated with an application.
               A combination of hostname and ports as endpoint matcher is used to match
               the application.
               Match conditions for OR logic.
               An array of match conditions to allow for multiple matching criteria.
               The rule is considered a match if one the conditions are met.
               The conditions can be one of the following combination
               (Hostname), (Hostname & Ports)
               EXAMPLES:
               Hostname - ("*.abc.com"), ("xyz.abc.com")
               Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: Identifier. Name of the resource.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] security_gateway_id: ID of the Security Gateway resource this belongs to.
        :param pulumi.Input[_builtins.str] update_time: Output only. Timestamp when the resource was last modified.
        :param pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]] upstreams: Optional. List of which upstream resource(s) to forward traffic to.
               Structure is documented below.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if endpoint_matchers is not None:
            pulumi.set(__self__, "endpoint_matchers", endpoint_matchers)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if security_gateway_id is not None:
            pulumi.set(__self__, "security_gateway_id", security_gateway_id)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)
        if upstreams is not None:
            pulumi.set(__self__, "upstreams", upstreams)

    @_builtins.property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User-settable Application resource ID.
        * Must start with a letter.
        * Must contain between 4-63 characters from `/a-z-/`.
        * Must end with a number or letter.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "application_id", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Timestamp when the resource was created.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional. An arbitrary user-provided name for the Application resource.
        Cannot exceed 64 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="endpointMatchers")
    def endpoint_matchers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]]]:
        """
        Required. Endpoint matchers associated with an application.
        A combination of hostname and ports as endpoint matcher is used to match
        the application.
        Match conditions for OR logic.
        An array of match conditions to allow for multiple matching criteria.
        The rule is considered a match if one the conditions are met.
        The conditions can be one of the following combination
        (Hostname), (Hostname & Ports)
        EXAMPLES:
        Hostname - ("*.abc.com"), ("xyz.abc.com")
        Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
        Structure is documented below.
        """
        return pulumi.get(self, "endpoint_matchers")

    @endpoint_matchers.setter
    def endpoint_matchers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationEndpointMatcherArgs']]]]):
        pulumi.set(self, "endpoint_matchers", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier. Name of the resource.
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
    @pulumi.getter(name="securityGatewayId")
    def security_gateway_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the Security Gateway resource this belongs to.
        """
        return pulumi.get(self, "security_gateway_id")

    @security_gateway_id.setter
    def security_gateway_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "security_gateway_id", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Timestamp when the resource was last modified.
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)

    @_builtins.property
    @pulumi.getter
    def upstreams(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]]]:
        """
        Optional. List of which upstream resource(s) to forward traffic to.
        Structure is documented below.
        """
        return pulumi.get(self, "upstreams")

    @upstreams.setter
    def upstreams(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecurityGatewayApplicationUpstreamArgs']]]]):
        pulumi.set(self, "upstreams", value)


@pulumi.type_token("gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication")
class SecurityGatewayApplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationEndpointMatcherArgs', 'SecurityGatewayApplicationEndpointMatcherArgsDict']]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 security_gateway_id: Optional[pulumi.Input[_builtins.str]] = None,
                 upstreams: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationUpstreamArgs', 'SecurityGatewayApplicationUpstreamArgsDict']]]]] = None,
                 __props__=None):
        """
        Specifies application endpoint(s) to protect behind a Security Gateway.

        ## Example Usage

        ### Beyondcorp Security Gateway Application Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.beyondcorp.SecurityGateway("default",
            security_gateway_id="default-sg",
            display_name="My Security Gateway resource",
            hubs=[{
                "region": "us-central1",
            }])
        example = gcp.beyondcorp.SecurityGatewayApplication("example",
            security_gateway_id=default.security_gateway_id,
            application_id="google-sga",
            endpoint_matchers=[{
                "hostname": "google.com",
            }])
        ```
        ### Beyondcorp Security Gateway Application Vpc

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        default = gcp.beyondcorp.SecurityGateway("default",
            security_gateway_id="default-sg",
            display_name="My Security Gateway resource",
            hubs=[{
                "region": "us-central1",
            }])
        example = gcp.beyondcorp.SecurityGatewayApplication("example",
            security_gateway_id=default.security_gateway_id,
            application_id="my-vm-service2",
            endpoint_matchers=[{
                "hostname": "my-vm-service.com",
            }],
            upstreams=[{
                "egress_policy": {
                    "regions": ["us-central1"],
                },
                "network": {
                    "name": f"projects/{project.project_id}/global/networks/default",
                },
            }])
        ```

        ## Import

        SecurityGatewayApplication can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}`

        * `{{project}}/{{security_gateway_id}}/{{application_id}}`

        * `{{security_gateway_id}}/{{application_id}}`

        When using the `pulumi import` command, SecurityGatewayApplication can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default {{project}}/{{security_gateway_id}}/{{application_id}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default {{security_gateway_id}}/{{application_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] application_id: User-settable Application resource ID.
               * Must start with a letter.
               * Must contain between 4-63 characters from `/a-z-/`.
               * Must end with a number or letter.
        :param pulumi.Input[_builtins.str] display_name: Optional. An arbitrary user-provided name for the Application resource.
               Cannot exceed 64 characters.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationEndpointMatcherArgs', 'SecurityGatewayApplicationEndpointMatcherArgsDict']]]] endpoint_matchers: Required. Endpoint matchers associated with an application.
               A combination of hostname and ports as endpoint matcher is used to match
               the application.
               Match conditions for OR logic.
               An array of match conditions to allow for multiple matching criteria.
               The rule is considered a match if one the conditions are met.
               The conditions can be one of the following combination
               (Hostname), (Hostname & Ports)
               EXAMPLES:
               Hostname - ("*.abc.com"), ("xyz.abc.com")
               Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] security_gateway_id: ID of the Security Gateway resource this belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationUpstreamArgs', 'SecurityGatewayApplicationUpstreamArgsDict']]]] upstreams: Optional. List of which upstream resource(s) to forward traffic to.
               Structure is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecurityGatewayApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Specifies application endpoint(s) to protect behind a Security Gateway.

        ## Example Usage

        ### Beyondcorp Security Gateway Application Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        default = gcp.beyondcorp.SecurityGateway("default",
            security_gateway_id="default-sg",
            display_name="My Security Gateway resource",
            hubs=[{
                "region": "us-central1",
            }])
        example = gcp.beyondcorp.SecurityGatewayApplication("example",
            security_gateway_id=default.security_gateway_id,
            application_id="google-sga",
            endpoint_matchers=[{
                "hostname": "google.com",
            }])
        ```
        ### Beyondcorp Security Gateway Application Vpc

        ```python
        import pulumi
        import pulumi_gcp as gcp

        project = gcp.organizations.get_project()
        default = gcp.beyondcorp.SecurityGateway("default",
            security_gateway_id="default-sg",
            display_name="My Security Gateway resource",
            hubs=[{
                "region": "us-central1",
            }])
        example = gcp.beyondcorp.SecurityGatewayApplication("example",
            security_gateway_id=default.security_gateway_id,
            application_id="my-vm-service2",
            endpoint_matchers=[{
                "hostname": "my-vm-service.com",
            }],
            upstreams=[{
                "egress_policy": {
                    "regions": ["us-central1"],
                },
                "network": {
                    "name": f"projects/{project.project_id}/global/networks/default",
                },
            }])
        ```

        ## Import

        SecurityGatewayApplication can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}`

        * `{{project}}/{{security_gateway_id}}/{{application_id}}`

        * `{{security_gateway_id}}/{{application_id}}`

        When using the `pulumi import` command, SecurityGatewayApplication can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default {{project}}/{{security_gateway_id}}/{{application_id}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default {{security_gateway_id}}/{{application_id}}
        ```

        :param str resource_name: The name of the resource.
        :param SecurityGatewayApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityGatewayApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 endpoint_matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationEndpointMatcherArgs', 'SecurityGatewayApplicationEndpointMatcherArgsDict']]]]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 security_gateway_id: Optional[pulumi.Input[_builtins.str]] = None,
                 upstreams: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationUpstreamArgs', 'SecurityGatewayApplicationUpstreamArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityGatewayApplicationArgs.__new__(SecurityGatewayApplicationArgs)

            if application_id is None and not opts.urn:
                raise TypeError("Missing required property 'application_id'")
            __props__.__dict__["application_id"] = application_id
            __props__.__dict__["display_name"] = display_name
            if endpoint_matchers is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_matchers'")
            __props__.__dict__["endpoint_matchers"] = endpoint_matchers
            __props__.__dict__["project"] = project
            if security_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_gateway_id'")
            __props__.__dict__["security_gateway_id"] = security_gateway_id
            __props__.__dict__["upstreams"] = upstreams
            __props__.__dict__["create_time"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["update_time"] = None
        super(SecurityGatewayApplication, __self__).__init__(
            'gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_id: Optional[pulumi.Input[_builtins.str]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            endpoint_matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationEndpointMatcherArgs', 'SecurityGatewayApplicationEndpointMatcherArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            security_gateway_id: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None,
            upstreams: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationUpstreamArgs', 'SecurityGatewayApplicationUpstreamArgsDict']]]]] = None) -> 'SecurityGatewayApplication':
        """
        Get an existing SecurityGatewayApplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] application_id: User-settable Application resource ID.
               * Must start with a letter.
               * Must contain between 4-63 characters from `/a-z-/`.
               * Must end with a number or letter.
        :param pulumi.Input[_builtins.str] create_time: Output only. Timestamp when the resource was created.
        :param pulumi.Input[_builtins.str] display_name: Optional. An arbitrary user-provided name for the Application resource.
               Cannot exceed 64 characters.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationEndpointMatcherArgs', 'SecurityGatewayApplicationEndpointMatcherArgsDict']]]] endpoint_matchers: Required. Endpoint matchers associated with an application.
               A combination of hostname and ports as endpoint matcher is used to match
               the application.
               Match conditions for OR logic.
               An array of match conditions to allow for multiple matching criteria.
               The rule is considered a match if one the conditions are met.
               The conditions can be one of the following combination
               (Hostname), (Hostname & Ports)
               EXAMPLES:
               Hostname - ("*.abc.com"), ("xyz.abc.com")
               Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: Identifier. Name of the resource.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] security_gateway_id: ID of the Security Gateway resource this belongs to.
        :param pulumi.Input[_builtins.str] update_time: Output only. Timestamp when the resource was last modified.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecurityGatewayApplicationUpstreamArgs', 'SecurityGatewayApplicationUpstreamArgsDict']]]] upstreams: Optional. List of which upstream resource(s) to forward traffic to.
               Structure is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityGatewayApplicationState.__new__(_SecurityGatewayApplicationState)

        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["endpoint_matchers"] = endpoint_matchers
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["security_gateway_id"] = security_gateway_id
        __props__.__dict__["update_time"] = update_time
        __props__.__dict__["upstreams"] = upstreams
        return SecurityGatewayApplication(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[_builtins.str]:
        """
        User-settable Application resource ID.
        * Must start with a letter.
        * Must contain between 4-63 characters from `/a-z-/`.
        * Must end with a number or letter.
        """
        return pulumi.get(self, "application_id")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Timestamp when the resource was created.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional. An arbitrary user-provided name for the Application resource.
        Cannot exceed 64 characters.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="endpointMatchers")
    def endpoint_matchers(self) -> pulumi.Output[Sequence['outputs.SecurityGatewayApplicationEndpointMatcher']]:
        """
        Required. Endpoint matchers associated with an application.
        A combination of hostname and ports as endpoint matcher is used to match
        the application.
        Match conditions for OR logic.
        An array of match conditions to allow for multiple matching criteria.
        The rule is considered a match if one the conditions are met.
        The conditions can be one of the following combination
        (Hostname), (Hostname & Ports)
        EXAMPLES:
        Hostname - ("*.abc.com"), ("xyz.abc.com")
        Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
        Structure is documented below.
        """
        return pulumi.get(self, "endpoint_matchers")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier. Name of the resource.
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
    @pulumi.getter(name="securityGatewayId")
    def security_gateway_id(self) -> pulumi.Output[_builtins.str]:
        """
        ID of the Security Gateway resource this belongs to.
        """
        return pulumi.get(self, "security_gateway_id")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Timestamp when the resource was last modified.
        """
        return pulumi.get(self, "update_time")

    @_builtins.property
    @pulumi.getter
    def upstreams(self) -> pulumi.Output[Optional[Sequence['outputs.SecurityGatewayApplicationUpstream']]]:
        """
        Optional. List of which upstream resource(s) to forward traffic to.
        Structure is documented below.
        """
        return pulumi.get(self, "upstreams")

