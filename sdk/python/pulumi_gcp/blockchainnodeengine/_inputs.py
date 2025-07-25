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
    'BlockchainNodesConnectionInfoArgs',
    'BlockchainNodesConnectionInfoArgsDict',
    'BlockchainNodesConnectionInfoEndpointInfoArgs',
    'BlockchainNodesConnectionInfoEndpointInfoArgsDict',
    'BlockchainNodesEthereumDetailsArgs',
    'BlockchainNodesEthereumDetailsArgsDict',
    'BlockchainNodesEthereumDetailsAdditionalEndpointArgs',
    'BlockchainNodesEthereumDetailsAdditionalEndpointArgsDict',
    'BlockchainNodesEthereumDetailsGethDetailsArgs',
    'BlockchainNodesEthereumDetailsGethDetailsArgsDict',
    'BlockchainNodesEthereumDetailsValidatorConfigArgs',
    'BlockchainNodesEthereumDetailsValidatorConfigArgsDict',
]

MYPY = False

if not MYPY:
    class BlockchainNodesConnectionInfoArgsDict(TypedDict):
        endpoint_infos: NotRequired[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesConnectionInfoEndpointInfoArgsDict']]]]
        """
        (Output)
        The endpoint information through which to interact with a blockchain node.
        Structure is documented below.
        """
        service_attachment: NotRequired[pulumi.Input[_builtins.str]]
        """
        (Output)
        A service attachment that exposes a node, and has the following format: projects/{project}/regions/{region}/serviceAttachments/{service_attachment_name}
        """
elif False:
    BlockchainNodesConnectionInfoArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BlockchainNodesConnectionInfoArgs:
    def __init__(__self__, *,
                 endpoint_infos: Optional[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesConnectionInfoEndpointInfoArgs']]]] = None,
                 service_attachment: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['BlockchainNodesConnectionInfoEndpointInfoArgs']]] endpoint_infos: (Output)
               The endpoint information through which to interact with a blockchain node.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] service_attachment: (Output)
               A service attachment that exposes a node, and has the following format: projects/{project}/regions/{region}/serviceAttachments/{service_attachment_name}
        """
        if endpoint_infos is not None:
            pulumi.set(__self__, "endpoint_infos", endpoint_infos)
        if service_attachment is not None:
            pulumi.set(__self__, "service_attachment", service_attachment)

    @_builtins.property
    @pulumi.getter(name="endpointInfos")
    def endpoint_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesConnectionInfoEndpointInfoArgs']]]]:
        """
        (Output)
        The endpoint information through which to interact with a blockchain node.
        Structure is documented below.
        """
        return pulumi.get(self, "endpoint_infos")

    @endpoint_infos.setter
    def endpoint_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesConnectionInfoEndpointInfoArgs']]]]):
        pulumi.set(self, "endpoint_infos", value)

    @_builtins.property
    @pulumi.getter(name="serviceAttachment")
    def service_attachment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Output)
        A service attachment that exposes a node, and has the following format: projects/{project}/regions/{region}/serviceAttachments/{service_attachment_name}
        """
        return pulumi.get(self, "service_attachment")

    @service_attachment.setter
    def service_attachment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_attachment", value)


if not MYPY:
    class BlockchainNodesConnectionInfoEndpointInfoArgsDict(TypedDict):
        json_rpc_api_endpoint: NotRequired[pulumi.Input[_builtins.str]]
        """
        (Output)
        The assigned URL for the node JSON-RPC API endpoint.
        """
        websockets_api_endpoint: NotRequired[pulumi.Input[_builtins.str]]
        """
        (Output)
        The assigned URL for the node WebSockets API endpoint.
        """
