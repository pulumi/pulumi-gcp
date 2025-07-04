// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CertificateConfigX509ConfigKeyUsageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// Structure is documented below.
        /// </summary>
        [Input("baseKeyUsage", required: true)]
        public Input<Inputs.CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs> BaseKeyUsage { get; set; } = null!;

        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// Structure is documented below.
        /// </summary>
        [Input("extendedKeyUsage", required: true)]
        public Input<Inputs.CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs> ExtendedKeyUsage { get; set; } = null!;

        [Input("unknownExtendedKeyUsages")]
        private InputList<Inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>? _unknownExtendedKeyUsages;

        /// <summary>
        /// An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs> UnknownExtendedKeyUsages
        {
            get => _unknownExtendedKeyUsages ?? (_unknownExtendedKeyUsages = new InputList<Inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>());
            set => _unknownExtendedKeyUsages = value;
        }

        public CertificateConfigX509ConfigKeyUsageArgs()
        {
        }
        public static new CertificateConfigX509ConfigKeyUsageArgs Empty => new CertificateConfigX509ConfigKeyUsageArgs();
    }
}
