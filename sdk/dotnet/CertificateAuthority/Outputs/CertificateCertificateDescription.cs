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
    public sealed class CertificateCertificateDescription
    {
        /// <summary>
        /// (Output)
        /// Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate.
        /// </summary>
        public readonly ImmutableArray<string> AiaIssuingCertificateUrls;
        /// <summary>
        /// (Output)
        /// Identifies the subjectKeyId of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionAuthorityKeyId> AuthorityKeyIds;
        /// <summary>
        /// (Output)
        /// The hash of the x.509 certificate.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionCertFingerprint> CertFingerprints;
        /// <summary>
        /// (Output)
        /// Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
        /// </summary>
        public readonly ImmutableArray<string> CrlDistributionPoints;
        /// <summary>
        /// (Output)
        /// A PublicKey describes a public key.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionPublicKey> PublicKeys;
        /// <summary>
        /// (Output)
        /// Describes some of the values in a certificate that are related to the subject and lifetime.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionSubjectDescription> SubjectDescriptions;
        /// <summary>
        /// (Output)
        /// Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionSubjectKeyId> SubjectKeyIds;
        /// <summary>
        /// (Output)
        /// A structured description of the issued X.509 certificate.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionX509Description> X509Descriptions;

        [OutputConstructor]
        private CertificateCertificateDescription(
            ImmutableArray<string> aiaIssuingCertificateUrls,

            ImmutableArray<Outputs.CertificateCertificateDescriptionAuthorityKeyId> authorityKeyIds,

            ImmutableArray<Outputs.CertificateCertificateDescriptionCertFingerprint> certFingerprints,

            ImmutableArray<string> crlDistributionPoints,

            ImmutableArray<Outputs.CertificateCertificateDescriptionPublicKey> publicKeys,

            ImmutableArray<Outputs.CertificateCertificateDescriptionSubjectDescription> subjectDescriptions,

            ImmutableArray<Outputs.CertificateCertificateDescriptionSubjectKeyId> subjectKeyIds,

            ImmutableArray<Outputs.CertificateCertificateDescriptionX509Description> x509Descriptions)
        {
            AiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            AuthorityKeyIds = authorityKeyIds;
            CertFingerprints = certFingerprints;
            CrlDistributionPoints = crlDistributionPoints;
            PublicKeys = publicKeys;
            SubjectDescriptions = subjectDescriptions;
            SubjectKeyIds = subjectKeyIds;
            X509Descriptions = x509Descriptions;
        }
    }
}
