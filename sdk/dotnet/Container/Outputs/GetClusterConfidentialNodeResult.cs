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
    public sealed class GetClusterConfidentialNodeResult
    {
        /// <summary>
        /// Whether Confidential Nodes feature is enabled for all nodes in this cluster.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private GetClusterConfidentialNodeResult(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
