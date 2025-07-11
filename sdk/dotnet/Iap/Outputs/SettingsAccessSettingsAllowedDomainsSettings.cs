// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iap.Outputs
{

    [OutputType]
    public sealed class SettingsAccessSettingsAllowedDomainsSettings
    {
        /// <summary>
        /// List of trusted domains.
        /// </summary>
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// Configuration for customers to opt in for the feature.
        /// </summary>
        public readonly bool? Enable;

        [OutputConstructor]
        private SettingsAccessSettingsAllowedDomainsSettings(
            ImmutableArray<string> domains,

            bool? enable)
        {
            Domains = domains;
            Enable = enable;
        }
    }
}
