// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class TlsRouteRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. A detailed rule defining how to route traffic.
        /// Structure is documented below.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.TlsRouteRuleActionGetArgs> Action { get; set; } = null!;

        [Input("matches", required: true)]
        private InputList<Inputs.TlsRouteRuleMatchGetArgs>? _matches;

        /// <summary>
        /// Matches define the predicate used to match requests to a given action.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.TlsRouteRuleMatchGetArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.TlsRouteRuleMatchGetArgs>());
            set => _matches = value;
        }

        public TlsRouteRuleGetArgs()
        {
        }
        public static new TlsRouteRuleGetArgs Empty => new TlsRouteRuleGetArgs();
    }
}
