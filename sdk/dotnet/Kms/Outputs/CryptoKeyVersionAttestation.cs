// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        public readonly Outputs.CryptoKeyVersionAttestationCertChains? CertChains;
        public readonly string? Content;
        public readonly Outputs.CryptoKeyVersionAttestationExternalProtectionLevelOptions? ExternalProtectionLevelOptions;
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