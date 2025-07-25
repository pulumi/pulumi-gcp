// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyResult
    {
        /// <summary>
        /// You can specify an exact match or a partial match by using a field operator and a field value. Available options: EQUALS: The operator matches if the field value equals the specified value. STARTS_WITH: The operator matches if the field value starts with the specified value. ENDS_WITH: The operator matches if the field value ends with the specified value. CONTAINS: The operator matches if the field value contains the specified value. EQUALS_ANY: The operator matches if the field value is any value.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// A request field matching the specified value will be excluded from inspection during preconfigured WAF evaluation. The field value must be given if the field operator is not EQUALS_ANY, and cannot be given if the field operator is EQUALS_ANY.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCookyResult(
            string @operator,

            string value)
        {
            Operator = @operator;
            Value = value;
        }
    }
}
