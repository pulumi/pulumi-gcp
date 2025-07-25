// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OrgPolicy.Outputs
{

    [OutputType]
    public sealed class PolicyDryRunSpecRule
    {
        /// <summary>
        /// Setting this to `"TRUE"` means that all values are allowed. This field can be set only in Policies for list constraints.
        /// </summary>
        public readonly string? AllowAll;
        /// <summary>
        /// A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr' must include from 1 to 10 subexpressions, joined by the "||" or "&amp;&amp;" operators. Each subexpression must be of the form "resource.matchTag('/tag_key_short_name, 'tag_value_short_name')". or "resource.matchTagId('tagKeys/key_id', 'tagValues/value_id')". where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: "resource.matchTag('123456789/environment, 'prod')". or "resource.matchTagId('tagKeys/123', 'tagValues/456')".
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PolicyDryRunSpecRuleCondition? Condition;
        /// <summary>
        /// Setting this to `"TRUE"` means that all values are denied. This field can be set only in Policies for list constraints.
        /// </summary>
        public readonly string? DenyAll;
        /// <summary>
        /// If `"TRUE"`, then the `Policy` is enforced. If `"FALSE"`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
        /// </summary>
        public readonly string? Enforce;
        /// <summary>
        /// Optional. Required for Managed Constraints if parameters defined in constraints. Pass parameter values when policy enforcement is enabled. Ensure that parameter value types match those defined in the constraint definition. For example: { \"allowedLocations\" : [\"us-east1\", \"us-west1\"], \"allowAll\" : true }
        /// </summary>
        public readonly string? Parameters;
        /// <summary>
        /// List of values to be used for this policy rule. This field can be set only in policies for list constraints.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PolicyDryRunSpecRuleValues? Values;

        [OutputConstructor]
        private PolicyDryRunSpecRule(
            string? allowAll,

            Outputs.PolicyDryRunSpecRuleCondition? condition,

            string? denyAll,

            string? enforce,

            string? parameters,

            Outputs.PolicyDryRunSpecRuleValues? values)
        {
            AllowAll = allowAll;
            Condition = condition;
            DenyAll = denyAll;
            Enforce = enforce;
            Parameters = parameters;
            Values = values;
        }
    }
}
