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

__all__ = ['ServiceProjectAttachmentArgs', 'ServiceProjectAttachment']

@pulumi.input_type
class ServiceProjectAttachmentArgs:
    def __init__(__self__, *,
                 service_project_attachment_id: pulumi.Input[_builtins.str],
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ServiceProjectAttachment resource.
        :param pulumi.Input[_builtins.str] service_project_attachment_id: Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] service_project: "Immutable. Service project name in the format: \\"projects/abc\\"
               or \\"projects/123\\". As input, project name with either project id or number
               are accepted. As output, this field will contain project number."
        """
        pulumi.set(__self__, "service_project_attachment_id", service_project_attachment_id)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service_project is not None:
            pulumi.set(__self__, "service_project", service_project)

    @_builtins.property
    @pulumi.getter(name="serviceProjectAttachmentId")
    def service_project_attachment_id(self) -> pulumi.Input[_builtins.str]:
        """
        Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        """
        return pulumi.get(self, "service_project_attachment_id")

    @service_project_attachment_id.setter
    def service_project_attachment_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "service_project_attachment_id", value)

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
    @pulumi.getter(name="serviceProject")
    def service_project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        "Immutable. Service project name in the format: \\"projects/abc\\"
        or \\"projects/123\\". As input, project name with either project id or number
        are accepted. As output, this field will contain project number."
        """
        return pulumi.get(self, "service_project")

    @service_project.setter
    def service_project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_project", value)


