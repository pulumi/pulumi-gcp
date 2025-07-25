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
    public sealed class ReservationSpecificReservationInstanceProperties
    {
        /// <summary>
        /// Guest accelerator type and count.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ReservationSpecificReservationInstancePropertiesGuestAccelerator> GuestAccelerators;
        /// <summary>
        /// The amount of local ssd to reserve with each instance. This
        /// reserves disks of type `local-ssd`.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ReservationSpecificReservationInstancePropertiesLocalSsd> LocalSsds;
        /// <summary>
        /// The name of the machine type to reserve.
        /// </summary>
        public readonly string MachineType;
        /// <summary>
        /// Specifies the frequency of planned maintenance events.
        /// Possible values are: `AS_NEEDED`, `PERIODIC`, `RECURRENT`.
        /// </summary>
        public readonly string? MaintenanceInterval;
        /// <summary>
        /// The minimum CPU platform for the reservation. For example,
        /// `"Intel Skylake"`. See
        /// the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
        /// for information on available CPU platforms.
        /// </summary>
        public readonly string? MinCpuPlatform;

        [OutputConstructor]
        private ReservationSpecificReservationInstanceProperties(
            ImmutableArray<Outputs.ReservationSpecificReservationInstancePropertiesGuestAccelerator> guestAccelerators,

            ImmutableArray<Outputs.ReservationSpecificReservationInstancePropertiesLocalSsd> localSsds,

            string machineType,

            string? maintenanceInterval,

            string? minCpuPlatform)
        {
            GuestAccelerators = guestAccelerators;
            LocalSsds = localSsds;
            MachineType = machineType;
            MaintenanceInterval = maintenanceInterval;
            MinCpuPlatform = minCpuPlatform;
        }
    }
}
