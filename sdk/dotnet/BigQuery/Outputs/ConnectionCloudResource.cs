// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class ConnectionCloudResource
    {
        /// <summary>
        /// (Output)
        /// The account ID of the service created for the purpose of this connection.
        /// </summary>
        public readonly string? ServiceAccountId;

        [OutputConstructor]
        private ConnectionCloudResource(string? serviceAccountId)
        {
            ServiceAccountId = serviceAccountId;
        }
    }
}
