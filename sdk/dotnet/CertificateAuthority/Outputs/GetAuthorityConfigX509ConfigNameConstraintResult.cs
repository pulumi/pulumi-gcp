// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Outputs
{

    [OutputType]
    public sealed class GetAuthorityConfigX509ConfigNameConstraintResult
    {
        public readonly bool Critical;
        public readonly ImmutableArray<string> ExcludedDnsNames;
        public readonly ImmutableArray<string> ExcludedEmailAddresses;
        public readonly ImmutableArray<string> ExcludedIpRanges;
        public readonly ImmutableArray<string> ExcludedUris;
        public readonly ImmutableArray<string> PermittedDnsNames;
        public readonly ImmutableArray<string> PermittedEmailAddresses;
        public readonly ImmutableArray<string> PermittedIpRanges;
        public readonly ImmutableArray<string> PermittedUris;

        [OutputConstructor]
        private GetAuthorityConfigX509ConfigNameConstraintResult(
            bool critical,

            ImmutableArray<string> excludedDnsNames,

            ImmutableArray<string> excludedEmailAddresses,

            ImmutableArray<string> excludedIpRanges,

            ImmutableArray<string> excludedUris,

            ImmutableArray<string> permittedDnsNames,

            ImmutableArray<string> permittedEmailAddresses,

            ImmutableArray<string> permittedIpRanges,

            ImmutableArray<string> permittedUris)
        {
            Critical = critical;
            ExcludedDnsNames = excludedDnsNames;
            ExcludedEmailAddresses = excludedEmailAddresses;
            ExcludedIpRanges = excludedIpRanges;
            ExcludedUris = excludedUris;
            PermittedDnsNames = permittedDnsNames;
            PermittedEmailAddresses = permittedEmailAddresses;
            PermittedIpRanges = permittedIpRanges;
            PermittedUris = permittedUris;
        }
    }
}