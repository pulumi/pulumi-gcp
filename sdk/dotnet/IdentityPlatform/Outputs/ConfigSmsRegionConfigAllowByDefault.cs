// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Outputs
{

    [OutputType]
    public sealed class ConfigSmsRegionConfigAllowByDefault
    {
        /// <summary>
        /// Two letter unicode region codes to disallow as defined by https://cldr.unicode.org/ The full list of these region codes is here: https://github.com/unicode-cldr/cldr-localenames-full/blob/master/main/en/territories.json
        /// </summary>
        public readonly ImmutableArray<string> DisallowedRegions;

        [OutputConstructor]
        private ConfigSmsRegionConfigAllowByDefault(ImmutableArray<string> disallowedRegions)
        {
            DisallowedRegions = disallowedRegions;
        }
    }
}