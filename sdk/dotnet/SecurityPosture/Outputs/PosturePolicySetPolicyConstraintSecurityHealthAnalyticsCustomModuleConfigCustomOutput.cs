// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityPosture.Outputs
{

    [OutputType]
    public sealed class PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutput
    {
        /// <summary>
        /// A list of custom output properties to add to the finding.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputProperty> Properties;

        [OutputConstructor]
        private PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutput(ImmutableArray<Outputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputProperty> properties)
        {
            Properties = properties;
        }
    }
}
