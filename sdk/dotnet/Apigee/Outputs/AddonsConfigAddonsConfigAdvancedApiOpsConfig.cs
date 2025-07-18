// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Outputs
{

    [OutputType]
    public sealed class AddonsConfigAddonsConfigAdvancedApiOpsConfig
    {
        /// <summary>
        /// Flag that specifies whether the Advanced API Ops add-on is enabled.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private AddonsConfigAddonsConfigAdvancedApiOpsConfig(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}
