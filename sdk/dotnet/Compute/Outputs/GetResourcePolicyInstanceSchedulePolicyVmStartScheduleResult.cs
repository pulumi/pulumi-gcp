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
    public sealed class GetResourcePolicyInstanceSchedulePolicyVmStartScheduleResult
    {
        /// <summary>
        /// Specifies the frequency for the operation, using the unix-cron format.
        /// </summary>
        public readonly string Schedule;

        [OutputConstructor]
        private GetResourcePolicyInstanceSchedulePolicyVmStartScheduleResult(string schedule)
        {
            Schedule = schedule;
        }
    }
}
