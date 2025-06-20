// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BlockchainNodeEngine.Inputs
{

    public sealed class BlockchainNodesEthereumDetailsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalEndpoints")]
        private InputList<Inputs.BlockchainNodesEthereumDetailsAdditionalEndpointGetArgs>? _additionalEndpoints;

        /// <summary>
        /// (Output)
        /// User-provided key-value pairs
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BlockchainNodesEthereumDetailsAdditionalEndpointGetArgs> AdditionalEndpoints
        {
            get => _additionalEndpoints ?? (_additionalEndpoints = new InputList<Inputs.BlockchainNodesEthereumDetailsAdditionalEndpointGetArgs>());
            set => _additionalEndpoints = value;
        }

        /// <summary>
        /// Enables JSON-RPC access to functions in the admin namespace. Defaults to false.
        /// </summary>
        [Input("apiEnableAdmin")]
        public Input<bool>? ApiEnableAdmin { get; set; }

        /// <summary>
        /// Enables JSON-RPC access to functions in the debug namespace. Defaults to false.
        /// </summary>
        [Input("apiEnableDebug")]
        public Input<bool>? ApiEnableDebug { get; set; }

        /// <summary>
        /// The consensus client
        /// Possible values are: `CONSENSUS_CLIENT_UNSPECIFIED`, `LIGHTHOUSE`.
        /// </summary>
        [Input("consensusClient")]
        public Input<string>? ConsensusClient { get; set; }

        /// <summary>
        /// The execution client
        /// Possible values are: `EXECUTION_CLIENT_UNSPECIFIED`, `GETH`, `ERIGON`.
        /// </summary>
        [Input("executionClient")]
        public Input<string>? ExecutionClient { get; set; }

        /// <summary>
        /// User-provided key-value pairs
        /// Structure is documented below.
        /// </summary>
        [Input("gethDetails")]
        public Input<Inputs.BlockchainNodesEthereumDetailsGethDetailsGetArgs>? GethDetails { get; set; }

        /// <summary>
        /// The Ethereum environment being accessed.
        /// Possible values are: `MAINNET`, `TESTNET_GOERLI_PRATER`, `TESTNET_SEPOLIA`.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The type of Ethereum node.
        /// Possible values are: `LIGHT`, `FULL`, `ARCHIVE`.
        /// </summary>
        [Input("nodeType")]
        public Input<string>? NodeType { get; set; }

        /// <summary>
        /// Configuration for validator-related parameters on the beacon client, and for any managed validator client.
        /// Structure is documented below.
        /// </summary>
        [Input("validatorConfig")]
        public Input<Inputs.BlockchainNodesEthereumDetailsValidatorConfigGetArgs>? ValidatorConfig { get; set; }

        public BlockchainNodesEthereumDetailsGetArgs()
        {
        }
        public static new BlockchainNodesEthereumDetailsGetArgs Empty => new BlockchainNodesEthereumDetailsGetArgs();
    }
}
