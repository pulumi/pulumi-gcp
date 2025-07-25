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
    public sealed class FutureReservationAggregateReservationReservedResourceAccelerator
    {
        /// <summary>
        /// Number of accelerators of specified type.
        /// </summary>
        public readonly int? AcceleratorCount;
        /// <summary>
        /// Full or partial URL to accelerator type. e.g. "projects/{PROJECT}/zones/{ZONE}/acceleratorTypes/ct4l"
        /// </summary>
        public readonly string? AcceleratorType;

        [OutputConstructor]
        private FutureReservationAggregateReservationReservedResourceAccelerator(
            int? acceleratorCount,

            string? acceleratorType)
        {
            AcceleratorCount = acceleratorCount;
            AcceleratorType = acceleratorType;
        }
    }
}
