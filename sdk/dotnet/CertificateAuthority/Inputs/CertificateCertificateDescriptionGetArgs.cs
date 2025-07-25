// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CertificateCertificateDescriptionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aiaIssuingCertificateUrls")]
        private InputList<string>? _aiaIssuingCertificateUrls;

        /// <summary>
        /// (Output)
        /// Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate.
        /// </summary>
        public InputList<string> AiaIssuingCertificateUrls
        {
            get => _aiaIssuingCertificateUrls ?? (_aiaIssuingCertificateUrls = new InputList<string>());
            set => _aiaIssuingCertificateUrls = value;
        }

        [Input("authorityKeyIds")]
        private InputList<Inputs.CertificateCertificateDescriptionAuthorityKeyIdGetArgs>? _authorityKeyIds;

        /// <summary>
        /// (Output)
        /// Identifies the subjectKeyId of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateCertificateDescriptionAuthorityKeyIdGetArgs> AuthorityKeyIds
        {
            get => _authorityKeyIds ?? (_authorityKeyIds = new InputList<Inputs.CertificateCertificateDescriptionAuthorityKeyIdGetArgs>());
            set => _authorityKeyIds = value;
        }

        [Input("certFingerprints")]
        private InputList<Inputs.CertificateCertificateDescriptionCertFingerprintGetArgs>? _certFingerprints;

        /// <summary>
        /// (Output)
        /// The hash of the x.509 certificate.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateCertificateDescriptionCertFingerprintGetArgs> CertFingerprints
        {
            get => _certFingerprints ?? (_certFingerprints = new InputList<Inputs.CertificateCertificateDescriptionCertFingerprintGetArgs>());
            set => _certFingerprints = value;
        }

        [Input("crlDistributionPoints")]
        private InputList<string>? _crlDistributionPoints;

        /// <summary>
        /// (Output)
        /// Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
        /// </summary>
        public InputList<string> CrlDistributionPoints
        {
            get => _crlDistributionPoints ?? (_crlDistributionPoints = new InputList<string>());
            set => _crlDistributionPoints = value;
        }

        [Input("publicKeys")]
        private InputList<Inputs.CertificateCertificateDescriptionPublicKeyGetArgs>? _publicKeys;

        /// <summary>
        /// (Output)
        /// A PublicKey describes a public key.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateCertificateDescriptionPublicKeyGetArgs> PublicKeys
        {
            get => _publicKeys ?? (_publicKeys = new InputList<Inputs.CertificateCertificateDescriptionPublicKeyGetArgs>());
            set => _publicKeys = value;
        }

        [Input("subjectDescriptions")]
        private InputList<Inputs.CertificateCertificateDescriptionSubjectDescriptionGetArgs>? _subjectDescriptions;

        /// <summary>
        /// (Output)
        /// Describes some of the values in a certificate that are related to the subject and lifetime.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateCertificateDescriptionSubjectDescriptionGetArgs> SubjectDescriptions
        {
            get => _subjectDescriptions ?? (_subjectDescriptions = new InputList<Inputs.CertificateCertificateDescriptionSubjectDescriptionGetArgs>());
            set => _subjectDescriptions = value;
        }

        [Input("subjectKeyIds")]
        private InputList<Inputs.CertificateCertificateDescriptionSubjectKeyIdGetArgs>? _subjectKeyIds;

        /// <summary>
        /// (Output)
        /// Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateCertificateDescriptionSubjectKeyIdGetArgs> SubjectKeyIds
        {
            get => _subjectKeyIds ?? (_subjectKeyIds = new InputList<Inputs.CertificateCertificateDescriptionSubjectKeyIdGetArgs>());
            set => _subjectKeyIds = value;
        }

        [Input("x509Descriptions")]
        private InputList<Inputs.CertificateCertificateDescriptionX509DescriptionGetArgs>? _x509Descriptions;

        /// <summary>
        /// (Output)
        /// A structured description of the issued X.509 certificate.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateCertificateDescriptionX509DescriptionGetArgs> X509Descriptions
        {
            get => _x509Descriptions ?? (_x509Descriptions = new InputList<Inputs.CertificateCertificateDescriptionX509DescriptionGetArgs>());
            set => _x509Descriptions = value;
        }

        public CertificateCertificateDescriptionGetArgs()
        {
        }
        public static new CertificateCertificateDescriptionGetArgs Empty => new CertificateCertificateDescriptionGetArgs();
    }
}
