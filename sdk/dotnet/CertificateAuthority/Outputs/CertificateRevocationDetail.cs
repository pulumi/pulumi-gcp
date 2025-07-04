// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Outputs
{

    [OutputType]
    public sealed class CertificateRevocationDetail
    {
        /// <summary>
        /// (Output)
        /// Indicates why a Certificate was revoked.
        /// </summary>
        public readonly string? RevocationState;
        /// <summary>
        /// (Output)
        /// The time at which this Certificate was revoked.
        /// </summary>
        public readonly string? RevocationTime;

        [OutputConstructor]
        private CertificateRevocationDetail(
            string? revocationState,

            string? revocationTime)
        {
            RevocationState = revocationState;
            RevocationTime = revocationTime;
        }
    }
}
