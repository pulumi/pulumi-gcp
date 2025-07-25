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
    public sealed class GetAuthorityConfigX509ConfigKeyUsageResult
    {
        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsageResult> BaseKeyUsages;
        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAuthorityConfigX509ConfigKeyUsageExtendedKeyUsageResult> ExtendedKeyUsages;
        /// <summary>
        /// An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageResult> UnknownExtendedKeyUsages;

        [OutputConstructor]
        private GetAuthorityConfigX509ConfigKeyUsageResult(
            ImmutableArray<Outputs.GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsageResult> baseKeyUsages,

            ImmutableArray<Outputs.GetAuthorityConfigX509ConfigKeyUsageExtendedKeyUsageResult> extendedKeyUsages,

            ImmutableArray<Outputs.GetAuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageResult> unknownExtendedKeyUsages)
        {
            BaseKeyUsages = baseKeyUsages;
            ExtendedKeyUsages = extendedKeyUsages;
            UnknownExtendedKeyUsages = unknownExtendedKeyUsages;
        }
    }
}
