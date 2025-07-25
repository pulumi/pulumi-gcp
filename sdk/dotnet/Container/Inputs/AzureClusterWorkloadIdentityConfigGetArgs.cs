// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AzureClusterWorkloadIdentityConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the OIDC Identity Provider (IdP) associated to the Workload Identity Pool.
        /// </summary>
        [Input("identityProvider")]
        public Input<string>? IdentityProvider { get; set; }

        /// <summary>
        /// The OIDC issuer URL for this cluster.
        /// </summary>
        [Input("issuerUri")]
        public Input<string>? IssuerUri { get; set; }

        /// <summary>
        /// The Workload Identity Pool associated to the cluster.
        /// </summary>
        [Input("workloadPool")]
        public Input<string>? WorkloadPool { get; set; }

        public AzureClusterWorkloadIdentityConfigGetArgs()
        {
        }
        public static new AzureClusterWorkloadIdentityConfigGetArgs Empty => new AzureClusterWorkloadIdentityConfigGetArgs();
    }
}
