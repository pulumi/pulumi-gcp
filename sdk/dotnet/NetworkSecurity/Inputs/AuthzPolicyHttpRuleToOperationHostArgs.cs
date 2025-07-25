// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class AuthzPolicyHttpRuleToOperationHostArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The input string must have the substring specified here. Note: empty contains match is not allowed, please use regex instead.
        /// Examples:
        /// * abc matches the value xyz.abc.def
        /// </summary>
        [Input("contains")]
        public Input<string>? Contains { get; set; }

        /// <summary>
        /// The input string must match exactly the string specified here.
        /// Examples:
        /// * abc only matches the value abc.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        /// <summary>
        /// If true, indicates the exact/prefix/suffix/contains matching should be case insensitive. For example, the matcher data will match both input string Data and data if set to true.
        /// </summary>
        [Input("ignoreCase")]
        public Input<bool>? IgnoreCase { get; set; }

        /// <summary>
        /// The input string must have the prefix specified here. Note: empty prefix is not allowed, please use regex instead.
        /// Examples:
        /// * abc matches the value abc.xyz
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The input string must have the suffix specified here. Note: empty prefix is not allowed, please use regex instead.
        /// Examples:
        /// * abc matches the value xyz.abc
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        public AuthzPolicyHttpRuleToOperationHostArgs()
        {
        }
        public static new AuthzPolicyHttpRuleToOperationHostArgs Empty => new AuthzPolicyHttpRuleToOperationHostArgs();
    }
}
