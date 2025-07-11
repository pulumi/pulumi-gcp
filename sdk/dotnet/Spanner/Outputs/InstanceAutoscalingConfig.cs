// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Outputs
{

    [OutputType]
    public sealed class InstanceAutoscalingConfig
    {
        /// <summary>
        /// Asymmetric autoscaling options for specific replicas.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.InstanceAutoscalingConfigAsymmetricAutoscalingOption> AsymmetricAutoscalingOptions;
        /// <summary>
        /// Defines scale in controls to reduce the risk of response latency
        /// and outages due to abrupt scale-in events. Users can define the minimum and
        /// maximum compute capacity allocated to the instance, and the autoscaler will
        /// only scale within that range. Users can either use nodes or processing
        /// units to specify the limits, but should use the same unit to set both the
        /// min_limit and max_limit.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.InstanceAutoscalingConfigAutoscalingLimits? AutoscalingLimits;
        /// <summary>
        /// Defines scale in controls to reduce the risk of response latency
        /// and outages due to abrupt scale-in events
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.InstanceAutoscalingConfigAutoscalingTargets? AutoscalingTargets;

        [OutputConstructor]
        private InstanceAutoscalingConfig(
            ImmutableArray<Outputs.InstanceAutoscalingConfigAsymmetricAutoscalingOption> asymmetricAutoscalingOptions,

            Outputs.InstanceAutoscalingConfigAutoscalingLimits? autoscalingLimits,

            Outputs.InstanceAutoscalingConfigAutoscalingTargets? autoscalingTargets)
        {
            AsymmetricAutoscalingOptions = asymmetricAutoscalingOptions;
            AutoscalingLimits = autoscalingLimits;
            AutoscalingTargets = autoscalingTargets;
        }
    }
}
