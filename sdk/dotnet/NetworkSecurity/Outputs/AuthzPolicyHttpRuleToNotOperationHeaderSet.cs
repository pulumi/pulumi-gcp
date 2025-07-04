// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Outputs
{

    [OutputType]
    public sealed class AuthzPolicyHttpRuleToNotOperationHeaderSet
    {
        /// <summary>
        /// A list of headers to match against in http header. The match can be one of exact, prefix, suffix, or contains (substring match). The match follows AND semantics which means all the headers must match. Matches are always case sensitive unless the ignoreCase is set. Limited to 5 matches.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeader> Headers;

        [OutputConstructor]
        private AuthzPolicyHttpRuleToNotOperationHeaderSet(ImmutableArray<Outputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeader> headers)
        {
            Headers = headers;
        }
    }
}
