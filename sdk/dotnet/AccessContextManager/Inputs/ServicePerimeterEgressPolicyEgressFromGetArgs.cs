// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class ServicePerimeterEgressPolicyEgressFromGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("identities")]
        private InputList<string>? _identities;

        /// <summary>
        /// Identities can be an individual user, service account, Google group,
        /// or third-party identity. For third-party identity, only single identities
        /// are supported and other identity types are not supported.The v1 identities
        /// that have the prefix user, group and serviceAccount in
        /// https://cloud.google.com/iam/docs/principal-identifiers#v1 are supported.
        /// </summary>
        public InputList<string> Identities
        {
            get => _identities ?? (_identities = new InputList<string>());
            set => _identities = value;
        }

        /// <summary>
        /// Specifies the type of identities that are allowed access to outside the
        /// perimeter. If left unspecified, then members of `identities` field will
        /// be allowed access.
        /// Possible values are: `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
        /// </summary>
        [Input("identityType")]
        public Input<string>? IdentityType { get; set; }

        /// <summary>
        /// Whether to enforce traffic restrictions based on `sources` field. If the `sources` field is non-empty, then this field must be set to `SOURCE_RESTRICTION_ENABLED`.
        /// Possible values are: `SOURCE_RESTRICTION_UNSPECIFIED`, `SOURCE_RESTRICTION_ENABLED`, `SOURCE_RESTRICTION_DISABLED`.
        /// </summary>
        [Input("sourceRestriction")]
        public Input<string>? SourceRestriction { get; set; }

        [Input("sources")]
        private InputList<Inputs.ServicePerimeterEgressPolicyEgressFromSourceGetArgs>? _sources;

        /// <summary>
        /// Sources that this EgressPolicy authorizes access from.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ServicePerimeterEgressPolicyEgressFromSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.ServicePerimeterEgressPolicyEgressFromSourceGetArgs>());
            set => _sources = value;
        }

        public ServicePerimeterEgressPolicyEgressFromGetArgs()
        {
        }
        public static new ServicePerimeterEgressPolicyEgressFromGetArgs Empty => new ServicePerimeterEgressPolicyEgressFromGetArgs();
    }
}
