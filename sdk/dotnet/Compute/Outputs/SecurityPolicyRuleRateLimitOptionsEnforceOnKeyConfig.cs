// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig
    {
        /// <summary>
        /// Rate limit key name applicable only for the following key types: HTTP_HEADER: Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE: Name of the HTTP cookie whose value is taken as the key value.
        /// </summary>
        public readonly string? EnforceOnKeyName;
        /// <summary>
        /// Determines the key to enforce the rate_limit_threshold on. If not specified, defaults to "ALL".
        /// </summary>
        public readonly string? EnforceOnKeyType;

        [OutputConstructor]
        private SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig(
            string? enforceOnKeyName,

            string? enforceOnKeyType)
        {
            EnforceOnKeyName = enforceOnKeyName;
            EnforceOnKeyType = enforceOnKeyType;
        }
    }
}