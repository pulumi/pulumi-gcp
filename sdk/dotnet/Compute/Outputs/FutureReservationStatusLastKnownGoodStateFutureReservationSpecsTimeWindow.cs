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
    public sealed class FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindow
    {
        /// <summary>
        /// Duration of the future reservation
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowDuration? Duration;
        /// <summary>
        /// End time of the future reservation in RFC3339 format.
        /// </summary>
        public readonly string? EndTime;
        /// <summary>
        /// Start time of the future reservation in RFC3339 format.
        /// </summary>
        public readonly string? StartTime;

        [OutputConstructor]
        private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindow(
            Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowDuration? duration,

            string? endTime,

            string? startTime)
        {
            Duration = duration;
            EndTime = endTime;
            StartTime = startTime;
        }
    }
}
