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

__all__ = [
    'ConnectorSubnetArgs',
    'ConnectorSubnetArgsDict',
]

MYPY = False

if not MYPY:
    class ConnectorSubnetArgsDict(TypedDict):
        name: NotRequired[pulumi.Input[_builtins.str]]
        """
        Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
        https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
        """
        project_id: NotRequired[pulumi.Input[_builtins.str]]
        """
        Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
elif False:
    ConnectorSubnetArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ConnectorSubnetArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] name: Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
               https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
        :param pulumi.Input[_builtins.str] project_id: Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
        https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_id", value)


