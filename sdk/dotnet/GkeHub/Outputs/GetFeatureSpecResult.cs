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
    public sealed class GetFeatureSpecResult
    {
        /// <summary>
        /// Clusterupgrade feature spec.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureSpecClusterupgradeResult> Clusterupgrades;
        /// <summary>
        /// Fleet Observability feature spec.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureSpecFleetobservabilityResult> Fleetobservabilities;
        /// <summary>
        /// Multicluster Ingress-specific spec.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureSpecMulticlusteringressResult> Multiclusteringresses;
        /// <summary>
        /// RBACRolebinding Actuation feature spec.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureSpecRbacrolebindingactuationResult> Rbacrolebindingactuations;

        [OutputConstructor]
        private GetFeatureSpecResult(
            ImmutableArray<Outputs.GetFeatureSpecClusterupgradeResult> clusterupgrades,

            ImmutableArray<Outputs.GetFeatureSpecFleetobservabilityResult> fleetobservabilities,

            ImmutableArray<Outputs.GetFeatureSpecMulticlusteringressResult> multiclusteringresses,

            ImmutableArray<Outputs.GetFeatureSpecRbacrolebindingactuationResult> rbacrolebindingactuations)
        {
            Clusterupgrades = clusterupgrades;
            Fleetobservabilities = fleetobservabilities;
            Multiclusteringresses = multiclusteringresses;
            Rbacrolebindingactuations = rbacrolebindingactuations;
        }
    }
}
