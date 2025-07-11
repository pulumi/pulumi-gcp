// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class AuthzPolicyHttpRuleFromArgs : global::Pulumi.ResourceArgs
    {
        [Input("notSources")]
        private InputList<Inputs.AuthzPolicyHttpRuleFromNotSourceArgs>? _notSources;

        /// <summary>
        /// Describes the properties of a request's sources. At least one of sources or notSources must be specified. Limited to 5 sources. A match occurs when ANY source (in sources or notSources) matches the request. Within a single source, the match follows AND semantics across fields and OR semantics within a single field, i.e. a match occurs when ANY principal matches AND ANY ipBlocks match.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AuthzPolicyHttpRuleFromNotSourceArgs> NotSources
        {
            get => _notSources ?? (_notSources = new InputList<Inputs.AuthzPolicyHttpRuleFromNotSourceArgs>());
            set => _notSources = value;
        }

        [Input("sources")]
        private InputList<Inputs.AuthzPolicyHttpRuleFromSourceArgs>? _sources;

        /// <summary>
        /// Describes the properties of a request's sources. At least one of sources or notSources must be specified. Limited to 5 sources. A match occurs when ANY source (in sources or notSources) matches the request. Within a single source, the match follows AND semantics across fields and OR semantics within a single field, i.e. a match occurs when ANY principal matches AND ANY ipBlocks match.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AuthzPolicyHttpRuleFromSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.AuthzPolicyHttpRuleFromSourceArgs>());
            set => _sources = value;
        }

        public AuthzPolicyHttpRuleFromArgs()
        {
        }
        public static new AuthzPolicyHttpRuleFromArgs Empty => new AuthzPolicyHttpRuleFromArgs();
    }
}
