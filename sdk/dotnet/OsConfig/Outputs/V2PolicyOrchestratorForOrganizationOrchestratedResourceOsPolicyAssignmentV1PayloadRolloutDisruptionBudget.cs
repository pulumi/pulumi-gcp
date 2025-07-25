// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudget
    {
        /// <summary>
        /// Specifies a fixed value.
        /// </summary>
        public readonly int? Fixed;
        /// <summary>
        /// Specifies the relative value defined as a percentage, which will be
        /// multiplied by a reference value.
        /// </summary>
        public readonly int? Percent;

        [OutputConstructor]
        private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudget(
            int? @fixed,

            int? percent)
        {
            Fixed = @fixed;
            Percent = percent;
        }
    }
}
