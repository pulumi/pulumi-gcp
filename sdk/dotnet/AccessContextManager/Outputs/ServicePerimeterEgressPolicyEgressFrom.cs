// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Outputs
{

    [OutputType]
    public sealed class ServicePerimeterEgressPolicyEgressFrom
    {
        /// <summary>
        /// Identities can be an individual user, service account, Google group,
        /// or third-party identity. For third-party identity, only single identities
        /// are supported and other identity types are not supported.The v1 identities
        /// that have the prefix user, group and serviceAccount in
        /// https://cloud.google.com/iam/docs/principal-identifiers#v1 are supported.
        /// </summary>
        public readonly ImmutableArray<string> Identities;
        /// <summary>
        /// Specifies the type of identities that are allowed access to outside the
        /// perimeter. If left unspecified, then members of `identities` field will
        /// be allowed access.
        /// Possible values are: `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
        /// </summary>
        public readonly string? IdentityType;
        /// <summary>
        /// Whether to enforce traffic restrictions based on `sources` field. If the `sources` field is non-empty, then this field must be set to `SOURCE_RESTRICTION_ENABLED`.
        /// Possible values are: `SOURCE_RESTRICTION_UNSPECIFIED`, `SOURCE_RESTRICTION_ENABLED`, `SOURCE_RESTRICTION_DISABLED`.
        /// </summary>
        public readonly string? SourceRestriction;
        /// <summary>
        /// Sources that this EgressPolicy authorizes access from.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ServicePerimeterEgressPolicyEgressFromSource> Sources;

        [OutputConstructor]
        private ServicePerimeterEgressPolicyEgressFrom(
            ImmutableArray<string> identities,

            string? identityType,

            string? sourceRestriction,

            ImmutableArray<Outputs.ServicePerimeterEgressPolicyEgressFromSource> sources)
        {
            Identities = identities;
            IdentityType = identityType;
            SourceRestriction = sourceRestriction;
            Sources = sources;
        }
    }
}
