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
    public sealed class PosturePolicySetPolicyConstraintOrgPolicyConstraintCustom
    {
        /// <summary>
        /// Organization policy custom constraint definition.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomCustomConstraint? CustomConstraint;
        /// <summary>
        /// Definition of policy rules
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRule> PolicyRules;

        [OutputConstructor]
        private PosturePolicySetPolicyConstraintOrgPolicyConstraintCustom(
            Outputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomCustomConstraint? customConstraint,

            ImmutableArray<Outputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRule> policyRules)
        {
            CustomConstraint = customConstraint;
            PolicyRules = policyRules;
        }
    }
}
