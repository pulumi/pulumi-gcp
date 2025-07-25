// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam.Outputs
{

    [OutputType]
    public sealed class WorkloadIdentityPoolProviderX509TrustStore
    {
        /// <summary>
        /// Set of intermediate CA certificates used for building the trust chain to
        /// trust anchor.
        /// IMPORTANT: Intermediate CAs are only supported when configuring x509 federation.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkloadIdentityPoolProviderX509TrustStoreIntermediateCa> IntermediateCas;
        /// <summary>
        /// List of Trust Anchors to be used while performing validation
        /// against a given TrustStore. The incoming end entity's certificate
        /// must be chained up to one of the trust anchors here.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkloadIdentityPoolProviderX509TrustStoreTrustAnchor> TrustAnchors;

        [OutputConstructor]
        private WorkloadIdentityPoolProviderX509TrustStore(
            ImmutableArray<Outputs.WorkloadIdentityPoolProviderX509TrustStoreIntermediateCa> intermediateCas,

            ImmutableArray<Outputs.WorkloadIdentityPoolProviderX509TrustStoreTrustAnchor> trustAnchors)
        {
            IntermediateCas = intermediateCas;
            TrustAnchors = trustAnchors;
        }
    }
}
