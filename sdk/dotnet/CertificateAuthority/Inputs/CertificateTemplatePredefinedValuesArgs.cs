// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CertificateTemplatePredefinedValuesArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalExtensions")]
        private InputList<Inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs>? _additionalExtensions;

        /// <summary>
        /// Optional. Describes custom X.509 extensions.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs> AdditionalExtensions
        {
            get => _additionalExtensions ?? (_additionalExtensions = new InputList<Inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs>());
            set => _additionalExtensions = value;
        }

        [Input("aiaOcspServers")]
        private InputList<string>? _aiaOcspServers;

        /// <summary>
        /// Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
        /// </summary>
        public InputList<string> AiaOcspServers
        {
            get => _aiaOcspServers ?? (_aiaOcspServers = new InputList<string>());
            set => _aiaOcspServers = value;
        }

        /// <summary>
        /// Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
        /// Structure is documented below.
        /// </summary>
        [Input("caOptions")]
        public Input<Inputs.CertificateTemplatePredefinedValuesCaOptionsArgs>? CaOptions { get; set; }

        /// <summary>
        /// Optional. Indicates the intended use for keys that correspond to a certificate.
        /// Structure is documented below.
        /// </summary>
        [Input("keyUsage")]
        public Input<Inputs.CertificateTemplatePredefinedValuesKeyUsageArgs>? KeyUsage { get; set; }

        /// <summary>
        /// Describes the X.509 name constraints extension.
        /// Structure is documented below.
        /// </summary>
        [Input("nameConstraints")]
        public Input<Inputs.CertificateTemplatePredefinedValuesNameConstraintsArgs>? NameConstraints { get; set; }

        [Input("policyIds")]
        private InputList<Inputs.CertificateTemplatePredefinedValuesPolicyIdArgs>? _policyIds;

        /// <summary>
        /// Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateTemplatePredefinedValuesPolicyIdArgs> PolicyIds
        {
            get => _policyIds ?? (_policyIds = new InputList<Inputs.CertificateTemplatePredefinedValuesPolicyIdArgs>());
            set => _policyIds = value;
        }

        public CertificateTemplatePredefinedValuesArgs()
        {
        }
        public static new CertificateTemplatePredefinedValuesArgs Empty => new CertificateTemplatePredefinedValuesArgs();
    }
}
