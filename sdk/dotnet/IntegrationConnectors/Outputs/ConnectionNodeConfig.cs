// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Outputs
{

    [OutputType]
    public sealed class ConnectionNodeConfig
    {
        /// <summary>
        /// Minimum number of nodes in the runtime nodes.
        /// </summary>
        public readonly int? MaxNodeCount;
        /// <summary>
        /// Minimum number of nodes in the runtime nodes.
        /// </summary>
        public readonly int? MinNodeCount;

        [OutputConstructor]
        private ConnectionNodeConfig(
            int? maxNodeCount,

            int? minNodeCount)
        {
            MaxNodeCount = maxNodeCount;
            MinNodeCount = minNodeCount;
        }
    }
}