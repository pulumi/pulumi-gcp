// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Kms.Inputs
{

    public sealed class CryptoKeyVersionAttestationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The certificate chains needed to validate the attestation
        /// Structure is documented below.
        /// </summary>
        [Input("certChains")]
        public Input<Inputs.CryptoKeyVersionAttestationCertChainsArgs>? CertChains { get; set; }

        /// <summary>
        /// (Output)
        /// The attestation data provided by the HSM when the key operation was performed.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
        /// Structure is documented below.
        /// </summary>
        [Input("externalProtectionLevelOptions")]
        public Input<Inputs.CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs>? ExternalProtectionLevelOptions { get; set; }

        /// <summary>
        /// (Output)
        /// The format of the attestation data.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        public CryptoKeyVersionAttestationArgs()
        {
        }
        public static new CryptoKeyVersionAttestationArgs Empty => new CryptoKeyVersionAttestationArgs();
    }
}