elif False:
    BlockchainNodesConnectionInfoEndpointInfoArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BlockchainNodesConnectionInfoEndpointInfoArgs:
    def __init__(__self__, *,
                 json_rpc_api_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 websockets_api_endpoint: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] json_rpc_api_endpoint: (Output)
               The assigned URL for the node JSON-RPC API endpoint.
        :param pulumi.Input[_builtins.str] websockets_api_endpoint: (Output)
               The assigned URL for the node WebSockets API endpoint.
        """
        if json_rpc_api_endpoint is not None:
            pulumi.set(__self__, "json_rpc_api_endpoint", json_rpc_api_endpoint)
        if websockets_api_endpoint is not None:
            pulumi.set(__self__, "websockets_api_endpoint", websockets_api_endpoint)

    @_builtins.property
    @pulumi.getter(name="jsonRpcApiEndpoint")
    def json_rpc_api_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Output)
        The assigned URL for the node JSON-RPC API endpoint.
        """
        return pulumi.get(self, "json_rpc_api_endpoint")

    @json_rpc_api_endpoint.setter
    def json_rpc_api_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "json_rpc_api_endpoint", value)

    @_builtins.property
    @pulumi.getter(name="websocketsApiEndpoint")
    def websockets_api_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Output)
        The assigned URL for the node WebSockets API endpoint.
        """
        return pulumi.get(self, "websockets_api_endpoint")

    @websockets_api_endpoint.setter
    def websockets_api_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "websockets_api_endpoint", value)


if not MYPY:
    class BlockchainNodesEthereumDetailsArgsDict(TypedDict):
        additional_endpoints: NotRequired[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesEthereumDetailsAdditionalEndpointArgsDict']]]]
        """
        (Output)
        User-provided key-value pairs
        Structure is documented below.
        """
        api_enable_admin: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enables JSON-RPC access to functions in the admin namespace. Defaults to false.
        """
        api_enable_debug: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enables JSON-RPC access to functions in the debug namespace. Defaults to false.
        """
        consensus_client: NotRequired[pulumi.Input[_builtins.str]]
        """
        The consensus client
        Possible values are: `CONSENSUS_CLIENT_UNSPECIFIED`, `LIGHTHOUSE`.
        """
        execution_client: NotRequired[pulumi.Input[_builtins.str]]
        """
        The execution client
        Possible values are: `EXECUTION_CLIENT_UNSPECIFIED`, `GETH`, `ERIGON`.
        """
        geth_details: NotRequired[pulumi.Input['BlockchainNodesEthereumDetailsGethDetailsArgsDict']]
        """
        User-provided key-value pairs
        Structure is documented below.
        """
        network: NotRequired[pulumi.Input[_builtins.str]]
        """
        The Ethereum environment being accessed.
        Possible values are: `MAINNET`, `TESTNET_GOERLI_PRATER`, `TESTNET_SEPOLIA`.
        """
        node_type: NotRequired[pulumi.Input[_builtins.str]]
        """
        The type of Ethereum node.
        Possible values are: `LIGHT`, `FULL`, `ARCHIVE`.
        """
        validator_config: NotRequired[pulumi.Input['BlockchainNodesEthereumDetailsValidatorConfigArgsDict']]
        """
        Configuration for validator-related parameters on the beacon client, and for any managed validator client.
        Structure is documented below.
        """
elif False:
    BlockchainNodesEthereumDetailsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BlockchainNodesEthereumDetailsArgs:
    def __init__(__self__, *,
                 additional_endpoints: Optional[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesEthereumDetailsAdditionalEndpointArgs']]]] = None,
                 api_enable_admin: Optional[pulumi.Input[_builtins.bool]] = None,
                 api_enable_debug: Optional[pulumi.Input[_builtins.bool]] = None,
                 consensus_client: Optional[pulumi.Input[_builtins.str]] = None,
                 execution_client: Optional[pulumi.Input[_builtins.str]] = None,
                 geth_details: Optional[pulumi.Input['BlockchainNodesEthereumDetailsGethDetailsArgs']] = None,
                 network: Optional[pulumi.Input[_builtins.str]] = None,
                 node_type: Optional[pulumi.Input[_builtins.str]] = None,
                 validator_config: Optional[pulumi.Input['BlockchainNodesEthereumDetailsValidatorConfigArgs']] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['BlockchainNodesEthereumDetailsAdditionalEndpointArgs']]] additional_endpoints: (Output)
               User-provided key-value pairs
               Structure is documented below.
        :param pulumi.Input[_builtins.bool] api_enable_admin: Enables JSON-RPC access to functions in the admin namespace. Defaults to false.
        :param pulumi.Input[_builtins.bool] api_enable_debug: Enables JSON-RPC access to functions in the debug namespace. Defaults to false.
        :param pulumi.Input[_builtins.str] consensus_client: The consensus client
               Possible values are: `CONSENSUS_CLIENT_UNSPECIFIED`, `LIGHTHOUSE`.
        :param pulumi.Input[_builtins.str] execution_client: The execution client
               Possible values are: `EXECUTION_CLIENT_UNSPECIFIED`, `GETH`, `ERIGON`.
        :param pulumi.Input['BlockchainNodesEthereumDetailsGethDetailsArgs'] geth_details: User-provided key-value pairs
               Structure is documented below.
        :param pulumi.Input[_builtins.str] network: The Ethereum environment being accessed.
               Possible values are: `MAINNET`, `TESTNET_GOERLI_PRATER`, `TESTNET_SEPOLIA`.
        :param pulumi.Input[_builtins.str] node_type: The type of Ethereum node.
               Possible values are: `LIGHT`, `FULL`, `ARCHIVE`.
        :param pulumi.Input['BlockchainNodesEthereumDetailsValidatorConfigArgs'] validator_config: Configuration for validator-related parameters on the beacon client, and for any managed validator client.
               Structure is documented below.
        """
        if additional_endpoints is not None:
            pulumi.set(__self__, "additional_endpoints", additional_endpoints)
        if api_enable_admin is not None:
            pulumi.set(__self__, "api_enable_admin", api_enable_admin)
        if api_enable_debug is not None:
            pulumi.set(__self__, "api_enable_debug", api_enable_debug)
        if consensus_client is not None:
            pulumi.set(__self__, "consensus_client", consensus_client)
        if execution_client is not None:
            pulumi.set(__self__, "execution_client", execution_client)
        if geth_details is not None:
            pulumi.set(__self__, "geth_details", geth_details)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if node_type is not None:
            pulumi.set(__self__, "node_type", node_type)
        if validator_config is not None:
            pulumi.set(__self__, "validator_config", validator_config)

    @_builtins.property
    @pulumi.getter(name="additionalEndpoints")
    def additional_endpoints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesEthereumDetailsAdditionalEndpointArgs']]]]:
        """
        (Output)
        User-provided key-value pairs
        Structure is documented below.
        """
        return pulumi.get(self, "additional_endpoints")

    @additional_endpoints.setter
    def additional_endpoints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BlockchainNodesEthereumDetailsAdditionalEndpointArgs']]]]):
        pulumi.set(self, "additional_endpoints", value)

    @_builtins.property
    @pulumi.getter(name="apiEnableAdmin")
    def api_enable_admin(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enables JSON-RPC access to functions in the admin namespace. Defaults to false.
        """
        return pulumi.get(self, "api_enable_admin")

    @api_enable_admin.setter
    def api_enable_admin(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "api_enable_admin", value)

    @_builtins.property
    @pulumi.getter(name="apiEnableDebug")
    def api_enable_debug(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enables JSON-RPC access to functions in the debug namespace. Defaults to false.
        """
        return pulumi.get(self, "api_enable_debug")

    @api_enable_debug.setter
    def api_enable_debug(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "api_enable_debug", value)

    @_builtins.property
    @pulumi.getter(name="consensusClient")
    def consensus_client(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The consensus client
        Possible values are: `CONSENSUS_CLIENT_UNSPECIFIED`, `LIGHTHOUSE`.
        """
        return pulumi.get(self, "consensus_client")

    @consensus_client.setter
    def consensus_client(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "consensus_client", value)

    @_builtins.property
    @pulumi.getter(name="executionClient")
    def execution_client(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The execution client
        Possible values are: `EXECUTION_CLIENT_UNSPECIFIED`, `GETH`, `ERIGON`.
        """
        return pulumi.get(self, "execution_client")

    @execution_client.setter
    def execution_client(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "execution_client", value)

    @_builtins.property
    @pulumi.getter(name="gethDetails")
    def geth_details(self) -> Optional[pulumi.Input['BlockchainNodesEthereumDetailsGethDetailsArgs']]:
        """
        User-provided key-value pairs
        Structure is documented below.
        """
        return pulumi.get(self, "geth_details")

    @geth_details.setter
    def geth_details(self, value: Optional[pulumi.Input['BlockchainNodesEthereumDetailsGethDetailsArgs']]):
        pulumi.set(self, "geth_details", value)

    @_builtins.property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Ethereum environment being accessed.
        Possible values are: `MAINNET`, `TESTNET_GOERLI_PRATER`, `TESTNET_SEPOLIA`.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network", value)

    @_builtins.property
    @pulumi.getter(name="nodeType")
    def node_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of Ethereum node.
        Possible values are: `LIGHT`, `FULL`, `ARCHIVE`.
        """
        return pulumi.get(self, "node_type")

    @node_type.setter
    def node_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "node_type", value)

    @_builtins.property
    @pulumi.getter(name="validatorConfig")
    def validator_config(self) -> Optional[pulumi.Input['BlockchainNodesEthereumDetailsValidatorConfigArgs']]:
        """
        Configuration for validator-related parameters on the beacon client, and for any managed validator client.
        Structure is documented below.
        """
        return pulumi.get(self, "validator_config")

    @validator_config.setter
    def validator_config(self, value: Optional[pulumi.Input['BlockchainNodesEthereumDetailsValidatorConfigArgs']]):
        pulumi.set(self, "validator_config", value)


if not MYPY:
    class BlockchainNodesEthereumDetailsAdditionalEndpointArgsDict(TypedDict):
        beacon_api_endpoint: NotRequired[pulumi.Input[_builtins.str]]
        """
        The assigned URL for the node's Beacon API endpoint.
        """
        beacon_prometheus_metrics_api_endpoint: NotRequired[pulumi.Input[_builtins.str]]
        """
        The assigned URL for the node's Beacon Prometheus metrics endpoint.
        """
        execution_client_prometheus_metrics_api_endpoint: NotRequired[pulumi.Input[_builtins.str]]
        """
        The assigned URL for the node's execution client's Prometheus metrics endpoint.
        """
elif False:
    BlockchainNodesEthereumDetailsAdditionalEndpointArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BlockchainNodesEthereumDetailsAdditionalEndpointArgs:
    def __init__(__self__, *,
                 beacon_api_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 beacon_prometheus_metrics_api_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 execution_client_prometheus_metrics_api_endpoint: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] beacon_api_endpoint: The assigned URL for the node's Beacon API endpoint.
        :param pulumi.Input[_builtins.str] beacon_prometheus_metrics_api_endpoint: The assigned URL for the node's Beacon Prometheus metrics endpoint.
        :param pulumi.Input[_builtins.str] execution_client_prometheus_metrics_api_endpoint: The assigned URL for the node's execution client's Prometheus metrics endpoint.
        """
        if beacon_api_endpoint is not None:
            pulumi.set(__self__, "beacon_api_endpoint", beacon_api_endpoint)
        if beacon_prometheus_metrics_api_endpoint is not None:
            pulumi.set(__self__, "beacon_prometheus_metrics_api_endpoint", beacon_prometheus_metrics_api_endpoint)
        if execution_client_prometheus_metrics_api_endpoint is not None:
            pulumi.set(__self__, "execution_client_prometheus_metrics_api_endpoint", execution_client_prometheus_metrics_api_endpoint)

    @_builtins.property
    @pulumi.getter(name="beaconApiEndpoint")
    def beacon_api_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The assigned URL for the node's Beacon API endpoint.
        """
        return pulumi.get(self, "beacon_api_endpoint")

    @beacon_api_endpoint.setter
    def beacon_api_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "beacon_api_endpoint", value)

    @_builtins.property
    @pulumi.getter(name="beaconPrometheusMetricsApiEndpoint")
    def beacon_prometheus_metrics_api_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The assigned URL for the node's Beacon Prometheus metrics endpoint.
        """
        return pulumi.get(self, "beacon_prometheus_metrics_api_endpoint")

    @beacon_prometheus_metrics_api_endpoint.setter
    def beacon_prometheus_metrics_api_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "beacon_prometheus_metrics_api_endpoint", value)

    @_builtins.property
    @pulumi.getter(name="executionClientPrometheusMetricsApiEndpoint")
    def execution_client_prometheus_metrics_api_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The assigned URL for the node's execution client's Prometheus metrics endpoint.
        """
        return pulumi.get(self, "execution_client_prometheus_metrics_api_endpoint")

    @execution_client_prometheus_metrics_api_endpoint.setter
    def execution_client_prometheus_metrics_api_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "execution_client_prometheus_metrics_api_endpoint", value)


if not MYPY:
    class BlockchainNodesEthereumDetailsGethDetailsArgsDict(TypedDict):
        garbage_collection_mode: NotRequired[pulumi.Input[_builtins.str]]
        """
        Blockchain garbage collection modes. Only applicable when NodeType is FULL or ARCHIVE.
        Possible values are: `FULL`, `ARCHIVE`.

        <a name="nested_ethereum_details_additional_endpoints"></a>The `additional_endpoints` block contains:
        """
elif False:
    BlockchainNodesEthereumDetailsGethDetailsArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BlockchainNodesEthereumDetailsGethDetailsArgs:
    def __init__(__self__, *,
                 garbage_collection_mode: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] garbage_collection_mode: Blockchain garbage collection modes. Only applicable when NodeType is FULL or ARCHIVE.
               Possible values are: `FULL`, `ARCHIVE`.
               
               <a name="nested_ethereum_details_additional_endpoints"></a>The `additional_endpoints` block contains:
        """
        if garbage_collection_mode is not None:
            pulumi.set(__self__, "garbage_collection_mode", garbage_collection_mode)

    @_builtins.property
    @pulumi.getter(name="garbageCollectionMode")
    def garbage_collection_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Blockchain garbage collection modes. Only applicable when NodeType is FULL or ARCHIVE.
        Possible values are: `FULL`, `ARCHIVE`.

        <a name="nested_ethereum_details_additional_endpoints"></a>The `additional_endpoints` block contains:
        """
        return pulumi.get(self, "garbage_collection_mode")

    @garbage_collection_mode.setter
    def garbage_collection_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "garbage_collection_mode", value)


if not MYPY:
    class BlockchainNodesEthereumDetailsValidatorConfigArgsDict(TypedDict):
        mev_relay_urls: NotRequired[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]
        """
        URLs for MEV-relay services to use for block building. When set, a managed MEV-boost service is configured on the beacon client.
        """
elif False:
    BlockchainNodesEthereumDetailsValidatorConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class BlockchainNodesEthereumDetailsValidatorConfigArgs:
    def __init__(__self__, *,
                 mev_relay_urls: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] mev_relay_urls: URLs for MEV-relay services to use for block building. When set, a managed MEV-boost service is configured on the beacon client.
        """
        if mev_relay_urls is not None:
            pulumi.set(__self__, "mev_relay_urls", mev_relay_urls)

    @_builtins.property
    @pulumi.getter(name="mevRelayUrls")
    def mev_relay_urls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        URLs for MEV-relay services to use for block building. When set, a managed MEV-boost service is configured on the beacon client.
        """
        return pulumi.get(self, "mev_relay_urls")

    @mev_relay_urls.setter
    def mev_relay_urls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "mev_relay_urls", value)


