# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetGameServerDeploymentRolloutResult',
    'AwaitableGetGameServerDeploymentRolloutResult',
    'get_game_server_deployment_rollout',
    'get_game_server_deployment_rollout_output',
]

@pulumi.output_type
class GetGameServerDeploymentRolloutResult:
    """
    A collection of values returned by getGameServerDeploymentRollout.
    """
    def __init__(__self__, default_game_server_config=None, deployment_id=None, game_server_config_overrides=None, id=None, name=None, project=None):
        if default_game_server_config and not isinstance(default_game_server_config, str):
            raise TypeError("Expected argument 'default_game_server_config' to be a str")
        pulumi.set(__self__, "default_game_server_config", default_game_server_config)
        if deployment_id and not isinstance(deployment_id, str):
            raise TypeError("Expected argument 'deployment_id' to be a str")
        pulumi.set(__self__, "deployment_id", deployment_id)
        if game_server_config_overrides and not isinstance(game_server_config_overrides, list):
            raise TypeError("Expected argument 'game_server_config_overrides' to be a list")
        pulumi.set(__self__, "game_server_config_overrides", game_server_config_overrides)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="defaultGameServerConfig")
    def default_game_server_config(self) -> str:
        """
        This field points to the game server config that is
        applied by default to all realms and clusters. For example,
        `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
        """
        return pulumi.get(self, "default_game_server_config")

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> str:
        return pulumi.get(self, "deployment_id")

    @property
    @pulumi.getter(name="gameServerConfigOverrides")
    def game_server_config_overrides(self) -> Sequence['outputs.GetGameServerDeploymentRolloutGameServerConfigOverrideResult']:
        """
        The game_server_config_overrides contains the per game server config
        overrides. The overrides are processed in the order they are listed. As
        soon as a match is found for a cluster, the rest of the list is not
        processed.  Structure is documented below.
        """
        return pulumi.get(self, "game_server_config_overrides")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The resource id of the game server deployment
        eg: `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")


class AwaitableGetGameServerDeploymentRolloutResult(GetGameServerDeploymentRolloutResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGameServerDeploymentRolloutResult(
            default_game_server_config=self.default_game_server_config,
            deployment_id=self.deployment_id,
            game_server_config_overrides=self.game_server_config_overrides,
            id=self.id,
            name=self.name,
            project=self.project)


def get_game_server_deployment_rollout(deployment_id: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGameServerDeploymentRolloutResult:
    """
    Use this data source to get the rollout state.

    https://cloud.google.com/game-servers/docs/reference/rest/v1beta/GameServerDeploymentRollout

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    qa = gcp.gameservices.get_game_server_deployment_rollout(deployment_id="tf-test-deployment-s8sn12jt2c")
    ```


    :param str deployment_id: The deployment to get the rollout state from. Only 1 rollout must be associated with each deployment.
    """
    __args__ = dict()
    __args__['deploymentId'] = deployment_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:gameservices/getGameServerDeploymentRollout:getGameServerDeploymentRollout', __args__, opts=opts, typ=GetGameServerDeploymentRolloutResult).value

    return AwaitableGetGameServerDeploymentRolloutResult(
        default_game_server_config=pulumi.get(__ret__, 'default_game_server_config'),
        deployment_id=pulumi.get(__ret__, 'deployment_id'),
        game_server_config_overrides=pulumi.get(__ret__, 'game_server_config_overrides'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'))


@_utilities.lift_output_func(get_game_server_deployment_rollout)
def get_game_server_deployment_rollout_output(deployment_id: Optional[pulumi.Input[str]] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGameServerDeploymentRolloutResult]:
    """
    Use this data source to get the rollout state.

    https://cloud.google.com/game-servers/docs/reference/rest/v1beta/GameServerDeploymentRollout

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    qa = gcp.gameservices.get_game_server_deployment_rollout(deployment_id="tf-test-deployment-s8sn12jt2c")
    ```


    :param str deployment_id: The deployment to get the rollout state from. Only 1 rollout must be associated with each deployment.
    """
    ...