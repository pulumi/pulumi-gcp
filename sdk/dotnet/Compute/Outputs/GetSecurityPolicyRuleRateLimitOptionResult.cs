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
    public sealed class GetSecurityPolicyRuleRateLimitOptionResult
    {
        /// <summary>
        /// Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
        /// </summary>
        public readonly int BanDurationSec;
        /// <summary>
        /// Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'banDurationSec' when the number of requests that exceed the 'rateLimitThreshold' also exceed this 'banThreshold'.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionBanThresholdResult> BanThresholds;
        /// <summary>
        /// Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
        /// </summary>
        public readonly string ConformAction;
        /// <summary>
        /// Determines the key to enforce the rateLimitThreshold on
        /// </summary>
        public readonly string EnforceOnKey;
        /// <summary>
        /// Enforce On Key Config of this security policy
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionEnforceOnKeyConfigResult> EnforceOnKeyConfigs;
        /// <summary>
        /// Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
        /// </summary>
        public readonly string EnforceOnKeyName;
        /// <summary>
        /// Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are "deny()" where valid values for status are 403, 404, 429, and 502, and "redirect" where the redirect parameters come from exceedRedirectOptions below.
        /// </summary>
        public readonly string ExceedAction;
        /// <summary>
        /// Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionExceedRedirectOptionResult> ExceedRedirectOptions;
        /// <summary>
        /// Threshold at which to begin ratelimiting.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionRateLimitThresholdResult> RateLimitThresholds;

        [OutputConstructor]
        private GetSecurityPolicyRuleRateLimitOptionResult(
            int banDurationSec,

            ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionBanThresholdResult> banThresholds,

            string conformAction,

            string enforceOnKey,

            ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionEnforceOnKeyConfigResult> enforceOnKeyConfigs,

            string enforceOnKeyName,

            string exceedAction,

            ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionExceedRedirectOptionResult> exceedRedirectOptions,

            ImmutableArray<Outputs.GetSecurityPolicyRuleRateLimitOptionRateLimitThresholdResult> rateLimitThresholds)
        {
            BanDurationSec = banDurationSec;
            BanThresholds = banThresholds;
            ConformAction = conformAction;
            EnforceOnKey = enforceOnKey;
            EnforceOnKeyConfigs = enforceOnKeyConfigs;
            EnforceOnKeyName = enforceOnKeyName;
            ExceedAction = exceedAction;
            ExceedRedirectOptions = exceedRedirectOptions;
            RateLimitThresholds = rateLimitThresholds;
        }
    }
}
