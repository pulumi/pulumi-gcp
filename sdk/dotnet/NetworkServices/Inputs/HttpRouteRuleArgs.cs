// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class HttpRouteRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The detailed rule defining how to route matched traffic.
        /// Structure is documented below.
        /// </summary>
        [Input("action")]
        public Input<Inputs.HttpRouteRuleActionArgs>? Action { get; set; }

        [Input("matches")]
        private InputList<Inputs.HttpRouteRuleMatchArgs>? _matches;

        /// <summary>
        /// A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied.
        /// If no matches field is specified, this rule will unconditionally match traffic.
        /// If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.HttpRouteRuleMatchArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.HttpRouteRuleMatchArgs>());
            set => _matches = value;
        }

        public HttpRouteRuleArgs()
        {
        }
        public static new HttpRouteRuleArgs Empty => new HttpRouteRuleArgs();
    }
}
