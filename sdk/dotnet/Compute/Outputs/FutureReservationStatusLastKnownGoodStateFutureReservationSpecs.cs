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
    public sealed class FutureReservationStatusLastKnownGoodStateFutureReservationSpecs
    {
        /// <summary>
        /// The previous share settings of the Future Reservation.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings? ShareSettings;
        /// <summary>
        /// The previous instance related properties of the Future Reservation.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuProperties? SpecificSkuProperties;
        /// <summary>
        /// Time window for this Future Reservation.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindow? TimeWindow;

        [OutputConstructor]
        private FutureReservationStatusLastKnownGoodStateFutureReservationSpecs(
            Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings? shareSettings,

            Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuProperties? specificSkuProperties,

            Outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindow? timeWindow)
        {
            ShareSettings = shareSettings;
            SpecificSkuProperties = specificSkuProperties;
            TimeWindow = timeWindow;
        }
    }
}
