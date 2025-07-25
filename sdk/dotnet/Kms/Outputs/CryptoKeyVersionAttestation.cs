// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Kms.Outputs
{

    [OutputType]
    public sealed class CryptoKeyVersionAttestation
    {
        /// <summary>
        /// The certificate chains needed to validate the attestation
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.CryptoKeyVersionAttestationCertChains? CertChains;
        /// <summary>
        /// (Output)
        /// The attestation data provided by the HSM when the key operation was performed.
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.CryptoKeyVersionAttestationExternalProtectionLevelOptions? ExternalProtectionLevelOptions;
        /// <summary>
        /// (Output)
        /// The format of the attestation data.
        /// </summary>
        public readonly string? Format;

        [OutputConstructor]
        private CryptoKeyVersionAttestation(
            Outputs.CryptoKeyVersionAttestationCertChains? certChains,

            string? content,

            Outputs.CryptoKeyVersionAttestationExternalProtectionLevelOptions? externalProtectionLevelOptions,

            string? format)
        {
            CertChains = certChains;
            Content = content;
            ExternalProtectionLevelOptions = externalProtectionLevelOptions;
            Format = format;
        }
    }
}
