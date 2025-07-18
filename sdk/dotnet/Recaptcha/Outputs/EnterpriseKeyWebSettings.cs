// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Recaptcha.Outputs
{

    [OutputType]
    public sealed class EnterpriseKeyWebSettings
    {
        /// <summary>
        /// If set to true, it means allowed_domains will not be enforced.
        /// </summary>
        public readonly bool? AllowAllDomains;
        /// <summary>
        /// If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
        /// </summary>
        public readonly bool? AllowAmpTraffic;
        /// <summary>
        /// Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
        /// </summary>
        public readonly ImmutableArray<string> AllowedDomains;
        /// <summary>
        /// Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE. Possible values: CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED, USABILITY, BALANCE, SECURITY
        /// </summary>
        public readonly string? ChallengeSecurityPreference;
        /// <summary>
        /// Required. Describes how this key is integrated with the website. Possible values: SCORE, CHECKBOX, INVISIBLE
        /// </summary>
        public readonly string IntegrationType;

        [OutputConstructor]
        private EnterpriseKeyWebSettings(
            bool? allowAllDomains,

            bool? allowAmpTraffic,

            ImmutableArray<string> allowedDomains,

            string? challengeSecurityPreference,

            string integrationType)
        {
            AllowAllDomains = allowAllDomains;
            AllowAmpTraffic = allowAmpTraffic;
            AllowedDomains = allowedDomains;
            ChallengeSecurityPreference = challengeSecurityPreference;
            IntegrationType = integrationType;
        }
    }
}
