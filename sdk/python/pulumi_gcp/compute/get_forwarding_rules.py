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

__all__ = [
    'GetForwardingRulesResult',
    'AwaitableGetForwardingRulesResult',
    'get_forwarding_rules',
    'get_forwarding_rules_output',
]

@pulumi.output_type
class GetForwardingRulesResult:
    """
    A collection of values returned by getForwardingRules.
    """
    def __init__(__self__, id=None, project=None, region=None, rules=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        """
        The project name being queried.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[_builtins.str]:
        """
        The region being queried.
        """
        return pulumi.get(self, "region")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetForwardingRulesRuleResult']:
        """
        This is a list of the forwarding rules in the project. Each forwarding rule will list the backend, description, ip address. name, network, self link, service label, service name, and subnet.
        """
        return pulumi.get(self, "rules")


class AwaitableGetForwardingRulesResult(GetForwardingRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetForwardingRulesResult(
            id=self.id,
            project=self.project,
            region=self.region,
            rules=self.rules)


def get_forwarding_rules(project: Optional[_builtins.str] = None,
                         region: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetForwardingRulesResult:
    """
    List all networks in a specified Google Cloud project.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_forwarding_rules = gcp.compute.get_forwarding_rules(project="my-cloud-project",
        region="us-central1")
    ```


    :param _builtins.str project: The name of the project.
    :param _builtins.str region: The region you want to get the forwarding rules from.
           
           These arguments must be set in either the provider or the resource in order for the information to be queried.
    """
    __args__ = dict()
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getForwardingRules:getForwardingRules', __args__, opts=opts, typ=GetForwardingRulesResult).value

    return AwaitableGetForwardingRulesResult(
        id=pulumi.get(__ret__, 'id'),
        project=pulumi.get(__ret__, 'project'),
        region=pulumi.get(__ret__, 'region'),
        rules=pulumi.get(__ret__, 'rules'))
def get_forwarding_rules_output(project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                region: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetForwardingRulesResult]:
    """
    List all networks in a specified Google Cloud project.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_forwarding_rules = gcp.compute.get_forwarding_rules(project="my-cloud-project",
        region="us-central1")
    ```


    :param _builtins.str project: The name of the project.
    :param _builtins.str region: The region you want to get the forwarding rules from.
           
           These arguments must be set in either the provider or the resource in order for the information to be queried.
    """
    __args__ = dict()
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:compute/getForwardingRules:getForwardingRules', __args__, opts=opts, typ=GetForwardingRulesResult)
    return __ret__.apply(lambda __response__: GetForwardingRulesResult(
        id=pulumi.get(__response__, 'id'),
        project=pulumi.get(__response__, 'project'),
        region=pulumi.get(__response__, 'region'),
        rules=pulumi.get(__response__, 'rules')))
