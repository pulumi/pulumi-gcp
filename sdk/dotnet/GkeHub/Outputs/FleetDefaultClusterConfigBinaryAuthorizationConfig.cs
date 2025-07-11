// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FleetDefaultClusterConfigBinaryAuthorizationConfig
    {
        /// <summary>
        /// Mode of operation for binauthz policy evaluation.
        /// Possible values are: `DISABLED`, `POLICY_BINDINGS`.
        /// </summary>
        public readonly string? EvaluationMode;
        /// <summary>
        /// Binauthz policies that apply to this cluster.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBinding> PolicyBindings;

        [OutputConstructor]
        private FleetDefaultClusterConfigBinaryAuthorizationConfig(
            string? evaluationMode,

            ImmutableArray<Outputs.FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBinding> policyBindings)
        {
            EvaluationMode = evaluationMode;
            PolicyBindings = policyBindings;
        }
    }
}
