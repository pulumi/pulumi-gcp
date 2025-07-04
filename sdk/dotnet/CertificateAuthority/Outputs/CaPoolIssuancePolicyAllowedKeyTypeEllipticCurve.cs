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
    public sealed class CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve
    {
        /// <summary>
        /// The algorithm used.
        /// Possible values are: `ECDSA_P256`, `ECDSA_P384`, `EDDSA_25519`.
        /// </summary>
        public readonly string SignatureAlgorithm;

        [OutputConstructor]
        private CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve(string signatureAlgorithm)
        {
            SignatureAlgorithm = signatureAlgorithm;
        }
    }
}
