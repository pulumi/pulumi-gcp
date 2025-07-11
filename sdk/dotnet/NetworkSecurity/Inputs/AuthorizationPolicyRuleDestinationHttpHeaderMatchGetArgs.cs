// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class AuthorizationPolicyRuleDestinationHttpHeaderMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
        /// </summary>
        [Input("headerName", required: true)]
        public Input<string> HeaderName { get; set; } = null!;

        /// <summary>
        /// The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
        /// </summary>
        [Input("regexMatch", required: true)]
        public Input<string> RegexMatch { get; set; } = null!;

        public AuthorizationPolicyRuleDestinationHttpHeaderMatchGetArgs()
        {
        }
        public static new AuthorizationPolicyRuleDestinationHttpHeaderMatchGetArgs Empty => new AuthorizationPolicyRuleDestinationHttpHeaderMatchGetArgs();
    }
}
