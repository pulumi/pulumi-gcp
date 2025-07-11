// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class SecurityPolicyRuleMatchConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("srcIpRanges")]
        private InputList<string>? _srcIpRanges;

        /// <summary>
        /// CIDR IP address range. Maximum number of srcIpRanges allowed is 10.
        /// </summary>
        public InputList<string> SrcIpRanges
        {
            get => _srcIpRanges ?? (_srcIpRanges = new InputList<string>());
            set => _srcIpRanges = value;
        }

        public SecurityPolicyRuleMatchConfigArgs()
        {
        }
        public static new SecurityPolicyRuleMatchConfigArgs Empty => new SecurityPolicyRuleMatchConfigArgs();
    }
}
