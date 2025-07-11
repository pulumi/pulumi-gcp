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
    public sealed class GetSecurityPolicyRuleMatchResult
    {
        /// <summary>
        /// The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleMatchConfigResult> Configs;
        /// <summary>
        /// The configuration options available when specifying a user defined CEVAL expression (i.e., 'expr').
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleMatchExprOptionResult> ExprOptions;
        /// <summary>
        /// User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityPolicyRuleMatchExprResult> Exprs;
        /// <summary>
        /// Predefined rule expression. If this field is specified, config must also be specified. Available options:   SRC_IPS_V1: Must specify the corresponding src_ip_ranges field in config.
        /// </summary>
        public readonly string VersionedExpr;

        [OutputConstructor]
        private GetSecurityPolicyRuleMatchResult(
            ImmutableArray<Outputs.GetSecurityPolicyRuleMatchConfigResult> configs,

            ImmutableArray<Outputs.GetSecurityPolicyRuleMatchExprOptionResult> exprOptions,

            ImmutableArray<Outputs.GetSecurityPolicyRuleMatchExprResult> exprs,

            string versionedExpr)
        {
            Configs = configs;
            ExprOptions = exprOptions;
            Exprs = exprs;
            VersionedExpr = versionedExpr;
        }
    }
}
