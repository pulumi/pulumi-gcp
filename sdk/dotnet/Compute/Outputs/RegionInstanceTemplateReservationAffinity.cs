// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class RegionInstanceTemplateReservationAffinity
    {
        /// <summary>
        /// Specifies the label selector for the reservation to use..
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RegionInstanceTemplateReservationAffinitySpecificReservation? SpecificReservation;
        /// <summary>
        /// The type of reservation from which this instance can consume resources.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private RegionInstanceTemplateReservationAffinity(
            Outputs.RegionInstanceTemplateReservationAffinitySpecificReservation? specificReservation,

            string type)
        {
            SpecificReservation = specificReservation;
            Type = type;
        }
    }
}