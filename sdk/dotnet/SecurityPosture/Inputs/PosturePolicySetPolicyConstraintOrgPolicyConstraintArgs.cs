// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityPosture.Inputs
{

    public sealed class PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Organization policy canned constraint Id
        /// </summary>
        [Input("cannedConstraintId", required: true)]
        public Input<string> CannedConstraintId { get; set; } = null!;

        [Input("policyRules", required: true)]
        private InputList<Inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs>? _policyRules;

        /// <summary>
        /// Definition of policy rules
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs> PolicyRules
        {
            get => _policyRules ?? (_policyRules = new InputList<Inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs>());
            set => _policyRules = value;
        }

        public PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs()
        {
        }
        public static new PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs Empty => new PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs();
    }
}
