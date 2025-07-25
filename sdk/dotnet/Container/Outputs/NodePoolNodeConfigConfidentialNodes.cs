// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class NodePoolNodeConfigConfidentialNodes
    {
        /// <summary>
        /// Defines the type of technology used by the confidential node.
        /// </summary>
        public readonly string? ConfidentialInstanceType;
        /// <summary>
        /// Whether Confidential Nodes feature is enabled for all nodes in this pool.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private NodePoolNodeConfigConfidentialNodes(
            string? confidentialInstanceType,

            bool enabled)
        {
            ConfidentialInstanceType = confidentialInstanceType;
            Enabled = enabled;
        }
    }
}