@pulumi.input_type
class _ServiceProjectAttachmentState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 uid: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ServiceProjectAttachment resources.
        :param pulumi.Input[_builtins.str] create_time: Output only. Create time.
        :param pulumi.Input[_builtins.str] name: "Identifier. The resource name of a ServiceProjectAttachment. Format:\\"projects/{host-project-id}/locations/global/serviceProjectAttachments/{service-project-id}.\\""
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] service_project: "Immutable. Service project name in the format: \\"projects/abc\\"
               or \\"projects/123\\". As input, project name with either project id or number
               are accepted. As output, this field will contain project number."
        :param pulumi.Input[_builtins.str] service_project_attachment_id: Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        :param pulumi.Input[_builtins.str] state: ServiceProjectAttachment state.
        :param pulumi.Input[_builtins.str] uid: Output only. A globally unique identifier (in UUID4 format) for the `ServiceProjectAttachment`.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service_project is not None:
            pulumi.set(__self__, "service_project", service_project)
        if service_project_attachment_id is not None:
            pulumi.set(__self__, "service_project_attachment_id", service_project_attachment_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if uid is not None:
            pulumi.set(__self__, "uid", uid)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. Create time.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        "Identifier. The resource name of a ServiceProjectAttachment. Format:\\"projects/{host-project-id}/locations/global/serviceProjectAttachments/{service-project-id}.\\""
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
    @pulumi.getter(name="serviceProject")
    def service_project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        "Immutable. Service project name in the format: \\"projects/abc\\"
        or \\"projects/123\\". As input, project name with either project id or number
        are accepted. As output, this field will contain project number."
        """
        return pulumi.get(self, "service_project")

    @service_project.setter
    def service_project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_project", value)

    @_builtins.property
    @pulumi.getter(name="serviceProjectAttachmentId")
    def service_project_attachment_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        """
        return pulumi.get(self, "service_project_attachment_id")

    @service_project_attachment_id.setter
    def service_project_attachment_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_project_attachment_id", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ServiceProjectAttachment state.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Output only. A globally unique identifier (in UUID4 format) for the `ServiceProjectAttachment`.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "uid", value)


@pulumi.type_token("gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment")
class ServiceProjectAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Represents a Service project attachment to the Host Project.

        ## Example Usage

        ### Service Project Attachment Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_time as time

        service_project = gcp.organizations.Project("service_project",
            project_id="project-1",
            name="Service Project",
            org_id="123456789",
            deletion_policy="DELETE")
        wait120s = time.index.Sleep("wait_120s", create_duration=120s,
        opts = pulumi.ResourceOptions(depends_on=[service_project]))
        example = gcp.apphub.ServiceProjectAttachment("example", service_project_attachment_id=service_project.project_id,
        opts = pulumi.ResourceOptions(depends_on=[wait120s]))
        ```
        ### Service Project Attachment Full

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_time as time

        service_project_full = gcp.organizations.Project("service_project_full",
            project_id="project-1",
            name="Service Project Full",
            org_id="123456789",
            deletion_policy="DELETE")
        wait120s = time.index.Sleep("wait_120s", create_duration=120s,
        opts = pulumi.ResourceOptions(depends_on=[service_project_full]))
        example2 = gcp.apphub.ServiceProjectAttachment("example2",
            service_project_attachment_id=service_project_full.project_id,
            service_project=service_project_full.project_id,
            opts = pulumi.ResourceOptions(depends_on=[wait120s]))
        ```

        ## Import

        ServiceProjectAttachment can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/global/serviceProjectAttachments/{{service_project_attachment_id}}`

        * `{{project}}/{{service_project_attachment_id}}`

        * `{{service_project_attachment_id}}`

        When using the `pulumi import` command, ServiceProjectAttachment can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment default projects/{{project}}/locations/global/serviceProjectAttachments/{{service_project_attachment_id}}
        ```

        ```sh
        $ pulumi import gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment default {{project}}/{{service_project_attachment_id}}
        ```

        ```sh
        $ pulumi import gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment default {{service_project_attachment_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] service_project: "Immutable. Service project name in the format: \\"projects/abc\\"
               or \\"projects/123\\". As input, project name with either project id or number
               are accepted. As output, this field will contain project number."
        :param pulumi.Input[_builtins.str] service_project_attachment_id: Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceProjectAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Represents a Service project attachment to the Host Project.

        ## Example Usage

        ### Service Project Attachment Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_time as time

        service_project = gcp.organizations.Project("service_project",
            project_id="project-1",
            name="Service Project",
            org_id="123456789",
            deletion_policy="DELETE")
        wait120s = time.index.Sleep("wait_120s", create_duration=120s,
        opts = pulumi.ResourceOptions(depends_on=[service_project]))
        example = gcp.apphub.ServiceProjectAttachment("example", service_project_attachment_id=service_project.project_id,
        opts = pulumi.ResourceOptions(depends_on=[wait120s]))
        ```
        ### Service Project Attachment Full

        ```python
        import pulumi
        import pulumi_gcp as gcp
        import pulumi_time as time

        service_project_full = gcp.organizations.Project("service_project_full",
            project_id="project-1",
            name="Service Project Full",
            org_id="123456789",
            deletion_policy="DELETE")
        wait120s = time.index.Sleep("wait_120s", create_duration=120s,
        opts = pulumi.ResourceOptions(depends_on=[service_project_full]))
        example2 = gcp.apphub.ServiceProjectAttachment("example2",
            service_project_attachment_id=service_project_full.project_id,
            service_project=service_project_full.project_id,
            opts = pulumi.ResourceOptions(depends_on=[wait120s]))
        ```

        ## Import

        ServiceProjectAttachment can be imported using any of these accepted formats:

        * `projects/{{project}}/locations/global/serviceProjectAttachments/{{service_project_attachment_id}}`

        * `{{project}}/{{service_project_attachment_id}}`

        * `{{service_project_attachment_id}}`

        When using the `pulumi import` command, ServiceProjectAttachment can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment default projects/{{project}}/locations/global/serviceProjectAttachments/{{service_project_attachment_id}}
        ```

        ```sh
        $ pulumi import gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment default {{project}}/{{service_project_attachment_id}}
        ```

        ```sh
        $ pulumi import gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment default {{service_project_attachment_id}}
        ```

        :param str resource_name: The name of the resource.
        :param ServiceProjectAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceProjectAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project: Optional[pulumi.Input[_builtins.str]] = None,
                 service_project_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceProjectAttachmentArgs.__new__(ServiceProjectAttachmentArgs)

            __props__.__dict__["project"] = project
            __props__.__dict__["service_project"] = service_project
            if service_project_attachment_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_project_attachment_id'")
            __props__.__dict__["service_project_attachment_id"] = service_project_attachment_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uid"] = None
        super(ServiceProjectAttachment, __self__).__init__(
            'gcp:apphub/serviceProjectAttachment:ServiceProjectAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            service_project: Optional[pulumi.Input[_builtins.str]] = None,
            service_project_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None,
            uid: Optional[pulumi.Input[_builtins.str]] = None) -> 'ServiceProjectAttachment':
        """
        Get an existing ServiceProjectAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: Output only. Create time.
        :param pulumi.Input[_builtins.str] name: "Identifier. The resource name of a ServiceProjectAttachment. Format:\\"projects/{host-project-id}/locations/global/serviceProjectAttachments/{service-project-id}.\\""
        :param pulumi.Input[_builtins.str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[_builtins.str] service_project: "Immutable. Service project name in the format: \\"projects/abc\\"
               or \\"projects/123\\". As input, project name with either project id or number
               are accepted. As output, this field will contain project number."
        :param pulumi.Input[_builtins.str] service_project_attachment_id: Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        :param pulumi.Input[_builtins.str] state: ServiceProjectAttachment state.
        :param pulumi.Input[_builtins.str] uid: Output only. A globally unique identifier (in UUID4 format) for the `ServiceProjectAttachment`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceProjectAttachmentState.__new__(_ServiceProjectAttachmentState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["service_project"] = service_project
        __props__.__dict__["service_project_attachment_id"] = service_project_attachment_id
        __props__.__dict__["state"] = state
        __props__.__dict__["uid"] = uid
        return ServiceProjectAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. Create time.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        "Identifier. The resource name of a ServiceProjectAttachment. Format:\\"projects/{host-project-id}/locations/global/serviceProjectAttachments/{service-project-id}.\\""
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
    @pulumi.getter(name="serviceProject")
    def service_project(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        "Immutable. Service project name in the format: \\"projects/abc\\"
        or \\"projects/123\\". As input, project name with either project id or number
        are accepted. As output, this field will contain project number."
        """
        return pulumi.get(self, "service_project")

    @_builtins.property
    @pulumi.getter(name="serviceProjectAttachmentId")
    def service_project_attachment_id(self) -> pulumi.Output[_builtins.str]:
        """
        Required. The service project attachment identifier must contain the project_id of the service project specified in the service_project_attachment.service_project field. Hint: "projects/{project_id}"
        """
        return pulumi.get(self, "service_project_attachment_id")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        ServiceProjectAttachment state.
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> pulumi.Output[_builtins.str]:
        """
        Output only. A globally unique identifier (in UUID4 format) for the `ServiceProjectAttachment`.
        """
        return pulumi.get(self, "uid")

