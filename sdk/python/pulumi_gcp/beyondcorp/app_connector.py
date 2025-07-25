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

__all__ = ['AppConnectorArgs', 'AppConnector']

@pulumi.input_type
class AppConnectorArgs:
    def __init__(__self__, *,
                 principal_info: pulumi.Input['AppConnectorPrincipalInfoArgs'],
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a AppConnector resource.
        :param pulumi.Input['AppConnectorPrincipalInfoArgs'] principal_info: Principal information about the Identity of the AppConnector.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] display_name: An arbitrary user-provided name for the AppConnector.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Resource labels to represent user provided metadata.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: ID of the AppConnector.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the AppConnector.
        """
        pulumi.set(__self__, "principal_info", principal_info)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter(name="principalInfo")
    def principal_info(self) -> pulumi.Input['AppConnectorPrincipalInfoArgs']:
        """
        Principal information about the Identity of the AppConnector.
        Structure is documented below.
        """
        return pulumi.get(self, "principal_info")

    @principal_info.setter
    def principal_info(self, value: pulumi.Input['AppConnectorPrincipalInfoArgs']):
        pulumi.set(self, "principal_info", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An arbitrary user-provided name for the AppConnector.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Resource labels to represent user provided metadata.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the AppConnector.
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
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region of the AppConnector.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _AppConnectorState:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 principal_info: Optional[pulumi.Input['AppConnectorPrincipalInfoArgs']] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppConnector resources.
        :param pulumi.Input[_builtins.str] display_name: An arbitrary user-provided name for the AppConnector.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Resource labels to represent user provided metadata.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: ID of the AppConnector.
        :param pulumi.Input['AppConnectorPrincipalInfoArgs'] principal_info: Principal information about the Identity of the AppConnector.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] region: The region of the AppConnector.
        :param pulumi.Input[_builtins.str] state: Represents the different states of a AppConnector.
        """
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if effective_labels is not None:
            pulumi.set(__self__, "effective_labels", effective_labels)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if principal_info is not None:
            pulumi.set(__self__, "principal_info", principal_info)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if pulumi_labels is not None:
            pulumi.set(__self__, "pulumi_labels", pulumi_labels)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An arbitrary user-provided name for the AppConnector.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @effective_labels.setter
    def effective_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "effective_labels", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Resource labels to represent user provided metadata.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the AppConnector.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="principalInfo")
    def principal_info(self) -> Optional[pulumi.Input['AppConnectorPrincipalInfoArgs']]:
        """
        Principal information about the Identity of the AppConnector.
        Structure is documented below.
        """
        return pulumi.get(self, "principal_info")

    @principal_info.setter
    def principal_info(self, value: Optional[pulumi.Input['AppConnectorPrincipalInfoArgs']]):
        pulumi.set(self, "principal_info", value)

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
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The combination of labels configured directly on the resource
        and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @pulumi_labels.setter
    def pulumi_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "pulumi_labels", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region of the AppConnector.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Represents the different states of a AppConnector.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)


