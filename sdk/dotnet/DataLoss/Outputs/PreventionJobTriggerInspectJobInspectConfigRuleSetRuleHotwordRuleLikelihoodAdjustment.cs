// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment
    {
        /// <summary>
        /// Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
        /// Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
        /// </summary>
        public readonly string? FixedLikelihood;
        /// <summary>
        /// Increase or decrease the likelihood by the specified number of levels. For example,
        /// if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
        /// then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
        /// Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
        /// adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
        /// will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
        /// </summary>
        public readonly int? RelativeLikelihood;

        [OutputConstructor]
        private PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment(
            string? fixedLikelihood,

            int? relativeLikelihood)
        {
            FixedLikelihood = fixedLikelihood;
            RelativeLikelihood = relativeLikelihood;
        }
    }
}
