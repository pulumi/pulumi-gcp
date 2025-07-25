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
    public sealed class CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage
    {
        /// <summary>
        /// The key may be used to sign certificates.
        /// </summary>
        public readonly bool? CertSign;
        /// <summary>
        /// The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
        /// </summary>
        public readonly bool? ContentCommitment;
        /// <summary>
        /// The key may be used sign certificate revocation lists.
        /// </summary>
        public readonly bool? CrlSign;
        /// <summary>
        /// The key may be used to encipher data.
        /// </summary>
        public readonly bool? DataEncipherment;
        /// <summary>
        /// The key may be used to decipher only.
        /// </summary>
        public readonly bool? DecipherOnly;
        /// <summary>
        /// The key may be used for digital signatures.
        /// </summary>
        public readonly bool? DigitalSignature;
        /// <summary>
        /// The key may be used to encipher only.
        /// </summary>
        public readonly bool? EncipherOnly;
        /// <summary>
        /// The key may be used in a key agreement protocol.
        /// </summary>
        public readonly bool? KeyAgreement;
        /// <summary>
        /// The key may be used to encipher other keys.
        /// </summary>
        public readonly bool? KeyEncipherment;

        [OutputConstructor]
        private CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage(
            bool? certSign,

            bool? contentCommitment,

            bool? crlSign,

            bool? dataEncipherment,

            bool? decipherOnly,

            bool? digitalSignature,

            bool? encipherOnly,

            bool? keyAgreement,

            bool? keyEncipherment)
        {
            CertSign = certSign;
            ContentCommitment = contentCommitment;
            CrlSign = crlSign;
            DataEncipherment = dataEncipherment;
            DecipherOnly = decipherOnly;
            DigitalSignature = digitalSignature;
            EncipherOnly = encipherOnly;
            KeyAgreement = keyAgreement;
            KeyEncipherment = keyEncipherment;
        }
    }
}
