// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Outputs
{

    [OutputType]
    public sealed class ConfigQuota
    {
        /// <summary>
        /// Quota for the Signup endpoint, if overwritten. Signup quota is measured in sign ups per project per hour per IP. None of quota, startTime, or quotaDuration can be skipped.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConfigQuotaSignUpQuotaConfig? SignUpQuotaConfig;

        [OutputConstructor]
        private ConfigQuota(Outputs.ConfigQuotaSignUpQuotaConfig? signUpQuotaConfig)
        {
            SignUpQuotaConfig = signUpQuotaConfig;
        }
    }
}
