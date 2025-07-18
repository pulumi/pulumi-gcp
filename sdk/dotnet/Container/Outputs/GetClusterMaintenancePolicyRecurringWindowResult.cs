// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class GetClusterMaintenancePolicyRecurringWindowResult
    {
        public readonly string EndTime;
        public readonly string Recurrence;
        public readonly string StartTime;

        [OutputConstructor]
        private GetClusterMaintenancePolicyRecurringWindowResult(
            string endTime,

            string recurrence,

            string startTime)
        {
            EndTime = endTime;
            Recurrence = recurrence;
            StartTime = startTime;
        }
    }
}
