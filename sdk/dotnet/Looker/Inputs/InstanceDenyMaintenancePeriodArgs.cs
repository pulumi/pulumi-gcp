// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Looker.Inputs
{

    public sealed class InstanceDenyMaintenancePeriodArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Start date of the deny maintenance period
        /// Structure is documented below.
        /// </summary>
        [Input("endDate", required: true)]
        public Input<Inputs.InstanceDenyMaintenancePeriodEndDateArgs> EndDate { get; set; } = null!;

        /// <summary>
        /// Required. Start date of the deny maintenance period
        /// Structure is documented below.
        /// </summary>
        [Input("startDate", required: true)]
        public Input<Inputs.InstanceDenyMaintenancePeriodStartDateArgs> StartDate { get; set; } = null!;

        /// <summary>
        /// Required. Start time of the window in UTC time.
        /// Structure is documented below.
        /// </summary>
        [Input("time", required: true)]
        public Input<Inputs.InstanceDenyMaintenancePeriodTimeArgs> Time { get; set; } = null!;

        public InstanceDenyMaintenancePeriodArgs()
        {
        }
        public static new InstanceDenyMaintenancePeriodArgs Empty => new InstanceDenyMaintenancePeriodArgs();
    }
}
