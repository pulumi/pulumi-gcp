// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Outputs
{

    [OutputType]
    public sealed class ClusterUserCreatedConnectionsClusterEndpoint
    {
        /// <summary>
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterUserCreatedConnectionsClusterEndpointConnection> Connections;

        [OutputConstructor]
        private ClusterUserCreatedConnectionsClusterEndpoint(ImmutableArray<Outputs.ClusterUserCreatedConnectionsClusterEndpointConnection> connections)
        {
            Connections = connections;
        }
    }
}
