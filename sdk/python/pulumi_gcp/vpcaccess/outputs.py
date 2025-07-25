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
    'ConnectorSubnet',
    'GetConnectorSubnetResult',
]

@pulumi.output_type
class ConnectorSubnet(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "projectId":
            suggest = "project_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ConnectorSubnet. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ConnectorSubnet.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ConnectorSubnet.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: Optional[_builtins.str] = None,
                 project_id: Optional[_builtins.str] = None):
        """
        :param _builtins.str name: Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
               https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
        :param _builtins.str project_id: Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        """
        Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
        https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[_builtins.str]:
        """
        Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
        return pulumi.get(self, "project_id")


@pulumi.output_type
class GetConnectorSubnetResult(dict):
    def __init__(__self__, *,
                 name: _builtins.str,
                 project_id: _builtins.str):
        """
        :param _builtins.str name: Name of the resource.
               
               - - -
        :param _builtins.str project_id: Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the resource.

        - - -
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
        """
        return pulumi.get(self, "project_id")


