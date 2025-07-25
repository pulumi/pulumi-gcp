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
    public sealed class GetRegionInstanceTemplateSchedulingGracefulShutdownResult
    {
        /// <summary>
        /// Opts-in for graceful shutdown.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The time allotted for the instance to gracefully shut down.
        /// 										If the graceful shutdown isn't complete after this time, then the instance
        /// 										transitions to the STOPPING state.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateSchedulingGracefulShutdownMaxDurationResult> MaxDurations;

        [OutputConstructor]
        private GetRegionInstanceTemplateSchedulingGracefulShutdownResult(
            bool enabled,

            ImmutableArray<Outputs.GetRegionInstanceTemplateSchedulingGracefulShutdownMaxDurationResult> maxDurations)
        {
            Enabled = enabled;
            MaxDurations = maxDurations;
        }
    }
}
