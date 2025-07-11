// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Clusterupgrade feature spec.
        /// Structure is documented below.
        /// </summary>
        [Input("clusterupgrade")]
        public Input<Inputs.FeatureSpecClusterupgradeArgs>? Clusterupgrade { get; set; }

        /// <summary>
        /// Fleet Observability feature spec.
        /// Structure is documented below.
        /// </summary>
        [Input("fleetobservability")]
        public Input<Inputs.FeatureSpecFleetobservabilityArgs>? Fleetobservability { get; set; }

        /// <summary>
        /// Multicluster Ingress-specific spec.
        /// Structure is documented below.
        /// </summary>
        [Input("multiclusteringress")]
        public Input<Inputs.FeatureSpecMulticlusteringressArgs>? Multiclusteringress { get; set; }

        /// <summary>
        /// RBACRolebinding Actuation feature spec.
        /// Structure is documented below.
        /// </summary>
        [Input("rbacrolebindingactuation")]
        public Input<Inputs.FeatureSpecRbacrolebindingactuationArgs>? Rbacrolebindingactuation { get; set; }

        public FeatureSpecArgs()
        {
        }
        public static new FeatureSpecArgs Empty => new FeatureSpecArgs();
    }
}
