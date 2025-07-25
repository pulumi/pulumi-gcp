// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class GetClusterMigrationSourceResult
    {
        /// <summary>
        /// The host and port of the on-premises instance in host:port format
        /// </summary>
        public readonly string HostPort;
        /// <summary>
        /// Place holder for the external source identifier(e.g DMS job name) that created the cluster.
        /// </summary>
        public readonly string ReferenceId;
        /// <summary>
        /// Type of migration source.
        /// </summary>
        public readonly string SourceType;

        [OutputConstructor]
        private GetClusterMigrationSourceResult(
            string hostPort,

            string referenceId,

            string sourceType)
        {
            HostPort = hostPort;
            ReferenceId = referenceId;
            SourceType = sourceType;
        }
    }
}
