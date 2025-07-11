// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CaPoolIssuancePolicyBaselineValuesKeyUsageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// Structure is documented below.
        /// </summary>
        [Input("baseKeyUsage", required: true)]
        public Input<Inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsageArgs> BaseKeyUsage { get; set; } = null!;

        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// Structure is documented below.
        /// </summary>
        [Input("extendedKeyUsage", required: true)]
        public Input<Inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs> ExtendedKeyUsage { get; set; } = null!;

        [Input("unknownExtendedKeyUsages")]
        private InputList<Inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs>? _unknownExtendedKeyUsages;

        /// <summary>
        /// An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs> UnknownExtendedKeyUsages
        {
            get => _unknownExtendedKeyUsages ?? (_unknownExtendedKeyUsages = new InputList<Inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs>());
            set => _unknownExtendedKeyUsages = value;
        }

        public CaPoolIssuancePolicyBaselineValuesKeyUsageArgs()
        {
        }
        public static new CaPoolIssuancePolicyBaselineValuesKeyUsageArgs Empty => new CaPoolIssuancePolicyBaselineValuesKeyUsageArgs();
    }
}
