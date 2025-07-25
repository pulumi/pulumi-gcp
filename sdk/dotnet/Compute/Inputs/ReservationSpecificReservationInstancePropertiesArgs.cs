// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class ReservationSpecificReservationInstancePropertiesArgs : global::Pulumi.ResourceArgs
    {
        [Input("guestAccelerators")]
        private InputList<Inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>? _guestAccelerators;

        /// <summary>
        /// Guest accelerator type and count.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs> GuestAccelerators
        {
            get => _guestAccelerators ?? (_guestAccelerators = new InputList<Inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>());
            set => _guestAccelerators = value;
        }

        [Input("localSsds")]
        private InputList<Inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs>? _localSsds;

        /// <summary>
        /// The amount of local ssd to reserve with each instance. This
        /// reserves disks of type `local-ssd`.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs> LocalSsds
        {
            get => _localSsds ?? (_localSsds = new InputList<Inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs>());
            set => _localSsds = value;
        }

        /// <summary>
        /// The name of the machine type to reserve.
        /// </summary>
        [Input("machineType", required: true)]
        public Input<string> MachineType { get; set; } = null!;

        /// <summary>
        /// Specifies the frequency of planned maintenance events.
        /// Possible values are: `AS_NEEDED`, `PERIODIC`, `RECURRENT`.
        /// </summary>
        [Input("maintenanceInterval")]
        public Input<string>? MaintenanceInterval { get; set; }

        /// <summary>
        /// The minimum CPU platform for the reservation. For example,
        /// `"Intel Skylake"`. See
        /// the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
        /// for information on available CPU platforms.
        /// </summary>
        [Input("minCpuPlatform")]
        public Input<string>? MinCpuPlatform { get; set; }

        public ReservationSpecificReservationInstancePropertiesArgs()
        {
        }
        public static new ReservationSpecificReservationInstancePropertiesArgs Empty => new ReservationSpecificReservationInstancePropertiesArgs();
    }
}
