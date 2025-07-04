// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class RegionSecurityPolicyRulePreconfiguredWafConfig
    {
        /// <summary>
        /// An exclusion to apply during preconfigured WAF evaluation.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusion> Exclusions;

        [OutputConstructor]
        private RegionSecurityPolicyRulePreconfiguredWafConfig(ImmutableArray<Outputs.RegionSecurityPolicyRulePreconfiguredWafConfigExclusion> exclusions)
        {
            Exclusions = exclusions;
        }
    }
}
