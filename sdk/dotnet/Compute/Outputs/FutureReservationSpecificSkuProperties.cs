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
    public sealed class FutureReservationSpecificSkuProperties
    {
        /// <summary>
        /// Properties of the SKU instances being reserved.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FutureReservationSpecificSkuPropertiesInstanceProperties? InstanceProperties;
        /// <summary>
        /// The instance template that will be used to populate the ReservedInstanceProperties of the future reservation
        /// </summary>
        public readonly string? SourceInstanceTemplate;
        /// <summary>
        /// Total number of instances for which capacity assurance is requested at a future time period.
        /// </summary>
        public readonly string? TotalCount;

        [OutputConstructor]
        private FutureReservationSpecificSkuProperties(
            Outputs.FutureReservationSpecificSkuPropertiesInstanceProperties? instanceProperties,

            string? sourceInstanceTemplate,

            string? totalCount)
        {
            InstanceProperties = instanceProperties;
            SourceInstanceTemplate = sourceInstanceTemplate;
            TotalCount = totalCount;
        }
    }
}
