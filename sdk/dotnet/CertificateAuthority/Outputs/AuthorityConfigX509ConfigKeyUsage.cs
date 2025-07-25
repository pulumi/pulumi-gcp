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
    public sealed class AuthorityConfigX509ConfigKeyUsage
    {
        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsage BaseKeyUsage;
        /// <summary>
        /// Describes high-level ways in which a key may be used.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage ExtendedKeyUsage;
        /// <summary>
        /// An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> UnknownExtendedKeyUsages;

        [OutputConstructor]
        private AuthorityConfigX509ConfigKeyUsage(
            Outputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage,

            Outputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage,

            ImmutableArray<Outputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages)
        {
            BaseKeyUsage = baseKeyUsage;
            ExtendedKeyUsage = extendedKeyUsage;
            UnknownExtendedKeyUsages = unknownExtendedKeyUsages;
        }
    }
}
