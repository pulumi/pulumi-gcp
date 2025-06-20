// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OrgPolicy.Inputs
{

    public sealed class PolicySpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
        /// </summary>
        [Input("inheritFromParent")]
        public Input<bool>? InheritFromParent { get; set; }

        /// <summary>
        /// Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
        /// </summary>
        [Input("reset")]
        public Input<bool>? Reset { get; set; }

        [Input("rules")]
        private InputList<Inputs.PolicySpecRuleGetArgs>? _rules;

        /// <summary>
        /// In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PolicySpecRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.PolicySpecRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// (Output)
        /// Output only. The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public PolicySpecGetArgs()
        {
        }
        public static new PolicySpecGetArgs Empty => new PolicySpecGetArgs();
    }
}
