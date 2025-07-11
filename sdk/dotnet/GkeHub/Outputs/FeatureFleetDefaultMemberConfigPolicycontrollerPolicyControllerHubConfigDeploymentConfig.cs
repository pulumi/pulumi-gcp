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
    public sealed class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig
    {
        /// <summary>
        /// The identifier for this object. Format specified above.
        /// </summary>
        public readonly string Component;
        /// <summary>
        /// Container resource requirements.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources? ContainerResources;
        /// <summary>
        /// Pod affinity configuration.
        /// Possible values are: `AFFINITY_UNSPECIFIED`, `NO_AFFINITY`, `ANTI_AFFINITY`.
        /// </summary>
        public readonly string? PodAffinity;
        /// <summary>
        /// Pod tolerations of node taints.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration> PodTolerations;
        /// <summary>
        /// Pod replica count.
        /// </summary>
        public readonly int? ReplicaCount;

        [OutputConstructor]
        private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig(
            string component,

            Outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResources? containerResources,

            string? podAffinity,

            ImmutableArray<Outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodToleration> podTolerations,

            int? replicaCount)
        {
            Component = component;
            ContainerResources = containerResources;
            PodAffinity = podAffinity;
            PodTolerations = podTolerations;
            ReplicaCount = replicaCount;
        }
    }
}