@pulumi.type_token("gcp:beyondcorp/appConnector:AppConnector")
class AppConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 principal_info: Optional[pulumi.Input[Union['AppConnectorPrincipalInfoArgs', 'AppConnectorPrincipalInfoArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        A BeyondCorp AppConnector resource represents an application facing component deployed proximal to
        and with direct access to the application instances. It is used to establish connectivity between the
        remote enterprise environment and GCP. It initiates connections to the applications and can proxy the
        data from users over the connection.

        To get more information about AppConnector, see:

        * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnectors)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)

        ## Example Usage

        ### Beyondcorp App Connector Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.serviceaccount.Account("service_account",
            account_id="my-account",
            display_name="Test Service Account")
        app_connector = gcp.beyondcorp.AppConnector("app_connector",
            name="my-app-connector",
            principal_info={
                "service_account": {
                    "email": service_account.email,
                },
            })
        ```
        ### Beyondcorp App Connector Full

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.serviceaccount.Account("service_account",
            account_id="my-account",
            display_name="Test Service Account")
        app_connector = gcp.beyondcorp.AppConnector("app_connector",
            name="my-app-connector",
            region="us-central1",
            display_name="some display name",
            principal_info={
                "service_account": {
                    "email": service_account.email,
                },
            },
            labels={
                "foo": "bar",
                "bar": "baz",
            })
        ```

        ## Import

        AppConnector can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{region}}/appConnectors/{{name}}`

        * `{{project}}/{{region}}/{{name}}`

        * `{{region}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, AppConnector can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default projects/{{project}}/locations/{{region}}/appConnectors/{{name}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{project}}/{{region}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{region}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: An arbitrary user-provided name for the AppConnector.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Resource labels to represent user provided metadata.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: ID of the AppConnector.
        :param pulumi.Input[Union['AppConnectorPrincipalInfoArgs', 'AppConnectorPrincipalInfoArgsDict']] principal_info: Principal information about the Identity of the AppConnector.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] region: The region of the AppConnector.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A BeyondCorp AppConnector resource represents an application facing component deployed proximal to
        and with direct access to the application instances. It is used to establish connectivity between the
        remote enterprise environment and GCP. It initiates connections to the applications and can proxy the
        data from users over the connection.

        To get more information about AppConnector, see:

        * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnectors)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)

        ## Example Usage

        ### Beyondcorp App Connector Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.serviceaccount.Account("service_account",
            account_id="my-account",
            display_name="Test Service Account")
        app_connector = gcp.beyondcorp.AppConnector("app_connector",
            name="my-app-connector",
            principal_info={
                "service_account": {
                    "email": service_account.email,
                },
            })
        ```
        ### Beyondcorp App Connector Full

        ```python
        import pulumi
        import pulumi_gcp as gcp

        service_account = gcp.serviceaccount.Account("service_account",
            account_id="my-account",
            display_name="Test Service Account")
        app_connector = gcp.beyondcorp.AppConnector("app_connector",
            name="my-app-connector",
            region="us-central1",
            display_name="some display name",
            principal_info={
                "service_account": {
                    "email": service_account.email,
                },
            },
            labels={
                "foo": "bar",
                "bar": "baz",
            })
        ```

        ## Import

        AppConnector can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/{{region}}/appConnectors/{{name}}`

        * `{{project}}/{{region}}/{{name}}`

        * `{{region}}/{{name}}`

        * `{{name}}`

        When using the `pulumi import` command, AppConnector can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default projects/{{project}}/locations/{{region}}/appConnectors/{{name}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{project}}/{{region}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{region}}/{{name}}
        ```

        ```sh
        $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{name}}
        ```

        :param str resource_name: The name of the resource.
        :param AppConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 principal_info: Optional[pulumi.Input[Union['AppConnectorPrincipalInfoArgs', 'AppConnectorPrincipalInfoArgsDict']]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppConnectorArgs.__new__(AppConnectorArgs)

            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if principal_info is None and not opts.urn:
                raise TypeError("Missing required property 'principal_info'")
            __props__.__dict__["principal_info"] = principal_info
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["effective_labels"] = None
            __props__.__dict__["pulumi_labels"] = None
            __props__.__dict__["state"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["effectiveLabels", "pulumiLabels"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AppConnector, __self__).__init__(
            'gcp:beyondcorp/appConnector:AppConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            effective_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            principal_info: Optional[pulumi.Input[Union['AppConnectorPrincipalInfoArgs', 'AppConnectorPrincipalInfoArgsDict']]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            pulumi_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None) -> 'AppConnector':
        """
        Get an existing AppConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: An arbitrary user-provided name for the AppConnector.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] effective_labels: All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: Resource labels to represent user provided metadata.
               
               **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
               Please refer to the field `effective_labels` for all of the labels present on the resource.
        :param pulumi.Input[_builtins.str] name: ID of the AppConnector.
        :param pulumi.Input[Union['AppConnectorPrincipalInfoArgs', 'AppConnectorPrincipalInfoArgsDict']] principal_info: Principal information about the Identity of the AppConnector.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] pulumi_labels: The combination of labels configured directly on the resource
               and default labels configured on the provider.
        :param pulumi.Input[_builtins.str] region: The region of the AppConnector.
        :param pulumi.Input[_builtins.str] state: Represents the different states of a AppConnector.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppConnectorState.__new__(_AppConnectorState)

        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["effective_labels"] = effective_labels
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["principal_info"] = principal_info
        __props__.__dict__["project"] = project
        __props__.__dict__["pulumi_labels"] = pulumi_labels
        __props__.__dict__["region"] = region
        __props__.__dict__["state"] = state
        return AppConnector(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An arbitrary user-provided name for the AppConnector.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="effectiveLabels")
    def effective_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        """
        return pulumi.get(self, "effective_labels")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Resource labels to represent user provided metadata.

        **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        Please refer to the field `effective_labels` for all of the labels present on the resource.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        ID of the AppConnector.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="principalInfo")
    def principal_info(self) -> pulumi.Output['outputs.AppConnectorPrincipalInfo']:
        """
        Principal information about the Identity of the AppConnector.
        Structure is documented below.
        """
        return pulumi.get(self, "principal_info")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="pulumiLabels")
    def pulumi_labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        The combination of labels configured directly on the resource
        and default labels configured on the provider.
        """
        return pulumi.get(self, "pulumi_labels")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The region of the AppConnector.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        Represents the different states of a AppConnector.
        """
        return pulumi.get(self, "state")

