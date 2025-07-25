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
    'GetGatewayIamPolicyResult',
    'AwaitableGetGatewayIamPolicyResult',
    'get_gateway_iam_policy',
    'get_gateway_iam_policy_output',
]

@pulumi.output_type
class GetGatewayIamPolicyResult:
    """
    A collection of values returned by getGatewayIamPolicy.
    """
    def __init__(__self__, etag=None, gateway=None, id=None, policy_data=None, project=None, region=None):
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if gateway and not isinstance(gateway, str):
            raise TypeError("Expected argument 'gateway' to be a str")
        pulumi.set(__self__, "gateway", gateway)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> _builtins.str:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def gateway(self) -> _builtins.str:
        return pulumi.get(self, "gateway")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> _builtins.str:
        """
        (Required only by `apigateway.GatewayIamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def region(self) -> _builtins.str:
        return pulumi.get(self, "region")


class AwaitableGetGatewayIamPolicyResult(GetGatewayIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewayIamPolicyResult(
            etag=self.etag,
            gateway=self.gateway,
            id=self.id,
            policy_data=self.policy_data,
            project=self.project,
            region=self.region)


def get_gateway_iam_policy(gateway: Optional[_builtins.str] = None,
                           project: Optional[_builtins.str] = None,
                           region: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewayIamPolicyResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.apigateway.get_gateway_iam_policy(project=api_gw["project"],
        region=api_gw["region"],
        gateway=api_gw["gatewayId"])
    ```


    :param _builtins.str gateway: Used to find the parent resource to bind the IAM policy to
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    :param _builtins.str region: The region of the gateway for the API.
           Used to find the parent resource to bind the IAM policy to. If not specified,
           the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
           region is specified, it is taken from the provider configuration.
    """
    __args__ = dict()
    __args__['gateway'] = gateway
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy', __args__, opts=opts, typ=GetGatewayIamPolicyResult).value

    return AwaitableGetGatewayIamPolicyResult(
        etag=pulumi.get(__ret__, 'etag'),
        gateway=pulumi.get(__ret__, 'gateway'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'),
        region=pulumi.get(__ret__, 'region'))
def get_gateway_iam_policy_output(gateway: Optional[pulumi.Input[_builtins.str]] = None,
                                  project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  region: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGatewayIamPolicyResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.apigateway.get_gateway_iam_policy(project=api_gw["project"],
        region=api_gw["region"],
        gateway=api_gw["gatewayId"])
    ```


    :param _builtins.str gateway: Used to find the parent resource to bind the IAM policy to
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    :param _builtins.str region: The region of the gateway for the API.
           Used to find the parent resource to bind the IAM policy to. If not specified,
           the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
           region is specified, it is taken from the provider configuration.
    """
    __args__ = dict()
    __args__['gateway'] = gateway
    __args__['project'] = project
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy', __args__, opts=opts, typ=GetGatewayIamPolicyResult)
    return __ret__.apply(lambda __response__: GetGatewayIamPolicyResult(
        etag=pulumi.get(__response__, 'etag'),
        gateway=pulumi.get(__response__, 'gateway'),
        id=pulumi.get(__response__, 'id'),
        policy_data=pulumi.get(__response__, 'policy_data'),
        project=pulumi.get(__response__, 'project'),
        region=pulumi.get(__response__, 'region')))
