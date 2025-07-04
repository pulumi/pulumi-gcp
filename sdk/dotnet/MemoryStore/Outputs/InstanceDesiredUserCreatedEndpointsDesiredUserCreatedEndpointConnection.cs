// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.MemoryStore.Outputs
{

    [OutputType]
    public sealed class InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnection
    {
        /// <summary>
        /// Detailed information of a PSC connection that is created by the customer
        /// who owns the cluster.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionPscConnection? PscConnection;

        [OutputConstructor]
        private InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnection(Outputs.InstanceDesiredUserCreatedEndpointsDesiredUserCreatedEndpointConnectionPscConnection? pscConnection)
        {
            PscConnection = pscConnection;
        }
    }
}
