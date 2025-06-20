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
    public sealed class AzureClusterWorkloadIdentityConfig
    {
        /// <summary>
        /// The ID of the OIDC Identity Provider (IdP) associated to the Workload Identity Pool.
        /// </summary>
        public readonly string? IdentityProvider;
        /// <summary>
        /// The OIDC issuer URL for this cluster.
        /// </summary>
        public readonly string? IssuerUri;
        /// <summary>
        /// The Workload Identity Pool associated to the cluster.
        /// </summary>
        public readonly string? WorkloadPool;

        [OutputConstructor]
        private AzureClusterWorkloadIdentityConfig(
            string? identityProvider,

            string? issuerUri,

            string? workloadPool)
        {
            IdentityProvider = identityProvider;
            IssuerUri = issuerUri;
            WorkloadPool = workloadPool;
        }
    }
}
