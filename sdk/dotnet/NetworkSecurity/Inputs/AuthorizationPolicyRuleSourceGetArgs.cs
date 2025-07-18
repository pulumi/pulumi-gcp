// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class AuthorizationPolicyRuleSourceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipBlocks")]
        private InputList<string>? _ipBlocks;

        /// <summary>
        /// List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization based on source IP alone should be avoided.
        /// The IP addresses of any load balancers or proxies should be considered untrusted.
        /// </summary>
        public InputList<string> IpBlocks
        {
            get => _ipBlocks ?? (_ipBlocks = new InputList<string>());
            set => _ipBlocks = value;
        }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, "namespace/*") or a suffix match (example, "*/service-account") or a presence match "*".
        /// Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        public AuthorizationPolicyRuleSourceGetArgs()
        {
        }
        public static new AuthorizationPolicyRuleSourceGetArgs Empty => new AuthorizationPolicyRuleSourceGetArgs();
    }
}
