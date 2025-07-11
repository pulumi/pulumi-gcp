// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BlockchainNodeEngine.Inputs
{

    public sealed class BlockchainNodesConnectionInfoArgs : global::Pulumi.ResourceArgs
    {
        [Input("endpointInfos")]
        private InputList<Inputs.BlockchainNodesConnectionInfoEndpointInfoArgs>? _endpointInfos;

        /// <summary>
        /// (Output)
        /// The endpoint information through which to interact with a blockchain node.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BlockchainNodesConnectionInfoEndpointInfoArgs> EndpointInfos
        {
            get => _endpointInfos ?? (_endpointInfos = new InputList<Inputs.BlockchainNodesConnectionInfoEndpointInfoArgs>());
            set => _endpointInfos = value;
        }

        /// <summary>
        /// (Output)
        /// A service attachment that exposes a node, and has the following format: projects/{project}/regions/{region}/serviceAttachments/{service_attachment_name}
        /// </summary>
        [Input("serviceAttachment")]
        public Input<string>? ServiceAttachment { get; set; }

        public BlockchainNodesConnectionInfoArgs()
        {
        }
        public static new BlockchainNodesConnectionInfoArgs Empty => new BlockchainNodesConnectionInfoArgs();
    }
}
