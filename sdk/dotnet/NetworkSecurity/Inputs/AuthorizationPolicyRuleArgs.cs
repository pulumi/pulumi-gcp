// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class AuthorizationPolicyRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinations")]
        private InputList<Inputs.AuthorizationPolicyRuleDestinationArgs>? _destinations;

        /// <summary>
        /// List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers.
        /// If not set, the action specified in the 'action' field will be applied without any rule checks for the destination.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AuthorizationPolicyRuleDestinationArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.AuthorizationPolicyRuleDestinationArgs>());
            set => _destinations = value;
        }

        [Input("sources")]
        private InputList<Inputs.AuthorizationPolicyRuleSourceArgs>? _sources;

        /// <summary>
        /// List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ipBlocks match.
        /// If not set, the action specified in the 'action' field will be applied without any rule checks for the source.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AuthorizationPolicyRuleSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.AuthorizationPolicyRuleSourceArgs>());
            set => _sources = value;
        }

        public AuthorizationPolicyRuleArgs()
        {
        }
        public static new AuthorizationPolicyRuleArgs Empty => new AuthorizationPolicyRuleArgs();
    }
}