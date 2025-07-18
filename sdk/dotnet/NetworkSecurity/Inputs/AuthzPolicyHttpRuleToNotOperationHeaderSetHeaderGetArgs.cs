// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the header in the request.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies how the header match will be performed.
        /// Structure is documented below.
        /// </summary>
        [Input("value")]
        public Input<Inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueGetArgs>? Value { get; set; }

        public AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderGetArgs()
        {
        }
        public static new AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderGetArgs Empty => new AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderGetArgs();
    }
}
