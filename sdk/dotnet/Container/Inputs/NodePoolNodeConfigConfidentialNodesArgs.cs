// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class NodePoolNodeConfigConfidentialNodesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the type of technology used by the confidential node.
        /// </summary>
        [Input("confidentialInstanceType")]
        public Input<string>? ConfidentialInstanceType { get; set; }

        /// <summary>
        /// Whether Confidential Nodes feature is enabled for all nodes in this pool.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public NodePoolNodeConfigConfidentialNodesArgs()
        {
        }
        public static new NodePoolNodeConfigConfidentialNodesArgs Empty => new NodePoolNodeConfigConfidentialNodesArgs();
    }
}
