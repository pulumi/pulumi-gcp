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
    public sealed class GetClusterManagedServerCaResult
    {
        /// <summary>
        /// The PEM encoded CA certificate chains for redis managed server authentication
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterManagedServerCaCaCertResult> CaCerts;

        [OutputConstructor]
        private GetClusterManagedServerCaResult(ImmutableArray<Outputs.GetClusterManagedServerCaCaCertResult> caCerts)
        {
            CaCerts = caCerts;
        }
    }
}
